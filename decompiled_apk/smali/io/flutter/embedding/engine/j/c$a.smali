.class Lio/flutter/embedding/engine/j/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/j/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lio/flutter/embedding/engine/j/c;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/j/c;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 7

    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->a(Lio/flutter/embedding/engine/j/c;)Lio/flutter/embedding/engine/g/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ld/a/c/a/h;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' message."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DeferredComponentChannel"

    invoke-static {v2, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "loadingUnitId"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "componentName"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x3bdea8e4

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v4, :cond_3

    const v4, 0x17d2f6fe

    if-eq v3, v4, :cond_2

    const v4, 0x1f0d4383

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "installDeferredComponent"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    const-string v3, "getDeferredComponentInstallState"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const-string v3, "uninstallDeferredComponent"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    :cond_4
    :goto_0
    if-eqz v2, :cond_7

    if-eq v2, v6, :cond_6

    if-eq v2, v5, :cond_5

    invoke-interface {p2}, Ld/a/c/a/i$d;->notImplemented()V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->a(Lio/flutter/embedding/engine/j/c;)Lio/flutter/embedding/engine/g/a;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/g/a;->d(ILjava/lang/String;)Z

    const/4 p1, 0x0

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->a(Lio/flutter/embedding/engine/j/c;)Lio/flutter/embedding/engine/g/a;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/g/a;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-interface {p2, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->a(Lio/flutter/embedding/engine/j/c;)Lio/flutter/embedding/engine/g/a;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lio/flutter/embedding/engine/g/a;->c(ILjava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->b(Lio/flutter/embedding/engine/j/c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->b(Lio/flutter/embedding/engine/j/c;)Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v0, p0, Lio/flutter/embedding/engine/j/c$a;->b:Lio/flutter/embedding/engine/j/c;

    invoke-static {v0}, Lio/flutter/embedding/engine/j/c;->b(Lio/flutter/embedding/engine/j/c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    return-void
.end method
