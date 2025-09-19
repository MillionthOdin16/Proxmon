.class final Lf/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/d;


# instance fields
.field public final b:Lf/c;

.field public final c:Lf/s;

.field d:Z


# direct methods
.method constructor <init>(Lf/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf/c;

    invoke-direct {v0}, Lf/c;-><init>()V

    iput-object v0, p0, Lf/n;->b:Lf/c;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lf/n;->c:Lf/s;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lf/c;
    .locals 1

    iget-object v0, p0, Lf/n;->b:Lf/c;

    return-object v0
.end method

.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Lf/n;->c:Lf/s;

    invoke-interface {v0}, Lf/s;->b()Lf/u;

    move-result-object v0

    return-object v0
.end method

.method public c([B)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->S([B)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 6

    iget-boolean v0, p0, Lf/n;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lf/n;->b:Lf/c;

    iget-wide v1, v1, Lf/c;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    iget-object v1, p0, Lf/n;->c:Lf/s;

    iget-object v2, p0, Lf/n;->b:Lf/c;

    iget-object v3, p0, Lf/n;->b:Lf/c;

    iget-wide v3, v3, Lf/c;->c:J

    invoke-interface {v1, v2, v3, v4}, Lf/s;->e(Lf/c;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception v1

    :goto_0
    :try_start_1
    iget-object v2, p0, Lf/n;->c:Lf/s;

    invoke-interface {v2}, Lf/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v2

    if-nez v1, :cond_2

    move-object v1, v2

    :cond_2
    :goto_1
    const/4 v2, 0x1

    iput-boolean v2, p0, Lf/n;->d:Z

    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-static {v1}, Lf/v;->e(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public d([BII)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1, p2, p3}, Lf/c;->T([BII)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lf/c;J)V
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1, p2, p3}, Lf/c;->e(Lf/c;J)V

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public flush()V
    .locals 6

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf/n;->b:Lf/c;

    iget-wide v1, v0, Lf/c;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    iget-object v3, p0, Lf/n;->c:Lf/s;

    invoke-interface {v3, v0, v1, v2}, Lf/s;->e(Lf/c;J)V

    :cond_0
    iget-object v0, p0, Lf/n;->c:Lf/s;

    invoke-interface {v0}, Lf/s;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lf/d;
    .locals 5

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0}, Lf/c;->C()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v2, p0, Lf/n;->c:Lf/s;

    iget-object v3, p0, Lf/n;->b:Lf/c;

    invoke-interface {v2, v3, v0, v1}, Lf/s;->e(Lf/c;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(J)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1, p2}, Lf/c;->W(J)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m(I)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->Y(I)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(I)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->X(I)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(Ljava/lang/String;)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->a0(Ljava/lang/String;)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf/n;->c:Lf/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(I)Lf/d;
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->V(I)Lf/c;

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    iget-boolean v0, p0, Lf/n;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf/n;->b:Lf/c;

    invoke-virtual {v0, p1}, Lf/c;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lf/n;->g()Lf/d;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
