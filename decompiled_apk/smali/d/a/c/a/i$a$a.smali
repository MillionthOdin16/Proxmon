.class Ld/a/c/a/i$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a/c/a/i$a;->a(Ljava/nio/ByteBuffer;Ld/a/c/a/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld/a/c/a/b$b;

.field final synthetic b:Ld/a/c/a/i$a;


# direct methods
.method constructor <init>(Ld/a/c/a/i$a;Ld/a/c/a/b$b;)V
    .locals 0

    iput-object p1, p0, Ld/a/c/a/i$a$a;->b:Ld/a/c/a/i$a;

    iput-object p2, p0, Ld/a/c/a/i$a$a;->a:Ld/a/c/a/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ld/a/c/a/i$a$a;->a:Ld/a/c/a/b$b;

    iget-object v1, p0, Ld/a/c/a/i$a$a;->b:Ld/a/c/a/i$a;

    iget-object v1, v1, Ld/a/c/a/i$a;->b:Ld/a/c/a/i;

    invoke-static {v1}, Ld/a/c/a/i;->a(Ld/a/c/a/i;)Ld/a/c/a/j;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Ld/a/c/a/j;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Ld/a/c/a/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public notImplemented()V
    .locals 2

    iget-object v0, p0, Ld/a/c/a/i$a$a;->a:Ld/a/c/a/b$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ld/a/c/a/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ld/a/c/a/i$a$a;->a:Ld/a/c/a/b$b;

    iget-object v1, p0, Ld/a/c/a/i$a$a;->b:Ld/a/c/a/i$a;

    iget-object v1, v1, Ld/a/c/a/i$a;->b:Ld/a/c/a/i;

    invoke-static {v1}, Ld/a/c/a/i;->a(Ld/a/c/a/i;)Ld/a/c/a/j;

    move-result-object v1

    invoke-interface {v1, p1}, Ld/a/c/a/j;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Ld/a/c/a/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
