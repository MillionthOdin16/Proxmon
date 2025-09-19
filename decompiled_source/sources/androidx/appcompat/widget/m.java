package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class m extends ImageButton implements b.e.j.q, androidx.core.widget.l {

    /* renamed from: b, reason: collision with root package name */
    private final e f478b;

    /* renamed from: c, reason: collision with root package name */
    private final n f479c;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.imageButtonStyle);
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f478b = eVar;
        eVar.e(attributeSet, i);
        n nVar = new n(this);
        this.f479c = nVar;
        nVar.f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f478b;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // b.e.j.q
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f478b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.e.j.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f478b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f479c;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f479c;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f479c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f478b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f478b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f479c.g(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f478b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.e.j.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f478b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f479c;
        if (nVar != null) {
            nVar.i(mode);
        }
    }
}
