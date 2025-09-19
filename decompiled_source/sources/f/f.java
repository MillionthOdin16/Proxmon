package f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: e, reason: collision with root package name */
    static final char[] f2314e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f, reason: collision with root package name */
    public static final f f2315f = j(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    final byte[] f2316b;

    /* renamed from: c, reason: collision with root package name */
    transient int f2317c;

    /* renamed from: d, reason: collision with root package name */
    transient String f2318d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.f2316b = bArr;
    }

    static int b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((e(str.charAt(i2)) << 4) + e(str.charAt(i2 + 1)));
        }
        return j(bArr);
    }

    private static int e(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    private f f(String str) {
        try {
            return j(MessageDigest.getInstance(str).digest(this.f2316b));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(v.f2355a));
        fVar.f2318d = str;
        return fVar;
    }

    public static f j(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        return b.a(this.f2316b);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int o = o();
        int o2 = fVar.o();
        int min = Math.min(o, o2);
        for (int i = 0; i < min; i++) {
            int h = h(i) & 255;
            int h2 = fVar.h(i) & 255;
            if (h != h2) {
                return h < h2 ? -1 : 1;
            }
        }
        if (o == o2) {
            return 0;
        }
        return o < o2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int o = fVar.o();
            byte[] bArr = this.f2316b;
            if (o == bArr.length && fVar.l(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte h(int i) {
        return this.f2316b[i];
    }

    public int hashCode() {
        int i = this.f2317c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f2316b);
        this.f2317c = hashCode;
        return hashCode;
    }

    public String i() {
        byte[] bArr = this.f2316b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f2314e;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean k(int i, f fVar, int i2, int i3) {
        return fVar.l(i2, this.f2316b, i, i3);
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f2316b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && v.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public f m() {
        return f("SHA-1");
    }

    public f n() {
        return f("SHA-256");
    }

    public int o() {
        return this.f2316b.length;
    }

    public final boolean p(f fVar) {
        return k(0, fVar, 0, fVar.o());
    }

    public f q(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f2316b;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f2316b.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(this.f2316b, i, bArr2, 0, i3);
        return new f(bArr2);
    }

    public f r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f2316b;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr2);
            }
            i++;
        }
    }

    public byte[] s() {
        return (byte[]) this.f2316b.clone();
    }

    public String t() {
        String str = this.f2318d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2316b, v.f2355a);
        this.f2318d = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f2316b.length == 0) {
            return "[size=0]";
        }
        String t = t();
        int b2 = b(t, 64);
        if (b2 == -1) {
            if (this.f2316b.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(i());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f2316b.length);
                sb2.append(" hex=");
                sb2.append(q(0, 64).i());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = t.substring(0, b2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (b2 < t.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f2316b.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(c cVar) {
        byte[] bArr = this.f2316b;
        cVar.T(bArr, 0, bArr.length);
    }
}
