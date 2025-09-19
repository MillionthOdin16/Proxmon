package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.f;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(20)
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2756a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2757b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2758c;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f2759d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f2760e;

    /* renamed from: f, reason: collision with root package name */
    private VirtualDisplay f2761f;
    SingleViewPresentation g;
    private Surface h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Runnable f2763c;

        /* renamed from: io.flutter.plugin.platform.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0081a implements Runnable {
            RunnableC0081a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f2762b.postDelayed(aVar.f2763c, 128L);
            }
        }

        a(l lVar, View view, Runnable runnable) {
            this.f2762b = view;
            this.f2763c = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f2762b, new RunnableC0081a());
            this.f2762b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    @TargetApi(16)
    /* loaded from: classes.dex */
    static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final View f2765a;

        /* renamed from: b, reason: collision with root package name */
        Runnable f2766b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2765a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f2765a = view;
            this.f2766b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f2766b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f2766b = null;
            this.f2765a.post(new a());
        }
    }

    private l(Context context, d dVar, VirtualDisplay virtualDisplay, g gVar, Surface surface, f.a aVar, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        this.f2756a = context;
        this.f2757b = dVar;
        this.f2759d = aVar;
        this.f2760e = onFocusChangeListener;
        this.h = surface;
        this.f2761f = virtualDisplay;
        this.f2758c = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f2761f.getDisplay(), gVar, dVar, i, obj, onFocusChangeListener);
        this.g = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static l a(Context context, d dVar, g gVar, f.a aVar, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        aVar.c().setDefaultBufferSize(i, i2);
        Surface surface = new Surface(aVar.c());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new l(context, dVar, createVirtualDisplay, gVar, surface, aVar, onFocusChangeListener, i3, obj);
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void c() {
        f view = this.g.getView();
        this.g.cancel();
        this.g.detachState();
        view.dispose();
        this.f2761f.release();
        this.f2759d.a();
    }

    public View d() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view) {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().onFlutterViewAttached(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().onFlutterViewDetached();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().onInputConnectionLocked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().onInputConnectionUnlocked();
    }

    public void i(int i, int i2, Runnable runnable) {
        boolean isFocused = d().isFocused();
        SingleViewPresentation.e detachState = this.g.detachState();
        this.f2761f.setSurface(null);
        this.f2761f.release();
        this.f2759d.c().setDefaultBufferSize(i, i2);
        this.f2761f = ((DisplayManager) this.f2756a.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f2758c, this.h, 0);
        View d2 = d();
        d2.addOnAttachStateChangeListener(new a(this, d2, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f2756a, this.f2761f.getDisplay(), this.f2757b, detachState, this.f2760e, isFocused);
        singleViewPresentation.show();
        this.g.cancel();
        this.g = singleViewPresentation;
    }
}
