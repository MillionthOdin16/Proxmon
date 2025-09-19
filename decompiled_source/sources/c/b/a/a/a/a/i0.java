package c.b.a.a.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class i0 implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f1409a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1410b;

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(IBinder iBinder, String str) {
        this.f1409a = iBinder;
        this.f1410b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel W() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1410b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void X(int i, Parcel parcel) {
        try {
            this.f1409a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1409a;
    }
}
