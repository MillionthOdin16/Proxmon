package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {
    public static d a(long j, Map<String, c> map) {
        return new i0(j, map);
    }

    public static d b(Bundle bundle, y0 y0Var) {
        return c(bundle, y0Var, new ArrayList());
    }

    public static d c(Bundle bundle, y0 y0Var, List<String> list) {
        return d(bundle, y0Var, list, b0.f1564a);
    }

    private static d d(Bundle bundle, y0 y0Var, List<String> list, z zVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, c.a(bundle, str, y0Var, zVar));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, c.b(str2, 4, 0, 0L, 0L, 0.0d));
        }
        return a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, c> e();

    public abstract long f();
}
