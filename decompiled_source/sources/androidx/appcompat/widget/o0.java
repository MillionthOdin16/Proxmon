package androidx.appcompat.widget;

/* loaded from: classes.dex */
class o0 {

    /* renamed from: a, reason: collision with root package name */
    private int f493a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f494b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f495c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f496d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f497e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f498f = 0;
    private boolean g = false;
    private boolean h = false;

    public int a() {
        return this.g ? this.f493a : this.f494b;
    }

    public int b() {
        return this.f493a;
    }

    public int c() {
        return this.f494b;
    }

    public int d() {
        return this.g ? this.f494b : this.f493a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.f497e = i;
            this.f493a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f498f = i2;
            this.f494b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            boolean r0 = r1.h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f496d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f497e
        L16:
            r1.f493a = r2
            int r2 = r1.f495c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f495c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f497e
        L24:
            r1.f493a = r2
            int r2 = r1.f496d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f497e
            r1.f493a = r2
        L2f:
            int r2 = r1.f498f
        L31:
            r1.f494b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i, int i2) {
        this.f495c = i;
        this.f496d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f493a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f494b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f493a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f494b = i2;
        }
    }
}
