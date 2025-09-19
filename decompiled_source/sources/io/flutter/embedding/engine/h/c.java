package io.flutter.embedding.engine.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2500a;

    /* renamed from: b, reason: collision with root package name */
    private C0071c f2501b;

    /* renamed from: c, reason: collision with root package name */
    private long f2502c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.engine.h.b f2503d;

    /* renamed from: e, reason: collision with root package name */
    private FlutterJNI f2504e;

    /* renamed from: f, reason: collision with root package name */
    Future<b> f2505f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2506a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.embedding.engine.h.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0070a implements Runnable {
            RunnableC0070a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f2504e.prefetchDefaultFontManager();
            }
        }

        a(Context context) {
            this.f2506a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b call() {
            d h = c.this.h(this.f2506a);
            c.this.f2504e.loadLibrary();
            Executors.newSingleThreadExecutor().execute(new RunnableC0070a());
            a aVar = null;
            if (h == null) {
                return new b(d.a.d.a.c(this.f2506a), d.a.d.a.a(this.f2506a), d.a.d.a.b(this.f2506a), aVar);
            }
            h.a();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f2509a;

        /* renamed from: b, reason: collision with root package name */
        final String f2510b;

        private b(String str, String str2, String str3) {
            this.f2509a = str;
            this.f2510b = str2;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    /* renamed from: io.flutter.embedding.engine.h.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071c {

        /* renamed from: a, reason: collision with root package name */
        private String f2511a;

        public String a() {
            return this.f2511a;
        }
    }

    public c() {
        this(d.a.a.d().c().a());
    }

    public c(FlutterJNI flutterJNI) {
        this.f2500a = false;
        this.f2504e = flutterJNI;
    }

    private String f(String str) {
        return this.f2503d.f2496b + File.separator + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d h(Context context) {
        return null;
    }

    public boolean c() {
        return this.f2503d.f2499e;
    }

    public void d(Context context, String[] strArr) {
        if (this.f2500a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f2501b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            b bVar = this.f2505f.get();
            ArrayList arrayList = new ArrayList();
            arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
            arrayList.add("--icu-native-lib-path=" + this.f2503d.f2498d + File.separator + "libflutter.so");
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            arrayList.add("--aot-shared-library-name=" + this.f2503d.f2495a);
            arrayList.add("--aot-shared-library-name=" + this.f2503d.f2498d + File.separator + this.f2503d.f2495a);
            StringBuilder sb = new StringBuilder();
            sb.append("--cache-dir-path=");
            sb.append(bVar.f2510b);
            arrayList.add(sb.toString());
            if (this.f2503d.f2497c != null) {
                arrayList.add("--domain-network-policy=" + this.f2503d.f2497c);
            }
            if (this.f2501b.a() != null) {
                arrayList.add("--log-tag=" + this.f2501b.a());
            }
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
            if (i == 0) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                double d2 = memoryInfo.totalMem;
                Double.isNaN(d2);
                i = (int) ((d2 / 1000000.0d) / 2.0d);
            }
            arrayList.add("--old-gen-heap-size=" + i);
            if (bundle != null && bundle.getBoolean("io.flutter.embedding.android.EnableSkParagraph")) {
                arrayList.add("--enable-skparagraph");
            }
            this.f2504e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f2509a, bVar.f2510b, SystemClock.uptimeMillis() - this.f2502c);
            this.f2500a = true;
        } catch (Exception e2) {
            d.a.b.c("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public String e() {
        return this.f2503d.f2496b;
    }

    public String g(String str) {
        return f(str);
    }

    public void i(Context context) {
        j(context, new C0071c());
    }

    public void j(Context context, C0071c c0071c) {
        if (this.f2501b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Context applicationContext = context.getApplicationContext();
        this.f2501b = c0071c;
        this.f2502c = SystemClock.uptimeMillis();
        this.f2503d = io.flutter.embedding.engine.h.a.e(applicationContext);
        g.b((WindowManager) applicationContext.getSystemService("window")).c();
        this.f2505f = Executors.newSingleThreadExecutor().submit(new a(applicationContext));
    }
}
