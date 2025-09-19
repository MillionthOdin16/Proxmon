package e.k0.l;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import e.c0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    final Method f2239c;

    /* renamed from: d, reason: collision with root package name */
    final Method f2240d;

    e(Method method, Method method2) {
        this.f2239c = method;
        this.f2240d = method2;
    }

    public static e r() {
        try {
            return new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // e.k0.l.f
    public void g(SSLSocket sSLSocket, String str, List<c0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b2 = f.b(list);
            this.f2239c.invoke(sSLParameters, b2.toArray(new String[b2.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set SSL parameters", e2);
        }
    }

    @Override // e.k0.l.f
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f2240d.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals(BuildConfig.VERSION_NAME)) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
