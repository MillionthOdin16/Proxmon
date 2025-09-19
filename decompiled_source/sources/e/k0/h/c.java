package e.k0.h;

import e.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<p> f2008a;

    /* renamed from: b, reason: collision with root package name */
    private int f2009b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2010c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2011d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<p> list) {
        this.f2008a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i = this.f2009b; i < this.f2008a.size(); i++) {
            if (this.f2008a.get(i).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p a(SSLSocket sSLSocket) {
        p pVar;
        int i = this.f2009b;
        int size = this.f2008a.size();
        while (true) {
            if (i >= size) {
                pVar = null;
                break;
            }
            pVar = this.f2008a.get(i);
            i++;
            if (pVar.c(sSLSocket)) {
                this.f2009b = i;
                break;
            }
        }
        if (pVar != null) {
            this.f2010c = c(sSLSocket);
            e.k0.c.f1986a.c(pVar, sSLSocket, this.f2011d);
            return pVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f2011d + ", modes=" + this.f2008a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(IOException iOException) {
        this.f2011d = true;
        if (!this.f2010c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
