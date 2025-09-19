package c.b.b.b.a;

import c.b.b.a.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class c extends d {

    /* loaded from: classes.dex */
    private static final class a<V> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final Future<V> f1516b;

        /* renamed from: c, reason: collision with root package name */
        final b<? super V> f1517c;

        a(Future<V> future, b<? super V> bVar) {
            this.f1516b = future;
            this.f1517c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1517c.a(c.b(this.f1516b));
            } catch (Error e2) {
                e = e2;
                this.f1517c.b(e);
            } catch (RuntimeException e3) {
                e = e3;
                this.f1517c.b(e);
            } catch (ExecutionException e4) {
                this.f1517c.b(e4.getCause());
            }
        }

        public String toString() {
            a.b a2 = c.b.b.a.a.a(this);
            a2.c(this.f1517c);
            return a2.toString();
        }
    }

    public static <V> void a(e<V> eVar, b<? super V> bVar, Executor executor) {
        c.b.b.a.b.b(bVar);
        eVar.a(new a(eVar, bVar), executor);
    }

    public static <V> V b(Future<V> future) {
        c.b.b.a.b.d(future.isDone(), "Future was expected to be done: %s", future);
        return (V) h.a(future);
    }
}
