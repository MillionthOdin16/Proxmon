package c.b.a.a.a.a;

/* loaded from: classes.dex */
public abstract class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.f.p<?> f1401b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        this.f1401b = null;
    }

    public f(c.b.a.a.a.f.p<?> pVar) {
        this.f1401b = pVar;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.b.a.a.a.f.p<?> b() {
        return this.f1401b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            c.b.a.a.a.f.p<?> pVar = this.f1401b;
            if (pVar != null) {
                pVar.d(e2);
            }
        }
    }
}
