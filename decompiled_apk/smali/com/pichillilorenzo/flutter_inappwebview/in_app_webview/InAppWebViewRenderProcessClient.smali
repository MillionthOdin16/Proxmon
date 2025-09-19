.class public Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;
.super Lb/l/j;
.source ""


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "IAWRenderProcessClient"


# instance fields
.field private final channel:Ld/a/c/a/i;


# direct methods
.method public constructor <init>(Ld/a/c/a/i;)V
    .locals 0

    invoke-direct {p0}, Lb/l/j;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;->channel:Ld/a/c/a/i;

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 0

    return-void
.end method

.method public onRenderProcessResponsive(Landroid/webkit/WebView;Lb/l/i;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    const-string v1, "url"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;->channel:Ld/a/c/a/i;

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient$2;

    invoke-direct {v1, p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;Lb/l/i;)V

    const-string p2, "onRenderProcessResponsive"

    invoke-virtual {p1, p2, v0, v1}, Ld/a/c/a/i;->d(Ljava/lang/String;Ljava/lang/Object;Ld/a/c/a/i$d;)V

    return-void
.end method

.method public onRenderProcessUnresponsive(Landroid/webkit/WebView;Lb/l/i;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    const-string v1, "url"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;->channel:Ld/a/c/a/i;

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient$1;

    invoke-direct {v1, p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewRenderProcessClient;Lb/l/i;)V

    const-string p2, "onRenderProcessUnresponsive"

    invoke-virtual {p1, p2, v0, v1}, Ld/a/c/a/i;->d(Ljava/lang/String;Ljava/lang/Object;Ld/a/c/a/i$d;)V

    return-void
.end method
