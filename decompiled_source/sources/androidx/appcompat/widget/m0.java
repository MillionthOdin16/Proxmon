package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class m0 {
    private static m0 i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, b.d.h<ColorStateList>> f480a;

    /* renamed from: b, reason: collision with root package name */
    private b.d.g<String, d> f481b;

    /* renamed from: c, reason: collision with root package name */
    private b.d.h<String> f482c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, b.d.d<WeakReference<Drawable.ConstantState>>> f483d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f484e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f485f;
    private e g;
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static final c j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.k.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends b.d.e<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i, mode)));
        }

        PorterDuffColorFilter j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(m0 m0Var, Context context, int i);

        boolean b(Context context, int i, Drawable drawable);

        ColorStateList c(Context context, int i);

        boolean d(Context context, int i, Drawable drawable);

        PorterDuff.Mode e(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return b.k.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f481b == null) {
            this.f481b = new b.d.g<>();
        }
        this.f481b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f483d.get(context);
            if (dVar == null) {
                dVar = new b.d.d<>();
                this.f483d.put(context, dVar);
            }
            dVar.h(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f480a == null) {
            this.f480a = new WeakHashMap<>();
        }
        b.d.h<ColorStateList> hVar = this.f480a.get(context);
        if (hVar == null) {
            hVar = new b.d.h<>();
            this.f480a.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f485f) {
            return;
        }
        this.f485f = true;
        Drawable j2 = j(context, b.a.m.a.abc_vector_test);
        if (j2 == null || !q(j2)) {
            this.f485f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) {
        if (this.f484e == null) {
            this.f484e = new TypedValue();
        }
        TypedValue typedValue = this.f484e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        e eVar = this.g;
        Drawable a2 = eVar == null ? null : eVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (i == null) {
                m0 m0Var2 = new m0();
                i = m0Var2;
                p(m0Var2);
            }
            m0Var = i;
        }
        return m0Var;
    }

    private synchronized Drawable i(Context context, long j2) {
        b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f483d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e2 = dVar.e(j2);
        if (e2 != null) {
            Drawable.ConstantState constantState = e2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.i(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (m0.class) {
            i3 = j.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                j.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        b.d.h<ColorStateList> hVar;
        WeakHashMap<Context, b.d.h<ColorStateList>> weakHashMap = this.f480a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.e(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a("vector", new f());
            m0Var.a("animated-vector", new b());
            m0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof b.k.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) {
        int next;
        b.d.g<String, d> gVar = this.f481b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        b.d.h<String> hVar = this.f482c;
        if (hVar != null) {
            String e2 = hVar.e(i2);
            if ("appcompat_skip_skip".equals(e2) || (e2 != null && this.f481b.get(e2) == null)) {
                return null;
            }
        } else {
            this.f482c = new b.d.h<>();
        }
        if (this.f484e == null) {
            this.f484e = new TypedValue();
        }
        TypedValue typedValue = this.f484e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e3 = e(typedValue);
        Drawable i3 = i(context, e3);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f482c.a(i2, name);
                d dVar = this.f481b.get(name);
                if (dVar != null) {
                    i3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i3 != null) {
                    i3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e3, i3);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (i3 == null) {
            this.f482c.a(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m == null) {
            e eVar = this.g;
            if ((eVar == null || !eVar.d(context, i2, drawable)) && !x(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (e0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable p = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(p, m);
        PorterDuff.Mode o = o(i2);
        if (o == null) {
            return p;
        }
        androidx.core.graphics.drawable.a.o(p, o);
        return p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, u0 u0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (u0Var.f544d || u0Var.f543c) {
            drawable.setColorFilter(g(u0Var.f544d ? u0Var.f541a : null, u0Var.f543c ? u0Var.f542b : h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = b.e.d.a.d(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            e0.b(r);
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            n = this.g == null ? null : this.g.c(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    PorterDuff.Mode o(int i2) {
        e eVar = this.g;
        if (eVar == null) {
            return null;
        }
        return eVar.e(i2);
    }

    public synchronized void s(Context context) {
        b.d.d<WeakReference<Drawable.ConstantState>> dVar = this.f483d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, b1 b1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = b1Var.c(i2);
        }
        if (r == null) {
            return null;
        }
        return v(context, i2, false, r);
    }

    public synchronized void u(e eVar) {
        this.g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.g;
        return eVar != null && eVar.b(context, i2, drawable);
    }
}
