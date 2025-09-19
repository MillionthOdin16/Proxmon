package com.pichillilorenzo.flutter_inappwebview;

import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import d.a.c.a.i;

/* loaded from: classes.dex */
public class InAppWebViewMethodHandler implements i.c {
    static final String LOG_TAG = "IAWMethodHandler";
    public InAppWebView webView;

    public InAppWebViewMethodHandler(InAppWebView inAppWebView) {
        this.webView = inAppWebView;
    }

    public void dispose() {
        this.webView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07c9, code lost:
    
        if (r0.isLoading() != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x081e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x07e8, code lost:
    
        if (r3.canGoBackOrForward(((java.lang.Integer) r17.a("steps")).intValue()) != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0807, code lost:
    
        if (r0.canGoForward() != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x081c, code lost:
    
        if (r0.canGoBack() != false) goto L467;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0360. Please report as an issue. */
    @Override // d.a.c.a.i.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(d.a.c.a.h r17, final d.a.c.a.i.d r18) {
        /*
            Method dump skipped, instructions count: 2802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler.onMethodCall(d.a.c.a.h, d.a.c.a.i$d):void");
    }
}
