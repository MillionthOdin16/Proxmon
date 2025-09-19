package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import d.a.c.a.p;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FlutterWebViewFactory extends g {
    private final InAppWebViewFlutterPlugin plugin;

    public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(p.f1884a);
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // io.flutter.plugin.platform.g
    public f create(Context context, int i, Object obj) {
        HashMap<String, Object> hashMap = (HashMap) obj;
        FlutterWebView flutterWebView = new FlutterWebView(this.plugin, context, Integer.valueOf(i), hashMap);
        flutterWebView.makeInitialLoad(hashMap);
        return flutterWebView;
    }
}
