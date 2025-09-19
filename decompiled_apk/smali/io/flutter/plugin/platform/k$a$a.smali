.class Lio/flutter/plugin/platform/k$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/k$a;->c(Lio/flutter/embedding/engine/j/j$c;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lio/flutter/plugin/platform/l;

.field final synthetic c:Ljava/lang/Runnable;

.field final synthetic d:Lio/flutter/plugin/platform/k$a;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/k$a;Lio/flutter/plugin/platform/l;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/k$a$a;->d:Lio/flutter/plugin/platform/k$a;

    iput-object p2, p0, Lio/flutter/plugin/platform/k$a$a;->b:Lio/flutter/plugin/platform/l;

    iput-object p3, p0, Lio/flutter/plugin/platform/k$a$a;->c:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/k$a$a;->d:Lio/flutter/plugin/platform/k$a;

    iget-object v0, v0, Lio/flutter/plugin/platform/k$a;->a:Lio/flutter/plugin/platform/k;

    iget-object v1, p0, Lio/flutter/plugin/platform/k$a$a;->b:Lio/flutter/plugin/platform/l;

    invoke-static {v0, v1}, Lio/flutter/plugin/platform/k;->j(Lio/flutter/plugin/platform/k;Lio/flutter/plugin/platform/l;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/k$a$a;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
