package e.k0.h;

import e.e0;
import e.g0;
import e.h0;
import e.v;
import f.l;
import f.s;
import f.t;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final k f2012a;

    /* renamed from: b, reason: collision with root package name */
    final e.j f2013b;

    /* renamed from: c, reason: collision with root package name */
    final v f2014c;

    /* renamed from: d, reason: collision with root package name */
    final e f2015d;

    /* renamed from: e, reason: collision with root package name */
    final e.k0.i.c f2016e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2017f;

    /* loaded from: classes.dex */
    private final class a extends f.g {

        /* renamed from: c, reason: collision with root package name */
        private boolean f2018c;

        /* renamed from: d, reason: collision with root package name */
        private long f2019d;

        /* renamed from: e, reason: collision with root package name */
        private long f2020e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2021f;

        a(s sVar, long j) {
            super(sVar);
            this.f2019d = j;
        }

        private IOException r(IOException iOException) {
            if (this.f2018c) {
                return iOException;
            }
            this.f2018c = true;
            return d.this.a(this.f2020e, false, true, iOException);
        }

        @Override // f.g, f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2021f) {
                return;
            }
            this.f2021f = true;
            long j = this.f2019d;
            if (j != -1 && this.f2020e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                r(null);
            } catch (IOException e2) {
                throw r(e2);
            }
        }

        @Override // f.g, f.s
        public void e(f.c cVar, long j) {
            if (this.f2021f) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f2019d;
            if (j2 == -1 || this.f2020e + j <= j2) {
                try {
                    super.e(cVar, j);
                    this.f2020e += j;
                    return;
                } catch (IOException e2) {
                    throw r(e2);
                }
            }
            throw new ProtocolException("expected " + this.f2019d + " bytes but received " + (this.f2020e + j));
        }

        @Override // f.g, f.s, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e2) {
                throw r(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    final class b extends f.h {

        /* renamed from: c, reason: collision with root package name */
        private final long f2022c;

        /* renamed from: d, reason: collision with root package name */
        private long f2023d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2024e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2025f;

        b(t tVar, long j) {
            super(tVar);
            this.f2022c = j;
            if (j == 0) {
                A(null);
            }
        }

        IOException A(IOException iOException) {
            if (this.f2024e) {
                return iOException;
            }
            this.f2024e = true;
            return d.this.a(this.f2023d, true, false, iOException);
        }

        @Override // f.h, f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2025f) {
                return;
            }
            this.f2025f = true;
            try {
                super.close();
                A(null);
            } catch (IOException e2) {
                throw A(e2);
            }
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            if (this.f2025f) {
                throw new IllegalStateException("closed");
            }
            try {
                long i = r().i(cVar, j);
                if (i == -1) {
                    A(null);
                    return -1L;
                }
                long j2 = this.f2023d + i;
                if (this.f2022c != -1 && j2 > this.f2022c) {
                    throw new ProtocolException("expected " + this.f2022c + " bytes but received " + j2);
                }
                this.f2023d = j2;
                if (j2 == this.f2022c) {
                    A(null);
                }
                return i;
            } catch (IOException e2) {
                throw A(e2);
            }
        }
    }

    public d(k kVar, e.j jVar, v vVar, e eVar, e.k0.i.c cVar) {
        this.f2012a = kVar;
        this.f2013b = jVar;
        this.f2014c = vVar;
        this.f2015d = eVar;
        this.f2016e = cVar;
    }

    IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            o(iOException);
        }
        if (z2) {
            v vVar = this.f2014c;
            e.j jVar = this.f2013b;
            if (iOException != null) {
                vVar.o(jVar, iOException);
            } else {
                vVar.m(jVar, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f2014c.t(this.f2013b, iOException);
            } else {
                this.f2014c.r(this.f2013b, j);
            }
        }
        return this.f2012a.g(this, z2, z, iOException);
    }

    public void b() {
        this.f2016e.cancel();
    }

    public f c() {
        return this.f2016e.h();
    }

    public s d(e0 e0Var, boolean z) {
        this.f2017f = z;
        long a2 = e0Var.a().a();
        this.f2014c.n(this.f2013b);
        return new a(this.f2016e.d(e0Var, a2), a2);
    }

    public void e() {
        this.f2016e.cancel();
        this.f2012a.g(this, true, true, null);
    }

    public void f() {
        try {
            this.f2016e.a();
        } catch (IOException e2) {
            this.f2014c.o(this.f2013b, e2);
            o(e2);
            throw e2;
        }
    }

    public void g() {
        try {
            this.f2016e.c();
        } catch (IOException e2) {
            this.f2014c.o(this.f2013b, e2);
            o(e2);
            throw e2;
        }
    }

    public boolean h() {
        return this.f2017f;
    }

    public void i() {
        this.f2016e.h().p();
    }

    public void j() {
        this.f2012a.g(this, true, false, null);
    }

    public h0 k(g0 g0Var) {
        try {
            this.f2014c.s(this.f2013b);
            String D = g0Var.D("Content-Type");
            long e2 = this.f2016e.e(g0Var);
            return new e.k0.i.h(D, e2, l.b(new b(this.f2016e.f(g0Var), e2)));
        } catch (IOException e3) {
            this.f2014c.t(this.f2013b, e3);
            o(e3);
            throw e3;
        }
    }

    public g0.a l(boolean z) {
        try {
            g0.a g = this.f2016e.g(z);
            if (g != null) {
                e.k0.c.f1986a.g(g, this);
            }
            return g;
        } catch (IOException e2) {
            this.f2014c.t(this.f2013b, e2);
            o(e2);
            throw e2;
        }
    }

    public void m(g0 g0Var) {
        this.f2014c.u(this.f2013b, g0Var);
    }

    public void n() {
        this.f2014c.v(this.f2013b);
    }

    void o(IOException iOException) {
        this.f2015d.h();
        this.f2016e.h().v(iOException);
    }

    public void p(e0 e0Var) {
        try {
            this.f2014c.q(this.f2013b);
            this.f2016e.b(e0Var);
            this.f2014c.p(this.f2013b, e0Var);
        } catch (IOException e2) {
            this.f2014c.o(this.f2013b, e2);
            o(e2);
            throw e2;
        }
    }
}
