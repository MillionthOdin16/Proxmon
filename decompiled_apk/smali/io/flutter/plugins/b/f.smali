.class public final synthetic Lio/flutter/plugins/b/f;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/b/b/a/f;

.field public final synthetic c:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lc/b/b/b/a/f;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/b/f;->b:Lc/b/b/b/a/f;

    iput-object p2, p0, Lio/flutter/plugins/b/f;->c:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/b/f;->b:Lc/b/b/b/a/f;

    iget-object v1, p0, Lio/flutter/plugins/b/f;->c:Ljava/util/concurrent/Callable;

    invoke-static {v0, v1}, Lio/flutter/plugins/b/h;->h(Lc/b/b/b/a/f;Ljava/util/concurrent/Callable;)V

    return-void
.end method
