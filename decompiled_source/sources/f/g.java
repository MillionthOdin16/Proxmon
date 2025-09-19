package f;

/* loaded from: classes.dex */
public abstract class g implements s {

    /* renamed from: b, reason: collision with root package name */
    private final s f2319b;

    public g(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2319b = sVar;
    }

    @Override // f.s
    public u b() {
        return this.f2319b.b();
    }

    @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2319b.close();
    }

    @Override // f.s
    public void e(c cVar, long j) {
        this.f2319b.e(cVar, j);
    }

    @Override // f.s, java.io.Flushable
    public void flush() {
        this.f2319b.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2319b.toString() + ")";
    }
}
