package e.k0.i;

import e.e0;
import e.y;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class i {
    public static String a(e0 e0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.f());
        sb.append(' ');
        boolean b2 = b(e0Var, type);
        y h = e0Var.h();
        if (b2) {
            sb.append(h);
        } else {
            sb.append(c(h));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(e0 e0Var, Proxy.Type type) {
        return !e0Var.e() && type == Proxy.Type.HTTP;
    }

    public static String c(y yVar) {
        String g = yVar.g();
        String i = yVar.i();
        if (i == null) {
            return g;
        }
        return g + '?' + i;
    }
}
