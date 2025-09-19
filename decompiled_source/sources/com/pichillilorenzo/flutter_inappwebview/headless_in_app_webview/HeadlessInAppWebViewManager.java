package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HeadlessInAppWebViewManager implements i.c {
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final Map<String, HeadlessInAppWebView> webViews = new HashMap();
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview");
        this.channel = iVar;
        iVar.e(this);
    }

    public void dispose() {
        this.channel.e(null);
        webViews.clear();
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        String str = (String) hVar.a("id");
        String str2 = hVar.f1873a;
        if (((str2.hashCode() == 113291 && str2.equals("run")) ? (char) 0 : (char) 65535) != 0) {
            dVar.notImplemented();
        } else {
            run(str, (HashMap) hVar.a("params"));
            dVar.success(Boolean.TRUE);
        }
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, inAppWebViewFlutterPlugin.activity, str, hashMap);
        HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
        webViews.put(str, headlessInAppWebView);
        headlessInAppWebView.prepare(hashMap);
        headlessInAppWebView.onWebViewCreated();
        flutterWebView.makeInitialLoad(hashMap);
    }
}
