package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class f extends Button implements b.e.j.q, androidx.core.widget.b, androidx.core.widget.k {

    /* renamed from: b, reason: collision with root package name */
    private final e f421b;

    /* renamed from: c, reason: collision with root package name */
    private final y f422c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f421b = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.f422c = yVar;
        yVar.m(attributeSet, i);
        this.f422c.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f421b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f676a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f422c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f676a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f422c;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f676a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f422c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f676a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f422c;
        return yVar != null ? yVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f676a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f422c;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    @Override // b.e.j.q
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f421b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.e.j.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f421b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f422c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f422c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f422c;
        if (yVar == null || androidx.core.widget.b.f676a || !yVar.l()) {
            return;
        }
        this.f422c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f676a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.s(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (androidx.core.widget.b.f676a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.t(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.core.widget.b.f676a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.u(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f421b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f421b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.m(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.r(z);
        }
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f421b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f421b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f422c.v(colorStateList);
        this.f422c.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f422c.w(mode);
        this.f422c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        if (androidx.core.widget.b.f676a) {
            super.setTextSize(i, f2);
            return;
        }
        y yVar = this.f422c;
        if (yVar != null) {
            yVar.z(i, f2);
        }
    }
}
