.class final synthetic Lcom/google/android/play/core/assetpacks/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/play/core/assetpacks/w;

.field private final c:Lcom/google/android/play/core/assetpacks/c;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/assetpacks/w;Lcom/google/android/play/core/assetpacks/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/assetpacks/t;->b:Lcom/google/android/play/core/assetpacks/w;

    iput-object p2, p0, Lcom/google/android/play/core/assetpacks/t;->c:Lcom/google/android/play/core/assetpacks/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/assetpacks/t;->b:Lcom/google/android/play/core/assetpacks/w;

    iget-object v1, p0, Lcom/google/android/play/core/assetpacks/t;->c:Lcom/google/android/play/core/assetpacks/c;

    invoke-virtual {v0, v1}, Lc/b/a/a/a/b/c;->b(Ljava/lang/Object;)V

    return-void
.end method
