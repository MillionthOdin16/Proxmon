package com.google.android.play.core.assetpacks.a3;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Integer, String> f1562a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f1563b = new HashMap();

    static {
        f1562a.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        f1562a.put(-2, "The requested pack is not available.");
        f1562a.put(-3, "The request is invalid.");
        f1562a.put(-4, "The requested download is not found.");
        f1562a.put(-5, "The Asset Delivery API is not available.");
        f1562a.put(-6, "Network error. Unable to obtain the asset pack details.");
        f1562a.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        f1562a.put(-10, "Asset pack download failed due to insufficient storage.");
        f1562a.put(-11, "The Play Store app is either not installed or not the official version.");
        f1562a.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        f1562a.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f1562a.put(-100, "Unknown error downloading an asset pack.");
        f1563b.put(-1, "APP_UNAVAILABLE");
        f1563b.put(-2, "PACK_UNAVAILABLE");
        f1563b.put(-3, "INVALID_REQUEST");
        f1563b.put(-4, "DOWNLOAD_NOT_FOUND");
        f1563b.put(-5, "API_NOT_AVAILABLE");
        f1563b.put(-6, "NETWORK_ERROR");
        f1563b.put(-7, "ACCESS_DENIED");
        f1563b.put(-10, "INSUFFICIENT_STORAGE");
        f1563b.put(-11, "PLAY_STORE_NOT_FOUND");
        f1563b.put(-12, "NETWORK_UNRESTRICTED");
        f1563b.put(-13, "APP_NOT_OWNED");
        f1563b.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i) {
        Map<Integer, String> map = f1562a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return BuildConfig.VERSION_NAME;
        }
        String str = f1562a.get(valueOf);
        String str2 = f1563b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
