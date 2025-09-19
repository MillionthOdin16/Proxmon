package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f824a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b.b.a.b.b<m<? super T>, LiveData<T>.a> f825b = new b.b.a.b.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f826c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f827d = i;

    /* renamed from: e, reason: collision with root package name */
    volatile Object f828e = i;

    /* renamed from: f, reason: collision with root package name */
    private int f829f = -1;
    private boolean g;
    private boolean h;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.a implements Object {

        /* renamed from: e, reason: collision with root package name */
        final g f830e;

        LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.f830e = gVar;
        }

        public void d(g gVar, d.a aVar) {
            if (this.f830e.getLifecycle().b() == d.b.DESTROYED) {
                LiveData.this.g(this.f832a);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        void i() {
            this.f830e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean j(g gVar) {
            return this.f830e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean k() {
            return this.f830e.getLifecycle().b().a(d.b.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a, reason: collision with root package name */
        final m<? super T> f832a;

        /* renamed from: b, reason: collision with root package name */
        boolean f833b;

        /* renamed from: c, reason: collision with root package name */
        int f834c = -1;

        a(m<? super T> mVar) {
            this.f832a = mVar;
        }

        void h(boolean z) {
            if (z == this.f833b) {
                return;
            }
            this.f833b = z;
            boolean z2 = LiveData.this.f826c == 0;
            LiveData.this.f826c += this.f833b ? 1 : -1;
            if (z2 && this.f833b) {
                LiveData.this.e();
            }
            LiveData liveData = LiveData.this;
            if (liveData.f826c == 0 && !this.f833b) {
                liveData.f();
            }
            if (this.f833b) {
                LiveData.this.c(this);
            }
        }

        void i() {
        }

        boolean j(g gVar) {
            return false;
        }

        abstract boolean k();
    }

    private static void a(String str) {
        if (b.b.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f833b) {
            if (!aVar.k()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f834c;
            int i3 = this.f829f;
            if (i2 >= i3) {
                return;
            }
            aVar.f834c = i3;
            aVar.f832a.a((Object) this.f827d);
        }
    }

    void c(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar != null) {
                b(aVar);
                aVar = null;
            } else {
                b.b.a.b.b<m<? super T>, LiveData<T>.a>.d d2 = this.f825b.d();
                while (d2.hasNext()) {
                    b((a) d2.next().getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void d(g gVar, m<? super T> mVar) {
        a("observe");
        if (gVar.getLifecycle().b() == d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
        LiveData<T>.a g = this.f825b.g(mVar, lifecycleBoundObserver);
        if (g != null && !g.j(gVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g != null) {
            return;
        }
        gVar.getLifecycle().a(lifecycleBoundObserver);
    }

    protected void e() {
    }

    protected void f() {
    }

    public void g(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.a h = this.f825b.h(mVar);
        if (h == null) {
            return;
        }
        h.i();
        h.h(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(T t) {
        a("setValue");
        this.f829f++;
        this.f827d = t;
        c(null);
    }
}
