package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import io.flutter.embedding.android.f;

/* loaded from: classes.dex */
public class e extends Activity implements f.c, androidx.lifecycle.g {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2374d = d.a.d.d.a(61938);

    /* renamed from: b, reason: collision with root package name */
    protected f f2375b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.h f2376c = new androidx.lifecycle.h(this);

    private Drawable D() {
        try {
            Bundle C = C();
            int i = C != null ? C.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i != 0) {
                return b.e.d.d.f.a(getResources(), i, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e2) {
            d.a.b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e2;
        }
    }

    private boolean E() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void F() {
        this.f2375b.q();
        this.f2375b.r();
        this.f2375b.D();
        this.f2375b = null;
    }

    private boolean G(String str) {
        if (this.f2375b != null) {
            return true;
        }
        d.a.b.f("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
        return false;
    }

    private void H() {
        try {
            Bundle C = C();
            if (C != null) {
                int i = C.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                }
            } else {
                d.a.b.e("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            d.a.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    private void x() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void y() {
        if (A() == g.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View z() {
        return this.f2375b.p(null, null, null, f2374d, i() == o.surface);
    }

    protected g A() {
        return getIntent().hasExtra("background_mode") ? g.valueOf(getIntent().getStringExtra("background_mode")) : g.opaque;
    }

    protected io.flutter.embedding.engine.b B() {
        return this.f2375b.j();
    }

    protected Bundle C() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // io.flutter.plugin.platform.e.d
    public boolean a() {
        return false;
    }

    @Override // io.flutter.embedding.android.f.c
    public void b() {
    }

    @Override // io.flutter.embedding.android.f.c
    public void c() {
        d.a.b.f("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + B() + " evicted by another attaching activity");
        F();
    }

    @Override // io.flutter.embedding.android.f.c
    public Context d() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle C = C();
            if (C != null) {
                return C.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.e g() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    @Override // io.flutter.embedding.android.f.c
    public Activity getActivity() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c, androidx.lifecycle.g
    public androidx.lifecycle.d getLifecycle() {
        return this.f2376c;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean h() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public o i() {
        return A() == g.opaque ? o.surface : o.texture;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (k() != null || this.f2375b.k()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.f.c
    public String k() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean l() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : k() == null;
    }

    @Override // io.flutter.embedding.android.f.c
    public String m() {
        try {
            Bundle C = C();
            String string = C != null ? C.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void n(io.flutter.embedding.engine.b bVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public q o() {
        Drawable D = D();
        if (D != null) {
            return new c(D);
        }
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (G("onActivityResult")) {
            this.f2375b.m(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (G("onBackPressed")) {
            this.f2375b.o();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        H();
        super.onCreate(bundle);
        f fVar = new f(this);
        this.f2375b = fVar;
        fVar.n(this);
        this.f2375b.w(bundle);
        this.f2376c.i(d.a.ON_CREATE);
        y();
        setContentView(z());
        x();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (G("onDestroy")) {
            F();
        }
        this.f2376c.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (G("onNewIntent")) {
            this.f2375b.s(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (G("onPause")) {
            this.f2375b.t();
        }
        this.f2376c.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (G("onPostResume")) {
            this.f2375b.u();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (G("onRequestPermissionsResult")) {
            this.f2375b.v(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f2376c.i(d.a.ON_RESUME);
        if (G("onResume")) {
            this.f2375b.x();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (G("onSaveInstanceState")) {
            this.f2375b.y(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f2376c.i(d.a.ON_START);
        if (G("onStart")) {
            this.f2375b.z();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (G("onStop")) {
            this.f2375b.A();
        }
        this.f2376c.i(d.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (G("onTrimMemory")) {
            this.f2375b.B(i);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (G("onUserLeaveHint")) {
            this.f2375b.C();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.plugin.platform.e p(Activity activity, io.flutter.embedding.engine.b bVar) {
        getActivity();
        return new io.flutter.plugin.platform.e(this, bVar.n(), this);
    }

    @Override // io.flutter.embedding.android.f.c
    public void q(i iVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String r() {
        String dataString;
        if (E() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.b s(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean t() {
        try {
            Bundle C = C();
            if (C != null) {
                return C.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public r u() {
        return A() == g.opaque ? r.opaque : r.transparent;
    }

    @Override // io.flutter.embedding.android.f.c
    public void v(j jVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public void w(io.flutter.embedding.engine.b bVar) {
        if (this.f2375b.k()) {
            return;
        }
        io.flutter.embedding.engine.i.g.a.a(bVar);
    }
}
