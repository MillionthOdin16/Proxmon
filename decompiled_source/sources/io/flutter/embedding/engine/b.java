package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.j.f;
import io.flutter.embedding.engine.j.g;
import io.flutter.embedding.engine.j.h;
import io.flutter.embedding.engine.j.i;
import io.flutter.embedding.engine.j.k;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.j.m;
import io.flutter.embedding.engine.j.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f2451a;

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f2452b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.embedding.engine.f.a f2453c;

    /* renamed from: d, reason: collision with root package name */
    private final d f2454d;

    /* renamed from: e, reason: collision with root package name */
    private final d.a.c.b.a f2455e;

    /* renamed from: f, reason: collision with root package name */
    private final io.flutter.embedding.engine.j.b f2456f;
    private final io.flutter.embedding.engine.j.c g;
    private final io.flutter.embedding.engine.j.d h;
    private final io.flutter.embedding.engine.j.e i;
    private final f j;
    private final g k;
    private final h l;
    private final k m;
    private final i n;
    private final l o;
    private final m p;
    private final n q;
    private final io.flutter.plugin.platform.k r;
    private final Set<InterfaceC0067b> s;
    private final InterfaceC0067b t;

    /* loaded from: classes.dex */
    class a implements InterfaceC0067b {
        a() {
        }

        @Override // io.flutter.embedding.engine.b.InterfaceC0067b
        public void a() {
            d.a.b.e("FlutterEngine", "onPreEngineRestart()");
            Iterator it = b.this.s.iterator();
            while (it.hasNext()) {
                ((InterfaceC0067b) it.next()).a();
            }
            b.this.r.U();
            b.this.m.g();
        }

        @Override // io.flutter.embedding.engine.b.InterfaceC0067b
        public void b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0067b {
        void a();

        void b();
    }

    public b(Context context, io.flutter.embedding.engine.h.c cVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.k kVar, String[] strArr, boolean z, boolean z2) {
        AssetManager assets;
        this.s = new HashSet();
        this.t = new a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        d.a.a d2 = d.a.a.d();
        flutterJNI = flutterJNI == null ? d2.c().a() : flutterJNI;
        this.f2451a = flutterJNI;
        io.flutter.embedding.engine.f.a aVar = new io.flutter.embedding.engine.f.a(flutterJNI, assets);
        this.f2453c = aVar;
        aVar.j();
        io.flutter.embedding.engine.g.a a2 = d.a.a.d().a();
        this.f2456f = new io.flutter.embedding.engine.j.b(this.f2453c, flutterJNI);
        this.g = new io.flutter.embedding.engine.j.c(this.f2453c);
        this.h = new io.flutter.embedding.engine.j.d(this.f2453c);
        this.i = new io.flutter.embedding.engine.j.e(this.f2453c);
        this.j = new f(this.f2453c);
        this.k = new g(this.f2453c);
        this.l = new h(this.f2453c);
        this.n = new i(this.f2453c);
        this.m = new k(this.f2453c, z2);
        this.o = new l(this.f2453c);
        this.p = new m(this.f2453c);
        this.q = new n(this.f2453c);
        if (a2 != null) {
            a2.f(this.g);
        }
        this.f2455e = new d.a.c.b.a(context, this.j);
        cVar = cVar == null ? d2.b() : cVar;
        if (!flutterJNI.isAttached()) {
            cVar.i(context.getApplicationContext());
            cVar.d(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.t);
        flutterJNI.setPlatformViewsController(kVar);
        flutterJNI.setLocalizationPlugin(this.f2455e);
        flutterJNI.setDeferredComponentManager(d2.a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.f2452b = new io.flutter.embedding.engine.renderer.a(flutterJNI);
        this.r = kVar;
        kVar.O();
        this.f2454d = new d(context.getApplicationContext(), this, cVar);
        if (z && cVar.c()) {
            io.flutter.embedding.engine.i.g.a.a(this);
        }
    }

    public b(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, null, null, new io.flutter.plugin.platform.k(), strArr, z, z2);
    }

    private void d() {
        d.a.b.e("FlutterEngine", "Attaching to JNI.");
        this.f2451a.attachToNative(false);
        if (!v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean v() {
        return this.f2451a.isAttached();
    }

    public void e() {
        d.a.b.e("FlutterEngine", "Destroying.");
        Iterator<InterfaceC0067b> it = this.s.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f2454d.k();
        this.r.Q();
        this.f2453c.k();
        this.f2451a.removeEngineLifecycleListener(this.t);
        this.f2451a.setDeferredComponentManager(null);
        this.f2451a.detachFromNativeAndReleaseResources();
        if (d.a.a.d().a() != null) {
            d.a.a.d().a().b();
            this.g.c(null);
        }
    }

    public io.flutter.embedding.engine.j.b f() {
        return this.f2456f;
    }

    public io.flutter.embedding.engine.i.c.b g() {
        return this.f2454d;
    }

    public io.flutter.embedding.engine.f.a h() {
        return this.f2453c;
    }

    public io.flutter.embedding.engine.j.d i() {
        return this.h;
    }

    public io.flutter.embedding.engine.j.e j() {
        return this.i;
    }

    public d.a.c.b.a k() {
        return this.f2455e;
    }

    public g l() {
        return this.k;
    }

    public h m() {
        return this.l;
    }

    public i n() {
        return this.n;
    }

    public io.flutter.plugin.platform.k o() {
        return this.r;
    }

    public io.flutter.embedding.engine.i.b p() {
        return this.f2454d;
    }

    public io.flutter.embedding.engine.renderer.a q() {
        return this.f2452b;
    }

    public k r() {
        return this.m;
    }

    public l s() {
        return this.o;
    }

    public m t() {
        return this.p;
    }

    public n u() {
        return this.q;
    }
}
