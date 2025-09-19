package c.b.b.b.a;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class a<V> extends c.b.b.b.a.i.a implements c.b.b.b.a.e<V> {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f1486e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f1487f = Logger.getLogger(a.class.getName());
    private static final b g;
    private static final Object h;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f1488b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f1489c;

    /* renamed from: d, reason: collision with root package name */
    private volatile l f1490d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract void d(l lVar, l lVar2);

        abstract void e(l lVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        static final c f1491c;

        /* renamed from: d, reason: collision with root package name */
        static final c f1492d;

        /* renamed from: a, reason: collision with root package name */
        final boolean f1493a;

        /* renamed from: b, reason: collision with root package name */
        final Throwable f1494b;

        static {
            if (a.f1486e) {
                f1492d = null;
                f1491c = null;
            } else {
                f1492d = new c(false, null);
                f1491c = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.f1493a = z;
            this.f1494b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f1495a;

        /* renamed from: c.b.b.b.a.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0050a extends Throwable {
            C0050a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0050a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th) {
            c.b.b.a.b.b(th);
            this.f1495a = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        static final e f1496d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        final Runnable f1497a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f1498b;

        /* renamed from: c, reason: collision with root package name */
        e f1499c;

        e(Runnable runnable, Executor executor) {
            this.f1497a = runnable;
            this.f1498b = executor;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f1500a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f1501b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, l> f1502c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1503d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1504e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1500a = atomicReferenceFieldUpdater;
            this.f1501b = atomicReferenceFieldUpdater2;
            this.f1502c = atomicReferenceFieldUpdater3;
            this.f1503d = atomicReferenceFieldUpdater4;
            this.f1504e = atomicReferenceFieldUpdater5;
        }

        @Override // c.b.b.b.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f1503d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // c.b.b.b.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f1504e.compareAndSet(aVar, obj, obj2);
        }

        @Override // c.b.b.b.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return this.f1502c.compareAndSet(aVar, lVar, lVar2);
        }

        @Override // c.b.b.b.a.a.b
        void d(l lVar, l lVar2) {
            this.f1501b.lazySet(lVar, lVar2);
        }

        @Override // c.b.b.b.a.a.b
        void e(l lVar, Thread thread) {
            this.f1500a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final a<V> f1505b;

        /* renamed from: c, reason: collision with root package name */
        final c.b.b.b.a.e<? extends V> f1506c;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f1505b).f1488b != this) {
                return;
            }
            if (a.g.b(this.f1505b, this, a.t(this.f1506c))) {
                a.q(this.f1505b);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // c.b.b.b.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f1489c != eVar) {
                    return false;
                }
                ((a) aVar).f1489c = eVar2;
                return true;
            }
        }

        @Override // c.b.b.b.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f1488b != obj) {
                    return false;
                }
                ((a) aVar).f1488b = obj2;
                return true;
            }
        }

        @Override // c.b.b.b.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f1490d != lVar) {
                    return false;
                }
                ((a) aVar).f1490d = lVar2;
                return true;
            }
        }

        @Override // c.b.b.b.a.a.b
        void d(l lVar, l lVar2) {
            lVar.f1515b = lVar2;
        }

        @Override // c.b.b.b.a.a.b
        void e(l lVar, Thread thread) {
            lVar.f1514a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i<V> extends c.b.b.b.a.e<V> {
    }

    /* loaded from: classes.dex */
    static abstract class j<V> extends a<V> implements i<V> {
        @Override // c.b.b.b.a.a, c.b.b.b.a.e
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // c.b.b.b.a.a, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // c.b.b.b.a.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // c.b.b.b.a.a, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) {
            return (V) super.get(j, timeUnit);
        }

        @Override // c.b.b.b.a.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // c.b.b.b.a.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* loaded from: classes.dex */
    private static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        static final Unsafe f1507a;

        /* renamed from: b, reason: collision with root package name */
        static final long f1508b;

        /* renamed from: c, reason: collision with root package name */
        static final long f1509c;

        /* renamed from: d, reason: collision with root package name */
        static final long f1510d;

        /* renamed from: e, reason: collision with root package name */
        static final long f1511e;

        /* renamed from: f, reason: collision with root package name */
        static final long f1512f;

        /* renamed from: c.b.b.b.a.a$k$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0051a implements PrivilegedExceptionAction<Unsafe> {
            C0051a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0051a());
            }
            try {
                f1509c = unsafe.objectFieldOffset(a.class.getDeclaredField("d"));
                f1508b = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f1510d = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f1511e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f1512f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f1507a = unsafe;
            } catch (Exception e3) {
                c.b.b.a.d.e(e3);
                throw new RuntimeException(e3);
            }
        }

        private k() {
            super();
        }

        @Override // c.b.b.b.a.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return f1507a.compareAndSwapObject(aVar, f1508b, eVar, eVar2);
        }

        @Override // c.b.b.b.a.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return f1507a.compareAndSwapObject(aVar, f1510d, obj, obj2);
        }

        @Override // c.b.b.b.a.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return f1507a.compareAndSwapObject(aVar, f1509c, lVar, lVar2);
        }

        @Override // c.b.b.b.a.a.b
        void d(l lVar, l lVar2) {
            f1507a.putObject(lVar, f1512f, lVar2);
        }

        @Override // c.b.b.b.a.a.b
        void e(l lVar, Thread thread) {
            f1507a.putObject(lVar, f1511e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: c, reason: collision with root package name */
        static final l f1513c = new l(false);

        /* renamed from: a, reason: collision with root package name */
        volatile Thread f1514a;

        /* renamed from: b, reason: collision with root package name */
        volatile l f1515b;

        l() {
            a.g.e(this, Thread.currentThread());
        }

        l(boolean z) {
        }

        void a(l lVar) {
            a.g.d(this, lVar);
        }

        void b() {
            Thread thread = this.f1514a;
            if (thread != null) {
                this.f1514a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v6, types: [c.b.b.b.a.a$a] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v4, types: [c.b.b.b.a.a$k] */
    /* JADX WARN: Type inference failed for: r9v0, types: [c.b.b.b.a.a$f] */
    static {
        h hVar;
        ?? r1 = 0;
        r1 = 0;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "b"));
            } catch (Throwable th2) {
                hVar = new h();
                r1 = th2;
            }
        }
        g = hVar;
        if (r1 != 0) {
            f1487f.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            f1487f.log(Level.SEVERE, "SafeAtomicHelper is broken!", r1);
        }
        h = new Object();
    }

    protected a() {
    }

    private String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void m(StringBuilder sb) {
        String str = "]";
        try {
            Object u = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(u));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    private static CancellationException o(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e p(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1489c;
        } while (!g.a(this, eVar2, e.f1496d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1499c;
            eVar4.f1499c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.x();
            aVar.n();
            e p = aVar.p(eVar);
            while (p != null) {
                eVar = p.f1499c;
                Runnable runnable = p.f1497a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1505b;
                    if (((a) aVar).f1488b == gVar) {
                        if (g.b(aVar, gVar, t(gVar.f1506c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    r(runnable, p.f1498b);
                }
                p = eVar;
            }
            return;
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f1487f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V s(Object obj) {
        if (obj instanceof c) {
            throw o("Task was cancelled.", ((c) obj).f1494b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1495a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(c.b.b.b.a.e<?> eVar) {
        Throwable a2;
        if (eVar instanceof i) {
            Object obj = ((a) eVar).f1488b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f1493a ? cVar.f1494b != null ? new c(false, cVar.f1494b) : c.f1492d : obj;
        }
        if ((eVar instanceof c.b.b.b.a.i.a) && (a2 = c.b.b.b.a.i.b.a((c.b.b.b.a.i.a) eVar)) != null) {
            return new d(a2);
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!f1486e) && isCancelled) {
            return c.f1492d;
        }
        try {
            Object u = u(eVar);
            if (!isCancelled) {
                return u == null ? h : u;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar));
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e2));
        } catch (ExecutionException e3) {
            if (!isCancelled) {
                return new d(e3.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + eVar, e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V u(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void x() {
        l lVar;
        do {
            lVar = this.f1490d;
        } while (!g.c(this, lVar, l.f1513c));
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f1515b;
        }
    }

    private void y(l lVar) {
        lVar.f1514a = null;
        while (true) {
            l lVar2 = this.f1490d;
            if (lVar2 == l.f1513c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f1515b;
                if (lVar2.f1514a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f1515b = lVar4;
                    if (lVar3.f1514a == null) {
                        break;
                    }
                } else if (!g.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean A(Throwable th) {
        c.b.b.a.b.b(th);
        if (!g.b(this, null, new d(th))) {
            return false;
        }
        q(this);
        return true;
    }

    @Override // c.b.b.b.a.e
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        c.b.b.a.b.c(runnable, "Runnable was null.");
        c.b.b.a.b.c(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f1489c) != e.f1496d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1499c = eVar;
                if (g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1489c;
                }
            } while (eVar != e.f1496d);
        }
        r(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.b.b.b.a.i.a
    public final Throwable b() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f1488b;
        if (obj instanceof d) {
            return ((d) obj).f1495a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj = this.f1488b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1486e ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f1491c : c.f1492d;
        boolean z2 = false;
        a<V> aVar = this;
        while (true) {
            if (g.b(aVar, obj, cVar)) {
                if (z) {
                    aVar.v();
                }
                q(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                c.b.b.b.a.e<? extends V> eVar = ((g) obj).f1506c;
                if (!(eVar instanceof i)) {
                    eVar.cancel(z);
                    return true;
                }
                aVar = (a) eVar;
                obj = aVar.f1488b;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = aVar.f1488b;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1488b;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return s(obj2);
        }
        l lVar = this.f1490d;
        if (lVar != l.f1513c) {
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (g.c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            y(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1488b;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return s(obj);
                }
                lVar = this.f1490d;
            } while (lVar != l.f1513c);
        }
        return s(this.f1488b);
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1488b;
        if ((obj != null) && (!(obj instanceof g))) {
            return s(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f1490d;
            if (lVar != l.f1513c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (g.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                y(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1488b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return s(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        y(lVar2);
                    } else {
                        lVar = this.f1490d;
                    }
                } while (lVar != l.f1513c);
            }
            return s(this.f1488b);
        }
        while (nanos > 0) {
            Object obj3 = this.f1488b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return s(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f1488b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f1488b != null);
    }

    protected void n() {
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = w();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            m(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    protected void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String w() {
        Object obj = this.f1488b;
        if (obj instanceof g) {
            return "setFuture=[" + B(((g) obj).f1506c) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z(V v) {
        if (v == null) {
            v = (V) h;
        }
        if (!g.b(this, null, v)) {
            return false;
        }
        q(this);
        return true;
    }
}
