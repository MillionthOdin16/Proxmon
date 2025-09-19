package b.l.k;

import android.net.Uri;
import android.webkit.WebView;
import b.l.g;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class j implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private g.a f1363a;

    public j(g.a aVar) {
        this.f1363a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        this.f1363a.onPostMessage(webView, h.b((WebMessageBoundaryInterface) org.chromium.support_lib_boundary.a.a.a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z, d.b(invocationHandler2));
    }
}
