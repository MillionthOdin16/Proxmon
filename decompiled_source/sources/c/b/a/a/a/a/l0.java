package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends i0 implements n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // c.b.a.a.a.a.n0
    public final void J(String str, Bundle bundle, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.b(W, p0Var);
        X(5, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void N(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.c(W, bundle2);
        k0.b(W, p0Var);
        X(7, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void S(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.c(W, bundle2);
        k0.b(W, p0Var);
        X(11, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void m(String str, List<Bundle> list, Bundle bundle, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        W.writeTypedList(list);
        k0.c(W, bundle);
        k0.b(W, p0Var);
        X(14, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void t(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.c(W, bundle2);
        k0.b(W, p0Var);
        X(9, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void u(String str, Bundle bundle, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.b(W, p0Var);
        X(10, W);
    }

    @Override // c.b.a.a.a.a.n0
    public final void z(String str, Bundle bundle, Bundle bundle2, p0 p0Var) {
        Parcel W = W();
        W.writeString(str);
        k0.c(W, bundle);
        k0.c(W, bundle2);
        k0.b(W, p0Var);
        X(6, W);
    }
}
