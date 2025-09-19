.class public Lc/a/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/i/a;
.implements Ld/a/c/a/i$c;
.implements Lio/flutter/embedding/engine/i/c/a;


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ld/a/c/a/i;

.field private d:Lc/b/a/a/a/c/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lc/a/a/a;Lc/b/a/a/a/c/a;)Lc/b/a/a/a/c/a;
    .locals 0

    iput-object p1, p0, Lc/a/a/a;->d:Lc/b/a/a/a/c/a;

    return-object p1
.end method

.method static synthetic b(Lc/a/a/a;Ld/a/c/a/i$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/a/a/a;->e(Ld/a/c/a/i$d;)V

    return-void
.end method

.method private c(Ld/a/c/a/i$d;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/a/a/c/c;->a(Landroid/content/Context;)Lc/b/a/a/a/c/b;

    move-result-object v0

    invoke-interface {v0}, Lc/b/a/a/a/c/b;->b()Lc/b/a/a/a/f/e;

    move-result-object v0

    new-instance v1, Lc/a/a/a$c;

    invoke-direct {v1, p0, p1}, Lc/a/a/a$c;-><init>(Lc/a/a/a;Ld/a/c/a/i$d;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/a/f/e;->a(Lc/b/a/a/a/f/a;)Lc/b/a/a/a/f/e;

    return-void
.end method

.method private d(Ld/a/c/a/i$d;)V
    .locals 3

    iget-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/a/a/c/c;->a(Landroid/content/Context;)Lc/b/a/a/a/c/b;

    move-result-object v0

    invoke-interface {v0}, Lc/b/a/a/a/c/b;->b()Lc/b/a/a/a/f/e;

    move-result-object v0

    new-instance v1, Lc/a/a/a$a;

    invoke-direct {v1, p0, p1}, Lc/a/a/a$a;-><init>(Lc/a/a/a;Ld/a/c/a/i$d;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/a/f/e;->a(Lc/b/a/a/a/f/a;)Lc/b/a/a/a/f/e;

    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x0

    const-string v1, "error"

    const-string v2, "Android activity not available"

    invoke-interface {p1, v1, v2, v0}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private e(Ld/a/c/a/i$d;)V
    .locals 3

    iget-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/a;->d:Lc/b/a/a/a/c/a;

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lc/a/a/a;->c(Ld/a/c/a/i$d;)V

    return-void

    :cond_1
    iget-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/a/a/c/c;->a(Landroid/content/Context;)Lc/b/a/a/a/c/b;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lc/a/a/a;->d:Lc/b/a/a/a/c/a;

    invoke-interface {v0, v1, v2}, Lc/b/a/a/a/c/b;->a(Landroid/app/Activity;Lc/b/a/a/a/c/a;)Lc/b/a/a/a/f/e;

    move-result-object v0

    new-instance v1, Lc/a/a/a$b;

    invoke-direct {v1, p0, p1}, Lc/a/a/a$b;-><init>(Lc/a/a/a;Ld/a/c/a/i$d;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/a/f/e;->a(Lc/b/a/a/a/f/a;)Lc/b/a/a/a/f/e;

    return-void

    :cond_2
    :goto_0
    const/4 v0, 0x0

    const-string v1, "error"

    const-string v2, "Android activity not available"

    invoke-interface {p1, v1, v2, v0}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private f(Ld/a/c/a/b;)V
    .locals 2

    new-instance v0, Ld/a/c/a/i;

    const-string v1, "app_review"

    invoke-direct {v0, p1, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object v0, p0, Lc/a/a/a;->c:Ld/a/c/a/i;

    invoke-virtual {v0, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lc/a/a/a;->c:Ld/a/c/a/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object v1, p0, Lc/a/a/a;->c:Ld/a/c/a/i;

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-interface {p1}, Lio/flutter/embedding/engine/i/c/c;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->b()Ld/a/c/a/b;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/a;->f(Ld/a/c/a/b;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/a/a;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lc/a/a/a;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 0

    invoke-direct {p0}, Lc/a/a/a;->g()V

    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 3

    iget-object p1, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x6d85f674

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    const v1, 0x51206ec7

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "requestReview"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "isRequestReviewAvailable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_4

    if-eq p1, v2, :cond_3

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_3
    invoke-direct {p0, p2}, Lc/a/a/a;->e(Ld/a/c/a/i$d;)V

    goto :goto_2

    :cond_4
    invoke-direct {p0, p2}, Lc/a/a/a;->d(Ld/a/c/a/i$d;)V

    :goto_2
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lc/a/a/a;->onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V

    return-void
.end method
