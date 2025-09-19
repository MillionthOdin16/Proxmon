package b.a.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import b.a.n.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: d, reason: collision with root package name */
    private Context f925d;

    /* renamed from: e, reason: collision with root package name */
    private ActionBarContextView f926e;

    /* renamed from: f, reason: collision with root package name */
    private b.a f927f;
    private WeakReference<View> g;
    private boolean h;
    private androidx.appcompat.view.menu.g i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f925d = context;
        this.f926e = actionBarContextView;
        this.f927f = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.S(1);
        this.i = gVar;
        gVar.R(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f927f.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f926e.l();
    }

    @Override // b.a.n.b
    public void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f926e.sendAccessibilityEvent(32);
        this.f927f.d(this);
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
        return this.i;
    }

    @Override // b.a.n.b
    public MenuInflater f() {
        return new g(this.f926e.getContext());
    }

    @Override // b.a.n.b
    public CharSequence g() {
        return this.f926e.getSubtitle();
    }

    @Override // b.a.n.b
    public CharSequence i() {
        return this.f926e.getTitle();
    }

    @Override // b.a.n.b
    public void k() {
        this.f927f.a(this, this.i);
    }

    @Override // b.a.n.b
    public boolean l() {
        return this.f926e.j();
    }

    @Override // b.a.n.b
    public void m(View view) {
        this.f926e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // b.a.n.b
    public void n(int i) {
        o(this.f925d.getString(i));
    }

    @Override // b.a.n.b
    public void o(CharSequence charSequence) {
        this.f926e.setSubtitle(charSequence);
    }

    @Override // b.a.n.b
    public void q(int i) {
        r(this.f925d.getString(i));
    }

    @Override // b.a.n.b
    public void r(CharSequence charSequence) {
        this.f926e.setTitle(charSequence);
    }

    @Override // b.a.n.b
    public void s(boolean z) {
        super.s(z);
        this.f926e.setTitleOptional(z);
    }
}
