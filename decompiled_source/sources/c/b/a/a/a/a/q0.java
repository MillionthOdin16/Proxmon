package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q0 extends j0 implements r0 {
    public q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // c.b.a.a.a.a.j0
    protected final boolean W(int i, Parcel parcel) {
        t0 t0Var = null;
        if (i == 2) {
            Bundle bundle = (Bundle) k0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                t0Var = queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new s0(readStrongBinder);
            }
            I(bundle, t0Var);
            return true;
        }
        if (i != 3) {
            return false;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            t0Var = queryLocalInterface2 instanceof t0 ? (t0) queryLocalInterface2 : new s0(readStrongBinder2);
        }
        v(t0Var);
        return true;
    }
}
