package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import b.e.j.z;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, b.e.j.m, b.e.j.k, b.e.j.l {
    static final int[] G = {b.a.a.actionBarSize, R.attr.windowContentOverlay};
    private OverScroller A;
    ViewPropertyAnimator B;
    final AnimatorListenerAdapter C;
    private final Runnable D;
    private final Runnable E;
    private final b.e.j.n F;

    /* renamed from: b, reason: collision with root package name */
    private int f314b;

    /* renamed from: c, reason: collision with root package name */
    private int f315c;

    /* renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f316d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f317e;

    /* renamed from: f, reason: collision with root package name */
    private d0 f318f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private b.e.j.z v;
    private b.e.j.z w;
    private b.e.j.z x;
    private b.e.j.z y;
    private d z;

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.l = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f317e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f317e.animate().translationY(-ActionBarOverlayLayout.this.f317e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);

        void b();

        void c();

        void d(int i);

        void e();

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f315c = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        b.e.j.z zVar = b.e.j.z.f1229b;
        this.v = zVar;
        this.w = zVar;
        this.x = zVar;
        this.y = zVar;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        p(context);
        this.F = new b.e.j.n(this);
    }

    private void d() {
        o();
        this.E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 n(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f314b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.E, 600L);
    }

    private void s() {
        o();
        postDelayed(this.D, 600L);
    }

    private void u() {
        o();
        this.D.run();
    }

    private boolean v(float f2) {
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f317e.getHeight();
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, m.a aVar) {
        t();
        this.f318f.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean b() {
        t();
        return this.f318f.b();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean c() {
        t();
        return this.f318f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.g == null || this.h) {
            return;
        }
        int bottom = this.f317e.getVisibility() == 0 ? (int) (this.f317e.getBottom() + this.f317e.getTranslationY() + 0.5f) : 0;
        this.g.setBounds(0, bottom, getWidth(), this.g.getIntrinsicHeight() + bottom);
        this.g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        t();
        return this.f318f.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        t();
        return this.f318f.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        t();
        boolean h = h(this.f317e, rect, true, true, false, true);
        this.r.set(rect);
        c1.a(this, this.r, this.o);
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            h = true;
        }
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            h = true;
        }
        if (h) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public void g() {
        t();
        this.f318f.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f317e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f318f.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean i() {
        t();
        return this.f318f.i();
    }

    @Override // androidx.appcompat.widget.c0
    public void j(int i) {
        t();
        if (i == 2) {
            this.f318f.v();
        } else if (i == 5) {
            this.f318f.x();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void k() {
        t();
        this.f318f.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void o() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t();
        b.e.j.z m = b.e.j.z.m(windowInsets);
        boolean h = h(this.f317e, new Rect(m.e(), m.g(), m.f(), m.d()), true, true, false, true);
        b.e.j.r.d(this, m, this.o);
        Rect rect = this.o;
        b.e.j.z i = m.i(rect.left, rect.top, rect.right, rect.bottom);
        this.v = i;
        boolean z = true;
        if (!this.w.equals(i)) {
            this.w = this.v;
            h = true;
        }
        if (this.p.equals(this.o)) {
            z = h;
        } else {
            this.p.set(this.o);
        }
        if (z) {
            requestLayout();
        }
        return m.a().c().b().l();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        b.e.j.r.G(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        b.e.j.z a2;
        t();
        measureChildWithMargins(this.f317e, i, 0, i2, 0);
        e eVar = (e) this.f317e.getLayoutParams();
        int max = Math.max(0, this.f317e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f317e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f317e.getMeasuredState());
        boolean z = (b.e.j.r.s(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f314b;
            if (this.j && this.f317e.getTabContainer() != null) {
                measuredHeight += this.f314b;
            }
        } else {
            measuredHeight = this.f317e.getVisibility() != 8 ? this.f317e.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        if (Build.VERSION.SDK_INT >= 21) {
            this.x = this.v;
        } else {
            this.t.set(this.r);
        }
        if (!this.i && !z) {
            Rect rect = this.q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                a2 = this.x.i(0, measuredHeight, 0, 0);
                this.x = a2;
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            b.e.e.b a3 = b.e.e.b.a(this.x.e(), this.x.g() + measuredHeight, this.x.f(), this.x.d() + 0);
            z.a aVar = new z.a(this.x);
            aVar.c(a3);
            a2 = aVar.a();
            this.x = a2;
        } else {
            Rect rect2 = this.t;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        h(this.f316d, this.q, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.y.equals(this.x)) {
            b.e.j.z zVar = this.x;
            this.y = zVar;
            b.e.j.r.e(this.f316d, zVar);
        } else if (Build.VERSION.SDK_INT < 21 && !this.u.equals(this.t)) {
            this.u.set(this.t);
            this.f316d.a(this.t);
        }
        measureChildWithMargins(this.f316d, i, 0, i2, 0);
        e eVar2 = (e) this.f316d.getLayoutParams();
        int max3 = Math.max(max, this.f316d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f316d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f316d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        if (v(f3)) {
            d();
        } else {
            u();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // b.e.j.k
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.m + i2;
        this.m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // b.e.j.k
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // b.e.j.l
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.F.b(view, view2, i);
        this.m = getActionBarHideOffset();
        o();
        d dVar = this.z;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // b.e.j.k
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f317e.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // b.e.j.k
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, b.e.j.m
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f317e.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.z;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // b.e.j.k
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        t();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.z;
        if (dVar != null) {
            dVar.a(!z2);
            if (z || !z2) {
                this.z.b();
            } else {
                this.z.e();
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        b.e.j.r.G(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f315c = i;
        d dVar = this.z;
        if (dVar != null) {
            dVar.d(i);
        }
    }

    public boolean q() {
        return this.i;
    }

    public void setActionBarHideOffset(int i) {
        o();
        this.f317e.setTranslationY(-Math.max(0, Math.min(i, this.f317e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.z = dVar;
        if (getWindowToken() != null) {
            this.z.d(this.f315c);
            int i = this.n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                b.e.j.r.G(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (z) {
                return;
            }
            o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        t();
        this.f318f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f318f.setIcon(drawable);
    }

    public void setLogo(int i) {
        t();
        this.f318f.o(i);
    }

    public void setOverlayMode(boolean z) {
        this.i = z;
        this.h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f318f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f318f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        if (this.f316d == null) {
            this.f316d = (ContentFrameLayout) findViewById(b.a.f.action_bar_activity_content);
            this.f317e = (ActionBarContainer) findViewById(b.a.f.action_bar_container);
            this.f318f = n(findViewById(b.a.f.action_bar));
        }
    }
}
