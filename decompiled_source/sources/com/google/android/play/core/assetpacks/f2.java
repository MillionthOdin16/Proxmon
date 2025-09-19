package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f2 implements c.b.a.a.a.a.g0<e2> {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<c0> f1603a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<k3> f1604b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<m1> f1605c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<Executor> f1606d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<y0> f1607e;

    public f2(c.b.a.a.a.a.g0<c0> g0Var, c.b.a.a.a.a.g0<k3> g0Var2, c.b.a.a.a.a.g0<m1> g0Var3, c.b.a.a.a.a.g0<Executor> g0Var4, c.b.a.a.a.a.g0<y0> g0Var5) {
        this.f1603a = g0Var;
        this.f1604b = g0Var2;
        this.f1605c = g0Var3;
        this.f1606d = g0Var4;
        this.f1607e = g0Var5;
    }

    @Override // c.b.a.a.a.a.g0
    public final /* bridge */ /* synthetic */ e2 a() {
        c0 a2 = this.f1603a.a();
        return new e2(a2, c.b.a.a.a.a.f0.c(this.f1604b), this.f1605c.a(), c.b.a.a.a.a.f0.c(this.f1606d), this.f1607e.a());
    }
}
