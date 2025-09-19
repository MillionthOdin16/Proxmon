.class public Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field static final LOG_TAG:Ljava/lang/String; = "WebViewFeatureManager"


# instance fields
.field public channel:Ld/a/c/a/i;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_android_webviewfeature"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/WebViewFeatureManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 3

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x4f462ba2

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "isFeatureSupported"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_2
    const-string v0, "feature"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
