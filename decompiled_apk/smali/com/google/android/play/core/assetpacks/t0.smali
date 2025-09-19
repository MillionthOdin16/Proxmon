.class public final Lcom/google/android/play/core/assetpacks/t0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/s0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/k3;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/k3;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/t0;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/t0;->b:Lc/b/a/a/a/a/g0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/t0;->c:Lc/b/a/a/a/a/g0;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/t0;->d:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/t0;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/t0;->b:Lc/b/a/a/a/a/g0;

    invoke-static {v1}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/t0;->c:Lc/b/a/a/a/a/g0;

    invoke-static {v2}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/t0;->d:Lc/b/a/a/a/a/g0;

    invoke-interface {v3}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/assetpacks/s0;

    check-cast v0, Lcom/google/android/play/core/assetpacks/c0;

    check-cast v3, Lcom/google/android/play/core/assetpacks/y0;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/google/android/play/core/assetpacks/s0;-><init>(Lcom/google/android/play/core/assetpacks/c0;Lc/b/a/a/a/a/d0;Lc/b/a/a/a/a/d0;Lcom/google/android/play/core/assetpacks/y0;)V

    return-object v4
.end method
