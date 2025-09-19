package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f516b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f517a;

    static {
        f516b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        w0 u = w0.u(context, attributeSet, b.a.j.PopupWindow, i, i2);
        if (u.r(b.a.j.PopupWindow_overlapAnchor)) {
            b(u.a(b.a.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(u.f(b.a.j.PopupWindow_android_popupBackground));
        u.v();
    }

    private void b(boolean z) {
        if (f516b) {
            this.f517a = z;
        } else {
            androidx.core.widget.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f516b && this.f517a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f516b && this.f517a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f516b && this.f517a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
