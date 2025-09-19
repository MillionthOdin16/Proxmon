.class final Lc/b/a/a/a/c/j;
.super Lc/b/a/a/a/c/i;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/b/a/a/a/c/i<",
        "Lc/b/a/a/a/c/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lc/b/a/a/a/c/k;Lc/b/a/a/a/f/p;)V
    .locals 2

    new-instance v0, Lc/b/a/a/a/a/e;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, Lc/b/a/a/a/a/e;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lc/b/a/a/a/c/i;-><init>(Lc/b/a/a/a/c/k;Lc/b/a/a/a/a/e;Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lc/b/a/a/a/c/i;->b(Landroid/os/Bundle;)V

    const-string v0, "confirmation_intent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/PendingIntent;

    iget-object v0, p0, Lc/b/a/a/a/c/i;->b:Lc/b/a/a/a/f/p;

    invoke-static {p1}, Lc/b/a/a/a/c/a;->b(Landroid/app/PendingIntent;)Lc/b/a/a/a/c/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/b/a/a/a/f/p;->e(Ljava/lang/Object;)V

    return-void
.end method
