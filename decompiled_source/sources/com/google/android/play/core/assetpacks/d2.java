package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final /* synthetic */ class d2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1583b;

    private d2(c0 c0Var) {
        this.f1583b = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(c0 c0Var) {
        return new d2(c0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1583b.p();
    }
}
