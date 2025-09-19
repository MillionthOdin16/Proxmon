package e.k0.j;

import e.b0;
import e.e0;
import e.g0;
import e.k0.i.k;
import e.x;
import e.y;
import f.i;
import f.s;
import f.t;
import f.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements e.k0.i.c {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f2078a;

    /* renamed from: b, reason: collision with root package name */
    private final e.k0.h.f f2079b;

    /* renamed from: c, reason: collision with root package name */
    private final f.e f2080c;

    /* renamed from: d, reason: collision with root package name */
    private final f.d f2081d;

    /* renamed from: e, reason: collision with root package name */
    private int f2082e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f2083f = 262144;
    private x g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b implements t {

        /* renamed from: b, reason: collision with root package name */
        protected final i f2084b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f2085c;

        private b() {
            this.f2084b = new i(a.this.f2080c.b());
        }

        @Override // f.t
        public u b() {
            return this.f2084b;
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            try {
                return a.this.f2080c.i(cVar, j);
            } catch (IOException e2) {
                a.this.f2079b.p();
                r();
                throw e2;
            }
        }

        final void r() {
            if (a.this.f2082e == 6) {
                return;
            }
            if (a.this.f2082e == 5) {
                a.this.s(this.f2084b);
                a.this.f2082e = 6;
            } else {
                throw new IllegalStateException("state: " + a.this.f2082e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements s {

        /* renamed from: b, reason: collision with root package name */
        private final i f2087b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2088c;

        c() {
            this.f2087b = new i(a.this.f2081d.b());
        }

        @Override // f.s
        public u b() {
            return this.f2087b;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f2088c) {
                return;
            }
            this.f2088c = true;
            a.this.f2081d.s("0\r\n\r\n");
            a.this.s(this.f2087b);
            a.this.f2082e = 3;
        }

        @Override // f.s
        public void e(f.c cVar, long j) {
            if (this.f2088c) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            a.this.f2081d.h(j);
            a.this.f2081d.s("\r\n");
            a.this.f2081d.e(cVar, j);
            a.this.f2081d.s("\r\n");
        }

        @Override // f.s, java.io.Flushable
        public synchronized void flush() {
            if (this.f2088c) {
                return;
            }
            a.this.f2081d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends b {

        /* renamed from: e, reason: collision with root package name */
        private final y f2090e;

        /* renamed from: f, reason: collision with root package name */
        private long f2091f;
        private boolean g;

        d(y yVar) {
            super();
            this.f2091f = -1L;
            this.g = true;
            this.f2090e = yVar;
        }

        private void A() {
            if (this.f2091f != -1) {
                a.this.f2080c.o();
            }
            try {
                this.f2091f = a.this.f2080c.z();
                String trim = a.this.f2080c.o().trim();
                if (this.f2091f < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f2091f + trim + "\"");
                }
                if (this.f2091f == 0) {
                    this.g = false;
                    a aVar = a.this;
                    aVar.g = aVar.z();
                    e.k0.i.e.e(a.this.f2078a.g(), this.f2090e, a.this.g);
                    r();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2085c) {
                return;
            }
            if (this.g && !e.k0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f2079b.p();
                r();
            }
            this.f2085c = true;
        }

        @Override // e.k0.j.a.b, f.t
        public long i(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f2085c) {
                throw new IllegalStateException("closed");
            }
            if (!this.g) {
                return -1L;
            }
            long j2 = this.f2091f;
            if (j2 == 0 || j2 == -1) {
                A();
                if (!this.g) {
                    return -1L;
                }
            }
            long i = super.i(cVar, Math.min(j, this.f2091f));
            if (i != -1) {
                this.f2091f -= i;
                return i;
            }
            a.this.f2079b.p();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            r();
            throw protocolException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends b {

        /* renamed from: e, reason: collision with root package name */
        private long f2092e;

        e(long j) {
            super();
            this.f2092e = j;
            if (j == 0) {
                r();
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2085c) {
                return;
            }
            if (this.f2092e != 0 && !e.k0.e.n(this, 100, TimeUnit.MILLISECONDS)) {
                a.this.f2079b.p();
                r();
            }
            this.f2085c = true;
        }

        @Override // e.k0.j.a.b, f.t
        public long i(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f2085c) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f2092e;
            if (j2 == 0) {
                return -1L;
            }
            long i = super.i(cVar, Math.min(j2, j));
            if (i == -1) {
                a.this.f2079b.p();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                r();
                throw protocolException;
            }
            long j3 = this.f2092e - i;
            this.f2092e = j3;
            if (j3 == 0) {
                r();
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class f implements s {

        /* renamed from: b, reason: collision with root package name */
        private final i f2094b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2095c;

        private f() {
            this.f2094b = new i(a.this.f2081d.b());
        }

        @Override // f.s
        public u b() {
            return this.f2094b;
        }

        @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2095c) {
                return;
            }
            this.f2095c = true;
            a.this.s(this.f2094b);
            a.this.f2082e = 3;
        }

        @Override // f.s
        public void e(f.c cVar, long j) {
            if (this.f2095c) {
                throw new IllegalStateException("closed");
            }
            e.k0.e.d(cVar.N(), 0L, j);
            a.this.f2081d.e(cVar, j);
        }

        @Override // f.s, java.io.Flushable
        public void flush() {
            if (this.f2095c) {
                return;
            }
            a.this.f2081d.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends b {

        /* renamed from: e, reason: collision with root package name */
        private boolean f2097e;

        private g(a aVar) {
            super();
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f2085c) {
                return;
            }
            if (!this.f2097e) {
                r();
            }
            this.f2085c = true;
        }

        @Override // e.k0.j.a.b, f.t
        public long i(f.c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f2085c) {
                throw new IllegalStateException("closed");
            }
            if (this.f2097e) {
                return -1L;
            }
            long i = super.i(cVar, j);
            if (i != -1) {
                return i;
            }
            this.f2097e = true;
            r();
            return -1L;
        }
    }

    public a(b0 b0Var, e.k0.h.f fVar, f.e eVar, f.d dVar) {
        this.f2078a = b0Var;
        this.f2079b = fVar;
        this.f2080c = eVar;
        this.f2081d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(i iVar) {
        u i = iVar.i();
        iVar.j(u.f2351d);
        i.a();
        i.b();
    }

    private s t() {
        if (this.f2082e == 1) {
            this.f2082e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f2082e);
    }

    private t u(y yVar) {
        if (this.f2082e == 4) {
            this.f2082e = 5;
            return new d(yVar);
        }
        throw new IllegalStateException("state: " + this.f2082e);
    }

    private t v(long j) {
        if (this.f2082e == 4) {
            this.f2082e = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f2082e);
    }

    private s w() {
        if (this.f2082e == 1) {
            this.f2082e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f2082e);
    }

    private t x() {
        if (this.f2082e == 4) {
            this.f2082e = 5;
            this.f2079b.p();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f2082e);
    }

    private String y() {
        String k = this.f2080c.k(this.f2083f);
        this.f2083f -= k.length();
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x z() {
        x.a aVar = new x.a();
        while (true) {
            String y = y();
            if (y.length() == 0) {
                return aVar.d();
            }
            e.k0.c.f1986a.a(aVar, y);
        }
    }

    public void A(g0 g0Var) {
        long b2 = e.k0.i.e.b(g0Var);
        if (b2 == -1) {
            return;
        }
        t v = v(b2);
        e.k0.e.D(v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        v.close();
    }

    public void B(x xVar, String str) {
        if (this.f2082e != 0) {
            throw new IllegalStateException("state: " + this.f2082e);
        }
        this.f2081d.s(str).s("\r\n");
        int h = xVar.h();
        for (int i = 0; i < h; i++) {
            this.f2081d.s(xVar.e(i)).s(": ").s(xVar.i(i)).s("\r\n");
        }
        this.f2081d.s("\r\n");
        this.f2082e = 1;
    }

    @Override // e.k0.i.c
    public void a() {
        this.f2081d.flush();
    }

    @Override // e.k0.i.c
    public void b(e0 e0Var) {
        B(e0Var.d(), e.k0.i.i.a(e0Var, this.f2079b.q().b().type()));
    }

    @Override // e.k0.i.c
    public void c() {
        this.f2081d.flush();
    }

    @Override // e.k0.i.c
    public void cancel() {
        e.k0.h.f fVar = this.f2079b;
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // e.k0.i.c
    public s d(e0 e0Var, long j) {
        if (e0Var.a() != null && e0Var.a().e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(e0Var.c("Transfer-Encoding"))) {
            return t();
        }
        if (j != -1) {
            return w();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // e.k0.i.c
    public long e(g0 g0Var) {
        if (!e.k0.i.e.c(g0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(g0Var.D("Transfer-Encoding"))) {
            return -1L;
        }
        return e.k0.i.e.b(g0Var);
    }

    @Override // e.k0.i.c
    public t f(g0 g0Var) {
        if (!e.k0.i.e.c(g0Var)) {
            return v(0L);
        }
        if ("chunked".equalsIgnoreCase(g0Var.D("Transfer-Encoding"))) {
            return u(g0Var.J().h());
        }
        long b2 = e.k0.i.e.b(g0Var);
        return b2 != -1 ? v(b2) : x();
    }

    @Override // e.k0.i.c
    public g0.a g(boolean z) {
        int i = this.f2082e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f2082e);
        }
        try {
            k a2 = k.a(y());
            g0.a aVar = new g0.a();
            aVar.o(a2.f2075a);
            aVar.g(a2.f2076b);
            aVar.l(a2.f2077c);
            aVar.j(z());
            if (z && a2.f2076b == 100) {
                return null;
            }
            if (a2.f2076b == 100) {
                this.f2082e = 3;
                return aVar;
            }
            this.f2082e = 4;
            return aVar;
        } catch (EOFException e2) {
            e.k0.h.f fVar = this.f2079b;
            throw new IOException("unexpected end of stream on " + (fVar != null ? fVar.q().a().l().z() : "unknown"), e2);
        }
    }

    @Override // e.k0.i.c
    public e.k0.h.f h() {
        return this.f2079b;
    }
}
