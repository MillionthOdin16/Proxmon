package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final /* synthetic */ class y2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    static final ThreadFactory f1843a = new y2();

    private y2() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
