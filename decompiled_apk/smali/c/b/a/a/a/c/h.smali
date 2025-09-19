.class final Lc/b/a/a/a/c/h;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:Lc/b/a/a/a/f/p;

.field final synthetic d:Lc/b/a/a/a/c/k;


# direct methods
.method constructor <init>(Lc/b/a/a/a/c/k;Lc/b/a/a/a/f/p;Lc/b/a/a/a/f/p;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/a/c/h;->d:Lc/b/a/a/a/c/k;

    iput-object p3, p0, Lc/b/a/a/a/c/h;->c:Lc/b/a/a/a/f/p;

    invoke-direct {p0, p2}, Lc/b/a/a/a/a/f;-><init>(Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lc/b/a/a/a/c/h;->d:Lc/b/a/a/a/c/k;

    iget-object v0, v0, Lc/b/a/a/a/c/k;->a:Lc/b/a/a/a/a/o;

    invoke-virtual {v0}, Lc/b/a/a/a/a/o;->f()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/a/a/a/b;

    iget-object v1, p0, Lc/b/a/a/a/c/h;->d:Lc/b/a/a/a/c/k;

    invoke-static {v1}, Lc/b/a/a/a/c/k;->b(Lc/b/a/a/a/c/k;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/play/core/common/b;->a()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lc/b/a/a/a/c/j;

    iget-object v4, p0, Lc/b/a/a/a/c/h;->d:Lc/b/a/a/a/c/k;

    iget-object v5, p0, Lc/b/a/a/a/c/h;->c:Lc/b/a/a/a/f/p;

    invoke-direct {v3, v4, v5}, Lc/b/a/a/a/c/j;-><init>(Lc/b/a/a/a/c/k;Lc/b/a/a/a/f/p;)V

    invoke-interface {v0, v1, v2, v3}, Lc/b/a/a/a/a/b;->l(Ljava/lang/String;Landroid/os/Bundle;Lc/b/a/a/a/a/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lc/b/a/a/a/c/k;->c()Lc/b/a/a/a/a/e;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lc/b/a/a/a/c/h;->d:Lc/b/a/a/a/c/k;

    invoke-static {v4}, Lc/b/a/a/a/c/k;->b(Lc/b/a/a/a/c/k;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "error requesting in-app review for %s"

    invoke-virtual {v1, v0, v3, v2}, Lc/b/a/a/a/a/e;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lc/b/a/a/a/c/h;->c:Lc/b/a/a/a/f/p;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lc/b/a/a/a/f/p;->d(Ljava/lang/Exception;)V

    return-void
.end method
