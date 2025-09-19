package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import d.a.c.a.i;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InAppWebViewClient extends WebViewClient {
    protected static final String LOG_TAG = "IAWebViewClient";
    private static List<URLCredential> credentialsProposed;
    private static int previousAuthRequestFailureCount;
    private final i channel;
    private InAppBrowserDelegate inAppBrowserDelegate;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy;

        static {
            int[] iArr = new int[NavigationActionPolicy.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy = iArr;
            try {
                iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy[NavigationActionPolicy.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public InAppWebViewClient(i iVar, InAppBrowserDelegate inAppBrowserDelegate) {
        this.channel = iVar;
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.loadUrl(str, map);
            } else {
                webView.loadUrl(str);
            }
        }
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didUpdateVisitedHistory(url);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", url);
        hashMap.put("androidIsReload", Boolean.valueOf(z));
        this.channel.c("onUpdateVisitedHistory", hashMap);
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        String generateWrappedCodeForDocumentEnd = inAppWebView.userContentController.generateWrappedCodeForDocumentEnd();
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentEnd, null);
            return;
        }
        inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentEnd.replaceAll("[\r\n]+", BuildConfig.VERSION_NAME));
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        String generateWrappedCodeForDocumentStart = inAppWebView.userContentController.generateWrappedCodeForDocumentStart();
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(generateWrappedCodeForDocumentStart, null);
            return;
        }
        inAppWebView.loadUrl("javascript:" + generateWrappedCodeForDocumentStart.replaceAll("[\r\n]+", BuildConfig.VERSION_NAME));
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webView.getUrl());
        this.channel.d("onFormResubmission", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.6
            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                Log.e(InAppWebViewClient.LOG_TAG, "ERROR: " + str + " " + str2);
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewClient.super.onFormResubmission(webView, message, message2);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                Integer num;
                if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                    InAppWebViewClient.super.onFormResubmission(webView, message, message2);
                } else if (num.intValue() != 0) {
                    message.sendToTarget();
                } else {
                    message2.sendToTarget();
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        this.channel.c("onPageCommitVisible", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFinishNavigation(str);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, null);
        } else {
            inAppWebView.loadUrl("javascript:" + JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE.replaceAll("[\r\n]+", BuildConfig.VERSION_NAME));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        this.channel.c("onLoadStop", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didStartNavigation(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        this.channel.c("onLoadStart", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
        try {
            this.channel.d("onReceivedClientCertRequest", new ClientCertChallenge(new URLProtectionSpace(clientCertRequest.getHost(), new URI(webView.getUrl()).getScheme(), null, clientCertRequest.getPort(), webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes()).toMap(), new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.4
                @Override // d.a.c.a.i.d
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", ");
                    if (str2 == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    sb.append(str2);
                    Log.e(InAppWebViewClient.LOG_TAG, sb.toString());
                }

                @Override // d.a.c.a.i.d
                public void notImplemented() {
                    InAppWebViewClient.super.onReceivedClientCertRequest(webView, clientCertRequest);
                }

                @Override // d.a.c.a.i.d
                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        if (num != null) {
                            int intValue = num.intValue();
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    clientCertRequest.cancel();
                                    return;
                                } else {
                                    clientCertRequest.ignore();
                                    return;
                                }
                            }
                            InAppWebView inAppWebView = (InAppWebView) webView;
                            Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, (String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("androidKeyStoreType"));
                            clientCertRequest.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                            return;
                        }
                    }
                    InAppWebViewClient.super.onReceivedClientCertRequest(webView, clientCertRequest);
                }
            });
        } catch (URISyntaxException e2) {
            e2.printStackTrace();
            clientCertRequest.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.options.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFailNavigation(str2, i, str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str2);
        hashMap.put("code", Integer.valueOf(i));
        hashMap.put("message", str);
        this.channel.c("onLoadError", hashMap);
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
        URLCredential uRLCredential = null;
        try {
            URI uri = new URI(webView.getUrl());
            final String scheme = uri.getScheme();
            final int port = uri.getPort();
            previousAuthRequestFailureCount++;
            HashMap hashMap = new HashMap();
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str);
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, scheme);
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str2);
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(port));
            hashMap.put("previousFailureCount", Integer.valueOf(previousAuthRequestFailureCount));
            if (credentialsProposed == null) {
                credentialsProposed = CredentialDatabase.getInstance(webView.getContext()).getHttpAuthCredentials(str, scheme, str2, Integer.valueOf(port));
            }
            List<URLCredential> list = credentialsProposed;
            if (list != null && list.size() > 0) {
                uRLCredential = credentialsProposed.get(0);
            }
            this.channel.d("onReceivedHttpAuthRequest", new HttpAuthenticationChallenge(new URLProtectionSpace(str, scheme, str2, port, webView.getCertificate(), null), previousAuthRequestFailureCount, uRLCredential).toMap(), new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.2
                @Override // d.a.c.a.i.d
                public void error(String str3, String str4, Object obj) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(", ");
                    if (str4 == null) {
                        str4 = BuildConfig.VERSION_NAME;
                    }
                    sb.append(str4);
                    Log.e(InAppWebViewClient.LOG_TAG, sb.toString());
                }

                @Override // d.a.c.a.i.d
                public void notImplemented() {
                    InAppWebViewClient.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                }

                @Override // d.a.c.a.i.d
                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        if (num != null) {
                            int intValue = num.intValue();
                            if (intValue == 1) {
                                String str3 = (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
                                String str4 = (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
                                Boolean bool = (Boolean) map.get("permanentPersistence");
                                if (bool != null && bool.booleanValue()) {
                                    CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, scheme, str2, Integer.valueOf(port), str3, str4);
                                }
                                httpAuthHandler.proceed(str3, str4);
                                return;
                            }
                            if (intValue != 2) {
                                List unused = InAppWebViewClient.credentialsProposed = null;
                                int unused2 = InAppWebViewClient.previousAuthRequestFailureCount = 0;
                                httpAuthHandler.cancel();
                                return;
                            } else if (InAppWebViewClient.credentialsProposed.size() <= 0) {
                                httpAuthHandler.cancel();
                                return;
                            } else {
                                URLCredential uRLCredential2 = (URLCredential) InAppWebViewClient.credentialsProposed.remove(0);
                                httpAuthHandler.proceed(uRLCredential2.getUsername(), uRLCredential2.getPassword());
                                return;
                            }
                        }
                    }
                    InAppWebViewClient.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                }
            });
        } catch (URISyntaxException e2) {
            e2.printStackTrace();
            credentialsProposed = null;
            previousAuthRequestFailureCount = 0;
            httpAuthHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", webResourceRequest.getUrl().toString());
            hashMap.put("statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
            hashMap.put("description", webResourceResponse.getReasonPhrase());
            this.channel.c("onLoadHttpError", hashMap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
        hashMap.put("account", str2);
        hashMap.put("args", str3);
        this.channel.c("onReceivedLoginRequest", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        try {
            URI uri = new URI(sslError.getUrl());
            this.channel.d("onReceivedServerTrustAuthRequest", new ServerTrustChallenge(new URLProtectionSpace(uri.getHost(), uri.getScheme(), null, uri.getPort(), sslError.getCertificate(), sslError)).toMap(), new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.3
                @Override // d.a.c.a.i.d
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", ");
                    if (str2 == null) {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    sb.append(str2);
                    Log.e(InAppWebViewClient.LOG_TAG, sb.toString());
                }

                @Override // d.a.c.a.i.d
                public void notImplemented() {
                    InAppWebViewClient.super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // d.a.c.a.i.d
                public void success(Object obj) {
                    Integer num;
                    if (obj == null || (num = (Integer) ((Map) obj).get("action")) == null) {
                        InAppWebViewClient.super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    } else if (num.intValue() != 1) {
                        sslErrorHandler.cancel();
                    } else {
                        sslErrorHandler.proceed();
                    }
                }
            });
        } catch (URISyntaxException e2) {
            e2.printStackTrace();
            sslErrorHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!((InAppWebView) webView).options.useOnRenderProcessGone.booleanValue()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        Boolean valueOf = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        Integer valueOf2 = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
        HashMap hashMap = new HashMap();
        hashMap.put("didCrash", valueOf);
        hashMap.put("rendererPriorityAtExit", valueOf2);
        this.channel.c("onRenderProcessGone", hashMap);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int i, final SafeBrowsingResponse safeBrowsingResponse) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webResourceRequest.getUrl().toString());
        hashMap.put("threatType", Integer.valueOf(i));
        this.channel.d("onSafeBrowsingHit", hashMap, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.5
            @Override // d.a.c.a.i.d
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = BuildConfig.VERSION_NAME;
                }
                sb.append(str2);
                Log.e(InAppWebViewClient.LOG_TAG, sb.toString());
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewClient.super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                if (obj != null) {
                    Map map = (Map) obj;
                    Boolean bool = (Boolean) map.get("report");
                    Integer num = (Integer) map.get("action");
                    Boolean valueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue == 0) {
                            safeBrowsingResponse.backToSafety(valueOf.booleanValue());
                            return;
                        } else if (intValue != 1) {
                            safeBrowsingResponse.showInterstitial(valueOf.booleanValue());
                            return;
                        } else {
                            safeBrowsingResponse.proceed(valueOf.booleanValue());
                            return;
                        }
                    }
                }
                InAppWebViewClient.super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f2, float f3) {
        super.onScaleChanged(webView, f2, f3);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f3 / Util.getPixelDensity(inAppWebView.getContext());
        HashMap hashMap = new HashMap();
        hashMap.put("oldScale", Float.valueOf(f2));
        hashMap.put("newScale", Float.valueOf(f3));
        this.channel.c("onZoomScaleChanged", hashMap);
    }

    public WebResourceResponse onShouldInterceptRequest(Object obj) {
        Map<String, String> map;
        boolean z;
        boolean z2;
        String str = obj instanceof String ? (String) obj : null;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 21 || !(obj instanceof WebResourceRequest)) {
            map = null;
            z = false;
            z2 = true;
        } else {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            str = webResourceRequest.getUrl().toString();
            map = webResourceRequest.getRequestHeaders();
            boolean hasGesture = webResourceRequest.hasGesture();
            z2 = webResourceRequest.isForMainFrame();
            if (Build.VERSION.SDK_INT >= 24) {
                z = webResourceRequest.isRedirect();
                z3 = hasGesture;
            } else {
                z3 = hasGesture;
                z = false;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("method", "GET");
        hashMap.put("headers", map);
        hashMap.put("isForMainFrame", Boolean.valueOf(z2));
        hashMap.put("hasGesture", Boolean.valueOf(z3));
        hashMap.put("isRedirect", Boolean.valueOf(z));
        try {
            Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(this.channel, "shouldInterceptRequest", hashMap);
            String str2 = invokeMethodAndWait.error;
            if (str2 != null) {
                Log.e(LOG_TAG, str2);
            } else {
                Object obj2 = invokeMethodAndWait.result;
                if (obj2 != null) {
                    Map map2 = (Map) obj2;
                    String str3 = (String) map2.get("contentType");
                    String str4 = (String) map2.get("contentEncoding");
                    byte[] bArr = (byte[]) map2.get("data");
                    Map map3 = (Map) map2.get("headers");
                    Integer num = (Integer) map2.get("statusCode");
                    String str5 = (String) map2.get("reasonPhrase");
                    ByteArrayInputStream byteArrayInputStream = bArr != null ? new ByteArrayInputStream(bArr) : null;
                    return (!(map3 == null && num == null && str5 == null) && Build.VERSION.SDK_INT >= 21) ? new WebResourceResponse(str3, str4, num.intValue(), str5, map3, byteArrayInputStream) : new WebResourceResponse(str3, str4, byteArrayInputStream);
                }
            }
            return null;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void onShouldOverrideUrlLoading(final InAppWebView inAppWebView, final String str, String str2, final Map<String, String> map, final boolean z, boolean z2, boolean z3) {
        this.channel.d("shouldOverrideUrlLoading", new NavigationAction(new URLRequest(str, str2, null, map), z, z2, z3).toMap(), new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewClient.1
            @Override // d.a.c.a.i.d
            public void error(String str3, String str4, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(", ");
                if (str4 == null) {
                    str4 = BuildConfig.VERSION_NAME;
                }
                sb.append(str4);
                Log.e(InAppWebViewClient.LOG_TAG, sb.toString());
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
            }

            @Override // d.a.c.a.i.d
            public void notImplemented() {
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
            }

            @Override // d.a.c.a.i.d
            public void success(Object obj) {
                if (obj != null) {
                    Integer num = (Integer) ((Map) obj).get("action");
                    NavigationActionPolicy fromValue = NavigationActionPolicy.fromValue(Integer.valueOf(num != null ? num.intValue() : NavigationActionPolicy.CANCEL.rawValue()).intValue());
                    if (fromValue == null || AnonymousClass7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$NavigationActionPolicy[fromValue.ordinal()] != 1) {
                        return;
                    }
                }
                InAppWebViewClient.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ((InAppWebView) webView).options.useShouldInterceptRequest.booleanValue() ? onShouldInterceptRequest(webResourceRequest) : shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        URI uri;
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.options.useShouldInterceptRequest.booleanValue()) {
            return onShouldInterceptRequest(str);
        }
        WebResourceResponse webResourceResponse = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            String str2 = str.split(":")[0];
            try {
                URL url = new URL(str.replace(str2, "https"));
                uri = new URI(str2, url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        String scheme = uri.getScheme();
        List<String> list = inAppWebView.options.resourceCustomSchemes;
        if (list != null && list.contains(scheme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            try {
                Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(this.channel, "onLoadResourceCustomScheme", hashMap);
                String str3 = invokeMethodAndWait.error;
                if (str3 != null) {
                    Log.e(LOG_TAG, str3);
                } else {
                    Object obj = invokeMethodAndWait.result;
                    if (obj != null) {
                        Map map = (Map) obj;
                        try {
                            webResourceResponse = inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, str, map.get("contentType").toString());
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        if (webResourceResponse != null) {
                            return webResourceResponse;
                        }
                        return new WebResourceResponse(map.get("contentType").toString(), map.get("contentEncoding").toString(), new ByteArrayInputStream((byte[]) map.get("data")));
                    }
                }
            } catch (InterruptedException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        if (inAppWebView.contentBlockerHandler.getRuleList().size() <= 0) {
            return null;
        }
        try {
            return inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, str);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.options.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), Build.VERSION.SDK_INT >= 24 ? webResourceRequest.isRedirect() : false);
        if (inAppWebView.regexToCancelSubFramesLoadingCompiled == null) {
            return webResourceRequest.isForMainFrame();
        }
        if (webResourceRequest.isForMainFrame()) {
            return true;
        }
        return inAppWebView.regexToCancelSubFramesLoadingCompiled.matcher(webResourceRequest.getUrl().toString()).matches();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.options.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, "GET", null, true, false, false);
        return true;
    }
}
