package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final String f757b;

    /* renamed from: c, reason: collision with root package name */
    final String f758c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f759d;

    /* renamed from: e, reason: collision with root package name */
    final int f760e;

    /* renamed from: f, reason: collision with root package name */
    final int f761f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;
    Fragment o;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    l(Parcel parcel) {
        this.f757b = parcel.readString();
        this.f758c = parcel.readString();
        this.f759d = parcel.readInt() != 0;
        this.f760e = parcel.readInt();
        this.f761f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Fragment fragment) {
        this.f757b = fragment.getClass().getName();
        this.f758c = fragment.f693f;
        this.f759d = fragment.n;
        this.f760e = fragment.w;
        this.f761f = fragment.x;
        this.g = fragment.y;
        this.h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.g;
        this.l = fragment.z;
        this.m = fragment.R.ordinal();
    }

    public Fragment a(ClassLoader classLoader, f fVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.o == null) {
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a2 = fVar.a(classLoader, this.f757b);
            this.o = a2;
            a2.Y0(this.k);
            Bundle bundle3 = this.n;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.o;
                bundle = this.n;
            } else {
                fragment = this.o;
                bundle = new Bundle();
            }
            fragment.f690c = bundle;
            Fragment fragment2 = this.o;
            fragment2.f693f = this.f758c;
            fragment2.n = this.f759d;
            fragment2.p = true;
            fragment2.w = this.f760e;
            fragment2.x = this.f761f;
            fragment2.y = this.g;
            fragment2.B = this.h;
            fragment2.m = this.i;
            fragment2.A = this.j;
            fragment2.z = this.l;
            fragment2.R = d.b.values()[this.m];
            if (i.I) {
                Log.v("FragmentManager", "Instantiated fragment " + this.o);
            }
        }
        return this.o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f757b);
        sb.append(" (");
        sb.append(this.f758c);
        sb.append(")}:");
        if (this.f759d) {
            sb.append(" fromLayout");
        }
        if (this.f761f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f761f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f757b);
        parcel.writeString(this.f758c);
        parcel.writeInt(this.f759d ? 1 : 0);
        parcel.writeInt(this.f760e);
        parcel.writeInt(this.f761f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
