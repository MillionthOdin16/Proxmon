.class Lc/c/a/a$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/c/a/a$a;->notImplemented()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lc/c/a/a$a;


# direct methods
.method constructor <init>(Lc/c/a/a$a;)V
    .locals 0

    iput-object p1, p0, Lc/c/a/a$a$c;->b:Lc/c/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lc/c/a/a$a$c;->b:Lc/c/a/a$a;

    invoke-static {v0}, Lc/c/a/a$a;->a(Lc/c/a/a$a;)Ld/a/c/a/i$d;

    move-result-object v0

    invoke-interface {v0}, Ld/a/c/a/i$d;->notImplemented()V

    return-void
.end method
