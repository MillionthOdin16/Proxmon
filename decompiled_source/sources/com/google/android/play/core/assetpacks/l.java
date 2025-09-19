package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.b.a.a.a.f.p f1677c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ r f1678d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, c.b.a.a.a.f.p pVar, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.f1678d = rVar;
        this.f1677c = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        Bundle x;
        try {
            oVar = this.f1678d.f1744d;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.f1678d.f1741a;
            x = r.x();
            n0Var.u(str, x, new p(this.f1678d, this.f1677c));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "keepAlive", new Object[0]);
        }
    }
}
