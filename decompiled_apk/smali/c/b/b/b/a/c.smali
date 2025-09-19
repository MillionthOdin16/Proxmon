.class public final Lc/b/b/b/a/c;
.super Lc/b/b/b/a/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/b/b/a/c$a;
    }
.end annotation


# direct methods
.method public static a(Lc/b/b/b/a/e;Lc/b/b/b/a/b;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/b/b/a/e<",
            "TV;>;",
            "Lc/b/b/b/a/b<",
            "-TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lc/b/b/a/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc/b/b/b/a/c$a;

    invoke-direct {v0, p0, p1}, Lc/b/b/b/a/c$a;-><init>(Ljava/util/concurrent/Future;Lc/b/b/b/a/b;)V

    invoke-interface {p0, v0, p2}, Lc/b/b/b/a/e;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "Future was expected to be done: %s"

    invoke-static {v0, v1, p0}, Lc/b/b/a/b;->d(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Lc/b/b/b/a/h;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
