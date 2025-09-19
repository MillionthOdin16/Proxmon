.class Lc/a/a/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a;->d(Ld/a/c/a/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/f/a<",
        "Lc/b/a/a/a/c/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ld/a/c/a/i$d;

.field final synthetic b:Lc/a/a/a;


# direct methods
.method constructor <init>(Lc/a/a/a;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lc/a/a/a$a;->b:Lc/a/a/a;

    iput-object p2, p0, Lc/a/a/a$a;->a:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/a/a/a/f/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/f/e<",
            "Lc/b/a/a/a/c/a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lc/b/a/a/a/f/e;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/a$a;->b:Lc/a/a/a;

    invoke-virtual {p1}, Lc/b/a/a/a/f/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/a/a/a/c/a;

    invoke-static {v0, p1}, Lc/a/a/a;->a(Lc/a/a/a;Lc/b/a/a/a/c/a;)Lc/b/a/a/a/c/a;

    iget-object p1, p0, Lc/a/a/a$a;->a:Ld/a/c/a/i$d;

    const-string v0, "1"

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc/a/a/a$a;->a:Ld/a/c/a/i$d;

    const-string v0, "0"

    :goto_0
    invoke-interface {p1, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method
