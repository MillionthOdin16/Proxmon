.class public final Lcom/google/android/play/core/assetpacks/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lcom/google/android/play/core/assetpacks/a2;",
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


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/c0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/b2;->a:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/b2;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/assetpacks/a2;

    check-cast v0, Lcom/google/android/play/core/assetpacks/c0;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/assetpacks/a2;-><init>(Lcom/google/android/play/core/assetpacks/c0;)V

    return-object v1
.end method
