package b.e.j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC0037b f1186a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: b.e.j.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f1186a = null;
    }

    public void i(a aVar) {
    }

    public void j(InterfaceC0037b interfaceC0037b) {
        if (this.f1186a != null && interfaceC0037b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1186a = interfaceC0037b;
    }
}
