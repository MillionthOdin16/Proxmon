package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f413a;

    /* renamed from: d, reason: collision with root package name */
    private u0 f416d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f417e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f418f;

    /* renamed from: c, reason: collision with root package name */
    private int f415c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f414b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.f413a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f418f == null) {
            this.f418f = new u0();
        }
        u0 u0Var = this.f418f;
        u0Var.a();
        ColorStateList l = b.e.j.r.l(this.f413a);
        if (l != null) {
            u0Var.f544d = true;
            u0Var.f541a = l;
        }
        PorterDuff.Mode m = b.e.j.r.m(this.f413a);
        if (m != null) {
            u0Var.f543c = true;
            u0Var.f542b = m;
        }
        if (!u0Var.f544d && !u0Var.f543c) {
            return false;
        }
        j.i(drawable, u0Var, this.f413a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f416d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f413a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.f417e;
            if (u0Var != null) {
                j.i(background, u0Var, this.f413a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f416d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.f413a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f417e;
        if (u0Var != null) {
            return u0Var.f541a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f417e;
        if (u0Var != null) {
            return u0Var.f542b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        w0 u = w0.u(this.f413a.getContext(), attributeSet, b.a.j.ViewBackgroundHelper, i, 0);
        View view = this.f413a;
        b.e.j.r.H(view, view.getContext(), b.a.j.ViewBackgroundHelper, attributeSet, u.q(), i, 0);
        try {
            if (u.r(b.a.j.ViewBackgroundHelper_android_background)) {
                this.f415c = u.m(b.a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList f2 = this.f414b.f(this.f413a.getContext(), this.f415c);
                if (f2 != null) {
                    h(f2);
                }
            }
            if (u.r(b.a.j.ViewBackgroundHelper_backgroundTint)) {
                b.e.j.r.L(this.f413a, u.c(b.a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(b.a.j.ViewBackgroundHelper_backgroundTintMode)) {
                b.e.j.r.M(this.f413a, e0.d(u.j(b.a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            u.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f415c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i) {
        this.f415c = i;
        j jVar = this.f414b;
        h(jVar != null ? jVar.f(this.f413a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f416d == null) {
                this.f416d = new u0();
            }
            u0 u0Var = this.f416d;
            u0Var.f541a = colorStateList;
            u0Var.f544d = true;
        } else {
            this.f416d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f417e == null) {
            this.f417e = new u0();
        }
        u0 u0Var = this.f417e;
        u0Var.f541a = colorStateList;
        u0Var.f544d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f417e == null) {
            this.f417e = new u0();
        }
        u0 u0Var = this.f417e;
        u0Var.f542b = mode;
        u0Var.f543c = true;
        b();
    }
}
