.class public Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/i/a;
.implements Lio/flutter/embedding/engine/i/c/a;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "InAppWebViewFlutterPL"

.field public static filePathCallback:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public static filePathCallbackLegacy:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public activity:Landroid/app/Activity;

.field public activityPluginBinding:Lio/flutter/embedding/engine/i/c/c;

.field public applicationContext:Landroid/content/Context;

.field public chromeSafariBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;

.field public credentialDatabaseHandler:Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;

.field public flutterAssets:Lio/flutter/embedding/engine/i/a$a;

.field public flutterView:Lio/flutter/view/e;

.field public flutterWebViewFactory:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebViewFactory;

.field public headlessInAppWebViewManager:Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;

.field public inAppBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;

.field public inAppWebViewStatic:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

.field public messenger:Ld/a/c/a/b;

.field public myCookieManager:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

.field public myWebStorage:Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;

.field public platformUtil:Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;

.field public registrar:Ld/a/c/a/m;

.field public serviceWorkerManager:Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;

.field public webViewFeatureManager:Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private onAttachedToEngine(Landroid/content/Context;Ld/a/c/a/b;Landroid/app/Activity;Lio/flutter/plugin/platform/h;Lio/flutter/view/e;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    iput-object p5, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->flutterView:Lio/flutter/view/e;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->headlessInAppWebViewManager:Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->chromeSafariBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebViewFactory;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebViewFactory;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->flutterWebViewFactory:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebViewFactory;

    const-string p2, "com.pichillilorenzo/flutter_inappwebview"

    invoke-interface {p4, p2, p1}, Lio/flutter/plugin/platform/h;->a(Ljava/lang/String;Lio/flutter/plugin/platform/g;)Z

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->platformUtil:Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppWebViewStatic:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myCookieManager:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myWebStorage:Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->serviceWorkerManager:Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-lt p1, p2, :cond_1

    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->credentialDatabaseHandler:Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;

    :cond_1
    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->webViewFeatureManager:Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;

    return-void
.end method

.method public static registerWith(Ld/a/c/a/m;)V
    .locals 6

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    invoke-direct {v0}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;-><init>()V

    iput-object p0, v0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->registrar:Ld/a/c/a/m;

    invoke-interface {p0}, Ld/a/c/a/m;->c()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p0}, Ld/a/c/a/m;->e()Ld/a/c/a/b;

    move-result-object v2

    invoke-interface {p0}, Ld/a/c/a/m;->d()Landroid/app/Activity;

    move-result-object v3

    invoke-interface {p0}, Ld/a/c/a/m;->f()Lio/flutter/plugin/platform/h;

    move-result-object v4

    invoke-interface {p0}, Ld/a/c/a/m;->b()Lio/flutter/view/e;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->onAttachedToEngine(Landroid/content/Context;Ld/a/c/a/b;Landroid/app/Activity;Lio/flutter/plugin/platform/h;Lio/flutter/view/e;)V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/i/c/c;

    invoke-interface {p1}, Lio/flutter/embedding/engine/i/c/c;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 7

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->c()Lio/flutter/embedding/engine/i/a$a;

    move-result-object v0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->flutterAssets:Lio/flutter/embedding/engine/i/a$a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->b()Ld/a/c/a/b;

    move-result-object v3

    iget-object v4, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->d()Lio/flutter/plugin/platform/h;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->onAttachedToEngine(Landroid/content/Context;Ld/a/c/a/b;Landroid/app/Activity;Lio/flutter/plugin/platform/h;Lio/flutter/view/e;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/i/c/c;

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/i/c/c;

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 3

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->platformUtil:Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->platformUtil:Lcom/pichillilorenzo/flutter_inappwebview/PlatformUtil;

    :cond_0
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserManager;

    :cond_1
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->headlessInAppWebViewManager:Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->headlessInAppWebViewManager:Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;

    :cond_2
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->chromeSafariBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->chromeSafariBrowserManager:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;

    :cond_3
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myCookieManager:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myCookieManager:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

    :cond_4
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myWebStorage:Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->myWebStorage:Lcom/pichillilorenzo/flutter_inappwebview/MyWebStorage;

    :cond_5
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->credentialDatabaseHandler:Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;

    if-eqz p1, :cond_6

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_6

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->credentialDatabaseHandler:Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabaseHandler;

    :cond_6
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppWebViewStatic:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->inAppWebViewStatic:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

    :cond_7
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->serviceWorkerManager:Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;

    if-eqz p1, :cond_8

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_8

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->serviceWorkerManager:Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;

    :cond_8
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->webViewFeatureManager:Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;->dispose()V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->webViewFeatureManager:Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;

    :cond_9
    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->filePathCallbackLegacy:Landroid/webkit/ValueCallback;

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->filePathCallback:Landroid/webkit/ValueCallback;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activityPluginBinding:Lio/flutter/embedding/engine/i/c/c;

    invoke-interface {p1}, Lio/flutter/embedding/engine/i/c/c;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    return-void
.end method
