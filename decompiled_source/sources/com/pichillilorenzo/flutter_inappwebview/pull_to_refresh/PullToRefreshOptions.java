package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview.Options;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PullToRefreshOptions implements Options<PullToRefreshLayout> {
    public static final String LOG_TAG = "PullToRefreshOptions";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled = Boolean.TRUE;
    public Integer size;
    public Integer slingshotDistance;

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> getRealOptions(PullToRefreshLayout pullToRefreshLayout) {
        return toMap();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public /* bridge */ /* synthetic */ Options parse(Map map) {
        return parse((Map<String, Object>) map);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public PullToRefreshOptions parse(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                char c2 = 65535;
                switch (key.hashCode()) {
                    case -1878912765:
                        if (key.equals("distanceToTriggerSync")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1609594047:
                        if (key.equals("enabled")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3530753:
                        if (key.equals("size")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 94842723:
                        if (key.equals("color")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1287124693:
                        if (key.equals("backgroundColor")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1719097976:
                        if (key.equals("slingshotDistance")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    this.enabled = (Boolean) value;
                } else if (c2 == 1) {
                    this.color = (String) value;
                } else if (c2 == 2) {
                    this.backgroundColor = (String) value;
                } else if (c2 == 3) {
                    this.distanceToTriggerSync = (Integer) value;
                } else if (c2 == 4) {
                    this.slingshotDistance = (Integer) value;
                } else if (c2 == 5) {
                    this.size = (Integer) value;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.Options
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", this.enabled);
        hashMap.put("color", this.color);
        hashMap.put("backgroundColor", this.backgroundColor);
        hashMap.put("distanceToTriggerSync", this.distanceToTriggerSync);
        hashMap.put("slingshotDistance", this.slingshotDistance);
        hashMap.put("size", this.size);
        return hashMap;
    }
}
