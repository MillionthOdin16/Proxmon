package b.l.k;

import android.annotation.SuppressLint;
import android.net.Uri;
import b.l.g;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    WebViewProviderBoundaryInterface f1375a;

    public n(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f1375a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, g.a aVar) {
        this.f1375a.addWebMessageListener(str, strArr, org.chromium.support_lib_boundary.a.a.c(new j(aVar)));
    }

    public b.l.f[] b() {
        InvocationHandler[] createWebMessageChannel = this.f1375a.createWebMessageChannel();
        b.l.f[] fVarArr = new b.l.f[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            fVarArr[i] = new k(createWebMessageChannel[i]);
        }
        return fVarArr;
    }

    public void c(b.l.e eVar, Uri uri) {
        this.f1375a.postMessageToMainFrame(org.chromium.support_lib_boundary.a.a.c(new h(eVar)), uri);
    }

    @SuppressLint({"LambdaLast"})
    public void d(Executor executor, b.l.j jVar) {
        this.f1375a.setWebViewRendererClient(jVar != null ? org.chromium.support_lib_boundary.a.a.c(new q(executor, jVar)) : null);
    }
}
