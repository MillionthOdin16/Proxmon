.class public final Lcom/google/android/play/core/assetpacks/f3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/k3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/r;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/u1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/r;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/u1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/f3;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/f3;->b:Lc/b/a/a/a/a/g0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/f3;->c:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/f3;->a:Lc/b/a/a/a/a/g0;

    check-cast v0, Lcom/google/android/play/core/assetpacks/g3;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/g3;->c()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/f3;->b:Lc/b/a/a/a/a/g0;

    invoke-static {v1}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/f3;->c:Lc/b/a/a/a/a/g0;

    invoke-static {v2}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v2

    invoke-static {v0}, Lcom/google/android/play/core/assetpacks/b3;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {v1}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Lcom/google/android/play/core/assetpacks/k3;

    invoke-static {v0}, Lc/b/a/a/a/a/r;->g(Ljava/lang/Object;)V

    return-object v0
.end method
