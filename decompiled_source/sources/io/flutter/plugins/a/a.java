package io.flutter.plugins.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import d.a.c.a.b;
import d.a.c.a.h;
import d.a.c.a.i;
import io.flutter.embedding.engine.i.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements i.c, io.flutter.embedding.engine.i.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f2768b;

    /* renamed from: c, reason: collision with root package name */
    private i f2769c;

    private static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    private void b(Context context, b bVar) {
        this.f2768b = context;
        i iVar = new i(bVar, "plugins.flutter.io/package_info");
        this.f2769c = iVar;
        iVar.e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        b(bVar.a(), bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f2768b = null;
        this.f2769c.e(null);
        this.f2769c = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        try {
            if (hVar.f1873a.equals("getAll")) {
                PackageManager packageManager = this.f2768b.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f2768b.getPackageName(), 0);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                hashMap.put("packageName", this.f2768b.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                hashMap.put("buildNumber", String.valueOf(a(packageInfo)));
                dVar.success(hashMap);
            } else {
                dVar.notImplemented();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            dVar.error("Name not found", e2.getMessage(), null);
        }
    }
}
