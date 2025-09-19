package e;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f2290a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<String> f2291a = new ArrayList(20);

        public a a(String str, String str2) {
            x.a(str);
            x.b(str2, str);
            c(str, str2);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                c(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            if (str.startsWith(":")) {
                c(BuildConfig.VERSION_NAME, str.substring(1));
                return this;
            }
            c(BuildConfig.VERSION_NAME, str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a c(String str, String str2) {
            this.f2291a.add(str);
            this.f2291a.add(str2.trim());
            return this;
        }

        public x d() {
            return new x(this);
        }

        public a e(String str) {
            int i = 0;
            while (i < this.f2291a.size()) {
                if (str.equalsIgnoreCase(this.f2291a.get(i))) {
                    this.f2291a.remove(i);
                    this.f2291a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a f(String str, String str2) {
            x.a(str);
            x.b(str2, str);
            e(str);
            c(str, str2);
            return this;
        }
    }

    x(a aVar) {
        List<String> list = aVar.f2291a;
        this.f2290a = (String[]) list.toArray(new String[list.size()]);
    }

    private x(String[] strArr) {
        this.f2290a = strArr;
    }

    static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(e.k0.e.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
            }
        }
    }

    static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(e.k0.e.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static x g(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        }
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            a(str);
            b(str2, str);
        }
        return new x(strArr2);
    }

    public String c(String str) {
        return d(this.f2290a, str);
    }

    public String e(int i) {
        return this.f2290a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && Arrays.equals(((x) obj).f2290a, this.f2290a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.f2291a, this.f2290a);
        return aVar;
    }

    public int h() {
        return this.f2290a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2290a);
    }

    public String i(int i) {
        return this.f2290a[(i * 2) + 1];
    }

    public List<String> j(String str) {
        int h = h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = h();
        for (int i = 0; i < h; i++) {
            sb.append(e(i));
            sb.append(": ");
            sb.append(i(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
