package e;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f2246c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f2247a;

    /* renamed from: b, reason: collision with root package name */
    private final e.k0.n.c f2248b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f2249a = new ArrayList();

        public l a() {
            return new l(new LinkedHashSet(this.f2249a), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String f2250a;

        /* renamed from: b, reason: collision with root package name */
        final String f2251b;

        /* renamed from: c, reason: collision with root package name */
        final String f2252c;

        /* renamed from: d, reason: collision with root package name */
        final f.f f2253d;

        boolean a(String str) {
            if (!this.f2250a.startsWith("*.")) {
                return str.equals(this.f2251b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f2251b.length()) {
                String str2 = this.f2251b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f2250a.equals(bVar.f2250a) && this.f2252c.equals(bVar.f2252c) && this.f2253d.equals(bVar.f2253d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f2250a.hashCode()) * 31) + this.f2252c.hashCode()) * 31) + this.f2253d.hashCode();
        }

        public String toString() {
            return this.f2252c + this.f2253d.a();
        }
    }

    l(Set<b> set, e.k0.n.c cVar) {
        this.f2247a = set;
        this.f2248b = cVar;
    }

    public static String c(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + e((X509Certificate) certificate).a();
    }

    static f.f d(X509Certificate x509Certificate) {
        return f.f.j(x509Certificate.getPublicKey().getEncoded()).m();
    }

    static f.f e(X509Certificate x509Certificate) {
        return f.f.j(x509Certificate.getPublicKey().getEncoded()).n();
    }

    public void a(String str, List<Certificate> list) {
        List<b> b2 = b(str);
        if (b2.isEmpty()) {
            return;
        }
        e.k0.n.c cVar = this.f2248b;
        if (cVar != null) {
            list = cVar.a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = b2.size();
            f.f fVar = null;
            f.f fVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = b2.get(i2);
                if (bVar.f2252c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = e(x509Certificate);
                    }
                    if (bVar.f2253d.equals(fVar)) {
                        return;
                    }
                } else {
                    if (!bVar.f2252c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f2252c);
                    }
                    if (fVar2 == null) {
                        fVar2 = d(x509Certificate);
                    }
                    if (bVar.f2253d.equals(fVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = b2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = b2.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f2247a) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (Objects.equals(this.f2248b, lVar.f2248b) && this.f2247a.equals(lVar.f2247a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l f(e.k0.n.c cVar) {
        return Objects.equals(this.f2248b, cVar) ? this : new l(this.f2247a, cVar);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f2248b) * 31) + this.f2247a.hashCode();
    }
}
