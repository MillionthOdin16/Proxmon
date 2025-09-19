package e.k0.k;

import e.k0.k.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class j implements Closeable {
    private static final Logger h = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final f.d f2205b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2206c;

    /* renamed from: d, reason: collision with root package name */
    private final f.c f2207d;

    /* renamed from: e, reason: collision with root package name */
    private int f2208e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2209f;
    final d.b g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(f.d dVar, boolean z) {
        this.f2205b = dVar;
        this.f2206c = z;
        f.c cVar = new f.c();
        this.f2207d = cVar;
        this.g = new d.b(cVar);
        this.f2208e = 16384;
    }

    private void M(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.f2208e, j);
            long j2 = min;
            j -= j2;
            D(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f2205b.e(this.f2207d, j2);
        }
    }

    private static void N(f.d dVar, int i) {
        dVar.w((i >>> 16) & 255);
        dVar.w((i >>> 8) & 255);
        dVar.w(i & 255);
    }

    public synchronized void A() {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        if (this.f2206c) {
            if (h.isLoggable(Level.FINE)) {
                h.fine(e.k0.e.o(">> CONNECTION %s", e.f2123a.i()));
            }
            this.f2205b.c(e.f2123a.s());
            this.f2205b.flush();
        }
    }

    public synchronized void B(boolean z, int i, f.c cVar, int i2) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        C(i, z ? (byte) 1 : (byte) 0, cVar, i2);
    }

    void C(int i, byte b2, f.c cVar, int i2) {
        D(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f2205b.e(cVar, i2);
        }
    }

    public void D(int i, int i2, byte b2, byte b3) {
        if (h.isLoggable(Level.FINE)) {
            h.fine(e.b(false, i, i2, b2, b3));
        }
        int i3 = this.f2208e;
        if (i2 > i3) {
            e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            e.c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        N(this.f2205b, i2);
        this.f2205b.w(b2 & 255);
        this.f2205b.w(b3 & 255);
        this.f2205b.n(i & Integer.MAX_VALUE);
    }

    public synchronized void E(int i, b bVar, byte[] bArr) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        if (bVar.f2102b == -1) {
            e.c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        D(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f2205b.n(i);
        this.f2205b.n(bVar.f2102b);
        if (bArr.length > 0) {
            this.f2205b.c(bArr);
        }
        this.f2205b.flush();
    }

    public synchronized void F(boolean z, int i, List<c> list) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        this.g.g(list);
        long N = this.f2207d.N();
        int min = (int) Math.min(this.f2208e, N);
        long j = min;
        byte b2 = N == j ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        D(i, min, (byte) 1, b2);
        this.f2205b.e(this.f2207d, j);
        if (N > j) {
            M(i, N - j);
        }
    }

    public int G() {
        return this.f2208e;
    }

    public synchronized void H(boolean z, int i, int i2) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        D(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f2205b.n(i);
        this.f2205b.n(i2);
        this.f2205b.flush();
    }

    public synchronized void I(int i, int i2, List<c> list) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        this.g.g(list);
        long N = this.f2207d.N();
        int min = (int) Math.min(this.f2208e - 4, N);
        long j = min;
        D(i, min + 4, (byte) 5, N == j ? (byte) 4 : (byte) 0);
        this.f2205b.n(i2 & Integer.MAX_VALUE);
        this.f2205b.e(this.f2207d, j);
        if (N > j) {
            M(i, N - j);
        }
    }

    public synchronized void J(int i, b bVar) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        if (bVar.f2102b == -1) {
            throw new IllegalArgumentException();
        }
        D(i, 4, (byte) 3, (byte) 0);
        this.f2205b.n(bVar.f2102b);
        this.f2205b.flush();
    }

    public synchronized void K(m mVar) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        int i = 0;
        D(0, mVar.j() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (mVar.g(i)) {
                this.f2205b.m(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f2205b.n(mVar.b(i));
            }
            i++;
        }
        this.f2205b.flush();
    }

    public synchronized void L(int i, long j) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        D(i, 4, (byte) 8, (byte) 0);
        this.f2205b.n((int) j);
        this.f2205b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2209f = true;
        this.f2205b.close();
    }

    public synchronized void flush() {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        this.f2205b.flush();
    }

    public synchronized void r(m mVar) {
        if (this.f2209f) {
            throw new IOException("closed");
        }
        this.f2208e = mVar.f(this.f2208e);
        if (mVar.c() != -1) {
            this.g.e(mVar.c());
        }
        D(0, 0, (byte) 4, (byte) 1);
        this.f2205b.flush();
    }
}
