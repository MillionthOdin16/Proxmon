package e;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class h0 implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f1961b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.e f1962c;

        a(a0 a0Var, long j, f.e eVar) {
            this.f1961b = j;
            this.f1962c = eVar;
        }

        @Override // e.h0
        public long B() {
            return this.f1961b;
        }

        @Override // e.h0
        public f.e E() {
            return this.f1962c;
        }
    }

    public static h0 C(a0 a0Var, long j, f.e eVar) {
        if (eVar != null) {
            return new a(a0Var, j, eVar);
        }
        throw new NullPointerException("source == null");
    }

    public static h0 D(a0 a0Var, byte[] bArr) {
        f.c cVar = new f.c();
        cVar.S(bArr);
        return C(a0Var, bArr.length, cVar);
    }

    private static /* synthetic */ void r(Throwable th, AutoCloseable autoCloseable) {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final byte[] A() {
        long B = B();
        if (B > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + B);
        }
        f.e E = E();
        try {
            byte[] p = E.p();
            if (E != null) {
                r(null, E);
            }
            if (B == -1 || B == p.length) {
                return p;
            }
            throw new IOException("Content-Length (" + B + ") and stream length (" + p.length + ") disagree");
        } finally {
        }
    }

    public abstract long B();

    public abstract f.e E();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.k0.e.e(E());
    }
}
