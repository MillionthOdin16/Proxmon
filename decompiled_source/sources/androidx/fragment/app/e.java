package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.s;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f708a;

    private e(g<?> gVar) {
        this.f708a = gVar;
    }

    public static e b(g<?> gVar) {
        b.e.i.d.c(gVar, "callbacks == null");
        return new e(gVar);
    }

    public void a(Fragment fragment) {
        g<?> gVar = this.f708a;
        gVar.f714f.k(gVar, gVar, fragment);
    }

    public void c() {
        this.f708a.f714f.t();
    }

    public void d(Configuration configuration) {
        this.f708a.f714f.u(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f708a.f714f.v(menuItem);
    }

    public void f() {
        this.f708a.f714f.w();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f708a.f714f.x(menu, menuInflater);
    }

    public void h() {
        this.f708a.f714f.y();
    }

    public void i() {
        this.f708a.f714f.A();
    }

    public void j(boolean z) {
        this.f708a.f714f.B(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f708a.f714f.Q(menuItem);
    }

    public void l(Menu menu) {
        this.f708a.f714f.R(menu);
    }

    public void m() {
        this.f708a.f714f.T();
    }

    public void n(boolean z) {
        this.f708a.f714f.U(z);
    }

    public boolean o(Menu menu) {
        return this.f708a.f714f.V(menu);
    }

    public void p() {
        this.f708a.f714f.X();
    }

    public void q() {
        this.f708a.f714f.Y();
    }

    public void r() {
        this.f708a.f714f.a0();
    }

    public boolean s() {
        return this.f708a.f714f.f0();
    }

    public Fragment t(String str) {
        return this.f708a.f714f.l0(str);
    }

    public h u() {
        return this.f708a.f714f;
    }

    public void v() {
        this.f708a.f714f.N0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f708a.f714f.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        g<?> gVar = this.f708a;
        if (!(gVar instanceof s)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        gVar.f714f.X0(parcelable);
    }

    public Parcelable y() {
        return this.f708a.f714f.Z0();
    }
}
