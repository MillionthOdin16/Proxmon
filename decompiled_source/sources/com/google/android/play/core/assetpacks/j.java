package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class j extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1652c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.b.a.a.a.f.p f1653d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f1654e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, c.b.a.a.a.f.p pVar, int i, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.f1654e = rVar;
        this.f1652c = i;
        this.f1653d = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        Bundle r;
        Bundle x;
        try {
            oVar = this.f1654e.f1743c;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.f1654e.f1741a;
            r = r.r(this.f1652c);
            x = r.x();
            n0Var.t(str, r, x, new m(this.f1654e, this.f1653d, (int[]) null));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
