package e.k0.i;

import e.g0;
import e.q;
import e.r;
import e.x;
import e.y;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    static {
        f.f.g("\"\\");
        f.f.g("\t ,=");
    }

    public static long a(x xVar) {
        return h(xVar.c("Content-Length"));
    }

    public static long b(g0 g0Var) {
        return a(g0Var.F());
    }

    public static boolean c(g0 g0Var) {
        if (g0Var.J().f().equals("HEAD")) {
            return false;
        }
        int B = g0Var.B();
        return (((B >= 100 && B < 200) || B == 204 || B == 304) && b(g0Var) == -1 && !"chunked".equalsIgnoreCase(g0Var.D("Transfer-Encoding"))) ? false : true;
    }

    public static int d(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void e(r rVar, y yVar, x xVar) {
        if (rVar == r.f2277a) {
            return;
        }
        List<q> f2 = q.f(yVar, xVar);
        if (f2.isEmpty()) {
            return;
        }
        rVar.b(yVar, f2);
    }

    public static int f(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int g(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    private static long h(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
