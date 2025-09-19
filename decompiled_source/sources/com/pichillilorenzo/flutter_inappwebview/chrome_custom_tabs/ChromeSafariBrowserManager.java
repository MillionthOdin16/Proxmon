package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import d.a.c.a.h;
import d.a.c.a.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class ChromeSafariBrowserManager implements i.c {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public i channel;
    public String id = UUID.randomUUID().toString();
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_chromesafaribrowser");
        this.channel = iVar;
        iVar.e(this);
        shared.put(this.id, this);
    }

    public void dispose() {
        this.channel.e(null);
        shared.remove(this.id);
        this.plugin = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String str = (String) hVar.a("id");
        String str2 = hVar.f1873a;
        int hashCode = str2.hashCode();
        if (hashCode != 3417674) {
            if (hashCode == 444517567 && str2.equals("isAvailable")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str2.equals("open")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                dVar.notImplemented();
                return;
            } else {
                dVar.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(this.plugin.activity)));
                return;
            }
        }
        open(this.plugin.activity, str, (String) hVar.a("url"), (HashMap) hVar.a("options"), (List) hVar.a("menuItemList"), dVar);
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, List<HashMap<String, Object>> list, i.d dVar) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putBoolean("isData", false);
        bundle.putString("id", str);
        bundle.putString("managerId", this.id);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("menuItemList", (Serializable) list);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            dVar.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) ChromeCustomTabsActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
        dVar.success(Boolean.TRUE);
    }
}
