package b.e.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<View> f1219a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f1220b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f1221c = null;

    /* renamed from: d, reason: collision with root package name */
    int f1222d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f1223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1224b;

        a(v vVar, w wVar, View view) {
            this.f1223a = wVar;
            this.f1224b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1223a.c(this.f1224b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1223a.a(this.f1224b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1223a.b(this.f1224b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f1225a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1226b;

        b(v vVar, y yVar, View view) {
            this.f1225a = yVar;
            this.f1226b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1225a.a(this.f1226b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements w {

        /* renamed from: a, reason: collision with root package name */
        v f1227a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1228b;

        c(v vVar) {
            this.f1227a = vVar;
        }

        @Override // b.e.j.w
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i = this.f1227a.f1222d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f1227a.f1222d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1228b) {
                v vVar = this.f1227a;
                Runnable runnable = vVar.f1221c;
                if (runnable != null) {
                    vVar.f1221c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                w wVar = tag instanceof w ? (w) tag : null;
                if (wVar != null) {
                    wVar.a(view);
                }
                this.f1228b = true;
            }
        }

        @Override // b.e.j.w
        public void b(View view) {
            this.f1228b = false;
            if (this.f1227a.f1222d > -1) {
                view.setLayerType(2, null);
            }
            v vVar = this.f1227a;
            Runnable runnable = vVar.f1220b;
            if (runnable != null) {
                vVar.f1220b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                wVar.b(view);
            }
        }

        @Override // b.e.j.w
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                wVar.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(View view) {
        this.f1219a = new WeakReference<>(view);
    }

    private void g(View view, w wVar) {
        if (wVar != null) {
            view.animate().setListener(new a(this, wVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public v a(float f2) {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f1219a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public v d(long j) {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public v e(Interpolator interpolator) {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public v f(w wVar) {
        View view = this.f1219a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, wVar);
                wVar = new c(this);
            }
            g(view, wVar);
        }
        return this;
    }

    public v h(long j) {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public v i(y yVar) {
        View view = this.f1219a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(yVar != null ? new b(this, yVar, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public v k(float f2) {
        View view = this.f1219a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
