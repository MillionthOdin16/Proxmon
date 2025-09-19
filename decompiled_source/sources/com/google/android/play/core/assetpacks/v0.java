package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 {
    private static final c.b.a.a.a.a.e j = new c.b.a.a.a.a.e("ExtractorLooper");

    /* renamed from: a, reason: collision with root package name */
    private final m1 f1791a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f1792b;

    /* renamed from: c, reason: collision with root package name */
    private final q2 f1793c;

    /* renamed from: d, reason: collision with root package name */
    private final a2 f1794d;

    /* renamed from: e, reason: collision with root package name */
    private final e2 f1795e;

    /* renamed from: f, reason: collision with root package name */
    private final j2 f1796f;
    private final c.b.a.a.a.a.d0<k3> g;
    private final p1 h;
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(m1 m1Var, c.b.a.a.a.a.d0<k3> d0Var, s0 s0Var, q2 q2Var, a2 a2Var, e2 e2Var, j2 j2Var, p1 p1Var) {
        this.f1791a = m1Var;
        this.g = d0Var;
        this.f1792b = s0Var;
        this.f1793c = q2Var;
        this.f1794d = a2Var;
        this.f1795e = e2Var;
        this.f1796f = j2Var;
        this.h = p1Var;
    }

    private final void b(int i, Exception exc) {
        try {
            this.f1791a.p(i);
            this.f1791a.c(i);
        } catch (u0 unused) {
            j.e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        j.c("Run extractor loop", new Object[0]);
        if (!this.i.compareAndSet(false, true)) {
            j.g("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            o1 o1Var = null;
            try {
                o1Var = this.h.a();
            } catch (u0 e2) {
                j.e("Error while getting next extraction task: %s", e2.getMessage());
                if (e2.f1781b >= 0) {
                    this.g.a().h(e2.f1781b);
                    b(e2.f1781b, e2);
                }
            }
            if (o1Var == null) {
                this.i.set(false);
                return;
            }
            try {
                if (o1Var instanceof r0) {
                    this.f1792b.a((r0) o1Var);
                } else if (o1Var instanceof p2) {
                    this.f1793c.a((p2) o1Var);
                } else if (o1Var instanceof z1) {
                    this.f1794d.a((z1) o1Var);
                } else if (o1Var instanceof c2) {
                    this.f1795e.a((c2) o1Var);
                } else if (o1Var instanceof i2) {
                    this.f1796f.a((i2) o1Var);
                } else {
                    j.e("Unknown task type: %s", o1Var.getClass().getName());
                }
            } catch (Exception e3) {
                j.e("Error during extraction task: %s", e3.getMessage());
                this.g.a().h(o1Var.f1712a);
                b(o1Var.f1712a, e3);
            }
        }
    }
}
