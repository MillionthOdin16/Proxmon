.class public Ld/a/c/a/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/c/a/i$a;,
        Ld/a/c/a/i$b;,
        Ld/a/c/a/i$d;,
        Ld/a/c/a/i$c;
    }
.end annotation


# instance fields
.field private final a:Ld/a/c/a/b;

.field private final b:Ljava/lang/String;

.field private final c:Ld/a/c/a/j;


# direct methods
.method public constructor <init>(Ld/a/c/a/b;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ld/a/c/a/q;->b:Ld/a/c/a/q;

    invoke-direct {p0, p1, p2, v0}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;Ld/a/c/a/j;)V

    return-void
.end method

.method public constructor <init>(Ld/a/c/a/b;Ljava/lang/String;Ld/a/c/a/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/a/c/a/i;->a:Ld/a/c/a/b;

    iput-object p2, p0, Ld/a/c/a/i;->b:Ljava/lang/String;

    iput-object p3, p0, Ld/a/c/a/i;->c:Ld/a/c/a/j;

    return-void
.end method

.method static synthetic a(Ld/a/c/a/i;)Ld/a/c/a/j;
    .locals 0

    iget-object p0, p0, Ld/a/c/a/i;->c:Ld/a/c/a/j;

    return-object p0
.end method

.method static synthetic b(Ld/a/c/a/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld/a/c/a/i;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Ld/a/c/a/i;->d(Ljava/lang/String;Ljava/lang/Object;Ld/a/c/a/i$d;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Ld/a/c/a/i$d;)V
    .locals 4

    iget-object v0, p0, Ld/a/c/a/i;->a:Ld/a/c/a/b;

    iget-object v1, p0, Ld/a/c/a/i;->b:Ljava/lang/String;

    iget-object v2, p0, Ld/a/c/a/i;->c:Ld/a/c/a/j;

    new-instance v3, Ld/a/c/a/h;

    invoke-direct {v3, p1, p2}, Ld/a/c/a/h;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ld/a/c/a/j;->e(Ld/a/c/a/h;)Ljava/nio/ByteBuffer;

    move-result-object p1

    if-nez p3, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Ld/a/c/a/i$b;

    invoke-direct {p2, p0, p3}, Ld/a/c/a/i$b;-><init>(Ld/a/c/a/i;Ld/a/c/a/i$d;)V

    :goto_0
    invoke-interface {v0, v1, p1, p2}, Ld/a/c/a/b;->a(Ljava/lang/String;Ljava/nio/ByteBuffer;Ld/a/c/a/b$b;)V

    return-void
.end method

.method public e(Ld/a/c/a/i$c;)V
    .locals 3

    iget-object v0, p0, Ld/a/c/a/i;->a:Ld/a/c/a/b;

    iget-object v1, p0, Ld/a/c/a/i;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v2, Ld/a/c/a/i$a;

    invoke-direct {v2, p0, p1}, Ld/a/c/a/i$a;-><init>(Ld/a/c/a/i;Ld/a/c/a/i$c;)V

    move-object p1, v2

    :goto_0
    invoke-interface {v0, v1, p1}, Ld/a/c/a/b;->c(Ljava/lang/String;Ld/a/c/a/b$a;)V

    return-void
.end method
