package c.b.a.a.a.a;

/* loaded from: classes.dex */
public final class e0<T> implements g0<T> {

    /* renamed from: a, reason: collision with root package name */
    private g0<T> f1400a;

    public static <T> void b(g0<T> g0Var, g0<T> g0Var2) {
        r.c(g0Var2);
        e0 e0Var = (e0) g0Var;
        if (e0Var.f1400a != null) {
            throw new IllegalStateException();
        }
        e0Var.f1400a = g0Var2;
    }

    @Override // c.b.a.a.a.a.g0
    public final T a() {
        g0<T> g0Var = this.f1400a;
        if (g0Var != null) {
            return g0Var.a();
        }
        throw new IllegalStateException();
    }
}
