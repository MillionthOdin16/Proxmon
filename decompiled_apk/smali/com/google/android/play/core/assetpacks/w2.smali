.class final Lcom/google/android/play/core/assetpacks/w2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final e:Lc/b/a/a/a/a/e;


# instance fields
.field private final a:Lcom/google/android/play/core/assetpacks/c0;

.field private final b:Lc/b/a/a/a/a/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/d0<",
            "Lcom/google/android/play/core/assetpacks/k3;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/play/core/assetpacks/w;

.field private final d:Lc/b/a/a/a/a/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/d0<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc/b/a/a/a/a/e;

    const-string v1, "AssetPackManager"

    invoke-direct {v0, v1}, Lc/b/a/a/a/a/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/play/core/assetpacks/w2;->e:Lc/b/a/a/a/a/e;

    return-void
.end method

.method constructor <init>(Lcom/google/android/play/core/assetpacks/c0;Lc/b/a/a/a/a/d0;Lcom/google/android/play/core/assetpacks/w;Lc/b/a/a/a/e/a;Lcom/google/android/play/core/assetpacks/m1;Lcom/google/android/play/core/assetpacks/y0;Lcom/google/android/play/core/assetpacks/m0;Lc/b/a/a/a/a/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/assetpacks/c0;",
            "Lc/b/a/a/a/a/d0<",
            "Lcom/google/android/play/core/assetpacks/k3;",
            ">;",
            "Lcom/google/android/play/core/assetpacks/w;",
            "Lc/b/a/a/a/e/a;",
            "Lcom/google/android/play/core/assetpacks/m1;",
            "Lcom/google/android/play/core/assetpacks/y0;",
            "Lcom/google/android/play/core/assetpacks/m0;",
            "Lc/b/a/a/a/a/d0<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/w2;->a:Lcom/google/android/play/core/assetpacks/c0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/w2;->b:Lc/b/a/a/a/a/d0;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/w2;->c:Lcom/google/android/play/core/assetpacks/w;

    iput-object p8, p0, Lcom/google/android/play/core/assetpacks/w2;->d:Lc/b/a/a/a/a/d0;

    return-void
.end method

.method static final synthetic a(Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, Lcom/google/android/play/core/assetpacks/w2;->e:Lc/b/a/a/a/a/e;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Could not sync active asset packs. %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Lc/b/a/a/a/a/e;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/w2;->d:Lc/b/a/a/a/a/d0;

    invoke-interface {v0}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/play/core/assetpacks/t2;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/assetpacks/t2;-><init>(Lcom/google/android/play/core/assetpacks/w2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method final b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/w2;->c:Lcom/google/android/play/core/assetpacks/w;

    invoke-virtual {v0}, Lc/b/a/a/a/b/c;->d()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/w2;->c:Lcom/google/android/play/core/assetpacks/w;

    invoke-virtual {v1, p1}, Lc/b/a/a/a/b/c;->c(Z)V

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/play/core/assetpacks/w2;->d()V

    :cond_0
    return-void
.end method

.method final synthetic c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/w2;->b:Lc/b/a/a/a/a/d0;

    invoke-interface {v0}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/assetpacks/k3;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/w2;->a:Lcom/google/android/play/core/assetpacks/c0;

    invoke-virtual {v1}, Lcom/google/android/play/core/assetpacks/c0;->l()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/play/core/assetpacks/k3;->k(Ljava/util/Map;)Lc/b/a/a/a/f/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/w2;->d:Lc/b/a/a/a/a/d0;

    invoke-interface {v1}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/w2;->a:Lcom/google/android/play/core/assetpacks/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/android/play/core/assetpacks/u2;->b(Lcom/google/android/play/core/assetpacks/c0;)Lc/b/a/a/a/f/c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/a/f/e;->c(Ljava/util/concurrent/Executor;Lc/b/a/a/a/f/c;)Lc/b/a/a/a/f/e;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/w2;->d:Lc/b/a/a/a/a/d0;

    invoke-interface {v1}, Lc/b/a/a/a/a/d0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    sget-object v2, Lcom/google/android/play/core/assetpacks/v2;->a:Lc/b/a/a/a/f/b;

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/a/f/e;->b(Ljava/util/concurrent/Executor;Lc/b/a/a/a/f/b;)Lc/b/a/a/a/f/e;

    return-void
.end method
