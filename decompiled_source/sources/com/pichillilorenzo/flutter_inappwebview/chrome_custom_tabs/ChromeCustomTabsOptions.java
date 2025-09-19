package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview.Options;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ChromeCustomTabsOptions implements Options<ChromeCustomTabsActivity> {
    static final String LOG_TAG = "ChromeCustomTabsOptions";
    public Boolean addDefaultShareMenuItem;
    public Boolean enableUrlBarHiding;
    public Boolean instantAppsEnabled;
    public Boolean keepAliveEnabled;
    public String packageName;
    public Boolean showTitle;
    public String toolbarBackgroundColor;

    public ChromeCustomTabsOptions() {
        Boolean bool = Boolean.TRUE;
        this.addDefaultShareMenuItem = bool;
        this.showTitle = bool;
        Boolean bool2 = Boolean.FALSE;
        this.enableUrlBarHiding = bool2;
        this.instantAppsEnabled = bool2;
        this.keepAliveEnabled = bool2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(ChromeCustomTabsActivity chromeCustomTabsActivity) {
        Intent intent;
        Map<String, Object> map = toMap();
        if (chromeCustomTabsActivity != null && (intent = chromeCustomTabsActivity.getIntent()) != null) {
            map.put("packageName", intent.getPackage());
            map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra("android.support.customtabs.extra.KEEP_ALIVE")));
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public ChromeCustomTabsOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                char c2 = 65535;
                switch (key.hashCode()) {
                    case -2112880751:
                        if (key.equals("addDefaultShareMenuItem")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1913803429:
                        if (key.equals("showTitle")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -227713574:
                        if (key.equals("toolbarBackgroundColor")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 137483238:
                        if (key.equals("enableUrlBarHiding")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 472764366:
                        if (key.equals("instantAppsEnabled")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 908759025:
                        if (key.equals("packageName")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 2126240217:
                        if (key.equals("keepAliveEnabled")) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        this.addDefaultShareMenuItem = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 1:
                        this.showTitle = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 2:
                        this.toolbarBackgroundColor = (String) value;
                        break;
                    case 3:
                        this.enableUrlBarHiding = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 4:
                        this.instantAppsEnabled = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                    case 5:
                        this.packageName = (String) value;
                        break;
                    case 6:
                        this.keepAliveEnabled = Boolean.valueOf(((Boolean) value).booleanValue());
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
        hashMap.put("showTitle", this.showTitle);
        hashMap.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
        hashMap.put("enableUrlBarHiding", this.enableUrlBarHiding);
        hashMap.put("instantAppsEnabled", this.instantAppsEnabled);
        hashMap.put("packageName", this.packageName);
        hashMap.put("keepAliveEnabled", this.keepAliveEnabled);
        return hashMap;
    }
}
