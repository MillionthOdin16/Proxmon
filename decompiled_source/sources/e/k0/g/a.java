package e.k0.g;

import e.c0;
import e.e0;
import e.g0;
import e.k0.g.c;
import e.k0.i.f;
import e.k0.i.h;
import e.x;
import e.z;
import f.e;
import f.l;
import f.s;
import f.t;
import f.u;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    final d f1994a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.k0.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062a implements t {

        /* renamed from: b, reason: collision with root package name */
        boolean f1995b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f1996c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f1997d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f.d f1998e;

        C0062a(a aVar, e eVar, b bVar, f.d dVar) {
            this.f1996c = eVar;
            this.f1997d = bVar;
            this.f1998e = dVar;
        }

        @Override // f.t
        public u b() {
            return this.f1996c.b();
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f1995b && !e.k0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                this.f1995b = true;
                this.f1997d.a();
            }
            this.f1996c.close();
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            try {
                long i = this.f1996c.i(cVar, j);
                if (i != -1) {
                    cVar.D(this.f1998e.a(), cVar.N() - i, i);
                    this.f1998e.g();
                    return i;
                }
                if (!this.f1995b) {
                    this.f1995b = true;
                    this.f1998e.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.f1995b) {
                    this.f1995b = true;
                    this.f1997d.a();
                }
                throw e2;
            }
        }
    }

    public a(d dVar) {
        this.f1994a = dVar;
    }

    private g0 b(b bVar, g0 g0Var) {
        s b2;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return g0Var;
        }
        C0062a c0062a = new C0062a(this, g0Var.r().E(), bVar, l.a(b2));
        String D = g0Var.D("Content-Type");
        long B = g0Var.r().B();
        g0.a G = g0Var.G();
        G.b(new h(D, B, l.b(c0062a)));
        return G.c();
    }

    private static x c(x xVar, x xVar2) {
        x.a aVar = new x.a();
        int h = xVar.h();
        for (int i = 0; i < h; i++) {
            String e2 = xVar.e(i);
            String i2 = xVar.i(i);
            if ((!"Warning".equalsIgnoreCase(e2) || !i2.startsWith("1")) && (d(e2) || !e(e2) || xVar2.c(e2) == null)) {
                e.k0.c.f1986a.b(aVar, e2, i2);
            }
        }
        int h2 = xVar2.h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e3 = xVar2.e(i3);
            if (!d(e3) && e(e3)) {
                e.k0.c.f1986a.b(aVar, e3, xVar2.i(i3));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static g0 f(g0 g0Var) {
        if (g0Var == null || g0Var.r() == null) {
            return g0Var;
        }
        g0.a G = g0Var.G();
        G.b(null);
        return G.c();
    }

    @Override // e.z
    public g0 a(z.a aVar) {
        d dVar = this.f1994a;
        g0 b2 = dVar != null ? dVar.b(aVar.c()) : null;
        c c2 = new c.a(System.currentTimeMillis(), aVar.c(), b2).c();
        e0 e0Var = c2.f1999a;
        g0 g0Var = c2.f2000b;
        d dVar2 = this.f1994a;
        if (dVar2 != null) {
            dVar2.d(c2);
        }
        if (b2 != null && g0Var == null) {
            e.k0.e.e(b2.r());
        }
        if (e0Var == null && g0Var == null) {
            g0.a aVar2 = new g0.a();
            aVar2.q(aVar.c());
            aVar2.o(c0.HTTP_1_1);
            aVar2.g(504);
            aVar2.l("Unsatisfiable Request (only-if-cached)");
            aVar2.b(e.k0.e.f1991d);
            aVar2.r(-1L);
            aVar2.p(System.currentTimeMillis());
            return aVar2.c();
        }
        if (e0Var == null) {
            g0.a G = g0Var.G();
            G.d(f(g0Var));
            return G.c();
        }
        try {
            g0 b3 = aVar.b(e0Var);
            if (b3 == null && b2 != null) {
            }
            if (g0Var != null) {
                if (b3.B() == 304) {
                    g0.a G2 = g0Var.G();
                    G2.j(c(g0Var.F(), b3.F()));
                    G2.r(b3.K());
                    G2.p(b3.I());
                    G2.d(f(g0Var));
                    G2.m(f(b3));
                    g0 c3 = G2.c();
                    b3.r().close();
                    this.f1994a.c();
                    this.f1994a.a(g0Var, c3);
                    return c3;
                }
                e.k0.e.e(g0Var.r());
            }
            g0.a G3 = b3.G();
            G3.d(f(g0Var));
            G3.m(f(b3));
            g0 c4 = G3.c();
            if (this.f1994a != null) {
                if (e.k0.i.e.c(c4) && c.a(c4, e0Var)) {
                    return b(this.f1994a.f(c4), c4);
                }
                if (f.a(e0Var.f())) {
                    try {
                        this.f1994a.e(e0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return c4;
        } finally {
            if (b2 != null) {
                e.k0.e.e(b2.r());
            }
        }
    }
}
