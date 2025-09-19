package b.l.k;

import android.annotation.SuppressLint;
import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public class s extends b.l.i {

    /* renamed from: a, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f1386a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<WebViewRenderProcess> f1387b;

    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f1388a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f1388a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new s(this.f1388a);
        }
    }

    static {
        new WeakHashMap();
    }

    public s(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f1386a = webViewRendererBoundaryInterface;
    }

    public static s b(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (s) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // b.l.i
    @SuppressLint({"NewApi"})
    public boolean a() {
        l lVar = l.WEB_VIEW_RENDERER_TERMINATE;
        if (!lVar.f()) {
            if (lVar.g()) {
                return this.f1386a.terminate();
            }
            throw l.c();
        }
        WebViewRenderProcess webViewRenderProcess = this.f1387b.get();
        if (webViewRenderProcess != null) {
            return webViewRenderProcess.terminate();
        }
        return false;
    }
}
