.class public final Lcom/google/android/play/core/assetpacks/f2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/e2;",
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
            "Lcom/google/android/play/core/assetpacks/m1;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;)V
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
            "Lcom/google/android/play/core/assetpacks/m1;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/f2;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/f2;->b:Lc/b/a/a/a/a/g0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/f2;->c:Lc/b/a/a/a/a/g0;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/f2;->d:Lc/b/a/a/a/a/g0;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/f2;->e:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/f2;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/f2;->b:Lc/b/a/a/a/a/g0;

    invoke-static {v1}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v4

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/f2;->c:Lc/b/a/a/a/a/g0;

    invoke-interface {v1}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/f2;->d:Lc/b/a/a/a/a/g0;

    invoke-static {v2}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v6

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/f2;->e:Lc/b/a/a/a/a/g0;

    invoke-interface {v2}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v2

    new-instance v8, Lcom/google/android/play/core/assetpacks/e2;

    move-object v3, v0

    check-cast v3, Lcom/google/android/play/core/assetpacks/c0;

    move-object v5, v1

    check-cast v5, Lcom/google/android/play/core/assetpacks/m1;

    move-object v7, v2

    check-cast v7, Lcom/google/android/play/core/assetpacks/y0;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/google/android/play/core/assetpacks/e2;-><init>(Lcom/google/android/play/core/assetpacks/c0;Lc/b/a/a/a/a/d0;Lcom/google/android/play/core/assetpacks/m1;Lc/b/a/a/a/a/d0;Lcom/google/android/play/core/assetpacks/y0;)V

    return-object v8
.end method
