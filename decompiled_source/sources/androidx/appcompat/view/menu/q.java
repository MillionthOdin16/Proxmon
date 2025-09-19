package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int w = b.a.g.abc_popup_menu_item_layout;

    /* renamed from: c, reason: collision with root package name */
    private final Context f301c;

    /* renamed from: d, reason: collision with root package name */
    private final g f302d;

    /* renamed from: e, reason: collision with root package name */
    private final f f303e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f304f;
    private final int g;
    private final int h;
    private final int i;
    final l0 j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private m.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private int u = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.c() || q.this.j.x()) {
                return;
            }
            View view = q.this.o;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.j.a();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f301c = context;
        this.f302d = gVar;
        this.f304f = z;
        this.f303e = new f(gVar, LayoutInflater.from(context), this.f304f, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new l0(this.f301c, null, this.h, this.i);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.G(this);
        this.j.H(this);
        this.j.F(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.z(view2);
        this.j.C(this.u);
        if (!this.s) {
            this.t = k.o(this.f303e, null, this.f301c, this.g);
            this.s = true;
        }
        this.j.B(this.t);
        this.j.E(2);
        this.j.D(n());
        this.j.a();
        ListView g = this.j.g();
        g.setOnKeyListener(this);
        if (this.v && this.f302d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f301c).inflate(b.a.g.abc_popup_menu_header_item_layout, (ViewGroup) g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f302d.x());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, null, false);
        }
        this.j.q(this.f303e);
        this.j.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f302d) {
            return;
        }
        dismiss();
        m.a aVar = this.p;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return !this.r && this.j.c();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (c()) {
            this.j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.j.g();
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f301c, rVar, this.o, this.f304f, this.h, this.i);
            lVar.j(this.p);
            lVar.g(k.x(rVar));
            lVar.i(this.m);
            this.m = null;
            this.f302d.e(false);
            int j = this.j.j();
            int l = this.j.l();
            if ((Gravity.getAbsoluteGravity(this.u, b.e.j.r.o(this.n)) & 7) == 5) {
                j += this.n.getWidth();
            }
            if (lVar.n(j, l)) {
                m.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(boolean z) {
        this.s = false;
        f fVar = this.f303e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.f302d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.n = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.f303e.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i) {
        this.j.i(i);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i) {
        this.j.p(i);
    }
}
