.class public final Lcom/google/android/play/core/assetpacks/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/u1;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/g2;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Ljava/lang/String;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/y0;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/g2;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/v1;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/v1;->b:Lc/b/a/a/a/a/g0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/v1;->c:Lc/b/a/a/a/a/g0;

    iput-object p4, p0, Lcom/google/android/play/core/assetpacks/v1;->d:Lc/b/a/a/a/a/g0;

    iput-object p5, p0, Lcom/google/android/play/core/assetpacks/v1;->e:Lc/b/a/a/a/a/g0;

    iput-object p6, p0, Lcom/google/android/play/core/assetpacks/v1;->f:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/v1;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/v1;->b:Lc/b/a/a/a/a/g0;

    invoke-interface {v1}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/v1;->c:Lc/b/a/a/a/a/g0;

    invoke-interface {v2}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/v1;->d:Lc/b/a/a/a/a/g0;

    check-cast v3, Lcom/google/android/play/core/assetpacks/g3;

    invoke-virtual {v3}, Lcom/google/android/play/core/assetpacks/g3;->c()Landroid/content/Context;

    move-result-object v8

    iget-object v3, p0, Lcom/google/android/play/core/assetpacks/v1;->e:Lc/b/a/a/a/a/g0;

    invoke-interface {v3}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/play/core/assetpacks/v1;->f:Lc/b/a/a/a/a/g0;

    invoke-static {v4}, Lc/b/a/a/a/a/f0;->c(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/a/d0;

    move-result-object v10

    new-instance v11, Lcom/google/android/play/core/assetpacks/u1;

    move-object v6, v1

    check-cast v6, Lcom/google/android/play/core/assetpacks/w;

    move-object v7, v2

    check-cast v7, Lcom/google/android/play/core/assetpacks/y0;

    move-object v9, v3

    check-cast v9, Lcom/google/android/play/core/assetpacks/g2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v5, v0

    :goto_0
    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Lcom/google/android/play/core/assetpacks/u1;-><init>(Ljava/io/File;Lcom/google/android/play/core/assetpacks/w;Lcom/google/android/play/core/assetpacks/y0;Landroid/content/Context;Lcom/google/android/play/core/assetpacks/g2;Lc/b/a/a/a/a/d0;)V

    return-object v11
.end method
