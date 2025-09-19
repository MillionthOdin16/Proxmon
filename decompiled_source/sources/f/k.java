package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class k implements t {

    /* renamed from: b, reason: collision with root package name */
    private final e f2327b;

    /* renamed from: c, reason: collision with root package name */
    private final Inflater f2328c;

    /* renamed from: d, reason: collision with root package name */
    private int f2329d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2330e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f2327b = eVar;
        this.f2328c = inflater;
    }

    private void A() {
        int i = this.f2329d;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f2328c.getRemaining();
        this.f2329d -= remaining;
        this.f2327b.l(remaining);
    }

    @Override // f.t
    public u b() {
        return this.f2327b.b();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2330e) {
            return;
        }
        this.f2328c.end();
        this.f2330e = true;
        this.f2327b.close();
    }

    @Override // f.t
    public long i(c cVar, long j) {
        boolean r;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f2330e) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            r = r();
            try {
                p Q = cVar.Q(1);
                int inflate = this.f2328c.inflate(Q.f2343a, Q.f2345c, (int) Math.min(j, 8192 - Q.f2345c));
                if (inflate > 0) {
                    Q.f2345c += inflate;
                    long j2 = inflate;
                    cVar.f2313c += j2;
                    return j2;
                }
                if (!this.f2328c.finished() && !this.f2328c.needsDictionary()) {
                }
                A();
                if (Q.f2344b != Q.f2345c) {
                    return -1L;
                }
                cVar.f2312b = Q.b();
                q.a(Q);
                return -1L;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!r);
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean r() {
        if (!this.f2328c.needsInput()) {
            return false;
        }
        A();
        if (this.f2328c.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f2327b.v()) {
            return true;
        }
        p pVar = this.f2327b.a().f2312b;
        int i = pVar.f2345c;
        int i2 = pVar.f2344b;
        int i3 = i - i2;
        this.f2329d = i3;
        this.f2328c.setInput(pVar.f2343a, i2, i3);
        return false;
    }
}
