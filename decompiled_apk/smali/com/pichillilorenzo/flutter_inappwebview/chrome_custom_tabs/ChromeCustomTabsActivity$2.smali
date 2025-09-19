.class Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;
.super Lb/c/b/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-direct {p0}, Lb/c/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public extraCallback(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onMessageChannelReady(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onNavigationEvent(ILandroid/os/Bundle;)V
    .locals 3

    const/4 p2, 0x1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-boolean v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->onChromeSafariBrowserOpened:Z

    if-nez v1, :cond_0

    iput-boolean p2, v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->onChromeSafariBrowserOpened:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->channel:Ld/a/c/a/i;

    const-string v2, "onChromeSafariBrowserOpened"

    invoke-virtual {v1, v2, v0}, Ld/a/c/a/i;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-boolean v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->onChromeSafariBrowserCompletedInitialLoad:Z

    if-nez v0, :cond_1

    iput-boolean p2, p1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->onChromeSafariBrowserCompletedInitialLoad:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object p2, p2, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->channel:Ld/a/c/a/i;

    const-string v0, "onChromeSafariBrowserCompletedInitialLoad"

    invoke-virtual {p2, v0, p1}, Ld/a/c/a/i;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public onPostMessage(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
