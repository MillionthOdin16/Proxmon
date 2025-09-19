package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import b.a.n.b;
import b.e.j.r;
import b.e.j.v;
import b.e.j.w;
import b.e.j.x;
import b.e.j.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final y A;

    /* renamed from: a, reason: collision with root package name */
    Context f204a;

    /* renamed from: b, reason: collision with root package name */
    private Context f205b;

    /* renamed from: c, reason: collision with root package name */
    ActionBarOverlayLayout f206c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f207d;

    /* renamed from: e, reason: collision with root package name */
    d0 f208e;

    /* renamed from: f, reason: collision with root package name */
    ActionBarContextView f209f;
    View g;
    p0 h;
    private boolean i;
    d j;
    b.a.n.b k;
    b.a l;
    private boolean m;
    private ArrayList<a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    b.a.n.h v;
    private boolean w;
    boolean x;
    final w y;
    final w z;

    /* loaded from: classes.dex */
    class a extends x {
        a() {
        }

        @Override // b.e.j.w
        public void a(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.q && (view2 = nVar.g) != null) {
                view2.setTranslationY(0.0f);
                n.this.f207d.setTranslationY(0.0f);
            }
            n.this.f207d.setVisibility(8);
            n.this.f207d.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.v = null;
            nVar2.D();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f206c;
            if (actionBarOverlayLayout != null) {
                r.G(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends x {
        b() {
        }

        @Override // b.e.j.w
        public void a(View view) {
            n nVar = n.this;
            nVar.v = null;
            nVar.f207d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements y {
        c() {
        }

        @Override // b.e.j.y
        public void a(View view) {
            ((View) n.this.f207d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends b.a.n.b implements g.a {

        /* renamed from: d, reason: collision with root package name */
        private final Context f213d;

        /* renamed from: e, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f214e;

        /* renamed from: f, reason: collision with root package name */
        private b.a f215f;
        private WeakReference<View> g;

        public d(Context context, b.a aVar) {
            this.f213d = context;
            this.f215f = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.S(1);
            this.f214e = gVar;
            gVar.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f215f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f215f == null) {
                return;
            }
            k();
            n.this.f209f.l();
        }

        @Override // b.a.n.b
        public void c() {
            n nVar = n.this;
            if (nVar.j != this) {
                return;
            }
            if (n.C(nVar.r, nVar.s, false)) {
                this.f215f.d(this);
            } else {
                n nVar2 = n.this;
                nVar2.k = this;
                nVar2.l = this.f215f;
            }
            this.f215f = null;
            n.this.B(false);
            n.this.f209f.g();
            n.this.f208e.q().sendAccessibilityEvent(32);
            n nVar3 = n.this;
            nVar3.f206c.setHideOnContentScrollEnabled(nVar3.x);
            n.this.j = null;
        }

        @Override // b.a.n.b
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // b.a.n.b
        public Menu e() {
            return this.f214e;
        }

        @Override // b.a.n.b
        public MenuInflater f() {
            return new b.a.n.g(this.f213d);
        }

        @Override // b.a.n.b
        public CharSequence g() {
            return n.this.f209f.getSubtitle();
        }

        @Override // b.a.n.b
        public CharSequence i() {
            return n.this.f209f.getTitle();
        }

        @Override // b.a.n.b
        public void k() {
            if (n.this.j != this) {
                return;
            }
            this.f214e.d0();
            try {
                this.f215f.a(this, this.f214e);
            } finally {
                this.f214e.c0();
            }
        }

        @Override // b.a.n.b
        public boolean l() {
            return n.this.f209f.j();
        }

        @Override // b.a.n.b
        public void m(View view) {
            n.this.f209f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // b.a.n.b
        public void n(int i) {
            o(n.this.f204a.getResources().getString(i));
        }

        @Override // b.a.n.b
        public void o(CharSequence charSequence) {
            n.this.f209f.setSubtitle(charSequence);
        }

        @Override // b.a.n.b
        public void q(int i) {
            r(n.this.f204a.getResources().getString(i));
        }

        @Override // b.a.n.b
        public void r(CharSequence charSequence) {
            n.this.f209f.setTitle(charSequence);
        }

        @Override // b.a.n.b
        public void s(boolean z) {
            super.s(z);
            n.this.f209f.setTitleOptional(z);
        }

        public boolean t() {
            this.f214e.d0();
            try {
                return this.f215f.c(this, this.f214e);
            } finally {
                this.f214e.c0();
            }
        }
    }

    public n(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        L(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public n(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        L(dialog.getWindow().getDecorView());
    }

    static boolean C(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 G(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void K() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f206c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            U(false);
        }
    }

    private void L(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b.a.f.decor_content_parent);
        this.f206c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f208e = G(view.findViewById(b.a.f.action_bar));
        this.f209f = (ActionBarContextView) view.findViewById(b.a.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b.a.f.action_bar_container);
        this.f207d = actionBarContainer;
        d0 d0Var = this.f208e;
        if (d0Var == null || this.f209f == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f204a = d0Var.d();
        boolean z = (this.f208e.l() & 4) != 0;
        if (z) {
            this.i = true;
        }
        b.a.n.a b2 = b.a.n.a.b(this.f204a);
        R(b2.a() || z);
        P(b2.g());
        TypedArray obtainStyledAttributes = this.f204a.obtainStyledAttributes(null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(b.a.j.ActionBar_hideOnContentScroll, false)) {
            Q(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            O(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void P(boolean z) {
        this.o = z;
        if (z) {
            this.f207d.setTabContainer(null);
            this.f208e.p(this.h);
        } else {
            this.f208e.p(null);
            this.f207d.setTabContainer(this.h);
        }
        boolean z2 = J() == 2;
        p0 p0Var = this.h;
        if (p0Var != null) {
            if (z2) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f206c;
                if (actionBarOverlayLayout != null) {
                    r.G(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f208e.y(!this.o && z2);
        this.f206c.setHasNonEmbeddedTabs(!this.o && z2);
    }

    private boolean S() {
        return r.w(this.f207d);
    }

    private void T() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f206c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        U(false);
    }

    private void U(boolean z) {
        if (C(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            F(z);
            return;
        }
        if (this.u) {
            this.u = false;
            E(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public b.a.n.b A(b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.c();
        }
        this.f206c.setHideOnContentScrollEnabled(false);
        this.f209f.k();
        d dVar2 = new d(this.f209f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.j = dVar2;
        dVar2.k();
        this.f209f.h(dVar2);
        B(true);
        this.f209f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void B(boolean z) {
        v u;
        v f2;
        if (z) {
            T();
        } else {
            K();
        }
        if (!S()) {
            if (z) {
                this.f208e.m(4);
                this.f209f.setVisibility(0);
                return;
            } else {
                this.f208e.m(0);
                this.f209f.setVisibility(8);
                return;
            }
        }
        if (z) {
            f2 = this.f208e.u(4, 100L);
            u = this.f209f.f(0, 200L);
        } else {
            u = this.f208e.u(0, 200L);
            f2 = this.f209f.f(8, 100L);
        }
        b.a.n.h hVar = new b.a.n.h();
        hVar.d(f2, u);
        hVar.h();
    }

    void D() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.d(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public void E(boolean z) {
        View view;
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.f207d.setAlpha(1.0f);
        this.f207d.setTransitioning(true);
        b.a.n.h hVar2 = new b.a.n.h();
        float f2 = -this.f207d.getHeight();
        if (z) {
            this.f207d.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        v b2 = r.b(this.f207d);
        b2.k(f2);
        b2.i(this.A);
        hVar2.c(b2);
        if (this.q && (view = this.g) != null) {
            v b3 = r.b(view);
            b3.k(f2);
            hVar2.c(b3);
        }
        hVar2.f(B);
        hVar2.e(250L);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void F(boolean z) {
        View view;
        View view2;
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f207d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.f207d.setTranslationY(0.0f);
            float f2 = -this.f207d.getHeight();
            if (z) {
                this.f207d.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f207d.setTranslationY(f2);
            b.a.n.h hVar2 = new b.a.n.h();
            v b2 = r.b(this.f207d);
            b2.k(0.0f);
            b2.i(this.A);
            hVar2.c(b2);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f2);
                v b3 = r.b(this.g);
                b3.k(0.0f);
                hVar2.c(b3);
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        } else {
            this.f207d.setAlpha(1.0f);
            this.f207d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f206c;
        if (actionBarOverlayLayout != null) {
            r.G(actionBarOverlayLayout);
        }
    }

    public int H() {
        return this.f207d.getHeight();
    }

    public int I() {
        return this.f206c.getActionBarHideOffset();
    }

    public int J() {
        return this.f208e.s();
    }

    public void M(boolean z) {
        N(z ? 4 : 0, 4);
    }

    public void N(int i, int i2) {
        int l = this.f208e.l();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.f208e.z((i & i2) | ((i2 ^ (-1)) & l));
    }

    public void O(float f2) {
        r.N(this.f207d, f2);
    }

    public void Q(boolean z) {
        if (z && !this.f206c.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.x = z;
        this.f206c.setHideOnContentScrollEnabled(z);
    }

    public void R(boolean z) {
        this.f208e.r(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.s) {
            this.s = false;
            U(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i) {
        this.p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.s) {
            return;
        }
        this.s = true;
        U(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        d0 d0Var = this.f208e;
        if (d0Var == null || !d0Var.w()) {
            return false;
        }
        this.f208e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f208e.l();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f205b == null) {
            TypedValue typedValue = new TypedValue();
            this.f204a.getTheme().resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f205b = new ContextThemeWrapper(this.f204a, i);
            } else {
                this.f205b = this.f204a;
            }
        }
        return this.f205b;
    }

    @Override // androidx.appcompat.app.a
    public void l() {
        if (this.r) {
            return;
        }
        this.r = true;
        U(false);
    }

    @Override // androidx.appcompat.app.a
    public boolean n() {
        int H = H();
        return this.u && (H == 0 || I() < H);
    }

    @Override // androidx.appcompat.app.a
    public void o(Configuration configuration) {
        P(b.a.n.a.b(this.f204a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean q(int i, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        e2.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void t(Drawable drawable) {
        this.f207d.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z) {
        if (this.i) {
            return;
        }
        M(z);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
        N(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z) {
        b.a.n.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f208e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f208e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void z() {
        if (this.r) {
            this.r = false;
            U(false);
        }
    }
}
