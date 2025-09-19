.class final Lcom/google/android/play/core/assetpacks/g;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lc/b/a/a/a/f/p;

.field final synthetic e:Lcom/google/android/play/core/assetpacks/r;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;Ljava/util/Map;Lc/b/a/a/a/f/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/g;->e:Lcom/google/android/play/core/assetpacks/r;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/g;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/g;->d:Lc/b/a/a/a/f/p;

    invoke-direct {p0, p2}, Lc/b/a/a/a/a/f;-><init>(Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/g;->e:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/r;->u(Lcom/google/android/play/core/assetpacks/r;)Lc/b/a/a/a/a/o;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/a/a/a/o;->f()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/a/a/a/n0;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/g;->e:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v1}, Lcom/google/android/play/core/assetpacks/r;->c(Lcom/google/android/play/core/assetpacks/r;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/g;->c:Ljava/util/Map;

    invoke-static {v2}, Lcom/google/android/play/core/assetpacks/r;->o(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/assetpacks/o;

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/g;->e:Lcom/google/android/play/core/assetpacks/r;

    iget-object v5, p0, Lcom/google/android/play/core/assetpacks/g;->d:Lc/b/a/a/a/f/p;

    invoke-direct {v3, v4, v5}, Lcom/google/android/play/core/assetpacks/o;-><init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;)V

    invoke-interface {v0, v1, v2, v3}, Lc/b/a/a/a/a/n0;->J(Ljava/lang/String;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/assetpacks/r;->p()Lc/b/a/a/a/a/e;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncPacks"

    invoke-virtual {v1, v0, v3, v2}, Lc/b/a/a/a/a/e;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/g;->d:Lc/b/a/a/a/f/p;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lc/b/a/a/a/f/p;->d(Ljava/lang/Exception;)V

    return-void
.end method
