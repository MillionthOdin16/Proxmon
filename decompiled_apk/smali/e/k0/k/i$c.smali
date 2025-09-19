.class Le/k0/k/i$c;
.super Lf/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic k:Le/k0/k/i;


# direct methods
.method constructor <init>(Le/k0/k/i;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/i$c;->k:Le/k0/k/i;

    invoke-direct {p0}, Lf/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected o(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method protected t()V
    .locals 2

    iget-object v0, p0, Le/k0/k/i$c;->k:Le/k0/k/i;

    sget-object v1, Le/k0/k/b;->h:Le/k0/k/b;

    invoke-virtual {v0, v1}, Le/k0/k/i;->f(Le/k0/k/b;)V

    iget-object v0, p0, Le/k0/k/i$c;->k:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->d:Le/k0/k/f;

    invoke-virtual {v0}, Le/k0/k/f;->Y()V

    return-void
.end method

.method public u()V
    .locals 1

    invoke-virtual {p0}, Lf/a;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le/k0/k/i$c;->o(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
