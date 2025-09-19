package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import d.a.c.a.h;
import d.a.c.a.i;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class MyCookieManager implements i.c {
    static final String LOG_TAG = "MyCookieManager";
    public static CookieManager cookieManager;
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager");
        this.channel = iVar;
        iVar.e(this);
        cookieManager = getCookieManager();
    }

    public static String getCookieExpirationDate(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e2;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public void deleteAllCookies(final i.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    dVar.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.plugin.applicationContext);
        createInstance.startSync();
        cookieManager.removeAllCookie();
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final i.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String str5 = str2 + "=; Path=" + str4 + "; Domain=" + str3 + "; Max-Age=-1;";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str5, new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    dVar.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.plugin.applicationContext);
        createInstance.startSync();
        cookieManager.setCookie(str, str5);
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }

    public void deleteCookies(String str, String str2, String str3, i.d dVar) {
        CookieSyncManager cookieSyncManager;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            if (Build.VERSION.SDK_INT < 21) {
                cookieSyncManager = CookieSyncManager.createInstance(this.plugin.applicationContext);
                cookieSyncManager.startSync();
            } else {
                cookieSyncManager = null;
            }
            for (String str4 : cookie.split(";")) {
                String str5 = str4.split("=", 2)[0].trim() + "=; Path=" + str3 + "; Domain=" + str2 + "; Max-Age=-1;";
                if (Build.VERSION.SDK_INT >= 21) {
                    cookieManager.setCookie(str, str5, null);
                } else {
                    cookieManager.setCookie(str, str5);
                }
            }
            if (cookieSyncManager != null) {
                cookieSyncManager.stopSync();
                cookieSyncManager.sync();
            } else if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.flush();
            }
        }
        dVar.success(Boolean.TRUE);
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String cookie;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null && (cookie = cookieManager2.getCookie(str)) != null) {
            for (String str2 : cookie.split(";")) {
                String[] split = str2.split("=", 2);
                String trim = split[0].trim();
                String trim2 = split.length > 1 ? split[1].trim() : BuildConfig.VERSION_NAME;
                HashMap hashMap = new HashMap();
                hashMap.put("name", trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", null);
                hashMap.put("isSessionOnly", null);
                hashMap.put("domain", null);
                hashMap.put("sameSite", null);
                hashMap.put("isSecure", null);
                hashMap.put("isHttpOnly", null);
                hashMap.put("path", null);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1222815761:
                if (str.equals("deleteCookie")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 126640486:
                if (str.equals("setCookie")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 747417188:
                if (str.equals("deleteCookies")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 822411705:
                if (str.equals("deleteAllCookies")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1989049945:
                if (str.equals("getCookies")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            String str2 = (String) hVar.a("url");
            String str3 = (String) hVar.a("name");
            String str4 = (String) hVar.a("value");
            String str5 = (String) hVar.a("domain");
            String str6 = (String) hVar.a("path");
            String str7 = (String) hVar.a("expiresDate");
            setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) hVar.a("maxAge"), (Boolean) hVar.a("isSecure"), (Boolean) hVar.a("isHttpOnly"), (String) hVar.a("sameSite"), dVar);
            return;
        }
        if (c2 == 1) {
            dVar.success(getCookies((String) hVar.a("url")));
            return;
        }
        if (c2 == 2) {
            deleteCookie((String) hVar.a("url"), (String) hVar.a("name"), (String) hVar.a("domain"), (String) hVar.a("path"), dVar);
            return;
        }
        if (c2 == 3) {
            deleteCookies((String) hVar.a("url"), (String) hVar.a("domain"), (String) hVar.a("path"), dVar);
        } else if (c2 != 4) {
            dVar.notImplemented();
        } else {
            deleteAllCookies(dVar);
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final i.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return;
        }
        String str7 = str2 + "=" + str3 + "; Domain=" + str4 + "; Path=" + str5;
        if (l != null) {
            str7 = str7 + "; Expires=" + getCookieExpirationDate(l);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        String str8 = str7 + ";";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str8, new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool3) {
                    dVar.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
            return;
        }
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.plugin.applicationContext);
        createInstance.startSync();
        cookieManager.setCookie(str, str8);
        dVar.success(Boolean.TRUE);
        createInstance.stopSync();
        createInstance.sync();
    }
}
