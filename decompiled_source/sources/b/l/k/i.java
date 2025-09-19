package b.l.k;

import b.l.f;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes.dex */
public class i implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    f.a f1362a;

    public i(f.a aVar) {
        this.f1362a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        this.f1362a.onMessage(new k(invocationHandler), h.b((WebMessageBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
