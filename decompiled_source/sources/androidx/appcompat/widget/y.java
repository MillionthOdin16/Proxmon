package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import b.e.d.d.f;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f582a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f583b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f584c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f585d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f586e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f587f;
    private u0 g;
    private u0 h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f589b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f590c;

        a(int i, int i2, WeakReference weakReference) {
            this.f588a = i;
            this.f589b = i2;
            this.f590c = weakReference;
        }

        @Override // b.e.d.d.f.a
        public void c(int i) {
        }

        @Override // b.e.d.d.f.a
        public void d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f588a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f589b & 2) != 0);
            }
            y.this.n(this.f590c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(TextView textView) {
        this.f582a = textView;
        this.i = new a0(this.f582a);
    }

    private void A(int i, float f2) {
        this.i.y(i, f2);
    }

    private void B(Context context, w0 w0Var) {
        String n;
        Typeface create;
        Typeface typeface;
        this.j = w0Var.j(b.a.j.TextAppearance_android_textStyle, this.j);
        if (Build.VERSION.SDK_INT >= 28) {
            int j = w0Var.j(b.a.j.TextAppearance_android_textFontWeight, -1);
            this.k = j;
            if (j != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!w0Var.r(b.a.j.TextAppearance_android_fontFamily) && !w0Var.r(b.a.j.TextAppearance_fontFamily)) {
            if (w0Var.r(b.a.j.TextAppearance_android_typeface)) {
                this.m = false;
                int j2 = w0Var.j(b.a.j.TextAppearance_android_typeface, 1);
                if (j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i = w0Var.r(b.a.j.TextAppearance_fontFamily) ? b.a.j.TextAppearance_fontFamily : b.a.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface i4 = w0Var.i(i, this.j, new a(i2, i3, new WeakReference(this.f582a)));
                if (i4 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        i4 = Typeface.create(Typeface.create(i4, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = i4;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (n = w0Var.n(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            create = Typeface.create(n, this.j);
        } else {
            create = Typeface.create(Typeface.create(n, 0), this.k, (this.j & 2) != 0);
        }
        this.l = create;
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.f582a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i) {
        ColorStateList f2 = jVar.f(context, i);
        if (f2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f544d = true;
        u0Var.f541a = f2;
        return u0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f582a.getCompoundDrawablesRelative();
            TextView textView = this.f582a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f582a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f582a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f582a.getCompoundDrawables();
        TextView textView3 = this.f582a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        u0 u0Var = this.h;
        this.f583b = u0Var;
        this.f584c = u0Var;
        this.f585d = u0Var;
        this.f586e = u0Var;
        this.f587f = u0Var;
        this.g = u0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f583b != null || this.f584c != null || this.f585d != null || this.f586e != null) {
            Drawable[] compoundDrawables = this.f582a.getCompoundDrawables();
            a(compoundDrawables[0], this.f583b);
            a(compoundDrawables[1], this.f584c);
            a(compoundDrawables[2], this.f585d);
            a(compoundDrawables[3], this.f586e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f587f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f582a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f587f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f541a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f542b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        String str;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str2;
        ColorStateList colorStateList3;
        boolean z3;
        int i2;
        Context context = this.f582a.getContext();
        j b2 = j.b();
        w0 u = w0.u(context, attributeSet, b.a.j.AppCompatTextHelper, i, 0);
        TextView textView = this.f582a;
        b.e.j.r.H(textView, textView.getContext(), b.a.j.AppCompatTextHelper, attributeSet, u.q(), i, 0);
        int m = u.m(b.a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (u.r(b.a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f583b = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (u.r(b.a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f584c = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (u.r(b.a.j.AppCompatTextHelper_android_drawableRight)) {
            this.f585d = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (u.r(b.a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.f586e = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (u.r(b.a.j.AppCompatTextHelper_android_drawableStart)) {
                this.f587f = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (u.r(b.a.j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, b2, u.m(b.a.j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        u.v();
        boolean z4 = this.f582a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m != -1) {
            w0 s = w0.s(context, m, b.a.j.TextAppearance);
            if (z4 || !s.r(b.a.j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = s.a(b.a.j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            B(context, s);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList3 = s.r(b.a.j.TextAppearance_android_textColor) ? s.c(b.a.j.TextAppearance_android_textColor) : null;
                colorStateList = s.r(b.a.j.TextAppearance_android_textColorHint) ? s.c(b.a.j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = s.r(b.a.j.TextAppearance_android_textColorLink) ? s.c(b.a.j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList = null;
                colorStateList2 = null;
                colorStateList3 = null;
            }
            str2 = s.r(b.a.j.TextAppearance_textLocale) ? s.n(b.a.j.TextAppearance_textLocale) : null;
            str = (Build.VERSION.SDK_INT < 26 || !s.r(b.a.j.TextAppearance_fontVariationSettings)) ? null : s.n(b.a.j.TextAppearance_fontVariationSettings);
            s.v();
        } else {
            colorStateList = null;
            str = null;
            z = false;
            z2 = false;
            colorStateList2 = null;
            str2 = null;
            colorStateList3 = null;
        }
        w0 u2 = w0.u(context, attributeSet, b.a.j.TextAppearance, i, 0);
        if (z4 || !u2.r(b.a.j.TextAppearance_textAllCaps)) {
            z3 = z2;
        } else {
            z = u2.a(b.a.j.TextAppearance_textAllCaps, false);
            z3 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (u2.r(b.a.j.TextAppearance_android_textColor)) {
                colorStateList3 = u2.c(b.a.j.TextAppearance_android_textColor);
            }
            if (u2.r(b.a.j.TextAppearance_android_textColorHint)) {
                colorStateList = u2.c(b.a.j.TextAppearance_android_textColorHint);
            }
            if (u2.r(b.a.j.TextAppearance_android_textColorLink)) {
                colorStateList2 = u2.c(b.a.j.TextAppearance_android_textColorLink);
            }
        }
        if (u2.r(b.a.j.TextAppearance_textLocale)) {
            str2 = u2.n(b.a.j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && u2.r(b.a.j.TextAppearance_fontVariationSettings)) {
            str = u2.n(b.a.j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && u2.r(b.a.j.TextAppearance_android_textSize) && u2.e(b.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f582a.setTextSize(0, 0.0f);
        }
        B(context, u2);
        u2.v();
        if (colorStateList3 != null) {
            this.f582a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f582a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f582a.setLinkTextColor(colorStateList2);
        }
        if (!z4 && z3) {
            r(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f582a.setTypeface(typeface, this.j);
            } else {
                this.f582a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f582a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                this.f582a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i3 >= 21) {
                this.f582a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.i.t(attributeSet, i);
        if (androidx.core.widget.b.f676a && this.i.n() != 0) {
            int[] m2 = this.i.m();
            if (m2.length > 0) {
                if (this.f582a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f582a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.f582a.setAutoSizeTextTypeUniformWithPresetSizes(m2, 0);
                }
            }
        }
        w0 t = w0.t(context, attributeSet, b.a.j.AppCompatTextView);
        int m3 = t.m(b.a.j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable c2 = m3 != -1 ? b2.c(context, m3) : null;
        int m4 = t.m(b.a.j.AppCompatTextView_drawableTopCompat, -1);
        Drawable c3 = m4 != -1 ? b2.c(context, m4) : null;
        int m5 = t.m(b.a.j.AppCompatTextView_drawableRightCompat, -1);
        Drawable c4 = m5 != -1 ? b2.c(context, m5) : null;
        int m6 = t.m(b.a.j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable c5 = m6 != -1 ? b2.c(context, m6) : null;
        int m7 = t.m(b.a.j.AppCompatTextView_drawableStartCompat, -1);
        Drawable c6 = m7 != -1 ? b2.c(context, m7) : null;
        int m8 = t.m(b.a.j.AppCompatTextView_drawableEndCompat, -1);
        x(c2, c3, c4, c5, c6, m8 != -1 ? b2.c(context, m8) : null);
        if (t.r(b.a.j.AppCompatTextView_drawableTint)) {
            androidx.core.widget.i.f(this.f582a, t.c(b.a.j.AppCompatTextView_drawableTint));
        }
        if (t.r(b.a.j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            androidx.core.widget.i.g(this.f582a, e0.d(t.j(b.a.j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int e2 = t.e(b.a.j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int e3 = t.e(b.a.j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int e4 = t.e(b.a.j.AppCompatTextView_lineHeight, i2);
        t.v();
        if (e2 != i2) {
            androidx.core.widget.i.h(this.f582a, e2);
        }
        if (e3 != i2) {
            androidx.core.widget.i.i(this.f582a, e3);
        }
        if (e4 != i2) {
            androidx.core.widget.i.j(this.f582a, e4);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f676a) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i) {
        String n;
        ColorStateList c2;
        w0 s = w0.s(context, i, b.a.j.TextAppearance);
        if (s.r(b.a.j.TextAppearance_textAllCaps)) {
            r(s.a(b.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && s.r(b.a.j.TextAppearance_android_textColor) && (c2 = s.c(b.a.j.TextAppearance_android_textColor)) != null) {
            this.f582a.setTextColor(c2);
        }
        if (s.r(b.a.j.TextAppearance_android_textSize) && s.e(b.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.f582a.setTextSize(0, 0.0f);
        }
        B(context, s);
        if (Build.VERSION.SDK_INT >= 26 && s.r(b.a.j.TextAppearance_fontVariationSettings) && (n = s.n(b.a.j.TextAppearance_fontVariationSettings)) != null) {
            this.f582a.setFontVariationSettings(n);
        }
        s.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f582a.setTypeface(typeface, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z) {
        this.f582a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i, int i2, int i3, int i4) {
        this.i.u(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int[] iArr, int i) {
        this.i.v(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i) {
        this.i.w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f541a = colorStateList;
        u0Var.f544d = colorStateList != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f542b = mode;
        u0Var.f543c = mode != null;
        y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i, float f2) {
        if (androidx.core.widget.b.f676a || l()) {
            return;
        }
        A(i, f2);
    }
}
