package c.b.a.a.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class m<ResultT> implements n<ResultT> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1464a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1465b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final c<? super ResultT> f1466c;

    public m(Executor executor, c<? super ResultT> cVar) {
        this.f1464a = executor;
        this.f1466c = cVar;
    }

    @Override // c.b.a.a.a.f.n
    public final void a(e<ResultT> eVar) {
        if (eVar.g()) {
            synchronized (this.f1465b) {
                if (this.f1466c == null) {
                    return;
                }
                this.f1464a.execute(new l(this, eVar));
            }
        }
    }
}
