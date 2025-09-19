package e.k0.h;

import e.i0;
import e.k0.h.k;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.k0.e.G("OkHttp ConnectionPool", true));

    /* renamed from: a, reason: collision with root package name */
    private final int f2037a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2038b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f2039c = new Runnable() { // from class: e.k0.h.a
        @Override // java.lang.Runnable
        public final void run() {
            g.this.d();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final Deque<f> f2040d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final h f2041e = new h();

    /* renamed from: f, reason: collision with root package name */
    boolean f2042f;

    public g(int i, long j, TimeUnit timeUnit) {
        this.f2037a = i;
        this.f2038b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    private int e(f fVar, long j) {
        List<Reference<k>> list = fVar.p;
        int i = 0;
        while (i < list.size()) {
            Reference<k> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                e.k0.l.f.j().q("A connection to " + fVar.q().a().l() + " was leaked. Did you forget to close a response body?", ((k.b) reference).f2060a);
                list.remove(i);
                fVar.k = true;
                if (list.isEmpty()) {
                    fVar.q = j - this.f2038b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    long a(long j) {
        synchronized (this) {
            f fVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (f fVar2 : this.f2040d) {
                if (e(fVar2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - fVar2.q;
                    if (j3 > j2) {
                        fVar = fVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f2038b && i <= this.f2037a) {
                if (i > 0) {
                    return this.f2038b - j2;
                }
                if (i2 > 0) {
                    return this.f2038b;
                }
                this.f2042f = false;
                return -1L;
            }
            this.f2040d.remove(fVar);
            e.k0.e.f(fVar.s());
            return 0L;
        }
    }

    public void b(i0 i0Var, IOException iOException) {
        if (i0Var.b().type() != Proxy.Type.DIRECT) {
            e.e a2 = i0Var.a();
            a2.i().connectFailed(a2.l().C(), i0Var.b().address(), iOException);
        }
        this.f2041e.b(i0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(f fVar) {
        if (fVar.k || this.f2037a == 0) {
            this.f2040d.remove(fVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public /* synthetic */ void d() {
        while (true) {
            long a2 = a(System.nanoTime());
            if (a2 == -1) {
                return;
            }
            if (a2 > 0) {
                long j = a2 / 1000000;
                long j2 = a2 - (1000000 * j);
                synchronized (this) {
                    try {
                        wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(f fVar) {
        if (!this.f2042f) {
            this.f2042f = true;
            g.execute(this.f2039c);
        }
        this.f2040d.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(e.e eVar, k kVar, List<i0> list, boolean z) {
        for (f fVar : this.f2040d) {
            if (!z || fVar.n()) {
                if (fVar.l(eVar, list)) {
                    kVar.a(fVar);
                    return true;
                }
            }
        }
        return false;
    }
}
