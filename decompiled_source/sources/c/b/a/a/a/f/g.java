package c.b.a.a.a.f;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class g {
    public static <ResultT> e<ResultT> a(Exception exc) {
        t tVar = new t();
        tVar.i(exc);
        return tVar;
    }

    public static <ResultT> e<ResultT> b(ResultT resultt) {
        t tVar = new t();
        tVar.j(resultt);
        return tVar;
    }

    private static <ResultT> ResultT c(e<ResultT> eVar) {
        if (eVar.g()) {
            return eVar.e();
        }
        throw new ExecutionException(eVar.d());
    }

    private static void d(e<?> eVar, u uVar) {
        eVar.c(f.f1451b, uVar);
        eVar.b(f.f1451b, uVar);
    }

    public static <ResultT> ResultT e(e<ResultT> eVar) {
        c.b.a.a.a.a.q.b(eVar, "Task must not be null");
        if (eVar.f()) {
            return (ResultT) c(eVar);
        }
        u uVar = new u(null);
        d(eVar, uVar);
        uVar.c();
        return (ResultT) c(eVar);
    }
}
