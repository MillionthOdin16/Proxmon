package e;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y {
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f2292a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2293b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2294c;

    /* renamed from: d, reason: collision with root package name */
    final String f2295d;

    /* renamed from: e, reason: collision with root package name */
    final int f2296e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f2297f;
    private final String g;
    private final String h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f2298a;

        /* renamed from: d, reason: collision with root package name */
        String f2301d;

        /* renamed from: f, reason: collision with root package name */
        final List<String> f2303f;
        List<String> g;
        String h;

        /* renamed from: b, reason: collision with root package name */
        String f2299b = BuildConfig.VERSION_NAME;

        /* renamed from: c, reason: collision with root package name */
        String f2300c = BuildConfig.VERSION_NAME;

        /* renamed from: e, reason: collision with root package name */
        int f2302e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f2303f = arrayList;
            arrayList.add(BuildConfig.VERSION_NAME);
        }

        private static String b(String str, int i, int i2) {
            return e.k0.e.b(y.r(str, i, i2, false));
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int i(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(y.a(str, i, i2, BuildConfig.VERSION_NAME, false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void k() {
            if (!this.f2303f.remove(r0.size() - 1).isEmpty() || this.f2303f.isEmpty()) {
                this.f2303f.add(BuildConfig.VERSION_NAME);
            } else {
                this.f2303f.set(r0.size() - 1, BuildConfig.VERSION_NAME);
            }
        }

        private static int m(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt != '[') {
                    i++;
                }
                do {
                    i++;
                    if (i < i2) {
                    }
                    i++;
                } while (str.charAt(i) != ']');
                i++;
            }
            return i2;
        }

        private void n(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = y.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (f(a2)) {
                return;
            }
            if (g(a2)) {
                k();
                return;
            }
            if (this.f2303f.get(r11.size() - 1).isEmpty()) {
                this.f2303f.set(r11.size() - 1, a2);
            } else {
                this.f2303f.add(a2);
            }
            if (z) {
                this.f2303f.add(BuildConfig.VERSION_NAME);
            }
        }

        private void p(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f2303f.clear();
                this.f2303f.add(BuildConfig.VERSION_NAME);
                i++;
            } else {
                List<String> list = this.f2303f;
                list.set(list.size() - 1, BuildConfig.VERSION_NAME);
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = e.k0.e.m(str, i3, i2, "/\\");
                boolean z = i < i2;
                n(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private static int r(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int s(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public y a() {
            if (this.f2298a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f2301d != null) {
                return new y(this);
            }
            throw new IllegalStateException("host == null");
        }

        int c() {
            int i = this.f2302e;
            return i != -1 ? i : y.d(this.f2298a);
        }

        public a d(String str) {
            this.g = str != null ? y.y(y.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String b2 = b(str, 0, str.length());
            if (b2 != null) {
                this.f2301d = b2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a h(y yVar, String str) {
            int m;
            int i;
            int E = e.k0.e.E(str, 0, str.length());
            int F = e.k0.e.F(str, E, str.length());
            int r = r(str, E, F);
            if (r != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f2298a = "https";
                    E += 6;
                } else {
                    if (!str.regionMatches(true, E, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, r) + "'");
                    }
                    this.f2298a = "http";
                    E += 5;
                }
            } else {
                if (yVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f2298a = yVar.f2292a;
            }
            int s = s(str, E, F);
            char c2 = '?';
            char c3 = '#';
            if (s >= 2 || yVar == null || !yVar.f2292a.equals(this.f2298a)) {
                int i2 = E + s;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    m = e.k0.e.m(str, i2, F, "@/\\?#");
                    char charAt = m != F ? str.charAt(m) : (char) 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            i = m;
                            this.f2300c += "%40" + y.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int l = e.k0.e.l(str, i2, m, ':');
                            i = m;
                            String a2 = y.a(str, i2, l, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a2 = this.f2299b + "%40" + a2;
                            }
                            this.f2299b = a2;
                            if (l != i) {
                                this.f2300c = y.a(str, l + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i2 = i + 1;
                    }
                    c2 = '?';
                    c3 = '#';
                }
                int m2 = m(str, i2, m);
                int i3 = m2 + 1;
                if (i3 < m) {
                    this.f2301d = b(str, i2, m2);
                    int i4 = i(str, i3, m);
                    this.f2302e = i4;
                    if (i4 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, m) + '\"');
                    }
                } else {
                    this.f2301d = b(str, i2, m2);
                    this.f2302e = y.d(this.f2298a);
                }
                if (this.f2301d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, m2) + '\"');
                }
                E = m;
            } else {
                this.f2299b = yVar.j();
                this.f2300c = yVar.f();
                this.f2301d = yVar.f2295d;
                this.f2302e = yVar.f2296e;
                this.f2303f.clear();
                this.f2303f.addAll(yVar.h());
                if (E == F || str.charAt(E) == '#') {
                    d(yVar.i());
                }
            }
            int m3 = e.k0.e.m(str, E, F, "?#");
            p(str, E, m3);
            if (m3 < F && str.charAt(m3) == '?') {
                int l2 = e.k0.e.l(str, m3, F, '#');
                this.g = y.y(y.a(str, m3 + 1, l2, " \"'<>#", true, false, true, true, null));
                m3 = l2;
            }
            if (m3 < F && str.charAt(m3) == '#') {
                this.h = y.a(str, 1 + m3, F, BuildConfig.VERSION_NAME, true, false, false, false, null);
            }
            return this;
        }

        public a j(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f2300c = y.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a l(int i) {
            if (i > 0 && i <= 65535) {
                this.f2302e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        a o() {
            int size = this.f2303f.size();
            for (int i = 0; i < size; i++) {
                this.f2303f.set(i, y.b(this.f2303f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, y.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = y.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a q(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = "https";
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f2298a = str2;
            return this;
        }

        public a t(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f2299b = y.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f2298a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f2299b.isEmpty() || !this.f2300c.isEmpty()) {
                sb.append(this.f2299b);
                if (!this.f2300c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f2300c);
                }
                sb.append('@');
            }
            String str3 = this.f2301d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f2301d);
                    sb.append(']');
                } else {
                    sb.append(this.f2301d);
                }
            }
            if (this.f2302e != -1 || this.f2298a != null) {
                int c2 = c();
                String str4 = this.f2298a;
                if (str4 == null || c2 != y.d(str4)) {
                    sb.append(':');
                    sb.append(c2);
                }
            }
            y.q(sb, this.f2303f);
            if (this.g != null) {
                sb.append('?');
                y.n(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    y(a aVar) {
        this.f2292a = aVar.f2298a;
        this.f2293b = s(aVar.f2299b, false);
        this.f2294c = s(aVar.f2300c, false);
        this.f2295d = aVar.f2301d;
        this.f2296e = aVar.c();
        t(aVar.f2303f, false);
        List<String> list = aVar.g;
        this.f2297f = list != null ? t(list, true) : null;
        String str = aVar.h;
        this.g = str != null ? s(str, false) : null;
        this.h = aVar.toString();
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || v(str, i4, i3)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            f.c cVar = new f.c();
            cVar.b0(str, i2, i4);
            c(cVar, str, i4, i3, str2, z, z2, z3, z4, charset);
            return cVar.K();
        }
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static void c(f.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        f.c cVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.a0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !v(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new f.c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.c0(codePointAt);
                    } else {
                        cVar2.Z(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!cVar2.v()) {
                        int readByte = cVar2.readByte() & 255;
                        cVar.V(37);
                        cVar.V(i[(readByte >> 4) & 15]);
                        cVar.V(i[readByte & 15]);
                    }
                } else {
                    cVar.c0(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static y k(String str) {
        a aVar = new a();
        aVar.h(null, str);
        return aVar.a();
    }

    static void n(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static void q(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    static String r(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                f.c cVar = new f.c();
                cVar.b0(str, i2, i4);
                u(cVar, str, i4, i3, z);
                return cVar.K();
            }
        }
        return str.substring(i2, i3);
    }

    static String s(String str, boolean z) {
        return r(str, 0, str.length(), z);
    }

    private List<String> t(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? s(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void u(f.c cVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt != 37 || (i4 = i2 + 2) >= i3) {
                if (codePointAt == 43 && z) {
                    cVar.V(32);
                }
                cVar.c0(codePointAt);
            } else {
                int i5 = e.k0.e.i(str.charAt(i2 + 1));
                int i6 = e.k0.e.i(str.charAt(i4));
                if (i5 != -1 && i6 != -1) {
                    cVar.V((i5 << 4) + i6);
                    i2 = i4;
                }
                cVar.c0(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && e.k0.e.i(str.charAt(i2 + 1)) != -1 && e.k0.e.i(str.charAt(i4)) != -1;
    }

    static List<String> y(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public y A(String str) {
        a p = p(str);
        if (p != null) {
            return p.a();
        }
        return null;
    }

    public String B() {
        return this.f2292a;
    }

    public URI C() {
        a o = o();
        o.o();
        String aVar = o.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.VERSION_NAME));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String e() {
        if (this.g == null) {
            return null;
        }
        return this.h.substring(this.h.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && ((y) obj).h.equals(this.h);
    }

    public String f() {
        if (this.f2294c.isEmpty()) {
            return BuildConfig.VERSION_NAME;
        }
        return this.h.substring(this.h.indexOf(58, this.f2292a.length() + 3) + 1, this.h.indexOf(64));
    }

    public String g() {
        int indexOf = this.h.indexOf(47, this.f2292a.length() + 3);
        String str = this.h;
        return this.h.substring(indexOf, e.k0.e.m(str, indexOf, str.length(), "?#"));
    }

    public List<String> h() {
        int indexOf = this.h.indexOf(47, this.f2292a.length() + 3);
        String str = this.h;
        int m = e.k0.e.m(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m) {
            int i2 = indexOf + 1;
            int l = e.k0.e.l(this.h, i2, m, '/');
            arrayList.add(this.h.substring(i2, l));
            indexOf = l;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public String i() {
        if (this.f2297f == null) {
            return null;
        }
        int indexOf = this.h.indexOf(63) + 1;
        String str = this.h;
        return this.h.substring(indexOf, e.k0.e.l(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f2293b.isEmpty()) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.f2292a.length() + 3;
        String str = this.h;
        return this.h.substring(length, e.k0.e.m(str, length, str.length(), ":@"));
    }

    public String l() {
        return this.f2295d;
    }

    public boolean m() {
        return this.f2292a.equals("https");
    }

    public a o() {
        a aVar = new a();
        aVar.f2298a = this.f2292a;
        aVar.f2299b = j();
        aVar.f2300c = f();
        aVar.f2301d = this.f2295d;
        aVar.f2302e = this.f2296e != d(this.f2292a) ? this.f2296e : -1;
        aVar.f2303f.clear();
        aVar.f2303f.addAll(h());
        aVar.d(i());
        aVar.h = e();
        return aVar;
    }

    public a p(String str) {
        try {
            a aVar = new a();
            aVar.h(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.h;
    }

    public int w() {
        return this.f2296e;
    }

    public String x() {
        if (this.f2297f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        n(sb, this.f2297f);
        return sb.toString();
    }

    public String z() {
        a p = p("/...");
        p.t(BuildConfig.VERSION_NAME);
        p.j(BuildConfig.VERSION_NAME);
        return p.a().toString();
    }
}
