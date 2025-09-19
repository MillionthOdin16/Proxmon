package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j0 implements androidx.appcompat.view.menu.p {
    private static Method G;
    private static Method H;
    private static Method I;
    private final b A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* renamed from: b, reason: collision with root package name */
    private Context f464b;

    /* renamed from: c, reason: collision with root package name */
    private ListAdapter f465c;

    /* renamed from: d, reason: collision with root package name */
    f0 f466d;

    /* renamed from: e, reason: collision with root package name */
    private int f467e;

    /* renamed from: f, reason: collision with root package name */
    private int f468f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    int p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    final f x;
    private final e y;
    private final d z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            f0 f0Var;
            if (i == -1 || (f0Var = j0.this.f466d) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.f();
        }
    }

    /* loaded from: classes.dex */
    private class c extends DataSetObserver {
        c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.c()) {
                j0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {
        d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || j0.this.w() || j0.this.F.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.B.removeCallbacks(j0Var.x);
            j0.this.x.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.F.getWidth() && y >= 0 && y < j0.this.F.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.B.postDelayed(j0Var.x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j0 j0Var2 = j0.this;
            j0Var2.B.removeCallbacks(j0Var2.x);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f466d;
            if (f0Var == null || !b.e.j.r.v(f0Var) || j0.this.f466d.getCount() <= j0.this.f466d.getChildCount()) {
                return;
            }
            int childCount = j0.this.f466d.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.p) {
                j0Var.F.setInputMethodMode(2);
                j0.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f467e = -2;
        this.f468f = -2;
        this.i = 1002;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new f();
        this.y = new e();
        this.z = new d();
        this.A = new b();
        this.C = new Rect();
        this.f464b = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.j.ListPopupWindow, i, i2);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(b.a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(b.a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.j = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i, i2);
        this.F = qVar;
        qVar.setInputMethodMode(1);
    }

    private void J(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            this.F.setIsClippedToScreen(z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.e():int");
    }

    private int u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.F.getMaxAvailableHeight(view, i, z);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i);
    }

    private void y() {
        View view = this.q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void A(int i) {
        this.F.setAnimationStyle(i);
    }

    public void B(int i) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            M(i);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f468f = rect.left + rect.right + i;
    }

    public void C(int i) {
        this.m = i;
    }

    public void D(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void E(int i) {
        this.F.setInputMethodMode(i);
    }

    public void F(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void I(boolean z) {
        this.l = true;
        this.k = z;
    }

    public void K(int i) {
        this.r = i;
    }

    public void L(int i) {
        f0 f0Var = this.f466d;
        if (!c() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i, true);
        }
    }

    public void M(int i) {
        this.f468f = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        int e2 = e();
        boolean w = w();
        androidx.core.widget.h.b(this.F, this.i);
        if (this.F.isShowing()) {
            if (b.e.j.r.v(t())) {
                int i = this.f468f;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = t().getWidth();
                }
                int i2 = this.f467e;
                if (i2 == -1) {
                    if (!w) {
                        e2 = -1;
                    }
                    if (w) {
                        this.F.setWidth(this.f468f == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f468f == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    e2 = i2;
                }
                this.F.setOutsideTouchable((this.o || this.n) ? false : true);
                this.F.update(t(), this.g, this.h, i < 0 ? -1 : i, e2 < 0 ? -1 : e2);
                return;
            }
            return;
        }
        int i3 = this.f468f;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = t().getWidth();
        }
        int i4 = this.f467e;
        if (i4 == -1) {
            e2 = -1;
        } else if (i4 != -2) {
            e2 = i4;
        }
        this.F.setWidth(i3);
        this.F.setHeight(e2);
        J(true);
        this.F.setOutsideTouchable((this.o || this.n) ? false : true);
        this.F.setTouchInterceptor(this.y);
        if (this.l) {
            androidx.core.widget.h.a(this.F, this.k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            this.F.setEpicenterBounds(this.D);
        }
        androidx.core.widget.h.c(this.F, t(), this.g, this.h, this.m);
        this.f466d.setSelection(-1);
        if (!this.E || this.f466d.isInTouchMode()) {
            f();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.A);
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return this.F.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.F.dismiss();
        y();
        this.F.setContentView(null);
        this.f466d = null;
        this.B.removeCallbacks(this.x);
    }

    public void f() {
        f0 f0Var = this.f466d;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.f466d;
    }

    public void h(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void i(int i) {
        this.g = i;
    }

    public int j() {
        return this.g;
    }

    public int l() {
        if (this.j) {
            return this.h;
        }
        return 0;
    }

    public Drawable m() {
        return this.F.getBackground();
    }

    public void p(int i) {
        this.h = i;
        this.j = true;
    }

    public void q(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new c();
        } else {
            ListAdapter listAdapter2 = this.f465c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f465c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        f0 f0Var = this.f466d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f465c);
        }
    }

    f0 s(Context context, boolean z) {
        return new f0(context, z);
    }

    public View t() {
        return this.t;
    }

    public int v() {
        return this.f468f;
    }

    public boolean w() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.E;
    }

    public void z(View view) {
        this.t = view;
    }
}
