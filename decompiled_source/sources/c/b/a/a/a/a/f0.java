package c.b.a.a.a.a;

/* loaded from: classes.dex */
public final class f0<T> implements g0, d0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1402c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile g0<T> f1403a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f1404b = f1402c;

    private f0(g0<T> g0Var) {
        this.f1403a = g0Var;
    }

    public static <P extends g0<T>, T> g0<T> b(P p) {
        r.c(p);
        return p instanceof f0 ? p : new f0(p);
    }

    public static <P extends g0<T>, T> d0<T> c(P p) {
        if (p instanceof d0) {
            return (d0) p;
        }
        r.c(p);
        return new f0(p);
    }

    @Override // c.b.a.a.a.a.g0
    public final T a() {
        T t = (T) this.f1404b;
        if (t == f1402c) {
            synchronized (this) {
                t = (T) this.f1404b;
                if (t == f1402c) {
                    t = this.f1403a.a();
                    Object obj = this.f1404b;
                    if (obj != f1402c && obj != t) {
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f1404b = t;
                    this.f1403a = null;
                }
            }
        }
        return t;
    }
}
