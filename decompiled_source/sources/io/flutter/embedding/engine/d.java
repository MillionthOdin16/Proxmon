package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import d.a.c.a.k;
import d.a.c.a.l;
import d.a.c.a.n;
import d.a.c.a.o;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d implements io.flutter.embedding.engine.i.b, io.flutter.embedding.engine.i.c.b {

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.b f2461b;

    /* renamed from: c, reason: collision with root package name */
    private final a.b f2462c;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    private Activity f2464e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.embedding.android.d<Activity> f2465f;
    private c g;
    private Service j;
    private f k;
    private BroadcastReceiver m;
    private C0068d n;
    private ContentProvider p;
    private e q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.a> f2460a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.c.a> f2463d = new HashMap();
    private boolean h = false;
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.f.a> i = new HashMap();
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.d.a> l = new HashMap();
    private final Map<Class<? extends io.flutter.embedding.engine.i.a>, io.flutter.embedding.engine.i.e.a> o = new HashMap();

    /* loaded from: classes.dex */
    private static class b implements a.InterfaceC0072a {

        /* renamed from: a, reason: collision with root package name */
        final io.flutter.embedding.engine.h.c f2466a;

        private b(io.flutter.embedding.engine.h.c cVar) {
            this.f2466a = cVar;
        }

        @Override // io.flutter.embedding.engine.i.a.InterfaceC0072a
        public String a(String str) {
            return this.f2466a.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements io.flutter.embedding.engine.i.c.c {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f2467a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<n> f2468b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<k> f2469c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set<l> f2470d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        private final Set<o> f2471e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private final Set<c.a> f2472f = new HashSet();

        public c(Activity activity, androidx.lifecycle.d dVar) {
            this.f2467a = activity;
            new HiddenLifecycleReference(dVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public void a(k kVar) {
            this.f2469c.add(kVar);
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public void b(k kVar) {
            this.f2469c.remove(kVar);
        }

        boolean c(int i, int i2, Intent intent) {
            boolean z;
            Iterator it = new HashSet(this.f2469c).iterator();
            while (true) {
                while (it.hasNext()) {
                    z = ((k) it.next()).onActivityResult(i, i2, intent) || z;
                }
                return z;
            }
        }

        void d(Intent intent) {
            Iterator<l> it = this.f2470d.iterator();
            while (it.hasNext()) {
                it.next().a(intent);
            }
        }

        boolean e(int i, String[] strArr, int[] iArr) {
            boolean z;
            Iterator<n> it = this.f2468b.iterator();
            while (true) {
                while (it.hasNext()) {
                    z = it.next().onRequestPermissionsResult(i, strArr, iArr) || z;
                }
                return z;
            }
        }

        void f(Bundle bundle) {
            Iterator<c.a> it = this.f2472f.iterator();
            while (it.hasNext()) {
                it.next().b(bundle);
            }
        }

        void g(Bundle bundle) {
            Iterator<c.a> it = this.f2472f.iterator();
            while (it.hasNext()) {
                it.next().c(bundle);
            }
        }

        @Override // io.flutter.embedding.engine.i.c.c
        public Activity getActivity() {
            return this.f2467a;
        }

        void h() {
            Iterator<o> it = this.f2471e.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0068d implements io.flutter.embedding.engine.i.d.b {
    }

    /* loaded from: classes.dex */
    private static class e implements io.flutter.embedding.engine.i.e.b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f implements io.flutter.embedding.engine.i.f.b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, io.flutter.embedding.engine.b bVar, io.flutter.embedding.engine.h.c cVar) {
        this.f2461b = bVar;
        this.f2462c = new a.b(context, bVar, bVar.h(), bVar.q(), bVar.o().I(), new b(cVar));
    }

    private void i(Activity activity, androidx.lifecycle.d dVar) {
        this.g = new c(activity, dVar);
        this.f2461b.o().u(activity, this.f2461b.q(), this.f2461b.h());
        for (io.flutter.embedding.engine.i.c.a aVar : this.f2463d.values()) {
            if (this.h) {
                aVar.onReattachedToActivityForConfigChanges(this.g);
            } else {
                aVar.onAttachedToActivity(this.g);
            }
        }
        this.h = false;
    }

    private Activity j() {
        io.flutter.embedding.android.d<Activity> dVar = this.f2465f;
        return dVar != null ? dVar.d() : this.f2464e;
    }

    private void l() {
        this.f2461b.o().C();
        this.f2465f = null;
        this.f2464e = null;
        this.g = null;
    }

    private void m() {
        if (r()) {
            f();
            return;
        }
        if (u()) {
            p();
        } else if (s()) {
            n();
        } else if (t()) {
            o();
        }
    }

    private boolean r() {
        return (this.f2464e == null && this.f2465f == null) ? false : true;
    }

    private boolean s() {
        return this.m != null;
    }

    private boolean t() {
        return this.p != null;
    }

    private boolean u() {
        return this.j != null;
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void a(Intent intent) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onNewIntent() to plugins.");
        if (r()) {
            this.g.d(intent);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void b(Bundle bundle) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onRestoreInstanceState() to plugins.");
        if (r()) {
            this.g.f(bundle);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void c(Bundle bundle) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onSaveInstanceState() to plugins.");
        if (r()) {
            this.g.g(bundle);
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void d() {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onUserLeaveHint() to plugins.");
        if (r()) {
            this.g.h();
        } else {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void e(io.flutter.embedding.android.d<Activity> dVar, androidx.lifecycle.d dVar2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Attaching to an exclusive Activity: ");
        sb.append(dVar.d());
        boolean r = r();
        String str2 = BuildConfig.VERSION_NAME;
        if (r) {
            str = " evicting previous activity " + j();
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        sb.append(str);
        sb.append(".");
        if (this.h) {
            str2 = " This is after a config change.";
        }
        sb.append(str2);
        d.a.b.e("FlutterEngineCxnRegstry", sb.toString());
        io.flutter.embedding.android.d<Activity> dVar3 = this.f2465f;
        if (dVar3 != null) {
            dVar3.c();
        }
        m();
        if (this.f2464e != null) {
            throw new AssertionError("Only activity or exclusiveActivity should be set");
        }
        this.f2465f = dVar;
        i(dVar.d(), dVar2);
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void f() {
        if (!r()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from an Activity: " + j());
        Iterator<io.flutter.embedding.engine.i.c.a> it = this.f2463d.values().iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromActivity();
        }
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.i.b
    public void g(io.flutter.embedding.engine.i.a aVar) {
        if (q(aVar.getClass())) {
            d.a.b.f("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f2461b + ").");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
        this.f2460a.put(aVar.getClass(), aVar);
        aVar.onAttachedToEngine(this.f2462c);
        if (aVar instanceof io.flutter.embedding.engine.i.c.a) {
            io.flutter.embedding.engine.i.c.a aVar2 = (io.flutter.embedding.engine.i.c.a) aVar;
            this.f2463d.put(aVar.getClass(), aVar2);
            if (r()) {
                aVar2.onAttachedToActivity(this.g);
            }
        }
        if (aVar instanceof io.flutter.embedding.engine.i.f.a) {
            io.flutter.embedding.engine.i.f.a aVar3 = (io.flutter.embedding.engine.i.f.a) aVar;
            this.i.put(aVar.getClass(), aVar3);
            if (u()) {
                aVar3.a(this.k);
            }
        }
        if (aVar instanceof io.flutter.embedding.engine.i.d.a) {
            io.flutter.embedding.engine.i.d.a aVar4 = (io.flutter.embedding.engine.i.d.a) aVar;
            this.l.put(aVar.getClass(), aVar4);
            if (s()) {
                aVar4.a(this.n);
            }
        }
        if (aVar instanceof io.flutter.embedding.engine.i.e.a) {
            io.flutter.embedding.engine.i.e.a aVar5 = (io.flutter.embedding.engine.i.e.a) aVar;
            this.o.put(aVar.getClass(), aVar5);
            if (t()) {
                aVar5.a(this.q);
            }
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public void h() {
        if (!r()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from an Activity for config changes: " + j());
        this.h = true;
        Iterator<io.flutter.embedding.engine.i.c.a> it = this.f2463d.values().iterator();
        while (it.hasNext()) {
            it.next().onDetachedFromActivityForConfigChanges();
        }
        l();
    }

    public void k() {
        d.a.b.e("FlutterEngineCxnRegstry", "Destroying.");
        m();
        x();
    }

    public void n() {
        if (!s()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from BroadcastReceiver: " + this.m);
        Iterator<io.flutter.embedding.engine.i.d.a> it = this.l.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void o() {
        if (!t()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from ContentProvider: " + this.p);
        Iterator<io.flutter.embedding.engine.i.e.a> it = this.o.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public boolean onActivityResult(int i, int i2, Intent intent) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onActivityResult() to plugins.");
        if (r()) {
            return this.g.c(i, i2, intent);
        }
        d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    @Override // io.flutter.embedding.engine.i.c.b
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        d.a.b.e("FlutterEngineCxnRegstry", "Forwarding onRequestPermissionsResult() to plugins.");
        if (r()) {
            return this.g.e(i, strArr, iArr);
        }
        d.a.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    public void p() {
        if (!u()) {
            d.a.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        d.a.b.e("FlutterEngineCxnRegstry", "Detaching from a Service: " + this.j);
        Iterator<io.flutter.embedding.engine.i.f.a> it = this.i.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.j = null;
        this.k = null;
    }

    public boolean q(Class<? extends io.flutter.embedding.engine.i.a> cls) {
        return this.f2460a.containsKey(cls);
    }

    public void v(Class<? extends io.flutter.embedding.engine.i.a> cls) {
        io.flutter.embedding.engine.i.a aVar = this.f2460a.get(cls);
        if (aVar != null) {
            d.a.b.e("FlutterEngineCxnRegstry", "Removing plugin: " + aVar);
            if (aVar instanceof io.flutter.embedding.engine.i.c.a) {
                if (r()) {
                    ((io.flutter.embedding.engine.i.c.a) aVar).onDetachedFromActivity();
                }
                this.f2463d.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.i.f.a) {
                if (u()) {
                    ((io.flutter.embedding.engine.i.f.a) aVar).b();
                }
                this.i.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.i.d.a) {
                if (s()) {
                    ((io.flutter.embedding.engine.i.d.a) aVar).b();
                }
                this.l.remove(cls);
            }
            if (aVar instanceof io.flutter.embedding.engine.i.e.a) {
                if (t()) {
                    ((io.flutter.embedding.engine.i.e.a) aVar).b();
                }
                this.o.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f2462c);
            this.f2460a.remove(cls);
        }
    }

    public void w(Set<Class<? extends io.flutter.embedding.engine.i.a>> set) {
        Iterator<Class<? extends io.flutter.embedding.engine.i.a>> it = set.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x() {
        w(new HashSet(this.f2460a.keySet()));
        this.f2460a.clear();
    }
}
