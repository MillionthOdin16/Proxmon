package e.k0.k;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import e.b0;
import e.c0;
import e.e0;
import e.g0;
import e.x;
import e.z;
import f.s;
import f.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements e.k0.i.c {
    private static final List<String> g = e.k0.e.s("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> h = e.k0.e.s("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    private final z.a f2173a;

    /* renamed from: b, reason: collision with root package name */
    private final e.k0.h.f f2174b;

    /* renamed from: c, reason: collision with root package name */
    private final f f2175c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f2176d;

    /* renamed from: e, reason: collision with root package name */
    private final c0 f2177e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f2178f;

    public g(b0 b0Var, e.k0.h.f fVar, z.a aVar, f fVar2) {
        this.f2174b = fVar;
        this.f2173a = aVar;
        this.f2175c = fVar2;
        this.f2177e = b0Var.v().contains(c0.H2_PRIOR_KNOWLEDGE) ? c0.H2_PRIOR_KNOWLEDGE : c0.HTTP_2;
    }

    public static List<c> i(e0 e0Var) {
        x d2 = e0Var.d();
        ArrayList arrayList = new ArrayList(d2.h() + 4);
        arrayList.add(new c(c.f2105f, e0Var.f()));
        arrayList.add(new c(c.g, e.k0.i.i.c(e0Var.h())));
        String c2 = e0Var.c("Host");
        if (c2 != null) {
            arrayList.add(new c(c.i, c2));
        }
        arrayList.add(new c(c.h, e0Var.h().B()));
        int h2 = d2.h();
        for (int i = 0; i < h2; i++) {
            String lowerCase = d2.e(i).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && d2.i(i).equals("trailers"))) {
                arrayList.add(new c(lowerCase, d2.i(i)));
            }
        }
        return arrayList;
    }

    public static g0.a j(x xVar, c0 c0Var) {
        x.a aVar = new x.a();
        int h2 = xVar.h();
        e.k0.i.k kVar = null;
        for (int i = 0; i < h2; i++) {
            String e2 = xVar.e(i);
            String i2 = xVar.i(i);
            if (e2.equals(":status")) {
                kVar = e.k0.i.k.a("HTTP/1.1 " + i2);
            } else if (!h.contains(e2)) {
                e.k0.c.f1986a.b(aVar, e2, i2);
            }
        }
        if (kVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        g0.a aVar2 = new g0.a();
        aVar2.o(c0Var);
        aVar2.g(kVar.f2076b);
        aVar2.l(kVar.f2077c);
        aVar2.j(aVar.d());
        return aVar2;
    }

    @Override // e.k0.i.c
    public void a() {
        this.f2176d.h().close();
    }

    @Override // e.k0.i.c
    public void b(e0 e0Var) {
        if (this.f2176d != null) {
            return;
        }
        this.f2176d = this.f2175c.Q(i(e0Var), e0Var.a() != null);
        if (this.f2178f) {
            this.f2176d.f(b.CANCEL);
            throw new IOException("Canceled");
        }
        this.f2176d.l().g(this.f2173a.e(), TimeUnit.MILLISECONDS);
        this.f2176d.r().g(this.f2173a.a(), TimeUnit.MILLISECONDS);
    }

    @Override // e.k0.i.c
    public void c() {
        this.f2175c.flush();
    }

    @Override // e.k0.i.c
    public void cancel() {
        this.f2178f = true;
        if (this.f2176d != null) {
            this.f2176d.f(b.CANCEL);
        }
    }

    @Override // e.k0.i.c
    public s d(e0 e0Var, long j) {
        return this.f2176d.h();
    }

    @Override // e.k0.i.c
    public long e(g0 g0Var) {
        return e.k0.i.e.b(g0Var);
    }

    @Override // e.k0.i.c
    public t f(g0 g0Var) {
        return this.f2176d.i();
    }

    @Override // e.k0.i.c
    public g0.a g(boolean z) {
        g0.a j = j(this.f2176d.p(), this.f2177e);
        if (z && e.k0.c.f1986a.d(j) == 100) {
            return null;
        }
        return j;
    }

    @Override // e.k0.i.c
    public e.k0.h.f h() {
        return this.f2174b;
    }
}
