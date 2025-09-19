package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements e {

    /* renamed from: a, reason: collision with root package name */
    private final b3 f1729a;

    /* renamed from: b, reason: collision with root package name */
    private c.b.a.a.a.a.g0<Context> f1730b;

    /* renamed from: c, reason: collision with root package name */
    private c.b.a.a.a.a.g0<g2> f1731c;

    /* renamed from: d, reason: collision with root package name */
    private c.b.a.a.a.a.g0<c0> f1732d;

    /* renamed from: e, reason: collision with root package name */
    private c.b.a.a.a.a.g0<y0> f1733e;

    /* renamed from: f, reason: collision with root package name */
    private c.b.a.a.a.a.g0<r> f1734f;
    private c.b.a.a.a.a.g0<String> g;
    private c.b.a.a.a.a.g0<k3> h;
    private c.b.a.a.a.a.g0<Executor> i;
    private c.b.a.a.a.a.g0<m1> j;
    private c.b.a.a.a.a.g0<w> k;
    private c.b.a.a.a.a.g0<s0> l;
    private c.b.a.a.a.a.g0<q2> m;
    private c.b.a.a.a.a.g0<a2> n;
    private c.b.a.a.a.a.g0<e2> o;
    private c.b.a.a.a.a.g0<com.google.android.play.core.common.c> p;
    private c.b.a.a.a.a.g0<j2> q;
    private c.b.a.a.a.a.g0<j0> r;
    private c.b.a.a.a.a.g0<p1> s;
    private c.b.a.a.a.a.g0<v0> t;
    private c.b.a.a.a.a.g0<m0> u;
    private c.b.a.a.a.a.g0<Executor> v;
    private c.b.a.a.a.a.g0<u1> w;
    private c.b.a.a.a.a.g0<c.b.a.a.a.e.a> x;
    private c.b.a.a.a.a.g0<w2> y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q0(b3 b3Var) {
        a1 a1Var;
        d3 d3Var;
        o0 o0Var;
        j3 j3Var;
        this.f1729a = b3Var;
        g3 g3Var = new g3(b3Var);
        this.f1730b = g3Var;
        c.b.a.a.a.a.g0<g2> b2 = c.b.a.a.a.a.f0.b(new h2(g3Var));
        this.f1731c = b2;
        this.f1732d = c.b.a.a.a.a.f0.b(new d0(this.f1730b, b2));
        a1Var = z0.f1844a;
        c.b.a.a.a.a.g0<y0> b3 = c.b.a.a.a.a.f0.b(a1Var);
        this.f1733e = b3;
        this.f1734f = c.b.a.a.a.a.f0.b(new s(this.f1730b, b3));
        this.g = c.b.a.a.a.a.f0.b(new h3(this.f1730b));
        this.h = new c.b.a.a.a.a.e0();
        d3Var = c3.f1576a;
        c.b.a.a.a.a.g0<Executor> b4 = c.b.a.a.a.a.f0.b(d3Var);
        this.i = b4;
        this.j = c.b.a.a.a.a.f0.b(new n1(this.f1732d, this.h, this.f1733e, b4));
        c.b.a.a.a.a.e0 e0Var = new c.b.a.a.a.a.e0();
        this.k = e0Var;
        this.l = c.b.a.a.a.a.f0.b(new t0(this.f1732d, this.h, e0Var, this.f1733e));
        this.m = c.b.a.a.a.a.f0.b(new r2(this.f1732d));
        this.n = c.b.a.a.a.a.f0.b(new b2(this.f1732d));
        this.o = c.b.a.a.a.a.f0.b(new f2(this.f1732d, this.h, this.j, this.i, this.f1733e));
        c.b.a.a.a.a.g0<com.google.android.play.core.common.c> b5 = c.b.a.a.a.a.f0.b(com.google.android.play.core.common.e.b());
        this.p = b5;
        this.q = c.b.a.a.a.a.f0.b(new k2(this.f1732d, this.h, b5));
        c.b.a.a.a.a.g0<j0> b6 = c.b.a.a.a.a.f0.b(new k0(this.h));
        this.r = b6;
        c.b.a.a.a.a.g0<p1> b7 = c.b.a.a.a.a.f0.b(new q1(this.j, this.f1732d, b6));
        this.s = b7;
        this.t = c.b.a.a.a.a.f0.b(new w0(this.j, this.h, this.l, this.m, this.n, this.o, this.q, b7));
        o0Var = n0.f1705a;
        this.u = c.b.a.a.a.a.f0.b(o0Var);
        j3Var = i3.f1651a;
        c.b.a.a.a.a.g0<Executor> b8 = c.b.a.a.a.a.f0.b(j3Var);
        this.v = b8;
        c.b.a.a.a.a.e0.b(this.k, c.b.a.a.a.a.f0.b(new x(this.f1730b, this.j, this.t, this.h, this.f1733e, this.u, this.p, this.i, b8)));
        c.b.a.a.a.a.g0<u1> b9 = c.b.a.a.a.a.f0.b(new v1(this.g, this.k, this.f1733e, this.f1730b, this.f1731c, this.i));
        this.w = b9;
        c.b.a.a.a.a.e0.b(this.h, c.b.a.a.a.a.f0.b(new f3(this.f1730b, this.f1734f, b9)));
        c.b.a.a.a.a.g0<c.b.a.a.a.e.a> b10 = c.b.a.a.a.a.f0.b(c.b.a.a.a.e.b.b(this.f1730b));
        this.x = b10;
        c.b.a.a.a.a.g0<w2> b11 = c.b.a.a.a.a.f0.b(new x2(this.f1732d, this.h, this.k, b10, this.j, this.f1733e, this.u, this.i));
        this.y = b11;
        c.b.a.a.a.a.f0.b(new e3(b11, this.f1730b));
    }

    @Override // com.google.android.play.core.assetpacks.e
    public final void a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f1552c = g3.b(this.f1729a);
        assetPackExtractionService.f1553d = this.y.a();
        assetPackExtractionService.f1554e = this.f1732d.a();
    }
}
