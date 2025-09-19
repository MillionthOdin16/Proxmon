package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    Object f640b;

    /* renamed from: a, reason: collision with root package name */
    public int f639a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f641c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f642d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f643e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f644f = 0;
    public ColorStateList g = null;
    PorterDuff.Mode h = j;
    public String i = null;

    private static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static String g(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int a() {
        if (this.f639a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f640b);
        }
        if (this.f639a == 2) {
            return this.f643e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        if (this.f639a == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f640b);
        }
        if (this.f639a == 2) {
            return ((String) this.f640b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public void e() {
        Parcelable parcelable;
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f639a) {
            case -1:
                parcelable = this.f642d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f642d;
                if (parcelable == null) {
                    byte[] bArr = this.f641c;
                    this.f640b = bArr;
                    this.f639a = 3;
                    this.f643e = 0;
                    this.f644f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f640b = new String(this.f641c, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f640b = this.f641c;
                return;
        }
        this.f640b = parcelable;
    }

    public void f(boolean z) {
        this.i = this.h.name();
        switch (this.f639a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f640b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f641c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f641c = ((String) this.f640b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f641c = (byte[]) this.f640b;
                return;
            case 4:
            case 6:
                this.f641c = this.f640b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f642d = (Parcelable) this.f640b;
    }

    public String toString() {
        int height;
        if (this.f639a == -1) {
            return String.valueOf(this.f640b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(g(this.f639a));
        switch (this.f639a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f640b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f640b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(c());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f643e);
                if (this.f644f != 0) {
                    sb.append(" off=");
                    height = this.f644f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f640b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != j) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
