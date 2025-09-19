package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public interface d0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    boolean c();

    void collapseActionView();

    Context d();

    boolean e();

    boolean f();

    void g();

    CharSequence getTitle();

    void h(Drawable drawable);

    boolean i();

    void j();

    void k(m.a aVar, g.a aVar2);

    int l();

    void m(int i);

    Menu n();

    void o(int i);

    void p(p0 p0Var);

    ViewGroup q();

    void r(boolean z);

    int s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    b.e.j.v u(int i, long j);

    void v();

    boolean w();

    void x();

    void y(boolean z);

    void z(int i);
}
