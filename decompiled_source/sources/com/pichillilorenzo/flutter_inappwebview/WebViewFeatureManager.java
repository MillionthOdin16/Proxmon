package com.pichillilorenzo.flutter_inappwebview;

import d.a.c.a.h;
import d.a.c.a.i;

/* loaded from: classes.dex */
public class WebViewFeatureManager implements i.c {
    static final String LOG_TAG = "WebViewFeatureManager";
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_webviewfeature");
        this.channel = iVar;
        iVar.e(this);
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        String str = hVar.f1873a;
        if (((str.hashCode() == 1329998754 && str.equals("isFeatureSupported")) ? (char) 0 : (char) 65535) != 0) {
            dVar.notImplemented();
        } else {
            dVar.success(Boolean.valueOf(b.l.h.a((String) hVar.a("feature"))));
        }
    }
}
