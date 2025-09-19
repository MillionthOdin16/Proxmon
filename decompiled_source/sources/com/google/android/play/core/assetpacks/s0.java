package com.google.android.play.core.assetpacks;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: f, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1756f = new c.b.a.a.a.a.e("ExtractChunkTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1757a = new byte[8192];

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1758b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1759c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<w> f1760d;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f1761e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(c0 c0Var, c.b.a.a.a.a.d0<k3> d0Var, c.b.a.a.a.a.d0<w> d0Var2, y0 y0Var) {
        this.f1758b = c0Var;
        this.f1759c = d0Var;
        this.f1760d = d0Var2;
        this.f1761e = y0Var;
    }

    private final File b(r0 r0Var) {
        File c2 = this.f1758b.c(r0Var.f1713b, r0Var.f1746c, r0Var.f1747d, r0Var.f1748e);
        if (!c2.exists()) {
            c2.mkdirs();
        }
        return c2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)|4|5|6|(1:8)(2:124|125)|9|10|(2:12|(12:14|(1:(1:(2:18|(2:84|85))(2:86|87))(2:88|(10:90|(6:22|(4:23|(2:27|(1:36)(4:31|(1:33)|34|35))|37|(1:39)(1:64))|42|(1:44)|45|(2:47|(1:49)(2:50|(1:52)(3:53|(2:55|(1:57)(2:59|60))(1:62)|58))))|65|66|(2:78|79)|68|69|70|71|(2:73|74)(1:75))(2:91|92)))(2:93|(4:95|(4:96|(1:98)|99|(1:102)(1:108))|105|(1:107))(2:109|110))|20|(0)|65|66|(0)|68|69|70|71|(0)(0))(2:111|112))|113|(0)|65|66|(0)|68|69|70|71|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02ef, code lost:
    
        com.google.android.play.core.assetpacks.s0.f1756f.g("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.g), r23.f1748e, r23.f1713b);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017f A[Catch: all -> 0x032e, TryCatch #4 {all -> 0x032e, blocks: (B:10:0x0040, B:12:0x0046, B:14:0x0054, B:18:0x005e, B:22:0x017f, B:23:0x0188, B:25:0x0192, B:27:0x0198, B:29:0x019e, B:31:0x01a4, B:33:0x01c8, B:35:0x01d4, B:36:0x01d8, B:37:0x01df, B:39:0x01e5, B:42:0x01eb, B:44:0x01f1, B:45:0x0201, B:47:0x0207, B:49:0x020d, B:50:0x0220, B:52:0x0226, B:53:0x0235, B:55:0x023b, B:58:0x027c, B:59:0x0263, B:60:0x026a, B:62:0x026b, B:84:0x0078, B:85:0x0081, B:86:0x0082, B:87:0x009b, B:88:0x009c, B:90:0x00c3, B:91:0x00cf, B:92:0x00d8, B:93:0x00d9, B:95:0x00f7, B:96:0x0109, B:98:0x011e, B:99:0x0123, B:105:0x0132, B:107:0x013b, B:109:0x0152, B:110:0x015b, B:111:0x015c, B:112:0x017b), top: B:9:0x0040, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.play.core.assetpacks.r0 r23) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.s0.a(com.google.android.play.core.assetpacks.r0):void");
    }
}
