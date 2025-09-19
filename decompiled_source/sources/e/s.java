package e;

import e.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f2280c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f2281d;

    /* renamed from: a, reason: collision with root package name */
    private int f2278a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f2279b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<d0.a> f2282e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final Deque<d0.a> f2283f = new ArrayDeque();
    private final Deque<d0> g = new ArrayDeque();

    private <T> void c(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f2280c;
        }
        if (f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private boolean f() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<d0.a> it = this.f2282e.iterator();
            while (it.hasNext()) {
                d0.a next = it.next();
                if (this.f2283f.size() >= this.f2278a) {
                    break;
                }
                if (next.l().get() < this.f2279b) {
                    it.remove();
                    next.l().incrementAndGet();
                    arrayList.add(next);
                    this.f2283f.add(next);
                }
            }
            z = g() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((d0.a) arrayList.get(i)).m(b());
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(d0 d0Var) {
        this.g.add(d0Var);
    }

    public synchronized ExecutorService b() {
        if (this.f2281d == null) {
            this.f2281d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), e.k0.e.G("OkHttp Dispatcher", false));
        }
        return this.f2281d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(d0.a aVar) {
        aVar.l().decrementAndGet();
        c(this.f2283f, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d0 d0Var) {
        c(this.g, d0Var);
    }

    public synchronized int g() {
        return this.f2283f.size() + this.g.size();
    }
}
