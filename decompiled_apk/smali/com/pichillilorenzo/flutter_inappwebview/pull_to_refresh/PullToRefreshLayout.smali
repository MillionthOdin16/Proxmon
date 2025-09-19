.class public Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;
.super Lb/j/b/c;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# static fields
.field static final LOG_TAG:Ljava/lang/String; = "PullToRefreshLayout"


# instance fields
.field public channel:Ld/a/c/a/i;

.field public options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/j/b/c;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/j/b/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld/a/c/a/i;Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/j/b/c;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    iput-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    :cond_0
    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 5

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "setSize"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_1

    :sswitch_1
    const-string v1, "isRefreshing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_2
    const-string v1, "setDistanceToTriggerSync"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_3
    const-string v1, "setBackgroundColor"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_4
    const-string v1, "setColor"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_5
    const-string v1, "setEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_6
    const-string v1, "getDefaultSlingshotDistance"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    goto :goto_1

    :sswitch_7
    const-string v1, "setRefreshing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_8
    const-string v1, "setSlingshotDistance"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    const-string v1, "color"

    packed-switch v0, :pswitch_data_0

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto/16 :goto_4

    :pswitch_0
    const-string v0, "size"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setSize(I)V

    goto :goto_2

    :pswitch_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :pswitch_2
    const-string v0, "slingshotDistance"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setSlingshotDistance(I)V

    goto :goto_2

    :pswitch_3
    const-string v0, "distanceToTriggerSync"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setDistanceToTriggerSync(I)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setProgressBackgroundColorSchemeColor(I)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {p1, v1}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-array v0, v3, [I

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    aput p1, v0, v2

    invoke-virtual {p0, v0}, Lb/j/b/c;->setColorSchemeColors([I)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {p0}, Lb/j/b/c;->isRefreshing()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :pswitch_7
    const-string v0, "refreshing"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setRefreshing(Z)V

    goto :goto_2

    :pswitch_8
    const-string v0, "enabled"

    invoke-virtual {p1, v0}, Ld/a/c/a/h;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lb/j/b/c;->setEnabled(Z)V

    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_3
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6abe11ca -> :sswitch_8
        0x9365929 -> :sswitch_7
        0x49a57fad -> :sswitch_6
        0x514e147f -> :sswitch_5
        0x52d2f021 -> :sswitch_4
        0x67f06213 -> :sswitch_3
        0x6bc095c1 -> :sswitch_2
        0x6e3c4ff1 -> :sswitch_1
        0x76500f83 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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

.method public prepare()V
    .locals 3

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Ld/a/c/a/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    :cond_0
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->enabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lb/j/b/c;->setEnabled(Z)V

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$1;

    invoke-direct {v0, p0}, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;)V

    invoke-virtual {p0, v0}, Lb/j/b/c;->setOnChildScrollUpCallback(Lb/j/b/c$i;)V

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;

    invoke-direct {v0, p0, p0}, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;)V

    invoke-virtual {p0, v0}, Lb/j/b/c;->setOnRefreshListener(Lb/j/b/c$j;)V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->color:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    aput v0, v1, v2

    invoke-virtual {p0, v1}, Lb/j/b/c;->setColorSchemeColors([I)V

    :cond_1
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->backgroundColor:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lb/j/b/c;->setProgressBackgroundColorSchemeColor(I)V

    :cond_2
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->distanceToTriggerSync:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lb/j/b/c;->setDistanceToTriggerSync(I)V

    :cond_3
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->slingshotDistance:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lb/j/b/c;->setSlingshotDistance(I)V

    :cond_4
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->options:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshOptions;->size:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lb/j/b/c;->setSize(I)V

    :cond_5
    return-void
.end method
