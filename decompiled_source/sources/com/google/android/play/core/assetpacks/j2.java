package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: d, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1659d = new c.b.a.a.a.a.e("PatchSliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1660a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1661b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.play.core.common.c f1662c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(c0 c0Var, c.b.a.a.a.a.d0<k3> d0Var, com.google.android.play.core.common.c cVar) {
        this.f1660a = c0Var;
        this.f1661b = d0Var;
        this.f1662c = cVar;
    }

    public final void a(i2 i2Var) {
        File b2 = this.f1660a.b(i2Var.f1713b, i2Var.f1647c, i2Var.f1648d);
        File file = new File(this.f1660a.j(i2Var.f1713b, i2Var.f1647c, i2Var.f1648d), i2Var.h);
        try {
            InputStream inputStream = i2Var.j;
            if (i2Var.g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                f0 f0Var = new f0(b2, file);
                if (this.f1662c.b()) {
                    File c2 = this.f1660a.c(i2Var.f1713b, i2Var.f1649e, i2Var.f1650f, i2Var.h);
                    if (!c2.exists()) {
                        c2.mkdirs();
                    }
                    m2 m2Var = new m2(this.f1660a, i2Var.f1713b, i2Var.f1649e, i2Var.f1650f, i2Var.h);
                    c.b.a.a.a.a.r.b(f0Var, inputStream, new x0(c2, m2Var), i2Var.i);
                    m2Var.j(0);
                } else {
                    File file2 = new File(this.f1660a.y(i2Var.f1713b, i2Var.f1649e, i2Var.f1650f, i2Var.h), "slice.zip.tmp");
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    c.b.a.a.a.a.r.b(f0Var, inputStream, new FileOutputStream(file2), i2Var.i);
                    if (!file2.renameTo(this.f1660a.w(i2Var.f1713b, i2Var.f1649e, i2Var.f1650f, i2Var.h))) {
                        throw new u0(String.format("Error moving patch for slice %s of pack %s.", i2Var.h, i2Var.f1713b), i2Var.f1712a);
                    }
                }
                inputStream.close();
                if (this.f1662c.b()) {
                    f1659d.f("Patching and extraction finished for slice %s of pack %s.", i2Var.h, i2Var.f1713b);
                } else {
                    f1659d.f("Patching finished for slice %s of pack %s.", i2Var.h, i2Var.f1713b);
                }
                this.f1661b.a().j(i2Var.f1712a, i2Var.f1713b, i2Var.h, 0);
                try {
                    i2Var.j.close();
                } catch (IOException unused) {
                    f1659d.g("Could not close file for slice %s of pack %s.", i2Var.h, i2Var.f1713b);
                }
            } finally {
            }
        } catch (IOException e2) {
            f1659d.e("IOException during patching %s.", e2.getMessage());
            throw new u0(String.format("Error patching slice %s of pack %s.", i2Var.h, i2Var.f1713b), e2, i2Var.f1712a);
        }
    }
}
