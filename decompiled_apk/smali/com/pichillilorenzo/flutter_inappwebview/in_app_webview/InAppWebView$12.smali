.class Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->rebuildActionMode(Landroid/view/ActionMode;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

.field final synthetic val$actionMode:Landroid/view/ActionMode;

.field final synthetic val$callback:Landroid/view/ActionMode$Callback;

.field final synthetic val$itemId:I

.field final synthetic val$itemTitle:Ljava/lang/String;

.field final synthetic val$menuItem:Landroid/view/MenuItem;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Landroid/view/ActionMode$Callback;Landroid/view/ActionMode;Landroid/view/MenuItem;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$callback:Landroid/view/ActionMode$Callback;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$actionMode:Landroid/view/ActionMode;

    iput-object p4, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$menuItem:Landroid/view/MenuItem;

    iput p5, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$itemId:I

    iput-object p6, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$itemTitle:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {p1}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->hideContextMenu()V

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$callback:Landroid/view/ActionMode$Callback;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$actionMode:Landroid/view/ActionMode;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$menuItem:Landroid/view/MenuItem;

    invoke-interface {p1, v0, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$itemId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "androidId"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "iosId"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->val$itemTitle:Ljava/lang/String;

    const-string v1, "title"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView$12;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->channel:Ld/a/c/a/i;

    const-string v1, "onContextMenuActionItemClicked"

    invoke-virtual {v0, v1, p1}, Ld/a/c/a/i;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
