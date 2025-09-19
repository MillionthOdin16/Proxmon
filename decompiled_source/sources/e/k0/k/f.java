package e.k0.k;

import e.k0.k.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Closeable {
    private static final ExecutorService z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.k0.e.G("OkHttp Http2Connection", true));

    /* renamed from: b, reason: collision with root package name */
    final boolean f2127b;

    /* renamed from: c, reason: collision with root package name */
    final j f2128c;

    /* renamed from: e, reason: collision with root package name */
    final String f2130e;

    /* renamed from: f, reason: collision with root package name */
    int f2131f;
    int g;
    private boolean h;
    private final ScheduledExecutorService i;
    private final ExecutorService j;
    final e.k0.k.l k;
    long s;
    final Socket v;
    final e.k0.k.j w;
    final l x;

    /* renamed from: d, reason: collision with root package name */
    final Map<Integer, e.k0.k.i> f2129d = new LinkedHashMap();
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    long r = 0;
    m t = new m();
    final m u = new m();
    final Set<Integer> y = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2132c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e.k0.k.b f2133d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, e.k0.k.b bVar) {
            super(str, objArr);
            this.f2132c = i;
            this.f2133d = bVar;
        }

        @Override // e.k0.d
        public void k() {
            try {
                f.this.g0(this.f2132c, this.f2133d);
            } catch (IOException e2) {
                f.this.L(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2135c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f2136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f2135c = i;
            this.f2136d = j;
        }

        @Override // e.k0.d
        public void k() {
            try {
                f.this.w.L(this.f2135c, this.f2136d);
            } catch (IOException e2) {
                f.this.L(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends e.k0.d {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // e.k0.d
        public void k() {
            f.this.f0(false, 2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2139c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f2140d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f2139c = i;
            this.f2140d = list;
        }

        @Override // e.k0.d
        public void k() {
            if (f.this.k.a(this.f2139c, this.f2140d)) {
                try {
                    f.this.w.J(this.f2139c, e.k0.k.b.CANCEL);
                    synchronized (f.this) {
                        f.this.y.remove(Integer.valueOf(this.f2139c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f2143d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f2144e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f2142c = i;
            this.f2143d = list;
            this.f2144e = z;
        }

        @Override // e.k0.d
        public void k() {
            boolean b2 = f.this.k.b(this.f2142c, this.f2143d, this.f2144e);
            if (b2) {
                try {
                    f.this.w.J(this.f2142c, e.k0.k.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b2 || this.f2144e) {
                synchronized (f.this) {
                    f.this.y.remove(Integer.valueOf(this.f2142c));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.k0.k.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0064f extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2146c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.c f2147d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2148e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f2149f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0064f(String str, Object[] objArr, int i, f.c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f2146c = i;
            this.f2147d = cVar;
            this.f2148e = i2;
            this.f2149f = z;
        }

        @Override // e.k0.d
        public void k() {
            try {
                boolean d2 = f.this.k.d(this.f2146c, this.f2147d, this.f2148e, this.f2149f);
                if (d2) {
                    f.this.w.J(this.f2146c, e.k0.k.b.CANCEL);
                }
                if (d2 || this.f2149f) {
                    synchronized (f.this) {
                        f.this.y.remove(Integer.valueOf(this.f2146c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e.k0.k.b f2151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, e.k0.k.b bVar) {
            super(str, objArr);
            this.f2150c = i;
            this.f2151d = bVar;
        }

        @Override // e.k0.d
        public void k() {
            f.this.k.c(this.f2150c, this.f2151d);
            synchronized (f.this) {
                f.this.y.remove(Integer.valueOf(this.f2150c));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        Socket f2153a;

        /* renamed from: b, reason: collision with root package name */
        String f2154b;

        /* renamed from: c, reason: collision with root package name */
        f.e f2155c;

        /* renamed from: d, reason: collision with root package name */
        f.d f2156d;

        /* renamed from: e, reason: collision with root package name */
        j f2157e = j.f2160a;

        /* renamed from: f, reason: collision with root package name */
        e.k0.k.l f2158f = e.k0.k.l.f2217a;
        boolean g;
        int h;

        public h(boolean z) {
            this.g = z;
        }

        public f a() {
            return new f(this);
        }

        public h b(j jVar) {
            this.f2157e = jVar;
            return this;
        }

        public h c(int i) {
            this.h = i;
            return this;
        }

        public h d(Socket socket, String str, f.e eVar, f.d dVar) {
            this.f2153a = socket;
            this.f2154b = str;
            this.f2155c = eVar;
            this.f2156d = dVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    final class i extends e.k0.d {
        i() {
            super("OkHttp %s ping", f.this.f2130e);
        }

        @Override // e.k0.d
        public void k() {
            boolean z;
            synchronized (f.this) {
                if (f.this.m < f.this.l) {
                    z = true;
                } else {
                    f.D(f.this);
                    z = false;
                }
            }
            f fVar = f.this;
            if (z) {
                fVar.L(null);
            } else {
                fVar.f0(false, 1, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public static final j f2160a = new a();

        /* loaded from: classes.dex */
        class a extends j {
            a() {
            }

            @Override // e.k0.k.f.j
            public void b(e.k0.k.i iVar) {
                iVar.d(e.k0.k.b.REFUSED_STREAM, null);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(e.k0.k.i iVar);
    }

    /* loaded from: classes.dex */
    final class k extends e.k0.d {

        /* renamed from: c, reason: collision with root package name */
        final boolean f2161c;

        /* renamed from: d, reason: collision with root package name */
        final int f2162d;

        /* renamed from: e, reason: collision with root package name */
        final int f2163e;

        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", f.this.f2130e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f2161c = z;
            this.f2162d = i;
            this.f2163e = i2;
        }

        @Override // e.k0.d
        public void k() {
            f.this.f0(this.f2161c, this.f2162d, this.f2163e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l extends e.k0.d implements h.b {

        /* renamed from: c, reason: collision with root package name */
        final e.k0.k.h f2165c;

        /* loaded from: classes.dex */
        class a extends e.k0.d {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e.k0.k.i f2167c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, e.k0.k.i iVar) {
                super(str, objArr);
                this.f2167c = iVar;
            }

            @Override // e.k0.d
            public void k() {
                try {
                    f.this.f2128c.b(this.f2167c);
                } catch (IOException e2) {
                    e.k0.l.f.j().p(4, "Http2Connection.Listener failure for " + f.this.f2130e, e2);
                    try {
                        this.f2167c.d(e.k0.k.b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends e.k0.d {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f2169c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ m f2170d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z, m mVar) {
                super(str, objArr);
                this.f2169c = z;
                this.f2170d = mVar;
            }

            @Override // e.k0.d
            public void k() {
                l.this.l(this.f2169c, this.f2170d);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c extends e.k0.d {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // e.k0.d
            public void k() {
                f fVar = f.this;
                fVar.f2128c.a(fVar);
            }
        }

        l(e.k0.k.h hVar) {
            super("OkHttp %s", f.this.f2130e);
            this.f2165c = hVar;
        }

        @Override // e.k0.k.h.b
        public void a(boolean z, int i, int i2, List<e.k0.k.c> list) {
            if (f.this.W(i)) {
                f.this.T(i, list, z);
                return;
            }
            synchronized (f.this) {
                e.k0.k.i M = f.this.M(i);
                if (M != null) {
                    M.n(e.k0.e.I(list), z);
                    return;
                }
                if (f.this.h) {
                    return;
                }
                if (i <= f.this.f2131f) {
                    return;
                }
                if (i % 2 == f.this.g % 2) {
                    return;
                }
                e.k0.k.i iVar = new e.k0.k.i(i, f.this, false, z, e.k0.e.I(list));
                f.this.f2131f = i;
                f.this.f2129d.put(Integer.valueOf(i), iVar);
                f.z.execute(new a("OkHttp %s stream %d", new Object[]{f.this.f2130e, Integer.valueOf(i)}, iVar));
            }
        }

        @Override // e.k0.k.h.b
        public void b() {
        }

        @Override // e.k0.k.h.b
        public void c(int i, long j) {
            f fVar = f.this;
            if (i == 0) {
                synchronized (fVar) {
                    f.this.s += j;
                    f.this.notifyAll();
                }
                return;
            }
            e.k0.k.i M = fVar.M(i);
            if (M != null) {
                synchronized (M) {
                    M.a(j);
                }
            }
        }

        @Override // e.k0.k.h.b
        public void d(boolean z, m mVar) {
            try {
                f.this.i.execute(new b("OkHttp %s ACK Settings", new Object[]{f.this.f2130e}, z, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // e.k0.k.h.b
        public void e(int i, int i2, List<e.k0.k.c> list) {
            f.this.U(i2, list);
        }

        @Override // e.k0.k.h.b
        public void f(boolean z, int i, f.e eVar, int i2) {
            if (f.this.W(i)) {
                f.this.R(i, eVar, i2, z);
                return;
            }
            e.k0.k.i M = f.this.M(i);
            if (M == null) {
                f.this.h0(i, e.k0.k.b.PROTOCOL_ERROR);
                long j = i2;
                f.this.c0(j);
                eVar.l(j);
                return;
            }
            M.m(eVar, i2);
            if (z) {
                M.n(e.k0.e.f1990c, true);
            }
        }

        @Override // e.k0.k.h.b
        public void g(boolean z, int i, int i2) {
            if (!z) {
                try {
                    f.this.i.execute(new k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (f.this) {
                try {
                    if (i == 1) {
                        f.B(f.this);
                    } else if (i == 2) {
                        f.I(f.this);
                    } else if (i == 3) {
                        f.J(f.this);
                        f.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // e.k0.k.h.b
        public void h(int i, e.k0.k.b bVar, f.f fVar) {
            e.k0.k.i[] iVarArr;
            fVar.o();
            synchronized (f.this) {
                iVarArr = (e.k0.k.i[]) f.this.f2129d.values().toArray(new e.k0.k.i[f.this.f2129d.size()]);
                f.this.h = true;
            }
            for (e.k0.k.i iVar : iVarArr) {
                if (iVar.g() > i && iVar.j()) {
                    iVar.o(e.k0.k.b.REFUSED_STREAM);
                    f.this.X(iVar.g());
                }
            }
        }

        @Override // e.k0.k.h.b
        public void i(int i, int i2, int i3, boolean z) {
        }

        @Override // e.k0.k.h.b
        public void j(int i, e.k0.k.b bVar) {
            if (f.this.W(i)) {
                f.this.V(i, bVar);
                return;
            }
            e.k0.k.i X = f.this.X(i);
            if (X != null) {
                X.o(bVar);
            }
        }

        @Override // e.k0.d
        protected void k() {
            e.k0.k.b bVar;
            e.k0.k.b bVar2;
            e.k0.k.b bVar3 = e.k0.k.b.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                this.f2165c.B(this);
                do {
                } while (this.f2165c.A(false, this));
                bVar = e.k0.k.b.NO_ERROR;
                try {
                    try {
                        bVar2 = e.k0.k.b.CANCEL;
                    } catch (IOException e3) {
                        e2 = e3;
                        bVar = e.k0.k.b.PROTOCOL_ERROR;
                        bVar2 = e.k0.k.b.PROTOCOL_ERROR;
                        f.this.K(bVar, bVar2, e2);
                        e.k0.e.e(this.f2165c);
                    }
                } catch (Throwable th) {
                    th = th;
                    f.this.K(bVar, bVar3, e2);
                    e.k0.e.e(this.f2165c);
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar3;
                f.this.K(bVar, bVar3, e2);
                e.k0.e.e(this.f2165c);
                throw th;
            }
            f.this.K(bVar, bVar2, e2);
            e.k0.e.e(this.f2165c);
        }

        void l(boolean z, m mVar) {
            e.k0.k.i[] iVarArr;
            long j;
            synchronized (f.this.w) {
                synchronized (f.this) {
                    int d2 = f.this.u.d();
                    if (z) {
                        f.this.u.a();
                    }
                    f.this.u.h(mVar);
                    int d3 = f.this.u.d();
                    iVarArr = null;
                    if (d3 == -1 || d3 == d2) {
                        j = 0;
                    } else {
                        j = d3 - d2;
                        if (!f.this.f2129d.isEmpty()) {
                            iVarArr = (e.k0.k.i[]) f.this.f2129d.values().toArray(new e.k0.k.i[f.this.f2129d.size()]);
                        }
                    }
                }
                try {
                    f.this.w.r(f.this.u);
                } catch (IOException e2) {
                    f.this.L(e2);
                }
            }
            if (iVarArr != null) {
                for (e.k0.k.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j);
                    }
                }
            }
            f.z.execute(new c("OkHttp %s settings", f.this.f2130e));
        }
    }

    f(h hVar) {
        this.k = hVar.f2158f;
        boolean z2 = hVar.g;
        this.f2127b = z2;
        this.f2128c = hVar.f2157e;
        int i2 = z2 ? 1 : 2;
        this.g = i2;
        if (hVar.g) {
            this.g = i2 + 2;
        }
        if (hVar.g) {
            this.t.i(7, 16777216);
        }
        this.f2130e = hVar.f2154b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, e.k0.e.G(e.k0.e.o("OkHttp %s Writer", this.f2130e), false));
        this.i = scheduledThreadPoolExecutor;
        if (hVar.h != 0) {
            i iVar = new i();
            int i3 = hVar.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i3, i3, TimeUnit.MILLISECONDS);
        }
        this.j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.k0.e.G(e.k0.e.o("OkHttp %s Push Observer", this.f2130e), true));
        this.u.i(7, 65535);
        this.u.i(5, 16384);
        this.s = this.u.d();
        this.v = hVar.f2153a;
        this.w = new e.k0.k.j(hVar.f2156d, this.f2127b);
        this.x = new l(new e.k0.k.h(hVar.f2155c, this.f2127b));
    }

    static /* synthetic */ long B(f fVar) {
        long j2 = fVar.m;
        fVar.m = 1 + j2;
        return j2;
    }

    static /* synthetic */ long D(f fVar) {
        long j2 = fVar.l;
        fVar.l = 1 + j2;
        return j2;
    }

    static /* synthetic */ long I(f fVar) {
        long j2 = fVar.o;
        fVar.o = 1 + j2;
        return j2;
    }

    static /* synthetic */ long J(f fVar) {
        long j2 = fVar.p;
        fVar.p = 1 + j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(IOException iOException) {
        e.k0.k.b bVar = e.k0.k.b.PROTOCOL_ERROR;
        K(bVar, bVar, iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002b, B:15:0x0033, B:19:0x003d, B:21:0x0043, B:22:0x004c, B:36:0x006f, B:37:0x0074), top: B:5:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private e.k0.k.i P(int r11, java.util.List<e.k0.k.c> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            e.k0.k.j r7 = r10.w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            int r0 = r10.g     // Catch: java.lang.Throwable -> L75
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            e.k0.k.b r0 = e.k0.k.b.REFUSED_STREAM     // Catch: java.lang.Throwable -> L75
            r10.Z(r0)     // Catch: java.lang.Throwable -> L75
        L13:
            boolean r0 = r10.h     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L6f
            int r8 = r10.g     // Catch: java.lang.Throwable -> L75
            int r0 = r10.g     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 2
            r10.g = r0     // Catch: java.lang.Throwable -> L75
            e.k0.k.i r9 = new e.k0.k.i     // Catch: java.lang.Throwable -> L75
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L3c
            long r0 = r10.s     // Catch: java.lang.Throwable -> L75
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3c
            long r0 = r9.f2190b     // Catch: java.lang.Throwable -> L75
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3a
            goto L3c
        L3a:
            r13 = 0
            goto L3d
        L3c:
            r13 = 1
        L3d:
            boolean r0 = r9.k()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.Integer, e.k0.k.i> r0 = r10.f2129d     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L75
        L4c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L55
            e.k0.k.j r11 = r10.w     // Catch: java.lang.Throwable -> L78
            r11.F(r6, r8, r12)     // Catch: java.lang.Throwable -> L78
            goto L5e
        L55:
            boolean r0 = r10.f2127b     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L67
            e.k0.k.j r0 = r10.w     // Catch: java.lang.Throwable -> L78
            r0.I(r11, r8, r12)     // Catch: java.lang.Throwable -> L78
        L5e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L66
            e.k0.k.j r11 = r10.w
            r11.flush()
        L66:
            return r9
        L67:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L78
            throw r11     // Catch: java.lang.Throwable -> L78
        L6f:
            e.k0.k.a r11 = new e.k0.k.a     // Catch: java.lang.Throwable -> L75
            r11.<init>()     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L75
        L75:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L78
        L78:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k0.k.f.P(int, java.util.List, boolean):e.k0.k.i");
    }

    private synchronized void S(e.k0.d dVar) {
        if (!this.h) {
            this.j.execute(dVar);
        }
    }

    void K(e.k0.k.b bVar, e.k0.k.b bVar2, IOException iOException) {
        try {
            Z(bVar);
        } catch (IOException unused) {
        }
        e.k0.k.i[] iVarArr = null;
        synchronized (this) {
            if (!this.f2129d.isEmpty()) {
                iVarArr = (e.k0.k.i[]) this.f2129d.values().toArray(new e.k0.k.i[this.f2129d.size()]);
                this.f2129d.clear();
            }
        }
        if (iVarArr != null) {
            for (e.k0.k.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.i.shutdown();
        this.j.shutdown();
    }

    synchronized e.k0.k.i M(int i2) {
        return this.f2129d.get(Integer.valueOf(i2));
    }

    public synchronized boolean N(long j2) {
        if (this.h) {
            return false;
        }
        if (this.o < this.n) {
            if (j2 >= this.q) {
                return false;
            }
        }
        return true;
    }

    public synchronized int O() {
        return this.u.e(Integer.MAX_VALUE);
    }

    public e.k0.k.i Q(List<e.k0.k.c> list, boolean z2) {
        return P(0, list, z2);
    }

    void R(int i2, f.e eVar, int i3, boolean z2) {
        f.c cVar = new f.c();
        long j2 = i3;
        eVar.q(j2);
        eVar.i(cVar, j2);
        if (cVar.N() == j2) {
            S(new C0064f("OkHttp %s Push Data[%s]", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, cVar, i3, z2));
            return;
        }
        throw new IOException(cVar.N() + " != " + i3);
    }

    void T(int i2, List<e.k0.k.c> list, boolean z2) {
        try {
            S(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    void U(int i2, List<e.k0.k.c> list) {
        synchronized (this) {
            if (this.y.contains(Integer.valueOf(i2))) {
                h0(i2, e.k0.k.b.PROTOCOL_ERROR);
                return;
            }
            this.y.add(Integer.valueOf(i2));
            try {
                S(new d("OkHttp %s Push Request[%s]", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    void V(int i2, e.k0.k.b bVar) {
        S(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, bVar));
    }

    boolean W(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized e.k0.k.i X(int i2) {
        e.k0.k.i remove;
        remove = this.f2129d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y() {
        synchronized (this) {
            if (this.o < this.n) {
                return;
            }
            this.n++;
            this.q = System.nanoTime() + 1000000000;
            try {
                this.i.execute(new c("OkHttp %s ping", this.f2130e));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void Z(e.k0.k.b bVar) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.w.E(this.f2131f, bVar, e.k0.e.f1988a);
            }
        }
    }

    public void a0() {
        b0(true);
    }

    void b0(boolean z2) {
        if (z2) {
            this.w.A();
            this.w.K(this.t);
            if (this.t.d() != 65535) {
                this.w.L(0, r6 - 65535);
            }
        }
        new Thread(this.x).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c0(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= this.t.d() / 2) {
            i0(0, this.r);
            this.r = 0L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        K(e.k0.k.b.NO_ERROR, e.k0.k.b.CANCEL, null);
    }

    public void d0(int i2, boolean z2, f.c cVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.w.B(z2, i2, cVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (this.s <= 0) {
                    try {
                        if (!this.f2129d.containsKey(Integer.valueOf(i2))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j2, this.s), this.w.G());
                j3 = min;
                this.s -= j3;
            }
            j2 -= j3;
            this.w.B(z2 && j2 == 0, i2, cVar, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(int i2, boolean z2, List<e.k0.k.c> list) {
        this.w.F(z2, i2, list);
    }

    void f0(boolean z2, int i2, int i3) {
        try {
            this.w.H(z2, i2, i3);
        } catch (IOException e2) {
            L(e2);
        }
    }

    public void flush() {
        this.w.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g0(int i2, e.k0.k.b bVar) {
        this.w.J(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(int i2, e.k0.k.b bVar) {
        try {
            this.i.execute(new a("OkHttp %s stream %d", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(int i2, long j2) {
        try {
            this.i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f2130e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
