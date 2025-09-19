package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Bundle bundle, String str, y0 y0Var, z zVar) {
        return b(str, zVar.b(bundle.getInt(c.b.a.a.a.a.h0.a("status", str)), str), bundle.getInt(c.b.a.a.a.a.h0.a("error_code", str)), bundle.getLong(c.b.a.a.a.a.h0.a("bytes_downloaded", str)), bundle.getLong(c.b.a.a.a.a.h0.a("total_bytes_to_download", str)), y0Var.c(str));
    }

    public static c b(String str, int i, int i2, long j, long j2, double d2) {
        return new h0(str, i, i2, j, j2, (int) Math.rint(100.0d * d2));
    }

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract int h();
}
