package f;

/* loaded from: classes.dex */
public abstract class h implements t {

    /* renamed from: b, reason: collision with root package name */
    private final t f2320b;

    public h(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2320b = tVar;
    }

    @Override // f.t
    public u b() {
        return this.f2320b.b();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2320b.close();
    }

    public final t r() {
        return this.f2320b;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2320b.toString() + ")";
    }
}
