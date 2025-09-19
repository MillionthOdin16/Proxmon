package com.pichillilorenzo.flutter_inappwebview.content_blocker;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import e.e0;
import e.g0;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class ContentBlockerHandler {
    protected static final String LOG_TAG = "ContentBlockerHandler";
    protected List<ContentBlocker> ruleList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType;

        static {
            int[] iArr = new int[ContentBlockerActionType.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType = iArr;
            try {
                iArr[ContentBlockerActionType.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType[ContentBlockerActionType.CSS_DISPLAY_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType[ContentBlockerActionType.MAKE_HTTPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ContentBlockerHandler() {
        this.ruleList = new ArrayList();
    }

    public ContentBlockerHandler(List<ContentBlocker> list) {
        this.ruleList = new ArrayList();
        this.ruleList = list;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, String str) {
        return checkUrl(inAppWebView, str, getResourceTypeFromUrl(str));
    }

    public WebResourceResponse checkUrl(final InAppWebView inAppWebView, String str, ContentBlockerTriggerResourceType contentBlockerTriggerResourceType) {
        URI uri;
        Iterator it;
        g0 g0Var;
        ByteArrayInputStream byteArrayInputStream;
        String[] split;
        boolean z;
        boolean z2;
        WebResourceResponse webResourceResponse = null;
        if (inAppWebView.options.contentBlockers == null) {
            return null;
        }
        try {
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            String str2 = str.split(":")[0];
            URL url = new URL(str.replace(str2, "https"));
            uri = new URI(str2, url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        String host = uri.getHost();
        int port = uri.getPort();
        String scheme = uri.getScheme();
        for (Iterator it2 = new CopyOnWriteArrayList(this.ruleList).iterator(); it2.hasNext(); it2 = it) {
            ContentBlocker contentBlocker = (ContentBlocker) it2.next();
            ContentBlockerTrigger trigger = contentBlocker.getTrigger();
            List<ContentBlockerTriggerResourceType> resourceType = trigger.getResourceType();
            if (resourceType.contains(ContentBlockerTriggerResourceType.IMAGE) && !resourceType.contains(ContentBlockerTriggerResourceType.SVG_DOCUMENT)) {
                resourceType.add(ContentBlockerTriggerResourceType.SVG_DOCUMENT);
            }
            ContentBlockerAction action = contentBlocker.getAction();
            if (trigger.getUrlFilterPatternCompiled().matcher(str).matches()) {
                if (!resourceType.isEmpty() && !resourceType.contains(contentBlockerTriggerResourceType)) {
                    return webResourceResponse;
                }
                if (!trigger.getIfDomain().isEmpty()) {
                    for (String str3 : trigger.getIfDomain()) {
                        if ((str3.startsWith("*") && host.endsWith(str3.replace("*", BuildConfig.VERSION_NAME))) || str3.equals(host)) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        return null;
                    }
                }
                if (!trigger.getUnlessDomain().isEmpty()) {
                    for (String str4 : trigger.getUnlessDomain()) {
                        if ((str4.startsWith("*") && host.endsWith(str4.replace("*", BuildConfig.VERSION_NAME))) || str4.equals(host)) {
                            return null;
                        }
                    }
                }
                final String[] strArr = new String[1];
                if (!trigger.getLoadType().isEmpty() || !trigger.getIfTopUrl().isEmpty() || !trigger.getUnlessTopUrl().isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            strArr[0] = inAppWebView.getUrl();
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await();
                }
                if (strArr[0] != null) {
                    if (trigger.getLoadType().isEmpty()) {
                        it = it2;
                    } else {
                        URI uri2 = new URI(strArr[0]);
                        String host2 = uri2.getHost();
                        int port2 = uri2.getPort();
                        String scheme2 = uri2.getScheme();
                        it = it2;
                        if (trigger.getLoadType().contains("first-party") && host2 != null && (!scheme2.equals(scheme) || !host2.equals(host) || port2 != port)) {
                            return null;
                        }
                        if (trigger.getLoadType().contains("third-party") && host2 != null && host2.equals(host)) {
                            return null;
                        }
                    }
                    if (!trigger.getIfTopUrl().isEmpty()) {
                        Iterator<String> it3 = trigger.getIfTopUrl().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            if (strArr[0].startsWith(it3.next())) {
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                            return null;
                        }
                    }
                    if (!trigger.getUnlessTopUrl().isEmpty()) {
                        Iterator<String> it4 = trigger.getUnlessTopUrl().iterator();
                        while (it4.hasNext()) {
                            if (strArr[0].startsWith(it4.next())) {
                                return null;
                            }
                        }
                    }
                } else {
                    it = it2;
                }
                int i = AnonymousClass3.$SwitchMap$com$pichillilorenzo$flutter_inappwebview$content_blocker$ContentBlockerActionType[action.getType().ordinal()];
                if (i == 1) {
                    return new WebResourceResponse(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, null);
                }
                if (i != 2) {
                    if (i == 3) {
                        if (scheme.equals("http")) {
                            if (port == -1 || port == 80) {
                                String replace = str.replace("http://", "https://");
                                e0.a aVar = new e0.a();
                                aVar.g(replace);
                                try {
                                    g0Var = Util.getUnsafeOkHttpClient().s(aVar.a()).r();
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(g0Var.r().A());
                                        split = g0Var.E("content-type", "text/plain").split(";");
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    g0Var = null;
                                }
                                try {
                                    String trim = split[0].trim();
                                    String trim2 = (split.length <= 1 || !split[1].contains("charset=")) ? "utf-8" : split[1].replace("charset=", BuildConfig.VERSION_NAME).trim();
                                    g0Var.r().close();
                                    g0Var.close();
                                    return new WebResourceResponse(trim, trim2, byteArrayInputStream);
                                } catch (Exception e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    if (g0Var != null) {
                                        g0Var.r().close();
                                        g0Var.close();
                                    }
                                    Log.e(LOG_TAG, e.getMessage());
                                    webResourceResponse = null;
                                }
                            }
                        }
                    }
                    webResourceResponse = null;
                } else {
                    String selector = action.getSelector();
                    final String str5 = "(function(d) {    function hide () {        if (!d.getElementById('css-display-none-style')) {            var c = d.createElement('style');            c.id = 'css-display-none-style';            c.innerHTML = '" + selector + " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('" + selector + "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);";
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 19) {
                                inAppWebView.evaluateJavascript(str5, null);
                                return;
                            }
                            inAppWebView.loadUrl("javascript:" + str5);
                        }
                    });
                }
                webResourceResponse = null;
            } else {
                it = it2;
            }
        }
        return webResourceResponse;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, String str, String str2) {
        return checkUrl(inAppWebView, str, getResourceTypeFromContentType(str2));
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String str) {
        return str.equals("text/css") ? ContentBlockerTriggerResourceType.STYLE_SHEET : str.equals("image/svg+xml") ? ContentBlockerTriggerResourceType.SVG_DOCUMENT : str.startsWith("image/") ? ContentBlockerTriggerResourceType.IMAGE : str.startsWith("font/") ? ContentBlockerTriggerResourceType.FONT : (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) ? ContentBlockerTriggerResourceType.MEDIA : str.endsWith("javascript") ? ContentBlockerTriggerResourceType.SCRIPT : str.startsWith("text/") ? ContentBlockerTriggerResourceType.DOCUMENT : ContentBlockerTriggerResourceType.RAW;
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromUrl(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return contentBlockerTriggerResourceType;
        }
        e0.a aVar = new e0.a();
        aVar.g(str);
        aVar.b();
        e0 a2 = aVar.a();
        g0 g0Var = null;
        try {
            g0Var = Util.getUnsafeOkHttpClient().s(a2).r();
            if (g0Var.D("content-type") == null) {
                return contentBlockerTriggerResourceType;
            }
            String[] split = g0Var.D("content-type").split(";");
            String trim = split[0].trim();
            if (split.length > 1 && split[1].contains("charset=")) {
                split[1].replace("charset=", BuildConfig.VERSION_NAME).trim();
            }
            g0Var.r().close();
            g0Var.close();
            return getResourceTypeFromContentType(trim);
        } catch (Exception e2) {
            if (g0Var != null) {
                g0Var.r().close();
                g0Var.close();
            }
            e2.printStackTrace();
            Log.e(LOG_TAG, e2.getMessage());
            return contentBlockerTriggerResourceType;
        }
    }

    public List<ContentBlocker> getRuleList() {
        return this.ruleList;
    }

    public void setRuleList(List<ContentBlocker> list) {
        this.ruleList = list;
    }
}
