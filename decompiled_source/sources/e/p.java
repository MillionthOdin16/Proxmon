package e;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    private static final m[] f2261e = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o};

    /* renamed from: f, reason: collision with root package name */
    private static final m[] f2262f = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o, m.i, m.j, m.g, m.h, m.f2257e, m.f2258f, m.f2256d};
    public static final p g;
    public static final p h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f2263a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f2264b;

    /* renamed from: c, reason: collision with root package name */
    final String[] f2265c;

    /* renamed from: d, reason: collision with root package name */
    final String[] f2266d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f2267a;

        /* renamed from: b, reason: collision with root package name */
        String[] f2268b;

        /* renamed from: c, reason: collision with root package name */
        String[] f2269c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2270d;

        public a(p pVar) {
            this.f2267a = pVar.f2263a;
            this.f2268b = pVar.f2265c;
            this.f2269c = pVar.f2266d;
            this.f2270d = pVar.f2264b;
        }

        a(boolean z) {
            this.f2267a = z;
        }

        public p a() {
            return new p(this);
        }

        public a b(String... strArr) {
            if (!this.f2267a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f2268b = (String[]) strArr.clone();
            return this;
        }

        public a c(m... mVarArr) {
            if (!this.f2267a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[mVarArr.length];
            for (int i = 0; i < mVarArr.length; i++) {
                strArr[i] = mVarArr[i].f2259a;
            }
            b(strArr);
            return this;
        }

        public a d(boolean z) {
            if (!this.f2267a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f2270d = z;
            return this;
        }

        public a e(String... strArr) {
            if (!this.f2267a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f2269c = (String[]) strArr.clone();
            return this;
        }

        public a f(j0... j0VarArr) {
            if (!this.f2267a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[j0VarArr.length];
            for (int i = 0; i < j0VarArr.length; i++) {
                strArr[i] = j0VarArr[i].f1982b;
            }
            e(strArr);
            return this;
        }
    }

    static {
        a aVar = new a(true);
        aVar.c(f2261e);
        aVar.f(j0.TLS_1_3, j0.TLS_1_2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(f2262f);
        aVar2.f(j0.TLS_1_3, j0.TLS_1_2);
        aVar2.d(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(f2262f);
        aVar3.f(j0.TLS_1_3, j0.TLS_1_2, j0.TLS_1_1, j0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
        h = new a(false).a();
    }

    p(a aVar) {
        this.f2263a = aVar.f2267a;
        this.f2265c = aVar.f2268b;
        this.f2266d = aVar.f2269c;
        this.f2264b = aVar.f2270d;
    }

    private p e(SSLSocket sSLSocket, boolean z) {
        String[] x = this.f2265c != null ? e.k0.e.x(m.f2254b, sSLSocket.getEnabledCipherSuites(), this.f2265c) : sSLSocket.getEnabledCipherSuites();
        String[] x2 = this.f2266d != null ? e.k0.e.x(e.k0.e.f1993f, sSLSocket.getEnabledProtocols(), this.f2266d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int u = e.k0.e.u(m.f2254b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && u != -1) {
            x = e.k0.e.g(x, supportedCipherSuites[u]);
        }
        a aVar = new a(this);
        aVar.b(x);
        aVar.e(x2);
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        p e2 = e(sSLSocket, z);
        String[] strArr = e2.f2266d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.f2265c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List<m> b() {
        String[] strArr = this.f2265c;
        if (strArr != null) {
            return m.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f2263a) {
            return false;
        }
        String[] strArr = this.f2266d;
        if (strArr != null && !e.k0.e.A(e.k0.e.f1993f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2265c;
        return strArr2 == null || e.k0.e.A(m.f2254b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.f2263a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p pVar = (p) obj;
        boolean z = this.f2263a;
        if (z != pVar.f2263a) {
            return false;
        }
        return !z || (Arrays.equals(this.f2265c, pVar.f2265c) && Arrays.equals(this.f2266d, pVar.f2266d) && this.f2264b == pVar.f2264b);
    }

    public boolean f() {
        return this.f2264b;
    }

    public List<j0> g() {
        String[] strArr = this.f2266d;
        if (strArr != null) {
            return j0.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f2263a) {
            return ((((527 + Arrays.hashCode(this.f2265c)) * 31) + Arrays.hashCode(this.f2266d)) * 31) + (!this.f2264b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f2263a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2264b + ")";
    }
}
