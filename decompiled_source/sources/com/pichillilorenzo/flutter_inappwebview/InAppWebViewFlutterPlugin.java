package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebViewFactory;
import d.a.c.a.b;
import d.a.c.a.m;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import io.flutter.plugin.platform.h;
import io.flutter.view.e;

/* loaded from: classes.dex */
public class InAppWebViewFlutterPlugin implements a, io.flutter.embedding.engine.i.c.a {
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public static ValueCallback<Uri[]> filePathCallback;
    public static ValueCallback<Uri> filePathCallbackLegacy;
    public Activity activity;
    public c activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public a.InterfaceC0072a flutterAssets;
    public e flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewStatic inAppWebViewStatic;
    public b messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public PlatformUtil platformUtil;
    public m registrar;
    public ServiceWorkerManager serviceWorkerManager;
    public WebViewFeatureManager webViewFeatureManager;

    private void onAttachedToEngine(Context context, b bVar, Activity activity, h hVar, e eVar) {
        this.applicationContext = context;
        this.activity = activity;
        this.messenger = bVar;
        this.flutterView = eVar;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        FlutterWebViewFactory flutterWebViewFactory = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory;
        hVar.a("com.pichillilorenzo/flutter_inappwebview", flutterWebViewFactory);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewStatic = new InAppWebViewStatic(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        if (Build.VERSION.SDK_INT >= 24) {
            this.serviceWorkerManager = new ServiceWorkerManager(this);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
    }

    public static void registerWith(m mVar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = new InAppWebViewFlutterPlugin();
        inAppWebViewFlutterPlugin.registrar = mVar;
        inAppWebViewFlutterPlugin.onAttachedToEngine(mVar.c(), mVar.e(), mVar.d(), mVar.f(), mVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(c cVar) {
        this.activityPluginBinding = cVar;
        this.activity = cVar.getActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        this.flutterAssets = bVar.c();
        onAttachedToEngine(bVar.a(), bVar.b(), this.activity, bVar.d(), null);
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        PlatformUtil platformUtil = this.platformUtil;
        if (platformUtil != null) {
            platformUtil.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager = this.inAppBrowserManager;
        if (inAppBrowserManager != null) {
            inAppBrowserManager.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager != null) {
            headlessInAppWebViewManager.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager != null) {
            chromeSafariBrowserManager.dispose();
            this.chromeSafariBrowserManager = null;
        }
        MyCookieManager myCookieManager = this.myCookieManager;
        if (myCookieManager != null) {
            myCookieManager.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage = this.myWebStorage;
        if (myWebStorage != null) {
            myWebStorage.dispose();
            this.myWebStorage = null;
        }
        CredentialDatabaseHandler credentialDatabaseHandler = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler != null && Build.VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewStatic inAppWebViewStatic = this.inAppWebViewStatic;
        if (inAppWebViewStatic != null) {
            inAppWebViewStatic.dispose();
            this.inAppWebViewStatic = null;
        }
        ServiceWorkerManager serviceWorkerManager = this.serviceWorkerManager;
        if (serviceWorkerManager != null && Build.VERSION.SDK_INT >= 24) {
            serviceWorkerManager.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager = this.webViewFeatureManager;
        if (webViewFeatureManager != null) {
            webViewFeatureManager.dispose();
            this.webViewFeatureManager = null;
        }
        filePathCallbackLegacy = null;
        filePathCallback = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        this.activityPluginBinding = cVar;
        this.activity = cVar.getActivity();
    }
}
