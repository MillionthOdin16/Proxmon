package com.pichillilorenzo.flutter_inappwebview.types;

/* loaded from: classes.dex */
public class ServerTrustChallenge extends URLAuthenticationChallenge {
    public ServerTrustChallenge(URLProtectionSpace uRLProtectionSpace) {
        super(uRLProtectionSpace);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.URLAuthenticationChallenge
    public String toString() {
        return "ServerTrustChallenge{} " + super.toString();
    }
}
