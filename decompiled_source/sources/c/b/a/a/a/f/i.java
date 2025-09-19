package c.b.a.a.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class i<ResultT> implements n<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1454a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1455b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final a<ResultT> f1456c;

    public i(Executor executor, a<ResultT> aVar) {
        this.f1454a = executor;
        this.f1456c = aVar;
    }

    @Override // c.b.a.a.a.f.n
    public final void a(e<ResultT> eVar) {
        synchronized (this.f1455b) {
            if (this.f1456c == null) {
                return;
            }
            this.f1454a.execute(new h(this, eVar));
        }
    }
}
