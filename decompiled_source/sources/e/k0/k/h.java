package e.k0.k;

import e.k0.k.d;
import f.t;
import f.u;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    static final Logger f2179f = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final f.e f2180b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2181c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2182d;

    /* renamed from: e, reason: collision with root package name */
    final d.a f2183e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements t {

        /* renamed from: b, reason: collision with root package name */
        private final f.e f2184b;

        /* renamed from: c, reason: collision with root package name */
        int f2185c;

        /* renamed from: d, reason: collision with root package name */
        byte f2186d;

        /* renamed from: e, reason: collision with root package name */
        int f2187e;

        /* renamed from: f, reason: collision with root package name */
        int f2188f;
        short g;

        a(f.e eVar) {
            this.f2184b = eVar;
        }

        private void r() {
            int i = this.f2187e;
            int G = h.G(this.f2184b);
            this.f2188f = G;
            this.f2185c = G;
            byte readByte = (byte) (this.f2184b.readByte() & 255);
            this.f2186d = (byte) (this.f2184b.readByte() & 255);
            if (h.f2179f.isLoggable(Level.FINE)) {
                h.f2179f.fine(e.b(true, this.f2187e, this.f2185c, readByte, this.f2186d));
            }
            int readInt = this.f2184b.readInt() & Integer.MAX_VALUE;
            this.f2187e = readInt;
            if (readByte != 9) {
                e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            }
            if (readInt == i) {
                return;
            }
            e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // f.t
        public u b() {
            return this.f2184b.b();
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // f.t
        public long i(f.c cVar, long j) {
            while (true) {
                int i = this.f2188f;
                if (i != 0) {
                    long i2 = this.f2184b.i(cVar, Math.min(j, i));
                    if (i2 == -1) {
                        return -1L;
                    }
                    this.f2188f = (int) (this.f2188f - i2);
                    return i2;
                }
                this.f2184b.l(this.g);
                this.g = (short) 0;
                if ((this.f2186d & 4) != 0) {
                    return -1L;
                }
                r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, int i, int i2, List<c> list);

        void b();

        void c(int i, long j);

        void d(boolean z, m mVar);

        void e(int i, int i2, List<c> list);

        void f(boolean z, int i, f.e eVar, int i2);

        void g(boolean z, int i, int i2);

        void h(int i, e.k0.k.b bVar, f.f fVar);

        void i(int i, int i2, int i3, boolean z);

        void j(int i, e.k0.k.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f.e eVar, boolean z) {
        this.f2180b = eVar;
        this.f2182d = z;
        a aVar = new a(eVar);
        this.f2181c = aVar;
        this.f2183e = new d.a(4096, aVar);
    }

    private void C(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 32) != 0) {
            e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.f2180b.readByte() & 255) : (short) 0;
        bVar.f(z, i2, this.f2180b, r(i, b2, readByte));
        this.f2180b.l(readByte);
    }

    private void D(b bVar, int i, byte b2, int i2) {
        if (i < 8) {
            e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int readInt = this.f2180b.readInt();
        int readInt2 = this.f2180b.readInt();
        int i3 = i - 8;
        e.k0.k.b a2 = e.k0.k.b.a(readInt2);
        if (a2 == null) {
            e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        }
        f.f fVar = f.f.f2315f;
        if (i3 > 0) {
            fVar = this.f2180b.j(i3);
        }
        bVar.h(readInt, a2, fVar);
    }

    private List<c> E(int i, short s, byte b2, int i2) {
        a aVar = this.f2181c;
        aVar.f2188f = i;
        aVar.f2185c = i;
        aVar.g = s;
        aVar.f2186d = b2;
        aVar.f2187e = i2;
        this.f2183e.k();
        return this.f2183e.e();
    }

    private void F(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        short readByte = (b2 & 8) != 0 ? (short) (this.f2180b.readByte() & 255) : (short) 0;
        if ((b2 & 32) != 0) {
            I(bVar, i2);
            i -= 5;
        }
        bVar.a(z, i2, -1, E(r(i, b2, readByte), readByte, b2, i2));
    }

    static int G(f.e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    private void H(b bVar, int i, byte b2, int i2) {
        if (i != 8) {
            e.d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            e.d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        bVar.g((b2 & 1) != 0, this.f2180b.readInt(), this.f2180b.readInt());
    }

    private void I(b bVar, int i) {
        int readInt = this.f2180b.readInt();
        bVar.i(i, readInt & Integer.MAX_VALUE, (this.f2180b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void J(b bVar, int i, byte b2, int i2) {
        if (i != 5) {
            e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            I(bVar, i2);
        } else {
            e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void K(b bVar, int i, byte b2, int i2) {
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short readByte = (b2 & 8) != 0 ? (short) (this.f2180b.readByte() & 255) : (short) 0;
        bVar.e(i2, this.f2180b.readInt() & Integer.MAX_VALUE, E(r(i - 4, b2, readByte), readByte, b2, i2));
    }

    private void L(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int readInt = this.f2180b.readInt();
        e.k0.k.b a2 = e.k0.k.b.a(readInt);
        if (a2 != null) {
            bVar.j(i2, a2);
        } else {
            e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        }
    }

    private void M(b bVar, int i, byte b2, int i2) {
        if (i2 != 0) {
            e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b2 & 1) != 0) {
            if (i == 0) {
                bVar.b();
                return;
            } else {
                e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i % 6 != 0) {
            e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        m mVar = new m();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int readShort = this.f2180b.readShort() & 65535;
            int readInt = this.f2180b.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    readShort = 7;
                    if (readInt < 0) {
                        e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    throw null;
                }
            } else if (readInt != 0 && readInt != 1) {
                e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                throw null;
            }
            mVar.i(readShort, readInt);
        }
        bVar.d(false, mVar);
    }

    private void N(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long readInt = this.f2180b.readInt() & 2147483647L;
        if (readInt != 0) {
            bVar.c(i2, readInt);
        } else {
            e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
    }

    static int r(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public boolean A(boolean z, b bVar) {
        try {
            this.f2180b.q(9L);
            int G = G(this.f2180b);
            if (G < 0 || G > 16384) {
                e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(G));
                throw null;
            }
            byte readByte = (byte) (this.f2180b.readByte() & 255);
            if (z && readByte != 4) {
                e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f2180b.readByte() & 255);
            int readInt = this.f2180b.readInt() & Integer.MAX_VALUE;
            if (f2179f.isLoggable(Level.FINE)) {
                f2179f.fine(e.b(true, readInt, G, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    C(bVar, G, readByte2, readInt);
                    return true;
                case 1:
                    F(bVar, G, readByte2, readInt);
                    return true;
                case 2:
                    J(bVar, G, readByte2, readInt);
                    return true;
                case 3:
                    L(bVar, G, readByte2, readInt);
                    return true;
                case 4:
                    M(bVar, G, readByte2, readInt);
                    return true;
                case 5:
                    K(bVar, G, readByte2, readInt);
                    return true;
                case 6:
                    H(bVar, G, readByte2, readInt);
                    return true;
                case 7:
                    D(bVar, G, readByte2, readInt);
                    return true;
                case 8:
                    N(bVar, G, readByte2, readInt);
                    return true;
                default:
                    this.f2180b.l(G);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public void B(b bVar) {
        if (this.f2182d) {
            if (A(true, bVar)) {
                return;
            }
            e.d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        f.f j = this.f2180b.j(e.f2123a.o());
        if (f2179f.isLoggable(Level.FINE)) {
            f2179f.fine(e.k0.e.o("<< CONNECTION %s", j.i()));
        }
        if (e.f2123a.equals(j)) {
            return;
        }
        e.d("Expected a connection header but was %s", j.t());
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2180b.close();
    }
}
