.class final synthetic Lcom/google/android/play/core/assetpacks/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/play/core/assetpacks/w;

.field private final c:Landroid/os/Bundle;

.field private final d:Lcom/google/android/play/core/assetpacks/c;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/w;Landroid/os/Bundle;Lcom/google/android/play/core/assetpacks/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/u;->b:Lcom/google/android/play/core/assetpacks/w;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/u;->c:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/android/play/core/assetpacks/u;->d:Lcom/google/android/play/core/assetpacks/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/u;->b:Lcom/google/android/play/core/assetpacks/w;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/u;->c:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/android/play/core/assetpacks/u;->d:Lcom/google/android/play/core/assetpacks/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/assetpacks/w;->g(Landroid/os/Bundle;Lcom/google/android/play/core/assetpacks/c;)V

    return-void
.end method
