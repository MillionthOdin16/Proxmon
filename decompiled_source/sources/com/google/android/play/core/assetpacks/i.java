package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1636c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1637d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c.b.a.a.a.f.p f1638e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1639f;
    final /* synthetic */ r g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, c.b.a.a.a.f.p pVar, int i, String str, c.b.a.a.a.f.p pVar2, int i2) {
        super(pVar);
        this.g = rVar;
        this.f1636c = i;
        this.f1637d = str;
        this.f1638e = pVar2;
        this.f1639f = i2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        Bundle s;
        Bundle x;
        try {
            oVar = this.g.f1743c;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.g.f1741a;
            s = r.s(this.f1636c, this.f1637d);
            x = r.x();
            n0Var.N(str, s, x, new q(this.g, this.f1638e, this.f1636c, this.f1637d, this.f1639f));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
