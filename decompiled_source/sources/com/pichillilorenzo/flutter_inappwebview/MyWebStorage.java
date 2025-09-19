package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MyWebStorage implements i.c {
    static final String LOG_TAG = "MyWebStorage";
    public static WebStorage webStorageManager;
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager");
        this.channel = iVar;
        iVar.e(this);
        webStorageManager = WebStorage.getInstance();
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    public void getOrigins(final i.d dVar) {
        webStorageManager.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Map map) {
                ArrayList arrayList = new ArrayList();
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                    HashMap hashMap = new HashMap();
                    hashMap.put("origin", origin.getOrigin());
                    hashMap.put("quota", Long.valueOf(origin.getQuota()));
                    hashMap.put("usage", Long.valueOf(origin.getUsage()));
                    arrayList.add(hashMap);
                }
                dVar.success(arrayList);
            }
        });
    }

    public void getQuotaForOrigin(String str, final i.d dVar) {
        webStorageManager.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Long l) {
                dVar.success(l);
            }
        });
    }

    public void getUsageForOrigin(String str, final i.d dVar) {
        webStorageManager.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyWebStorage.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Long l) {
                dVar.success(l);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1308548435:
                if (str.equals("getQuotaForOrigin")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1117417280:
                if (str.equals("deleteAllData")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -876677967:
                if (str.equals("deleteOrigin")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -165580329:
                if (str.equals("getOrigins")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 843309476:
                if (str.equals("getUsageForOrigin")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            getOrigins(dVar);
            return;
        }
        if (c2 == 1) {
            webStorageManager.deleteAllData();
        } else {
            if (c2 != 2) {
                if (c2 == 3) {
                    getQuotaForOrigin((String) hVar.a("origin"), dVar);
                    return;
                } else if (c2 != 4) {
                    dVar.notImplemented();
                    return;
                } else {
                    getUsageForOrigin((String) hVar.a("origin"), dVar);
                    return;
                }
            }
            webStorageManager.deleteOrigin((String) hVar.a("origin"));
        }
        dVar.success(Boolean.TRUE);
    }
}
