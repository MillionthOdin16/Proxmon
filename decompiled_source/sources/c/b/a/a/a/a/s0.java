package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s0 extends i0 implements t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // c.b.a.a.a.a.t0
    public final void b(Bundle bundle) {
        Parcel W = W();
        k0.c(W, bundle);
        X(3, W);
    }

    @Override // c.b.a.a.a.a.t0
    public final void f(Bundle bundle, Bundle bundle2) {
        Parcel W = W();
        k0.c(W, bundle);
        k0.c(W, bundle2);
        X(2, W);
    }

    @Override // c.b.a.a.a.a.t0
    public final void i(Bundle bundle) {
        Parcel W = W();
        k0.c(W, bundle);
        X(4, W);
    }
}
