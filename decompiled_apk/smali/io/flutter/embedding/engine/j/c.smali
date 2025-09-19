.class public Lio/flutter/embedding/engine/j/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ld/a/c/a/i;

.field private b:Lio/flutter/embedding/engine/g/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ld/a/c/a/i$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Ld/a/c/a/i$c;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/f/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/flutter/embedding/engine/j/c$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/j/c$a;-><init>(Lio/flutter/embedding/engine/j/c;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/j/c;->d:Ld/a/c/a/i$c;

    new-instance v0, Ld/a/c/a/i;

    sget-object v1, Ld/a/c/a/q;->b:Ld/a/c/a/q;

    const-string v2, "flutter/deferredcomponent"

    invoke-direct {v0, p1, v2, v1}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;Ld/a/c/a/j;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/j/c;->a:Ld/a/c/a/i;

    iget-object p1, p0, Lio/flutter/embedding/engine/j/c;->d:Ld/a/c/a/i$c;

    invoke-virtual {v0, p1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    invoke-static {}, Ld/a/a;->d()Ld/a/a;

    move-result-object p1

    invoke-virtual {p1}, Ld/a/a;->a()Lio/flutter/embedding/engine/g/a;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/embedding/engine/j/c;->b:Lio/flutter/embedding/engine/g/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/j/c;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lio/flutter/embedding/engine/j/c;)Lio/flutter/embedding/engine/g/a;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/j/c;->b:Lio/flutter/embedding/engine/g/a;

    return-object p0
.end method

.method static synthetic b(Lio/flutter/embedding/engine/j/c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/j/c;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lio/flutter/embedding/engine/g/a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/j/c;->b:Lio/flutter/embedding/engine/g/a;

    return-void
.end method
