package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f84a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f85b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.f84a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f85b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f84a;
    }

    public final void d() {
        Iterator<a> it = this.f85b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f85b.remove(aVar);
    }

    public final void f(boolean z) {
        this.f84a = z;
    }
}
