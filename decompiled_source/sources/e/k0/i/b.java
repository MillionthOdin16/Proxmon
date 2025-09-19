package e.k0.i;

import e.e0;
import e.g0;
import e.h0;
import e.z;
import f.l;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements z {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2062a;

    public b(boolean z) {
        this.f2062a = z;
    }

    @Override // e.z
    public g0 a(z.a aVar) {
        boolean z;
        g0.a G;
        h0 k;
        g gVar = (g) aVar;
        e.k0.h.d f2 = gVar.f();
        e0 c2 = gVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        f2.p(c2);
        g0.a aVar2 = null;
        if (!f.b(c2.f()) || c2.a() == null) {
            f2.j();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(c2.c("Expect"))) {
                f2.g();
                f2.n();
                aVar2 = f2.l(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar2 != null) {
                f2.j();
                if (!f2.c().n()) {
                    f2.i();
                }
            } else if (c2.a().e()) {
                f2.g();
                c2.a().g(l.a(f2.d(c2, true)));
            } else {
                f.d a2 = l.a(f2.d(c2, false));
                c2.a().g(a2);
                a2.close();
            }
        }
        if (c2.a() == null || !c2.a().e()) {
            f2.f();
        }
        if (!z) {
            f2.n();
        }
        if (aVar2 == null) {
            aVar2 = f2.l(false);
        }
        aVar2.q(c2);
        aVar2.h(f2.c().k());
        aVar2.r(currentTimeMillis);
        aVar2.p(System.currentTimeMillis());
        g0 c3 = aVar2.c();
        int B = c3.B();
        if (B == 100) {
            g0.a l = f2.l(false);
            l.q(c2);
            l.h(f2.c().k());
            l.r(currentTimeMillis);
            l.p(System.currentTimeMillis());
            c3 = l.c();
            B = c3.B();
        }
        f2.m(c3);
        if (this.f2062a && B == 101) {
            G = c3.G();
            k = e.k0.e.f1991d;
        } else {
            G = c3.G();
            k = f2.k(c3);
        }
        G.b(k);
        g0 c4 = G.c();
        if ("close".equalsIgnoreCase(c4.J().c("Connection")) || "close".equalsIgnoreCase(c4.D("Connection"))) {
            f2.i();
        }
        if ((B != 204 && B != 205) || c4.r().B() <= 0) {
            return c4;
        }
        throw new ProtocolException("HTTP " + B + " had non-zero Content-Length: " + c4.r().B());
    }
}
