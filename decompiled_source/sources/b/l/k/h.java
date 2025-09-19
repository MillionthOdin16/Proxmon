package b.l.k;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

/* loaded from: classes.dex */
public class h implements WebMessageBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private b.l.e f1361a;

    public h(b.l.e eVar) {
        this.f1361a = eVar;
    }

    private static b.l.f[] a(InvocationHandler[] invocationHandlerArr) {
        b.l.f[] fVarArr = new b.l.f[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            fVarArr[i] = new k(invocationHandlerArr[i]);
        }
        return fVarArr;
    }

    public static b.l.e b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new b.l.e(webMessageBoundaryInterface.getData(), a(webMessageBoundaryInterface.getPorts()));
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public String getData() {
        return this.f1361a.a();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        b.l.f[] b2 = this.f1361a.b();
        if (b2 == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[b2.length];
        for (int i = 0; i < b2.length; i++) {
            invocationHandlerArr[i] = b2[i].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
