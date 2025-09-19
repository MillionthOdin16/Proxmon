package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: c, reason: collision with root package name */
    private final e f2323c;

    /* renamed from: d, reason: collision with root package name */
    private final Inflater f2324d;

    /* renamed from: e, reason: collision with root package name */
    private final k f2325e;

    /* renamed from: b, reason: collision with root package name */
    private int f2322b = 0;

    /* renamed from: f, reason: collision with root package name */
    private final CRC32 f2326f = new CRC32();

    public j(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f2324d = new Inflater(true);
        e b2 = l.b(tVar);
        this.f2323c = b2;
        this.f2325e = new k(b2, this.f2324d);
    }

    private void A() {
        this.f2323c.q(10L);
        byte F = this.f2323c.a().F(3L);
        boolean z = ((F >> 1) & 1) == 1;
        if (z) {
            C(this.f2323c.a(), 0L, 10L);
        }
        r("ID1ID2", 8075, this.f2323c.readShort());
        this.f2323c.l(8L);
        if (((F >> 2) & 1) == 1) {
            this.f2323c.q(2L);
            if (z) {
                C(this.f2323c.a(), 0L, 2L);
            }
            long f2 = this.f2323c.a().f();
            this.f2323c.q(f2);
            if (z) {
                C(this.f2323c.a(), 0L, f2);
            }
            this.f2323c.l(f2);
        }
        if (((F >> 3) & 1) == 1) {
            long x = this.f2323c.x((byte) 0);
            if (x == -1) {
                throw new EOFException();
            }
            if (z) {
                C(this.f2323c.a(), 0L, x + 1);
            }
            this.f2323c.l(x + 1);
        }
        if (((F >> 4) & 1) == 1) {
            long x2 = this.f2323c.x((byte) 0);
            if (x2 == -1) {
                throw new EOFException();
            }
            if (z) {
                C(this.f2323c.a(), 0L, x2 + 1);
            }
            this.f2323c.l(x2 + 1);
        }
        if (z) {
            r("FHCRC", this.f2323c.f(), (short) this.f2326f.getValue());
            this.f2326f.reset();
        }
    }

    private void B() {
        r("CRC", this.f2323c.t(), (int) this.f2326f.getValue());
        r("ISIZE", this.f2323c.t(), (int) this.f2324d.getBytesWritten());
    }

    private void C(c cVar, long j, long j2) {
        p pVar = cVar.f2312b;
        while (true) {
            int i = pVar.f2345c;
            int i2 = pVar.f2344b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            pVar = pVar.f2348f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(pVar.f2345c - r7, j2);
            this.f2326f.update(pVar.f2343a, (int) (pVar.f2344b + j), min);
            j2 -= min;
            pVar = pVar.f2348f;
            j = 0;
        }
    }

    private void r(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    @Override // f.t
    public u b() {
        return this.f2323c.b();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2325e.close();
    }

    @Override // f.t
    public long i(c cVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f2322b == 0) {
            A();
            this.f2322b = 1;
        }
        if (this.f2322b == 1) {
            long j2 = cVar.f2313c;
            long i = this.f2325e.i(cVar, j);
            if (i != -1) {
                C(cVar, j2, i);
                return i;
            }
            this.f2322b = 2;
        }
        if (this.f2322b == 2) {
            B();
            this.f2322b = 3;
            if (!this.f2323c.v()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
