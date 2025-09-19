package e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    static final Comparator<String> f2254b = new Comparator() { // from class: e.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.d((String) obj, (String) obj2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, m> f2255c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final m f2256d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f2257e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f2258f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    public static final m n;
    public static final m o;
    public static final m p;
    public static final m q;
    public static final m r;
    public static final m s;

    /* renamed from: a, reason: collision with root package name */
    final String f2259a;

    static {
        c("SSL_RSA_WITH_NULL_MD5", 1);
        c("SSL_RSA_WITH_NULL_SHA", 2);
        c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        c("SSL_RSA_WITH_RC4_128_MD5", 4);
        c("SSL_RSA_WITH_RC4_128_SHA", 5);
        c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f2256d = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f2257e = c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f2258f = c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        c("TLS_RSA_WITH_NULL_SHA256", 59);
        c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        c("TLS_PSK_WITH_RC4_128_SHA", 138);
        c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        g = c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        h = c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        c("TLS_FALLBACK_SCSV", 22016);
        c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        i = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        j = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        k = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        l = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        n = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        o = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        p = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        q = c("TLS_AES_128_GCM_SHA256", 4865);
        r = c("TLS_AES_256_GCM_SHA384", 4866);
        s = c("TLS_CHACHA20_POLY1305_SHA256", 4867);
        c("TLS_AES_128_CCM_SHA256", 4868);
        c("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private m(String str) {
        if (str == null) {
            throw null;
        }
        this.f2259a = str;
    }

    public static synchronized m a(String str) {
        m mVar;
        synchronized (m.class) {
            mVar = f2255c.get(str);
            if (mVar == null) {
                mVar = f2255c.get(e(str));
                if (mVar == null) {
                    mVar = new m(str);
                }
                f2255c.put(str, mVar);
            }
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<m> b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static m c(String str, int i2) {
        m mVar = new m(str);
        f2255c.put(str, mVar);
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int d(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        for (int i2 = 4; i2 < min; i2++) {
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (charAt != charAt2) {
                return charAt < charAt2 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }

    private static String e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f2259a;
    }
}
