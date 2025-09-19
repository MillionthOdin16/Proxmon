package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class c implements a {

    /* renamed from: a, reason: collision with root package name */
    int f872a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f873b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f874c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f875d = -1;

    public int a() {
        return this.f873b;
    }

    public int b() {
        int i = this.f874c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f875d;
        return i != -1 ? i : AudioAttributesCompat.a(false, this.f874c, this.f872a);
    }

    public int d() {
        return this.f872a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f873b == cVar.a() && this.f874c == cVar.b() && this.f872a == cVar.d() && this.f875d == cVar.f875d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f873b), Integer.valueOf(this.f874c), Integer.valueOf(this.f872a), Integer.valueOf(this.f875d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f875d != -1) {
            sb.append(" stream=");
            sb.append(this.f875d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f872a));
        sb.append(" content=");
        sb.append(this.f873b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f874c).toUpperCase());
        return sb.toString();
    }
}
