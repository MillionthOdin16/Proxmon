package e.k0.k;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f2218a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2219b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f2218a = 0;
        Arrays.fill(this.f2219b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return this.f2219b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        if ((this.f2218a & 2) != 0) {
            return this.f2219b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        if ((this.f2218a & 128) != 0) {
            return this.f2219b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(int i) {
        return (this.f2218a & 16) != 0 ? this.f2219b[4] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i) {
        return (this.f2218a & 32) != 0 ? this.f2219b[5] : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i) {
        return ((1 << i) & this.f2218a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.g(i)) {
                i(i, mVar.b(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f2219b;
            if (i < iArr.length) {
                this.f2218a = (1 << i) | this.f2218a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f2218a);
    }
}
