package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class j3 implements c.b.a.a.a.a.g0<Executor> {
    public static Executor b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(z2.f1848a);
        c.b.a.a.a.a.r.g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // c.b.a.a.a.a.g0
    public final /* bridge */ /* synthetic */ Executor a() {
        return b();
    }
}
