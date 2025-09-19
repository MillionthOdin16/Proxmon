package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: b, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1560b = new c.b.a.a.a.a.e("MergeSliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1561a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(c0 c0Var) {
        this.f1561a = c0Var;
    }

    private static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(valueOf);
                throw new u0(sb.toString());
            }
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            sb2.append("Unable to move file: ");
            sb2.append(valueOf2);
            throw new u0(sb2.toString());
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String valueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(valueOf3);
        throw new u0(sb3.toString());
    }

    public final void a(z1 z1Var) {
        File k = this.f1561a.k(z1Var.f1713b, z1Var.f1845c, z1Var.f1846d, z1Var.f1847e);
        if (!k.exists()) {
            throw new u0(String.format("Cannot find verified files for slice %s.", z1Var.f1847e), z1Var.f1712a);
        }
        File m = this.f1561a.m(z1Var.f1713b, z1Var.f1845c, z1Var.f1846d);
        if (!m.exists()) {
            m.mkdirs();
        }
        b(k, m);
        try {
            this.f1561a.f(z1Var.f1713b, z1Var.f1845c, z1Var.f1846d, this.f1561a.r(z1Var.f1713b, z1Var.f1845c, z1Var.f1846d) + 1);
        } catch (IOException e2) {
            f1560b.e("Writing merge checkpoint failed with %s.", e2.getMessage());
            throw new u0("Writing merge checkpoint failed.", e2, z1Var.f1712a);
        }
    }
}
