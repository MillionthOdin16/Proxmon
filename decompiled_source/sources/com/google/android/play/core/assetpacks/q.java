package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
final class q extends m<Void> {

    /* renamed from: c, reason: collision with root package name */
    final int f1725c;

    /* renamed from: d, reason: collision with root package name */
    final String f1726d;

    /* renamed from: e, reason: collision with root package name */
    final int f1727e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f1728f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, c.b.a.a.a.f.p<Void> pVar, int i, String str, int i2) {
        super(rVar, pVar);
        this.f1728f = rVar;
        this.f1725c = i;
        this.f1726d = str;
        this.f1727e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.m, c.b.a.a.a.a.p0
    public final void b(Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1728f.f1743c;
        oVar.b();
        int i = bundle.getInt("error_code");
        eVar = r.f1740f;
        eVar.e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f1727e;
        if (i2 > 0) {
            this.f1728f.f(this.f1725c, this.f1726d, i2 - 1);
        }
    }
}
