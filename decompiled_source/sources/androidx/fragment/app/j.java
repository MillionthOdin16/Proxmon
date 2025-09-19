package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<l> f747b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<String> f748c;

    /* renamed from: d, reason: collision with root package name */
    b[] f749d;

    /* renamed from: e, reason: collision with root package name */
    String f750e;

    /* renamed from: f, reason: collision with root package name */
    int f751f;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    public j() {
        this.f750e = null;
    }

    public j(Parcel parcel) {
        this.f750e = null;
        this.f747b = parcel.createTypedArrayList(l.CREATOR);
        this.f748c = parcel.createStringArrayList();
        this.f749d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f750e = parcel.readString();
        this.f751f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f747b);
        parcel.writeStringList(this.f748c);
        parcel.writeTypedArray(this.f749d, i);
        parcel.writeString(this.f750e);
        parcel.writeInt(this.f751f);
    }
}
