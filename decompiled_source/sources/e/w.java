package e;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f2286a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2287b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f2288c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Certificate> f2289d;

    private w(j0 j0Var, m mVar, List<Certificate> list, List<Certificate> list2) {
        this.f2286a = j0Var;
        this.f2287b = mVar;
        this.f2288c = list;
        this.f2289d = list2;
    }

    public static w b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        m a2 = m.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        j0 a3 = j0.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List s = certificateArr != null ? e.k0.e.s(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new w(a3, a2, s, localCertificates != null ? e.k0.e.s(localCertificates) : Collections.emptyList());
    }

    private List<String> c(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public m a() {
        return this.f2287b;
    }

    public List<Certificate> d() {
        return this.f2288c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2286a.equals(wVar.f2286a) && this.f2287b.equals(wVar.f2287b) && this.f2288c.equals(wVar.f2288c) && this.f2289d.equals(wVar.f2289d);
    }

    public int hashCode() {
        return ((((((527 + this.f2286a.hashCode()) * 31) + this.f2287b.hashCode()) * 31) + this.f2288c.hashCode()) * 31) + this.f2289d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f2286a + " cipherSuite=" + this.f2287b + " peerCertificates=" + c(this.f2288c) + " localCertificates=" + c(this.f2289d) + '}';
    }
}
