package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0006a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f60a;

            C0006a(IBinder iBinder) {
                this.f60a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60a;
            }

            @Override // android.support.v4.media.session.b
            public void n(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f60a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b W(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0006a(iBinder) : (b) queryLocalInterface;
        }
    }

    void n(android.support.v4.media.session.a aVar);
}
