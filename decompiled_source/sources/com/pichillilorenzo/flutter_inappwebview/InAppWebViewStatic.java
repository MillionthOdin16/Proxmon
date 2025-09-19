package com.pichillilorenzo.flutter_inappwebview;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b.l.g;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppWebViewStatic implements i.c {
    protected static final String LOG_TAG = "InAppWebViewStatic";
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public InAppWebViewStatic(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_static");
        this.channel = iVar;
        iVar.e(this);
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, final i.d dVar) {
        char c2;
        Object defaultUserAgent;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1600358415:
                if (str.equals("setSafeBrowsingWhitelist")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 == 2) {
                    if (b.l.h.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                        defaultUserAgent = g.i().toString();
                    }
                    dVar.success(null);
                    return;
                }
                if (c2 != 3) {
                    if (c2 == 4) {
                        int i = Build.VERSION.SDK_INT;
                        if (i < 26) {
                            if (i >= 21) {
                                try {
                                    dVar.success(convertWebViewPackageToMap((PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0])));
                                    return;
                                } catch (Exception unused) {
                                }
                            }
                            dVar.success(null);
                            return;
                        }
                        defaultUserAgent = convertWebViewPackageToMap(g.d(this.plugin.activity));
                    } else if (c2 != 5) {
                        dVar.notImplemented();
                        return;
                    } else {
                        if (Build.VERSION.SDK_INT >= 19) {
                            WebView.setWebContentsDebuggingEnabled(((Boolean) hVar.a("debuggingEnabled")).booleanValue());
                        }
                        defaultUserAgent = Boolean.TRUE;
                    }
                } else if (b.l.h.a("SAFE_BROWSING_ALLOWLIST")) {
                    g.k(new HashSet((List) hVar.a("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                } else if (b.l.h.a("SAFE_BROWSING_WHITELIST")) {
                    g.l((List) hVar.a("hosts"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.3
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.InAppWebViewStatic.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dVar.success(Boolean.TRUE);
                    }
                });
                return;
            }
            defaultUserAgent = Boolean.FALSE;
        } else {
            defaultUserAgent = WebSettings.getDefaultUserAgent(this.plugin.applicationContext);
        }
        dVar.success(defaultUserAgent);
    }
}
