.class public final Le/k0/h/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/k0/h/k$b;
    }
.end annotation


# instance fields
.field private final a:Le/b0;

.field private final b:Le/k0/h/g;

.field private final c:Le/j;

.field private final d:Le/v;

.field private final e:Lf/a;

.field private f:Ljava/lang/Object;

.field private g:Le/e0;

.field private h:Le/k0/h/e;

.field public i:Le/k0/h/f;

.field private j:Le/k0/h/d;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le/b0;Le/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le/k0/h/k$a;

    invoke-direct {v0, p0}, Le/k0/h/k$a;-><init>(Le/k0/h/k;)V

    iput-object v0, p0, Le/k0/h/k;->e:Lf/a;

    iput-object p1, p0, Le/k0/h/k;->a:Le/b0;

    sget-object v0, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {p1}, Le/b0;->e()Le/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/k0/c;->h(Le/o;)Le/k0/h/g;

    move-result-object v0

    iput-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    iput-object p2, p0, Le/k0/h/k;->c:Le/j;

    invoke-virtual {p1}, Le/b0;->j()Le/v$b;

    move-result-object v0

    invoke-interface {v0, p2}, Le/v$b;->a(Le/j;)Le/v;

    move-result-object p2

    iput-object p2, p0, Le/k0/h/k;->d:Le/v;

    iget-object p2, p0, Le/k0/h/k;->e:Lf/a;

    invoke-virtual {p1}, Le/b0;->b()I

    move-result p1

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    return-void
.end method

.method private e(Le/y;)Le/e;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Le/y;->m()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v1}, Le/b0;->C()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    iget-object v1, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v1}, Le/b0;->m()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v3, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v3}, Le/b0;->c()Le/l;

    move-result-object v3

    move-object v10, v1

    move-object v9, v2

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    :goto_0
    new-instance v1, Le/e;

    invoke-virtual/range {p1 .. p1}, Le/y;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Le/y;->w()I

    move-result v6

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->i()Le/u;

    move-result-object v7

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->B()Ljavax/net/SocketFactory;

    move-result-object v8

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->x()Le/g;

    move-result-object v12

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->w()Ljava/net/Proxy;

    move-result-object v13

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->v()Ljava/util/List;

    move-result-object v14

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->f()Ljava/util/List;

    move-result-object v15

    iget-object v2, v0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v2}, Le/b0;->y()Ljava/net/ProxySelector;

    move-result-object v16

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Le/e;-><init>(Ljava/lang/String;ILe/u;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le/l;Le/g;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v1
.end method

.method private j(Ljava/io/IOException;Z)Ljava/io/IOException;
    .locals 5

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    if-eqz p2, :cond_1

    :try_start_0
    iget-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot release connection while it is in use"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v2, p0, Le/k0/h/k;->i:Le/k0/h/f;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-nez v2, :cond_3

    if-nez p2, :cond_2

    iget-boolean p2, p0, Le/k0/h/k;->o:Z

    if-eqz p2, :cond_3

    :cond_2
    invoke-virtual {p0}, Le/k0/h/k;->n()Ljava/net/Socket;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v3

    :goto_1
    iget-object v2, p0, Le/k0/h/k;->i:Le/k0/h/f;

    if-eqz v2, :cond_4

    move-object v1, v3

    :cond_4
    iget-boolean v2, p0, Le/k0/h/k;->o:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-object v2, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-nez v2, :cond_5

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, Le/k0/e;->f(Ljava/net/Socket;)V

    if-eqz v1, :cond_6

    iget-object p2, p0, Le/k0/h/k;->d:Le/v;

    iget-object v0, p0, Le/k0/h/k;->c:Le/j;

    invoke-virtual {p2, v0, v1}, Le/v;->h(Le/j;Le/n;)V

    :cond_6
    if-eqz v2, :cond_9

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    invoke-direct {p0, p1}, Le/k0/h/k;->q(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    iget-object p2, p0, Le/k0/h/k;->d:Le/v;

    iget-object v0, p0, Le/k0/h/k;->c:Le/j;

    if-eqz v3, :cond_8

    invoke-virtual {p2, v0, p1}, Le/v;->b(Le/j;Ljava/io/IOException;)V

    goto :goto_4

    :cond_8
    invoke-virtual {p2, v0}, Le/v;->a(Le/j;)V

    :cond_9
    :goto_4
    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private q(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget-boolean v0, p0, Le/k0/h/k;->n:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Le/k0/h/k;->e:Lf/a;

    invoke-virtual {v0}, Lf/a;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method


# virtual methods
.method a(Le/k0/h/f;)V
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->i:Le/k0/h/f;

    if-nez v0, :cond_0

    iput-object p1, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object p1, p1, Le/k0/h/f;->p:Ljava/util/List;

    new-instance v0, Le/k0/h/k$b;

    iget-object v1, p0, Le/k0/h/k;->f:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Le/k0/h/k$b;-><init>(Le/k0/h/k;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public b()V
    .locals 2

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Le/k0/l/f;->m(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Le/k0/h/k;->f:Ljava/lang/Object;

    iget-object v0, p0, Le/k0/h/k;->d:Le/v;

    iget-object v1, p0, Le/k0/h/k;->c:Le/j;

    invoke-virtual {v0, v1}, Le/v;->c(Le/j;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Le/k0/h/k;->h:Le/k0/h/e;

    invoke-virtual {v0}, Le/k0/h/e;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/k0/h/k;->h:Le/k0/h/e;

    invoke-virtual {v0}, Le/k0/h/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le/k0/h/k;->m:Z

    iget-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    iget-object v2, p0, Le/k0/h/k;->h:Le/k0/h/e;

    if-eqz v2, :cond_0

    iget-object v2, p0, Le/k0/h/k;->h:Le/k0/h/e;

    invoke-virtual {v2}, Le/k0/h/e;->a()Le/k0/h/f;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Le/k0/h/k;->h:Le/k0/h/e;

    invoke-virtual {v2}, Le/k0/h/e;->a()Le/k0/h/f;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, p0, Le/k0/h/k;->i:Le/k0/h/f;

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Le/k0/h/d;->b()V

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Le/k0/h/f;->c()V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/k0/h/k;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    monitor-exit v0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method g(Le/k0/h/d;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-eq p1, v1, :cond_0

    monitor-exit v0

    return-object p4

    :cond_0
    const/4 p1, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Le/k0/h/k;->k:Z

    xor-int/2addr p2, v1

    iput-boolean v1, p0, Le/k0/h/k;->k:Z

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p3, :cond_3

    iget-boolean p3, p0, Le/k0/h/k;->l:Z

    if-nez p3, :cond_2

    const/4 p2, 0x1

    :cond_2
    iput-boolean v1, p0, Le/k0/h/k;->l:Z

    :cond_3
    iget-boolean p3, p0, Le/k0/h/k;->k:Z

    if-eqz p3, :cond_4

    iget-boolean p3, p0, Le/k0/h/k;->l:Z

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    iget-object p2, p0, Le/k0/h/k;->j:Le/k0/h/d;

    invoke-virtual {p2}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object p2

    iget p3, p2, Le/k0/h/f;->m:I

    add-int/2addr p3, v1

    iput p3, p2, Le/k0/h/f;->m:I

    const/4 p2, 0x0

    iput-object p2, p0, Le/k0/h/k;->j:Le/k0/h/d;

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_5

    invoke-direct {p0, p4, p1}, Le/k0/h/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p4

    :cond_5
    return-object p4

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/k0/h/k;->m:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method k(Le/z$a;Z)Le/k0/h/d;
    .locals 8

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/k0/h/k;->o:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Le/k0/h/k;->h:Le/k0/h/e;

    iget-object v1, p0, Le/k0/h/k;->a:Le/b0;

    invoke-virtual {v0, v1, p1, p2}, Le/k0/h/e;->b(Le/b0;Le/z$a;Z)Le/k0/i/c;

    move-result-object v7

    new-instance p1, Le/k0/h/d;

    iget-object v4, p0, Le/k0/h/k;->c:Le/j;

    iget-object v5, p0, Le/k0/h/k;->d:Le/v;

    iget-object v6, p0, Le/k0/h/k;->h:Le/k0/h/e;

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Le/k0/h/d;-><init>(Le/k0/h/k;Le/j;Le/v;Le/k0/h/e;Le/k0/i/c;)V

    iget-object p2, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter p2

    :try_start_1
    iput-object p1, p0, Le/k0/h/k;->j:Le/k0/h/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, Le/k0/h/k;->k:Z

    iput-boolean v0, p0, Le/k0/h/k;->l:Z

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot make a new request because the previous response is still open: please call response.close()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget-object v0, p0, Le/k0/h/k;->b:Le/k0/h/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le/k0/h/k;->o:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/k0/h/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m(Le/e0;)V
    .locals 7

    iget-object v0, p0, Le/k0/h/k;->g:Le/e0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v0

    invoke-virtual {p1}, Le/e0;->h()Le/y;

    move-result-object v1

    invoke-static {v0, v1}, Le/k0/e;->C(Le/y;Le/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/k0/h/k;->h:Le/k0/h/e;

    invoke-virtual {v0}, Le/k0/h/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/h/k;->j:Le/k0/h/d;

    if-nez v0, :cond_1

    iget-object v0, p0, Le/k0/h/k;->h:Le/k0/h/e;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Le/k0/h/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    iput-object v1, p0, Le/k0/h/k;->h:Le/k0/h/e;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Le/k0/h/k;->g:Le/e0;

    new-instance v6, Le/k0/h/e;

    iget-object v2, p0, Le/k0/h/k;->b:Le/k0/h/g;

    invoke-virtual {p1}, Le/e0;->h()Le/y;

    move-result-object p1

    invoke-direct {p0, p1}, Le/k0/h/k;->e(Le/y;)Le/e;

    move-result-object v3

    iget-object v4, p0, Le/k0/h/k;->c:Le/j;

    iget-object v5, p0, Le/k0/h/k;->d:Le/v;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Le/k0/h/e;-><init>(Le/k0/h/k;Le/k0/h/g;Le/e;Le/j;Le/v;)V

    iput-object v6, p0, Le/k0/h/k;->h:Le/k0/h/e;

    return-void
.end method

.method n()Ljava/net/Socket;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v1, v1, Le/k0/h/f;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    iget-object v3, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v3, v3, Le/k0/h/f;->p:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_1
    if-eq v0, v2, :cond_3

    iget-object v1, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v2, v1, Le/k0/h/f;->p:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v2, v1, Le/k0/h/f;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v1, Le/k0/h/f;->q:J

    iget-object v2, p0, Le/k0/h/k;->b:Le/k0/h/g;

    invoke-virtual {v2, v1}, Le/k0/h/g;->c(Le/k0/h/f;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Le/k0/h/f;->s()Ljava/net/Socket;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public o()V
    .locals 1

    iget-boolean v0, p0, Le/k0/h/k;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/k0/h/k;->n:Z

    iget-object v0, p0, Le/k0/h/k;->e:Lf/a;

    invoke-virtual {v0}, Lf/a;->n()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Le/k0/h/k;->e:Lf/a;

    invoke-virtual {v0}, Lf/a;->k()V

    return-void
.end method
