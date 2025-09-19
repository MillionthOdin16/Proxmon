package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class p extends m<Void> {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f1715c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, c.b.a.a.a.f.p<Void> pVar) {
        super(rVar, pVar);
        this.f1715c = rVar;
    }

    @Override // com.google.android.play.core.assetpacks.m, c.b.a.a.a.a.p0
    public final void f(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        c.b.a.a.a.a.e eVar;
        super.f(bundle, bundle2);
        atomicBoolean = this.f1715c.f1745e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            eVar = r.f1740f;
            eVar.g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f1715c.a();
        }
    }
}
