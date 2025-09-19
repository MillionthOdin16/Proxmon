.class public Lio/flutter/embedding/engine/j/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/j/g$b;
    }
.end annotation


# instance fields
.field public final a:Ld/a/c/a/i;

.field private b:Lio/flutter/embedding/engine/j/g$b;

.field private final c:Ld/a/c/a/i$c;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/f/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/embedding/engine/j/g$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/j/g$a;-><init>(Lio/flutter/embedding/engine/j/g;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/j/g;->c:Ld/a/c/a/i$c;

    new-instance v0, Ld/a/c/a/i;

    sget-object v1, Ld/a/c/a/q;->b:Ld/a/c/a/q;

    const-string v2, "flutter/mousecursor"

    invoke-direct {v0, p1, v2, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;Ld/a/c/a/j;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/j/g;->a:Ld/a/c/a/i;

    iget-object p1, p0, Lio/flutter/embedding/engine/j/g;->c:Ld/a/c/a/i$c;

    invoke-virtual {v0, p1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/engine/j/g;)Lio/flutter/embedding/engine/j/g$b;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/j/g;->b:Lio/flutter/embedding/engine/j/g$b;

    return-object p0
.end method


# virtual methods
.method public b(Lio/flutter/embedding/engine/j/g$b;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/j/g;->b:Lio/flutter/embedding/engine/j/g$b;

    return-void
.end method
