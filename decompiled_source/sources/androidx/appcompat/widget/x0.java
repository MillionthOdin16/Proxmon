package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class x0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f571a;

    /* renamed from: b, reason: collision with root package name */
    private int f572b;

    /* renamed from: c, reason: collision with root package name */
    private View f573c;

    /* renamed from: d, reason: collision with root package name */
    private View f574d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f575e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f576f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f577b;

        a() {
            this.f577b = new androidx.appcompat.view.menu.a(x0.this.f571a.getContext(), 0, R.id.home, 0, 0, x0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.l;
            if (callback == null || !x0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f577b);
        }
    }

    /* loaded from: classes.dex */
    class b extends b.e.j.x {

        /* renamed from: a, reason: collision with root package name */
        private boolean f579a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f580b;

        b(int i) {
            this.f580b = i;
        }

        @Override // b.e.j.w
        public void a(View view) {
            if (this.f579a) {
                return;
            }
            x0.this.f571a.setVisibility(this.f580b);
        }

        @Override // b.e.j.x, b.e.j.w
        public void b(View view) {
            x0.this.f571a.setVisibility(0);
        }

        @Override // b.e.j.x, b.e.j.w
        public void c(View view) {
            this.f579a = true;
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, b.a.h.abc_action_bar_up_description, b.a.e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f571a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        w0 u = w0.u(toolbar.getContext(), null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        this.q = u.f(b.a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence o = u.o(b.a.j.ActionBar_title);
            if (!TextUtils.isEmpty(o)) {
                setTitle(o);
            }
            CharSequence o2 = u.o(b.a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(o2)) {
                H(o2);
            }
            Drawable f2 = u.f(b.a.j.ActionBar_logo);
            if (f2 != null) {
                D(f2);
            }
            Drawable f3 = u.f(b.a.j.ActionBar_icon);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                G(drawable);
            }
            z(u.j(b.a.j.ActionBar_displayOptions, 0));
            int m = u.m(b.a.j.ActionBar_customNavigationLayout, 0);
            if (m != 0) {
                B(LayoutInflater.from(this.f571a.getContext()).inflate(m, (ViewGroup) this.f571a, false));
                z(this.f572b | 16);
            }
            int l = u.l(b.a.j.ActionBar_height, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f571a.getLayoutParams();
                layoutParams.height = l;
                this.f571a.setLayoutParams(layoutParams);
            }
            int d2 = u.d(b.a.j.ActionBar_contentInsetStart, -1);
            int d3 = u.d(b.a.j.ActionBar_contentInsetEnd, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.f571a.H(Math.max(d2, 0), Math.max(d3, 0));
            }
            int m2 = u.m(b.a.j.ActionBar_titleTextStyle, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.f571a;
                toolbar2.L(toolbar2.getContext(), m2);
            }
            int m3 = u.m(b.a.j.ActionBar_subtitleTextStyle, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.f571a;
                toolbar3.K(toolbar3.getContext(), m3);
            }
            int m4 = u.m(b.a.j.ActionBar_popupTheme, 0);
            if (m4 != 0) {
                this.f571a.setPopupTheme(m4);
            }
        } else {
            this.f572b = A();
        }
        u.v();
        C(i);
        this.k = this.f571a.getNavigationContentDescription();
        this.f571a.setNavigationOnClickListener(new a());
    }

    private int A() {
        if (this.f571a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f571a.getNavigationIcon();
        return 15;
    }

    private void I(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f572b & 8) != 0) {
            this.f571a.setTitle(charSequence);
        }
    }

    private void J() {
        if ((this.f572b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f571a.setNavigationContentDescription(this.p);
            } else {
                this.f571a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void K() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f572b & 4) != 0) {
            toolbar = this.f571a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f571a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void L() {
        Drawable drawable;
        int i = this.f572b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f576f) == null) {
            drawable = this.f575e;
        }
        this.f571a.setLogo(drawable);
    }

    public void B(View view) {
        View view2 = this.f574d;
        if (view2 != null && (this.f572b & 16) != 0) {
            this.f571a.removeView(view2);
        }
        this.f574d = view;
        if (view == null || (this.f572b & 16) == 0) {
            return;
        }
        this.f571a.addView(view);
    }

    public void C(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.f571a.getNavigationContentDescription())) {
            E(this.p);
        }
    }

    public void D(Drawable drawable) {
        this.f576f = drawable;
        L();
    }

    public void E(int i) {
        F(i == 0 ? null : d().getString(i));
    }

    public void F(CharSequence charSequence) {
        this.k = charSequence;
        J();
    }

    public void G(Drawable drawable) {
        this.g = drawable;
        K();
    }

    public void H(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f572b & 8) != 0) {
            this.f571a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f571a.getContext());
            this.n = cVar;
            cVar.p(b.a.f.action_menu_presenter);
        }
        this.n.i(aVar);
        this.f571a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.f571a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f571a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f571a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public Context d() {
        return this.f571a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f571a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f571a.O();
    }

    @Override // androidx.appcompat.widget.d0
    public void g() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f571a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h(Drawable drawable) {
        b.e.j.r.K(this.f571a, drawable);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean i() {
        return this.f571a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public void j() {
        this.f571a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public void k(m.a aVar, g.a aVar2) {
        this.f571a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public int l() {
        return this.f572b;
    }

    @Override // androidx.appcompat.widget.d0
    public void m(int i) {
        this.f571a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.d0
    public Menu n() {
        return this.f571a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public void o(int i) {
        D(i != 0 ? b.a.k.a.a.d(d(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void p(p0 p0Var) {
        View view = this.f573c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f571a;
            if (parent == toolbar) {
                toolbar.removeView(this.f573c);
            }
        }
        this.f573c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.f571a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f573c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f124a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup q() {
        return this.f571a;
    }

    @Override // androidx.appcompat.widget.d0
    public void r(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public int s() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i) {
        setIcon(i != 0 ? b.a.k.a.a.d(d(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f575e = drawable;
        L();
    }

    @Override // androidx.appcompat.widget.d0
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        I(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        I(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public int t() {
        return this.f571a.getVisibility();
    }

    @Override // androidx.appcompat.widget.d0
    public b.e.j.v u(int i, long j) {
        b.e.j.v b2 = b.e.j.r.b(this.f571a);
        b2.a(i == 0 ? 1.0f : 0.0f);
        b2.d(j);
        b2.f(new b(i));
        return b2;
    }

    @Override // androidx.appcompat.widget.d0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public boolean w() {
        return this.f571a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void y(boolean z) {
        this.f571a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.d0
    public void z(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f572b ^ i;
        this.f572b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    J();
                }
                K();
            }
            if ((i2 & 3) != 0) {
                L();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f571a.setTitle(this.i);
                    toolbar = this.f571a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f571a.setTitle((CharSequence) null);
                    toolbar = this.f571a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f574d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f571a.addView(view);
            } else {
                this.f571a.removeView(view);
            }
        }
    }
}
