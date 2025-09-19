package b.l.k;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* loaded from: classes.dex */
public class e implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final b.l.b f1355a;

    public e(b.l.b bVar) {
        this.f1355a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f1355a.shouldInterceptRequest(webResourceRequest);
    }
}
