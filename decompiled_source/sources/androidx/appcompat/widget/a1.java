package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f394a;

    /* renamed from: b, reason: collision with root package name */
    private final View f395b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f396c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f397d = new WindowManager.LayoutParams();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f398e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final int[] f399f = new int[2];
    private final int[] g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(Context context) {
        this.f394a = context;
        View inflate = LayoutInflater.from(context).inflate(b.a.g.abc_tooltip, (ViewGroup) null);
        this.f395b = inflate;
        this.f396c = (TextView) inflate.findViewById(b.a.f.message);
        this.f397d.setTitle(a1.class.getSimpleName());
        this.f397d.packageName = this.f394a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f397d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = b.a.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f394a.getResources().getDimensionPixelOffset(b.a.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f394a.getResources().getDimensionPixelOffset(b.a.d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f394a.getResources().getDimensionPixelOffset(z ? b.a.d.tooltip_y_offset_touch : b.a.d.tooltip_y_offset_non_touch);
        View b2 = b(view);
        if (b2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b2.getWindowVisibleDisplayFrame(this.f398e);
        Rect rect = this.f398e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f394a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f398e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b2.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f399f);
        int[] iArr = this.f399f;
        int i4 = iArr[0];
        int[] iArr2 = this.g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f395b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f395b.getMeasuredHeight();
        int[] iArr3 = this.f399f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f398e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f394a.getSystemService("window")).removeView(this.f395b);
        }
    }

    boolean d() {
        return this.f395b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f396c.setText(charSequence);
        a(view, i, i2, z, this.f397d);
        ((WindowManager) this.f394a.getSystemService("window")).addView(this.f395b, this.f397d);
    }
}
