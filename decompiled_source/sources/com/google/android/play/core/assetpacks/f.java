package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class f extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f1595c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.b.a.a.a.f.p f1596d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f1597e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, c.b.a.a.a.f.p pVar, List list, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.f1597e = rVar;
        this.f1595c = list;
        this.f1596d = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        Bundle x;
        ArrayList d2 = r.d(this.f1595c);
        try {
            oVar = this.f1597e.f1743c;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.f1597e.f1741a;
            x = r.x();
            n0Var.m(str, d2, x, new m(this.f1597e, this.f1596d, (byte[]) null));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "cancelDownloads(%s)", this.f1595c);
        }
    }
}
