package e.k0.h;

import e.b0;
import e.i0;
import e.k0.h.j;
import e.v;
import e.z;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f2026a;

    /* renamed from: b, reason: collision with root package name */
    private final e.e f2027b;

    /* renamed from: c, reason: collision with root package name */
    private final g f2028c;

    /* renamed from: d, reason: collision with root package name */
    private final e.j f2029d;

    /* renamed from: e, reason: collision with root package name */
    private final v f2030e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f2031f;
    private final j g;
    private f h;
    private boolean i;
    private i0 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(k kVar, g gVar, e.e eVar, e.j jVar, v vVar) {
        this.f2026a = kVar;
        this.f2028c = gVar;
        this.f2027b = eVar;
        this.f2029d = jVar;
        this.f2030e = vVar;
        this.g = new j(eVar, gVar.f2041e, jVar, vVar);
    }

    private f c(int i, int i2, int i3, int i4, boolean z) {
        Socket socket;
        Socket n;
        f fVar;
        f fVar2;
        i0 i0Var;
        boolean z2;
        boolean z3;
        List<i0> list;
        j.a aVar;
        synchronized (this.f2028c) {
            if (this.f2026a.i()) {
                throw new IOException("Canceled");
            }
            this.i = false;
            f fVar3 = this.f2026a.i;
            socket = null;
            n = (this.f2026a.i == null || !this.f2026a.i.k) ? null : this.f2026a.n();
            if (this.f2026a.i != null) {
                fVar2 = this.f2026a.i;
                fVar = null;
            } else {
                fVar = fVar3;
                fVar2 = null;
            }
            if (fVar2 == null) {
                if (this.f2028c.g(this.f2027b, this.f2026a, null, false)) {
                    fVar2 = this.f2026a.i;
                    i0Var = null;
                    z2 = true;
                } else {
                    if (this.j != null) {
                        i0Var = this.j;
                        this.j = null;
                    } else if (g()) {
                        i0Var = this.f2026a.i.q();
                    }
                    z2 = false;
                }
            }
            i0Var = null;
            z2 = false;
        }
        e.k0.e.f(n);
        if (fVar != null) {
            this.f2030e.h(this.f2029d, fVar);
        }
        if (z2) {
            this.f2030e.g(this.f2029d, fVar2);
        }
        if (fVar2 != null) {
            return fVar2;
        }
        if (i0Var != null || ((aVar = this.f2031f) != null && aVar.b())) {
            z3 = false;
        } else {
            this.f2031f = this.g.d();
            z3 = true;
        }
        synchronized (this.f2028c) {
            if (this.f2026a.i()) {
                throw new IOException("Canceled");
            }
            if (z3) {
                list = this.f2031f.a();
                if (this.f2028c.g(this.f2027b, this.f2026a, list, false)) {
                    fVar2 = this.f2026a.i;
                    z2 = true;
                }
            } else {
                list = null;
            }
            if (!z2) {
                if (i0Var == null) {
                    i0Var = this.f2031f.c();
                }
                fVar2 = new f(this.f2028c, i0Var);
                this.h = fVar2;
            }
        }
        if (!z2) {
            fVar2.d(i, i2, i3, i4, z, this.f2029d, this.f2030e);
            this.f2028c.f2041e.a(fVar2.q());
            synchronized (this.f2028c) {
                this.h = null;
                if (this.f2028c.g(this.f2027b, this.f2026a, list, true)) {
                    fVar2.k = true;
                    socket = fVar2.s();
                    fVar2 = this.f2026a.i;
                    this.j = i0Var;
                } else {
                    this.f2028c.f(fVar2);
                    this.f2026a.a(fVar2);
                }
            }
            e.k0.e.f(socket);
        }
        this.f2030e.g(this.f2029d, fVar2);
        return fVar2;
    }

    private f d(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            f c2 = c(i, i2, i3, i4, z);
            synchronized (this.f2028c) {
                if (c2.m == 0 && !c2.n()) {
                    return c2;
                }
                if (c2.m(z2)) {
                    return c2;
                }
                c2.p();
            }
        }
    }

    private boolean g() {
        f fVar = this.f2026a.i;
        return fVar != null && fVar.l == 0 && e.k0.e.C(fVar.q().a().l(), this.f2027b.l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f a() {
        return this.h;
    }

    public e.k0.i.c b(b0 b0Var, z.a aVar, boolean z) {
        try {
            return d(aVar.d(), aVar.e(), aVar.a(), b0Var.u(), b0Var.A(), z).o(b0Var, aVar);
        } catch (i e2) {
            h();
            throw e2;
        } catch (IOException e3) {
            h();
            throw new i(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        synchronized (this.f2028c) {
            boolean z = true;
            if (this.j != null) {
                return true;
            }
            if (g()) {
                this.j = this.f2026a.i.q();
                return true;
            }
            if ((this.f2031f == null || !this.f2031f.b()) && !this.g.b()) {
                z = false;
            }
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        boolean z;
        synchronized (this.f2028c) {
            z = this.i;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        synchronized (this.f2028c) {
            this.i = true;
        }
    }
}
