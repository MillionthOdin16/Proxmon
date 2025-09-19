package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
public final class e3 implements c.b.a.a.a.a.g0<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<w2> f1593a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.a.a.a.a.g0<Context> f1594b;

    public e3(c.b.a.a.a.a.g0<w2> g0Var, c.b.a.a.a.a.g0<Context> g0Var2) {
        this.f1593a = g0Var;
        this.f1594b = g0Var2;
    }

    @Override // c.b.a.a.a.a.g0
    public final /* bridge */ /* synthetic */ Object a() {
        w2 a2 = this.f1593a.a();
        Context a3 = ((g3) this.f1594b).a();
        w2 w2Var = a2;
        c.b.a.a.a.a.r.a(a3.getPackageManager(), new ComponentName(a3.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.a(a3);
        c.b.a.a.a.a.r.g(w2Var);
        return w2Var;
    }
}
