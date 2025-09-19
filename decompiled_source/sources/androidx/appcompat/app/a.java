package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.n.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0008a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f124a;

        public C0008a(int i, int i2) {
            super(i, i2);
            this.f124a = 0;
            this.f124a = 8388627;
        }

        public C0008a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f124a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.ActionBarLayout);
            this.f124a = obtainStyledAttributes.getInt(b.a.j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0008a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f124a = 0;
        }

        public C0008a(C0008a c0008a) {
            super((ViewGroup.MarginLayoutParams) c0008a);
            this.f124a = 0;
            this.f124a = c0008a.f124a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public b.a.n.b A(b.a aVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z);

    public abstract int j();

    public abstract Context k();

    public abstract void l();

    public boolean m() {
        return false;
    }

    public abstract boolean n();

    public void o(Configuration configuration) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
    }

    public abstract boolean q(int i, KeyEvent keyEvent);

    public boolean r(KeyEvent keyEvent) {
        return false;
    }

    public boolean s() {
        return false;
    }

    public abstract void t(Drawable drawable);

    public abstract void u(boolean z);

    public abstract void v(boolean z);

    public abstract void w(boolean z);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public abstract void z();
}
