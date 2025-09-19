package io.flutter.plugins.urllauncher;

import android.os.Bundle;
import android.util.Log;
import d.a.c.a.h;
import d.a.c.a.i;
import io.flutter.plugins.urllauncher.b;
import java.util.Map;

/* loaded from: classes.dex */
final class a implements i.c {

    /* renamed from: b, reason: collision with root package name */
    private final b f2797b;

    /* renamed from: c, reason: collision with root package name */
    private i f2798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.f2797b = bVar;
    }

    private static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    private void b(i.d dVar, String str) {
        dVar.success(Boolean.valueOf(this.f2797b.a(str)));
    }

    private void c(i.d dVar) {
        this.f2797b.b();
        dVar.success(null);
    }

    private void d(h hVar, i.d dVar, String str) {
        b.a c2 = this.f2797b.c(str, a((Map) hVar.a("headers")), ((Boolean) hVar.a("useWebView")).booleanValue(), ((Boolean) hVar.a("enableJavaScript")).booleanValue(), ((Boolean) hVar.a("enableDomStorage")).booleanValue());
        if (c2 == b.a.NO_ACTIVITY) {
            dVar.error("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        } else if (c2 == b.a.ACTIVITY_NOT_FOUND) {
            dVar.error("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", str), null);
        } else {
            dVar.success(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d.a.c.a.b bVar) {
        if (this.f2798c != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            f();
        }
        i iVar = new i(bVar, "plugins.flutter.io/url_launcher");
        this.f2798c = iVar;
        iVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        i iVar = this.f2798c;
        if (iVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            iVar.e(null);
            this.f2798c = null;
        }
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = (String) hVar.a("url");
        String str2 = hVar.f1873a;
        int hashCode = str2.hashCode();
        if (hashCode == -1109843021) {
            if (str2.equals("launch")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode != -185306205) {
            if (hashCode == -121617663 && str2.equals("closeWebView")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str2.equals("canLaunch")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            b(dVar, str);
            return;
        }
        if (c2 == 1) {
            d(hVar, dVar, str);
        } else if (c2 != 2) {
            dVar.notImplemented();
        } else {
            c(dVar);
        }
    }
}
