package io.flutter.plugins;

import androidx.annotation.Keep;
import c.a.a.a;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import io.flutter.embedding.engine.b;
import io.flutter.plugins.b.h;
import io.flutter.plugins.urllauncher.c;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(b bVar) {
        try {
            bVar.p().g(new a());
        } catch (Exception e2) {
            d.a.b.c(TAG, "Error registering plugin app_review, com.appleeducate.appreview.AppReviewPlugin", e2);
        }
        try {
            bVar.p().g(new InAppWebViewFlutterPlugin());
        } catch (Exception e3) {
            d.a.b.c(TAG, "Error registering plugin flutter_inappwebview, com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin", e3);
        }
        try {
            bVar.p().g(new c.c.a.a());
        } catch (Exception e4) {
            d.a.b.c(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e4);
        }
        try {
            bVar.p().g(new io.flutter.plugins.a.a());
        } catch (Exception e5) {
            d.a.b.c(TAG, "Error registering plugin package_info, io.flutter.plugins.packageinfo.PackageInfoPlugin", e5);
        }
        try {
            bVar.p().g(new h());
        } catch (Exception e6) {
            d.a.b.c(TAG, "Error registering plugin path_provider, io.flutter.plugins.pathprovider.PathProviderPlugin", e6);
        }
        try {
            bVar.p().g(new io.flutter.plugins.c.b());
        } catch (Exception e7) {
            d.a.b.c(TAG, "Error registering plugin shared_preferences, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e7);
        }
        try {
            bVar.p().g(new c());
        } catch (Exception e8) {
            d.a.b.c(TAG, "Error registering plugin url_launcher, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e8);
        }
    }
}
