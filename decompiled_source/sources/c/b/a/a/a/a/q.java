package c.b.a.a.a.a;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.io.File;

/* loaded from: classes.dex */
public final class q {
    public static String a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.VERSION_NAME).replace("base-", "config.").replace("-", ".config.").replace(".config.master", BuildConfig.VERSION_NAME).replace("config.master", BuildConfig.VERSION_NAME);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static <T> void b(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    public static void c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
