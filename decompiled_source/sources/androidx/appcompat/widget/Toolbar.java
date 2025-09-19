package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private x0 J;
    private androidx.appcompat.widget.c K;
    private d L;
    private m.a M;
    private g.a N;
    private boolean O;
    private final Runnable P;

    /* renamed from: b, reason: collision with root package name */
    private ActionMenuView f361b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f362c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f363d;

    /* renamed from: e, reason: collision with root package name */
    private ImageButton f364e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f365f;
    private Drawable g;
    private CharSequence h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private o0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.m {

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f369b;

        /* renamed from: c, reason: collision with root package name */
        androidx.appcompat.view.menu.i f370c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void e(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f369b;
            if (gVar2 != null && (iVar = this.f370c) != null) {
                gVar2.f(iVar);
            }
            this.f369b = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.a.n.c) {
                ((b.a.n.c) callback).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f370c = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean h(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f370c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f124a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f372b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof b.a.n.c) {
                ((b.a.n.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(m.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean j(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void k(boolean z) {
            if (this.f370c != null) {
                androidx.appcompat.view.menu.g gVar = this.f369b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f369b.getItem(i) == this.f370c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                f(this.f369b, this.f370c);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0008a {

        /* renamed from: b, reason: collision with root package name */
        int f372b;

        public e(int i, int i2) {
            super(i, i2);
            this.f372b = 0;
            this.f124a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f372b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f372b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f372b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0008a c0008a) {
            super(c0008a);
            this.f372b = 0;
        }

        public e(e eVar) {
            super((a.C0008a) eVar);
            this.f372b = 0;
            this.f372b = eVar.f372b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends b.g.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f373d;

        /* renamed from: e, reason: collision with root package name */
        boolean f374e;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f373d = parcel.readInt();
            this.f374e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.g.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f373d);
            parcel.writeInt(this.f374e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        w0 u = w0.u(getContext(), attributeSet, b.a.j.Toolbar, i, 0);
        b.e.j.r.H(this, context, b.a.j.Toolbar, attributeSet, u.q(), i, 0);
        this.m = u.m(b.a.j.Toolbar_titleTextAppearance, 0);
        this.n = u.m(b.a.j.Toolbar_subtitleTextAppearance, 0);
        this.x = u.k(b.a.j.Toolbar_android_gravity, this.x);
        this.o = u.k(b.a.j.Toolbar_buttonGravity, 48);
        int d2 = u.d(b.a.j.Toolbar_titleMargin, 0);
        d2 = u.r(b.a.j.Toolbar_titleMargins) ? u.d(b.a.j.Toolbar_titleMargins, d2) : d2;
        this.t = d2;
        this.s = d2;
        this.r = d2;
        this.q = d2;
        int d3 = u.d(b.a.j.Toolbar_titleMarginStart, -1);
        if (d3 >= 0) {
            this.q = d3;
        }
        int d4 = u.d(b.a.j.Toolbar_titleMarginEnd, -1);
        if (d4 >= 0) {
            this.r = d4;
        }
        int d5 = u.d(b.a.j.Toolbar_titleMarginTop, -1);
        if (d5 >= 0) {
            this.s = d5;
        }
        int d6 = u.d(b.a.j.Toolbar_titleMarginBottom, -1);
        if (d6 >= 0) {
            this.t = d6;
        }
        this.p = u.e(b.a.j.Toolbar_maxButtonHeight, -1);
        int d7 = u.d(b.a.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d8 = u.d(b.a.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e2 = u.e(b.a.j.Toolbar_contentInsetLeft, 0);
        int e3 = u.e(b.a.j.Toolbar_contentInsetRight, 0);
        h();
        this.u.e(e2, e3);
        if (d7 != Integer.MIN_VALUE || d8 != Integer.MIN_VALUE) {
            this.u.g(d7, d8);
        }
        this.v = u.d(b.a.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = u.d(b.a.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = u.f(b.a.j.Toolbar_collapseIcon);
        this.h = u.o(b.a.j.Toolbar_collapseContentDescription);
        CharSequence o = u.o(b.a.j.Toolbar_title);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = u.o(b.a.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.k = getContext();
        setPopupTheme(u.m(b.a.j.Toolbar_popupTheme, 0));
        Drawable f2 = u.f(b.a.j.Toolbar_navigationIcon);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o3 = u.o(b.a.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable f3 = u.f(b.a.j.Toolbar_logo);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o4 = u.o(b.a.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        if (u.r(b.a.j.Toolbar_titleTextColor)) {
            setTitleTextColor(u.c(b.a.j.Toolbar_titleTextColor));
        }
        if (u.r(b.a.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(u.c(b.a.j.Toolbar_subtitleTextColor));
        }
        if (u.r(b.a.j.Toolbar_menu)) {
            x(u.m(b.a.j.Toolbar_menu, 0));
        }
        u.v();
    }

    private int B(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean M() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i) {
        boolean z = b.e.j.r.o(this) == 1;
        int childCount = getChildCount();
        int a2 = b.e.j.d.a(i, b.e.j.r.o(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f372b == 0 && N(childAt) && p(eVar.f124a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f372b == 0 && N(childAt2) && p(eVar2.f124a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f372b = 1;
        if (!z || this.j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new b.a.n.g(getContext());
    }

    private void h() {
        if (this.u == null) {
            this.u = new o0();
        }
    }

    private void i() {
        if (this.f365f == null) {
            this.f365f = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f361b.L() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f361b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f361b.setExpandedActionViewsExclusive(true);
            gVar.c(this.L, this.k);
        }
    }

    private void k() {
        if (this.f361b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f361b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f361b.setOnMenuItemClickListener(this.I);
            this.f361b.M(this.M, this.N);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f124a = 8388613 | (this.o & 112);
            this.f361b.setLayoutParams(generateDefaultLayoutParams);
            c(this.f361b, false);
        }
    }

    private void l() {
        if (this.f364e == null) {
            this.f364e = new m(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f124a = 8388611 | (this.o & 112);
            this.f364e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i) {
        int o = b.e.j.r.o(this);
        int a2 = b.e.j.d.a(i, o) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : o == 1 ? 5 : 3;
    }

    private int q(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = r(eVar.f124a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    private int r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return b.e.j.g.b(marginLayoutParams) + b.e.j.g.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f361b;
        return actionMenuView != null && actionMenuView.H();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f372b != 2 && childAt != this.f361b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void H(int i, int i2) {
        h();
        this.u.g(i, i2);
    }

    public void I(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f361b == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g L = this.f361b.L();
        if (L == gVar) {
            return;
        }
        if (L != null) {
            L.O(this.K);
            L.O(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.k);
            gVar.c(this.L, this.k);
        } else {
            cVar.e(this.k, null);
            this.L.e(this.k, null);
            cVar.k(true);
            this.L.k(true);
        }
        this.f361b.setPopupTheme(this.l);
        this.f361b.setPresenter(cVar);
        this.K = cVar;
    }

    public void J(m.a aVar, g.a aVar2) {
        this.M = aVar;
        this.N = aVar2;
        ActionMenuView actionMenuView = this.f361b;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void K(Context context, int i) {
        this.n = i;
        TextView textView = this.f363d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void L(Context context, int i) {
        this.m = i;
        TextView textView = this.f362c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f361b;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f361b) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.L;
        androidx.appcompat.view.menu.i iVar = dVar == null ? null : dVar.f370c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f361b;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.i == null) {
            m mVar = new m(getContext(), null, b.a.a.toolbarNavigationButtonStyle);
            this.i = mVar;
            mVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f124a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f372b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.u;
        if (o0Var != null) {
            return o0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g L;
        ActionMenuView actionMenuView = this.f361b;
        return actionMenuView != null && (L = actionMenuView.L()) != null && L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return b.e.j.r.o(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return b.e.j.r.o(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f365f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f365f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f361b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f364e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f364e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f361b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    final TextView getSubtitleTextView() {
        return this.f363d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    final TextView getTitleTextView() {
        return this.f362c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new x0(this, true);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0008a ? new e((a.C0008a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0299 A[LOOP:0: B:46:0x0297->B:47:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bb A[LOOP:1: B:50:0x02b9->B:51:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f4 A[LOOP:2: B:59:0x02f2->B:60:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.G;
        if (c1.b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (N(this.f364e)) {
            E(this.f364e, i, 0, i2, 0, this.p);
            i3 = this.f364e.getMeasuredWidth() + s(this.f364e);
            i4 = Math.max(0, this.f364e.getMeasuredHeight() + t(this.f364e));
            i5 = View.combineMeasuredStates(0, this.f364e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (N(this.i)) {
            E(this.i, i, 0, i2, 0, this.p);
            i3 = this.i.getMeasuredWidth() + s(this.i);
            i4 = Math.max(i4, this.i.getMeasuredHeight() + t(this.i));
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[c2] = Math.max(0, currentContentInsetStart - i3);
        if (N(this.f361b)) {
            E(this.f361b, i, max, i2, 0, this.p);
            i6 = this.f361b.getMeasuredWidth() + s(this.f361b);
            i4 = Math.max(i4, this.f361b.getMeasuredHeight() + t(this.f361b));
            i5 = View.combineMeasuredStates(i5, this.f361b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i6);
        if (N(this.j)) {
            max2 += D(this.j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.j.getMeasuredHeight() + t(this.j));
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        if (N(this.f365f)) {
            max2 += D(this.f365f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f365f.getMeasuredHeight() + t(this.f365f));
            i5 = View.combineMeasuredStates(i5, this.f365f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((e) childAt.getLayoutParams()).f372b == 0 && N(childAt)) {
                max2 += D(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.s + this.t;
        int i12 = this.q + this.r;
        if (N(this.f362c)) {
            D(this.f362c, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.f362c.getMeasuredWidth() + s(this.f362c);
            i9 = this.f362c.getMeasuredHeight() + t(this.f362c);
            i7 = View.combineMeasuredStates(i5, this.f362c.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (N(this.f363d)) {
            i8 = Math.max(i8, D(this.f363d, i, max2 + i12, i2, i9 + i11, iArr));
            i9 += this.f363d.getMeasuredHeight() + t(this.f363d);
            i7 = View.combineMeasuredStates(i7, this.f363d.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), M() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f361b;
        androidx.appcompat.view.menu.g L = actionMenuView != null ? actionMenuView.L() : null;
        int i = gVar.f373d;
        if (i != 0 && this.L != null && L != null && (findItem = L.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f374e) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        h();
        this.u.f(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (iVar = dVar.f370c) != null) {
            gVar.f373d = iVar.getItemId();
        }
        gVar.f374e = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(b.a.k.a.a.d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(b.a.k.a.a.d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f365f)) {
                c(this.f365f, true);
            }
        } else {
            ImageView imageView = this.f365f;
            if (imageView != null && y(imageView)) {
                removeView(this.f365f);
                this.F.remove(this.f365f);
            }
        }
        ImageView imageView2 = this.f365f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f365f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f364e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(b.a.k.a.a.d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f364e)) {
                c(this.f364e, true);
            }
        } else {
            ImageButton imageButton = this.f364e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f364e);
                this.F.remove(this.f364e);
            }
        }
        ImageButton imageButton2 = this.f364e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f364e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f361b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f363d;
            if (textView != null && y(textView)) {
                removeView(this.f363d);
                this.F.remove(this.f363d);
            }
        } else {
            if (this.f363d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f363d = zVar;
                zVar.setSingleLine();
                this.f363d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.f363d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f363d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f363d)) {
                c(this.f363d, true);
            }
        }
        TextView textView2 = this.f363d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f363d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f362c;
            if (textView != null && y(textView)) {
                removeView(this.f362c);
                this.F.remove(this.f362c);
            }
        } else {
            if (this.f362c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f362c = zVar;
                zVar.setSingleLine();
                this.f362c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f362c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f362c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f362c)) {
                c(this.f362c, true);
            }
        }
        TextView textView2 = this.f362c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f362c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f370c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f361b;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f361b;
        return actionMenuView != null && actionMenuView.G();
    }
}
