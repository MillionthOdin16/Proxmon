.class public final Le/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/g0$a;
    }
.end annotation


# instance fields
.field final b:Le/e0;

.field final c:Le/c0;

.field final d:I

.field final e:Ljava/lang/String;

.field final f:Le/w;

.field final g:Le/x;

.field final h:Le/h0;

.field final i:Le/g0;

.field final j:Le/g0;

.field final k:Le/g0;

.field final l:J

.field final m:J

.field final n:Le/k0/h/d;

.field private volatile o:Le/i;


# direct methods
.method constructor <init>(Le/g0$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Le/g0$a;->a:Le/e0;

    iput-object v0, p0, Le/g0;->b:Le/e0;

    iget-object v0, p1, Le/g0$a;->b:Le/c0;

    iput-object v0, p0, Le/g0;->c:Le/c0;

    iget v0, p1, Le/g0$a;->c:I

    iput v0, p0, Le/g0;->d:I

    iget-object v0, p1, Le/g0$a;->d:Ljava/lang/String;

    iput-object v0, p0, Le/g0;->e:Ljava/lang/String;

    iget-object v0, p1, Le/g0$a;->e:Le/w;

    iput-object v0, p0, Le/g0;->f:Le/w;

    iget-object v0, p1, Le/g0$a;->f:Le/x$a;

    invoke-virtual {v0}, Le/x$a;->d()Le/x;

    move-result-object v0

    iput-object v0, p0, Le/g0;->g:Le/x;

    iget-object v0, p1, Le/g0$a;->g:Le/h0;

    iput-object v0, p0, Le/g0;->h:Le/h0;

    iget-object v0, p1, Le/g0$a;->h:Le/g0;

    iput-object v0, p0, Le/g0;->i:Le/g0;

    iget-object v0, p1, Le/g0$a;->i:Le/g0;

    iput-object v0, p0, Le/g0;->j:Le/g0;

    iget-object v0, p1, Le/g0$a;->j:Le/g0;

    iput-object v0, p0, Le/g0;->k:Le/g0;

    iget-wide v0, p1, Le/g0$a;->k:J

    iput-wide v0, p0, Le/g0;->l:J

    iget-wide v0, p1, Le/g0$a;->l:J

    iput-wide v0, p0, Le/g0;->m:J

    iget-object p1, p1, Le/g0$a;->m:Le/k0/h/d;

    iput-object p1, p0, Le/g0;->n:Le/k0/h/d;

    return-void
.end method


# virtual methods
.method public A()Le/i;
    .locals 1

    iget-object v0, p0, Le/g0;->o:Le/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/g0;->g:Le/x;

    invoke-static {v0}, Le/i;->k(Le/x;)Le/i;

    move-result-object v0

    iput-object v0, p0, Le/g0;->o:Le/i;

    :goto_0
    return-object v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, Le/g0;->d:I

    return v0
.end method

.method public C()Le/w;
    .locals 1

    iget-object v0, p0, Le/g0;->f:Le/w;

    return-object v0
.end method

.method public D(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Le/g0;->E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public E(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/g0;->g:Le/x;

    invoke-virtual {v0, p1}, Le/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method

.method public F()Le/x;
    .locals 1

    iget-object v0, p0, Le/g0;->g:Le/x;

    return-object v0
.end method

.method public G()Le/g0$a;
    .locals 1

    new-instance v0, Le/g0$a;

    invoke-direct {v0, p0}, Le/g0$a;-><init>(Le/g0;)V

    return-object v0
.end method

.method public H()Le/g0;
    .locals 1

    iget-object v0, p0, Le/g0;->k:Le/g0;

    return-object v0
.end method

.method public I()J
    .locals 2

    iget-wide v0, p0, Le/g0;->m:J

    return-wide v0
.end method

.method public J()Le/e0;
    .locals 1

    iget-object v0, p0, Le/g0;->b:Le/e0;

    return-object v0
.end method

.method public K()J
    .locals 2

    iget-wide v0, p0, Le/g0;->l:J

    return-wide v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Le/g0;->h:Le/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/h0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r()Le/h0;
    .locals 1

    iget-object v0, p0, Le/g0;->h:Le/h0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/g0;->c:Le/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/g0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/g0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/g0;->b:Le/e0;

    invoke-virtual {v1}, Le/e0;->h()Le/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
