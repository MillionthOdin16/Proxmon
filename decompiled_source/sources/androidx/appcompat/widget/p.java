package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public class p extends MultiAutoCompleteTextView implements b.e.j.q {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f499d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    private final e f500b;

    /* renamed from: c, reason: collision with root package name */
    private final y f501c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.autoCompleteTextViewStyle);
    }

    public p(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        r0.a(this, getContext());
        w0 u = w0.u(getContext(), attributeSet, f499d, i, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.f(0));
        }
        u.v();
        e eVar = new e(this);
        this.f500b = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.f501c = yVar;
        yVar.m(attributeSet, i);
        this.f501c.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f500b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f501c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // b.e.j.q
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f500b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.e.j.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f500b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f500b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f500b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.a.k.a.a.d(getContext(), i));
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f500b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f500b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f501c;
        if (yVar != null) {
            yVar.q(context, i);
        }
    }
}
