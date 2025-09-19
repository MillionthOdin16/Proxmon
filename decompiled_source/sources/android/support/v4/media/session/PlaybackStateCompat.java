package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final int f51b;

    /* renamed from: c, reason: collision with root package name */
    final long f52c;

    /* renamed from: d, reason: collision with root package name */
    final long f53d;

    /* renamed from: e, reason: collision with root package name */
    final float f54e;

    /* renamed from: f, reason: collision with root package name */
    final long f55f;
    final int g;
    final CharSequence h;
    final long i;
    List<CustomAction> j;
    final long k;
    final Bundle l;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f56b;

        /* renamed from: c, reason: collision with root package name */
        private final CharSequence f57c;

        /* renamed from: d, reason: collision with root package name */
        private final int f58d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f59e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f56b = parcel.readString();
            this.f57c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f58d = parcel.readInt();
            this.f59e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f56b = str;
            this.f57c = charSequence;
            this.f58d = i;
            this.f59e = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f57c) + ", mIcon=" + this.f58d + ", mExtras=" + this.f59e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f56b);
            TextUtils.writeToParcel(this.f57c, parcel, i);
            parcel.writeInt(this.f58d);
            parcel.writeBundle(this.f59e);
        }
    }

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f2, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f51b = i;
        this.f52c = j;
        this.f53d = j2;
        this.f54e = f2;
        this.f55f = j3;
        this.g = i2;
        this.h = charSequence;
        this.i = j4;
        this.j = new ArrayList(list);
        this.k = j5;
        this.l = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f51b = parcel.readInt();
        this.f52c = parcel.readLong();
        this.f54e = parcel.readFloat();
        this.i = parcel.readLong();
        this.f53d = parcel.readLong();
        this.f55f = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k = parcel.readLong();
        this.l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.g = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d2 = g.d(obj);
        if (d2 != null) {
            ArrayList arrayList2 = new ArrayList(d2.size());
            Iterator<Object> it = d2.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), Build.VERSION.SDK_INT >= 22 ? h.a(obj) : null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f51b + ", position=" + this.f52c + ", buffered position=" + this.f53d + ", speed=" + this.f54e + ", updated=" + this.i + ", actions=" + this.f55f + ", error code=" + this.g + ", error message=" + this.h + ", custom actions=" + this.j + ", active item id=" + this.k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51b);
        parcel.writeLong(this.f52c);
        parcel.writeFloat(this.f54e);
        parcel.writeLong(this.i);
        parcel.writeLong(this.f53d);
        parcel.writeLong(this.f55f);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.g);
    }
}
