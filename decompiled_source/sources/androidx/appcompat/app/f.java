package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import b.a.n.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    private static int f128b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static final b.d.b<WeakReference<f>> f129c = new b.d.b<>();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f130d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(f fVar) {
        synchronized (f130d) {
            z(fVar);
            f129c.add(new WeakReference<>(fVar));
        }
    }

    public static f g(Activity activity, e eVar) {
        return new g(activity, eVar);
    }

    public static f h(Dialog dialog, e eVar) {
        return new g(dialog, eVar);
    }

    public static int j() {
        return f128b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y(f fVar) {
        synchronized (f130d) {
            z(fVar);
        }
    }

    private static void z(f fVar) {
        synchronized (f130d) {
            Iterator<WeakReference<f>> it = f129c.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract boolean A(int i);

    public abstract void B(int i);

    public abstract void C(View view);

    public abstract void D(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void E(Toolbar toolbar);

    public void F(int i) {
    }

    public abstract void G(CharSequence charSequence);

    public abstract b.a.n.b H(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i);

    public abstract b k();

    public int l() {
        return -100;
    }

    public abstract MenuInflater m();

    public abstract a n();

    public abstract void o();

    public abstract void p();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();
}
