package f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    static p f2349a;

    /* renamed from: b, reason: collision with root package name */
    static long f2350b;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(p pVar) {
        if (pVar.f2348f != null || pVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (pVar.f2346d) {
            return;
        }
        synchronized (q.class) {
            if (f2350b + 8192 > 65536) {
                return;
            }
            f2350b += 8192;
            pVar.f2348f = f2349a;
            pVar.f2345c = 0;
            pVar.f2344b = 0;
            f2349a = pVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p b() {
        synchronized (q.class) {
            if (f2349a == null) {
                return new p();
            }
            p pVar = f2349a;
            f2349a = pVar.f2348f;
            pVar.f2348f = null;
            f2350b -= 8192;
            return pVar;
        }
    }
}
