package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1588a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1589b;

    /* renamed from: c, reason: collision with root package name */
    private final m1 f1590c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<Executor> f1591d;

    /* renamed from: e, reason: collision with root package name */
    private final y0 f1592e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(c0 c0Var, c.b.a.a.a.a.d0<k3> d0Var, m1 m1Var, c.b.a.a.a.a.d0<Executor> d0Var2, y0 y0Var) {
        this.f1588a = c0Var;
        this.f1589b = d0Var;
        this.f1590c = m1Var;
        this.f1591d = d0Var2;
        this.f1592e = y0Var;
    }

    public final void a(c2 c2Var) {
        File m = this.f1588a.m(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d);
        File v = this.f1588a.v(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d);
        if (!m.exists() || !v.exists()) {
            throw new u0(String.format("Cannot find pack files to move for pack %s.", c2Var.f1713b), c2Var.f1712a);
        }
        File b2 = this.f1588a.b(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d);
        b2.mkdirs();
        if (!m.renameTo(b2)) {
            throw new u0("Cannot move merged pack files to final location.", c2Var.f1712a);
        }
        new File(this.f1588a.b(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d), "merge.tmp").delete();
        File j = this.f1588a.j(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d);
        j.mkdirs();
        if (!v.renameTo(j)) {
            throw new u0("Cannot move metadata files to final location.", c2Var.f1712a);
        }
        Executor a2 = this.f1591d.a();
        c0 c0Var = this.f1588a;
        c0Var.getClass();
        a2.execute(d2.a(c0Var));
        this.f1590c.d(c2Var.f1713b, c2Var.f1574c, c2Var.f1575d);
        this.f1592e.b(c2Var.f1713b);
        this.f1589b.a().b(c2Var.f1712a, c2Var.f1713b);
    }
}
