package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f76a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f77b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f78a;

        /* renamed from: b, reason: collision with root package name */
        private final b f79b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f80c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f78a = dVar;
            this.f79b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f78a.c(this);
            this.f79b.e(this);
            androidx.activity.a aVar = this.f80c;
            if (aVar != null) {
                aVar.cancel();
                this.f80c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.a aVar) {
            if (aVar == d.a.ON_START) {
                this.f80c = OnBackPressedDispatcher.this.b(this.f79b);
                return;
            }
            if (aVar != d.a.ON_STOP) {
                if (aVar == d.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f80c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f82a;

        a(b bVar) {
            this.f82a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f77b.remove(this.f82a);
            this.f82a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f76a = runnable;
    }

    public void a(g gVar, b bVar) {
        d lifecycle = gVar.getLifecycle();
        if (lifecycle.b() == d.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f77b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f77b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f76a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
