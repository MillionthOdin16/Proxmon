.class public Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field protected static final LOG_TAG:Ljava/lang/String; = "ChromeBrowserManager"

.field public static final shared:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public channel:Ld/a/c/a/i;

.field public id:Ljava/lang/String;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->shared:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->id:Ljava/lang/String;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Ld/a/c/a/i;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Ld/a/c/a/b;

    const-string v1, "com.pichillilorenzo/flutter_chromesafaribrowser"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->channel:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->shared:Ljava/util/Map;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->id:Ljava/lang/String;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->channel:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->shared:Ljava/util/Map;

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->id:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 8

    const-string v0, "id"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x34264a

    const/4 v4, 0x1

    if-eq v1, v2, :cond_1

    const v2, 0x1a7eccbf

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "isAvailable"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "open"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_4

    if-eq v0, v4, :cond_3

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    invoke-static {p1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->isAvailable(Landroid/app/Activity;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    const-string v0, "url"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    const-string v0, "options"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/HashMap;

    const-string v0, "menuItemList"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    iget-object v2, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->activity:Landroid/app/Activity;

    move-object v1, p0

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->open(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/List;Ld/a/c/a/i$d;)V

    :goto_2
    return-void
.end method

.method public open(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/List;Ld/a/c/a/i$d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ld/a/c/a/i$d;",
            ")V"
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "isData"

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p3, "id"

    invoke-virtual {v0, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeSafariBrowserManager;->id:Ljava/lang/String;

    const-string p3, "managerId"

    invoke-virtual {v0, p3, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "options"

    invoke-virtual {v0, p2, p4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    check-cast p5, Ljava/io/Serializable;

    const-string p2, "menuItemList"

    invoke-virtual {v0, p2, p5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-static {p1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->isAvailable(Landroid/app/Activity;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p6, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    const-string p2, "ChromeBrowserManager"

    const-string p3, "ChromeCustomTabs is not available!"

    invoke-interface {p6, p2, p3, p1}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
