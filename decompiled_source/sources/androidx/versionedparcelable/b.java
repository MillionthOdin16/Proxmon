package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f888d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f889e;

    /* renamed from: f, reason: collision with root package name */
    private final int f890f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.VERSION_NAME, new b.d.a(), new b.d.a(), new b.d.a());
    }

    private b(Parcel parcel, int i, int i2, String str, b.d.a<String, Method> aVar, b.d.a<String, Method> aVar2, b.d.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f888d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f889e = parcel;
        this.f890f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f889e.writeInt(-1);
        } else {
            this.f889e.writeInt(bArr.length);
            this.f889e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f889e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i) {
        this.f889e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f889e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f889e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f888d.get(i);
            int dataPosition = this.f889e.dataPosition();
            this.f889e.setDataPosition(i2);
            this.f889e.writeInt(dataPosition - i2);
            this.f889e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f889e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f890f) {
            i = this.g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f885a, this.f886b, this.f887c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f889e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f889e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f889e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f889e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f889e.setDataPosition(this.j);
            int readInt = this.f889e.readInt();
            this.k = this.f889e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f889e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f889e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f889e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i) {
        a();
        this.i = i;
        this.f888d.put(i, this.f889e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.f889e.writeInt(z ? 1 : 0);
    }
}
