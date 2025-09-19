.class final Lc/b/b/b/a/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/b/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final b:Lc/b/b/b/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/b/b/a/a<",
            "TV;>;"
        }
    .end annotation
.end field

.field final c:Lc/b/b/b/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/b/b/a/e<",
            "+TV;>;"
        }
    .end annotation
.end field


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lc/b/b/b/a/a$g;->b:Lc/b/b/b/a/a;

    invoke-static {v0}, Lc/b/b/b/a/a;->e(Lc/b/b/b/a/a;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc/b/b/b/a/a$g;->c:Lc/b/b/b/a/e;

    invoke-static {v0}, Lc/b/b/b/a/a;->g(Lc/b/b/b/a/e;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lc/b/b/b/a/a;->c()Lc/b/b/b/a/a$b;

    move-result-object v1

    iget-object v2, p0, Lc/b/b/b/a/a$g;->b:Lc/b/b/b/a/a;

    invoke-virtual {v1, v2, p0, v0}, Lc/b/b/b/a/a$b;->b(Lc/b/b/b/a/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/b/b/b/a/a$g;->b:Lc/b/b/b/a/a;

    invoke-static {v0}, Lc/b/b/b/a/a;->h(Lc/b/b/b/a/a;)V

    :cond_1
    return-void
.end method
