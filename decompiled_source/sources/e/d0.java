package e;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 implements j {

    /* renamed from: b, reason: collision with root package name */
    final b0 f1919b;

    /* renamed from: c, reason: collision with root package name */
    private e.k0.h.k f1920c;

    /* renamed from: d, reason: collision with root package name */
    final e0 f1921d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f1922e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1923f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        private final k f1924c;

        /* renamed from: d, reason: collision with root package name */
        private volatile AtomicInteger f1925d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0 f1926e;

        @Override // e.k0.d
        protected void k() {
            Throwable th;
            boolean z;
            IOException e2;
            this.f1926e.f1920c.p();
            try {
                try {
                    z = true;
                    try {
                        this.f1924c.a(this.f1926e, this.f1926e.d());
                    } catch (IOException e3) {
                        e2 = e3;
                        if (z) {
                            e.k0.l.f.j().p(4, "Callback failure for " + this.f1926e.h(), e2);
                        } else {
                            this.f1924c.b(this.f1926e, e2);
                        }
                        this.f1926e.f1919b.h().d(this);
                    } catch (Throwable th2) {
                        th = th2;
                        this.f1926e.b();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.addSuppressed(th);
                            this.f1924c.b(this.f1926e, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.f1926e.f1919b.h().d(this);
                    throw th3;
                }
            } catch (IOException e4) {
                e2 = e4;
                z = false;
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
            this.f1926e.f1919b.h().d(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AtomicInteger l() {
            return this.f1925d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.f1926e.f1920c.l(interruptedIOException);
                    this.f1924c.b(this.f1926e, interruptedIOException);
                    this.f1926e.f1919b.h().d(this);
                }
            } catch (Throwable th) {
                this.f1926e.f1919b.h().d(this);
                throw th;
            }
        }
    }

    private d0(b0 b0Var, e0 e0Var, boolean z) {
        this.f1919b = b0Var;
        this.f1921d = e0Var;
        this.f1922e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 f(b0 b0Var, e0 e0Var, boolean z) {
        d0 d0Var = new d0(b0Var, e0Var, z);
        d0Var.f1920c = new e.k0.h.k(b0Var, d0Var);
        return d0Var;
    }

    public void b() {
        this.f1920c.d();
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d0 clone() {
        return f(this.f1919b, this.f1921d, this.f1922e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    e.g0 d() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            e.b0 r0 = r11.f1919b
            java.util.List r0 = r0.n()
            r1.addAll(r0)
            e.k0.i.j r0 = new e.k0.i.j
            e.b0 r2 = r11.f1919b
            r0.<init>(r2)
            r1.add(r0)
            e.k0.i.a r0 = new e.k0.i.a
            e.b0 r2 = r11.f1919b
            e.r r2 = r2.g()
            r0.<init>(r2)
            r1.add(r0)
            e.k0.g.a r0 = new e.k0.g.a
            e.b0 r2 = r11.f1919b
            e.k0.g.d r2 = r2.o()
            r0.<init>(r2)
            r1.add(r0)
            e.k0.h.b r0 = new e.k0.h.b
            e.b0 r2 = r11.f1919b
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f1922e
            if (r0 != 0) goto L4b
            e.b0 r0 = r11.f1919b
            java.util.List r0 = r0.p()
            r1.addAll(r0)
        L4b:
            e.k0.i.b r0 = new e.k0.i.b
            boolean r2 = r11.f1922e
            r0.<init>(r2)
            r1.add(r0)
            e.k0.i.g r10 = new e.k0.i.g
            e.k0.h.k r2 = r11.f1920c
            r3 = 0
            r4 = 0
            e.e0 r5 = r11.f1921d
            e.b0 r0 = r11.f1919b
            int r7 = r0.d()
            e.b0 r0 = r11.f1919b
            int r8 = r0.z()
            e.b0 r0 = r11.f1919b
            int r9 = r0.D()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            e.e0 r2 = r11.f1921d     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            e.g0 r2 = r10.b(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            e.k0.h.k r3 = r11.f1920c     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.i()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            e.k0.h.k r0 = r11.f1920c
            r0.l(r1)
            return r2
        L8a:
            e.k0.e.e(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La3
        L97:
            r0 = move-exception
            r2 = 1
            e.k0.h.k r3 = r11.f1920c     // Catch: java.lang.Throwable -> La0
            java.io.IOException r0 = r3.l(r0)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        La3:
            if (r0 != 0) goto Laa
            e.k0.h.k r0 = r11.f1920c
            r0.l(r1)
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d0.d():e.g0");
    }

    public boolean e() {
        return this.f1920c.i();
    }

    String g() {
        return this.f1921d.h().z();
    }

    String h() {
        StringBuilder sb = new StringBuilder();
        sb.append(e() ? "canceled " : BuildConfig.VERSION_NAME);
        sb.append(this.f1922e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(g());
        return sb.toString();
    }

    @Override // e.j
    public g0 r() {
        synchronized (this) {
            if (this.f1923f) {
                throw new IllegalStateException("Already Executed");
            }
            this.f1923f = true;
        }
        this.f1920c.p();
        this.f1920c.b();
        try {
            this.f1919b.h().a(this);
            return d();
        } finally {
            this.f1919b.h().e(this);
        }
    }
}
