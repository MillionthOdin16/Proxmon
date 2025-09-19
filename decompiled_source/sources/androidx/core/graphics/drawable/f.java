package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f654a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f655b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f656c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.f656c = null;
        this.f657d = d.h;
        if (fVar != null) {
            this.f654a = fVar.f654a;
            this.f655b = fVar.f655b;
            this.f656c = fVar.f656c;
            this.f657d = fVar.f657d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f655b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f654a;
        Drawable.ConstantState constantState = this.f655b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
