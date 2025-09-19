package b.l.k;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class d extends b.l.a {

    /* renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f1353a;

    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f1354a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f1354a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new d(this.f1354a);
        }
    }

    public d(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f1353a = jsReplyProxyBoundaryInterface;
    }

    public static d b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (d) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // b.l.a
    public void a(String str) {
        if (!l.WEB_MESSAGE_LISTENER.g()) {
            throw l.c();
        }
        this.f1353a.postMessage(str);
    }
}
