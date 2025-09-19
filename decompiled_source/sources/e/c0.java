package e;

import java.io.IOException;

/* loaded from: classes.dex */
public enum c0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: b, reason: collision with root package name */
    private final String f1917b;

    c0(String str) {
        this.f1917b = str;
    }

    public static c0 a(String str) {
        c0 c0Var = QUIC;
        c0 c0Var2 = SPDY_3;
        c0 c0Var3 = HTTP_2;
        c0 c0Var4 = H2_PRIOR_KNOWLEDGE;
        c0 c0Var5 = HTTP_1_1;
        c0 c0Var6 = HTTP_1_0;
        if (str.equals(c0Var6.f1917b)) {
            return c0Var6;
        }
        if (str.equals(c0Var5.f1917b)) {
            return c0Var5;
        }
        if (str.equals(c0Var4.f1917b)) {
            return c0Var4;
        }
        if (str.equals(c0Var3.f1917b)) {
            return c0Var3;
        }
        if (str.equals(c0Var2.f1917b)) {
            return c0Var2;
        }
        if (str.equals(c0Var.f1917b)) {
            return c0Var;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1917b;
    }
}
