.class Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper$ConnectionCallback;


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

.field final synthetic val$chromeCustomTabsActivity:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

.field final synthetic val$menuItemList:Ljava/util/List;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;Ljava/lang/String;Ljava/util/List;Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$menuItemList:Ljava/util/List;

    iput-object p4, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$chromeCustomTabsActivity:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCustomTabsConnected()V
    .locals 4

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->customTabActivityHelper:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->getSession()Lb/c/b/f;

    move-result-object v1

    iput-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->customTabsSession:Lb/c/b/f;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$url:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->customTabActivityHelper:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, v2}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->mayLaunchUrl(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/List;)Z

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    new-instance v2, Lb/c/b/d$a;

    iget-object v3, v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->customTabsSession:Lb/c/b/f;

    invoke-direct {v2, v3}, Lb/c/b/d$a;-><init>(Lb/c/b/f;)V

    iput-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->builder:Lb/c/b/d$a;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$menuItemList:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->access$000(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;Ljava/util/List;)V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->builder:Lb/c/b/d$a;

    invoke-virtual {v1}, Lb/c/b/d$a;->c()Lb/c/b/d;

    move-result-object v1

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-static {v2, v1}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->access$100(Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;Lb/c/b/d;)V

    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$chromeCustomTabsActivity:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    const/16 v3, 0x64

    invoke-static {v2, v1, v0, v3}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/CustomTabActivityHelper;->openCustomTab(Landroid/app/Activity;Lb/c/b/d;Landroid/net/Uri;I)V

    return-void
.end method

.method public onCustomTabsDisconnected()V
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->val$chromeCustomTabsActivity:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->close()V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/chrome_custom_tabs/ChromeCustomTabsActivity;->dispose()V

    return-void
.end method
