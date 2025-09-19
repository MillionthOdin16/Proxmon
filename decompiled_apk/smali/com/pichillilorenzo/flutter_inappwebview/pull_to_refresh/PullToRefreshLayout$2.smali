.class Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/j/b/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

.field final synthetic val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 3

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb/j/b/c;->setRefreshing(Z)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    const-string v2, "onRefresh"

    invoke-virtual {v1, v2, v0}, Ld/a/c/a/i;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
