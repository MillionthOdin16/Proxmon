package e.k0.i;

import e.e0;
import e.g0;
import e.z;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements z.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<z> f2066a;

    /* renamed from: b, reason: collision with root package name */
    private final e.k0.h.k f2067b;

    /* renamed from: c, reason: collision with root package name */
    private final e.k0.h.d f2068c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2069d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f2070e;

    /* renamed from: f, reason: collision with root package name */
    private final e.j f2071f;
    private final int g;
    private final int h;
    private final int i;
    private int j;

    public g(List<z> list, e.k0.h.k kVar, e.k0.h.d dVar, int i, e0 e0Var, e.j jVar, int i2, int i3, int i4) {
        this.f2066a = list;
        this.f2067b = kVar;
        this.f2068c = dVar;
        this.f2069d = i;
        this.f2070e = e0Var;
        this.f2071f = jVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    @Override // e.z.a
    public int a() {
        return this.i;
    }

    @Override // e.z.a
    public g0 b(e0 e0Var) {
        return g(e0Var, this.f2067b, this.f2068c);
    }

    @Override // e.z.a
    public e0 c() {
        return this.f2070e;
    }

    @Override // e.z.a
    public int d() {
        return this.g;
    }

    @Override // e.z.a
    public int e() {
        return this.h;
    }

    public e.k0.h.d f() {
        e.k0.h.d dVar = this.f2068c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException();
    }

    public g0 g(e0 e0Var, e.k0.h.k kVar, e.k0.h.d dVar) {
        if (this.f2069d >= this.f2066a.size()) {
            throw new AssertionError();
        }
        this.j++;
        e.k0.h.d dVar2 = this.f2068c;
        if (dVar2 != null && !dVar2.c().u(e0Var.h())) {
            throw new IllegalStateException("network interceptor " + this.f2066a.get(this.f2069d - 1) + " must retain the same host and port");
        }
        if (this.f2068c != null && this.j > 1) {
            throw new IllegalStateException("network interceptor " + this.f2066a.get(this.f2069d - 1) + " must call proceed() exactly once");
        }
        g gVar = new g(this.f2066a, kVar, dVar, this.f2069d + 1, e0Var, this.f2071f, this.g, this.h, this.i);
        z zVar = this.f2066a.get(this.f2069d);
        g0 a2 = zVar.a(gVar);
        if (dVar != null && this.f2069d + 1 < this.f2066a.size() && gVar.j != 1) {
            throw new IllegalStateException("network interceptor " + zVar + " must call proceed() exactly once");
        }
        if (a2 == null) {
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        if (a2.r() != null) {
            return a2;
        }
        throw new IllegalStateException("interceptor " + zVar + " returned a response with no body");
    }

    public e.k0.h.k h() {
        return this.f2067b;
    }
}
