package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Map<String, Integer>> f1850a;

    static {
        new HashSet(Arrays.asList("review"));
        new HashSet(Arrays.asList("native", "unity"));
        f1850a = new HashMap();
        new c.b.a.a.a.a.e("PlayCoreVersion");
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> b2 = b("review");
        bundle.putInt("playcore_version_code", b2.get("java").intValue());
        if (b2.containsKey("native")) {
            bundle.putInt("playcore_native_version", b2.get("native").intValue());
        }
        if (b2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b2.get("unity").intValue());
        }
        return bundle;
    }

    public static synchronized Map<String, Integer> b(String str) {
        Map<String, Integer> map;
        synchronized (b.class) {
            if (!f1850a.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10800);
                f1850a.put(str, hashMap);
            }
            map = f1850a.get(str);
        }
        return map;
    }
}
