package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class h extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1623c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1624d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f1625e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1626f;
    final /* synthetic */ c.b.a.a.a.f.p g;
    final /* synthetic */ r h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, c.b.a.a.a.f.p pVar, int i, String str, String str2, int i2, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.h = rVar;
        this.f1623c = i;
        this.f1624d = str;
        this.f1625e = str2;
        this.f1626f = i2;
        this.g = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        Bundle x;
        try {
            oVar = this.h.f1743c;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.h.f1741a;
            Bundle t = r.t(this.f1623c, this.f1624d, this.f1625e, this.f1626f);
            x = r.x();
            n0Var.z(str, t, x, new m(this.h, this.g, (char[]) null));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
