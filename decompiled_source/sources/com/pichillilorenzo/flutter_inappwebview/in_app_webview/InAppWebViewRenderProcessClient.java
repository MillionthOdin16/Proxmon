package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.util.Log;
import android.webkit.WebView;
import b.l.h;
import b.l.j;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppWebViewRenderProcessClient extends j {
    protected static final String LOG_TAG = "IAWRenderProcessClient";
    private final i channel;

    public InAppWebViewRenderProcessClient(i iVar) {
        this.channel = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispose() {
    }

    @Override // b.l.j
    public void onRenderProcessResponsive(WebView webView, final b.l.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webView.getUrl());
        this.channel.d("onRenderProcessResponsive", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewRenderProcessClient.2
            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = BuildConfig.VERSION_NAME;
                }
                sb.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb.toString());
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null || iVar == null || num.intValue() != 0 || !h.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return;
                }
                iVar.a();
            }
        });
    }

    @Override // b.l.j
    public void onRenderProcessUnresponsive(WebView webView, final b.l.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webView.getUrl());
        this.channel.d("onRenderProcessUnresponsive", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewRenderProcessClient.1
            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = BuildConfig.VERSION_NAME;
                }
                sb.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb.toString());
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null || iVar == null || num.intValue() != 0 || !h.a("WEB_VIEW_RENDERER_TERMINATE")) {
                    return;
                }
                iVar.a();
            }
        });
    }
}
