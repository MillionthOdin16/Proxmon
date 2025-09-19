package e;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    final e f1975a;

    /* renamed from: b, reason: collision with root package name */
    final Proxy f1976b;

    /* renamed from: c, reason: collision with root package name */
    final InetSocketAddress f1977c;

    public i0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f1975a = eVar;
        this.f1976b = proxy;
        this.f1977c = inetSocketAddress;
    }

    public e a() {
        return this.f1975a;
    }

    public Proxy b() {
        return this.f1976b;
    }

    public boolean c() {
        return this.f1975a.i != null && this.f1976b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f1977c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (i0Var.f1975a.equals(this.f1975a) && i0Var.f1976b.equals(this.f1976b) && i0Var.f1977c.equals(this.f1977c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f1975a.hashCode()) * 31) + this.f1976b.hashCode()) * 31) + this.f1977c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f1977c + "}";
    }
}
