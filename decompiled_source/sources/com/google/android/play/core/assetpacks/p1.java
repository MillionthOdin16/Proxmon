package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1717d = new c.b.a.a.a.a.e("ExtractorTaskFinder");

    /* renamed from: a, reason: collision with root package name */
    private final m1 f1718a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1719b;

    /* renamed from: c, reason: collision with root package name */
    private final j0 f1720c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(m1 m1Var, c0 c0Var, j0 j0Var) {
        this.f1718a = m1Var;
        this.f1719b = c0Var;
        this.f1720c = j0Var;
    }

    private final boolean b(j1 j1Var, k1 k1Var) {
        c0 c0Var = this.f1719b;
        i1 i1Var = j1Var.f1658c;
        return c0Var.w(i1Var.f1642a, j1Var.f1657b, i1Var.f1643b, k1Var.f1668a).exists();
    }

    private static boolean c(k1 k1Var) {
        int i = k1Var.f1673f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0218, code lost:
    
        r0 = com.google.android.play.core.assetpacks.p1.f1717d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f1656a);
        r4[1] = r6.f1658c.f1642a;
        r4[2] = r10.f1668a;
        r0.c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
    
        r11 = r34.f1719b;
        r4 = r6.f1658c;
        r0 = new java.io.FileInputStream(r11.w(r4.f1642a, r6.f1657b, r4.f1643b, r10.f1668a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024c, code lost:
    
        r9 = r6.f1656a;
        r11 = r6.f1658c;
        r4 = new com.google.android.play.core.assetpacks.r0(r9, r11.f1642a, r6.f1657b, r11.f1643b, r10.f1668a, 0, 0, 1, r11.f1645d, r11.f1644c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a1, code lost:
    
        throw new com.google.android.play.core.assetpacks.u0(java.lang.String.format("Error finding patch, session %s packName %s sliceId %s", java.lang.Integer.valueOf(r6.f1656a), r6.f1658c.f1642a, r10.f1668a), r0, r6.f1656a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x040f, code lost:
    
        if (r0 != null) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.o1 a() {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.p1.a():com.google.android.play.core.assetpacks.o1");
    }
}
