package c.b.a.a.a.f;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1467a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<n<ResultT>> f1468b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1469c;

    public final void a(e<ResultT> eVar) {
        n<ResultT> poll;
        synchronized (this.f1467a) {
            if (this.f1468b != null && !this.f1469c) {
                this.f1469c = true;
                while (true) {
                    synchronized (this.f1467a) {
                        poll = this.f1468b.poll();
                        if (poll == null) {
                            this.f1469c = false;
                            return;
                        }
                    }
                    poll.a(eVar);
                }
            }
        }
    }

    public final void b(n<ResultT> nVar) {
        synchronized (this.f1467a) {
            if (this.f1468b == null) {
                this.f1468b = new ArrayDeque();
            }
            this.f1468b.add(nVar);
        }
    }
}
