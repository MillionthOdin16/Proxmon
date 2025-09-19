package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import d.a.c.c.a;
import io.flutter.embedding.android.h;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.view.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c {

    /* renamed from: b, reason: collision with root package name */
    private i f2411b;

    /* renamed from: c, reason: collision with root package name */
    private j f2412c;

    /* renamed from: d, reason: collision with root package name */
    private h f2413d;

    /* renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.c f2414e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.c f2415f;
    private final Set<io.flutter.embedding.engine.renderer.b> g;
    private boolean h;
    private io.flutter.embedding.engine.b i;
    private final Set<d> j;
    private d.a.c.c.a k;
    private io.flutter.plugin.editing.d l;
    private d.a.c.b.a m;
    private m n;
    private io.flutter.embedding.android.b o;
    private io.flutter.view.c p;
    private final a.c q;
    private final c.k r;
    private final io.flutter.embedding.engine.renderer.b s;

    /* loaded from: classes.dex */
    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z, boolean z2) {
            k.this.v(z, z2);
        }
    }

    /* loaded from: classes.dex */
    class b implements io.flutter.embedding.engine.renderer.b {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
            k.this.h = false;
            Iterator it = k.this.g.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.b) it.next()).b();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            k.this.h = true;
            Iterator it = k.this.g.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.b) it.next()).e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements io.flutter.embedding.engine.renderer.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.renderer.a f2418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f2419b;

        c(io.flutter.embedding.engine.renderer.a aVar, Runnable runnable) {
            this.f2418a = aVar;
            this.f2419b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            this.f2418a.l(this);
            this.f2419b.run();
            if (k.this.f2414e instanceof h) {
                return;
            }
            k.this.f2413d.c();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(io.flutter.embedding.engine.b bVar);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.g = new HashSet();
        this.j = new HashSet();
        this.q = new a.c();
        this.r = new a();
        this.s = new b();
        this.f2411b = iVar;
        this.f2414e = iVar;
        r();
    }

    private k(Context context, AttributeSet attributeSet, j jVar) {
        super(context, attributeSet);
        this.g = new HashSet();
        this.j = new HashSet();
        this.q = new a.c();
        this.r = new a();
        this.s = new b();
        this.f2412c = jVar;
        this.f2414e = jVar;
        r();
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    public k(Context context, j jVar) {
        this(context, (AttributeSet) null, jVar);
    }

    private e l() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return e.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? e.LEFT : e.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return e.BOTH;
            }
        }
        return e.NONE;
    }

    @TargetApi(20)
    private int p(WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        double systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        double d2 = height;
        Double.isNaN(d2);
        if (systemWindowInsetBottom < d2 * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void r() {
        View view;
        d.a.b.e("FlutterView", "Initializing FlutterView");
        if (this.f2411b != null) {
            d.a.b.e("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f2411b;
        } else if (this.f2412c != null) {
            d.a.b.e("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f2412c;
        } else {
            d.a.b.e("FlutterView", "Internally using a FlutterImageView.");
            view = this.f2413d;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.i.q().i() && !z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    private void y() {
        if (!s()) {
            d.a.b.f("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.q.f2678a = getResources().getDisplayMetrics().density;
        this.q.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.i.q().n(this.q);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.l.j(sparseArray);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.b bVar = this.i;
        return bVar != null ? bVar.o().y(view) : super.checkInputConnectionProxy(view);
    }

    @Override // d.a.c.c.a.c
    @TargetApi(24)
    public PointerIcon d(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (s() && this.n.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        a.c cVar = this.q;
        cVar.f2681d = rect.top;
        cVar.f2682e = rect.right;
        cVar.f2683f = 0;
        cVar.g = rect.left;
        cVar.h = 0;
        cVar.i = 0;
        cVar.j = rect.bottom;
        cVar.k = 0;
        d.a.b.e("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.q.f2681d + ", Left: " + this.q.g + ", Right: " + this.q.f2682e + "\nKeyboard insets: Bottom: " + this.q.j + ", Left: " + this.q.k + ", Right: " + this.q.i);
        y();
        return true;
    }

    public boolean g() {
        h hVar = this.f2413d;
        if (hVar != null) {
            return hVar.d();
        }
        return false;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.p;
        if (cVar == null || !cVar.y()) {
            return null;
        }
        return this.p;
    }

    public io.flutter.embedding.engine.b getAttachedFlutterEngine() {
        return this.i;
    }

    public void h(d dVar) {
        this.j.add(dVar);
    }

    public void i(io.flutter.embedding.engine.renderer.b bVar) {
        this.g.add(bVar);
    }

    public void j(h hVar) {
        io.flutter.embedding.engine.b bVar = this.i;
        if (bVar != null) {
            hVar.a(bVar.q());
        }
    }

    public void k(io.flutter.embedding.engine.b bVar) {
        d.a.b.e("FlutterView", "Attaching to a FlutterEngine: " + bVar);
        if (s()) {
            if (bVar == this.i) {
                d.a.b.e("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                d.a.b.e("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                o();
            }
        }
        this.i = bVar;
        io.flutter.embedding.engine.renderer.a q = bVar.q();
        this.h = q.h();
        this.f2414e.a(q);
        q.f(this.s);
        if (Build.VERSION.SDK_INT >= 24) {
            this.k = new d.a.c.c.a(this, this.i.l());
        }
        this.l = new io.flutter.plugin.editing.d(this, this.i.u(), this.i.o());
        this.m = this.i.k();
        this.n = new m(this, this.l, new l[]{new l(bVar.i())});
        this.o = new io.flutter.embedding.android.b(this.i.q(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, bVar.f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.i.o());
        this.p = cVar;
        cVar.Q(this.r);
        v(this.p.y(), this.p.z());
        this.i.o().a(this.p);
        this.i.o().w(this.i.q());
        this.l.q().restartInput(this);
        x();
        this.m.d(getResources().getConfiguration());
        y();
        bVar.o().x(this);
        Iterator<d> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        if (this.h) {
            this.s.e();
        }
    }

    public void m() {
        this.f2414e.b();
        h hVar = this.f2413d;
        if (hVar == null) {
            h n = n();
            this.f2413d = n;
            addView(n);
        } else {
            hVar.h(getWidth(), getHeight());
        }
        this.f2415f = this.f2414e;
        h hVar2 = this.f2413d;
        this.f2414e = hVar2;
        io.flutter.embedding.engine.b bVar = this.i;
        if (bVar != null) {
            hVar2.a(bVar.q());
        }
    }

    public h n() {
        return new h(getContext(), getWidth(), getHeight(), h.b.background);
    }

    public void o() {
        d.a.b.e("FlutterView", "Detaching from a FlutterEngine: " + this.i);
        if (!s()) {
            d.a.b.e("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<d> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.i.o().D();
        this.i.o().b();
        this.p.K();
        this.p = null;
        this.l.q().restartInput(this);
        this.l.p();
        this.n.b();
        d.a.c.c.a aVar = this.k;
        if (aVar != null) {
            aVar.c();
        }
        io.flutter.embedding.engine.renderer.a q = this.i.q();
        this.h = false;
        q.l(this.s);
        q.p();
        q.m(false);
        this.f2414e.c();
        this.f2413d = null;
        this.f2415f = null;
        this.i = null;
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.q.l = systemGestureInsets.top;
            this.q.m = systemGestureInsets.right;
            this.q.n = systemGestureInsets.bottom;
            this.q.o = systemGestureInsets.left;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (Build.VERSION.SDK_INT >= 30) {
            int navigationBars = z2 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            this.q.f2681d = insets.top;
            this.q.f2682e = insets.right;
            this.q.f2683f = insets.bottom;
            this.q.g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.q.h = insets2.top;
            this.q.i = insets2.right;
            this.q.j = insets2.bottom;
            this.q.k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.q.l = insets3.top;
            this.q.m = insets3.right;
            this.q.n = insets3.bottom;
            this.q.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.c cVar = this.q;
                cVar.f2681d = Math.max(Math.max(cVar.f2681d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.c cVar2 = this.q;
                cVar2.f2682e = Math.max(Math.max(cVar2.f2682e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.c cVar3 = this.q;
                cVar3.f2683f = Math.max(Math.max(cVar3.f2683f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.c cVar4 = this.q;
                cVar4.g = Math.max(Math.max(cVar4.g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            e eVar = e.NONE;
            if (!z2) {
                eVar = l();
            }
            this.q.f2681d = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.q.f2682e = (eVar == e.RIGHT || eVar == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.q.f2683f = (z2 && p(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.q.g = (eVar == e.LEFT || eVar == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.c cVar5 = this.q;
            cVar5.h = 0;
            cVar5.i = 0;
            cVar5.j = p(windowInsets);
            this.q.k = 0;
        }
        d.a.b.e("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.q.f2681d + ", Left: " + this.q.g + ", Right: " + this.q.f2682e + "\nKeyboard insets: Bottom: " + this.q.j + ", Left: " + this.q.k + ", Right: " + this.q.i + "System Gesture Insets - Left: " + this.q.o + ", Top: " + this.q.l + ", Right: " + this.q.m + ", Bottom: " + this.q.j);
        y();
        return onApplyWindowInsets;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.i != null) {
            d.a.b.e("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.m.d(configuration);
            x();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !s() ? super.onCreateInputConnection(editorInfo) : this.l.o(this, this.n, editorInfo);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (s() && this.o.d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !s() ? super.onHoverEvent(motionEvent) : this.p.E(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.l.z(viewStructure, i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d.a.b.e("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        a.c cVar = this.q;
        cVar.f2679b = i;
        cVar.f2680c = i2;
        y();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!s()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.o.e(motionEvent);
    }

    public boolean q() {
        return this.h;
    }

    public boolean s() {
        io.flutter.embedding.engine.b bVar = this.i;
        return bVar != null && bVar.q() == this.f2414e.getAttachedRenderer();
    }

    public void t(d dVar) {
        this.j.remove(dVar);
    }

    public void u(io.flutter.embedding.engine.renderer.b bVar) {
        this.g.remove(bVar);
    }

    public void w(Runnable runnable) {
        h hVar = this.f2413d;
        if (hVar == null) {
            d.a.b.e("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.c cVar = this.f2415f;
        if (cVar == null) {
            d.a.b.e("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f2414e = cVar;
        this.f2415f = null;
        io.flutter.embedding.engine.b bVar = this.i;
        if (bVar == null) {
            hVar.c();
            runnable.run();
            return;
        }
        io.flutter.embedding.engine.renderer.a q = bVar.q();
        if (q == null) {
            this.f2413d.c();
            runnable.run();
        } else {
            this.f2414e.a(q);
            q.f(new c(q, runnable));
        }
    }

    void x() {
        l.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? l.b.dark : l.b.light;
        l.a a2 = this.i.s().a();
        a2.c(getResources().getConfiguration().fontScale);
        a2.d(DateFormat.is24HourFormat(getContext()));
        a2.b(bVar);
        a2.a();
    }
}
