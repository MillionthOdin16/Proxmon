package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public int f46b;

    /* renamed from: c, reason: collision with root package name */
    public int f47c;

    /* renamed from: d, reason: collision with root package name */
    public int f48d;

    /* renamed from: e, reason: collision with root package name */
    public int f49e;

    /* renamed from: f, reason: collision with root package name */
    public int f50f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f46b = parcel.readInt();
        this.f48d = parcel.readInt();
        this.f49e = parcel.readInt();
        this.f50f = parcel.readInt();
        this.f47c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46b);
        parcel.writeInt(this.f48d);
        parcel.writeInt(this.f49e);
        parcel.writeInt(this.f50f);
        parcel.writeInt(this.f47c);
    }
}
