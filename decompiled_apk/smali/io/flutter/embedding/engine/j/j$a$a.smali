.class Lio/flutter/embedding/engine/j/j$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/embedding/engine/j/j$a;->d(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ld/a/c/a/i$d;


# direct methods
.method constructor <init>(Lio/flutter/embedding/engine/j/j$a;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p2, p0, Lio/flutter/embedding/engine/j/j$a$a;->b:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/j/j$a$a;->b:Ld/a/c/a/i$d;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method
