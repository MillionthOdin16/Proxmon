package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: b, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1738b = new c.b.a.a.a.a.e("VerifySliceTaskHandler");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1739a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(c0 c0Var) {
        this.f1739a = c0Var;
    }

    private final void b(p2 p2Var, File file) {
        try {
            File y = this.f1739a.y(p2Var.f1713b, p2Var.f1721c, p2Var.f1722d, p2Var.f1723e);
            if (!y.exists()) {
                throw new u0(String.format("Cannot find metadata files for slice %s.", p2Var.f1723e), p2Var.f1712a);
            }
            try {
                if (!w1.b(o2.a(file, y)).equals(p2Var.f1724f)) {
                    throw new u0(String.format("Verification failed for slice %s.", p2Var.f1723e), p2Var.f1712a);
                }
                f1738b.f("Verification of slice %s of pack %s successful.", p2Var.f1723e, p2Var.f1713b);
            } catch (IOException e2) {
                throw new u0(String.format("Could not digest file during verification for slice %s.", p2Var.f1723e), e2, p2Var.f1712a);
            } catch (NoSuchAlgorithmException e3) {
                throw new u0("SHA256 algorithm not supported.", e3, p2Var.f1712a);
            }
        } catch (IOException e4) {
            throw new u0(String.format("Could not reconstruct slice archive during verification for slice %s.", p2Var.f1723e), e4, p2Var.f1712a);
        }
    }

    public final void a(p2 p2Var) {
        File c2 = this.f1739a.c(p2Var.f1713b, p2Var.f1721c, p2Var.f1722d, p2Var.f1723e);
        if (!c2.exists()) {
            throw new u0(String.format("Cannot find unverified files for slice %s.", p2Var.f1723e), p2Var.f1712a);
        }
        b(p2Var, c2);
        File k = this.f1739a.k(p2Var.f1713b, p2Var.f1721c, p2Var.f1722d, p2Var.f1723e);
        if (!k.exists()) {
            k.mkdirs();
        }
        if (!c2.renameTo(k)) {
            throw new u0(String.format("Failed to move slice %s after verification.", p2Var.f1723e), p2Var.f1712a);
        }
    }
}
