package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f526a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f527b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f528c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f529d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f530e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f531f = new int[0];
    private static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a.j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList e2 = e(context, i);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(f527b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f2, true);
        return d(context, i, f2.getFloat());
    }

    public static int c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 t = w0.t(context, null, iArr);
        try {
            return t.b(0, 0);
        } finally {
            t.v();
        }
    }

    static int d(Context context, int i, float f2) {
        return b.e.e.a.d(c(context, i), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList e(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 t = w0.t(context, null, iArr);
        try {
            return t.c(0);
        } finally {
            t.v();
        }
    }

    private static TypedValue f() {
        TypedValue typedValue = f526a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f526a.set(typedValue2);
        return typedValue2;
    }
}
