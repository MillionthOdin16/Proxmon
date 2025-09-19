package com.pichillilorenzo.flutter_inappwebview.types;

import android.net.Uri;
import android.webkit.WebView;
import b.l.a;
import b.l.e;
import b.l.g;
import d.a.c.a.b;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class WebMessageListener implements i.c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String LOG_TAG = "WebMessageListener";
    public Set<String> allowedOriginRules;
    public i channel;
    public String jsObjectName;
    public g.a listener;
    public a replyProxy;

    public WebMessageListener(b bVar, String str, Set<String> set) {
        this.jsObjectName = str;
        this.allowedOriginRules = set;
        i iVar = new i(bVar, "com.pichillilorenzo/flutter_inappwebview_web_message_listener_" + this.jsObjectName);
        this.channel = iVar;
        iVar.e(this);
        this.listener = new g.a() { // from class: com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener.1
            @Override // b.l.g.a
            public void onPostMessage(WebView webView, e eVar, Uri uri, boolean z, a aVar) {
                WebMessageListener.this.replyProxy = aVar;
                HashMap hashMap = new HashMap();
                hashMap.put("message", eVar.a());
                hashMap.put("sourceOrigin", uri.toString().equals("null") ? null : uri.toString());
                hashMap.put("isMainFrame", Boolean.valueOf(z));
                WebMessageListener.this.channel.c("onPostMessage", hashMap);
            }
        };
    }

    public static WebMessageListener fromMap(b bVar, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener(bVar, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void dispose() {
        this.channel.e(null);
        this.listener = null;
        this.replyProxy = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        String str = hVar.f1873a;
        if (((str.hashCode() == 1490029383 && str.equals("postMessage")) ? (char) 0 : (char) 65535) != 0) {
            dVar.notImplemented();
            return;
        }
        if (this.replyProxy != null && b.l.h.a("WEB_MESSAGE_LISTENER")) {
            this.replyProxy.a((String) hVar.a("message"));
        }
        dVar.success(Boolean.TRUE);
    }
}
