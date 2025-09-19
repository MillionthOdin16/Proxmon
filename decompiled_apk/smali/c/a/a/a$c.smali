.class Lc/a/a/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/a;->c(Ld/a/c/a/i$d;)V
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

    iput-object p1, p0, Lc/a/a/a$c;->b:Lc/a/a/a;

    iput-object p2, p0, Lc/a/a/a$c;->a:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/a/a/a/f/e;)V
    .locals 2
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

    iget-object v0, p0, Lc/a/a/a$c;->b:Lc/a/a/a;

    invoke-virtual {p1}, Lc/b/a/a/a/f/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/a/a/a/c/a;

    invoke-static {v0, p1}, Lc/a/a/a;->a(Lc/a/a/a;Lc/b/a/a/a/c/a;)Lc/b/a/a/a/c/a;

    iget-object p1, p0, Lc/a/a/a$c;->b:Lc/a/a/a;

    iget-object v0, p0, Lc/a/a/a$c;->a:Ld/a/c/a/i$d;

    invoke-static {p1, v0}, Lc/a/a/a;->b(Lc/a/a/a;Ld/a/c/a/i$d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lc/a/a/a$c;->a:Ld/a/c/a/i$d;

    const-string v0, "Requesting review not possible"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1, v1}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
