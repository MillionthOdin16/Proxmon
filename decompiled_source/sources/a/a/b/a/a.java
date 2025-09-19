package a.a.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a.a.b.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0002a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a.a.b.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0003a implements a {

            /* renamed from: b, reason: collision with root package name */
            public static a f2b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f3a;

            C0003a(IBinder iBinder) {
                this.f3a = iBinder;
            }

            @Override // a.a.b.a.a
            public void U(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f3a.transact(1, obtain, null, 1) || AbstractBinderC0002a.X() == null) {
                        return;
                    }
                    AbstractBinderC0002a.X().U(i, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3a;
            }
        }

        public AbstractBinderC0002a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a W(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0003a(iBinder) : (a) queryLocalInterface;
        }

        public static a X() {
            return C0003a.f2b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                U(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    void U(int i, Bundle bundle);
}
