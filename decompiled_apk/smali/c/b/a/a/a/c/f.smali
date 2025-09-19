.class public final Lc/b/a/a/a/c/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/c/b;


# instance fields
.field private final a:Lc/b/a/a/a/c/k;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lc/b/a/a/a/c/k;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lc/b/a/a/a/c/f;->b:Landroid/os/Handler;

    iput-object p1, p0, Lc/b/a/a/a/c/f;->a:Lc/b/a/a/a/c/k;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lc/b/a/a/a/c/a;)Lc/b/a/a/a/f/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lc/b/a/a/a/c/a;",
            ")",
            "Lc/b/a/a/a/f/e<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2}, Lc/b/a/a/a/c/a;->a()Landroid/app/PendingIntent;

    move-result-object p2

    const-string v1, "confirmation_intent"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    new-instance p2, Lc/b/a/a/a/f/p;

    invoke-direct {p2}, Lc/b/a/a/a/f/p;-><init>()V

    new-instance v1, Lc/b/a/a/a/c/e;

    iget-object v2, p0, Lc/b/a/a/a/c/f;->b:Landroid/os/Handler;

    invoke-direct {v1, v2, p2}, Lc/b/a/a/a/c/e;-><init>(Landroid/os/Handler;Lc/b/a/a/a/f/p;)V

    const-string v2, "result_receiver"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p2}, Lc/b/a/a/a/f/p;->a()Lc/b/a/a/a/f/e;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lc/b/a/a/a/f/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/a/f/e<",
            "Lc/b/a/a/a/c/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/a/c/f;->a:Lc/b/a/a/a/c/k;

    invoke-virtual {v0}, Lc/b/a/a/a/c/k;->a()Lc/b/a/a/a/f/e;

    move-result-object v0

    return-object v0
.end method
