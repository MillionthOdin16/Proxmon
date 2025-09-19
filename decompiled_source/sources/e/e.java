package e;

import e.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final y f1927a;

    /* renamed from: b, reason: collision with root package name */
    final u f1928b;

    /* renamed from: c, reason: collision with root package name */
    final SocketFactory f1929c;

    /* renamed from: d, reason: collision with root package name */
    final g f1930d;

    /* renamed from: e, reason: collision with root package name */
    final List<c0> f1931e;

    /* renamed from: f, reason: collision with root package name */
    final List<p> f1932f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final l k;

    public e(String str, int i, u uVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, l lVar, g gVar, Proxy proxy, List<c0> list, List<p> list2, ProxySelector proxySelector) {
        y.a aVar = new y.a();
        aVar.q(sSLSocketFactory != null ? "https" : "http");
        aVar.e(str);
        aVar.l(i);
        this.f1927a = aVar.a();
        if (uVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f1928b = uVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f1929c = socketFactory;
        if (gVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f1930d = gVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f1931e = e.k0.e.r(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f1932f = e.k0.e.r(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = lVar;
    }

    public l a() {
        return this.k;
    }

    public List<p> b() {
        return this.f1932f;
    }

    public u c() {
        return this.f1928b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(e eVar) {
        return this.f1928b.equals(eVar.f1928b) && this.f1930d.equals(eVar.f1930d) && this.f1931e.equals(eVar.f1931e) && this.f1932f.equals(eVar.f1932f) && this.g.equals(eVar.g) && Objects.equals(this.h, eVar.h) && Objects.equals(this.i, eVar.i) && Objects.equals(this.j, eVar.j) && Objects.equals(this.k, eVar.k) && l().w() == eVar.l().w();
    }

    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f1927a.equals(eVar.f1927a) && d(eVar)) {
                return true;
            }
        }
        return false;
    }

    public List<c0> f() {
        return this.f1931e;
    }

    public Proxy g() {
        return this.h;
    }

    public g h() {
        return this.f1930d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f1927a.hashCode()) * 31) + this.f1928b.hashCode()) * 31) + this.f1930d.hashCode()) * 31) + this.f1931e.hashCode()) * 31) + this.f1932f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public ProxySelector i() {
        return this.g;
    }

    public SocketFactory j() {
        return this.f1929c;
    }

    public SSLSocketFactory k() {
        return this.i;
    }

    public y l() {
        return this.f1927a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f1927a.l());
        sb.append(":");
        sb.append(this.f1927a.w());
        if (this.h != null) {
            sb.append(", proxy=");
            obj = this.h;
        } else {
            sb.append(", proxySelector=");
            obj = this.g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
