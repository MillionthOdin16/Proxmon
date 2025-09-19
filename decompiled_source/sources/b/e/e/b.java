package b.e.e;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f1090e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1093c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1094d;

    private b(int i, int i2, int i3, int i4) {
        this.f1091a = i;
        this.f1092b = i2;
        this.f1093c = i3;
        this.f1094d = i4;
    }

    public static b a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1090e : new b(i, i2, i3, i4);
    }

    public Insets b() {
        return Insets.of(this.f1091a, this.f1092b, this.f1093c, this.f1094d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1094d == bVar.f1094d && this.f1091a == bVar.f1091a && this.f1093c == bVar.f1093c && this.f1092b == bVar.f1092b;
    }

    public int hashCode() {
        return (((((this.f1091a * 31) + this.f1092b) * 31) + this.f1093c) * 31) + this.f1094d;
    }

    public String toString() {
        return "Insets{left=" + this.f1091a + ", top=" + this.f1092b + ", right=" + this.f1093c + ", bottom=" + this.f1094d + '}';
    }
}
