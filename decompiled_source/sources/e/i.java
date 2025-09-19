package e;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1963a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1964b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1965c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1966d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1967e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1968f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    String m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f1969a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1970b;

        /* renamed from: c, reason: collision with root package name */
        int f1971c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f1972d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f1973e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f1974f;
        boolean g;
        boolean h;

        public i a() {
            return new i(this);
        }

        public a b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f1972d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public a c() {
            this.f1969a = true;
            return this;
        }

        public a d() {
            this.f1974f = true;
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.c();
        aVar.a();
        a aVar2 = new a();
        aVar2.d();
        aVar2.b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        aVar2.a();
    }

    i(a aVar) {
        this.f1963a = aVar.f1969a;
        this.f1964b = aVar.f1970b;
        this.f1965c = aVar.f1971c;
        this.f1966d = -1;
        this.f1967e = false;
        this.f1968f = false;
        this.g = false;
        this.h = aVar.f1972d;
        this.i = aVar.f1973e;
        this.j = aVar.f1974f;
        this.k = aVar.g;
        this.l = aVar.h;
    }

    private i(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f1963a = z;
        this.f1964b = z2;
        this.f1965c = i;
        this.f1966d = i2;
        this.f1967e = z3;
        this.f1968f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f1963a) {
            sb.append("no-cache, ");
        }
        if (this.f1964b) {
            sb.append("no-store, ");
        }
        if (this.f1965c != -1) {
            sb.append("max-age=");
            sb.append(this.f1965c);
            sb.append(", ");
        }
        if (this.f1966d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f1966d);
            sb.append(", ");
        }
        if (this.f1967e) {
            sb.append("private, ");
        }
        if (this.f1968f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        if (this.h != -1) {
            sb.append("max-stale=");
            sb.append(this.h);
            sb.append(", ");
        }
        if (this.i != -1) {
            sb.append("min-fresh=");
            sb.append(this.i);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e.i k(e.x r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.k(e.x):e.i");
    }

    public boolean b() {
        return this.f1967e;
    }

    public boolean c() {
        return this.f1968f;
    }

    public int d() {
        return this.f1965c;
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.f1963a;
    }

    public boolean i() {
        return this.f1964b;
    }

    public boolean j() {
        return this.j;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String a2 = a();
        this.m = a2;
        return a2;
    }
}
