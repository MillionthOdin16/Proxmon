package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import d.a.c.a.h;
import d.a.c.a.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class PlatformUtil implements i.c {
    protected static final String LOG_TAG = "PlatformUtil";
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_platformutil");
        this.channel = iVar;
        iVar.e(this);
    }

    public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] split = str.split("_");
        String str2 = split[0];
        int length = split.length;
        String str3 = BuildConfig.VERSION_NAME;
        String str4 = length > 1 ? split[1] : BuildConfig.VERSION_NAME;
        if (split.length > 2) {
            str3 = split[2];
        }
        return new Locale(str2, str4, str3);
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        String valueOf;
        String str = hVar.f1873a;
        int hashCode = str.hashCode();
        if (hashCode != 323323973) {
            if (hashCode == 1262746611 && str.equals("getSystemVersion")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("formatDate")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            valueOf = String.valueOf(Build.VERSION.SDK_INT);
        } else {
            if (c2 != 1) {
                dVar.notImplemented();
                return;
            }
            long longValue = ((Long) hVar.a("date")).longValue();
            String str2 = (String) hVar.a("format");
            Locale localeFromString = getLocaleFromString((String) hVar.a("locale"));
            String str3 = (String) hVar.a("timezone");
            if (str3 == null) {
                str3 = "UTC";
            }
            valueOf = formatDate(longValue, str2, localeFromString, TimeZone.getTimeZone(str3));
        }
        dVar.success(valueOf);
    }
}
