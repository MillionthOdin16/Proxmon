package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f639a = aVar.p(iconCompat.f639a, 1);
        iconCompat.f641c = aVar.j(iconCompat.f641c, 2);
        iconCompat.f642d = aVar.r(iconCompat.f642d, 3);
        iconCompat.f643e = aVar.p(iconCompat.f643e, 4);
        iconCompat.f644f = aVar.p(iconCompat.f644f, 5);
        iconCompat.g = (ColorStateList) aVar.r(iconCompat.g, 6);
        iconCompat.i = aVar.t(iconCompat.i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.f(aVar.f());
        int i = iconCompat.f639a;
        if (-1 != i) {
            aVar.F(i, 1);
        }
        byte[] bArr = iconCompat.f641c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f642d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i2 = iconCompat.f643e;
        if (i2 != 0) {
            aVar.F(i2, 4);
        }
        int i3 = iconCompat.f644f;
        if (i3 != 0) {
            aVar.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.J(str, 7);
        }
    }
}
