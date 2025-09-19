package b.l.k;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* loaded from: classes.dex */
public class q implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f1377c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1378a;

    /* renamed from: b, reason: collision with root package name */
    private final b.l.j f1379b;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.l.j f1380b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f1381c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.l.i f1382d;

        a(q qVar, b.l.j jVar, WebView webView, b.l.i iVar) {
            this.f1380b = jVar;
            this.f1381c = webView;
            this.f1382d = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1380b.onRenderProcessUnresponsive(this.f1381c, this.f1382d);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.l.j f1383b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f1384c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.l.i f1385d;

        b(q qVar, b.l.j jVar, WebView webView, b.l.i iVar) {
            this.f1383b = jVar;
            this.f1384c = webView;
            this.f1385d = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1383b.onRenderProcessResponsive(this.f1384c, this.f1385d);
        }
    }

    @SuppressLint({"LambdaLast"})
    public q(Executor executor, b.l.j jVar) {
        this.f1378a = executor;
        this.f1379b = jVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f1377c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        s b2 = s.b(invocationHandler);
        b.l.j jVar = this.f1379b;
        Executor executor = this.f1378a;
        if (executor == null) {
            jVar.onRenderProcessResponsive(webView, b2);
        } else {
            executor.execute(new b(this, jVar, webView, b2));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        s b2 = s.b(invocationHandler);
        b.l.j jVar = this.f1379b;
        Executor executor = this.f1378a;
        if (executor == null) {
            jVar.onRenderProcessUnresponsive(webView, b2);
        } else {
            executor.execute(new a(this, jVar, webView, b2));
        }
    }
}
