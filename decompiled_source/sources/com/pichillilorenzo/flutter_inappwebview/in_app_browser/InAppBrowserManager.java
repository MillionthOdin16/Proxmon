package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import d.a.c.a.h;
import d.a.c.a.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class InAppBrowserManager implements i.c {
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final Map<String, InAppBrowserManager> shared = new HashMap();
    public i channel;
    public String id = UUID.randomUUID().toString();
    public InAppWebViewFlutterPlugin plugin;

    public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappbrowser");
        this.channel = iVar;
        iVar.e(this);
        shared.put(this.id, this);
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public void dispose() {
        this.channel.e(null);
        shared.remove(this.id);
        this.plugin = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = hVar.f1873a;
        int hashCode = str.hashCode();
        if (hashCode != -2119567959) {
            if (hashCode == 3417674 && str.equals("open")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("openWithSystemBrowser")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            open(this.plugin.activity, (Map) hVar.b());
            dVar.success(Boolean.TRUE);
        } else if (c2 != 1) {
            dVar.notImplemented();
        } else {
            openWithSystemBrowser(this.plugin.activity, (String) hVar.a("url"), dVar);
        }
    }

    public void open(Activity activity, Map<String, Object> map) {
        String str = (String) map.get("id");
        Map map2 = (Map) map.get("urlRequest");
        String str2 = (String) map.get("assetFilePath");
        String str3 = (String) map.get("data");
        String str4 = (String) map.get("mimeType");
        String str5 = (String) map.get("encoding");
        String str6 = (String) map.get("baseUrl");
        String str7 = (String) map.get("historyUrl");
        Map map3 = (Map) map.get("options");
        Map map4 = (Map) map.get("contextMenu");
        Integer num = (Integer) map.get("windowId");
        List list = (List) map.get("initialUserScripts");
        Map map5 = (Map) map.get("pullToRefreshOptions");
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable) map2);
        bundle.putString("initialFile", str2);
        bundle.putString("initialData", str3);
        bundle.putString("initialMimeType", str4);
        bundle.putString("initialEncoding", str5);
        bundle.putString("initialBaseUrl", str6);
        bundle.putString("initialHistoryUrl", str7);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("options", (Serializable) map3);
        bundle.putSerializable("contextMenu", (Serializable) map4);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        bundle.putSerializable("initialUserScripts", (Serializable) list);
        bundle.putSerializable("pullToRefreshInitialOptions", (Serializable) map5);
        startInAppBrowserActivity(activity, bundle);
    }

    public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                z = true;
            } else {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList.add(intent2);
            }
        }
        if (z && arrayList.size() != 0) {
            if (arrayList.size() == 1) {
                intent = (Intent) arrayList.get(0);
            } else {
                if (arrayList.size() <= 0) {
                    return;
                }
                intent = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), null);
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            }
        }
        activity.startActivity(intent);
    }

    public void openWithSystemBrowser(Activity activity, String str, i.d dVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if ("file".equals(parse.getScheme())) {
                intent.setDataAndType(parse, getMimeType(str));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            openExternalExcludeCurrentApp(activity, intent);
            dVar.success(Boolean.TRUE);
        } catch (RuntimeException e2) {
            Log.d(LOG_TAG, str + " cannot be opened: " + e2.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" cannot be opened!");
            dVar.error(LOG_TAG, sb.toString(), null);
        }
    }

    public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, (Class<?>) InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
