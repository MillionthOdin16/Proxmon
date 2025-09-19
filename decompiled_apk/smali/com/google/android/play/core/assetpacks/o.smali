.class final Lcom/google/android/play/core/assetpacks/o;
.super Lcom/google/android/play/core/assetpacks/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/play/core/assetpacks/m<",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/play/core/assetpacks/r;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/f/p<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/o;->c:Lcom/google/android/play/core/assetpacks/r;

    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/assetpacks/m;-><init>(Lcom/google/android/play/core/assetpacks/r;Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/play/core/assetpacks/m;->g(Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/o;->c:Lcom/google/android/play/core/assetpacks/r;

    invoke-static {v0, p1}, Lcom/google/android/play/core/assetpacks/r;->e(Lcom/google/android/play/core/assetpacks/r;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/m;->a:Lc/b/a/a/a/f/p;

    invoke-virtual {v0, p1}, Lc/b/a/a/a/f/p;->e(Ljava/lang/Object;)V

    return-void
.end method
