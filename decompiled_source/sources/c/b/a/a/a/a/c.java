package c.b.a.a.a.a;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class c extends j0 implements d {
    public c() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // c.b.a.a.a.a.j0
    protected final boolean W(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        b((Bundle) k0.a(parcel, Bundle.CREATOR));
        return true;
    }
}
