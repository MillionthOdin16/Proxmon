package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n1 implements c.b.a.a.a.a.g0<m1> {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<c0> f1706a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<k3> f1707b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<y0> f1708c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<Executor> f1709d;

    public n1(c.b.a.a.a.a.g0<c0> g0Var, c.b.a.a.a.a.g0<k3> g0Var2, c.b.a.a.a.a.g0<y0> g0Var3, c.b.a.a.a.a.g0<Executor> g0Var4) {
        this.f1706a = g0Var;
        this.f1707b = g0Var2;
        this.f1708c = g0Var3;
        this.f1709d = g0Var4;
    }

    @Override // c.b.a.a.a.a.g0
    public final /* bridge */ /* synthetic */ m1 a() {
        c0 a2 = this.f1706a.a();
        return new m1(a2, c.b.a.a.a.a.f0.c(this.f1707b), this.f1708c.a(), c.b.a.a.a.a.f0.c(this.f1709d));
    }
}
