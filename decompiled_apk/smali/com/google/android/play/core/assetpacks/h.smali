.class final Lcom/google/android/play/core/assetpacks/h;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:I

.field final synthetic g:Lc/b/a/a/a/f/p;

.field final synthetic h:Lcom/google/android/play/core/assetpacks/r;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;ILjava/lang/String;Ljava/lang/String;ILc/b/a/a/a/f/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/h;->h:Lcom/google/android/play/core/assetpacks/r;

    iput p3, p0, Lcom/google/android/play/core/assetpacks/h;->c:I

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/h;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/h;->e:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/play/core/assetpacks/h;->f:I

    iput-object p7, p0, Lcom/google/android/play/core/assetpacks/h;->g:Lc/b/a/a/a/f/p;

    invoke-direct {p0, p2}, Lc/b/a/a/a/a/f;-><init>(Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/h;->h:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/r;->u(Lcom/google/android/play/core/assetpacks/r;)Lc/b/a/a/a/a/o;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/a/a/a/o;->f()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/a/a/a/n0;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/h;->h:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v1}, Lcom/google/android/play/core/assetpacks/r;->c(Lcom/google/android/play/core/assetpacks/r;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/play/core/assetpacks/h;->c:I

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/h;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/h;->e:Ljava/lang/String;

    iget v5, p0, Lcom/google/android/play/core/assetpacks/h;->f:I

    invoke-static {v2, v3, v4, v5}, Lcom/google/android/play/core/assetpacks/r;->t(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Lcom/google/android/play/core/assetpacks/r;->q()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/assetpacks/m;

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/h;->h:Lcom/google/android/play/core/assetpacks/r;

    iget-object v6, p0, Lcom/google/android/play/core/assetpacks/h;->g:Lc/b/a/a/a/f/p;

    const/4 v7, 0x0

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/play/core/assetpacks/m;-><init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;[C)V

    invoke-interface {v0, v1, v2, v3, v4}, Lc/b/a/a/a/a/n0;->z(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/assetpacks/r;->p()Lc/b/a/a/a/a/e;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyChunkTransferred"

    invoke-virtual {v1, v0, v3, v2}, Lc/b/a/a/a/a/e;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
