package e.k0.k;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static final f.f f2123a = f.f.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2124b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    static final String[] f2125c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    static final String[] f2126d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f2126d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = e.k0.e.o("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f2125c;
        strArr2[0] = BuildConfig.VERSION_NAME;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            f2125c[i4 | 8] = f2125c[i4] + "|PADDED";
        }
        String[] strArr3 = f2125c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                f2125c[i9] = f2125c[i8] + '|' + f2125c[i6];
                f2125c[i9 | 8] = f2125c[i8] + '|' + f2125c[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr4 = f2125c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f2126d[i];
            }
            i++;
        }
    }

    private e() {
    }

    static String a(byte b2, byte b3) {
        if (b3 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (b2 != 2 && b2 != 3) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : f2126d[b3];
            }
            if (b2 != 7 && b2 != 8) {
                String[] strArr = f2125c;
                String str = b3 < strArr.length ? strArr[b3] : f2126d[b3];
                return (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f2126d[b3];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(boolean z, int i, int i2, byte b2, byte b3) {
        String[] strArr = f2124b;
        String o = b2 < strArr.length ? strArr[b2] : e.k0.e.o("0x%02x", Byte.valueOf(b2));
        String a2 = a(b2, b3);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = o;
        objArr[4] = a2;
        return e.k0.e.o("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(e.k0.e.o(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException d(String str, Object... objArr) {
        throw new IOException(e.k0.e.o(str, objArr));
    }
}
