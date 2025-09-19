package b.b.a.a;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f959c;

    /* renamed from: a, reason: collision with root package name */
    private c f960a;

    /* renamed from: b, reason: collision with root package name */
    private c f961b;

    private a() {
        b bVar = new b();
        this.f961b = bVar;
        this.f960a = bVar;
    }

    public static a b() {
        if (f959c != null) {
            return f959c;
        }
        synchronized (a.class) {
            if (f959c == null) {
                f959c = new a();
            }
        }
        return f959c;
    }

    @Override // b.b.a.a.c
    public boolean a() {
        return this.f960a.a();
    }
}
