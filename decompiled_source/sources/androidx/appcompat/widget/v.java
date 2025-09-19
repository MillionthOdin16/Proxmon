package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f545d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f546e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f547f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(SeekBar seekBar) {
        super(seekBar);
        this.f547f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.f545d = seekBar;
    }

    private void f() {
        if (this.f546e != null) {
            if (this.h || this.i) {
                Drawable p = androidx.core.graphics.drawable.a.p(this.f546e.mutate());
                this.f546e = p;
                if (this.h) {
                    androidx.core.graphics.drawable.a.n(p, this.f547f);
                }
                if (this.i) {
                    androidx.core.graphics.drawable.a.o(this.f546e, this.g);
                }
                if (this.f546e.isStateful()) {
                    this.f546e.setState(this.f545d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        w0 u = w0.u(this.f545d.getContext(), attributeSet, b.a.j.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f545d;
        b.e.j.r.H(seekBar, seekBar.getContext(), b.a.j.AppCompatSeekBar, attributeSet, u.q(), i, 0);
        Drawable g = u.g(b.a.j.AppCompatSeekBar_android_thumb);
        if (g != null) {
            this.f545d.setThumb(g);
        }
        j(u.f(b.a.j.AppCompatSeekBar_tickMark));
        if (u.r(b.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.d(u.j(b.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (u.r(b.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f547f = u.c(b.a.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        u.v();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f546e != null) {
            int max = this.f545d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f546e.getIntrinsicWidth();
                int intrinsicHeight = this.f546e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f546e.setBounds(-i, -i2, i, i2);
                float width = ((this.f545d.getWidth() - this.f545d.getPaddingLeft()) - this.f545d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f545d.getPaddingLeft(), this.f545d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f546e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f546e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f545d.getDrawableState())) {
            this.f545d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f546e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f546e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f546e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f545d);
            androidx.core.graphics.drawable.a.l(drawable, b.e.j.r.o(this.f545d));
            if (drawable.isStateful()) {
                drawable.setState(this.f545d.getDrawableState());
            }
            f();
        }
        this.f545d.invalidate();
    }
}
