package f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a extends u {
    private static final long h = TimeUnit.SECONDS.toMillis(60);
    private static final long i = TimeUnit.MILLISECONDS.toNanos(h);
    static a j;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2304e;

    /* renamed from: f, reason: collision with root package name */
    private a f2305f;
    private long g;

    /* renamed from: f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0066a implements s {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f2306b;

        C0066a(s sVar) {
            this.f2306b = sVar;
        }

        @Override // f.s
        public u b() {
            return a.this;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.k();
            try {
                try {
                    this.f2306b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // f.s
        public void e(f.c cVar, long j) {
            v.b(cVar.f2313c, 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                p pVar = cVar.f2312b;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += pVar.f2345c - pVar.f2344b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    pVar = pVar.f2348f;
                }
                a.this.k();
                try {
                    try {
                        this.f2306b.e(cVar, j2);
                        j -= j2;
                        a.this.m(true);
                    } catch (IOException e2) {
                        throw a.this.l(e2);
                    }
                } catch (Throwable th) {
                    a.this.m(false);
                    throw th;
                }
            }
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            a.this.k();
            try {
                try {
                    this.f2306b.flush();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f2306b + ")";
        }
    }

    /* loaded from: classes.dex */
    class b implements t {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f2308b;

        b(t tVar) {
            this.f2308b = tVar;
        }

        @Override // f.t
        public u b() {
            return a.this;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.k();
            try {
                try {
                    this.f2308b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            a.this.k();
            try {
                try {
                    long i = this.f2308b.i(cVar, j);
                    a.this.m(true);
                    return i;
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f2308b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
        
            r1.t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<f.a> r0 = f.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                f.a r1 = f.a.i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                f.a r2 = f.a.j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                f.a.j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L1d
            L1c:
                throw r1
            L1d:
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.c.run():void");
        }
    }

    static a i() {
        a aVar = j.f2305f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(h);
            if (j.f2305f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long p = aVar.p(nanoTime);
        if (p > 0) {
            long j2 = p / 1000000;
            a.class.wait(j2, (int) (p - (1000000 * j2)));
            return null;
        }
        j.f2305f = aVar.f2305f;
        aVar.f2305f = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        r1.f2305f = r3.f2305f;
        r3.f2305f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean j(f.a r3) {
        /*
            java.lang.Class<f.a> r0 = f.a.class
            monitor-enter(r0)
            f.a r1 = f.a.j     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r1 == 0) goto L18
            f.a r2 = r1.f2305f     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            f.a r2 = r3.f2305f     // Catch: java.lang.Throwable -> L1a
            r1.f2305f = r2     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.f2305f = r1     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            f.a r1 = r1.f2305f     // Catch: java.lang.Throwable -> L1a
            goto L5
        L18:
            r3 = 1
            goto L13
        L1a:
            r3 = move-exception
            monitor-exit(r0)
            goto L1e
        L1d:
            throw r3
        L1e:
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.j(f.a):boolean");
    }

    private long p(long j2) {
        return this.g - j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:12:0x003c, B:13:0x0042, B:15:0x0046, B:17:0x0051, B:20:0x0054, B:22:0x005e, B:31:0x0036, B:32:0x0063, B:33:0x0068), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void q(f.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<f.a> r0 = f.a.class
            monitor-enter(r0)
            f.a r1 = f.a.j     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L16
            f.a r1 = new f.a     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            f.a.j = r1     // Catch: java.lang.Throwable -> L69
            f.a$c r1 = new f.a$c     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
            r1.start()     // Catch: java.lang.Throwable -> L69
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L69
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.c()     // Catch: java.lang.Throwable -> L69
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L69
        L2b:
            long r7 = r7 + r1
            r6.g = r7     // Catch: java.lang.Throwable -> L69
            goto L3c
        L2f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            goto L2b
        L34:
            if (r9 == 0) goto L63
            long r7 = r6.c()     // Catch: java.lang.Throwable -> L69
            r6.g = r7     // Catch: java.lang.Throwable -> L69
        L3c:
            long r7 = r6.p(r1)     // Catch: java.lang.Throwable -> L69
            f.a r9 = f.a.j     // Catch: java.lang.Throwable -> L69
        L42:
            f.a r3 = r9.f2305f     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L54
            f.a r3 = r9.f2305f     // Catch: java.lang.Throwable -> L69
            long r3 = r3.p(r1)     // Catch: java.lang.Throwable -> L69
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L51
            goto L54
        L51:
            f.a r9 = r9.f2305f     // Catch: java.lang.Throwable -> L69
            goto L42
        L54:
            f.a r7 = r9.f2305f     // Catch: java.lang.Throwable -> L69
            r6.f2305f = r7     // Catch: java.lang.Throwable -> L69
            r9.f2305f = r6     // Catch: java.lang.Throwable -> L69
            f.a r6 = f.a.j     // Catch: java.lang.Throwable -> L69
            if (r9 != r6) goto L61
            r0.notify()     // Catch: java.lang.Throwable -> L69
        L61:
            monitor-exit(r0)
            return
        L63:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L69
            r6.<init>()     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            monitor-exit(r0)
            goto L6d
        L6c:
            throw r6
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.q(f.a, long, boolean):void");
    }

    public final void k() {
        if (this.f2304e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long h2 = h();
        boolean e2 = e();
        if (h2 != 0 || e2) {
            this.f2304e = true;
            q(this, h2, e2);
        }
    }

    final IOException l(IOException iOException) {
        return !n() ? iOException : o(iOException);
    }

    final void m(boolean z) {
        if (n() && z) {
            throw o(null);
        }
    }

    public final boolean n() {
        if (!this.f2304e) {
            return false;
        }
        this.f2304e = false;
        return j(this);
    }

    protected IOException o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final s r(s sVar) {
        return new C0066a(sVar);
    }

    public final t s(t tVar) {
        return new b(tVar);
    }

    protected void t() {
    }
}
