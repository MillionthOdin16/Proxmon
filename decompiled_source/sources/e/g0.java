package e;

import e.x;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class g0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    final e0 f1949b;

    /* renamed from: c, reason: collision with root package name */
    final c0 f1950c;

    /* renamed from: d, reason: collision with root package name */
    final int f1951d;

    /* renamed from: e, reason: collision with root package name */
    final String f1952e;

    /* renamed from: f, reason: collision with root package name */
    final w f1953f;
    final x g;
    final h0 h;
    final g0 i;
    final g0 j;
    final g0 k;
    final long l;
    final long m;
    final e.k0.h.d n;
    private volatile i o;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        e0 f1954a;

        /* renamed from: b, reason: collision with root package name */
        c0 f1955b;

        /* renamed from: c, reason: collision with root package name */
        int f1956c;

        /* renamed from: d, reason: collision with root package name */
        String f1957d;

        /* renamed from: e, reason: collision with root package name */
        w f1958e;

        /* renamed from: f, reason: collision with root package name */
        x.a f1959f;
        h0 g;
        g0 h;
        g0 i;
        g0 j;
        long k;
        long l;
        e.k0.h.d m;

        public a() {
            this.f1956c = -1;
            this.f1959f = new x.a();
        }

        a(g0 g0Var) {
            this.f1956c = -1;
            this.f1954a = g0Var.f1949b;
            this.f1955b = g0Var.f1950c;
            this.f1956c = g0Var.f1951d;
            this.f1957d = g0Var.f1952e;
            this.f1958e = g0Var.f1953f;
            this.f1959f = g0Var.g.f();
            this.g = g0Var.h;
            this.h = g0Var.i;
            this.i = g0Var.j;
            this.j = g0Var.k;
            this.k = g0Var.l;
            this.l = g0Var.m;
            this.m = g0Var.n;
        }

        private void e(g0 g0Var) {
            if (g0Var.h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, g0 g0Var) {
            if (g0Var.h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (g0Var.i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (g0Var.j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (g0Var.k == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        public a a(String str, String str2) {
            this.f1959f.a(str, str2);
            return this;
        }

        public a b(h0 h0Var) {
            this.g = h0Var;
            return this;
        }

        public g0 c() {
            if (this.f1954a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f1955b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f1956c >= 0) {
                if (this.f1957d != null) {
                    return new g0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f1956c);
        }

        public a d(g0 g0Var) {
            if (g0Var != null) {
                f("cacheResponse", g0Var);
            }
            this.i = g0Var;
            return this;
        }

        public a g(int i) {
            this.f1956c = i;
            return this;
        }

        public a h(w wVar) {
            this.f1958e = wVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f1959f.f(str, str2);
            return this;
        }

        public a j(x xVar) {
            this.f1959f = xVar.f();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k(e.k0.h.d dVar) {
            this.m = dVar;
        }

        public a l(String str) {
            this.f1957d = str;
            return this;
        }

        public a m(g0 g0Var) {
            if (g0Var != null) {
                f("networkResponse", g0Var);
            }
            this.h = g0Var;
            return this;
        }

        public a n(g0 g0Var) {
            if (g0Var != null) {
                e(g0Var);
            }
            this.j = g0Var;
            return this;
        }

        public a o(c0 c0Var) {
            this.f1955b = c0Var;
            return this;
        }

        public a p(long j) {
            this.l = j;
            return this;
        }

        public a q(e0 e0Var) {
            this.f1954a = e0Var;
            return this;
        }

        public a r(long j) {
            this.k = j;
            return this;
        }
    }

    g0(a aVar) {
        this.f1949b = aVar.f1954a;
        this.f1950c = aVar.f1955b;
        this.f1951d = aVar.f1956c;
        this.f1952e = aVar.f1957d;
        this.f1953f = aVar.f1958e;
        this.g = aVar.f1959f.d();
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
    }

    public i A() {
        i iVar = this.o;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.g);
        this.o = k;
        return k;
    }

    public int B() {
        return this.f1951d;
    }

    public w C() {
        return this.f1953f;
    }

    public String D(String str) {
        return E(str, null);
    }

    public String E(String str, String str2) {
        String c2 = this.g.c(str);
        return c2 != null ? c2 : str2;
    }

    public x F() {
        return this.g;
    }

    public a G() {
        return new a(this);
    }

    public g0 H() {
        return this.k;
    }

    public long I() {
        return this.m;
    }

    public e0 J() {
        return this.f1949b;
    }

    public long K() {
        return this.l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h0 h0Var = this.h;
        if (h0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        h0Var.close();
    }

    public h0 r() {
        return this.h;
    }

    public String toString() {
        return "Response{protocol=" + this.f1950c + ", code=" + this.f1951d + ", message=" + this.f1952e + ", url=" + this.f1949b.h() + '}';
    }
}
