package c.b.a.a.a.a;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    private final u f1422b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1423c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1424d;

    public v(u uVar, long j, long j2) {
        this.f1422b = uVar;
        long C = C(j);
        this.f1423c = C;
        this.f1424d = C(C + j2);
    }

    private final long C(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f1422b.r() ? this.f1422b.r() : j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.b.a.a.a.a.u
    public final InputStream A(long j, long j2) {
        long C = C(this.f1423c);
        return this.f1422b.A(C, C(j2 + C) - C);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // c.b.a.a.a.a.u
    public final long r() {
        return this.f1424d - this.f1423c;
    }
}
