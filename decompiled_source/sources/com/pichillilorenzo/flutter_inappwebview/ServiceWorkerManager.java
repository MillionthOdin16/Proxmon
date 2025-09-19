package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import b.l.b;
import b.l.c;
import b.l.d;
import b.l.h;
import com.pichillilorenzo.flutter_inappwebview.Util;
import d.a.c.a.i;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ServiceWorkerManager implements i.c {
    static final String LOG_TAG = "ServiceWorkerManager";
    public static c serviceWorkerController;
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_serviceworkercontroller");
        this.channel = iVar;
        iVar.e(this);
        if (!h.a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = null;
            return;
        }
        c a2 = c.a();
        serviceWorkerController = a2;
        a2.c(new b() { // from class: com.pichillilorenzo.flutter_inappwebview.ServiceWorkerManager.1
            @Override // b.l.b
            public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                HashMap hashMap = new HashMap();
                hashMap.put("url", webResourceRequest.getUrl().toString());
                hashMap.put("method", webResourceRequest.getMethod());
                hashMap.put("headers", webResourceRequest.getRequestHeaders());
                hashMap.put("isForMainFrame", Boolean.valueOf(webResourceRequest.isForMainFrame()));
                hashMap.put("hasGesture", Boolean.valueOf(webResourceRequest.hasGesture()));
                hashMap.put("isRedirect", Boolean.valueOf(webResourceRequest.isRedirect()));
                try {
                    Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(ServiceWorkerManager.this.channel, "shouldInterceptRequest", hashMap);
                    String str = invokeMethodAndWait.error;
                    if (str != null) {
                        Log.e(ServiceWorkerManager.LOG_TAG, str);
                        return null;
                    }
                    Object obj = invokeMethodAndWait.result;
                    if (obj == null) {
                        return null;
                    }
                    Map map = (Map) obj;
                    String str2 = (String) map.get("contentType");
                    String str3 = (String) map.get("contentEncoding");
                    byte[] bArr = (byte[]) map.get("data");
                    Map map2 = (Map) map.get("headers");
                    Integer num = (Integer) map.get("statusCode");
                    String str4 = (String) map.get("reasonPhrase");
                    ByteArrayInputStream byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
                    return (!(map2 == null && num == null && str4 == null) && Build.VERSION.SDK_INT >= 21) ? new WebResourceResponse(str2, str3, num.intValue(), str4, map2, byteArrayInputStream) : new WebResourceResponse(str2, str3, byteArrayInputStream);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
        });
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x006f. Please report as an issue. */
    @Override // d.a.c.a.i.c
    public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
        boolean a2;
        Object obj;
        c cVar = serviceWorkerController;
        d b2 = cVar != null ? cVar.b() : null;
        String str = hVar.f1873a;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c2 = 0;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c2 = 3;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c2 = 1;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (b2 != null && h.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    a2 = b2.a();
                    obj = Boolean.valueOf(a2);
                    dVar.success(obj);
                    return;
                }
                obj = Boolean.FALSE;
                dVar.success(obj);
                return;
            case 1:
                if (b2 != null && h.a("SERVICE_WORKER_FILE_ACCESS")) {
                    a2 = b2.b();
                    obj = Boolean.valueOf(a2);
                    dVar.success(obj);
                    return;
                }
                obj = Boolean.FALSE;
                dVar.success(obj);
                return;
            case 2:
                if (b2 != null && h.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    a2 = b2.c();
                    obj = Boolean.valueOf(a2);
                    dVar.success(obj);
                    return;
                }
                obj = Boolean.FALSE;
                dVar.success(obj);
                return;
            case 3:
                if (b2 == null || !h.a("SERVICE_WORKER_CACHE_MODE")) {
                    dVar.success(null);
                    return;
                } else {
                    obj = Integer.valueOf(b2.d());
                    dVar.success(obj);
                    return;
                }
            case 4:
                if (b2 != null && h.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    b2.e(((Boolean) hVar.a("allow")).booleanValue());
                }
                obj = Boolean.TRUE;
                dVar.success(obj);
                return;
            case 5:
                if (b2 != null && h.a("SERVICE_WORKER_FILE_ACCESS")) {
                    b2.f(((Boolean) hVar.a("allow")).booleanValue());
                }
                obj = Boolean.TRUE;
                dVar.success(obj);
                return;
            case 6:
                if (b2 != null && h.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    b2.g(((Boolean) hVar.a("flag")).booleanValue());
                }
                obj = Boolean.TRUE;
                dVar.success(obj);
                return;
            case 7:
                if (b2 != null && h.a("SERVICE_WORKER_CACHE_MODE")) {
                    b2.h(((Integer) hVar.a("mode")).intValue());
                }
                obj = Boolean.TRUE;
                dVar.success(obj);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
