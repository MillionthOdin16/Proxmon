package e.k0.l;

import e.c0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Method f2232c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f2233d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f2234e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f2235f;
    private final Class<?> g;

    /* loaded from: classes.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f2236a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2237b;

        /* renamed from: c, reason: collision with root package name */
        String f2238c;

        a(List<String> list) {
            this.f2236a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.k0.e.f1989b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f2237b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f2236a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f2238c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (this.f2236a.contains(str)) {
                    this.f2238c = str;
                    return str;
                }
            }
            String str2 = this.f2236a.get(0);
            this.f2238c = str2;
            return str2;
        }
    }

    d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f2232c = method;
        this.f2233d = method2;
        this.f2234e = method3;
        this.f2235f = cls;
        this.g = cls2;
    }

    public static f r() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            return new d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // e.k0.l.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f2234e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // e.k0.l.f
    public void g(SSLSocket sSLSocket, String str, List<c0> list) {
        try {
            this.f2232c.invoke(null, sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f2235f, this.g}, new a(f.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // e.k0.l.f
    public String l(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f2233d.invoke(null, sSLSocket));
            if (!aVar.f2237b && aVar.f2238c == null) {
                f.j().p(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (aVar.f2237b) {
                return null;
            }
            return aVar.f2238c;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
