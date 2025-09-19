package e.k0.l;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import e.c0;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class a extends b {
    a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    public static f t() {
        try {
            if (b.u() >= 29) {
                return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
            return null;
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    private void v(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // e.k0.l.b, e.k0.l.f
    @SuppressLint({"NewApi"})
    public void g(SSLSocket sSLSocket, String str, List<c0> list) {
        v(sSLSocket);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) f.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // e.k0.l.b, e.k0.l.f
    public String l(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
