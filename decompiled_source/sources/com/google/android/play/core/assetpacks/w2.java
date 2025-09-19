package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: e, reason: collision with root package name */
    private static final c.b.a.a.a.a.e f1811e = new c.b.a.a.a.a.e("AssetPackManager");

    /* renamed from: a, reason: collision with root package name */
    private final c0 f1812a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1813b;

    /* renamed from: c, reason: collision with root package name */
    private final w f1814c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<Executor> f1815d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w2(c0 c0Var, c.b.a.a.a.a.d0<k3> d0Var, w wVar, c.b.a.a.a.e.a aVar, m1 m1Var, y0 y0Var, m0 m0Var, c.b.a.a.a.a.d0<Executor> d0Var2) {
        new Handler(Looper.getMainLooper());
        this.f1812a = c0Var;
        this.f1813b = d0Var;
        this.f1814c = wVar;
        this.f1815d = d0Var2;
    }

    private final void d() {
        this.f1815d.a().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.t2

            /* renamed from: b, reason: collision with root package name */
            private final w2 f1777b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f1777b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1777b.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        boolean d2 = this.f1814c.d();
        this.f1814c.c(z);
        if (!z || d2) {
            return;
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        c.b.a.a.a.f.e<List<String>> k = this.f1813b.a().k(this.f1812a.l());
        Executor a2 = this.f1815d.a();
        c0 c0Var = this.f1812a;
        c0Var.getClass();
        k.c(a2, u2.b(c0Var));
        k.b(this.f1815d.a(), v2.f1803a);
    }
}
