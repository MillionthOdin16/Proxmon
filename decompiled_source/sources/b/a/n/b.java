package b.a.n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    private Object f918b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f919c;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, MenuItem menuItem);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f918b;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f919c;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f918b = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.f919c = z;
    }
}
