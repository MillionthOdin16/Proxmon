package f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class u {

    /* renamed from: d, reason: collision with root package name */
    public static final u f2351d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f2352a;

    /* renamed from: b, reason: collision with root package name */
    private long f2353b;

    /* renamed from: c, reason: collision with root package name */
    private long f2354c;

    /* loaded from: classes.dex */
    final class a extends u {
        a() {
        }

        @Override // f.u
        public u d(long j) {
            return this;
        }

        @Override // f.u
        public void f() {
        }

        @Override // f.u
        public u g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public u a() {
        this.f2352a = false;
        return this;
    }

    public u b() {
        this.f2354c = 0L;
        return this;
    }

    public long c() {
        if (this.f2352a) {
            return this.f2353b;
        }
        throw new IllegalStateException("No deadline");
    }

    public u d(long j) {
        this.f2352a = true;
        this.f2353b = j;
        return this;
    }

    public boolean e() {
        return this.f2352a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2352a && this.f2353b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public u g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f2354c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    public long h() {
        return this.f2354c;
    }
}
