package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview.Options;
import com.pichillilorenzo.flutter_inappwebview.R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppBrowserOptions implements Options<InAppBrowserActivity> {
    public static final String LOG_TAG = "InAppBrowserOptions";
    public Boolean allowGoBackWithBackButton;
    public Boolean closeOnCannotGoBack;
    public Boolean hidden;
    public Boolean hideProgressBar;
    public Boolean hideTitleBar;
    public Boolean hideToolbarTop;
    public Boolean hideUrlBar;
    public Boolean shouldCloseOnBackButtonPressed;
    public String toolbarTopBackgroundColor;
    public String toolbarTopFixedTitle;

    public InAppBrowserOptions() {
        Boolean bool = Boolean.FALSE;
        this.hidden = bool;
        this.hideToolbarTop = bool;
        this.hideUrlBar = bool;
        this.hideProgressBar = bool;
        this.hideTitleBar = bool;
        Boolean bool2 = Boolean.TRUE;
        this.closeOnCannotGoBack = bool2;
        this.allowGoBackWithBackButton = bool2;
        this.shouldCloseOnBackButtonPressed = Boolean.FALSE;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(InAppBrowserActivity inAppBrowserActivity) {
        Map<String, Object> map = toMap();
        map.put("hideToolbarTop", Boolean.valueOf(!inAppBrowserActivity.actionBar.n()));
        map.put("hideUrlBar", Boolean.valueOf(!inAppBrowserActivity.menu.findItem(R.id.menu_search).isVisible()));
        map.put("hideProgressBar", Boolean.valueOf(inAppBrowserActivity.progressBar.getMax() == 0));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0026. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public InAppBrowserOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                char c2 = 65535;
                switch (key.hashCode()) {
                    case -1307803139:
                        if (key.equals("hideTitleBar")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -1217487446:
                        if (key.equals("hidden")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -842349289:
                        if (key.equals("allowGoBackWithBackButton")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case -809085252:
                        if (key.equals("hideToolbarTop")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -118493506:
                        if (key.equals("toolbarTopFixedTitle")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3851268:
                        if (key.equals("hideProgressBar")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 90270825:
                        if (key.equals("closeOnCannotGoBack")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 406250502:
                        if (key.equals("hideUrlBar")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 2111633307:
                        if (key.equals("toolbarTopBackgroundColor")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 2140270213:
                        if (key.equals("shouldCloseOnBackButtonPressed")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        this.hidden = (Boolean) value;
                        break;
                    case 1:
                        this.hideToolbarTop = (Boolean) value;
                        break;
                    case 2:
                        this.toolbarTopBackgroundColor = (String) value;
                        break;
                    case 3:
                        this.toolbarTopFixedTitle = (String) value;
                        break;
                    case 4:
                        this.hideUrlBar = (Boolean) value;
                        break;
                    case 5:
                        this.hideTitleBar = (Boolean) value;
                        break;
                    case 6:
                        this.closeOnCannotGoBack = (Boolean) value;
                        break;
                    case 7:
                        this.hideProgressBar = (Boolean) value;
                        break;
                    case '\b':
                        this.allowGoBackWithBackButton = (Boolean) value;
                        break;
                    case '\t':
                        this.shouldCloseOnBackButtonPressed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("hidden", this.hidden);
        hashMap.put("hideToolbarTop", this.hideToolbarTop);
        hashMap.put("toolbarTopBackgroundColor", this.toolbarTopBackgroundColor);
        hashMap.put("toolbarTopFixedTitle", this.toolbarTopFixedTitle);
        hashMap.put("hideUrlBar", this.hideUrlBar);
        hashMap.put("hideTitleBar", this.hideTitleBar);
        hashMap.put("closeOnCannotGoBack", this.closeOnCannotGoBack);
        hashMap.put("hideProgressBar", this.hideProgressBar);
        hashMap.put("allowGoBackWithBackButton", this.allowGoBackWithBackButton);
        hashMap.put("shouldCloseOnBackButtonPressed", this.shouldCloseOnBackButtonPressed);
        return hashMap;
    }
}
