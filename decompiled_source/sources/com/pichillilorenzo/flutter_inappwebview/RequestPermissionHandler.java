package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import androidx.core.app.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class RequestPermissionHandler implements a.b {
    private static Map<Integer, List<Runnable>> actionDictionary = new HashMap();

    public static void checkAndRun(Activity activity, String str, int i, Runnable runnable) {
        if (b.e.d.a.a(activity.getApplicationContext(), str) == 0) {
            runnable.run();
            return;
        }
        if (actionDictionary.containsKey(Integer.valueOf(i))) {
            actionDictionary.get(Integer.valueOf(i)).add(runnable);
        } else {
            actionDictionary.put(Integer.valueOf(i), Arrays.asList(runnable));
        }
        a.m(activity, new String[]{str}, i);
    }

    @Override // androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            return;
        }
        List<Runnable> list = actionDictionary.get(Integer.valueOf(i));
        for (Runnable runnable : list) {
            runnable.run();
            list.remove(runnable);
        }
    }
}
