package e;

import e.x;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    final y f1933a;

    /* renamed from: b, reason: collision with root package name */
    final String f1934b;

    /* renamed from: c, reason: collision with root package name */
    final x f1935c;

    /* renamed from: d, reason: collision with root package name */
    final f0 f1936d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f1937e;

    /* renamed from: f, reason: collision with root package name */
    private volatile i f1938f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        y f1939a;

        /* renamed from: b, reason: collision with root package name */
        String f1940b;

        /* renamed from: c, reason: collision with root package name */
        x.a f1941c;

        /* renamed from: d, reason: collision with root package name */
        f0 f1942d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f1943e;

        public a() {
            this.f1943e = Collections.emptyMap();
            this.f1940b = "GET";
            this.f1941c = new x.a();
        }

        a(e0 e0Var) {
            this.f1943e = Collections.emptyMap();
            this.f1939a = e0Var.f1933a;
            this.f1940b = e0Var.f1934b;
            this.f1942d = e0Var.f1936d;
            this.f1943e = e0Var.f1937e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(e0Var.f1937e);
            this.f1941c = e0Var.f1935c.f();
        }

        public e0 a() {
            if (this.f1939a != null) {
                return new e0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b() {
            e("HEAD", null);
            return this;
        }

        public a c(String str, String str2) {
            this.f1941c.f(str, str2);
            return this;
        }

        public a d(x xVar) {
            this.f1941c = xVar.f();
            return this;
        }

        public a e(String str, f0 f0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (f0Var != null && !e.k0.i.f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (f0Var != null || !e.k0.i.f.e(str)) {
                this.f1940b = str;
                this.f1942d = f0Var;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        public a f(String str) {
            this.f1941c.e(str);
            return this;
        }

        public a g(String str) {
            StringBuilder sb;
            int i;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i = 4;
                }
                h(y.k(str));
                return this;
            }
            sb = new StringBuilder();
            sb.append("http:");
            i = 3;
            sb.append(str.substring(i));
            str = sb.toString();
            h(y.k(str));
            return this;
        }

        public a h(y yVar) {
            if (yVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f1939a = yVar;
            return this;
        }
    }

    e0(a aVar) {
        this.f1933a = aVar.f1939a;
        this.f1934b = aVar.f1940b;
        this.f1935c = aVar.f1941c.d();
        this.f1936d = aVar.f1942d;
        this.f1937e = e.k0.e.t(aVar.f1943e);
    }

    public f0 a() {
        return this.f1936d;
    }

    public i b() {
        i iVar = this.f1938f;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.f1935c);
        this.f1938f = k;
        return k;
    }

    public String c(String str) {
        return this.f1935c.c(str);
    }

    public x d() {
        return this.f1935c;
    }

    public boolean e() {
        return this.f1933a.m();
    }

    public String f() {
        return this.f1934b;
    }

    public a g() {
        return new a(this);
    }

    public y h() {
        return this.f1933a;
    }

    public String toString() {
        return "Request{method=" + this.f1934b + ", url=" + this.f1933a + ", tags=" + this.f1937e + '}';
    }
}
