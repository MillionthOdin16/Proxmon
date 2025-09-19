.class public final Lc/b/a/a/a/f/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Exception;)Lc/b/a/a/a/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lc/b/a/a/a/f/e<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/a/f/t;

    invoke-direct {v0}, Lc/b/a/a/a/f/t;-><init>()V

    invoke-virtual {v0, p0}, Lc/b/a/a/a/f/t;->i(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Lc/b/a/a/a/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(TResultT;)",
            "Lc/b/a/a/a/f/e<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/a/f/t;

    invoke-direct {v0}, Lc/b/a/a/a/f/t;-><init>()V

    invoke-virtual {v0, p0}, Lc/b/a/a/a/f/t;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static c(Lc/b/a/a/a/f/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/a/a/a/f/e<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    invoke-virtual {p0}, Lc/b/a/a/a/f/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc/b/a/a/a/f/e;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lc/b/a/a/a/f/e;->d()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static d(Lc/b/a/a/a/f/e;Lc/b/a/a/a/f/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/f/e<",
            "*>;",
            "Lc/b/a/a/a/f/u;",
            ")V"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/a/f/f;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/a/f/e;->c(Ljava/util/concurrent/Executor;Lc/b/a/a/a/f/c;)Lc/b/a/a/a/f/e;

    sget-object v0, Lc/b/a/a/a/f/f;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/a/f/e;->b(Ljava/util/concurrent/Executor;Lc/b/a/a/a/f/b;)Lc/b/a/a/a/f/e;

    return-void
.end method

.method public static e(Lc/b/a/a/a/f/e;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/a/a/a/f/e<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lc/b/a/a/a/a/q;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc/b/a/a/a/f/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lc/b/a/a/a/f/g;->c(Lc/b/a/a/a/f/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lc/b/a/a/a/f/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/b/a/a/a/f/u;-><init>([B)V

    invoke-static {p0, v0}, Lc/b/a/a/a/f/g;->d(Lc/b/a/a/a/f/e;Lc/b/a/a/a/f/u;)V

    invoke-virtual {v0}, Lc/b/a/a/a/f/u;->c()V

    invoke-static {p0}, Lc/b/a/a/a/f/g;->c(Lc/b/a/a/a/f/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
