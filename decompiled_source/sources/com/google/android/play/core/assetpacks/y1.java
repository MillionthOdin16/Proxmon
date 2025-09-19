package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes.dex */
final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f1837a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f1838b;

    /* renamed from: c, reason: collision with root package name */
    private long f1839c;

    /* renamed from: d, reason: collision with root package name */
    private long f1840d;

    /* renamed from: e, reason: collision with root package name */
    private int f1841e;

    /* renamed from: f, reason: collision with root package name */
    private int f1842f;
    private int g;
    private boolean h;
    private String i;

    public y1() {
        e();
    }

    private final int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f1838b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f1837a, this.f1838b, min);
        int i5 = this.f1838b + min;
        this.f1838b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r3 >= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r9.f1837a = java.util.Arrays.copyOf(r9.f1837a, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
    
        if (r3 < r4) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0054, code lost:
    
        r3 = r3 + r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 30
            int r1 = r9.a(r0, r10, r11, r12)
            r2 = -1
            if (r1 == r2) goto L84
            long r3 = r9.f1839c
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L64
            byte[] r3 = r9.f1837a
            r4 = 0
            long r5 = com.google.android.play.core.assetpacks.w1.e(r3, r4)
            r9.f1839c = r5
            r7 = 67324752(0x4034b50, double:3.3262847E-316)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L61
            r9.h = r4
            byte[] r3 = r9.f1837a
            r4 = 18
            long r3 = com.google.android.play.core.assetpacks.w1.e(r3, r4)
            r9.f1840d = r3
            byte[] r3 = r9.f1837a
            r4 = 8
            int r3 = com.google.android.play.core.assetpacks.w1.g(r3, r4)
            r9.g = r3
            byte[] r3 = r9.f1837a
            r4 = 26
            int r3 = com.google.android.play.core.assetpacks.w1.g(r3, r4)
            r9.f1841e = r3
            byte[] r3 = r9.f1837a
            r4 = 28
            int r3 = com.google.android.play.core.assetpacks.w1.g(r3, r4)
            int r4 = r9.f1841e
            int r4 = r4 + r0
            int r4 = r4 + r3
            r9.f1842f = r4
            byte[] r3 = r9.f1837a
            int r3 = r3.length
            if (r3 >= r4) goto L64
        L54:
            int r3 = r3 + r3
            if (r3 >= r4) goto L58
            goto L54
        L58:
            byte[] r4 = r9.f1837a
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r9.f1837a = r3
            goto L64
        L61:
            r3 = 1
            r9.h = r3
        L64:
            int r3 = r9.f1842f
            int r11 = r11 + r1
            int r12 = r12 - r1
            int r10 = r9.a(r3, r10, r11, r12)
            if (r10 != r2) goto L6f
            return r2
        L6f:
            int r1 = r1 + r10
            boolean r10 = r9.h
            if (r10 != 0) goto L83
            java.lang.String r10 = r9.i
            if (r10 != 0) goto L83
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.f1837a
            int r12 = r9.f1841e
            r10.<init>(r11, r0, r12)
            r9.i = r10
        L83:
            return r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.y1.b(byte[], int, int):int");
    }

    public final s2 c() {
        int i = this.f1838b;
        int i2 = this.f1842f;
        if (i < i2) {
            return s2.a(this.i, this.f1840d, this.g, true, Arrays.copyOf(this.f1837a, i), this.h);
        }
        s2 a2 = s2.a(this.i, this.f1840d, this.g, false, Arrays.copyOf(this.f1837a, i2), this.h);
        e();
        return a2;
    }

    public final int d() {
        return this.f1842f;
    }

    public final void e() {
        this.f1838b = 0;
        this.f1841e = -1;
        this.f1839c = -1L;
        this.h = false;
        this.f1842f = 30;
        this.f1840d = -1L;
        this.g = -1;
        this.i = null;
    }
}
