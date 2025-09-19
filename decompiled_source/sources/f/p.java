package f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f2343a;

    /* renamed from: b, reason: collision with root package name */
    int f2344b;

    /* renamed from: c, reason: collision with root package name */
    int f2345c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2346d;

    /* renamed from: e, reason: collision with root package name */
    boolean f2347e;

    /* renamed from: f, reason: collision with root package name */
    p f2348f;
    p g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        this.f2343a = new byte[8192];
        this.f2347e = true;
        this.f2346d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f2343a = bArr;
        this.f2344b = i;
        this.f2345c = i2;
        this.f2346d = z;
        this.f2347e = z2;
    }

    public final void a() {
        p pVar = this.g;
        if (pVar == this) {
            throw new IllegalStateException();
        }
        if (pVar.f2347e) {
            int i = this.f2345c - this.f2344b;
            if (i > (8192 - pVar.f2345c) + (pVar.f2346d ? 0 : pVar.f2344b)) {
                return;
            }
            f(this.g, i);
            b();
            q.a(this);
        }
    }

    public final p b() {
        p pVar = this.f2348f;
        if (pVar == this) {
            pVar = null;
        }
        p pVar2 = this.g;
        pVar2.f2348f = this.f2348f;
        this.f2348f.g = pVar2;
        this.f2348f = null;
        this.g = null;
        return pVar;
    }

    public final p c(p pVar) {
        pVar.g = this;
        pVar.f2348f = this.f2348f;
        this.f2348f.g = pVar;
        this.f2348f = pVar;
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p d() {
        this.f2346d = true;
        return new p(this.f2343a, this.f2344b, this.f2345c, true, false);
    }

    public final p e(int i) {
        p b2;
        if (i <= 0 || i > this.f2345c - this.f2344b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            b2 = d();
        } else {
            b2 = q.b();
            System.arraycopy(this.f2343a, this.f2344b, b2.f2343a, 0, i);
        }
        b2.f2345c = b2.f2344b + i;
        this.f2344b += i;
        this.g.c(b2);
        return b2;
    }

    public final void f(p pVar, int i) {
        if (!pVar.f2347e) {
            throw new IllegalArgumentException();
        }
        int i2 = pVar.f2345c;
        if (i2 + i > 8192) {
            if (pVar.f2346d) {
                throw new IllegalArgumentException();
            }
            int i3 = pVar.f2344b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = pVar.f2343a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            pVar.f2345c -= pVar.f2344b;
            pVar.f2344b = 0;
        }
        System.arraycopy(this.f2343a, this.f2344b, pVar.f2343a, pVar.f2345c, i);
        pVar.f2345c += i;
        this.f2344b += i;
    }
}
