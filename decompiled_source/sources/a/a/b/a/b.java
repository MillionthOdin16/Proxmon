package a.a.b.a;

import a.a.b.a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final Handler f4b = null;

    /* renamed from: c, reason: collision with root package name */
    a.a.b.a.a f5c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
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

    /* renamed from: a.a.b.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0004b extends a.AbstractBinderC0002a {
        BinderC0004b() {
        }

        @Override // a.a.b.a.a
        public void U(int i, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4b;
            if (handler != null) {
                handler.post(new c(i, bundle));
            } else {
                bVar.a(i, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final int f7b;

        /* renamed from: c, reason: collision with root package name */
        final Bundle f8c;

        c(int i, Bundle bundle) {
            this.f7b = i;
            this.f8c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f7b, this.f8c);
        }
    }

    b(Parcel parcel) {
        this.f5c = a.AbstractBinderC0002a.W(parcel.readStrongBinder());
    }

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f5c == null) {
                this.f5c = new BinderC0004b();
            }
            parcel.writeStrongBinder(this.f5c.asBinder());
        }
    }
}
