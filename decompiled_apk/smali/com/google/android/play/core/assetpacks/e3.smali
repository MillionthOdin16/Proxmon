.class public final Lcom/google/android/play/core/assetpacks/e3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Lcom/google/android/play/core/assetpacks/w2;",
            ">;",
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/e3;->a:Lc/b/a/a/a/a/g0;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/e3;->b:Lc/b/a/a/a/a/g0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/e3;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/e3;->b:Lc/b/a/a/a/a/g0;

    check-cast v1, Lcom/google/android/play/core/assetpacks/g3;

    invoke-virtual {v1}, Lcom/google/android/play/core/assetpacks/g3;->c()Landroid/content/Context;

    move-result-object v1

    check-cast v0, Lcom/google/android/play/core/assetpacks/w2;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "com.google.android.play.core.assetpacks.AssetPackExtractionService"

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x4

    invoke-static {v2, v3, v4}, Lc/b/a/a/a/a/r;->a(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;I)V

    invoke-static {v1}, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;->a(Landroid/content/Context;)V

    invoke-static {v0}, Lc/b/a/a/a/a/r;->g(Ljava/lang/Object;)V

    return-object v0
.end method
