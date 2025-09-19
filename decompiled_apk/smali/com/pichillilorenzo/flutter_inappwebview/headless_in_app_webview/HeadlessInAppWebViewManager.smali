.class public Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "HeadlessInAppWebViewManager"

.field public static final webViews:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebView;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public channel:Ld/a/c/a/i;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->webViews:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_headless_inappwebview"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->webViews:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 4

    const-string v0, "id"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x1ba8b

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "run"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, -0x1

    :goto_1
    if-eqz v1, :cond_2

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_2
    const-string v1, "params"

    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p0, v0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->run(Ljava/lang/String;Ljava/util/HashMap;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public run(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebView;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebView;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;Landroid/content/Context;Ljava/lang/Object;Ljava/util/HashMap;)V

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebView;

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    invoke-direct {v1, v2, p1, v0}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebView;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebView;)V

    sget-object v2, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebViewManager;->webViews:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebView;->prepare(Ljava/util/Map;)V

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview/headless_in_app_webview/HeadlessInAppWebView;->onWebViewCreated()V

    invoke-virtual {v0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/FlutterWebView;->makeInitialLoad(Ljava/util/HashMap;)V

    return-void
.end method
