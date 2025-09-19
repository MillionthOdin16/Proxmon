package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.x0;
import b.e.j.r;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    d0 f178a;

    /* renamed from: b, reason: collision with root package name */
    boolean f179b;

    /* renamed from: c, reason: collision with root package name */
    Window.Callback f180c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f181d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f182e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<a.b> f183f = new ArrayList<>();
    private final Runnable g = new a();
    private final Toolbar.f h = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.D();
        }
    }

    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f180c.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f186b;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f186b) {
                return;
            }
            this.f186b = true;
            k.this.f178a.j();
            Window.Callback callback = k.this.f180c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f186b = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = k.this.f180c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            k kVar = k.this;
            if (kVar.f180c != null) {
                if (kVar.f178a.c()) {
                    k.this.f180c.onPanelClosed(108, gVar);
                } else if (k.this.f180c.onPreparePanel(0, null, gVar)) {
                    k.this.f180c.onMenuOpened(108, gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private class e extends b.a.n.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(k.this.f178a.d()) : super.onCreatePanelView(i);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                k kVar = k.this;
                if (!kVar.f179b) {
                    kVar.f178a.g();
                    k.this.f179b = true;
                }
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f178a = new x0(toolbar, false);
        e eVar = new e(callback);
        this.f180c = eVar;
        this.f178a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f178a.setWindowTitle(charSequence);
    }

    private Menu B() {
        if (!this.f181d) {
            this.f178a.k(new c(), new d());
            this.f181d = true;
        }
        return this.f178a.n();
    }

    public Window.Callback C() {
        return this.f180c;
    }

    void D() {
        Menu B = B();
        androidx.appcompat.view.menu.g gVar = B instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) B : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            B.clear();
            if (!this.f180c.onCreatePanelMenu(0, B) || !this.f180c.onPreparePanel(0, null, B)) {
                B.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void E(int i, int i2) {
        this.f178a.z((i & i2) | ((i2 ^ (-1)) & this.f178a.l()));
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f178a.e();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (!this.f178a.w()) {
            return false;
        }
        this.f178a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.f182e) {
            return;
        }
        this.f182e = z;
        int size = this.f183f.size();
        for (int i = 0; i < size; i++) {
            this.f183f.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f178a.l();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f178a.d();
    }

    @Override // androidx.appcompat.app.a
    public void l() {
        this.f178a.m(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        this.f178a.q().removeCallbacks(this.g);
        r.E(this.f178a.q(), this.g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean n() {
        return this.f178a.t() == 0;
    }

    @Override // androidx.appcompat.app.a
    public void o(Configuration configuration) {
        super.o(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void p() {
        this.f178a.q().removeCallbacks(this.g);
    }

    @Override // androidx.appcompat.app.a
    public boolean q(int i, KeyEvent keyEvent) {
        Menu B = B();
        if (B == null) {
            return false;
        }
        B.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return B.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean r(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            s();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean s() {
        return this.f178a.f();
    }

    @Override // androidx.appcompat.app.a
    public void t(Drawable drawable) {
        this.f178a.h(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
        E(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f178a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f178a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void z() {
        this.f178a.m(0);
    }
}
