package c.b.a.a.a.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    public static a b(PendingIntent pendingIntent) {
        return new d(pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract PendingIntent a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
    }
}
