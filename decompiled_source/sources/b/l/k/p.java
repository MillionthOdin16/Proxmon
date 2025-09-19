package b.l.k;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class p implements o {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f1376a;

    public p(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f1376a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // b.l.k.o
    public String[] a() {
        return this.f1376a.getSupportedFeatures();
    }

    @Override // b.l.k.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebViewProviderBoundaryInterface.class, this.f1376a.createWebView(webView));
    }

    @Override // b.l.k.o
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(ServiceWorkerControllerBoundaryInterface.class, this.f1376a.getServiceWorkerController());
    }

    @Override // b.l.k.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(StaticsBoundaryInterface.class, this.f1376a.getStatics());
    }

    @Override // b.l.k.o
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f1376a.getWebkitToCompatConverter());
    }
}
