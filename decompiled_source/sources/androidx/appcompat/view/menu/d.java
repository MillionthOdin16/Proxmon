package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = b.a.g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c, reason: collision with root package name */
    private final Context f239c;

    /* renamed from: d, reason: collision with root package name */
    private final int f240d;

    /* renamed from: e, reason: collision with root package name */
    private final int f241e;

    /* renamed from: f, reason: collision with root package name */
    private final int f242f;
    private final boolean g;
    final Handler h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private m.a y;
    ViewTreeObserver z;
    private final List<g> i = new ArrayList();
    final List<C0010d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = D();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.c() || d.this.j.size() <= 0 || d.this.j.get(0).f250a.x()) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0010d> it = d.this.j.iterator();
            while (it.hasNext()) {
                it.next().f250a.a();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements k0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0010d f246b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f247c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f248d;

            a(C0010d c0010d, MenuItem menuItem, g gVar) {
                this.f246b = c0010d;
                this.f247c = menuItem;
                this.f248d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0010d c0010d = this.f246b;
                if (c0010d != null) {
                    d.this.B = true;
                    c0010d.f251b.e(false);
                    d.this.B = false;
                }
                if (this.f247c.isEnabled() && this.f247c.hasSubMenu()) {
                    this.f248d.L(this.f247c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void b(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f251b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            d.this.h.postAtTime(new a(i2 < d.this.j.size() ? d.this.j.get(i2) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void d(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010d {

        /* renamed from: a, reason: collision with root package name */
        public final l0 f250a;

        /* renamed from: b, reason: collision with root package name */
        public final g f251b;

        /* renamed from: c, reason: collision with root package name */
        public final int f252c;

        public C0010d(l0 l0Var, g gVar, int i) {
            this.f250a = l0Var;
            this.f251b = gVar;
            this.f252c = i;
        }

        public ListView a() {
            return this.f250a.g();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f239c = context;
        this.p = view;
        this.f241e = i;
        this.f242f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.f240d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private int A(g gVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.j.get(i).f251b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0010d c0010d, g gVar) {
        f fVar;
        int i;
        int firstVisiblePosition;
        MenuItem B = B(c0010d.f251b, gVar);
        if (B == null) {
            return null;
        }
        ListView a2 = c0010d.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (B == fVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return b.e.j.r.o(this.p) == 1 ? 0 : 1;
    }

    private int E(int i) {
        List<C0010d> list = this.j;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0010d c0010d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f239c);
        f fVar = new f(gVar, from, this.g, C);
        if (!c() && this.w) {
            fVar.d(true);
        } else if (c()) {
            fVar.d(k.x(gVar));
        }
        int o = k.o(fVar, null, this.f239c, this.f240d);
        l0 z = z();
        z.q(fVar);
        z.B(o);
        z.C(this.o);
        if (this.j.size() > 0) {
            List<C0010d> list = this.j;
            c0010d = list.get(list.size() - 1);
            view = C(c0010d, gVar);
        } else {
            c0010d = null;
            view = null;
        }
        if (view != null) {
            z.Q(false);
            z.N(null);
            int E = E(o);
            boolean z2 = E == 1;
            this.r = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z.z(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z2) {
                    o = view.getWidth();
                    i3 = i - o;
                }
                i3 = i + o;
            } else {
                if (z2) {
                    o = view.getWidth();
                    i3 = i + o;
                }
                i3 = i - o;
            }
            z.i(i3);
            z.I(true);
            z.p(i2);
        } else {
            if (this.s) {
                z.i(this.u);
            }
            if (this.t) {
                z.p(this.v);
            }
            z.D(n());
        }
        this.j.add(new C0010d(z, gVar, this.r));
        z.a();
        ListView g = z.g();
        g.setOnKeyListener(this);
        if (c0010d == null && this.x && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(b.a.g.abc_popup_menu_header_item_layout, (ViewGroup) g, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            g.addHeaderView(frameLayout, null, false);
            z.a();
        }
    }

    private l0 z() {
        l0 l0Var = new l0(this.f239c, null, this.f241e, this.f242f);
        l0Var.P(this.m);
        l0Var.H(this);
        l0Var.G(this);
        l0Var.z(this.p);
        l0Var.C(this.o);
        l0Var.F(true);
        l0Var.E(2);
        return l0Var;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (c()) {
            return;
        }
        Iterator<g> it = this.i.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        int A = A(gVar);
        if (A < 0) {
            return;
        }
        int i = A + 1;
        if (i < this.j.size()) {
            this.j.get(i).f251b.e(false);
        }
        C0010d remove = this.j.remove(A);
        remove.f251b.O(this);
        if (this.B) {
            remove.f250a.O(null);
            remove.f250a.A(0);
        }
        remove.f250a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f252c : D();
        if (size != 0) {
            if (z) {
                this.j.get(0).f251b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return this.j.size() > 0 && this.j.get(0).f250a.c();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0010d[] c0010dArr = (C0010d[]) this.j.toArray(new C0010d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0010d c0010d = c0010dArr[i];
                if (c0010d.f250a.c()) {
                    c0010d.f250a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(m.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean j(r rVar) {
        for (C0010d c0010d : this.j) {
            if (rVar == c0010d.f251b) {
                c0010d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(boolean z) {
        Iterator<C0010d> it = this.j.iterator();
        while (it.hasNext()) {
            k.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f239c);
        if (c()) {
            F(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0010d c0010d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0010d = null;
                break;
            }
            c0010d = this.j.get(i);
            if (!c0010d.f250a.c()) {
                break;
            } else {
                i++;
            }
        }
        if (c0010d != null) {
            c0010d.f251b.e(false);
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
        if (this.p != view) {
            this.p = view;
            this.o = b.e.j.d.a(this.n, b.e.j.r.o(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = b.e.j.d.a(i, b.e.j.r.o(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i) {
        this.t = true;
        this.v = i;
    }
}
