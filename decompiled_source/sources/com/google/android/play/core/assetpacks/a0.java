package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
final class a0 extends c.b.a.a.a.a.q0 {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.e f1556a = new c.b.a.a.a.a.e("AssetPackExtractionService");

    /* renamed from: b, reason: collision with root package name */
    private final Context f1557b;

    /* renamed from: c, reason: collision with root package name */
    private final AssetPackExtractionService f1558c;

    /* renamed from: d, reason: collision with root package name */
    private final c0 f1559d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Context context, AssetPackExtractionService assetPackExtractionService, c0 c0Var) {
        this.f1557b = context;
        this.f1558c = assetPackExtractionService;
        this.f1559d = c0Var;
    }

    @Override // c.b.a.a.a.a.r0
    public final void I(Bundle bundle, c.b.a.a.a.a.t0 t0Var) {
        String[] packagesForUid;
        this.f1556a.c("updateServiceState AIDL call", new Object[0]);
        if (c.b.a.a.a.a.s.a(this.f1557b) && (packagesForUid = this.f1557b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            t0Var.f(this.f1558c.a(bundle), new Bundle());
        } else {
            t0Var.b(new Bundle());
            this.f1558c.b();
        }
    }

    @Override // c.b.a.a.a.a.r0
    public final void v(c.b.a.a.a.a.t0 t0Var) {
        this.f1559d.z();
        t0Var.i(new Bundle());
    }
}
