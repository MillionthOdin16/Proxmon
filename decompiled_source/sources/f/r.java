package f;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends f {
    final transient byte[][] g;
    final transient int[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(c cVar, int i) {
        super(null);
        v.b(cVar.f2313c, 0L, i);
        p pVar = cVar.f2312b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = pVar.f2345c;
            int i6 = pVar.f2344b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            pVar = pVar.f2348f;
        }
        this.g = new byte[i4];
        this.h = new int[i4 * 2];
        p pVar2 = cVar.f2312b;
        int i7 = 0;
        while (i2 < i) {
            this.g[i7] = pVar2.f2343a;
            i2 += pVar2.f2345c - pVar2.f2344b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.h;
            iArr[i7] = i2;
            iArr[this.g.length + i7] = pVar2.f2344b;
            pVar2.f2346d = true;
            i7++;
            pVar2 = pVar2.f2348f;
        }
    }

    private int v(int i) {
        int binarySearch = Arrays.binarySearch(this.h, 0, this.g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    private f w() {
        return new f(s());
    }

    @Override // f.f
    public String a() {
        return w().a();
    }

    @Override // f.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.o() == o() && k(0, fVar, 0, o())) {
                return true;
            }
        }
        return false;
    }

    @Override // f.f
    public byte h(int i) {
        v.b(this.h[this.g.length - 1], i, 1L);
        int v = v(i);
        int i2 = v == 0 ? 0 : this.h[v - 1];
        int[] iArr = this.h;
        byte[][] bArr = this.g;
        return bArr[v][(i - i2) + iArr[bArr.length + v]];
    }

    @Override // f.f
    public int hashCode() {
        int i = this.f2317c;
        if (i != 0) {
            return i;
        }
        int length = this.g.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.g[i2];
            int[] iArr = this.h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f2317c = i4;
        return i4;
    }

    @Override // f.f
    public String i() {
        return w().i();
    }

    @Override // f.f
    public boolean k(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > o() - i3) {
            return false;
        }
        int v = v(i);
        while (i3 > 0) {
            int i4 = v == 0 ? 0 : this.h[v - 1];
            int min = Math.min(i3, ((this.h[v] - i4) + i4) - i);
            int[] iArr = this.h;
            byte[][] bArr = this.g;
            if (!fVar.l(i2, bArr[v], (i - i4) + iArr[bArr.length + v], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            v++;
        }
        return true;
    }

    @Override // f.f
    public boolean l(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > o() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int v = v(i);
        while (i3 > 0) {
            int i4 = v == 0 ? 0 : this.h[v - 1];
            int min = Math.min(i3, ((this.h[v] - i4) + i4) - i);
            int[] iArr = this.h;
            byte[][] bArr2 = this.g;
            if (!v.a(bArr2[v], (i - i4) + iArr[bArr2.length + v], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            v++;
        }
        return true;
    }

    @Override // f.f
    public f m() {
        return w().m();
    }

    @Override // f.f
    public f n() {
        return w().n();
    }

    @Override // f.f
    public int o() {
        return this.h[this.g.length - 1];
    }

    @Override // f.f
    public f q(int i, int i2) {
        return w().q(i, i2);
    }

    @Override // f.f
    public f r() {
        return w().r();
    }

    @Override // f.f
    public byte[] s() {
        int[] iArr = this.h;
        byte[][] bArr = this.g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // f.f
    public String t() {
        return w().t();
    }

    @Override // f.f
    public String toString() {
        return w().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.f
    public void u(c cVar) {
        int length = this.g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            p pVar = new p(this.g[i], i3, (i3 + i4) - i2, true, false);
            p pVar2 = cVar.f2312b;
            if (pVar2 == null) {
                pVar.g = pVar;
                pVar.f2348f = pVar;
                cVar.f2312b = pVar;
            } else {
                pVar2.g.c(pVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f2313c += i2;
    }
}
