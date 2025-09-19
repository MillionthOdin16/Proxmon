.class public final Lio/flutter/plugins/urllauncher/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/i/a;
.implements Lio/flutter/embedding/engine/i/c/a;


# instance fields
.field private b:Lio/flutter/plugins/urllauncher/a;

.field private c:Lio/flutter/plugins/urllauncher/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->b:Lio/flutter/plugins/urllauncher/a;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->c:Lio/flutter/plugins/urllauncher/b;

    invoke-interface {p1}, Lio/flutter/embedding/engine/i/c/c;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/urllauncher/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 3

    new-instance v0, Lio/flutter/plugins/urllauncher/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/urllauncher/b;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    iput-object v0, p0, Lio/flutter/plugins/urllauncher/c;->c:Lio/flutter/plugins/urllauncher/b;

    new-instance v1, Lio/flutter/plugins/urllauncher/a;

    invoke-direct {v1, v0}, Lio/flutter/plugins/urllauncher/a;-><init>(Lio/flutter/plugins/urllauncher/b;)V

    iput-object v1, p0, Lio/flutter/plugins/urllauncher/c;->b:Lio/flutter/plugins/urllauncher/a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->b()Ld/a/c/a/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/flutter/plugins/urllauncher/a;->e(Ld/a/c/a/b;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->b:Lio/flutter/plugins/urllauncher/a;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/urllauncher/c;->c:Lio/flutter/plugins/urllauncher/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugins/urllauncher/b;->d(Landroid/app/Activity;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugins/urllauncher/c;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/urllauncher/c;->b:Lio/flutter/plugins/urllauncher/a;

    if-nez p1, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/flutter/plugins/urllauncher/a;->f()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/urllauncher/c;->b:Lio/flutter/plugins/urllauncher/a;

    iput-object p1, p0, Lio/flutter/plugins/urllauncher/c;->c:Lio/flutter/plugins/urllauncher/b;

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/i/c/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/urllauncher/c;->onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V

    return-void
.end method
