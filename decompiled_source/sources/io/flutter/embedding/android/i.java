package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes.dex */
public class i extends SurfaceView implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2398b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2399c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2400d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2401e;

    /* renamed from: f, reason: collision with root package name */
    private final SurfaceHolder.Callback f2402f;
    private final io.flutter.embedding.engine.renderer.b g;

    /* loaded from: classes.dex */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (i.this.f2400d) {
                i.this.j(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            i.this.f2399c = true;
            if (i.this.f2400d) {
                i.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            i.this.f2399c = false;
            if (i.this.f2400d) {
                i.this.l();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements io.flutter.embedding.engine.renderer.b {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            d.a.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            i.this.setAlpha(1.0f);
            if (i.this.f2401e != null) {
                i.this.f2401e.l(this);
            }
        }
    }

    private i(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f2399c = false;
        this.f2400d = false;
        this.f2402f = new a();
        this.g = new b();
        this.f2398b = z;
        m();
    }

    public i(Context context, boolean z) {
        this(context, null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i, int i2) {
        if (this.f2401e == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        d.a.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
        this.f2401e.q(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f2401e == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f2401e.o(getHolder().getSurface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        io.flutter.embedding.engine.renderer.a aVar = this.f2401e;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.p();
    }

    private void m() {
        if (this.f2398b) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f2402f);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        d.a.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f2401e != null) {
            d.a.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2401e.p();
            this.f2401e.l(this.g);
        }
        this.f2401e = aVar;
        this.f2400d = true;
        aVar.f(this.g);
        if (this.f2399c) {
            d.a.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f2401e == null) {
            d.a.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2401e = null;
            this.f2400d = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f2401e == null) {
            d.a.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d.a.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f2401e.l(this.g);
        this.f2401e = null;
        this.f2400d = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2401e;
    }
}
