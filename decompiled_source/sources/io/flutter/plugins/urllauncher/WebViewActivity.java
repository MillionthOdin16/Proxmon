package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    public static String f2789f = "close action";
    private static String g = "url";
    private static String h = "enableJavaScript";
    private static String i = "enableDomStorage";

    /* renamed from: d, reason: collision with root package name */
    private WebView f2792d;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f2790b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final WebViewClient f2791c = new b(this);

    /* renamed from: e, reason: collision with root package name */
    private IntentFilter f2793e = new IntentFilter(f2789f);

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f2789f.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends WebViewClient {
        b(WebViewActivity webViewActivity) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class c extends WebChromeClient {

        /* loaded from: classes.dex */
        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f2792d.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f2792d.loadUrl(str);
                return true;
            }
        }

        private c() {
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f2792d.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(g, str).putExtra(h, z).putExtra(i, z2).putExtra("com.android.browser.headers", bundle);
    }

    private Map<String, String> c(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f2792d = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(g);
        boolean booleanExtra = intent.getBooleanExtra(h, false);
        boolean booleanExtra2 = intent.getBooleanExtra(i, false);
        this.f2792d.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f2792d.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f2792d.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f2792d.setWebViewClient(this.f2791c);
        this.f2792d.getSettings().setSupportMultipleWindows(true);
        this.f2792d.setWebChromeClient(new c(this, null));
        registerReceiver(this.f2790b, this.f2793e);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f2790b);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !this.f2792d.canGoBack()) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.f2792d.goBack();
        return true;
    }
}
