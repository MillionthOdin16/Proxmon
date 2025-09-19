package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f486a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f487b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f488c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f489d;

    public n(ImageView imageView) {
        this.f486a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f489d == null) {
            this.f489d = new u0();
        }
        u0 u0Var = this.f489d;
        u0Var.a();
        ColorStateList a2 = androidx.core.widget.e.a(this.f486a);
        if (a2 != null) {
            u0Var.f544d = true;
            u0Var.f541a = a2;
        }
        PorterDuff.Mode b2 = androidx.core.widget.e.b(this.f486a);
        if (b2 != null) {
            u0Var.f543c = true;
            u0Var.f542b = b2;
        }
        if (!u0Var.f544d && !u0Var.f543c) {
            return false;
        }
        j.i(drawable, u0Var, this.f486a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f487b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.f486a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f488c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.f486a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f487b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.f486a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        u0 u0Var = this.f488c;
        if (u0Var != null) {
            return u0Var.f541a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        u0 u0Var = this.f488c;
        if (u0Var != null) {
            return u0Var.f542b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f486a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int m;
        w0 u = w0.u(this.f486a.getContext(), attributeSet, b.a.j.AppCompatImageView, i, 0);
        ImageView imageView = this.f486a;
        b.e.j.r.H(imageView, imageView.getContext(), b.a.j.AppCompatImageView, attributeSet, u.q(), i, 0);
        try {
            Drawable drawable = this.f486a.getDrawable();
            if (drawable == null && (m = u.m(b.a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b.a.k.a.a.d(this.f486a.getContext(), m)) != null) {
                this.f486a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (u.r(b.a.j.AppCompatImageView_tint)) {
                androidx.core.widget.e.c(this.f486a, u.c(b.a.j.AppCompatImageView_tint));
            }
            if (u.r(b.a.j.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.d(this.f486a, e0.d(u.j(b.a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = b.a.k.a.a.d(this.f486a.getContext(), i);
            if (d2 != null) {
                e0.b(d2);
            }
            this.f486a.setImageDrawable(d2);
        } else {
            this.f486a.setImageDrawable(null);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.f488c == null) {
            this.f488c = new u0();
        }
        u0 u0Var = this.f488c;
        u0Var.f541a = colorStateList;
        u0Var.f544d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.f488c == null) {
            this.f488c = new u0();
        }
        u0 u0Var = this.f488c;
        u0Var.f542b = mode;
        u0Var.f543c = true;
        b();
    }
}
