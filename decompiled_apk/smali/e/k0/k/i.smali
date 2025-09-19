.class public final Le/k0/k/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/k0/k/i$c;,
        Le/k0/k/i$a;,
        Le/k0/k/i$b;
    }
.end annotation


# instance fields
.field a:J

.field b:J

.field final c:I

.field final d:Le/k0/k/f;

.field private final e:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Le/x;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private final g:Le/k0/k/i$b;

.field final h:Le/k0/k/i$a;

.field final i:Le/k0/k/i$c;

.field final j:Le/k0/k/i$c;

.field k:Le/k0/k/b;

.field l:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(ILe/k0/k/f;ZZLe/x;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Le/k0/k/i;->a:J

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    new-instance v0, Le/k0/k/i$c;

    invoke-direct {v0, p0}, Le/k0/k/i$c;-><init>(Le/k0/k/i;)V

    iput-object v0, p0, Le/k0/k/i;->i:Le/k0/k/i$c;

    new-instance v0, Le/k0/k/i$c;

    invoke-direct {v0, p0}, Le/k0/k/i$c;-><init>(Le/k0/k/i;)V

    iput-object v0, p0, Le/k0/k/i;->j:Le/k0/k/i$c;

    if-eqz p2, :cond_5

    iput p1, p0, Le/k0/k/i;->c:I

    iput-object p2, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget-object p1, p2, Le/k0/k/f;->u:Le/k0/k/m;

    invoke-virtual {p1}, Le/k0/k/m;->d()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Le/k0/k/i;->b:J

    new-instance p1, Le/k0/k/i$b;

    iget-object p2, p2, Le/k0/k/f;->t:Le/k0/k/m;

    invoke-virtual {p2}, Le/k0/k/m;->d()I

    move-result p2

    int-to-long v0, p2

    invoke-direct {p1, p0, v0, v1}, Le/k0/k/i$b;-><init>(Le/k0/k/i;J)V

    iput-object p1, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    new-instance p1, Le/k0/k/i$a;

    invoke-direct {p1, p0}, Le/k0/k/i$a;-><init>(Le/k0/k/i;)V

    iput-object p1, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-object p2, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iput-boolean p4, p2, Le/k0/k/i$b;->g:Z

    iput-boolean p3, p1, Le/k0/k/i$a;->e:Z

    if-eqz p5, :cond_0

    iget-object p1, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    invoke-interface {p1, p5}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Le/k0/k/i;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    if-nez p5, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Le/k0/k/i;->j()Z

    move-result p1

    if-nez p1, :cond_4

    if-eqz p5, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "connection == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e(Le/k0/k/b;Ljava/io/IOException;)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/i;->k:Le/k0/k/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iget-boolean v0, v0, Le/k0/k/i$b;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->e:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    iput-object p1, p0, Le/k0/k/i;->k:Le/k0/k/b;

    iput-object p2, p0, Le/k0/k/i;->l:Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget p2, p0, Le/k0/k/i;->c:I

    invoke-virtual {p1, p2}, Le/k0/k/f;->X(I)Le/k0/k/i;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method a(J)V
    .locals 3

    iget-wide v0, p0, Le/k0/k/i;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Le/k0/k/i;->b:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_0
    return-void
.end method

.method b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iget-boolean v0, v0, Le/k0/k/i$b;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iget-boolean v0, v0, Le/k0/k/i$b;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->d:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Le/k0/k/i;->k()Z

    move-result v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    sget-object v0, Le/k0/k/b;->h:Le/k0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Le/k0/k/i;->d(Le/k0/k/b;Ljava/io/IOException;)V

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    iget-object v0, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget v1, p0, Le/k0/k/i;->c:I

    invoke-virtual {v0, v1}, Le/k0/k/f;->X(I)Le/k0/k/i;

    :cond_3
    :goto_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method c()V
    .locals 2

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v1, v0, Le/k0/k/i$a;->d:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Le/k0/k/i$a;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Le/k0/k/i;->k:Le/k0/k/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->l:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Le/k0/k/n;

    iget-object v1, p0, Le/k0/k/i;->k:Le/k0/k/b;

    invoke-direct {v0, v1}, Le/k0/k/n;-><init>(Le/k0/k/b;)V

    :goto_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Le/k0/k/b;Ljava/io/IOException;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Le/k0/k/i;->e(Le/k0/k/b;Ljava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget v0, p0, Le/k0/k/i;->c:I

    invoke-virtual {p2, v0, p1}, Le/k0/k/f;->g0(ILe/k0/k/b;)V

    return-void
.end method

.method public f(Le/k0/k/b;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/k0/k/i;->e(Le/k0/k/b;Ljava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget v1, p0, Le/k0/k/i;->c:I

    invoke-virtual {v0, v1, p1}, Le/k0/k/f;->h0(ILe/k0/k/b;)V

    return-void
.end method

.method public g()I
    .locals 1

    iget v0, p0, Le/k0/k/i;->c:I

    return v0
.end method

.method public h()Lf/s;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/k/i;->f:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Le/k0/k/i;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reply before requesting the sink"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public i()Lf/t;
    .locals 1

    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    return-object v0
.end method

.method public j()Z
    .locals 4

    iget v0, p0, Le/k0/k/i;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget-boolean v3, v3, Le/k0/k/f;->b:Z

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public declared-synchronized k()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/i;->k:Le/k0/k/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iget-boolean v0, v0, Le/k0/k/i$b;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iget-boolean v0, v0, Le/k0/k/i$b;->f:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->d:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Le/k0/k/i;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public l()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/k/i;->i:Le/k0/k/i$c;

    return-object v0
.end method

.method m(Lf/e;I)V
    .locals 3

    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Le/k0/k/i$b;->A(Lf/e;J)V

    return-void
.end method

.method n(Le/x;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/k/i;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    invoke-static {v0, p1}, Le/k0/k/i$b;->r(Le/k0/k/i$b;Le/x;)Le/x;

    goto :goto_1

    :cond_1
    :goto_0
    iput-boolean v1, p0, Le/k0/k/i;->f:Z

    iget-object v0, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Le/k0/k/i;->g:Le/k0/k/i$b;

    iput-boolean v1, p1, Le/k0/k/i$b;->g:Z

    :cond_2
    invoke-virtual {p0}, Le/k0/k/i;->k()Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    iget-object p1, p0, Le/k0/k/i;->d:Le/k0/k/f;

    iget p2, p0, Le/k0/k/i;->c:I

    invoke-virtual {p1, p2}, Le/k0/k/f;->X(I)Le/k0/k/i;

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method declared-synchronized o(Le/k0/k/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/i;->k:Le/k0/k/b;

    if-nez v0, :cond_0

    iput-object p1, p0, Le/k0/k/i;->k:Le/k0/k/b;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized p()Le/x;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {v0}, Lf/a;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/k0/k/i;->k:Le/k0/k/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Le/k0/k/i;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v0, p0, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {v0}, Le/k0/k/i$c;->u()V

    iget-object v0, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le/k0/k/i;->e:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/x;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    :cond_1
    :try_start_3
    iget-object v0, p0, Le/k0/k/i;->l:Ljava/io/IOException;

    if-eqz v0, :cond_2

    iget-object v0, p0, Le/k0/k/i;->l:Ljava/io/IOException;

    goto :goto_1

    :cond_2
    new-instance v0, Le/k0/k/n;

    iget-object v1, p0, Le/k0/k/i;->k:Le/k0/k/b;

    invoke-direct {v0, v1}, Le/k0/k/n;-><init>(Le/k0/k/b;)V

    :goto_1
    throw v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {v1}, Le/k0/k/i$c;->u()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method q()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method public r()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/k/i;->j:Le/k0/k/i$c;

    return-object v0
.end method
