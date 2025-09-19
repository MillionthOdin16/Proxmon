package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import com.pichillilorenzo.flutter_inappwebview.Options;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ContextMenuOptions implements Options<Object> {
    public static final String LOG_TAG = "ContextMenuOptions";
    public Boolean hideDefaultSystemContextMenuItems = Boolean.FALSE;

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(Object obj) {
        return toMap();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public ContextMenuOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                char c2 = 65535;
                if (key.hashCode() == -1069507968 && key.equals("hideDefaultSystemContextMenuItems")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    this.hideDefaultSystemContextMenuItems = (Boolean) value;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("hideDefaultSystemContextMenuItems", this.hideDefaultSystemContextMenuItems);
        return hashMap;
    }
}
