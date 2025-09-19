package f;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class i extends u {

    /* renamed from: e, reason: collision with root package name */
    private u f2321e;

    public i(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2321e = uVar;
    }

    @Override // f.u
    public u a() {
        return this.f2321e.a();
    }

    @Override // f.u
    public u b() {
        return this.f2321e.b();
    }

    @Override // f.u
    public long c() {
        return this.f2321e.c();
    }

    @Override // f.u
    public u d(long j) {
        return this.f2321e.d(j);
    }

    @Override // f.u
    public boolean e() {
        return this.f2321e.e();
    }

    @Override // f.u
    public void f() {
        this.f2321e.f();
    }

    @Override // f.u
    public u g(long j, TimeUnit timeUnit) {
        return this.f2321e.g(j, timeUnit);
    }

    @Override // f.u
    public long h() {
        return this.f2321e.h();
    }

    public final u i() {
        return this.f2321e;
    }

    public final i j(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2321e = uVar;
        return this;
    }
}
