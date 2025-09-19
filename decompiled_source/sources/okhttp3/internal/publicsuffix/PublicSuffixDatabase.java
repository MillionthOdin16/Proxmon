package okhttp3.internal.publicsuffix;

import e.k0.l.f;
import f.e;
import f.j;
import f.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f2894e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f2895f = new String[0];
    private static final String[] g = {"*"};
    private static final PublicSuffixDatabase h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f2896a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f2897b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f2898c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f2899d;

    private static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    private String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.f2896a.get() || !this.f2896a.compareAndSet(false, true)) {
            try {
                this.f2897b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            f();
        }
        synchronized (this) {
            if (this.f2898c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.f2898c, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f2894e;
                str3 = a(this.f2898c, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a2 = a(this.f2899d, bArr, i);
                if (a2 != null) {
                    str = a2;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return g;
        }
        String[] split = str2 != null ? str2.split("\\.") : f2895f;
        String[] split2 = str3 != null ? str3.split("\\.") : f2895f;
        return split.length > split2.length ? split : split2;
    }

    public static PublicSuffixDatabase c() {
        return h;
    }

    private void e() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        e b2 = l.b(new j(l.f(resourceAsStream)));
        try {
            byte[] bArr = new byte[b2.readInt()];
            b2.readFully(bArr);
            byte[] bArr2 = new byte[b2.readInt()];
            b2.readFully(bArr2);
            if (b2 != null) {
                b2.close();
            }
            synchronized (this) {
                this.f2898c = bArr;
                this.f2899d = bArr2;
            }
            this.f2897b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private void f() {
        boolean z = false;
        while (true) {
            try {
                try {
                    e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    f.j().p(5, "Failed to read public suffix list", e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public String d(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] b2 = b(split);
        if (split.length == b2.length && b2[0].charAt(0) != '!') {
            return null;
        }
        char charAt = b2[0].charAt(0);
        int length = split.length;
        int length2 = b2.length;
        if (charAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
