package f;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: b, reason: collision with root package name */
    public final c f2340b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final t f2341c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2342d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f2341c = tVar;
    }

    public boolean A(long j) {
        c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2342d) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f2340b;
            if (cVar.f2313c >= j) {
                return true;
            }
        } while (this.f2341c.i(cVar, 8192L) != -1);
        return false;
    }

    @Override // f.e, f.d
    public c a() {
        return this.f2340b;
    }

    @Override // f.t
    public u b() {
        return this.f2341c.b();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2342d) {
            return;
        }
        this.f2342d = true;
        this.f2341c.close();
        this.f2340b.A();
    }

    @Override // f.e
    public short f() {
        q(2L);
        return this.f2340b.f();
    }

    @Override // f.t
    public long i(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2342d) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f2340b;
        if (cVar2.f2313c == 0 && this.f2341c.i(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f2340b.i(cVar, Math.min(j, this.f2340b.f2313c));
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2342d;
    }

    @Override // f.e
    public f j(long j) {
        q(j);
        return this.f2340b.j(j);
    }

    @Override // f.e
    public String k(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long r = r((byte) 10, 0L, j2);
        if (r != -1) {
            return this.f2340b.M(r);
        }
        if (j2 < Long.MAX_VALUE && A(j2) && this.f2340b.F(j2 - 1) == 13 && A(1 + j2) && this.f2340b.F(j2) == 10) {
            return this.f2340b.M(j2);
        }
        c cVar = new c();
        c cVar2 = this.f2340b;
        cVar2.D(cVar, 0L, Math.min(32L, cVar2.N()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2340b.N(), j) + " content=" + cVar.I().i() + (char) 8230);
    }

    @Override // f.e
    public void l(long j) {
        if (this.f2342d) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            c cVar = this.f2340b;
            if (cVar.f2313c == 0 && this.f2341c.i(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f2340b.N());
            this.f2340b.l(min);
            j -= min;
        }
    }

    @Override // f.e
    public String o() {
        return k(Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] p() {
        this.f2340b.U(this.f2341c);
        return this.f2340b.p();
    }

    @Override // f.e
    public void q(long j) {
        if (!A(j)) {
            throw new EOFException();
        }
    }

    public long r(byte b2, long j, long j2) {
        if (this.f2342d) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long G = this.f2340b.G(b2, j, j2);
            if (G == -1) {
                c cVar = this.f2340b;
                long j3 = cVar.f2313c;
                if (j3 >= j2 || this.f2341c.i(cVar, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, j3);
            } else {
                return G;
            }
        }
        return -1L;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f2340b;
        if (cVar.f2313c == 0 && this.f2341c.i(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f2340b.read(byteBuffer);
    }

    @Override // f.e
    public byte readByte() {
        q(1L);
        return this.f2340b.readByte();
    }

    @Override // f.e
    public void readFully(byte[] bArr) {
        try {
            q(bArr.length);
            this.f2340b.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                c cVar = this.f2340b;
                long j = cVar.f2313c;
                if (j <= 0) {
                    throw e2;
                }
                int H = cVar.H(bArr, i, (int) j);
                if (H == -1) {
                    throw new AssertionError();
                }
                i += H;
            }
        }
    }

    @Override // f.e
    public int readInt() {
        q(4L);
        return this.f2340b.readInt();
    }

    @Override // f.e
    public short readShort() {
        q(2L);
        return this.f2340b.readShort();
    }

    @Override // f.e
    public int t() {
        q(4L);
        return this.f2340b.t();
    }

    public String toString() {
        return "buffer(" + this.f2341c + ")";
    }

    @Override // f.e
    public c u() {
        return this.f2340b;
    }

    @Override // f.e
    public boolean v() {
        if (this.f2342d) {
            throw new IllegalStateException("closed");
        }
        return this.f2340b.v() && this.f2341c.i(this.f2340b, 8192L) == -1;
    }

    @Override // f.e
    public long x(byte b2) {
        return r(b2, 0L, Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] y(long j) {
        q(j);
        return this.f2340b.y(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long z() {
        /*
            r6 = this;
            r0 = 1
            r6.q(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.A(r3)
            if (r3 == 0) goto L4a
            f.c r3 = r6.f2340b
            long r4 = (long) r1
            byte r3 = r3.F(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            f.c r0 = r6.f2340b
            long r0 = r0.z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o.z():long");
    }
}
