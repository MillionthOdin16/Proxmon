package e.k0.h;

import e.b0;
import e.c0;
import e.e0;
import e.g0;
import e.i0;
import e.k0.k.f;
import e.n;
import e.p;
import e.v;
import e.w;
import e.y;
import e.z;
import f.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class f extends f.j implements n {

    /* renamed from: b, reason: collision with root package name */
    public final g f2032b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f2033c;

    /* renamed from: d, reason: collision with root package name */
    private Socket f2034d;

    /* renamed from: e, reason: collision with root package name */
    private Socket f2035e;

    /* renamed from: f, reason: collision with root package name */
    private w f2036f;
    private c0 g;
    private e.k0.k.f h;
    private f.e i;
    private f.d j;
    boolean k;
    int l;
    int m;
    private int n;
    private int o = 1;
    final List<Reference<k>> p = new ArrayList();
    long q = Long.MAX_VALUE;

    public f(g gVar, i0 i0Var) {
        this.f2032b = gVar;
        this.f2033c = i0Var;
    }

    private void e(int i, int i2, e.j jVar, v vVar) {
        Proxy b2 = this.f2033c.b();
        this.f2034d = (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) ? this.f2033c.a().j().createSocket() : new Socket(b2);
        vVar.f(jVar, this.f2033c.d(), b2);
        this.f2034d.setSoTimeout(i2);
        try {
            e.k0.l.f.j().h(this.f2034d, this.f2033c.d(), i);
            try {
                this.i = l.b(l.h(this.f2034d));
                this.j = l.a(l.e(this.f2034d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f2033c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void f(c cVar) {
        SSLSocket sSLSocket;
        e.e a2 = this.f2033c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a2.k().createSocket(this.f2034d, a2.l().l(), a2.l().w(), true);
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            p a3 = cVar.a(sSLSocket);
            if (a3.f()) {
                e.k0.l.f.j().g(sSLSocket, a2.l().l(), a2.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            w b2 = w.b(session);
            if (a2.e().verify(a2.l().l(), session)) {
                a2.a().a(a2.l().l(), b2.d());
                String l = a3.f() ? e.k0.l.f.j().l(sSLSocket) : null;
                this.f2035e = sSLSocket;
                this.i = l.b(l.h(sSLSocket));
                this.j = l.a(l.e(this.f2035e));
                this.f2036f = b2;
                this.g = l != null ? c0.a(l) : c0.HTTP_1_1;
                if (sSLSocket != null) {
                    e.k0.l.f.j().a(sSLSocket);
                    return;
                }
                return;
            }
            List<Certificate> d2 = b2.d();
            if (d2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + a2.l().l() + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) d2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + a2.l().l() + " not verified:\n    certificate: " + e.l.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + e.k0.n.d.a(x509Certificate));
        } catch (AssertionError e3) {
            e = e3;
            if (!e.k0.e.y(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                e.k0.l.f.j().a(sSLSocket2);
            }
            e.k0.e.f(sSLSocket2);
            throw th;
        }
    }

    private void g(int i, int i2, int i3, e.j jVar, v vVar) {
        e0 i4 = i();
        y h = i4.h();
        for (int i5 = 0; i5 < 21; i5++) {
            e(i, i2, jVar, vVar);
            i4 = h(i2, i3, i4, h);
            if (i4 == null) {
                return;
            }
            e.k0.e.f(this.f2034d);
            this.f2034d = null;
            this.j = null;
            this.i = null;
            vVar.d(jVar, this.f2033c.d(), this.f2033c.b(), null);
        }
    }

    private e0 h(int i, int i2, e0 e0Var, y yVar) {
        String str = "CONNECT " + e.k0.e.q(yVar, true) + " HTTP/1.1";
        while (true) {
            e.k0.j.a aVar = new e.k0.j.a(null, null, this.i, this.j);
            this.i.b().g(i, TimeUnit.MILLISECONDS);
            this.j.b().g(i2, TimeUnit.MILLISECONDS);
            aVar.B(e0Var.d(), str);
            aVar.a();
            g0.a g = aVar.g(false);
            g.q(e0Var);
            g0 c2 = g.c();
            aVar.A(c2);
            int B = c2.B();
            if (B == 200) {
                if (this.i.u().v() && this.j.a().v()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (B != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c2.B());
            }
            e0 a2 = this.f2033c.a().h().a(this.f2033c, c2);
            if (a2 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(c2.D("Connection"))) {
                return a2;
            }
            e0Var = a2;
        }
    }

    private e0 i() {
        e0.a aVar = new e0.a();
        aVar.h(this.f2033c.a().l());
        aVar.e("CONNECT", null);
        aVar.c("Host", e.k0.e.q(this.f2033c.a().l(), true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", e.k0.f.a());
        e0 a2 = aVar.a();
        g0.a aVar2 = new g0.a();
        aVar2.q(a2);
        aVar2.o(c0.HTTP_1_1);
        aVar2.g(407);
        aVar2.l("Preemptive Authenticate");
        aVar2.b(e.k0.e.f1991d);
        aVar2.r(-1L);
        aVar2.p(-1L);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        e0 a3 = this.f2033c.a().h().a(this.f2033c, aVar2.c());
        return a3 != null ? a3 : a2;
    }

    private void j(c cVar, int i, e.j jVar, v vVar) {
        if (this.f2033c.a().k() != null) {
            vVar.x(jVar);
            f(cVar);
            vVar.w(jVar, this.f2036f);
            if (this.g == c0.HTTP_2) {
                t(i);
                return;
            }
            return;
        }
        if (!this.f2033c.a().f().contains(c0.H2_PRIOR_KNOWLEDGE)) {
            this.f2035e = this.f2034d;
            this.g = c0.HTTP_1_1;
        } else {
            this.f2035e = this.f2034d;
            this.g = c0.H2_PRIOR_KNOWLEDGE;
            t(i);
        }
    }

    private boolean r(List<i0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            i0 i0Var = list.get(i);
            if (i0Var.b().type() == Proxy.Type.DIRECT && this.f2033c.b().type() == Proxy.Type.DIRECT && this.f2033c.d().equals(i0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private void t(int i) {
        this.f2035e.setSoTimeout(0);
        f.h hVar = new f.h(true);
        hVar.d(this.f2035e, this.f2033c.a().l().l(), this.i, this.j);
        hVar.b(this);
        hVar.c(i);
        e.k0.k.f a2 = hVar.a();
        this.h = a2;
        a2.a0();
    }

    @Override // e.k0.k.f.j
    public void a(e.k0.k.f fVar) {
        synchronized (this.f2032b) {
            this.o = fVar.O();
        }
    }

    @Override // e.k0.k.f.j
    public void b(e.k0.k.i iVar) {
        iVar.d(e.k0.k.b.REFUSED_STREAM, null);
    }

    public void c() {
        e.k0.e.f(this.f2034d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r17, int r18, int r19, int r20, boolean r21, e.j r22, e.v r23) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k0.h.f.d(int, int, int, int, boolean, e.j, e.v):void");
    }

    public w k() {
        return this.f2036f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(e.e eVar, List<i0> list) {
        if (this.p.size() >= this.o || this.k || !e.k0.c.f1986a.e(this.f2033c.a(), eVar)) {
            return false;
        }
        if (eVar.l().l().equals(q().a().l().l())) {
            return true;
        }
        if (this.h == null || list == null || !r(list) || eVar.e() != e.k0.n.d.f2245a || !u(eVar.l())) {
            return false;
        }
        try {
            eVar.a().a(eVar.l().l(), k().d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean m(boolean z) {
        if (this.f2035e.isClosed() || this.f2035e.isInputShutdown() || this.f2035e.isOutputShutdown()) {
            return false;
        }
        e.k0.k.f fVar = this.h;
        if (fVar != null) {
            return fVar.N(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f2035e.getSoTimeout();
                try {
                    this.f2035e.setSoTimeout(1);
                    return !this.i.v();
                } finally {
                    this.f2035e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean n() {
        return this.h != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.k0.i.c o(b0 b0Var, z.a aVar) {
        if (this.h != null) {
            return new e.k0.k.g(b0Var, this, aVar, this.h);
        }
        this.f2035e.setSoTimeout(aVar.e());
        this.i.b().g(aVar.e(), TimeUnit.MILLISECONDS);
        this.j.b().g(aVar.a(), TimeUnit.MILLISECONDS);
        return new e.k0.j.a(b0Var, this, this.i, this.j);
    }

    public void p() {
        synchronized (this.f2032b) {
            this.k = true;
        }
    }

    public i0 q() {
        return this.f2033c;
    }

    public Socket s() {
        return this.f2035e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f2033c.a().l().l());
        sb.append(":");
        sb.append(this.f2033c.a().l().w());
        sb.append(", proxy=");
        sb.append(this.f2033c.b());
        sb.append(" hostAddress=");
        sb.append(this.f2033c.d());
        sb.append(" cipherSuite=");
        w wVar = this.f2036f;
        sb.append(wVar != null ? wVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public boolean u(y yVar) {
        if (yVar.w() != this.f2033c.a().l().w()) {
            return false;
        }
        if (yVar.l().equals(this.f2033c.a().l().l())) {
            return true;
        }
        return this.f2036f != null && e.k0.n.d.f2245a.c(yVar.l(), (X509Certificate) this.f2036f.d().get(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(IOException iOException) {
        int i;
        synchronized (this.f2032b) {
            if (iOException instanceof e.k0.k.n) {
                e.k0.k.b bVar = ((e.k0.k.n) iOException).f2220b;
                if (bVar == e.k0.k.b.REFUSED_STREAM) {
                    int i2 = this.n + 1;
                    this.n = i2;
                    if (i2 > 1) {
                        this.k = true;
                        i = this.l;
                        this.l = i + 1;
                    }
                } else if (bVar != e.k0.k.b.CANCEL) {
                    this.k = true;
                    i = this.l;
                    this.l = i + 1;
                }
            } else if (!n() || (iOException instanceof e.k0.k.a)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        this.f2032b.b(this.f2033c, iOException);
                    }
                    i = this.l;
                    this.l = i + 1;
                }
            }
        }
    }
}
