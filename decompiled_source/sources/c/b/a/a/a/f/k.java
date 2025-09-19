package c.b.a.a.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k<ResultT> implements n<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1459a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1460b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final b f1461c;

    public k(Executor executor, b bVar) {
        this.f1459a = executor;
        this.f1461c = bVar;
    }

    @Override // c.b.a.a.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            return;
        }
        synchronized (this.f1460b) {
            if (this.f1461c == null) {
                return;
            }
            this.f1459a.execute(new j(this, eVar));
        }
    }
}
