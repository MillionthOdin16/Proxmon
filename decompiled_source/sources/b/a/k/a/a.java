package b.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f891a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0019a>> f892b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f893c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.k.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0019a {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f894a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f895b;

        C0019a(ColorStateList colorStateList, Configuration configuration) {
            this.f894a = colorStateList;
            this.f895b = configuration;
        }
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f893c) {
            SparseArray<C0019a> sparseArray = f892b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f892b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0019a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i) {
        C0019a c0019a;
        synchronized (f893c) {
            SparseArray<C0019a> sparseArray = f892b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0019a = sparseArray.get(i)) != null) {
                if (c0019a.f895b.equals(context.getResources().getConfiguration())) {
                    return c0019a.f894a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b2 = b(context, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f2 = f(context, i);
        if (f2 == null) {
            return b.e.d.a.c(context, i);
        }
        a(context, i, f2);
        return f2;
    }

    public static Drawable d(Context context, int i) {
        return m0.h().j(context, i);
    }

    private static TypedValue e() {
        TypedValue typedValue = f891a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f891a.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i) {
        if (g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return b.e.d.d.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e2) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e2 = e();
        resources.getValue(i, e2, true);
        int i2 = e2.type;
        return i2 >= 28 && i2 <= 31;
    }
}
