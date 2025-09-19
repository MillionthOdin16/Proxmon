package b.e.j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f1229b = new a().a().a().b().c();

    /* renamed from: a, reason: collision with root package name */
    private final i f1230a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f1231a;

        public a() {
            int i = Build.VERSION.SDK_INT;
            this.f1231a = i >= 29 ? new c() : i >= 20 ? new b() : new d();
        }

        public a(z zVar) {
            int i = Build.VERSION.SDK_INT;
            this.f1231a = i >= 29 ? new c(zVar) : i >= 20 ? new b(zVar) : new d(zVar);
        }

        public z a() {
            return this.f1231a.a();
        }

        public a b(b.e.e.b bVar) {
            this.f1231a.b(bVar);
            return this;
        }

        public a c(b.e.e.b bVar) {
            this.f1231a.c(bVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class b extends d {

        /* renamed from: c, reason: collision with root package name */
        private static Field f1232c = null;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1233d = false;

        /* renamed from: e, reason: collision with root package name */
        private static Constructor<WindowInsets> f1234e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f1235f = false;

        /* renamed from: b, reason: collision with root package name */
        private WindowInsets f1236b;

        b() {
            this.f1236b = d();
        }

        b(z zVar) {
            this.f1236b = zVar.l();
        }

        private static WindowInsets d() {
            if (!f1233d) {
                try {
                    f1232c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f1233d = true;
            }
            Field field = f1232c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f1235f) {
                try {
                    f1234e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f1235f = true;
            }
            Constructor<WindowInsets> constructor = f1234e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // b.e.j.z.d
        z a() {
            return z.m(this.f1236b);
        }

        @Override // b.e.j.z.d
        void c(b.e.e.b bVar) {
            WindowInsets windowInsets = this.f1236b;
            if (windowInsets != null) {
                this.f1236b = windowInsets.replaceSystemWindowInsets(bVar.f1091a, bVar.f1092b, bVar.f1093c, bVar.f1094d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class c extends d {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets.Builder f1237b;

        c() {
            this.f1237b = new WindowInsets.Builder();
        }

        c(z zVar) {
            WindowInsets l = zVar.l();
            this.f1237b = l != null ? new WindowInsets.Builder(l) : new WindowInsets.Builder();
        }

        @Override // b.e.j.z.d
        z a() {
            return z.m(this.f1237b.build());
        }

        @Override // b.e.j.z.d
        void b(b.e.e.b bVar) {
            this.f1237b.setStableInsets(bVar.b());
        }

        @Override // b.e.j.z.d
        void c(b.e.e.b bVar) {
            this.f1237b.setSystemWindowInsets(bVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final z f1238a;

        d() {
            this(new z((z) null));
        }

        d(z zVar) {
            this.f1238a = zVar;
        }

        z a() {
            return this.f1238a;
        }

        void b(b.e.e.b bVar) {
        }

        void c(b.e.e.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends i {

        /* renamed from: b, reason: collision with root package name */
        final WindowInsets f1239b;

        /* renamed from: c, reason: collision with root package name */
        private b.e.e.b f1240c;

        e(z zVar, WindowInsets windowInsets) {
            super(zVar);
            this.f1240c = null;
            this.f1239b = windowInsets;
        }

        e(z zVar, e eVar) {
            this(zVar, new WindowInsets(eVar.f1239b));
        }

        @Override // b.e.j.z.i
        final b.e.e.b f() {
            if (this.f1240c == null) {
                this.f1240c = b.e.e.b.a(this.f1239b.getSystemWindowInsetLeft(), this.f1239b.getSystemWindowInsetTop(), this.f1239b.getSystemWindowInsetRight(), this.f1239b.getSystemWindowInsetBottom());
            }
            return this.f1240c;
        }

        @Override // b.e.j.z.i
        z g(int i, int i2, int i3, int i4) {
            a aVar = new a(z.m(this.f1239b));
            aVar.c(z.j(f(), i, i2, i3, i4));
            aVar.b(z.j(e(), i, i2, i3, i4));
            return aVar.a();
        }

        @Override // b.e.j.z.i
        boolean i() {
            return this.f1239b.isRound();
        }
    }

    /* loaded from: classes.dex */
    private static class f extends e {

        /* renamed from: d, reason: collision with root package name */
        private b.e.e.b f1241d;

        f(z zVar, WindowInsets windowInsets) {
            super(zVar, windowInsets);
            this.f1241d = null;
        }

        f(z zVar, f fVar) {
            super(zVar, fVar);
            this.f1241d = null;
        }

        @Override // b.e.j.z.i
        z b() {
            return z.m(this.f1239b.consumeStableInsets());
        }

        @Override // b.e.j.z.i
        z c() {
            return z.m(this.f1239b.consumeSystemWindowInsets());
        }

        @Override // b.e.j.z.i
        final b.e.e.b e() {
            if (this.f1241d == null) {
                this.f1241d = b.e.e.b.a(this.f1239b.getStableInsetLeft(), this.f1239b.getStableInsetTop(), this.f1239b.getStableInsetRight(), this.f1239b.getStableInsetBottom());
            }
            return this.f1241d;
        }

        @Override // b.e.j.z.i
        boolean h() {
            return this.f1239b.isConsumed();
        }
    }

    /* loaded from: classes.dex */
    private static class g extends f {
        g(z zVar, WindowInsets windowInsets) {
            super(zVar, windowInsets);
        }

        g(z zVar, g gVar) {
            super(zVar, gVar);
        }

        @Override // b.e.j.z.i
        z a() {
            return z.m(this.f1239b.consumeDisplayCutout());
        }

        @Override // b.e.j.z.i
        b.e.j.c d() {
            return b.e.j.c.a(this.f1239b.getDisplayCutout());
        }

        @Override // b.e.j.z.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return Objects.equals(this.f1239b, ((g) obj).f1239b);
            }
            return false;
        }

        @Override // b.e.j.z.i
        public int hashCode() {
            return this.f1239b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {
        h(z zVar, WindowInsets windowInsets) {
            super(zVar, windowInsets);
        }

        h(z zVar, h hVar) {
            super(zVar, hVar);
        }

        @Override // b.e.j.z.e, b.e.j.z.i
        z g(int i, int i2, int i3, int i4) {
            return z.m(this.f1239b.inset(i, i2, i3, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        final z f1242a;

        i(z zVar) {
            this.f1242a = zVar;
        }

        z a() {
            return this.f1242a;
        }

        z b() {
            return this.f1242a;
        }

        z c() {
            return this.f1242a;
        }

        b.e.j.c d() {
            return null;
        }

        b.e.e.b e() {
            return b.e.e.b.f1090e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return i() == iVar.i() && h() == iVar.h() && b.e.i.c.a(f(), iVar.f()) && b.e.i.c.a(e(), iVar.e()) && b.e.i.c.a(d(), iVar.d());
        }

        b.e.e.b f() {
            return b.e.e.b.f1090e;
        }

        z g(int i, int i2, int i3, int i4) {
            return z.f1229b;
        }

        boolean h() {
            return false;
        }

        public int hashCode() {
            return b.e.i.c.b(Boolean.valueOf(i()), Boolean.valueOf(h()), f(), e(), d());
        }

        boolean i() {
            return false;
        }
    }

    private z(WindowInsets windowInsets) {
        i eVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            eVar = new h(this, windowInsets);
        } else if (i2 >= 28) {
            eVar = new g(this, windowInsets);
        } else if (i2 >= 21) {
            eVar = new f(this, windowInsets);
        } else {
            if (i2 < 20) {
                this.f1230a = new i(this);
                return;
            }
            eVar = new e(this, windowInsets);
        }
        this.f1230a = eVar;
    }

    public z(z zVar) {
        i iVar;
        i eVar;
        if (zVar != null) {
            i iVar2 = zVar.f1230a;
            if (Build.VERSION.SDK_INT >= 29 && (iVar2 instanceof h)) {
                eVar = new h(this, (h) iVar2);
            } else if (Build.VERSION.SDK_INT >= 28 && (iVar2 instanceof g)) {
                eVar = new g(this, (g) iVar2);
            } else if (Build.VERSION.SDK_INT >= 21 && (iVar2 instanceof f)) {
                eVar = new f(this, (f) iVar2);
            } else if (Build.VERSION.SDK_INT < 20 || !(iVar2 instanceof e)) {
                iVar = new i(this);
            } else {
                eVar = new e(this, (e) iVar2);
            }
            this.f1230a = eVar;
            return;
        }
        iVar = new i(this);
        this.f1230a = iVar;
    }

    static b.e.e.b j(b.e.e.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f1091a - i2);
        int max2 = Math.max(0, bVar.f1092b - i3);
        int max3 = Math.max(0, bVar.f1093c - i4);
        int max4 = Math.max(0, bVar.f1094d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : b.e.e.b.a(max, max2, max3, max4);
    }

    public static z m(WindowInsets windowInsets) {
        b.e.i.d.b(windowInsets);
        return new z(windowInsets);
    }

    public z a() {
        return this.f1230a.a();
    }

    public z b() {
        return this.f1230a.b();
    }

    public z c() {
        return this.f1230a.c();
    }

    public int d() {
        return h().f1094d;
    }

    public int e() {
        return h().f1091a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return b.e.i.c.a(this.f1230a, ((z) obj).f1230a);
        }
        return false;
    }

    public int f() {
        return h().f1093c;
    }

    public int g() {
        return h().f1092b;
    }

    public b.e.e.b h() {
        return this.f1230a.f();
    }

    public int hashCode() {
        i iVar = this.f1230a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public z i(int i2, int i3, int i4, int i5) {
        return this.f1230a.g(i2, i3, i4, i5);
    }

    @Deprecated
    public z k(int i2, int i3, int i4, int i5) {
        a aVar = new a(this);
        aVar.c(b.e.e.b.a(i2, i3, i4, i5));
        return aVar.a();
    }

    public WindowInsets l() {
        i iVar = this.f1230a;
        if (iVar instanceof e) {
            return ((e) iVar).f1239b;
        }
        return null;
    }
}
