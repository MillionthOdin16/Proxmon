package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.e.d.d.f;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f566a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f567b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f568c;

    private w0(Context context, TypedArray typedArray) {
        this.f566a = context;
        this.f567b = typedArray;
    }

    public static w0 s(Context context, int i, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static w0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f567b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f567b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList c2;
        return (!this.f567b.hasValue(i) || (resourceId = this.f567b.getResourceId(i, 0)) == 0 || (c2 = b.a.k.a.a.c(this.f566a, resourceId)) == null) ? this.f567b.getColorStateList(i) : c2;
    }

    public int d(int i, int i2) {
        return this.f567b.getDimensionPixelOffset(i, i2);
    }

    public int e(int i, int i2) {
        return this.f567b.getDimensionPixelSize(i, i2);
    }

    public Drawable f(int i) {
        int resourceId;
        return (!this.f567b.hasValue(i) || (resourceId = this.f567b.getResourceId(i, 0)) == 0) ? this.f567b.getDrawable(i) : b.a.k.a.a.d(this.f566a, resourceId);
    }

    public Drawable g(int i) {
        int resourceId;
        if (!this.f567b.hasValue(i) || (resourceId = this.f567b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f566a, resourceId, true);
    }

    public float h(int i, float f2) {
        return this.f567b.getFloat(i, f2);
    }

    public Typeface i(int i, int i2, f.a aVar) {
        int resourceId = this.f567b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f568c == null) {
            this.f568c = new TypedValue();
        }
        return b.e.d.d.f.b(this.f566a, resourceId, this.f568c, i2, aVar);
    }

    public int j(int i, int i2) {
        return this.f567b.getInt(i, i2);
    }

    public int k(int i, int i2) {
        return this.f567b.getInteger(i, i2);
    }

    public int l(int i, int i2) {
        return this.f567b.getLayoutDimension(i, i2);
    }

    public int m(int i, int i2) {
        return this.f567b.getResourceId(i, i2);
    }

    public String n(int i) {
        return this.f567b.getString(i);
    }

    public CharSequence o(int i) {
        return this.f567b.getText(i);
    }

    public CharSequence[] p(int i) {
        return this.f567b.getTextArray(i);
    }

    public TypedArray q() {
        return this.f567b;
    }

    public boolean r(int i) {
        return this.f567b.hasValue(i);
    }

    public void v() {
        this.f567b.recycle();
    }
}
