package c.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import c.c.a.b.c;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import d.a.c.a.h;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes.dex */
public class a implements i.c, io.flutter.embedding.engine.i.a {

    /* renamed from: b, reason: collision with root package name */
    private i f1529b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f1530c;

    /* renamed from: d, reason: collision with root package name */
    private Charset f1531d;

    /* renamed from: e, reason: collision with root package name */
    private c f1532e;

    /* renamed from: f, reason: collision with root package name */
    private Context f1533f;
    private HandlerThread g;
    private Handler h;

    /* renamed from: c.c.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0052a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        private final i.d f1534a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f1535b = new Handler(Looper.getMainLooper());

        /* renamed from: c.c.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0053a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1536b;

            RunnableC0053a(Object obj) {
                this.f1536b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0052a.this.f1534a.success(this.f1536b);
            }
        }

        /* renamed from: c.c.a.a$a$b */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f1538b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f1539c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f1540d;

            b(String str, String str2, Object obj) {
                this.f1538b = str;
                this.f1539c = str2;
                this.f1540d = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0052a.this.f1534a.error(this.f1538b, this.f1539c, this.f1540d);
            }
        }

        /* renamed from: c.c.a.a$a$c */
        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0052a.this.f1534a.notImplemented();
            }
        }

        C0052a(i.d dVar) {
            this.f1534a = dVar;
        }

        @Override // d.a.c.a.i.d
        public void error(String str, String str2, Object obj) {
            this.f1535b.post(new b(str, str2, obj));
        }

        @Override // d.a.c.a.i.d
        public void notImplemented() {
            this.f1535b.post(new c());
        }

        @Override // d.a.c.a.i.d
        public void success(Object obj) {
            this.f1535b.post(new RunnableC0053a(obj));
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final h f1543b;

        /* renamed from: c, reason: collision with root package name */
        private final i.d f1544c;

        b(h hVar, i.d dVar) {
            this.f1543b = hVar;
            this.f1544c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.d dVar;
            try {
                String str = this.f1543b.f1873a;
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1335458389:
                        if (str.equals("delete")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -358737930:
                        if (str.equals("deleteAll")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 3496342:
                        if (str.equals("read")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 113399775:
                        if (str.equals("write")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1080375339:
                        if (str.equals("readAll")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                Object obj = null;
                if (c2 == 0) {
                    a.this.m();
                    a.this.r(a.this.n(this.f1543b), (String) ((Map) this.f1543b.f1874b).get("value"));
                    dVar = this.f1544c;
                } else if (c2 == 1) {
                    String n = a.this.n(this.f1543b);
                    if (a.this.f1530c.contains(n)) {
                        a.this.m();
                        obj = a.this.p(n);
                        dVar = this.f1544c;
                    } else {
                        dVar = this.f1544c;
                    }
                } else if (c2 == 2) {
                    a.this.m();
                    obj = a.this.q();
                    dVar = this.f1544c;
                } else if (c2 == 3) {
                    a.this.k(a.this.n(this.f1543b));
                    dVar = this.f1544c;
                } else if (c2 != 4) {
                    this.f1544c.notImplemented();
                    return;
                } else {
                    a.this.l();
                    dVar = this.f1544c;
                }
                dVar.success(obj);
            } catch (Exception e2) {
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                this.f1544c.error("Exception encountered", this.f1543b.f1873a, stringWriter.toString());
            }
        }
    }

    private String i(String str) {
        return "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_" + str;
    }

    private String j(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f1532e.b(Base64.decode(str, 0)), this.f1531d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        SharedPreferences.Editor edit = this.f1530c.edit();
        edit.remove(str);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        SharedPreferences.Editor edit = this.f1530c.edit();
        edit.clear();
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f1532e == null) {
            try {
                this.f1532e = new c.c.a.b.b(this.f1533f);
            } catch (Exception e2) {
                Log.e("FlutterSecureStoragePl", "StorageCipher initialization failed", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n(h hVar) {
        return i((String) ((Map) hVar.f1874b).get("key"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p(String str) {
        return j(this.f1530c.getString(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> q() {
        Map<String, ?> all = this.f1530c.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            hashMap.put(entry.getKey().replaceFirst("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_", BuildConfig.VERSION_NAME), j((String) entry.getValue()));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, String str2) {
        byte[] a2 = this.f1532e.a(str2.getBytes(this.f1531d));
        SharedPreferences.Editor edit = this.f1530c.edit();
        edit.putString(str, Base64.encodeToString(a2, 0));
        edit.commit();
    }

    public void o(d.a.c.a.b bVar, Context context) {
        try {
            this.f1533f = context.getApplicationContext();
            this.f1530c = context.getSharedPreferences("FlutterSecureStorage", 0);
            this.f1531d = Charset.forName("UTF-8");
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.g = handlerThread;
            handlerThread.start();
            this.h = new Handler(this.g.getLooper());
            c.c.a.b.b.c(this.f1530c, context);
            i iVar = new i(bVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f1529b = iVar;
            iVar.e(this);
        } catch (Exception e2) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e2);
        }
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        o(bVar.b(), bVar.a());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f1529b != null) {
            this.g.quitSafely();
            this.g = null;
            this.f1529b.e(null);
            this.f1529b = null;
        }
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        this.h.post(new b(hVar, new C0052a(dVar)));
    }
}
