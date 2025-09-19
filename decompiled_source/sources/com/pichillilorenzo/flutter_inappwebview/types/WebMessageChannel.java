package com.pichillilorenzo.flutter_inappwebview.types;

import b.l.e;
import b.l.f;
import b.l.g;
import b.l.h;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import d.a.c.a.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WebMessageChannel implements i.c {
    static final String LOG_TAG = "WebMessageChannel";
    public i channel;
    public String id;
    public final List<f> ports;
    private InAppWebView webView;

    public WebMessageChannel(String str, InAppWebView inAppWebView) {
        this.id = str;
        i iVar = new i(inAppWebView.plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_web_message_channel_" + str);
        this.channel = iVar;
        iVar.e(this);
        this.ports = new ArrayList(Arrays.asList(g.c(inAppWebView)));
        this.webView = inAppWebView;
    }

    public void dispose() {
        if (h.a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<f> it = this.ports.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
        }
        this.channel.e(null);
        this.ports.clear();
        this.webView = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
        char c2;
        String str = hVar.f1873a;
        int hashCode = str.hashCode();
        if (hashCode == 94756344) {
            if (str.equals("close")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 556190586) {
            if (hashCode == 1490029383 && str.equals("postMessage")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("setWebMessageCallback")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        try {
            if (c2 == 0) {
                if (this.webView != null && this.ports.size() > 0 && h.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
                    final Integer num = (Integer) hVar.a("index");
                    this.ports.get(num.intValue()).e(new f.a() { // from class: com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel.1
                        @Override // b.l.f.a
                        public void onMessage(f fVar, e eVar) {
                            super.onMessage(fVar, eVar);
                            HashMap hashMap = new HashMap();
                            hashMap.put("index", num);
                            hashMap.put("message", eVar != null ? eVar.a() : null);
                            WebMessageChannel.this.channel.c("onMessage", hashMap);
                        }
                    });
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.TRUE);
                return;
            }
            if (c2 != 1) {
                if (c2 != 2) {
                    dVar.notImplemented();
                    return;
                }
                if (this.webView != null && this.ports.size() > 0 && h.a("WEB_MESSAGE_PORT_CLOSE")) {
                    this.ports.get(((Integer) hVar.a("index")).intValue()).a();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.TRUE);
                return;
            }
            if (this.webView != null && this.ports.size() > 0 && h.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
                f fVar = this.ports.get(((Integer) hVar.a("index")).intValue());
                Map map = (Map) hVar.a("message");
                ArrayList arrayList = new ArrayList();
                List<Map> list = (List) map.get("ports");
                if (list != null) {
                    for (Map map2 : list) {
                        String str2 = (String) map2.get("webMessageChannelId");
                        Integer num2 = (Integer) map2.get("index");
                        WebMessageChannel webMessageChannel = this.webView.webMessageChannels.get(str2);
                        if (webMessageChannel != null) {
                            arrayList.add(webMessageChannel.ports.get(num2.intValue()));
                        }
                    }
                }
                fVar.d(new e((String) map.get("data"), (f[]) arrayList.toArray(new f[0])));
                dVar.success(Boolean.TRUE);
                return;
            }
            dVar.success(Boolean.TRUE);
            return;
        } catch (Exception e2) {
            dVar.error(LOG_TAG, e2.getMessage(), null);
        }
        dVar.error(LOG_TAG, e2.getMessage(), null);
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }
}
