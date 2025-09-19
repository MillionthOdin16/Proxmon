package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v1 implements c.b.a.a.a.a.g0<u1> {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<String> f1797a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<w> f1798b;

    /* renamed from: c, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<y0> f1799c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<Context> f1800d;

    /* renamed from: e, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<g2> f1801e;

    /* renamed from: f, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<Executor> f1802f;

    public v1(c.b.a.a.a.a.g0<String> g0Var, c.b.a.a.a.a.g0<w> g0Var2, c.b.a.a.a.a.g0<y0> g0Var3, c.b.a.a.a.a.g0<Context> g0Var4, c.b.a.a.a.a.g0<g2> g0Var5, c.b.a.a.a.a.g0<Executor> g0Var6) {
        this.f1797a = g0Var;
        this.f1798b = g0Var2;
        this.f1799c = g0Var3;
        this.f1800d = g0Var4;
        this.f1801e = g0Var5;
        this.f1802f = g0Var6;
    }

    @Override // c.b.a.a.a.a.g0
    public final /* bridge */ /* synthetic */ u1 a() {
        String a2 = this.f1797a.a();
        w a3 = this.f1798b.a();
        y0 a4 = this.f1799c.a();
        Context a5 = ((g3) this.f1800d).a();
        g2 a6 = this.f1801e.a();
        return new u1(a2 != null ? new File(a5.getExternalFilesDir(null), a2) : a5.getExternalFilesDir(null), a3, a4, a5, a6, c.b.a.a.a.a.f0.c(this.f1802f));
    }
}
