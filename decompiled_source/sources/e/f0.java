package e;

/* loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f1944a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f1946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1947d;

        a(a0 a0Var, int i, byte[] bArr, int i2) {
            this.f1944a = a0Var;
            this.f1945b = i;
            this.f1946c = bArr;
            this.f1947d = i2;
        }

        @Override // e.f0
        public long a() {
            return this.f1945b;
        }

        @Override // e.f0
        public a0 b() {
            return this.f1944a;
        }

        @Override // e.f0
        public void g(f.d dVar) {
            dVar.d(this.f1946c, this.f1947d, this.f1945b);
        }
    }

    public static f0 c(a0 a0Var, byte[] bArr) {
        return d(a0Var, bArr, 0, bArr.length);
    }

    public static f0 d(a0 a0Var, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        e.k0.e.d(bArr.length, i, i2);
        return new a(a0Var, i2, bArr, i);
    }

    public abstract long a();

    public abstract a0 b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(f.d dVar);
}
