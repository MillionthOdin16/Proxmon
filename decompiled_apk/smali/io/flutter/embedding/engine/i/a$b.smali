.class public Lio/flutter/embedding/engine/i/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/i/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ld/a/c/a/b;

.field private final c:Lio/flutter/plugin/platform/h;

.field private final d:Lio/flutter/embedding/engine/i/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/b;Ld/a/c/a/b;Lio/flutter/view/f;Lio/flutter/plugin/platform/h;Lio/flutter/embedding/engine/i/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/i/a$b;->a:Landroid/content/Context;

    iput-object p3, p0, Lio/flutter/embedding/engine/i/a$b;->b:Ld/a/c/a/b;

    iput-object p5, p0, Lio/flutter/embedding/engine/i/a$b;->c:Lio/flutter/plugin/platform/h;

    iput-object p6, p0, Lio/flutter/embedding/engine/i/a$b;->d:Lio/flutter/embedding/engine/i/a$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/i/a$b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b()Ld/a/c/a/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/i/a$b;->b:Ld/a/c/a/b;

    return-object v0
.end method

.method public c()Lio/flutter/embedding/engine/i/a$a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/i/a$b;->d:Lio/flutter/embedding/engine/i/a$a;

    return-object v0
.end method

.method public d()Lio/flutter/plugin/platform/h;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/i/a$b;->c:Lio/flutter/plugin/platform/h;

    return-object v0
.end method
