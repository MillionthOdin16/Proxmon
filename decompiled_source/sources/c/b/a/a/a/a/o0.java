package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o0 extends j0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // c.b.a.a.a.a.j0
    protected final boolean W(int i, Parcel parcel) {
        switch (i) {
            case 2:
                O(parcel.readInt(), (Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                h(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                p(readInt2);
                return true;
            case 5:
                g(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle = (Bundle) k0.a(parcel, Bundle.CREATOR);
                i(bundle);
                return true;
            case 7:
                b((Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle2 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                s(bundle2);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Bundle bundle3 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                Q(bundle3);
                return true;
            case 11:
                f((Bundle) k0.a(parcel, Bundle.CREATOR), (Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                K((Bundle) k0.a(parcel, Bundle.CREATOR), (Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                r((Bundle) k0.a(parcel, Bundle.CREATOR), (Bundle) k0.a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                F();
                return true;
            case 15:
                a();
                return true;
        }
    }
}
