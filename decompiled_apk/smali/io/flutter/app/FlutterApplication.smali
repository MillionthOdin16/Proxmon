.class public Lio/flutter/app/FlutterApplication;
.super Landroid/app/Application;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-static {}, Ld/a/a;->d()Ld/a/a;

    move-result-object v0

    invoke-virtual {v0}, Ld/a/a;->b()Lio/flutter/embedding/engine/h/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/h/c;->i(Landroid/content/Context;)V

    return-void
.end method
