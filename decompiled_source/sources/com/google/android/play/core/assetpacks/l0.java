package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class l0 extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    private final y1 f1679b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f1680c;

    /* renamed from: d, reason: collision with root package name */
    private long f1681d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1682e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1683f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(InputStream inputStream) {
        super(inputStream);
        this.f1679b = new y1();
        this.f1680c = new byte[4096];
        this.f1682e = false;
        this.f1683f = false;
    }

    private final boolean B(int i) {
        int r = r(this.f1680c, 0, i);
        if (r != i) {
            int i2 = i - r;
            if (r(this.f1680c, r, i2) != i2) {
                this.f1679b.b(this.f1680c, 0, r);
                return false;
            }
        }
        this.f1679b.b(this.f1680c, 0, i);
        return true;
    }

    private final int r(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r10.f1683f == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (B(30) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10.f1682e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return r10.f1679b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r0 = r10.f1679b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r0.h() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r10.f1683f = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r0.e() == 4294967295L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r0 = r10.f1679b.d() - 30;
        r2 = r0;
        r4 = r10.f1680c.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r2 <= r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r4 = r4 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r4 < r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r10.f1680c = java.util.Arrays.copyOf(r10.f1680c, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0006, code lost:
    
        if (r10.f1681d > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (B(r0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r10.f1682e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        return r10.f1679b.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r0 = r10.f1679b.c();
        r10.f1681d = r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        throw new com.google.android.play.core.assetpacks.u0("Files bigger than 4GiB are not supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return new com.google.android.play.core.assetpacks.s2(null, -1, -1, false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r0 = r10.f1680c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (read(r0, 0, r0.length) != (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r10.f1682e != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.s2 A() {
        /*
            r10 = this;
            long r0 = r10.f1681d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13
        L8:
            byte[] r0 = r10.f1680c
            r1 = 0
            int r2 = r0.length
            int r0 = r10.read(r0, r1, r2)
            r1 = -1
            if (r0 != r1) goto L8
        L13:
            boolean r0 = r10.f1682e
            if (r0 != 0) goto L8d
            boolean r0 = r10.f1683f
            if (r0 == 0) goto L1c
            goto L8d
        L1c:
            r0 = 30
            boolean r0 = r10.B(r0)
            r1 = 1
            if (r0 != 0) goto L2e
            r10.f1682e = r1
            com.google.android.play.core.assetpacks.y1 r0 = r10.f1679b
            com.google.android.play.core.assetpacks.s2 r0 = r0.c()
            return r0
        L2e:
            com.google.android.play.core.assetpacks.y1 r0 = r10.f1679b
            com.google.android.play.core.assetpacks.s2 r0 = r0.c()
            boolean r2 = r0.h()
            if (r2 == 0) goto L3d
            r10.f1683f = r1
            return r0
        L3d:
            long r2 = r0.e()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L85
            com.google.android.play.core.assetpacks.y1 r0 = r10.f1679b
            int r0 = r0.d()
            int r0 = r0 + (-30)
            long r2 = (long) r0
            byte[] r4 = r10.f1680c
            int r4 = r4.length
            long r5 = (long) r4
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L69
        L5b:
            int r4 = r4 + r4
            long r5 = (long) r4
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L5b
            byte[] r2 = r10.f1680c
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r10.f1680c = r2
        L69:
            boolean r0 = r10.B(r0)
            if (r0 != 0) goto L78
            r10.f1682e = r1
            com.google.android.play.core.assetpacks.y1 r0 = r10.f1679b
            com.google.android.play.core.assetpacks.s2 r0 = r0.c()
            return r0
        L78:
            com.google.android.play.core.assetpacks.y1 r0 = r10.f1679b
            com.google.android.play.core.assetpacks.s2 r0 = r0.c()
            long r1 = r0.e()
            r10.f1681d = r1
            return r0
        L85:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0
            java.lang.String r1 = "Files bigger than 4GiB are not supported."
            r0.<init>(r1)
            throw r0
        L8d:
            com.google.android.play.core.assetpacks.s2 r0 = new com.google.android.play.core.assetpacks.s2
            r3 = 0
            r4 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.l0.A():com.google.android.play.core.assetpacks.s2");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C() {
        return this.f1682e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D() {
        return this.f1683f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long E() {
        return this.f1681d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f1681d;
        if (j <= 0 || this.f1682e) {
            return -1;
        }
        int r = r(bArr, i, (int) Math.min(j, i2));
        this.f1681d -= r;
        if (r != 0) {
            return r;
        }
        this.f1682e = true;
        return 0;
    }
}
