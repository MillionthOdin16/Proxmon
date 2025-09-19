package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.f.a;
import io.flutter.plugin.platform.e;
import java.util.Arrays;

/* loaded from: classes.dex */
class f implements d<Activity> {

    /* renamed from: a, reason: collision with root package name */
    private c f2377a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.b f2378b;

    /* renamed from: c, reason: collision with root package name */
    private k f2379c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.e f2380d;

    /* renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f2381e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2382f;
    private boolean g;
    private final io.flutter.embedding.engine.renderer.b h = new a();

    /* loaded from: classes.dex */
    class a implements io.flutter.embedding.engine.renderer.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
            f.this.f2377a.b();
            f.this.g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            f.this.f2377a.e();
            f.this.g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f2384b;

        b(k kVar) {
            this.f2384b = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (f.this.g && f.this.f2381e != null) {
                this.f2384b.getViewTreeObserver().removeOnPreDrawListener(this);
                f.this.f2381e = null;
            }
            return f.this.g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c extends e.d {
        void b();

        void c();

        Context d();

        void e();

        String f();

        io.flutter.embedding.engine.e g();

        Activity getActivity();

        androidx.lifecycle.d getLifecycle();

        boolean h();

        o i();

        boolean j();

        String k();

        boolean l();

        String m();

        void n(io.flutter.embedding.engine.b bVar);

        q o();

        io.flutter.plugin.platform.e p(Activity activity, io.flutter.embedding.engine.b bVar);

        void q(i iVar);

        String r();

        io.flutter.embedding.engine.b s(Context context);

        boolean t();

        r u();

        void v(j jVar);

        void w(io.flutter.embedding.engine.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(c cVar) {
        this.f2377a = cVar;
    }

    private void f(k kVar) {
        if (this.f2377a.i() != o.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f2381e != null) {
            kVar.getViewTreeObserver().removeOnPreDrawListener(this.f2381e);
        }
        this.f2381e = new b(kVar);
        kVar.getViewTreeObserver().addOnPreDrawListener(this.f2381e);
    }

    private void g() {
        if (this.f2377a.k() == null && !this.f2378b.h().h()) {
            String f2 = this.f2377a.f();
            if (f2 == null && (f2 = l(this.f2377a.getActivity().getIntent())) == null) {
                f2 = "/";
            }
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + this.f2377a.m() + ", and sending initial route: " + f2);
            this.f2378b.m().c(f2);
            String r = this.f2377a.r();
            if (r == null || r.isEmpty()) {
                r = d.a.a.d().b().e();
            }
            this.f2378b.h().f(new a.b(r, this.f2377a.m()));
        }
    }

    private void h() {
        if (this.f2377a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String l(Intent intent) {
        Uri data;
        if (!this.f2377a.t() || (data = intent.getData()) == null || data.getPath().isEmpty()) {
            return null;
        }
        String path = data.getPath();
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        h();
        this.f2378b.j().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(int i) {
        h();
        io.flutter.embedding.engine.b bVar = this.f2378b;
        if (bVar == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        bVar.h().i();
        if (i == 10) {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i);
            this.f2378b.t().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f2378b.g().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.f2377a = null;
        this.f2378b = null;
        this.f2379c = null;
        this.f2380d = null;
    }

    void E() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String k = this.f2377a.k();
        if (k != null) {
            io.flutter.embedding.engine.b a2 = io.flutter.embedding.engine.c.b().a(k);
            this.f2378b = a2;
            this.f2382f = true;
            if (a2 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + k + "'");
        }
        c cVar = this.f2377a;
        io.flutter.embedding.engine.b s = cVar.s(cVar.d());
        this.f2378b = s;
        if (s != null) {
            this.f2382f = true;
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f2378b = new io.flutter.embedding.engine.b(this.f2377a.d(), this.f2377a.g().b(), false, this.f2377a.l());
        this.f2382f = false;
    }

    @Override // io.flutter.embedding.android.d
    public void c() {
        if (!this.f2377a.j()) {
            this.f2377a.c();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f2377a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Activity d() {
        Activity activity = this.f2377a.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.flutter.embedding.engine.b j() {
        return this.f2378b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f2382f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i, int i2, Intent intent) {
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
        this.f2378b.g().onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Context context) {
        h();
        if (this.f2378b == null) {
            E();
        }
        if (this.f2377a.h()) {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f2378b.g().e(this, this.f2377a.getLifecycle());
        }
        c cVar = this.f2377a;
        this.f2380d = cVar.p(cVar.getActivity(), this.f2378b);
        this.f2377a.w(this.f2378b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f2378b.m().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i, boolean z) {
        k kVar;
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        h();
        if (this.f2377a.i() == o.surface) {
            i iVar = new i(this.f2377a.d(), this.f2377a.u() == r.transparent);
            this.f2377a.q(iVar);
            kVar = new k(this.f2377a.d(), iVar);
        } else {
            j jVar = new j(this.f2377a.d());
            jVar.setOpaque(this.f2377a.u() == r.opaque);
            this.f2377a.v(jVar);
            kVar = new k(this.f2377a.d(), jVar);
        }
        this.f2379c = kVar;
        this.f2379c.i(this.h);
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f2379c.k(this.f2378b);
        this.f2379c.setId(i);
        q o = this.f2377a.o();
        if (o == null) {
            if (z) {
                f(this.f2379c);
            }
            return this.f2379c;
        }
        d.a.b.f("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f2377a.d());
        flutterSplashView.setId(d.a.d.d.a(486947586));
        flutterSplashView.g(this.f2379c, o);
        return flutterSplashView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        h();
        if (this.f2381e != null) {
            this.f2379c.getViewTreeObserver().removeOnPreDrawListener(this.f2381e);
            this.f2381e = null;
        }
        this.f2379c.o();
        this.f2379c.u(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        h();
        this.f2377a.n(this.f2378b);
        if (this.f2377a.h()) {
            d.a.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f2377a.getActivity().isChangingConfigurations()) {
                this.f2378b.g().h();
            } else {
                this.f2378b.g().f();
            }
        }
        io.flutter.plugin.platform.e eVar = this.f2380d;
        if (eVar != null) {
            eVar.o();
            this.f2380d = null;
        }
        this.f2378b.j().a();
        if (this.f2377a.j()) {
            this.f2378b.e();
            if (this.f2377a.k() != null) {
                io.flutter.embedding.engine.c.b().d(this.f2377a.k());
            }
            this.f2378b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Intent intent) {
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f2378b.g().a(intent);
        String l = l(intent);
        if (l == null || l.isEmpty()) {
            return;
        }
        this.f2378b.m().b(l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        h();
        this.f2378b.j().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.flutter.plugin.platform.e eVar = this.f2380d;
        if (eVar != null) {
            eVar.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i, String[] strArr, int[] iArr) {
        h();
        if (this.f2378b == null) {
            d.a.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        d.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f2378b.g().onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(Bundle bundle) {
        Bundle bundle2;
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        h();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f2377a.l()) {
            this.f2378b.r().j(bArr);
        }
        if (this.f2377a.h()) {
            this.f2378b.g().b(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        h();
        this.f2378b.j().d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Bundle bundle) {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        h();
        if (this.f2377a.l()) {
            bundle.putByteArray("framework", this.f2378b.r().h());
        }
        if (this.f2377a.h()) {
            Bundle bundle2 = new Bundle();
            this.f2378b.g().c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        d.a.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        h();
        g();
    }
}
