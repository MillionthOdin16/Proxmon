package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.embedding.android.b;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private FlutterMutatorsStack f2659b;

    /* renamed from: c, reason: collision with root package name */
    private float f2660c;

    /* renamed from: d, reason: collision with root package name */
    private int f2661d;

    /* renamed from: e, reason: collision with root package name */
    private int f2662e;

    /* renamed from: f, reason: collision with root package name */
    private int f2663f;
    private int g;
    private final b h;
    ViewTreeObserver.OnGlobalFocusChangeListener i;

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0076a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f2664b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2665c;

        ViewTreeObserverOnGlobalFocusChangeListenerC0076a(a aVar, View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f2664b = onFocusChangeListener;
            this.f2665c = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f2664b;
            View view3 = this.f2665c;
            onFocusChangeListener.onFocusChange(view3, a.a(view3));
        }
    }

    public a(Context context, float f2, b bVar) {
        super(context, null);
        this.f2660c = f2;
        this.h = bVar;
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (view.hasFocus()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f2659b.getFinalMatrix());
        float f2 = this.f2660c;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f2661d, -this.f2662e);
        return matrix;
    }

    public void b(FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f2659b = flutterMutatorsStack;
        this.f2661d = i;
        this.f2662e = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.i) == null) {
            return;
        }
        this.i = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f2659b.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f2661d, -this.f2662e);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f2;
        if (this.h == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = this.f2661d;
            this.f2663f = i2;
            i = this.f2662e;
            this.g = i;
            f2 = i2;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f2663f, this.g);
                this.f2663f = this.f2661d;
                this.g = this.f2662e;
                return this.h.f(motionEvent, matrix);
            }
            f2 = this.f2661d;
            i = this.f2662e;
        }
        matrix.postTranslate(f2, i);
        return this.h.f(motionEvent, matrix);
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.i == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0076a viewTreeObserverOnGlobalFocusChangeListenerC0076a = new ViewTreeObserverOnGlobalFocusChangeListenerC0076a(this, onFocusChangeListener, this);
            this.i = viewTreeObserverOnGlobalFocusChangeListenerC0076a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0076a);
        }
    }
}
