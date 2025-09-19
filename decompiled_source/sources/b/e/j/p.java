package b.e.j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final View f1201b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f1202c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f1203d;

    private p(View view, Runnable runnable) {
        this.f1201b = view;
        this.f1202c = view.getViewTreeObserver();
        this.f1203d = runnable;
    }

    public static p a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
        return pVar;
    }

    public void b() {
        (this.f1202c.isAlive() ? this.f1202c : this.f1201b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1201b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1203d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1202c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
