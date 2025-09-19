package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import d.a.c.a.b;
import d.a.c.c.a;
import io.flutter.embedding.android.m;
import io.flutter.embedding.engine.j.h;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.f;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
/* loaded from: classes.dex */
public class e extends SurfaceView implements d.a.c.a.b, f, a.c {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.f.a f2866b;

    /* renamed from: c, reason: collision with root package name */
    private final h f2867c;

    /* renamed from: d, reason: collision with root package name */
    private final l f2868d;

    /* renamed from: e, reason: collision with root package name */
    private final io.flutter.plugin.editing.d f2869e;

    /* renamed from: f, reason: collision with root package name */
    private final d.a.c.b.a f2870f;
    private final m g;
    private final io.flutter.embedding.android.b h;
    private io.flutter.view.c i;
    private final b j;
    private final AtomicLong k;
    private d l;

    /* loaded from: classes.dex */
    final class a implements f.a {

        /* renamed from: a, reason: collision with root package name */
        private final long f2871a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f2872b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2873c;

        /* renamed from: d, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f2874d = new C0084a();

        /* renamed from: io.flutter.view.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0084a implements SurfaceTexture.OnFrameAvailableListener {
            C0084a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (a.this.f2873c || e.this.l == null) {
                    return;
                }
                e.this.l.b();
                throw null;
            }
        }

        a(long j, SurfaceTexture surfaceTexture) {
            this.f2871a = j;
            this.f2872b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                c().setOnFrameAvailableListener(this.f2874d, new Handler());
            } else {
                c().setOnFrameAvailableListener(this.f2874d);
            }
        }

        @Override // io.flutter.view.f.a
        public void a() {
            if (this.f2873c) {
                return;
            }
            this.f2873c = true;
            c().setOnFrameAvailableListener(null);
            this.f2872b.release();
            e.this.l.b();
            throw null;
        }

        @Override // io.flutter.view.f.a
        public long b() {
            return this.f2871a;
        }

        @Override // io.flutter.view.f.a
        public SurfaceTexture c() {
            return this.f2872b.surfaceTexture();
        }
    }

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        float f2877a;

        /* renamed from: b, reason: collision with root package name */
        int f2878b;

        /* renamed from: c, reason: collision with root package name */
        int f2879c;

        /* renamed from: d, reason: collision with root package name */
        int f2880d;

        /* renamed from: e, reason: collision with root package name */
        int f2881e;

        /* renamed from: f, reason: collision with root package name */
        int f2882f;
        int g;
        int h;
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private c g() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return c.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? c.LEFT : c.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return c.BOTH;
            }
        }
        return c.NONE;
    }

    @TargetApi(20)
    private int h(WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        double systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        double d2 = height;
        Double.isNaN(d2);
        if (systemWindowInsetBottom < d2 * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private boolean i() {
        d dVar = this.l;
        if (dVar == null) {
            return false;
        }
        dVar.e();
        throw null;
    }

    private void j() {
        io.flutter.view.c cVar = this.i;
        if (cVar != null) {
            cVar.K();
            this.i = null;
        }
    }

    private void k() {
        l.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? l.b.dark : l.b.light;
        l.a a2 = this.f2868d.a();
        a2.c(getResources().getConfiguration().fontScale);
        a2.d(DateFormat.is24HourFormat(getContext()));
        a2.b(bVar);
        a2.a();
    }

    private void l() {
        if (i()) {
            this.l.b();
            throw null;
        }
    }

    @Override // d.a.c.a.b
    public void a(String str, ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
        if (i()) {
            this.l.a(str, byteBuffer, interfaceC0058b);
            throw null;
        }
        d.a.b.a("FlutterView", "FlutterView.send called on a detached view, channel=" + str);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f2869e.j(sparseArray);
    }

    @Override // io.flutter.view.f
    public f.a b() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        new a(this.k.getAndIncrement(), surfaceTexture);
        this.l.b();
        throw null;
    }

    @Override // d.a.c.a.b
    public void c(String str, b.a aVar) {
        this.l.c(str, aVar);
        throw null;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        this.l.d();
        throw null;
    }

    @Override // d.a.c.c.a.c
    @TargetApi(24)
    public PointerIcon d(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        d.a.b.b("FlutterView", "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (i() && this.g.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    void f() {
        if (!i()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        b bVar = this.j;
        bVar.f2880d = rect.top;
        bVar.f2881e = rect.right;
        bVar.f2882f = 0;
        bVar.g = rect.left;
        bVar.h = 0;
        bVar.i = 0;
        bVar.j = rect.bottom;
        bVar.k = 0;
        l();
        return true;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.i;
        if (cVar == null || !cVar.y()) {
            return null;
        }
        return this.i;
    }

    public Bitmap getBitmap() {
        f();
        this.l.b();
        throw null;
    }

    public io.flutter.embedding.engine.f.a getDartExecutor() {
        return this.f2866b;
    }

    float getDevicePixelRatio() {
        return this.j.f2877a;
    }

    public d getFlutterNativeView() {
        return this.l;
    }

    public io.flutter.app.a getPluginRegistry() {
        this.l.d();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.j.l = systemGestureInsets.top;
            this.j.m = systemGestureInsets.right;
            this.j.n = systemGestureInsets.bottom;
            this.j.o = systemGestureInsets.left;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (Build.VERSION.SDK_INT >= 30) {
            int navigationBars = z2 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            this.j.f2880d = insets.top;
            this.j.f2881e = insets.right;
            this.j.f2882f = insets.bottom;
            this.j.g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.j.h = insets2.top;
            this.j.i = insets2.right;
            this.j.j = insets2.bottom;
            this.j.k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.j.l = insets3.top;
            this.j.m = insets3.right;
            this.j.n = insets3.bottom;
            this.j.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                b bVar = this.j;
                bVar.f2880d = Math.max(Math.max(bVar.f2880d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                b bVar2 = this.j;
                bVar2.f2881e = Math.max(Math.max(bVar2.f2881e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                b bVar3 = this.j;
                bVar3.f2882f = Math.max(Math.max(bVar3.f2882f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                b bVar4 = this.j;
                bVar4.g = Math.max(Math.max(bVar4.g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            c cVar = c.NONE;
            if (!z2) {
                cVar = g();
            }
            this.j.f2880d = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.j.f2881e = (cVar == c.RIGHT || cVar == c.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.j.f2882f = (z2 && h(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.j.g = (cVar == c.LEFT || cVar == c.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            b bVar5 = this.j;
            bVar5.h = 0;
            bVar5.i = 0;
            bVar5.j = h(windowInsets);
            this.j.k = 0;
        }
        l();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPluginRegistry().b();
        throw null;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2870f.d(configuration);
        k();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f2869e.o(this, this.g, editorInfo);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (i() && this.h.d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !i() ? super.onHoverEvent(motionEvent) : this.i.E(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f2869e.z(viewStructure, i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        b bVar = this.j;
        bVar.f2878b = i;
        bVar.f2879c = i2;
        l();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.h.e(motionEvent);
    }

    public void setInitialRoute(String str) {
        this.f2867c.c(str);
    }
}
