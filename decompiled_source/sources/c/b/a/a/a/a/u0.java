package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u0 extends i0 implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // c.b.a.a.a.a.b
    public final void l(String str, Bundle bundle, d dVar) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.b(W, dVar);
        X(2, W);
    }
}
