package f;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f2311d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b, reason: collision with root package name */
    p f2312b;

    /* renamed from: c, reason: collision with root package name */
    long f2313c;

    public final void A() {
        try {
            l(this.f2313c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f2313c == 0) {
            return cVar;
        }
        p d2 = this.f2312b.d();
        cVar.f2312b = d2;
        d2.g = d2;
        d2.f2348f = d2;
        p pVar = this.f2312b;
        while (true) {
            pVar = pVar.f2348f;
            if (pVar == this.f2312b) {
                cVar.f2313c = this.f2313c;
                return cVar;
            }
            cVar.f2312b.g.c(pVar.d());
        }
    }

    public final long C() {
        long j = this.f2313c;
        if (j == 0) {
            return 0L;
        }
        p pVar = this.f2312b.g;
        return (pVar.f2345c >= 8192 || !pVar.f2347e) ? j : j - (r3 - pVar.f2344b);
    }

    public final c D(c cVar, long j, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        v.b(this.f2313c, j, j2);
        if (j2 == 0) {
            return this;
        }
        cVar.f2313c += j2;
        p pVar = this.f2312b;
        while (true) {
            int i = pVar.f2345c;
            int i2 = pVar.f2344b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            pVar = pVar.f2348f;
        }
        while (j2 > 0) {
            p d2 = pVar.d();
            int i3 = (int) (d2.f2344b + j);
            d2.f2344b = i3;
            d2.f2345c = Math.min(i3 + ((int) j2), d2.f2345c);
            p pVar2 = cVar.f2312b;
            if (pVar2 == null) {
                d2.g = d2;
                d2.f2348f = d2;
                cVar.f2312b = d2;
            } else {
                pVar2.g.c(d2);
            }
            j2 -= d2.f2345c - d2.f2344b;
            pVar = pVar.f2348f;
            j = 0;
        }
        return this;
    }

    public c E() {
        return this;
    }

    public final byte F(long j) {
        int i;
        v.b(this.f2313c, j, 1L);
        long j2 = this.f2313c;
        if (j2 - j <= j) {
            long j3 = j - j2;
            p pVar = this.f2312b;
            do {
                pVar = pVar.g;
                int i2 = pVar.f2345c;
                i = pVar.f2344b;
                j3 += i2 - i;
            } while (j3 < 0);
            return pVar.f2343a[i + ((int) j3)];
        }
        p pVar2 = this.f2312b;
        while (true) {
            int i3 = pVar2.f2345c;
            int i4 = pVar2.f2344b;
            long j4 = i3 - i4;
            if (j < j4) {
                return pVar2.f2343a[i4 + ((int) j)];
            }
            j -= j4;
            pVar2 = pVar2.f2348f;
        }
    }

    public long G(byte b2, long j, long j2) {
        p pVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f2313c), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f2313c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (pVar = this.f2312b) == null) {
            return -1L;
        }
        long j5 = this.f2313c;
        if (j5 - j < j) {
            while (j5 > j) {
                pVar = pVar.g;
                j5 -= pVar.f2345c - pVar.f2344b;
            }
        } else {
            while (true) {
                long j6 = (pVar.f2345c - pVar.f2344b) + j3;
                if (j6 >= j) {
                    break;
                }
                pVar = pVar.f2348f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = pVar.f2343a;
            int min = (int) Math.min(pVar.f2345c, (pVar.f2344b + j4) - j5);
            for (int i = (int) ((pVar.f2344b + j7) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - pVar.f2344b) + j5;
                }
            }
            j5 += pVar.f2345c - pVar.f2344b;
            pVar = pVar.f2348f;
            j7 = j5;
        }
        return -1L;
    }

    public int H(byte[] bArr, int i, int i2) {
        v.b(bArr.length, i, i2);
        p pVar = this.f2312b;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(i2, pVar.f2345c - pVar.f2344b);
        System.arraycopy(pVar.f2343a, pVar.f2344b, bArr, i, min);
        int i3 = pVar.f2344b + min;
        pVar.f2344b = i3;
        this.f2313c -= min;
        if (i3 == pVar.f2345c) {
            this.f2312b = pVar.b();
            q.a(pVar);
        }
        return min;
    }

    public f I() {
        return new f(p());
    }

    public String J(long j, Charset charset) {
        v.b(this.f2313c, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return BuildConfig.VERSION_NAME;
        }
        p pVar = this.f2312b;
        if (pVar.f2344b + j > pVar.f2345c) {
            return new String(y(j), charset);
        }
        String str = new String(pVar.f2343a, pVar.f2344b, (int) j, charset);
        int i = (int) (pVar.f2344b + j);
        pVar.f2344b = i;
        this.f2313c -= j;
        if (i == pVar.f2345c) {
            this.f2312b = pVar.b();
            q.a(pVar);
        }
        return str;
    }

    public String K() {
        try {
            return J(this.f2313c, v.f2355a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String L(long j) {
        return J(j, v.f2355a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String M(long j) {
        String L;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (F(j3) == 13) {
                L = L(j3);
                j2 = 2;
                l(j2);
                return L;
            }
        }
        L = L(j);
        l(j2);
        return L;
    }

    public final long N() {
        return this.f2313c;
    }

    public final f O() {
        long j = this.f2313c;
        if (j <= 2147483647L) {
            return P((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f2313c);
    }

    public final f P(int i) {
        return i == 0 ? f.f2315f : new r(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p Q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        p pVar = this.f2312b;
        if (pVar == null) {
            p b2 = q.b();
            this.f2312b = b2;
            b2.g = b2;
            b2.f2348f = b2;
            return b2;
        }
        p pVar2 = pVar.g;
        if (pVar2.f2345c + i <= 8192 && pVar2.f2347e) {
            return pVar2;
        }
        p b3 = q.b();
        pVar2.c(b3);
        return b3;
    }

    public c R(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.u(this);
        return this;
    }

    public c S(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        T(bArr, 0, bArr.length);
        return this;
    }

    public c T(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        v.b(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            p Q = Q(1);
            int min = Math.min(i3 - i, 8192 - Q.f2345c);
            System.arraycopy(bArr, i, Q.f2343a, Q.f2345c, min);
            i += min;
            Q.f2345c += min;
        }
        this.f2313c += j;
        return this;
    }

    public long U(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long i = tVar.i(this, 8192L);
            if (i == -1) {
                return j;
            }
            j += i;
        }
    }

    public c V(int i) {
        p Q = Q(1);
        byte[] bArr = Q.f2343a;
        int i2 = Q.f2345c;
        Q.f2345c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f2313c++;
        return this;
    }

    public c W(long j) {
        if (j == 0) {
            V(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        p Q = Q(numberOfTrailingZeros);
        byte[] bArr = Q.f2343a;
        int i = Q.f2345c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f2311d[(int) (15 & j)];
            j >>>= 4;
        }
        Q.f2345c += numberOfTrailingZeros;
        this.f2313c += numberOfTrailingZeros;
        return this;
    }

    public c X(int i) {
        p Q = Q(4);
        byte[] bArr = Q.f2343a;
        int i2 = Q.f2345c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        Q.f2345c = i5 + 1;
        this.f2313c += 4;
        return this;
    }

    public c Y(int i) {
        p Q = Q(2);
        byte[] bArr = Q.f2343a;
        int i2 = Q.f2345c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        Q.f2345c = i3 + 1;
        this.f2313c += 2;
        return this;
    }

    public c Z(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(v.f2355a)) {
            b0(str, i, i2);
            return this;
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        T(bytes, 0, bytes.length);
        return this;
    }

    @Override // f.e, f.d
    public c a() {
        return this;
    }

    public c a0(String str) {
        b0(str, 0, str.length());
        return this;
    }

    @Override // f.t
    public u b() {
        return u.f2351d;
    }

    public c b0(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                p Q = Q(1);
                byte[] bArr = Q.f2343a;
                int i4 = Q.f2345c - i;
                int min = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = Q.f2345c;
                int i7 = (i4 + i5) - i6;
                Q.f2345c = i6 + i7;
                this.f2313c += i7;
                i = i5;
            } else {
                if (charAt < 2048) {
                    i3 = (charAt >> 6) | 192;
                } else if (charAt < 55296 || charAt > 57343) {
                    V((charAt >> '\f') | 224);
                    i3 = ((charAt >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        V(63);
                        i = i8;
                    } else {
                        int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        V((i9 >> 18) | 240);
                        V(((i9 >> 12) & 63) | 128);
                        V(((i9 >> 6) & 63) | 128);
                        V((i9 & 63) | 128);
                        i += 2;
                    }
                }
                V(i3);
                V((charAt & '?') | 128);
                i++;
            }
        }
        return this;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d c(byte[] bArr) {
        S(bArr);
        return this;
    }

    public c c0(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        V(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else {
                    if (i > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    V((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                V(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            V(i3);
            i = (i & 63) | 128;
        }
        V(i);
        return this;
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d d(byte[] bArr, int i, int i2) {
        T(bArr, i, i2);
        return this;
    }

    @Override // f.s
    public void e(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.b(cVar.f2313c, 0L, j);
        while (j > 0) {
            p pVar = cVar.f2312b;
            if (j < pVar.f2345c - pVar.f2344b) {
                p pVar2 = this.f2312b;
                p pVar3 = pVar2 != null ? pVar2.g : null;
                if (pVar3 != null && pVar3.f2347e) {
                    if ((pVar3.f2345c + j) - (pVar3.f2346d ? 0 : pVar3.f2344b) <= 8192) {
                        cVar.f2312b.f(pVar3, (int) j);
                        cVar.f2313c -= j;
                        this.f2313c += j;
                        return;
                    }
                }
                cVar.f2312b = cVar.f2312b.e((int) j);
            }
            p pVar4 = cVar.f2312b;
            long j2 = pVar4.f2345c - pVar4.f2344b;
            cVar.f2312b = pVar4.b();
            p pVar5 = this.f2312b;
            if (pVar5 == null) {
                this.f2312b = pVar4;
                pVar4.g = pVar4;
                pVar4.f2348f = pVar4;
            } else {
                pVar5.g.c(pVar4);
                pVar4.a();
            }
            cVar.f2313c -= j2;
            this.f2313c += j2;
            j -= j2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.f2313c;
        if (j != cVar.f2313c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        p pVar = this.f2312b;
        p pVar2 = cVar.f2312b;
        int i = pVar.f2344b;
        int i2 = pVar2.f2344b;
        while (j2 < this.f2313c) {
            long min = Math.min(pVar.f2345c - i, pVar2.f2345c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (pVar.f2343a[i] != pVar2.f2343a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == pVar.f2345c) {
                pVar = pVar.f2348f;
                i = pVar.f2344b;
            }
            if (i2 == pVar2.f2345c) {
                pVar2 = pVar2.f2348f;
                i2 = pVar2.f2344b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // f.e
    public short f() {
        return v.d(readShort());
    }

    @Override // f.d, f.s, java.io.Flushable
    public void flush() {
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d g() {
        E();
        return this;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d h(long j) {
        W(j);
        return this;
    }

    public int hashCode() {
        p pVar = this.f2312b;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f2345c;
            for (int i3 = pVar.f2344b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f2343a[i3];
            }
            pVar = pVar.f2348f;
        } while (pVar != this.f2312b);
        return i;
    }

    @Override // f.t
    public long i(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.f2313c;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        cVar.e(this, j);
        return j;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // f.e
    public f j(long j) {
        return new f(y(j));
    }

    @Override // f.e
    public String k(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long G = G((byte) 10, 0L, j2);
        if (G != -1) {
            return M(G);
        }
        if (j2 < N() && F(j2 - 1) == 13 && F(j2) == 10) {
            return M(j2);
        }
        c cVar = new c();
        D(cVar, 0L, Math.min(32L, N()));
        throw new EOFException("\\n not found: limit=" + Math.min(N(), j) + " content=" + cVar.I().i() + (char) 8230);
    }

    @Override // f.e
    public void l(long j) {
        while (j > 0) {
            if (this.f2312b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.f2345c - r0.f2344b);
            long j2 = min;
            this.f2313c -= j2;
            j -= j2;
            p pVar = this.f2312b;
            int i = pVar.f2344b + min;
            pVar.f2344b = i;
            if (i == pVar.f2345c) {
                this.f2312b = pVar.b();
                q.a(pVar);
            }
        }
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d m(int i) {
        Y(i);
        return this;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d n(int i) {
        X(i);
        return this;
    }

    @Override // f.e
    public String o() {
        return k(Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] p() {
        try {
            return y(this.f2313c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // f.e
    public void q(long j) {
        if (this.f2313c < j) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        p pVar = this.f2312b;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pVar.f2345c - pVar.f2344b);
        byteBuffer.put(pVar.f2343a, pVar.f2344b, min);
        int i = pVar.f2344b + min;
        pVar.f2344b = i;
        this.f2313c -= min;
        if (i == pVar.f2345c) {
            this.f2312b = pVar.b();
            q.a(pVar);
        }
        return min;
    }

    @Override // f.e
    public byte readByte() {
        long j = this.f2313c;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        p pVar = this.f2312b;
        int i = pVar.f2344b;
        int i2 = pVar.f2345c;
        int i3 = i + 1;
        byte b2 = pVar.f2343a[i];
        this.f2313c = j - 1;
        if (i3 == i2) {
            this.f2312b = pVar.b();
            q.a(pVar);
        } else {
            pVar.f2344b = i3;
        }
        return b2;
    }

    @Override // f.e
    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int H = H(bArr, i, bArr.length - i);
            if (H == -1) {
                throw new EOFException();
            }
            i += H;
        }
    }

    @Override // f.e
    public int readInt() {
        long j = this.f2313c;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f2313c);
        }
        p pVar = this.f2312b;
        int i = pVar.f2344b;
        int i2 = pVar.f2345c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = pVar.f2343a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f2313c = j - 4;
        if (i8 == i2) {
            this.f2312b = pVar.b();
            q.a(pVar);
        } else {
            pVar.f2344b = i8;
        }
        return i9;
    }

    @Override // f.e
    public short readShort() {
        long j = this.f2313c;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f2313c);
        }
        p pVar = this.f2312b;
        int i = pVar.f2344b;
        int i2 = pVar.f2345c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = pVar.f2343a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f2313c = j - 2;
        if (i4 == i2) {
            this.f2312b = pVar.b();
            q.a(pVar);
        } else {
            pVar.f2344b = i4;
        }
        return (short) i5;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d s(String str) {
        a0(str);
        return this;
    }

    @Override // f.e
    public int t() {
        return v.c(readInt());
    }

    public String toString() {
        return O().toString();
    }

    @Override // f.e
    public c u() {
        return this;
    }

    @Override // f.e
    public boolean v() {
        return this.f2313c == 0;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d w(int i) {
        V(i);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            p Q = Q(1);
            int min = Math.min(i, 8192 - Q.f2345c);
            byteBuffer.get(Q.f2343a, Q.f2345c, min);
            i -= min;
            Q.f2345c += min;
        }
        this.f2313c += remaining;
        return remaining;
    }

    @Override // f.e
    public long x(byte b2) {
        return G(b2, 0L, Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] y(long j) {
        v.b(this.f2313c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[EDGE_INSN: B:41:0x00a3->B:38:0x00a3 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long z() {
        /*
            r15 = this;
            long r0 = r15.f2313c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            f.p r6 = r15.f2312b
            byte[] r7 = r6.f2343a
            int r8 = r6.f2344b
            int r9 = r6.f2345c
        L13:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            f.c r0 = new f.c
            r0.<init>()
            r0.W(r4)
            r0.V(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.K()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L8f
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            if (r8 != r9) goto L9b
            f.p r7 = r6.b()
            r15.f2312b = r7
            f.q.a(r6)
            goto L9d
        L9b:
            r6.f2344b = r8
        L9d:
            if (r1 != 0) goto La3
            f.p r6 = r15.f2312b
            if (r6 != 0) goto Lb
        La3:
            long r1 = r15.f2313c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f2313c = r1
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lb3
        Lb2:
            throw r0
        Lb3:
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.z():long");
    }
}
