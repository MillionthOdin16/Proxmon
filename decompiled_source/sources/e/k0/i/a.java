package e.k0.i;

import e.a0;
import e.e0;
import e.f0;
import e.g0;
import e.q;
import e.r;
import e.x;
import e.z;
import f.l;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    private final r f2061a;

    public a(r rVar) {
        this.f2061a = rVar;
    }

    private String b(List<q> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            q qVar = list.get(i);
            sb.append(qVar.c());
            sb.append('=');
            sb.append(qVar.k());
        }
        return sb.toString();
    }

    @Override // e.z
    public g0 a(z.a aVar) {
        e0 c2 = aVar.c();
        e0.a g = c2.g();
        f0 a2 = c2.a();
        if (a2 != null) {
            a0 b2 = a2.b();
            if (b2 != null) {
                b2.toString();
                throw null;
            }
            long a3 = a2.a();
            if (a3 != -1) {
                g.c("Content-Length", Long.toString(a3));
                g.f("Transfer-Encoding");
            } else {
                g.c("Transfer-Encoding", "chunked");
                g.f("Content-Length");
            }
        }
        boolean z = false;
        if (c2.c("Host") == null) {
            g.c("Host", e.k0.e.q(c2.h(), false));
        }
        if (c2.c("Connection") == null) {
            g.c("Connection", "Keep-Alive");
        }
        if (c2.c("Accept-Encoding") == null && c2.c("Range") == null) {
            z = true;
            g.c("Accept-Encoding", "gzip");
        }
        List<q> a4 = this.f2061a.a(c2.h());
        if (!a4.isEmpty()) {
            g.c("Cookie", b(a4));
        }
        if (c2.c("User-Agent") == null) {
            g.c("User-Agent", e.k0.f.a());
        }
        g0 b3 = aVar.b(g.a());
        e.e(this.f2061a, c2.h(), b3.F());
        g0.a G = b3.G();
        G.q(c2);
        if (z && "gzip".equalsIgnoreCase(b3.D("Content-Encoding")) && e.c(b3)) {
            f.j jVar = new f.j(b3.r().E());
            x.a f2 = b3.F().f();
            f2.e("Content-Encoding");
            f2.e("Content-Length");
            G.j(f2.d());
            G.b(new h(b3.D("Content-Type"), -1L, l.b(jVar)));
        }
        return G.c();
    }
}
