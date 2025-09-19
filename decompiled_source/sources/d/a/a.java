package d.a;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.h.c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static a f1853d;

    /* renamed from: a, reason: collision with root package name */
    private c f1854a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.g.a f1855b;

    /* renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f1856c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private c f1857a;

        /* renamed from: b, reason: collision with root package name */
        private io.flutter.embedding.engine.g.a f1858b;

        /* renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f1859c;

        private void b() {
            if (this.f1859c == null) {
                this.f1859c = new FlutterJNI.c();
            }
            if (this.f1857a == null) {
                this.f1857a = new c(this.f1859c.a());
            }
        }

        public a a() {
            b();
            return new a(this.f1857a, this.f1858b, this.f1859c);
        }
    }

    private a(c cVar, io.flutter.embedding.engine.g.a aVar, FlutterJNI.c cVar2) {
        this.f1854a = cVar;
        this.f1855b = aVar;
        this.f1856c = cVar2;
    }

    public static a d() {
        if (f1853d == null) {
            f1853d = new b().a();
        }
        return f1853d;
    }

    public io.flutter.embedding.engine.g.a a() {
        return this.f1855b;
    }

    public c b() {
        return this.f1854a;
    }

    public FlutterJNI.c c() {
        return this.f1856c;
    }
}
