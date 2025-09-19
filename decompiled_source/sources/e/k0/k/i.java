package e.k0.k;

import e.x;
import f.s;
import f.t;
import f.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    long f2190b;

    /* renamed from: c, reason: collision with root package name */
    final int f2191c;

    /* renamed from: d, reason: collision with root package name */
    final f f2192d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2194f;
    private final b g;
    final a h;
    e.k0.k.b k;
    IOException l;

    /* renamed from: a, reason: collision with root package name */
    long f2189a = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Deque<x> f2193e = new ArrayDeque();
    final c i = new c();
    final c j = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements s {

        /* renamed from: b, reason: collision with root package name */
        private final f.c f2195b = new f.c();

        /* renamed from: c, reason: collision with root package name */
        private x f2196c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2197d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2198e;

        a() {
        }

        private void r(boolean z) {
            long min;
            boolean z2;
            synchronized (i.this) {
                i.this.j.k();
                while (i.this.f2190b <= 0 && !this.f2198e && !this.f2197d && i.this.k == null) {
                    try {
                        i.this.q();
                    } finally {
                        i.this.j.u();
                    }
                }
                i.this.j.u();
                i.this.c();
                min = Math.min(i.this.f2190b, this.f2195b.N());
                i.this.f2190b -= min;
            }
            i.this.j.k();
            if (z) {
                try {
                    if (min == this.f2195b.N()) {
                        z2 = true;
                        i.this.f2192d.d0(i.this.f2191c, z2, this.f2195b, min);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = false;
            i.this.f2192d.d0(i.this.f2191c, z2, this.f2195b, min);
        }

        @Override // f.s
        public u b() {
            return i.this.j;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                if (this.f2197d) {
                    return;
                }
                if (!i.this.h.f2198e) {
                    boolean z = this.f2195b.N() > 0;
                    if (this.f2196c != null) {
                        while (this.f2195b.N() > 0) {
                            r(false);
                        }
                        i iVar = i.this;
                        iVar.f2192d.e0(iVar.f2191c, true, e.k0.e.H(this.f2196c));
                    } else if (z) {
                        while (this.f2195b.N() > 0) {
                            r(true);
                        }
                    } else {
                        i iVar2 = i.this;
                        iVar2.f2192d.d0(iVar2.f2191c, true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f2197d = true;
                }
                i.this.f2192d.flush();
                i.this.b();
            }
        }

        @Override // f.s
        public void e(f.c cVar, long j) {
            this.f2195b.e(cVar, j);
            while (this.f2195b.N() >= 16384) {
                r(false);
            }
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f2195b.N() > 0) {
                r(false);
                i.this.f2192d.flush();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements t {

        /* renamed from: b, reason: collision with root package name */
        private final f.c f2200b = new f.c();

        /* renamed from: c, reason: collision with root package name */
        private final f.c f2201c = new f.c();

        /* renamed from: d, reason: collision with root package name */
        private final long f2202d;

        /* renamed from: e, reason: collision with root package name */
        private x f2203e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2204f;
        boolean g;

        b(long j) {
            this.f2202d = j;
        }

        private void B(long j) {
            i.this.f2192d.c0(j);
        }

        void A(f.e eVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (i.this) {
                    z = this.g;
                    z2 = true;
                    z3 = this.f2201c.N() + j > this.f2202d;
                }
                if (z3) {
                    eVar.l(j);
                    i.this.f(e.k0.k.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.l(j);
                    return;
                }
                long i = eVar.i(this.f2200b, j);
                if (i == -1) {
                    throw new EOFException();
                }
                j -= i;
                synchronized (i.this) {
                    if (this.f2204f) {
                        j2 = this.f2200b.N();
                        this.f2200b.A();
                    } else {
                        if (this.f2201c.N() != 0) {
                            z2 = false;
                        }
                        this.f2201c.U(this.f2200b);
                        if (z2) {
                            i.this.notifyAll();
                        }
                        j2 = 0;
                    }
                }
                if (j2 > 0) {
                    B(j2);
                }
            }
        }

        @Override // f.t
        public u b() {
            return i.this.i;
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long N;
            synchronized (i.this) {
                this.f2204f = true;
                N = this.f2201c.N();
                this.f2201c.A();
                i.this.notifyAll();
            }
            if (N > 0) {
                B(N);
            }
            i.this.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
        @Override // f.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long i(f.c r11, long r12) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.k0.k.i.b.i(f.c, long):long");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends f.a {
        c() {
        }

        @Override // f.a
        protected IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // f.a
        protected void t() {
            i.this.f(e.k0.k.b.CANCEL);
            i.this.f2192d.Y();
        }

        public void u() {
            if (n()) {
                throw o(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i, f fVar, boolean z, boolean z2, x xVar) {
        if (fVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f2191c = i;
        this.f2192d = fVar;
        this.f2190b = fVar.u.d();
        this.g = new b(fVar.t.d());
        a aVar = new a();
        this.h = aVar;
        this.g.g = z2;
        aVar.f2198e = z;
        if (xVar != null) {
            this.f2193e.add(xVar);
        }
        if (j() && xVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!j() && xVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean e(e.k0.k.b bVar, IOException iOException) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.g && this.h.f2198e) {
                return false;
            }
            this.k = bVar;
            this.l = iOException;
            notifyAll();
            this.f2192d.X(this.f2191c);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.f2190b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    void b() {
        boolean z;
        boolean k;
        synchronized (this) {
            z = !this.g.g && this.g.f2204f && (this.h.f2198e || this.h.f2197d);
            k = k();
        }
        if (z) {
            d(e.k0.k.b.CANCEL, null);
        } else {
            if (k) {
                return;
            }
            this.f2192d.X(this.f2191c);
        }
    }

    void c() {
        a aVar = this.h;
        if (aVar.f2197d) {
            throw new IOException("stream closed");
        }
        if (aVar.f2198e) {
            throw new IOException("stream finished");
        }
        if (this.k != null) {
            IOException iOException = this.l;
            if (iOException == null) {
                throw new n(this.k);
            }
        }
    }

    public void d(e.k0.k.b bVar, IOException iOException) {
        if (e(bVar, iOException)) {
            this.f2192d.g0(this.f2191c, bVar);
        }
    }

    public void f(e.k0.k.b bVar) {
        if (e(bVar, null)) {
            this.f2192d.h0(this.f2191c, bVar);
        }
    }

    public int g() {
        return this.f2191c;
    }

    public s h() {
        synchronized (this) {
            if (!this.f2194f && !j()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public t i() {
        return this.g;
    }

    public boolean j() {
        return this.f2192d.f2127b == ((this.f2191c & 1) == 1);
    }

    public synchronized boolean k() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.g || this.g.f2204f) && (this.h.f2198e || this.h.f2197d)) {
            if (this.f2194f) {
                return false;
            }
        }
        return true;
    }

    public u l() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(f.e eVar, int i) {
        this.g.A(eVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0018, B:10:0x001c, B:11:0x0023, B:18:0x000f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(e.x r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2194f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            e.k0.k.i$b r0 = r2.g     // Catch: java.lang.Throwable -> L2e
            e.k0.k.i.b.r(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f2194f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<e.x> r0 = r2.f2193e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            e.k0.k.i$b r3 = r2.g     // Catch: java.lang.Throwable -> L2e
            r3.g = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.k()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            e.k0.k.f r3 = r2.f2192d
            int r4 = r2.f2191c
            r3.X(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k0.k.i.n(e.x, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void o(e.k0.k.b bVar) {
        if (this.k == null) {
            this.k = bVar;
            notifyAll();
        }
    }

    public synchronized x p() {
        this.i.k();
        while (this.f2193e.isEmpty() && this.k == null) {
            try {
                q();
            } catch (Throwable th) {
                this.i.u();
                throw th;
            }
        }
        this.i.u();
        if (this.f2193e.isEmpty()) {
            if (this.l != null) {
                throw this.l;
            }
            throw new n(this.k);
        }
        return this.f2193e.removeFirst();
    }

    void q() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public u r() {
        return this.j;
    }
}
