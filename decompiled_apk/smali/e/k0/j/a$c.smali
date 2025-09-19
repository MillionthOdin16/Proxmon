.class final Le/k0/j/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final b:Lf/i;

.field private c:Z

.field final synthetic d:Le/k0/j/a;


# direct methods
.method constructor <init>(Le/k0/j/a;)V
    .locals 1

    iput-object p1, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf/i;

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0}, Lf/s;->b()Lf/u;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/i;-><init>(Lf/u;)V

    iput-object p1, p0, Le/k0/j/a$c;->b:Lf/i;

    return-void
.end method


# virtual methods
.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/j/a$c;->b:Lf/i;

    return-object v0
.end method

.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/j/a$c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Le/k0/j/a$c;->c:Z

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    iget-object v1, p0, Le/k0/j/a$c;->b:Lf/i;

    invoke-static {v0, v1}, Le/k0/j/a;->k(Le/k0/j/a;Lf/i;)V

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Le/k0/j/a;->m(Le/k0/j/a;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e(Lf/c;J)V
    .locals 3

    iget-boolean v0, p0, Le/k0/j/a$c;->c:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lf/d;->h(J)Lf/d;

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lf/s;->e(Lf/c;J)V

    iget-object p1, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {p1}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object p1

    invoke-interface {p1, v1}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/j/a$c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Le/k0/j/a$c;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0}, Lf/d;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
