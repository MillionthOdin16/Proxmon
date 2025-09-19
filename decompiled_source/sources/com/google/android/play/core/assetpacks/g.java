package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
final class g extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f1611c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.b.a.a.a.f.p f1612d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f1613e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, c.b.a.a.a.f.p pVar, Map map, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.f1613e = rVar;
        this.f1611c = map;
        this.f1612d = pVar2;
    }

    @Override // c.b.a.a.a.a.f
    protected final void a() {
        c.b.a.a.a.a.e eVar;
        c.b.a.a.a.a.o oVar;
        String str;
        try {
            oVar = this.f1613e.f1743c;
            c.b.a.a.a.a.n0 n0Var = (c.b.a.a.a.a.n0) oVar.f();
            str = this.f1613e.f1741a;
            n0Var.J(str, r.o(this.f1611c), new o(this.f1613e, this.f1612d));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.d(e2, "syncPacks", new Object[0]);
            this.f1612d.d(new RuntimeException(e2));
        }
    }
}
