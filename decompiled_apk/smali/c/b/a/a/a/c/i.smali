.class Lc/b/a/a/a/c/i;
.super Lc/b/a/a/a/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc/b/a/a/a/a/c;"
    }
.end annotation


# instance fields
.field final a:Lc/b/a/a/a/a/e;

.field final b:Lc/b/a/a/a/f/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/f/p<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lc/b/a/a/a/c/k;


# direct methods
.method constructor <init>(Lc/b/a/a/a/c/k;Lc/b/a/a/a/a/e;Lc/b/a/a/a/f/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/e;",
            "Lc/b/a/a/a/f/p<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lc/b/a/a/a/c/i;->c:Lc/b/a/a/a/c/k;

    invoke-direct {p0}, Lc/b/a/a/a/a/c;-><init>()V

    iput-object p2, p0, Lc/b/a/a/a/c/i;->a:Lc/b/a/a/a/a/e;

    iput-object p3, p0, Lc/b/a/a/a/c/i;->b:Lc/b/a/a/a/f/p;

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lc/b/a/a/a/c/i;->c:Lc/b/a/a/a/c/k;

    iget-object p1, p1, Lc/b/a/a/a/c/k;->a:Lc/b/a/a/a/a/o;

    invoke-virtual {p1}, Lc/b/a/a/a/a/o;->b()V

    iget-object p1, p0, Lc/b/a/a/a/c/i;->a:Lc/b/a/a/a/a/e;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onGetLaunchReviewFlowInfo"

    invoke-virtual {p1, v1, v0}, Lc/b/a/a/a/a/e;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
