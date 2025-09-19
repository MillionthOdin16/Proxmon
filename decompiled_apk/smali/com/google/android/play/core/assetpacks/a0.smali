.class final Lcom/google/android/play/core/assetpacks/a0;
.super Lc/b/a/a/a/a/q0;
.source ""


# instance fields
.field private final a:Lc/b/a/a/a/a/e;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;

.field private final d:Lcom/google/android/play/core/assetpacks/c0;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;Lcom/google/android/play/core/assetpacks/c0;)V
    .locals 2

    invoke-direct {p0}, Lc/b/a/a/a/a/q0;-><init>()V

    new-instance v0, Lc/b/a/a/a/a/e;

    const-string v1, "AssetPackExtractionService"

    invoke-direct {v0, v1}, Lc/b/a/a/a/a/e;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->a:Lc/b/a/a/a/a/e;

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/a0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/a0;->c:Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/a0;->d:Lcom/google/android/play/core/assetpacks/c0;

    return-void
.end method


# virtual methods
.method public final I(Landroid/os/Bundle;Lc/b/a/a/a/a/t0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->a:Lc/b/a/a/a/a/e;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateServiceState AIDL call"

    invoke-virtual {v0, v2, v1}, Lc/b/a/a/a/a/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->b:Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/a/a/a/s;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "com.android.vending"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->c:Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p2, p1, v0}, Lc/b/a/a/a/a/t0;->f(Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p2, p1}, Lc/b/a/a/a/a/t0;->b(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/google/android/play/core/assetpacks/a0;->c:Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;

    invoke-virtual {p1}, Lcom/google/android/play/core/assetpacks/AssetPackExtractionService;->b()V

    return-void
.end method

.method public final v(Lc/b/a/a/a/a/t0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/a0;->d:Lcom/google/android/play/core/assetpacks/c0;

    invoke-virtual {v0}, Lcom/google/android/play/core/assetpacks/c0;->z()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p1, v0}, Lc/b/a/a/a/a/t0;->i(Landroid/os/Bundle;)V

    return-void
.end method
