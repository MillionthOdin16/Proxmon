package b.l.k;

import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f1389a;

    public t(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f1389a = webkitToCompatConverterBoundaryInterface;
    }

    public ServiceWorkerWebSettings a(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f1389a.convertServiceWorkerSettings(invocationHandler);
    }

    public InvocationHandler b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f1389a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public WebMessagePort c(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f1389a.convertWebMessagePort(invocationHandler);
    }

    public InvocationHandler d(WebMessagePort webMessagePort) {
        return this.f1389a.convertWebMessagePort(webMessagePort);
    }
}
