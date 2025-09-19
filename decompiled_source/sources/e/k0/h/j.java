package e.k0.h;

import e.i0;
import e.v;
import e.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final e.e f2046a;

    /* renamed from: b, reason: collision with root package name */
    private final h f2047b;

    /* renamed from: c, reason: collision with root package name */
    private final e.j f2048c;

    /* renamed from: d, reason: collision with root package name */
    private final v f2049d;

    /* renamed from: f, reason: collision with root package name */
    private int f2051f;

    /* renamed from: e, reason: collision with root package name */
    private List<Proxy> f2050e = Collections.emptyList();
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<i0> h = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<i0> f2052a;

        /* renamed from: b, reason: collision with root package name */
        private int f2053b = 0;

        a(List<i0> list) {
            this.f2052a = list;
        }

        public List<i0> a() {
            return new ArrayList(this.f2052a);
        }

        public boolean b() {
            return this.f2053b < this.f2052a.size();
        }

        public i0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<i0> list = this.f2052a;
            int i = this.f2053b;
            this.f2053b = i + 1;
            return list.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(e.e eVar, h hVar, e.j jVar, v vVar) {
        this.f2046a = eVar;
        this.f2047b = hVar;
        this.f2048c = jVar;
        this.f2049d = vVar;
        g(eVar.l(), eVar.g());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean c() {
        return this.f2051f < this.f2050e.size();
    }

    private Proxy e() {
        if (c()) {
            List<Proxy> list = this.f2050e;
            int i = this.f2051f;
            this.f2051f = i + 1;
            Proxy proxy = list.get(i);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f2046a.l().l() + "; exhausted proxy configurations: " + this.f2050e);
    }

    private void f(Proxy proxy) {
        String l;
        int w;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            l = this.f2046a.l().l();
            w = this.f2046a.l().w();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            l = a(inetSocketAddress);
            w = inetSocketAddress.getPort();
        }
        if (w < 1 || w > 65535) {
            throw new SocketException("No route to " + l + ":" + w + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(l, w));
            return;
        }
        this.f2049d.j(this.f2048c, l);
        List<InetAddress> a2 = this.f2046a.c().a(l);
        if (a2.isEmpty()) {
            throw new UnknownHostException(this.f2046a.c() + " returned no addresses for " + l);
        }
        this.f2049d.i(this.f2048c, l, a2);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.g.add(new InetSocketAddress(a2.get(i), w));
        }
    }

    private void g(y yVar, Proxy proxy) {
        List<Proxy> s;
        if (proxy != null) {
            s = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f2046a.i().select(yVar.C());
            s = (select == null || select.isEmpty()) ? e.k0.e.s(Proxy.NO_PROXY) : e.k0.e.r(select);
        }
        this.f2050e = s;
        this.f2051f = 0;
    }

    public boolean b() {
        return c() || !this.h.isEmpty();
    }

    public a d() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy e2 = e();
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                i0 i0Var = new i0(this.f2046a, e2, this.g.get(i));
                if (this.f2047b.c(i0Var)) {
                    this.h.add(i0Var);
                } else {
                    arrayList.add(i0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.h);
            this.h.clear();
        }
        return new a(arrayList);
    }
}
