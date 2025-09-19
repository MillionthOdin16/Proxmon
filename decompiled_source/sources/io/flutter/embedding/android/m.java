package io.flutter.embedding.android;

import android.view.KeyEvent;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected final c[] f2428a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f2429b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.editing.d f2430c;

    /* renamed from: d, reason: collision with root package name */
    private final View f2431d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        final KeyEvent f2432a;

        /* renamed from: b, reason: collision with root package name */
        int f2433b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2434c = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class a implements c.a {

            /* renamed from: a, reason: collision with root package name */
            boolean f2436a;

            private a() {
                this.f2436a = false;
            }

            @Override // io.flutter.embedding.android.m.c.a
            public void a(Boolean bool) {
                if (this.f2436a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f2436a = true;
                b bVar = b.this;
                bVar.f2433b--;
                bVar.f2434c = bool.booleanValue() | bVar.f2434c;
                b bVar2 = b.this;
                if (bVar2.f2433b != 0 || bVar2.f2434c) {
                    return;
                }
                m.this.d(bVar2.f2432a);
            }
        }

        b(KeyEvent keyEvent) {
            this.f2433b = m.this.f2428a.length;
            this.f2432a = keyEvent;
        }

        public c.a a() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    interface c {

        /* loaded from: classes.dex */
        public interface a {
            void a(Boolean bool);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public m(View view, io.flutter.plugin.editing.d dVar, c[] cVarArr) {
        this.f2431d = view;
        this.f2430c = dVar;
        this.f2428a = cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        if (this.f2430c.r(keyEvent) || this.f2431d == null) {
            return;
        }
        this.f2429b.add(keyEvent);
        this.f2431d.getRootView().dispatchKeyEvent(keyEvent);
        if (this.f2429b.remove(keyEvent)) {
            d.a.b.f("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    public void b() {
        int size = this.f2429b.size();
        if (size > 0) {
            d.a.b.f("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public boolean c(KeyEvent keyEvent) {
        if (this.f2429b.remove(keyEvent)) {
            return false;
        }
        if (this.f2428a.length <= 0) {
            d(keyEvent);
            return true;
        }
        b bVar = new b(keyEvent);
        for (c cVar : this.f2428a) {
            cVar.a(keyEvent, bVar.a());
        }
        return true;
    }
}
