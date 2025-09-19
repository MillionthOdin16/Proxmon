package f;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: b, reason: collision with root package name */
    public final c f2337b = new c();

    /* renamed from: c, reason: collision with root package name */
    public final s f2338c;

    /* renamed from: d, reason: collision with root package name */
    boolean f2339d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f2338c = sVar;
    }

    @Override // f.d
    public c a() {
        return this.f2337b;
    }

    @Override // f.s
    public u b() {
        return this.f2338c.b();
    }

    @Override // f.d
    public d c(byte[] bArr) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.S(bArr);
        g();
        return this;
    }

    @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2339d) {
            return;
        }
        try {
            if (this.f2337b.f2313c > 0) {
                this.f2338c.e(this.f2337b, this.f2337b.f2313c);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f2338c.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f2339d = true;
        if (th == null) {
            return;
        }
        v.e(th);
        throw null;
    }

    @Override // f.d
    public d d(byte[] bArr, int i, int i2) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.T(bArr, i, i2);
        g();
        return this;
    }

    @Override // f.s
    public void e(c cVar, long j) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.e(cVar, j);
        g();
    }

    @Override // f.d, f.s, java.io.Flushable
    public void flush() {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f2337b;
        long j = cVar.f2313c;
        if (j > 0) {
            this.f2338c.e(cVar, j);
        }
        this.f2338c.flush();
    }

    @Override // f.d
    public d g() {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        long C = this.f2337b.C();
        if (C > 0) {
            this.f2338c.e(this.f2337b, C);
        }
        return this;
    }

    @Override // f.d
    public d h(long j) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.W(j);
        g();
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f2339d;
    }

    @Override // f.d
    public d m(int i) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.Y(i);
        g();
        return this;
    }

    @Override // f.d
    public d n(int i) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.X(i);
        g();
        return this;
    }

    @Override // f.d
    public d s(String str) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.a0(str);
        g();
        return this;
    }

    public String toString() {
        return "buffer(" + this.f2338c + ")";
    }

    @Override // f.d
    public d w(int i) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        this.f2337b.V(i);
        g();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f2339d) {
            throw new IllegalStateException("closed");
        }
        int write = this.f2337b.write(byteBuffer);
        g();
        return write;
    }
}
