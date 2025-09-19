.class public Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ServiceConnectionCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;
    }
.end annotation


# instance fields
.field private mClient:Lb/c/b/c;

.field private mConnection:Lb/c/b/e;

.field private mConnectionCallback:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;

.field private mCustomTabsCallback:Lb/c/b/b;

.field private mCustomTabsSession:Lb/c/b/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isAvailable(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabsHelper;->getPackageNameToUse(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static openCustomTab(Landroid/app/Activity;Lb/c/b/d;Landroid/net/Uri;I)V
    .locals 1

    iget-object v0, p1, Lb/c/b/d;->a:Landroid/content/Intent;

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p1, Lb/c/b/d;->a:Landroid/content/Intent;

    invoke-virtual {p0, p1, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public bindCustomTabsService(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabsHelper;->getPackageNameToUse(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ServiceConnection;

    invoke-direct {v1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ServiceConnection;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ServiceConnectionCallback;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnection:Lb/c/b/e;

    invoke-static {p1, v0, v1}, Lb/c/b/c;->a(Landroid/content/Context;Ljava/lang/String;Lb/c/b/e;)Z

    return-void
.end method

.method public getSession()Lb/c/b/f;
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsSession:Lb/c/b/f;

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsSession:Lb/c/b/f;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsCallback:Lb/c/b/b;

    invoke-virtual {v0, v1}, Lb/c/b/c;->c(Lb/c/b/b;)Lb/c/b/f;

    move-result-object v0

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsSession:Lb/c/b/f;

    return-object v0
.end method

.method public mayLaunchUrl(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/os/Bundle;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->getSession()Lb/c/b/f;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lb/c/b/f;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public onServiceConnected(Lb/c/b/c;)V
    .locals 2

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lb/c/b/c;->e(J)Z

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnectionCallback:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;->onCustomTabsConnected()V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsSession:Lb/c/b/f;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnectionCallback:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;->onCustomTabsDisconnected()V

    :cond_0
    return-void
.end method

.method public setConnectionCallback(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnectionCallback:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;

    return-void
.end method

.method public setCustomTabsCallback(Lb/c/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsCallback:Lb/c/b/b;

    return-void
.end method

.method public unbindCustomTabsService(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnection:Lb/c/b/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mClient:Lb/c/b/c;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mCustomTabsSession:Lb/c/b/f;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mConnection:Lb/c/b/e;

    return-void
.end method
