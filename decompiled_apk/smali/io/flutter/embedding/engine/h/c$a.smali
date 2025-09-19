.class Lio/flutter/embedding/engine/h/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/engine/h/c;->j(Landroid/content/Context;Lio/flutter/embedding/engine/h/c$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lio/flutter/embedding/engine/h/c$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lio/flutter/embedding/engine/h/c;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/h/c;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/h/c$a;->b:Lio/flutter/embedding/engine/h/c;

    iput-object p2, p0, Lio/flutter/embedding/engine/h/c$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/flutter/embedding/engine/h/c$b;
    .locals 5

    iget-object v0, p0, Lio/flutter/embedding/engine/h/c$a;->b:Lio/flutter/embedding/engine/h/c;

    iget-object v1, p0, Lio/flutter/embedding/engine/h/c$a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lio/flutter/embedding/engine/h/c;->a(Lio/flutter/embedding/engine/h/c;Landroid/content/Context;)Lio/flutter/embedding/engine/h/d;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/engine/h/c$a;->b:Lio/flutter/embedding/engine/h/c;

    invoke-static {v1}, Lio/flutter/embedding/engine/h/c;->b(Lio/flutter/embedding/engine/h/c;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lio/flutter/embedding/engine/h/c$a$a;

    invoke-direct {v2, p0}, Lio/flutter/embedding/engine/h/c$a$a;-><init>(Lio/flutter/embedding/engine/h/c$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/embedding/engine/h/c$b;

    iget-object v2, p0, Lio/flutter/embedding/engine/h/c$a;->a:Landroid/content/Context;

    invoke-static {v2}, Ld/a/d/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/flutter/embedding/engine/h/c$a;->a:Landroid/content/Context;

    invoke-static {v3}, Ld/a/d/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lio/flutter/embedding/engine/h/c$a;->a:Landroid/content/Context;

    invoke-static {v4}, Ld/a/d/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4, v1}, Lio/flutter/embedding/engine/h/c$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/embedding/engine/h/c$a;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lio/flutter/embedding/engine/h/d;->a()V

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/embedding/engine/h/c$a;->a()Lio/flutter/embedding/engine/h/c$b;

    move-result-object v0

    return-object v0
.end method
