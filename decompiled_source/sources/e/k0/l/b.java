package e.k0.l;

import android.os.Build;
import android.util.Log;
import e.c0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f2221c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f2222d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f2223e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f2224f;
    private final Method g;
    private final C0065b h = C0065b.b();

    /* loaded from: classes.dex */
    static final class a extends e.k0.n.c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f2225a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2226b;

        a(Object obj, Method method) {
            this.f2225a = obj;
            this.f2226b = method;
        }

        @Override // e.k0.n.c
        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f2226b.invoke(this.f2225a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: e.k0.l.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0065b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f2227a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2228b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f2229c;

        C0065b(Method method, Method method2, Method method3) {
            this.f2227a = method;
            this.f2228b = method2;
            this.f2229c = method3;
        }

        static C0065b b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C0065b(method3, method2, method);
        }

        Object a(String str) {
            Method method = this.f2227a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f2228b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f2229c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class c implements e.k0.n.e {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f2230a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2231b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.f2231b = method;
            this.f2230a = x509TrustManager;
        }

        @Override // e.k0.n.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f2231b.invoke(this.f2230a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2230a.equals(cVar.f2230a) && this.f2231b.equals(cVar.f2231b);
        }

        public int hashCode() {
            return this.f2230a.hashCode() + (this.f2231b.hashCode() * 31);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f2221c = cls2;
        this.f2222d = method;
        this.f2223e = method2;
        this.f2224f = method3;
        this.g = method4;
    }

    private boolean r(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.n(str);
        }
    }

    private boolean s(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return r(str, cls, obj);
        }
    }

    public static f t() {
        if (u() == 0) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return new b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // e.k0.l.f
    public e.k0.n.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // e.k0.l.f
    public e.k0.n.e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // e.k0.l.f
    public void g(SSLSocket sSLSocket, String str, List<c0> list) {
        if (this.f2221c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f2222d.invoke(sSLSocket, Boolean.TRUE);
                    this.f2223e.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.g.invoke(sSLSocket, f.e(list));
        }
    }

    @Override // e.k0.l.f
    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (!e.k0.e.y(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 22) goto L11;
     */
    @Override // e.k0.l.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public javax.net.ssl.SSLContext k() {
        /*
            r3 = this;
            r0 = 1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 16
            if (r1 < r2) goto Le
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L10
            r2 = 22
            if (r1 >= r2) goto Le
            goto L11
        Le:
            r0 = 0
            goto L11
        L10:
        L11:
            if (r0 == 0) goto L1a
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L1a
            return r0
        L1a:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L21
            return r0
        L21:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k0.l.b.k():javax.net.ssl.SSLContext");
    }

    @Override // e.k0.l.f
    public String l(SSLSocket sSLSocket) {
        if (!this.f2221c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2224f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // e.k0.l.f
    public Object m(String str) {
        return this.h.a(str);
    }

    @Override // e.k0.l.f
    public boolean n(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return s(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.n(str);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // e.k0.l.f
    public void p(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // e.k0.l.f
    public void q(String str, Object obj) {
        if (this.h.c(obj)) {
            return;
        }
        p(5, str, null);
    }
}
