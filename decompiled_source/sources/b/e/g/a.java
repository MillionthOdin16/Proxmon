package b.e.g;

import android.util.Base64;
import b.e.i.d;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1111a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1112b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1113c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f1114d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1115e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1116f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        d.b(str);
        this.f1111a = str;
        d.b(str2);
        this.f1112b = str2;
        d.b(str3);
        this.f1113c = str3;
        d.b(list);
        this.f1114d = list;
        this.f1115e = 0;
        this.f1116f = this.f1111a + "-" + this.f1112b + "-" + this.f1113c;
    }

    public List<List<byte[]>> a() {
        return this.f1114d;
    }

    public int b() {
        return this.f1115e;
    }

    public String c() {
        return this.f1116f;
    }

    public String d() {
        return this.f1111a;
    }

    public String e() {
        return this.f1112b;
    }

    public String f() {
        return this.f1113c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1111a + ", mProviderPackage: " + this.f1112b + ", mQuery: " + this.f1113c + ", mCertificates:");
        for (int i = 0; i < this.f1114d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f1114d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1115e);
        return sb.toString();
    }
}
