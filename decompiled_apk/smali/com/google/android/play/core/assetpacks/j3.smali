.class public final Lcom/google/android/play/core/assetpacks/j3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Ljava/util/concurrent/Executor;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/google/android/play/core/assetpacks/z2;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, Lc/b/a/a/a/a/r;->g(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/assetpacks/j3;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method
