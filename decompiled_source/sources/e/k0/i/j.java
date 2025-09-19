package e.k0.i;

import e.b0;
import e.e0;
import e.f0;
import e.g0;
import e.i0;
import e.y;
import e.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class j implements z {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f2074a;

    public j(b0 b0Var) {
        this.f2074a = b0Var;
    }

    private e0 b(g0 g0Var, i0 i0Var) {
        String D;
        y A;
        if (g0Var == null) {
            throw new IllegalStateException();
        }
        int B = g0Var.B();
        String f2 = g0Var.J().f();
        if (B == 307 || B == 308) {
            if (!f2.equals("GET") && !f2.equals("HEAD")) {
                return null;
            }
        } else {
            if (B == 401) {
                return this.f2074a.a().a(i0Var, g0Var);
            }
            if (B == 503) {
                if ((g0Var.H() == null || g0Var.H().B() != 503) && f(g0Var, Integer.MAX_VALUE) == 0) {
                    return g0Var.J();
                }
                return null;
            }
            if (B == 407) {
                if ((i0Var != null ? i0Var.b() : this.f2074a.w()).type() == Proxy.Type.HTTP) {
                    return this.f2074a.x().a(i0Var, g0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (B == 408) {
                if (!this.f2074a.A()) {
                    return null;
                }
                f0 a2 = g0Var.J().a();
                if (a2 != null && a2.f()) {
                    return null;
                }
                if ((g0Var.H() == null || g0Var.H().B() != 408) && f(g0Var, 0) <= 0) {
                    return g0Var.J();
                }
                return null;
            }
            switch (B) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f2074a.k() || (D = g0Var.D("Location")) == null || (A = g0Var.J().h().A(D)) == null) {
            return null;
        }
        if (!A.B().equals(g0Var.J().h().B()) && !this.f2074a.l()) {
            return null;
        }
        e0.a g = g0Var.J().g();
        if (f.b(f2)) {
            boolean d2 = f.d(f2);
            if (f.c(f2)) {
                g.e("GET", null);
            } else {
                g.e(f2, d2 ? g0Var.J().a() : null);
            }
            if (!d2) {
                g.f("Transfer-Encoding");
                g.f("Content-Length");
                g.f("Content-Type");
            }
        }
        if (!e.k0.e.C(g0Var.J().h(), A)) {
            g.f("Authorization");
        }
        g.h(A);
        return g.a();
    }

    private boolean c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean d(IOException iOException, e.k0.h.k kVar, boolean z, e0 e0Var) {
        if (this.f2074a.A()) {
            return !(z && e(iOException, e0Var)) && c(iOException, z) && kVar.c();
        }
        return false;
    }

    private boolean e(IOException iOException, e0 e0Var) {
        f0 a2 = e0Var.a();
        return (a2 != null && a2.f()) || (iOException instanceof FileNotFoundException);
    }

    private int f(g0 g0Var, int i) {
        String D = g0Var.D("Retry-After");
        if (D == null) {
            return i;
        }
        if (D.matches("\\d+")) {
            return Integer.valueOf(D).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // e.z
    public g0 a(z.a aVar) {
        e.k0.h.d f2;
        e0 b2;
        e0 c2 = aVar.c();
        g gVar = (g) aVar;
        e.k0.h.k h = gVar.h();
        g0 g0Var = null;
        int i = 0;
        while (true) {
            h.m(c2);
            if (h.i()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    g0 g = gVar.g(c2, h, null);
                    if (g0Var != null) {
                        g0.a G = g.G();
                        g0.a G2 = g0Var.G();
                        G2.b(null);
                        G.n(G2.c());
                        g = G.c();
                    }
                    g0Var = g;
                    f2 = e.k0.c.f1986a.f(g0Var);
                    b2 = b(g0Var, f2 != null ? f2.c().q() : null);
                } catch (e.k0.h.i e2) {
                    if (!d(e2.c(), h, false, c2)) {
                        throw e2.b();
                    }
                } catch (IOException e3) {
                    if (!d(e3, h, !(e3 instanceof e.k0.k.a), c2)) {
                        throw e3;
                    }
                }
                if (b2 == null) {
                    if (f2 != null && f2.h()) {
                        h.o();
                    }
                    return g0Var;
                }
                f0 a2 = b2.a();
                if (a2 != null && a2.f()) {
                    return g0Var;
                }
                e.k0.e.e(g0Var.r());
                if (h.h()) {
                    f2.e();
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
                c2 = b2;
            } finally {
                h.f();
            }
        }
    }
}
