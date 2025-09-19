package e.k0.l;

import e.b0;
import e.c0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final f f2241a = i();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2242b = Logger.getLogger(b0.class.getName());

    public static List<String> b(List<c0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = list.get(i);
            if (c0Var != c0.HTTP_1_0) {
                arrayList.add(c0Var.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(List<c0> list) {
        f.c cVar = new f.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = list.get(i);
            if (c0Var != c0.HTTP_1_0) {
                cVar.V(c0Var.toString().length());
                cVar.a0(c0Var.toString());
            }
        }
        return cVar.p();
    }

    private static f i() {
        c r;
        f t = a.t();
        if (t != null) {
            return t;
        }
        f t2 = b.t();
        if (t2 != null) {
            return t2;
        }
        if (o() && (r = c.r()) != null) {
            return r;
        }
        e r2 = e.r();
        if (r2 != null) {
            return r2;
        }
        f r3 = d.r();
        return r3 != null ? r3 : new f();
    }

    public static f j() {
        return f2241a;
    }

    public static boolean o() {
        if ("conscrypt".equals(e.k0.e.p("okhttp.platform", null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public e.k0.n.c c(X509TrustManager x509TrustManager) {
        return new e.k0.n.a(d(x509TrustManager));
    }

    public e.k0.n.e d(X509TrustManager x509TrustManager) {
        return new e.k0.n.b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List<c0> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String l(SSLSocket sSLSocket) {
        return null;
    }

    public Object m(String str) {
        if (f2242b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean n(String str) {
        return true;
    }

    public void p(int i, String str, Throwable th) {
        f2242b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void q(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        p(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
