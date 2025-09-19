package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0 {
    private static final RectF l = new RectF();
    private static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f388a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f389b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f390c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f391d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f392e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f393f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;
    private final c k;

    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.a0.a, androidx.appcompat.widget.a0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.a0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) a0.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.k = i >= 29 ? new b() : i >= 23 ? new a() : new c();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f393f = c(iArr);
            B();
        }
    }

    private boolean B() {
        boolean z = this.f393f.length > 0;
        this.g = z;
        if (z) {
            this.f388a = 1;
            int[] iArr = this.f393f;
            this.f391d = iArr[0];
            this.f392e = iArr[r0 - 1];
            this.f390c = -1.0f;
        }
        return this.g;
    }

    private boolean C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        q(i);
        StaticLayout e2 = e(text, (Layout.Alignment) r(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e2.getLineCount() <= maxLines && e2.getLineEnd(e2.getLineCount() - 1) == text.length())) && ((float) e2.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.i instanceof k);
    }

    private void E(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f388a = 1;
        this.f391d = f2;
        this.f392e = f3;
        this.f390c = f4;
        this.g = false;
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field o = o(str);
            return o == null ? t : (T) o.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return t;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f388a = 0;
        this.f391d = -1.0f;
        this.f392e = -1.0f;
        this.f390c = -1.0f;
        this.f393f = new int[0];
        this.f389b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.k.a(obtain, this.i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.h, i, alignment, ((Float) a(this.i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.h, i, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f393f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 1;
        int i3 = 0;
        while (i2 <= i) {
            int i4 = (i2 + i) / 2;
            if (C(this.f393f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i2;
                i2 = i5;
            } else {
                i3 = i4 - 1;
                i = i3;
            }
        }
        return this.f393f[i3];
    }

    private static Field o(String str) {
        try {
            Field field = n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    private void x(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f389b = false;
                try {
                    Method p = p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f388a == 1) {
            if (!this.g || this.f393f.length == 0) {
                int floor = ((int) Math.floor((this.f392e - this.f391d) / this.f390c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f391d + (i * this.f390c));
                }
                this.f393f = c(iArr);
            }
            this.f389b = true;
        } else {
            this.f389b = false;
        }
        return this.f389b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (s()) {
            if (this.f389b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (l) {
                    l.setEmpty();
                    l.right = measuredWidth;
                    l.bottom = height;
                    float i = i(l);
                    if (i != this.i.getTextSize()) {
                        y(0, i);
                    }
                }
            }
            this.f389b = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? f(charSequence, alignment, i, i2) : i3 >= 16 ? h(charSequence, alignment, i) : g(charSequence, alignment, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f392e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f391d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.f390c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m() {
        return this.f393f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f388a;
    }

    void q(int i) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.f388a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, b.a.j.AppCompatTextView, i, 0);
        TextView textView = this.i;
        b.e.j.r.H(textView, textView.getContext(), b.a.j.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTextView_autoSizeTextType)) {
            this.f388a = obtainStyledAttributes.getInt(b.a.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(b.a.j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(b.a.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(b.a.j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(b.a.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(b.a.j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(b.a.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(b.a.j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.f388a = 0;
            return;
        }
        if (this.f388a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i, int i2, int i3, int i4) {
        if (D()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int[] iArr, int i) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f393f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i) {
        if (D()) {
            if (i == 0) {
                d();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i, float f2) {
        Context context = this.j;
        x(TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
