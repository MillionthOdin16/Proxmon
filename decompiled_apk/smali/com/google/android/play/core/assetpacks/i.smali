.class final Lcom/google/android/play/core/assetpacks/i;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lc/b/a/a/a/f/p;

.field final synthetic f:I

.field final synthetic g:Lcom/google/android/play/core/assetpacks/r;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;ILjava/lang/String;Lc/b/a/a/a/f/p;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/i;->g:Lcom/google/android/play/core/assetpacks/r;

    iput p3, p0, Lcom/google/android/play/core/assetpacks/i;->c:I

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/i;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/i;->e:Lc/b/a/a/a/f/p;

    iput p6, p0, Lcom/google/android/play/core/assetpacks/i;->f:I

    invoke-direct {p0, p2}, Lc/b/a/a/a/a/f;-><init>(Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 11

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/i;->g:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/r;->u(Lcom/google/android/play/core/assetpacks/r;)Lc/b/a/a/a/a/o;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/a/a/a/o;->f()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/a/a/a/n0;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/i;->g:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v1}, Lcom/google/android/play/core/assetpacks/r;->c(Lcom/google/android/play/core/assetpacks/r;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/play/core/assetpacks/i;->c:I

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/i;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/play/core/assetpacks/r;->n(ILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-static {}, Lcom/google/android/play/core/assetpacks/r;->q()Landroid/os/Bundle;

    move-result-object v3

    new-instance v10, Lcom/google/android/play/core/assetpacks/q;

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/i;->g:Lcom/google/android/play/core/assetpacks/r;

    iget-object v6, p0, Lcom/google/android/play/core/assetpacks/i;->e:Lc/b/a/a/a/f/p;

    iget v7, p0, Lcom/google/android/play/core/assetpacks/i;->c:I

    iget-object v8, p0, Lcom/google/android/play/core/assetpacks/i;->d:Ljava/lang/String;

    iget v9, p0, Lcom/google/android/play/core/assetpacks/i;->f:I

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/google/android/play/core/assetpacks/q;-><init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;ILjava/lang/String;I)V

    invoke-interface {v0, v1, v2, v3, v10}, Lc/b/a/a/a/a/n0;->N(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/assetpacks/r;->p()Lc/b/a/a/a/a/e;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notifyModuleCompleted"

    invoke-virtual {v1, v0, v3, v2}, Lc/b/a/a/a/a/e;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
