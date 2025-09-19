.class Lio/flutter/embedding/engine/j/k$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/j/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lio/flutter/embedding/engine/j/k;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/j/k;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 4

    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    iget-object p1, p1, Ld/a/c/a/h;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x18f56

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const v2, 0x1b30f

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, -0x1

    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v3, :cond_3

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_4

    :cond_3
    iget-object p1, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    invoke-static {p1, v3}, Lio/flutter/embedding/engine/j/k;->c(Lio/flutter/embedding/engine/j/k;Z)Z

    iget-object p1, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    invoke-static {p1}, Lio/flutter/embedding/engine/j/k;->d(Lio/flutter/embedding/engine/j/k;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    iget-boolean v0, p1, Lio/flutter/embedding/engine/j/k;->a:Z

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p1, p2}, Lio/flutter/embedding/engine/j/k;->f(Lio/flutter/embedding/engine/j/k;Ld/a/c/a/i$d;)Ld/a/c/a/i$d;

    goto :goto_4

    :cond_5
    :goto_2
    iget-object p1, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    invoke-static {p1}, Lio/flutter/embedding/engine/j/k;->a(Lio/flutter/embedding/engine/j/k;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lio/flutter/embedding/engine/j/k;->e(Lio/flutter/embedding/engine/j/k;[B)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lio/flutter/embedding/engine/j/k$b;->b:Lio/flutter/embedding/engine/j/k;

    check-cast p1, [B

    invoke-static {v0, p1}, Lio/flutter/embedding/engine/j/k;->b(Lio/flutter/embedding/engine/j/k;[B)[B

    const/4 p1, 0x0

    :goto_3
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method
