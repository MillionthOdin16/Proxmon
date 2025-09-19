package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class k extends c.b.a.a.a.a.f {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f1663c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1664d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f1665e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1666f;
    final /* synthetic */ c.b.a.a.a.f.p g;
    final /* synthetic */ r h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, c.b.a.a.a.f.p pVar, int i, String str, String str2, int i2, c.b.a.a.a.f.p pVar2) {
        super(pVar);
        this.h = rVar;
        this.f1663c = i;
        this.f1664d = str;
        this.f1665e = str2;
        this.f1666f = i2;
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
            Bundle t = r.t(this.f1663c, this.f1664d, this.f1665e, this.f1666f);
            x = r.x();
            n0Var.S(str, t, x, new n(this.h, this.g));
        } catch (RemoteException e2) {
            eVar = r.f1740f;
            eVar.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f1664d, this.f1665e, Integer.valueOf(this.f1666f), Integer.valueOf(this.f1663c));
            this.g.d(new RuntimeException(e2));
        }
    }
}
