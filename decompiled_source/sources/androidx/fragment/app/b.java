package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.m;
import androidx.lifecycle.d;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final int[] f703b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<String> f704c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f705d;

    /* renamed from: e, reason: collision with root package name */
    final int[] f706e;

    /* renamed from: f, reason: collision with root package name */
    final int f707f;
    final int g;
    final String h;
    final int i;
    final int j;
    final CharSequence k;
    final int l;
    final CharSequence m;
    final ArrayList<String> n;
    final ArrayList<String> o;
    final boolean p;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f703b = parcel.createIntArray();
        this.f704c = parcel.createStringArrayList();
        this.f705d = parcel.createIntArray();
        this.f706e = parcel.createIntArray();
        this.f707f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f762a.size();
        this.f703b = new int[size * 5];
        if (!aVar.h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f704c = new ArrayList<>(size);
        this.f705d = new int[size];
        this.f706e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            m.a aVar2 = aVar.f762a.get(i);
            int i3 = i2 + 1;
            this.f703b[i2] = aVar2.f768a;
            ArrayList<String> arrayList = this.f704c;
            Fragment fragment = aVar2.f769b;
            arrayList.add(fragment != null ? fragment.f693f : null);
            int[] iArr = this.f703b;
            int i4 = i3 + 1;
            iArr[i3] = aVar2.f770c;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f771d;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f772e;
            iArr[i6] = aVar2.f773f;
            this.f705d[i] = aVar2.g.ordinal();
            this.f706e[i] = aVar2.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f707f = aVar.f767f;
        this.g = aVar.g;
        this.h = aVar.i;
        this.i = aVar.t;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
    }

    public androidx.fragment.app.a a(i iVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(iVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f703b.length) {
            m.a aVar2 = new m.a();
            int i3 = i + 1;
            aVar2.f768a = this.f703b[i];
            if (i.I) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f703b[i3]);
            }
            String str = this.f704c.get(i2);
            aVar2.f769b = str != null ? iVar.h.get(str) : null;
            aVar2.g = d.b.values()[this.f705d[i2]];
            aVar2.h = d.b.values()[this.f706e[i2]];
            int[] iArr = this.f703b;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f770c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f771d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f772e = i9;
            int i10 = iArr[i8];
            aVar2.f773f = i10;
            aVar.f763b = i5;
            aVar.f764c = i7;
            aVar.f765d = i9;
            aVar.f766e = i10;
            aVar.b(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f767f = this.f707f;
        aVar.g = this.g;
        aVar.i = this.h;
        aVar.t = this.i;
        aVar.h = true;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = this.m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.c(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f703b);
        parcel.writeStringList(this.f704c);
        parcel.writeIntArray(this.f705d);
        parcel.writeIntArray(this.f706e);
        parcel.writeInt(this.f707f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }
}
