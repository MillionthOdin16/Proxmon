package c.b.a.a.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class t<ResultT> extends e<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1472a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final o<ResultT> f1473b = new o<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f1474c;

    /* renamed from: d, reason: collision with root package name */
    private ResultT f1475d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f1476e;

    private final void h() {
        c.b.a.a.a.a.q.c(this.f1474c, "Task is not yet complete");
    }

    private final void k() {
        c.b.a.a.a.a.q.c(!this.f1474c, "Task is already complete");
    }

    private final void n() {
        synchronized (this.f1472a) {
            if (this.f1474c) {
                this.f1473b.a(this);
            }
        }
    }

    @Override // c.b.a.a.a.f.e
    public final e<ResultT> a(a<ResultT> aVar) {
        this.f1473b.b(new i(f.f1450a, aVar));
        n();
        return this;
    }

    @Override // c.b.a.a.a.f.e
    public final e<ResultT> b(Executor executor, b bVar) {
        this.f1473b.b(new k(executor, bVar));
        n();
        return this;
    }

    @Override // c.b.a.a.a.f.e
    public final e<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.f1473b.b(new m(executor, cVar));
        n();
        return this;
    }

    @Override // c.b.a.a.a.f.e
    public final Exception d() {
        Exception exc;
        synchronized (this.f1472a) {
            exc = this.f1476e;
        }
        return exc;
    }

    @Override // c.b.a.a.a.f.e
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.f1472a) {
            h();
            Exception exc = this.f1476e;
            if (exc != null) {
                throw new d(exc);
            }
            resultt = this.f1475d;
        }
        return resultt;
    }

    @Override // c.b.a.a.a.f.e
    public final boolean f() {
        boolean z;
        synchronized (this.f1472a) {
            z = this.f1474c;
        }
        return z;
    }

    @Override // c.b.a.a.a.f.e
    public final boolean g() {
        boolean z;
        synchronized (this.f1472a) {
            z = false;
            if (this.f1474c && this.f1476e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void i(Exception exc) {
        synchronized (this.f1472a) {
            k();
            this.f1474c = true;
            this.f1476e = exc;
        }
        this.f1473b.a(this);
    }

    public final void j(ResultT resultt) {
        synchronized (this.f1472a) {
            k();
            this.f1474c = true;
            this.f1475d = resultt;
        }
        this.f1473b.a(this);
    }

    public final boolean l(Exception exc) {
        synchronized (this.f1472a) {
            if (this.f1474c) {
                return false;
            }
            this.f1474c = true;
            this.f1476e = exc;
            this.f1473b.a(this);
            return true;
        }
    }

    public final boolean m(ResultT resultt) {
        synchronized (this.f1472a) {
            if (this.f1474c) {
                return false;
            }
            this.f1474c = true;
            this.f1475d = resultt;
            this.f1473b.a(this);
            return true;
        }
    }
}
