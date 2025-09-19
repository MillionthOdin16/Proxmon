package c.b.a.a.a.a;

/* loaded from: classes.dex */
final class z extends w {

    /* renamed from: a, reason: collision with root package name */
    private final y f1428a = new y();

    @Override // c.b.a.a.a.a.w
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f1428a.a(th).add(th2);
    }
}
