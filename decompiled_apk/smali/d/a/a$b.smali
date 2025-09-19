.class public final Ld/a/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lio/flutter/embedding/engine/h/c;

.field private b:Lio/flutter/embedding/engine/g/a;

.field private c:Lio/flutter/embedding/engine/FlutterJNI$c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Ld/a/a$b;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/embedding/engine/FlutterJNI$c;

    invoke-direct {v0}, Lio/flutter/embedding/engine/FlutterJNI$c;-><init>()V

    iput-object v0, p0, Ld/a/a$b;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    :cond_0
    iget-object v0, p0, Ld/a/a$b;->a:Lio/flutter/embedding/engine/h/c;

    if-nez v0, :cond_1

    new-instance v0, Lio/flutter/embedding/engine/h/c;

    iget-object v1, p0, Ld/a/a$b;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/flutter/embedding/engine/h/c;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v0, p0, Ld/a/a$b;->a:Lio/flutter/embedding/engine/h/c;

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Ld/a/a;
    .locals 5

    invoke-direct {p0}, Ld/a/a$b;->b()V

    new-instance v0, Ld/a/a;

    iget-object v1, p0, Ld/a/a$b;->a:Lio/flutter/embedding/engine/h/c;

    iget-object v2, p0, Ld/a/a$b;->b:Lio/flutter/embedding/engine/g/a;

    iget-object v3, p0, Ld/a/a$b;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ld/a/a;-><init>(Lio/flutter/embedding/engine/h/c;Lio/flutter/embedding/engine/g/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ld/a/a$a;)V

    return-object v0
.end method
