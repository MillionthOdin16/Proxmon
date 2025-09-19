package e.k0.i;

import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import e.c0;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2077c;

    public k(c0 c0Var, int i, String str) {
        this.f2075a = c0Var;
        this.f2076b = i;
        this.f2077c = str;
    }

    public static k a(String str) {
        c0 c0Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                c0Var = c0.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                c0Var = c0.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            c0Var = c0.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = BuildConfig.VERSION_NAME;
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new k(c0Var, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2075a == c0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f2076b);
        if (this.f2077c != null) {
            sb.append(' ');
            sb.append(this.f2077c);
        }
        return sb.toString();
    }
}
