.class Lc/c/a/a$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/c/a/a$a;->success(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lc/c/a/a$a;


# direct methods
.method constructor <init>(Lc/c/a/a$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lc/c/a/a$a$a;->c:Lc/c/a/a$a;

    iput-object p2, p0, Lc/c/a/a$a$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lc/c/a/a$a$a;->c:Lc/c/a/a$a;

    invoke-static {v0}, Lc/c/a/a$a;->a(Lc/c/a/a$a;)Ld/a/c/a/i$d;

    move-result-object v0

    iget-object v1, p0, Lc/c/a/a$a$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method
