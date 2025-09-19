package b.l.k;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public class b extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    private final b.l.b f1351a;

    public b(b.l.b bVar) {
        this.f1351a = bVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f1351a.shouldInterceptRequest(webResourceRequest);
    }
}
