package e;

import e.g0;
import e.v;
import e.x;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class b0 implements Cloneable {
    static final List<c0> D = e.k0.e.s(c0.HTTP_2, c0.HTTP_1_1);
    static final List<p> E = e.k0.e.s(p.g, p.h);
    final int A;
    final int B;
    final int C;

    /* renamed from: b, reason: collision with root package name */
    final s f1901b;

    /* renamed from: c, reason: collision with root package name */
    final Proxy f1902c;

    /* renamed from: d, reason: collision with root package name */
    final List<c0> f1903d;

    /* renamed from: e, reason: collision with root package name */
    final List<p> f1904e;

    /* renamed from: f, reason: collision with root package name */
    final List<z> f1905f;
    final List<z> g;
    final v.b h;
    final ProxySelector i;
    final r j;
    final h k;
    final e.k0.g.d l;
    final SocketFactory m;
    final SSLSocketFactory n;
    final e.k0.n.c o;
    final HostnameVerifier p;
    final l q;
    final g r;
    final g s;
    final o t;
    final u u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    /* loaded from: classes.dex */
    class a extends e.k0.c {
        a() {
        }

        @Override // e.k0.c
        public void a(x.a aVar, String str) {
            aVar.b(str);
        }

        @Override // e.k0.c
        public void b(x.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // e.k0.c
        public void c(p pVar, SSLSocket sSLSocket, boolean z) {
            pVar.a(sSLSocket, z);
        }

        @Override // e.k0.c
        public int d(g0.a aVar) {
            return aVar.f1956c;
        }

        @Override // e.k0.c
        public boolean e(e eVar, e eVar2) {
            return eVar.d(eVar2);
        }

        @Override // e.k0.c
        public e.k0.h.d f(g0 g0Var) {
            return g0Var.n;
        }

        @Override // e.k0.c
        public void g(g0.a aVar, e.k0.h.d dVar) {
            aVar.k(dVar);
        }

        @Override // e.k0.c
        public e.k0.h.g h(o oVar) {
            return oVar.f2260a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        int A;
        int B;

        /* renamed from: a, reason: collision with root package name */
        s f1906a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f1907b;

        /* renamed from: c, reason: collision with root package name */
        List<c0> f1908c;

        /* renamed from: d, reason: collision with root package name */
        List<p> f1909d;

        /* renamed from: e, reason: collision with root package name */
        final List<z> f1910e;

        /* renamed from: f, reason: collision with root package name */
        final List<z> f1911f;
        v.b g;
        ProxySelector h;
        r i;
        h j;
        e.k0.g.d k;
        SocketFactory l;
        SSLSocketFactory m;
        e.k0.n.c n;
        HostnameVerifier o;
        l p;
        g q;
        g r;
        o s;
        u t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            this.f1910e = new ArrayList();
            this.f1911f = new ArrayList();
            this.f1906a = new s();
            this.f1908c = b0.D;
            this.f1909d = b0.E;
            this.g = v.k(v.f2285a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new e.k0.m.a();
            }
            this.i = r.f2277a;
            this.l = SocketFactory.getDefault();
            this.o = e.k0.n.d.f2245a;
            this.p = l.f2246c;
            g gVar = g.f1948a;
            this.q = gVar;
            this.r = gVar;
            this.s = new o();
            this.t = u.f2284a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        b(b0 b0Var) {
            this.f1910e = new ArrayList();
            this.f1911f = new ArrayList();
            this.f1906a = b0Var.f1901b;
            this.f1907b = b0Var.f1902c;
            this.f1908c = b0Var.f1903d;
            this.f1909d = b0Var.f1904e;
            this.f1910e.addAll(b0Var.f1905f);
            this.f1911f.addAll(b0Var.g);
            this.g = b0Var.h;
            this.h = b0Var.i;
            this.i = b0Var.j;
            this.k = b0Var.l;
            this.j = b0Var.k;
            this.l = b0Var.m;
            this.m = b0Var.n;
            this.n = b0Var.o;
            this.o = b0Var.p;
            this.p = b0Var.q;
            this.q = b0Var.r;
            this.r = b0Var.s;
            this.s = b0Var.t;
            this.t = b0Var.u;
            this.u = b0Var.v;
            this.v = b0Var.w;
            this.w = b0Var.x;
            this.x = b0Var.y;
            this.y = b0Var.z;
            this.z = b0Var.A;
            this.A = b0Var.B;
            this.B = b0Var.C;
        }

        public b0 a() {
            return new b0(this);
        }

        public b b(long j, TimeUnit timeUnit) {
            this.y = e.k0.e.c("timeout", j, timeUnit);
            return this;
        }

        public b c(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.o = hostnameVerifier;
            return this;
        }

        public b d(long j, TimeUnit timeUnit) {
            this.z = e.k0.e.c("timeout", j, timeUnit);
            return this;
        }

        public b e(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager == null) {
                throw new NullPointerException("trustManager == null");
            }
            this.m = sSLSocketFactory;
            this.n = e.k0.n.c.b(x509TrustManager);
            return this;
        }

        public b f(long j, TimeUnit timeUnit) {
            this.A = e.k0.e.c("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        e.k0.c.f1986a = new a();
    }

    public b0() {
        this(new b());
    }

    b0(b bVar) {
        boolean z;
        e.k0.n.c cVar;
        this.f1901b = bVar.f1906a;
        this.f1902c = bVar.f1907b;
        this.f1903d = bVar.f1908c;
        this.f1904e = bVar.f1909d;
        this.f1905f = e.k0.e.r(bVar.f1910e);
        this.g = e.k0.e.r(bVar.f1911f);
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        Iterator<p> it = this.f1904e.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().d();
            }
        }
        if (bVar.m == null && z) {
            X509TrustManager B = e.k0.e.B();
            this.n = t(B);
            cVar = e.k0.n.c.b(B);
        } else {
            this.n = bVar.m;
            cVar = bVar.n;
        }
        this.o = cVar;
        if (this.n != null) {
            e.k0.l.f.j().f(this.n);
        }
        this.p = bVar.o;
        this.q = bVar.p.f(this.o);
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        this.C = bVar.B;
        if (this.f1905f.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f1905f);
        }
        if (this.g.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.g);
        }
    }

    private static SSLSocketFactory t(X509TrustManager x509TrustManager) {
        try {
            SSLContext k = e.k0.l.f.j().k();
            k.init(null, new TrustManager[]{x509TrustManager}, null);
            return k.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public boolean A() {
        return this.x;
    }

    public SocketFactory B() {
        return this.m;
    }

    public SSLSocketFactory C() {
        return this.n;
    }

    public int D() {
        return this.B;
    }

    public g a() {
        return this.s;
    }

    public int b() {
        return this.y;
    }

    public l c() {
        return this.q;
    }

    public int d() {
        return this.z;
    }

    public o e() {
        return this.t;
    }

    public List<p> f() {
        return this.f1904e;
    }

    public r g() {
        return this.j;
    }

    public s h() {
        return this.f1901b;
    }

    public u i() {
        return this.u;
    }

    public v.b j() {
        return this.h;
    }

    public boolean k() {
        return this.w;
    }

    public boolean l() {
        return this.v;
    }

    public HostnameVerifier m() {
        return this.p;
    }

    public List<z> n() {
        return this.f1905f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.k0.g.d o() {
        h hVar = this.k;
        return hVar != null ? hVar.f1960b : this.l;
    }

    public List<z> p() {
        return this.g;
    }

    public b q() {
        return new b(this);
    }

    public j s(e0 e0Var) {
        return d0.f(this, e0Var, false);
    }

    public int u() {
        return this.C;
    }

    public List<c0> v() {
        return this.f1903d;
    }

    public Proxy w() {
        return this.f1902c;
    }

    public g x() {
        return this.r;
    }

    public ProxySelector y() {
        return this.i;
    }

    public int z() {
        return this.A;
    }
}
