package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    private static e f1810a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized e a(Context context) {
        e eVar;
        synchronized (w1.class) {
            if (f1810a == null) {
                p0 p0Var = new p0(null);
                p0Var.b(new b3(c.b.a.a.a.d.a.a(context)));
                f1810a = p0Var.a();
            }
            eVar = f1810a;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(List<File> list) {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        c.b.a.a.a.a.c0.a(th, th2);
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static boolean c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(byte[] bArr, int i) {
        return ((g(bArr, i + 2) << 16) | g(bArr, i)) & 4294967295L;
    }

    public static boolean f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static boolean h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
