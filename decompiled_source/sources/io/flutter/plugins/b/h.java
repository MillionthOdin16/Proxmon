package io.flutter.plugins.b;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class h implements io.flutter.embedding.engine.i.a, i.c {

    /* renamed from: b, reason: collision with root package name */
    private Context f2779b;

    /* renamed from: c, reason: collision with root package name */
    private d.a.c.a.i f2780c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2781d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private final Executor f2782e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class a<T> implements c.b.b.b.a.b<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.d f2783a;

        a(h hVar, i.d dVar) {
            this.f2783a = dVar;
        }

        @Override // c.b.b.b.a.b
        public void a(T t) {
            this.f2783a.success(t);
        }

        @Override // c.b.b.b.a.b
        public void b(Throwable th) {
            this.f2783a.error(th.getClass().getName(), th.getMessage(), null);
        }
    }

    /* loaded from: classes.dex */
    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f2784a;

        private b() {
            this.f2784a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2784a.post(runnable);
        }
    }

    public h() {
        c.b.b.b.a.g gVar = new c.b.b.b.a.g();
        gVar.e("path-provider-background-%d");
        gVar.f(5);
        this.f2782e = Executors.newSingleThreadExecutor(gVar.b());
    }

    private <T> void a(final Callable<T> callable, i.d dVar) {
        final c.b.b.b.a.f C = c.b.b.b.a.f.C();
        c.b.b.b.a.c.a(C, new a(this, dVar), this.f2781d);
        this.f2782e.execute(new Runnable() { // from class: io.flutter.plugins.b.f
            @Override // java.lang.Runnable
            public final void run() {
                h.h(c.b.b.b.a.f.this, callable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String n() {
        return d.a.d.a.c(this.f2779b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String j() {
        return d.a.d.a.b(this.f2779b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<String> l() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f2779b.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f2779b.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<String> m(String str) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f2779b.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f2779b.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String k() {
        File externalFilesDir = this.f2779b.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String i() {
        return this.f2779b.getCacheDir().getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h(c.b.b.b.a.f fVar, Callable callable) {
        try {
            fVar.z(callable.call());
        } catch (Throwable th) {
            fVar.A(th);
        }
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        this.f2780c = new d.a.c.a.i(bVar.b(), "plugins.flutter.io/path_provider");
        this.f2779b = bVar.a();
        this.f2780c.e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f2780c.e(null);
        this.f2780c = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // d.a.c.a.i.c
    public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
        char c2;
        Callable callable;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1832373352:
                if (str.equals("getApplicationSupportDirectory")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1208689078:
                if (str.equals("getExternalCacheDirectories")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 299667825:
                if (str.equals("getExternalStorageDirectories")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1200320591:
                if (str.equals("getApplicationDocumentsDirectory")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1252916648:
                if (str.equals("getStorageDirectory")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1711844626:
                if (str.equals("getTemporaryDirectory")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            callable = new Callable() { // from class: io.flutter.plugins.b.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.i();
                }
            };
        } else if (c2 == 1) {
            callable = new Callable() { // from class: io.flutter.plugins.b.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.j();
                }
            };
        } else if (c2 == 2) {
            callable = new Callable() { // from class: io.flutter.plugins.b.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.k();
                }
            };
        } else if (c2 == 3) {
            callable = new Callable() { // from class: io.flutter.plugins.b.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.l();
                }
            };
        } else if (c2 == 4) {
            final String a2 = i.a((Integer) hVar.a("type"));
            a(new Callable() { // from class: io.flutter.plugins.b.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.m(a2);
                }
            }, dVar);
            return;
        } else {
            if (c2 != 5) {
                dVar.notImplemented();
                return;
            }
            callable = new Callable() { // from class: io.flutter.plugins.b.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.this.n();
                }
            };
        }
        a(callable, dVar);
    }
}
