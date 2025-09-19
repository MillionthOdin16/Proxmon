package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.lifecycle.d;
import b.a.n.b;
import b.a.n.f;
import b.e.d.d.f;
import b.e.j.e;
import b.e.j.v;
import b.e.j.x;
import b.e.j.z;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends androidx.appcompat.app.f implements g.a, LayoutInflater.Factory2 {
    private static final b.d.g<String, Integer> b0 = new b.d.g<>();
    private static final boolean c0;
    private static final int[] d0;
    private static final boolean e0;
    private static final boolean f0;
    private static boolean g0;
    private boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean G;
    private t[] H;
    private t I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    boolean N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private m S;
    private m T;
    boolean U;
    int V;
    private final Runnable W;
    private boolean X;
    private Rect Y;
    private Rect Z;
    private androidx.appcompat.app.i a0;

    /* renamed from: e, reason: collision with root package name */
    final Object f131e;

    /* renamed from: f, reason: collision with root package name */
    final Context f132f;
    Window g;
    private k h;
    final androidx.appcompat.app.e i;
    androidx.appcompat.app.a j;
    MenuInflater k;
    private CharSequence l;
    private c0 m;
    private i n;
    private u o;
    b.a.n.b p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    v t;
    private boolean u;
    private boolean v;
    ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f133a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f133a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f133a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f133a.uncaughtException(thread, notFoundException);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.V & 1) != 0) {
                gVar.X(0);
            }
            g gVar2 = g.this;
            if ((gVar2.V & 4096) != 0) {
                gVar2.X(108);
            }
            g gVar3 = g.this;
            gVar3.U = false;
            gVar3.V = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b.e.j.o {
        c() {
        }

        @Override // b.e.j.o
        public z a(View view, z zVar) {
            int g = zVar.g();
            int N0 = g.this.N0(zVar, null);
            if (g != N0) {
                zVar = zVar.k(zVar.e(), N0, zVar.f(), zVar.d());
            }
            return b.e.j.r.B(view, zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = g.this.N0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* loaded from: classes.dex */
        class a extends x {
            a() {
            }

            @Override // b.e.j.w
            public void a(View view) {
                g.this.q.setAlpha(1.0f);
                g.this.t.f(null);
                g.this.t = null;
            }

            @Override // b.e.j.x, b.e.j.w
            public void b(View view) {
                g.this.q.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.r.showAtLocation(gVar.q, 55, 0, 0);
            g.this.Y();
            if (!g.this.G0()) {
                g.this.q.setAlpha(1.0f);
                g.this.q.setVisibility(0);
                return;
            }
            g.this.q.setAlpha(0.0f);
            g gVar2 = g.this;
            v b2 = b.e.j.r.b(gVar2.q);
            b2.a(1.0f);
            gVar2.t = b2;
            g.this.t.f(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0009g extends x {
        C0009g() {
        }

        @Override // b.e.j.w
        public void a(View view) {
            g.this.q.setAlpha(1.0f);
            g.this.t.f(null);
            g.this.t = null;
        }

        @Override // b.e.j.x, b.e.j.w
        public void b(View view) {
            g.this.q.setVisibility(0);
            g.this.q.sendAccessibilityEvent(32);
            if (g.this.q.getParent() instanceof View) {
                b.e.j.r.G((View) g.this.q.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    private class h implements androidx.appcompat.app.b {
        h(g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class i implements m.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            g.this.O(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback i0 = g.this.i0();
            if (i0 == null) {
                return true;
            }
            i0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f142a;

        /* loaded from: classes.dex */
        class a extends x {
            a() {
            }

            @Override // b.e.j.w
            public void a(View view) {
                g.this.q.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.q.getParent() instanceof View) {
                    b.e.j.r.G((View) g.this.q.getParent());
                }
                g.this.q.removeAllViews();
                g.this.t.f(null);
                g gVar2 = g.this;
                gVar2.t = null;
                b.e.j.r.G(gVar2.w);
            }
        }

        public j(b.a aVar) {
            this.f142a = aVar;
        }

        @Override // b.a.n.b.a
        public boolean a(b.a.n.b bVar, Menu menu) {
            b.e.j.r.G(g.this.w);
            return this.f142a.a(bVar, menu);
        }

        @Override // b.a.n.b.a
        public boolean b(b.a.n.b bVar, MenuItem menuItem) {
            return this.f142a.b(bVar, menuItem);
        }

        @Override // b.a.n.b.a
        public boolean c(b.a.n.b bVar, Menu menu) {
            return this.f142a.c(bVar, menu);
        }

        @Override // b.a.n.b.a
        public void d(b.a.n.b bVar) {
            this.f142a.d(bVar);
            g gVar = g.this;
            if (gVar.r != null) {
                gVar.g.getDecorView().removeCallbacks(g.this.s);
            }
            g gVar2 = g.this;
            if (gVar2.q != null) {
                gVar2.Y();
                g gVar3 = g.this;
                v b2 = b.e.j.r.b(gVar3.q);
                b2.a(0.0f);
                gVar3.t = b2;
                g.this.t.f(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.e eVar = gVar4.i;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.p);
            }
            g gVar5 = g.this;
            gVar5.p = null;
            b.e.j.r.G(gVar5.w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends b.a.n.i {
        k(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f132f, callback);
            b.a.n.b H = g.this.H(aVar);
            if (H != null) {
                return aVar.e(H);
            }
            return null;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.u0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            g.this.x0(i);
            return true;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            g.this.y0(i);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            t g0 = g.this.g0(0, true);
            if (g0 == null || (gVar = g0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return g.this.p0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // b.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (g.this.p0() && i == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends m {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f146c;

        l(Context context) {
            super();
            this.f146c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.m
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.m
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f146c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.g.m
        public void d() {
            g.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class m {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f148a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                m.this.d();
            }
        }

        m() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f148a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f132f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f148a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f148a == null) {
                this.f148a = new a();
            }
            g.this.f132f.registerReceiver(this.f148a, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n extends m {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.m f151c;

        n(androidx.appcompat.app.m mVar) {
            super();
            this.f151c = mVar;
        }

        @Override // androidx.appcompat.app.g.m
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.m
        public int c() {
            return this.f151c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.m
        public void d() {
            g.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class q {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* loaded from: classes.dex */
    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Q(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(b.a.k.a.a.d(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class t {

        /* renamed from: a, reason: collision with root package name */
        int f153a;

        /* renamed from: b, reason: collision with root package name */
        int f154b;

        /* renamed from: c, reason: collision with root package name */
        int f155c;

        /* renamed from: d, reason: collision with root package name */
        int f156d;

        /* renamed from: e, reason: collision with root package name */
        int f157e;

        /* renamed from: f, reason: collision with root package name */
        int f158f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        t(int i) {
            this.f153a = i;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, b.a.g.abc_list_menu_item_layout);
                this.k = eVar;
                eVar.i(aVar);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(b.a.a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = b.a.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            b.a.n.d dVar = new b.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(b.a.j.AppCompatTheme);
            this.f154b = obtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_panelBackground, 0);
            this.f158f = obtainStyledAttributes.getResourceId(b.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class u implements m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z2 = D != gVar;
            g gVar2 = g.this;
            if (z2) {
                gVar = D;
            }
            t b0 = gVar2.b0(gVar);
            if (b0 != null) {
                if (!z2) {
                    g.this.R(b0, z);
                } else {
                    g.this.N(b0.f153a, b0, D);
                    g.this.R(b0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback i0;
            if (gVar != gVar.D()) {
                return true;
            }
            g gVar2 = g.this;
            if (!gVar2.B || (i0 = gVar2.i0()) == null || g.this.N) {
                return true;
            }
            i0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        c0 = Build.VERSION.SDK_INT < 21;
        d0 = new int[]{R.attr.windowBackground};
        e0 = !"robolectric".equals(Build.FINGERPRINT);
        f0 = Build.VERSION.SDK_INT >= 17;
        if (!c0 || g0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        g0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private g(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        Integer num;
        androidx.appcompat.app.d K0;
        this.t = null;
        this.u = true;
        this.O = -100;
        this.W = new b();
        this.f132f = context;
        this.i = eVar;
        this.f131e = obj;
        if (this.O == -100 && (obj instanceof Dialog) && (K0 = K0()) != null) {
            this.O = K0.getDelegate().l();
        }
        if (this.O == -100 && (num = b0.get(this.f131e.getClass().getName())) != null) {
            this.O = num.intValue();
            b0.remove(this.f131e.getClass().getName());
        }
        if (window != null) {
            L(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private void A0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.o || this.N) {
            return;
        }
        if (tVar.f153a == 0) {
            if ((this.f132f.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback i0 = i0();
        if (i0 != null && !i0.onMenuOpened(tVar.f153a, tVar.j)) {
            R(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f132f.getSystemService("window");
        if (windowManager != null && D0(tVar, keyEvent)) {
            if (tVar.g == null || tVar.q) {
                ViewGroup viewGroup = tVar.g;
                if (viewGroup == null) {
                    if (!l0(tVar) || tVar.g == null) {
                        return;
                    }
                } else if (tVar.q && viewGroup.getChildCount() > 0) {
                    tVar.g.removeAllViews();
                }
                if (!k0(tVar) || !tVar.b()) {
                    tVar.q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = tVar.h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                tVar.g.setBackgroundResource(tVar.f154b);
                ViewParent parent = tVar.h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(tVar.h);
                }
                tVar.g.addView(tVar.h, layoutParams2);
                if (!tVar.h.hasFocus()) {
                    tVar.h.requestFocus();
                }
            } else {
                View view = tVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    tVar.n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, tVar.f156d, tVar.f157e, 1002, 8519680, -3);
                    layoutParams3.gravity = tVar.f155c;
                    layoutParams3.windowAnimations = tVar.f158f;
                    windowManager.addView(tVar.g, layoutParams3);
                    tVar.o = true;
                }
            }
            i2 = -2;
            tVar.n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, tVar.f156d, tVar.f157e, 1002, 8519680, -3);
            layoutParams32.gravity = tVar.f155c;
            layoutParams32.windowAnimations = tVar.f158f;
            windowManager.addView(tVar.g, layoutParams32);
            tVar.o = true;
        }
    }

    private boolean C0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || D0(tVar, keyEvent)) && (gVar = tVar.j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.m == null) {
            R(tVar, true);
        }
        return z;
    }

    private boolean D0(t tVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.N) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.I;
        if (tVar2 != null && tVar2 != tVar) {
            R(tVar2, false);
        }
        Window.Callback i0 = i0();
        if (i0 != null) {
            tVar.i = i0.onCreatePanelView(tVar.f153a);
        }
        int i2 = tVar.f153a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.m) != null) {
            c0Var3.g();
        }
        if (tVar.i == null && (!z || !(B0() instanceof androidx.appcompat.app.k))) {
            if (tVar.j == null || tVar.r) {
                if (tVar.j == null && (!m0(tVar) || tVar.j == null)) {
                    return false;
                }
                if (z && this.m != null) {
                    if (this.n == null) {
                        this.n = new i();
                    }
                    this.m.a(tVar.j, this.n);
                }
                tVar.j.d0();
                if (!i0.onCreatePanelMenu(tVar.f153a, tVar.j)) {
                    tVar.c(null);
                    if (z && (c0Var = this.m) != null) {
                        c0Var.a(null, this.n);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.j.d0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.j.P(bundle);
                tVar.s = null;
            }
            if (!i0.onPreparePanel(0, tVar.i, tVar.j)) {
                if (z && (c0Var2 = this.m) != null) {
                    c0Var2.a(null, this.n);
                }
                tVar.j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.j.setQwertyMode(z2);
            tVar.j.c0();
        }
        tVar.m = true;
        tVar.n = false;
        this.I = tVar;
        return true;
    }

    private void E0(boolean z) {
        c0 c0Var = this.m;
        if (c0Var == null || !c0Var.i() || (ViewConfiguration.get(this.f132f).hasPermanentMenuKey() && !this.m.b())) {
            t g02 = g0(0, true);
            g02.q = true;
            R(g02, false);
            A0(g02, null);
            return;
        }
        Window.Callback i0 = i0();
        if (this.m.c() && z) {
            this.m.e();
            if (this.N) {
                return;
            }
            i0.onPanelClosed(108, g0(0, true).j);
            return;
        }
        if (i0 == null || this.N) {
            return;
        }
        if (this.U && (this.V & 1) != 0) {
            this.g.getDecorView().removeCallbacks(this.W);
            this.W.run();
        }
        t g03 = g0(0, true);
        androidx.appcompat.view.menu.g gVar = g03.j;
        if (gVar == null || g03.r || !i0.onPreparePanel(0, g03.i, gVar)) {
            return;
        }
        i0.onMenuOpened(108, g03.j);
        this.m.f();
    }

    private int F0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || b.e.j.r.v((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean J(boolean z) {
        if (this.N) {
            return false;
        }
        int M = M();
        boolean L0 = L0(q0(this.f132f, M), z);
        if (M == 0) {
            f0(this.f132f).e();
        } else {
            m mVar = this.S;
            if (mVar != null) {
                mVar.a();
            }
        }
        if (M == 3) {
            e0(this.f132f).e();
        } else {
            m mVar2 = this.T;
            if (mVar2 != null) {
                mVar2.a();
            }
        }
        return L0;
    }

    private void J0() {
        if (this.v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.w.findViewById(R.id.content);
        View decorView = this.g.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f132f.obtainStyledAttributes(b.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(b.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private androidx.appcompat.app.d K0() {
        for (Context context = this.f132f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void L(Window window) {
        if (this.g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        k kVar = new k(callback);
        this.h = kVar;
        window.setCallback(kVar);
        w0 t2 = w0.t(this.f132f, null, d0);
        Drawable g = t2.g(0);
        if (g != null) {
            window.setBackgroundDrawable(g);
        }
        t2.v();
        this.g = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f132f
            r1 = 0
            android.content.res.Configuration r0 = r6.S(r0, r7, r1)
            boolean r2 = r6.o0()
            android.content.Context r3 = r6.f132f
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.K
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.g.e0
            if (r8 != 0) goto L30
            boolean r8 = r6.L
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f131e
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f131e
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.l(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.M0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f131e
            boolean r0 = r8 instanceof androidx.appcompat.app.d
            if (r0 == 0) goto L5e
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.d) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.L0(int, boolean):boolean");
    }

    private int M() {
        int i2 = this.O;
        return i2 != -100 ? i2 : androidx.appcompat.app.f.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void M0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.f132f.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i3 = this.P;
        if (i3 != 0) {
            this.f132f.setTheme(i3);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f132f.getTheme().applyStyle(this.P, true);
            }
        }
        if (z) {
            Object obj = this.f131e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).getLifecycle().b().a(d.b.STARTED)) {
                        return;
                    }
                } else if (!this.M) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void O0(View view) {
        Context context;
        int i2;
        if ((b.e.j.r.s(view) & 8192) != 0) {
            context = this.f132f;
            i2 = b.a.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f132f;
            i2 = b.a.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(b.e.d.a.b(context, i2));
    }

    private void P() {
        m mVar = this.S;
        if (mVar != null) {
            mVar.a();
        }
        m mVar2 = this.T;
        if (mVar2 != null) {
            mVar2.a();
        }
    }

    private Configuration S(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup T() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f132f.obtainStyledAttributes(b.a.j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(b.a.j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowNoTitle, false)) {
            A(1);
        } else if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBar, false)) {
            A(108);
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
            A(109);
        }
        if (obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
            A(10);
        }
        this.E = obtainStyledAttributes.getBoolean(b.a.j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        a0();
        this.g.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f132f);
        if (this.F) {
            viewGroup = (ViewGroup) from.inflate(this.D ? b.a.g.abc_screen_simple_overlay_action_mode : b.a.g.abc_screen_simple, (ViewGroup) null);
        } else if (this.E) {
            viewGroup = (ViewGroup) from.inflate(b.a.g.abc_dialog_title_material, (ViewGroup) null);
            this.C = false;
            this.B = false;
        } else if (this.B) {
            TypedValue typedValue = new TypedValue();
            this.f132f.getTheme().resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.a.n.d(this.f132f, typedValue.resourceId) : this.f132f).inflate(b.a.g.abc_screen_toolbar, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(b.a.f.decor_content_parent);
            this.m = c0Var;
            c0Var.setWindowCallback(i0());
            if (this.C) {
                this.m.j(109);
            }
            if (this.z) {
                this.m.j(2);
            }
            if (this.A) {
                this.m.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.B + ", windowActionBarOverlay: " + this.C + ", android:windowIsFloating: " + this.E + ", windowActionModeOverlay: " + this.D + ", windowNoTitle: " + this.F + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            b.e.j.r.O(viewGroup, new c());
        } else if (viewGroup instanceof g0) {
            ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.m == null) {
            this.x = (TextView) viewGroup.findViewById(b.a.f.title);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b.a.f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.g.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void Z() {
        if (this.v) {
            return;
        }
        this.w = T();
        CharSequence h0 = h0();
        if (!TextUtils.isEmpty(h0)) {
            c0 c0Var = this.m;
            if (c0Var != null) {
                c0Var.setWindowTitle(h0);
            } else if (B0() != null) {
                B0().y(h0);
            } else {
                TextView textView = this.x;
                if (textView != null) {
                    textView.setText(h0);
                }
            }
        }
        K();
        z0(this.w);
        this.v = true;
        t g02 = g0(0, false);
        if (this.N) {
            return;
        }
        if (g02 == null || g02.j == null) {
            n0(108);
        }
    }

    private void a0() {
        if (this.g == null) {
            Object obj = this.f131e;
            if (obj instanceof Activity) {
                L(((Activity) obj).getWindow());
            }
        }
        if (this.g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                p.a(configuration, configuration2, configuration3);
            } else if (!b.e.i.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                q.a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                o.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private m e0(Context context) {
        if (this.T == null) {
            this.T = new l(context);
        }
        return this.T;
    }

    private m f0(Context context) {
        if (this.S == null) {
            this.S = new n(androidx.appcompat.app.m.a(context));
        }
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0() {
        /*
            r3 = this;
            r3.Z()
            boolean r0 = r3.B
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f131e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f131e
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.C
            r0.<init>(r1, r2)
        L1d:
            r3.j = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.n r0 = new androidx.appcompat.app.n
            java.lang.Object r1 = r3.f131e
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L37
            boolean r1 = r3.X
            r0.u(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.j0():void");
    }

    private boolean k0(t tVar) {
        View view = tVar.i;
        if (view != null) {
            tVar.h = view;
            return true;
        }
        if (tVar.j == null) {
            return false;
        }
        if (this.o == null) {
            this.o = new u();
        }
        View view2 = (View) tVar.a(this.o);
        tVar.h = view2;
        return view2 != null;
    }

    private boolean l0(t tVar) {
        tVar.d(d0());
        tVar.g = new s(tVar.l);
        tVar.f155c = 81;
        return true;
    }

    private boolean m0(t tVar) {
        Context context = this.f132f;
        int i2 = tVar.f153a;
        if ((i2 == 0 || i2 == 108) && this.m != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                b.a.n.d dVar = new b.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    private void n0(int i2) {
        this.V = (1 << i2) | this.V;
        if (this.U) {
            return;
        }
        b.e.j.r.E(this.g.getDecorView(), this.W);
        this.U = true;
    }

    private boolean o0() {
        if (!this.R && (this.f131e instanceof Activity)) {
            PackageManager packageManager = this.f132f.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f132f, this.f131e.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : Build.VERSION.SDK_INT >= 24 ? 786432 : 0);
                this.Q = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Q = false;
            }
        }
        this.R = true;
        return this.Q;
    }

    private boolean t0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t g02 = g0(i2, true);
        if (g02.o) {
            return false;
        }
        return D0(g02, keyEvent);
    }

    private boolean w0(int i2, KeyEvent keyEvent) {
        boolean z;
        c0 c0Var;
        if (this.p != null) {
            return false;
        }
        boolean z2 = true;
        t g02 = g0(i2, true);
        if (i2 != 0 || (c0Var = this.m) == null || !c0Var.i() || ViewConfiguration.get(this.f132f).hasPermanentMenuKey()) {
            if (g02.o || g02.n) {
                boolean z3 = g02.o;
                R(g02, true);
                z2 = z3;
            } else {
                if (g02.m) {
                    if (g02.r) {
                        g02.m = false;
                        z = D0(g02, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        A0(g02, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.m.c()) {
            z2 = this.m.e();
        } else {
            if (!this.N && D0(g02, keyEvent)) {
                z2 = this.m.f();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f132f.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.app.f
    public boolean A(int i2) {
        int F0 = F0(i2);
        if (this.F && F0 == 108) {
            return false;
        }
        if (this.B && F0 == 1) {
            this.B = false;
        }
        if (F0 == 1) {
            J0();
            this.F = true;
            return true;
        }
        if (F0 == 2) {
            J0();
            this.z = true;
            return true;
        }
        if (F0 == 5) {
            J0();
            this.A = true;
            return true;
        }
        if (F0 == 10) {
            J0();
            this.D = true;
            return true;
        }
        if (F0 == 108) {
            J0();
            this.B = true;
            return true;
        }
        if (F0 != 109) {
            return this.g.requestFeature(F0);
        }
        J0();
        this.C = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void B(int i2) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f132f).inflate(i2, viewGroup);
        this.h.a().onContentChanged();
    }

    final androidx.appcompat.app.a B0() {
        return this.j;
    }

    @Override // androidx.appcompat.app.f
    public void C(View view) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void D(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void E(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f131e instanceof Activity) {
            androidx.appcompat.app.a n2 = n();
            if (n2 instanceof androidx.appcompat.app.n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.k = null;
            if (n2 != null) {
                n2.p();
            }
            if (toolbar != null) {
                androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(toolbar, h0(), this.h);
                this.j = kVar;
                window = this.g;
                callback = kVar.C();
            } else {
                this.j = null;
                window = this.g;
                callback = this.h;
            }
            window.setCallback(callback);
            p();
        }
    }

    @Override // androidx.appcompat.app.f
    public void F(int i2) {
        this.P = i2;
    }

    @Override // androidx.appcompat.app.f
    public final void G(CharSequence charSequence) {
        this.l = charSequence;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        if (B0() != null) {
            B0().y(charSequence);
            return;
        }
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final boolean G0() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && b.e.j.r.w(viewGroup);
    }

    @Override // androidx.appcompat.app.f
    public b.a.n.b H(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        b.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
        }
        j jVar = new j(aVar);
        androidx.appcompat.app.a n2 = n();
        if (n2 != null) {
            b.a.n.b A = n2.A(jVar);
            this.p = A;
            if (A != null && (eVar = this.i) != null) {
                eVar.onSupportActionModeStarted(A);
            }
        }
        if (this.p == null) {
            this.p = I0(jVar);
        }
        return this.p;
    }

    public boolean I() {
        return J(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    b.a.n.b I0(b.a.n.b.a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.I0(b.a.n.b$a):b.a.n.b");
    }

    void N(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.H;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.j;
            }
        }
        if ((tVar == null || tVar.o) && !this.N) {
            this.h.a().onPanelClosed(i2, menu);
        }
    }

    final int N0(z zVar, Rect rect) {
        boolean z;
        boolean z2;
        int g = zVar != null ? zVar.g() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            if (this.q.isShown()) {
                if (this.Y == null) {
                    this.Y = new Rect();
                    this.Z = new Rect();
                }
                Rect rect2 = this.Y;
                Rect rect3 = this.Z;
                if (zVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(zVar.e(), zVar.g(), zVar.f(), zVar.d());
                }
                c1.a(this.w, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                z q2 = b.e.j.r.q(this.w);
                int e2 = q2 == null ? 0 : q2.e();
                int f2 = q2 == null ? 0 : q2.f();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.y != null) {
                    View view = this.y;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != e2 || marginLayoutParams2.rightMargin != f2) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = e2;
                            marginLayoutParams2.rightMargin = f2;
                            this.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f132f);
                    this.y = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = e2;
                    layoutParams.rightMargin = f2;
                    this.w.addView(this.y, -1, layoutParams);
                }
                r5 = this.y != null;
                if (r5 && this.y.getVisibility() != 0) {
                    O0(this.y);
                }
                if (!this.D && r5) {
                    g = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.q.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.y;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return g;
    }

    void O(androidx.appcompat.view.menu.g gVar) {
        if (this.G) {
            return;
        }
        this.G = true;
        this.m.k();
        Window.Callback i0 = i0();
        if (i0 != null && !this.N) {
            i0.onPanelClosed(108, gVar);
        }
        this.G = false;
    }

    void Q(int i2) {
        R(g0(i2, true), true);
    }

    void R(t tVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && tVar.f153a == 0 && (c0Var = this.m) != null && c0Var.c()) {
            O(tVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f132f.getSystemService("window");
        if (windowManager != null && tVar.o && (viewGroup = tVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                N(tVar.f153a, tVar, null);
            }
        }
        tVar.m = false;
        tVar.n = false;
        tVar.o = false;
        tVar.h = null;
        tVar.q = true;
        if (this.I == tVar) {
            this.I = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.i iVar;
        boolean z2 = false;
        if (this.a0 == null) {
            String string = this.f132f.obtainStyledAttributes(b.a.j.AppCompatTheme).getString(b.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                iVar = new androidx.appcompat.app.i();
            } else {
                try {
                    this.a0 = (androidx.appcompat.app.i) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    iVar = new androidx.appcompat.app.i();
                }
            }
            this.a0 = iVar;
        }
        if (c0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = H0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.a0.q(view, str, context, attributeSet, z, c0, true, b1.b());
    }

    void V() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.m;
        if (c0Var != null) {
            c0Var.k();
        }
        if (this.r != null) {
            this.g.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.r = null;
        }
        Y();
        t g02 = g0(0, false);
        if (g02 == null || (gVar = g02.j) == null) {
            return;
        }
        gVar.close();
    }

    boolean W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f131e;
        if (((obj instanceof e.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.g.getDecorView()) != null && b.e.j.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.h.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? s0(keyCode, keyEvent) : v0(keyCode, keyEvent);
    }

    void X(int i2) {
        t g02;
        t g03 = g0(i2, true);
        if (g03.j != null) {
            Bundle bundle = new Bundle();
            g03.j.Q(bundle);
            if (bundle.size() > 0) {
                g03.s = bundle;
            }
            g03.j.d0();
            g03.j.clear();
        }
        g03.r = true;
        g03.q = true;
        if ((i2 != 108 && i2 != 0) || this.m == null || (g02 = g0(0, false)) == null) {
            return;
        }
        g02.m = false;
        D0(g02, null);
    }

    void Y() {
        v vVar = this.t;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t b02;
        Window.Callback i0 = i0();
        if (i0 == null || this.N || (b02 = b0(gVar.D())) == null) {
            return false;
        }
        return i0.onMenuItemSelected(b02.f153a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        E0(true);
    }

    t b0(Menu menu) {
        t[] tVarArr = this.H;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ((ViewGroup) this.w.findViewById(R.id.content)).addView(view, layoutParams);
        this.h.a().onContentChanged();
    }

    final Context d0() {
        androidx.appcompat.app.a n2 = n();
        Context k2 = n2 != null ? n2.k() : null;
        return k2 == null ? this.f132f : k2;
    }

    @Override // androidx.appcompat.app.f
    public Context f(Context context) {
        this.K = true;
        int q0 = q0(context, M());
        if (f0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, S(context, q0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof b.a.n.d) {
            try {
                ((b.a.n.d) context).a(S(context, q0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!e0) {
            super.f(context);
            return context;
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration S = S(context, q0, configuration.equals(configuration2) ? null : c0(configuration, configuration2));
            b.a.n.d dVar = new b.a.n.d(context, b.a.i.Theme_AppCompat_Empty);
            dVar.a(S);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                f.b.a(dVar.getTheme());
            }
            super.f(dVar);
            return dVar;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    protected t g0(int i2, boolean z) {
        t[] tVarArr = this.H;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.H = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    final CharSequence h0() {
        Object obj = this.f131e;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.l;
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T i(int i2) {
        Z();
        return (T) this.g.findViewById(i2);
    }

    final Window.Callback i0() {
        return this.g.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public final androidx.appcompat.app.b k() {
        return new h(this);
    }

    @Override // androidx.appcompat.app.f
    public int l() {
        return this.O;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater m() {
        if (this.k == null) {
            j0();
            androidx.appcompat.app.a aVar = this.j;
            this.k = new b.a.n.g(aVar != null ? aVar.k() : this.f132f);
        }
        return this.k;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a n() {
        j0();
        return this.j;
    }

    @Override // androidx.appcompat.app.f
    public void o() {
        LayoutInflater from = LayoutInflater.from(this.f132f);
        if (from.getFactory() == null) {
            b.e.j.f.b(from, this);
        } else {
            if (from.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return U(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public void p() {
        androidx.appcompat.app.a n2 = n();
        if (n2 == null || !n2.m()) {
            n0(0);
        }
    }

    public boolean p0() {
        return this.u;
    }

    @Override // androidx.appcompat.app.f
    public void q(Configuration configuration) {
        androidx.appcompat.app.a n2;
        if (this.B && this.v && (n2 = n()) != null) {
            n2.o(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f132f);
        J(false);
    }

    int q0(Context context, int i2) {
        m f02;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    f02 = e0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                f02 = f0(context);
            }
            return f02.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.f
    public void r(Bundle bundle) {
        this.K = true;
        J(false);
        a0();
        Object obj = this.f131e;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.f.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a B0 = B0();
                if (B0 == null) {
                    this.X = true;
                } else {
                    B0.u(true);
                }
            }
            androidx.appcompat.app.f.c(this);
        }
        this.L = true;
    }

    boolean r0() {
        b.a.n.b bVar = this.p;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a n2 = n();
        return n2 != null && n2.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f131e
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.y(r3)
        L9:
            boolean r0 = r3.U
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.g
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.W
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.M = r0
            r0 = 1
            r3.N = r0
            int r0 = r3.O
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f131e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            b.d.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.b0
            java.lang.Object r1 = r3.f131e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            b.d.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.b0
            java.lang.Object r1 = r3.f131e
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.j
            if (r0 == 0) goto L5e
            r0.p()
        L5e:
            r3.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.s():void");
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.J = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void t(Bundle bundle) {
        Z();
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        androidx.appcompat.app.a n2 = n();
        if (n2 != null) {
            n2.w(true);
        }
    }

    boolean u0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a n2 = n();
        if (n2 != null && n2.q(i2, keyEvent)) {
            return true;
        }
        t tVar = this.I;
        if (tVar != null && C0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.I;
            if (tVar2 != null) {
                tVar2.n = true;
            }
            return true;
        }
        if (this.I == null) {
            t g02 = g0(0, true);
            D0(g02, keyEvent);
            boolean C0 = C0(g02, keyEvent.getKeyCode(), keyEvent, 1);
            g02.m = false;
            if (C0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void v(Bundle bundle) {
    }

    boolean v0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.J;
            this.J = false;
            t g02 = g0(0, false);
            if (g02 != null && g02.o) {
                if (!z) {
                    R(g02, true);
                }
                return true;
            }
            if (r0()) {
                return true;
            }
        } else if (i2 == 82) {
            w0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void w() {
        this.M = true;
        I();
    }

    @Override // androidx.appcompat.app.f
    public void x() {
        this.M = false;
        androidx.appcompat.app.a n2 = n();
        if (n2 != null) {
            n2.w(false);
        }
    }

    void x0(int i2) {
        androidx.appcompat.app.a n2;
        if (i2 != 108 || (n2 = n()) == null) {
            return;
        }
        n2.i(true);
    }

    void y0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a n2 = n();
            if (n2 != null) {
                n2.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            t g02 = g0(i2, true);
            if (g02.o) {
                R(g02, false);
            }
        }
    }

    void z0(ViewGroup viewGroup) {
    }
}
