.class public final Lcom/google/android/play/core/assetpacks/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/p1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/m1;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/j0;",
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
            "Lcom/google/android/play/core/assetpacks/m1;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/j0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/q1;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/q1;->b:Lc/b/a/a/a/a/g0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/q1;->c:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/q1;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/q1;->b:Lc/b/a/a/a/a/g0;

    invoke-interface {v1}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/q1;->c:Lc/b/a/a/a/a/g0;

    invoke-interface {v2}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/assetpacks/p1;

    check-cast v0, Lcom/google/android/play/core/assetpacks/m1;

    check-cast v1, Lcom/google/android/play/core/assetpacks/c0;

    check-cast v2, Lcom/google/android/play/core/assetpacks/j0;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/play/core/assetpacks/p1;-><init>(Lcom/google/android/play/core/assetpacks/m1;Lcom/google/android/play/core/assetpacks/c0;Lcom/google/android/play/core/assetpacks/j0;)V

    return-object v3
.end method
