package e.k0.h;

import e.b0;
import e.e0;
import e.l;
import e.v;
import e.y;
import e.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f2054a;

    /* renamed from: b, reason: collision with root package name */
    private final g f2055b;

    /* renamed from: c, reason: collision with root package name */
    private final e.j f2056c;

    /* renamed from: d, reason: collision with root package name */
    private final v f2057d;

    /* renamed from: e, reason: collision with root package name */
    private final f.a f2058e = new a();

    /* renamed from: f, reason: collision with root package name */
    private Object f2059f;
    private e0 g;
    private e h;
    public f i;
    private d j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* loaded from: classes.dex */
    class a extends f.a {
        a() {
        }

        @Override // f.a
        protected void t() {
            k.this.d();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends WeakReference<k> {

        /* renamed from: a, reason: collision with root package name */
        final Object f2060a;

        b(k kVar, Object obj) {
            super(kVar);
            this.f2060a = obj;
        }
    }

    public k(b0 b0Var, e.j jVar) {
        this.f2054a = b0Var;
        this.f2055b = e.k0.c.f1986a.h(b0Var.e());
        this.f2056c = jVar;
        this.f2057d = b0Var.j().a(jVar);
        this.f2058e.g(b0Var.b(), TimeUnit.MILLISECONDS);
    }

    private e.e e(y yVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        l lVar;
        if (yVar.m()) {
            SSLSocketFactory C = this.f2054a.C();
            hostnameVerifier = this.f2054a.m();
            sSLSocketFactory = C;
            lVar = this.f2054a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            lVar = null;
        }
        return new e.e(yVar.l(), yVar.w(), this.f2054a.i(), this.f2054a.B(), sSLSocketFactory, hostnameVerifier, lVar, this.f2054a.x(), this.f2054a.w(), this.f2054a.v(), this.f2054a.f(), this.f2054a.y());
    }

    private IOException j(IOException iOException, boolean z) {
        f fVar;
        Socket n;
        boolean z2;
        synchronized (this.f2055b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.i;
            n = (this.i != null && this.j == null && (z || this.o)) ? n() : null;
            if (this.i != null) {
                fVar = null;
            }
            z2 = this.o && this.j == null;
        }
        e.k0.e.f(n);
        if (fVar != null) {
            this.f2057d.h(this.f2056c, fVar);
        }
        if (z2) {
            boolean z3 = iOException != null;
            iOException = q(iOException);
            v vVar = this.f2057d;
            e.j jVar = this.f2056c;
            if (z3) {
                vVar.b(jVar, iOException);
            } else {
                vVar.a(jVar);
            }
        }
        return iOException;
    }

    private IOException q(IOException iOException) {
        if (this.n || !this.f2058e.n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar) {
        if (this.i != null) {
            throw new IllegalStateException();
        }
        this.i = fVar;
        fVar.p.add(new b(this, this.f2059f));
    }

    public void b() {
        this.f2059f = e.k0.l.f.j().m("response.body().close()");
        this.f2057d.c(this.f2056c);
    }

    public boolean c() {
        return this.h.f() && this.h.e();
    }

    public void d() {
        d dVar;
        f a2;
        synchronized (this.f2055b) {
            this.m = true;
            dVar = this.j;
            a2 = (this.h == null || this.h.a() == null) ? this.i : this.h.a();
        }
        if (dVar != null) {
            dVar.b();
        } else if (a2 != null) {
            a2.c();
        }
    }

    public void f() {
        synchronized (this.f2055b) {
            if (this.o) {
                throw new IllegalStateException();
            }
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IOException g(d dVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f2055b) {
            if (dVar != this.j) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.k;
                this.k = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.l) {
                    z3 = true;
                }
                this.l = true;
            }
            if (this.k && this.l && z3) {
                this.j.c().m++;
                this.j = null;
            } else {
                z4 = false;
            }
            return z4 ? j(iOException, false) : iOException;
        }
    }

    public boolean h() {
        boolean z;
        synchronized (this.f2055b) {
            z = this.j != null;
        }
        return z;
    }

    public boolean i() {
        boolean z;
        synchronized (this.f2055b) {
            z = this.m;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d k(z.a aVar, boolean z) {
        synchronized (this.f2055b) {
            if (this.o) {
                throw new IllegalStateException("released");
            }
            if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        d dVar = new d(this, this.f2056c, this.f2057d, this.h, this.h.b(this.f2054a, aVar, z));
        synchronized (this.f2055b) {
            this.j = dVar;
            this.k = false;
            this.l = false;
        }
        return dVar;
    }

    public IOException l(IOException iOException) {
        synchronized (this.f2055b) {
            this.o = true;
        }
        return j(iOException, false);
    }

    public void m(e0 e0Var) {
        e0 e0Var2 = this.g;
        if (e0Var2 != null) {
            if (e.k0.e.C(e0Var2.h(), e0Var.h()) && this.h.e()) {
                return;
            }
            if (this.j != null) {
                throw new IllegalStateException();
            }
            if (this.h != null) {
                j(null, true);
                this.h = null;
            }
        }
        this.g = e0Var;
        this.h = new e(this, this.f2055b, e(e0Var.h()), this.f2056c, this.f2057d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Socket n() {
        int i = 0;
        int size = this.i.p.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.i.p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.i;
        fVar.p.remove(i);
        this.i = null;
        if (!fVar.p.isEmpty()) {
            return null;
        }
        fVar.q = System.nanoTime();
        if (this.f2055b.c(fVar)) {
            return fVar.s();
        }
        return null;
    }

    public void o() {
        if (this.n) {
            throw new IllegalStateException();
        }
        this.n = true;
        this.f2058e.n();
    }

    public void p() {
        this.f2058e.k();
    }
}
