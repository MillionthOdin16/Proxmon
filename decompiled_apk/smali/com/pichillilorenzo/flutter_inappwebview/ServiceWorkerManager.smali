.class public Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field static final LOG_TAG:Ljava/lang/String; = "ServiceWorkerManager"

.field public static serviceWorkerController:Lb/l/c;


# instance fields
.field public channel:Ld/a/c/a/i;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_android_serviceworkercontroller"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    const-string p1, "SERVICE_WORKER_BASIC_USAGE"

    invoke-static {p1}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lb/l/c;->a()Lb/l/c;

    move-result-object p1

    sput-object p1, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:Lb/l/c;

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$1;

    invoke-direct {v0, p0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;)V

    invoke-virtual {p1, v0}, Lb/l/c;->c(Lb/l/b;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    sput-object p1, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:Lb/l/c;

    :goto_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 8

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:Lb/l/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/l/c;->b()Lb/l/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "getBlockNetworkLoads"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x2

    goto :goto_1

    :sswitch_1
    const-string v4, "setAllowFileAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x5

    goto :goto_1

    :sswitch_2
    const-string v4, "setAllowContentAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :sswitch_3
    const-string v4, "setBlockNetworkLoads"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x6

    goto :goto_1

    :sswitch_4
    const-string v4, "setCacheMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x7

    goto :goto_1

    :sswitch_5
    const-string v4, "getAllowFileAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :sswitch_6
    const-string v4, "getCacheMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :sswitch_7
    const-string v4, "getAllowContentAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    :cond_1
    :goto_1
    const-string v2, "allow"

    const-string v4, "SERVICE_WORKER_CACHE_MODE"

    const-string v5, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    const-string v6, "SERVICE_WORKER_FILE_ACCESS"

    const-string v7, "SERVICE_WORKER_CONTENT_ACCESS"

    packed-switch v3, :pswitch_data_0

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto/16 :goto_5

    :pswitch_0
    if-eqz v0, :cond_2

    invoke-static {v4}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "mode"

    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lb/l/d;->h(I)V

    goto :goto_2

    :pswitch_1
    if-eqz v0, :cond_2

    invoke-static {v5}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "flag"

    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lb/l/d;->g(Z)V

    goto :goto_2

    :pswitch_2
    if-eqz v0, :cond_2

    invoke-static {v6}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v2}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lb/l/d;->f(Z)V

    goto :goto_2

    :pswitch_3
    if-eqz v0, :cond_2

    invoke-static {v7}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v2}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lb/l/d;->e(Z)V

    :cond_2
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_4

    :pswitch_4
    if-eqz v0, :cond_3

    invoke-static {v4}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lb/l/d;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_4

    :cond_3
    invoke-interface {p2, v1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_5
    if-eqz v0, :cond_4

    invoke-static {v5}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lb/l/d;->c()Z

    move-result p1

    goto :goto_3

    :pswitch_6
    if-eqz v0, :cond_4

    invoke-static {v6}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lb/l/d;->b()Z

    move-result p1

    goto :goto_3

    :pswitch_7
    if-eqz v0, :cond_4

    invoke-static {v7}, Lb/l/h;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lb/l/d;->a()Z

    move-result p1

    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_4

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_4
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f6fdb96 -> :sswitch_7
        -0x2194c271 -> :sswitch_6
        0x283a13f3 -> :sswitch_5
        0x3abefe03 -> :sswitch_4
        0x409afbaa -> :sswitch_3
        0x47bba676 -> :sswitch_2
        0x5f10ad67 -> :sswitch_1
        0x6504ef36 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
