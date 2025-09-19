.class final Le/k0/h/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Le/k0/h/k;

.field private final b:Le/e;

.field private final c:Le/k0/h/g;

.field private final d:Le/j;

.field private final e:Le/v;

.field private f:Le/k0/h/j$a;

.field private final g:Le/k0/h/j;

.field private h:Le/k0/h/f;

.field private i:Z

.field private j:Le/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Le/k0/h/k;Le/k0/h/g;Le/e;Le/j;Le/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/h/e;->a:Le/k0/h/k;

    iput-object p2, p0, Le/k0/h/e;->c:Le/k0/h/g;

    iput-object p3, p0, Le/k0/h/e;->b:Le/e;

    iput-object p4, p0, Le/k0/h/e;->d:Le/j;

    iput-object p5, p0, Le/k0/h/e;->e:Le/v;

    new-instance p1, Le/k0/h/j;

    iget-object p2, p2, Le/k0/h/g;->e:Le/k0/h/h;

    invoke-direct {p1, p3, p2, p4, p5}, Le/k0/h/j;-><init>(Le/e;Le/k0/h/h;Le/j;Le/v;)V

    iput-object p1, p0, Le/k0/h/e;->g:Le/k0/h/j;

    return-void
.end method

.method private c(IIIIZ)Le/k0/h/f;
    .locals 18

    move-object/from16 v1, p0

    iget-object v2, v1, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v0}, Le/k0/h/k;->i()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    iput-boolean v0, v1, Le/k0/h/e;->i:Z

    iget-object v3, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v3, v3, Le/k0/h/k;->i:Le/k0/h/f;

    iget-object v4, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v4, v4, Le/k0/h/k;->i:Le/k0/h/f;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    iget-object v4, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v4, v4, Le/k0/h/k;->i:Le/k0/h/f;

    iget-boolean v4, v4, Le/k0/h/f;->k:Z

    if-eqz v4, :cond_0

    iget-object v4, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v4}, Le/k0/h/k;->n()Ljava/net/Socket;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    iget-object v6, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v6, v6, Le/k0/h/k;->i:Le/k0/h/f;

    if-eqz v6, :cond_1

    iget-object v3, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v3, v3, Le/k0/h/k;->i:Le/k0/h/f;

    move-object v6, v5

    goto :goto_1

    :cond_1
    move-object v6, v3

    move-object v3, v5

    :goto_1
    const/4 v7, 0x1

    if-nez v3, :cond_4

    iget-object v8, v1, Le/k0/h/e;->c:Le/k0/h/g;

    iget-object v9, v1, Le/k0/h/e;->b:Le/e;

    iget-object v10, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v8, v9, v10, v5, v0}, Le/k0/h/g;->g(Le/e;Le/k0/h/k;Ljava/util/List;Z)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v3, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v3, v3, Le/k0/h/k;->i:Le/k0/h/f;

    move-object v8, v5

    const/4 v9, 0x1

    goto :goto_3

    :cond_2
    iget-object v8, v1, Le/k0/h/e;->j:Le/i0;

    if-eqz v8, :cond_3

    iget-object v8, v1, Le/k0/h/e;->j:Le/i0;

    iput-object v5, v1, Le/k0/h/e;->j:Le/i0;

    goto :goto_2

    :cond_3
    invoke-direct/range {p0 .. p0}, Le/k0/h/e;->g()Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v8, v8, Le/k0/h/k;->i:Le/k0/h/f;

    invoke-virtual {v8}, Le/k0/h/f;->q()Le/i0;

    move-result-object v8

    goto :goto_2

    :cond_4
    move-object v8, v5

    :goto_2
    const/4 v9, 0x0

    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-static {v4}, Le/k0/e;->f(Ljava/net/Socket;)V

    if-eqz v6, :cond_5

    iget-object v2, v1, Le/k0/h/e;->e:Le/v;

    iget-object v4, v1, Le/k0/h/e;->d:Le/j;

    invoke-virtual {v2, v4, v6}, Le/v;->h(Le/j;Le/n;)V

    :cond_5
    if-eqz v9, :cond_6

    iget-object v2, v1, Le/k0/h/e;->e:Le/v;

    iget-object v4, v1, Le/k0/h/e;->d:Le/j;

    invoke-virtual {v2, v4, v3}, Le/v;->g(Le/j;Le/n;)V

    :cond_6
    if-eqz v3, :cond_7

    return-object v3

    :cond_7
    if-nez v8, :cond_9

    iget-object v2, v1, Le/k0/h/e;->f:Le/k0/h/j$a;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Le/k0/h/j$a;->b()Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    iget-object v2, v1, Le/k0/h/e;->g:Le/k0/h/j;

    invoke-virtual {v2}, Le/k0/h/j;->d()Le/k0/h/j$a;

    move-result-object v2

    iput-object v2, v1, Le/k0/h/e;->f:Le/k0/h/j$a;

    const/4 v2, 0x1

    goto :goto_4

    :cond_9
    const/4 v2, 0x0

    :goto_4
    iget-object v4, v1, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v4

    :try_start_1
    iget-object v6, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v6}, Le/k0/h/k;->i()Z

    move-result v6

    if-nez v6, :cond_10

    if-eqz v2, :cond_a

    iget-object v2, v1, Le/k0/h/e;->f:Le/k0/h/j$a;

    invoke-virtual {v2}, Le/k0/h/j$a;->a()Ljava/util/List;

    move-result-object v2

    iget-object v6, v1, Le/k0/h/e;->c:Le/k0/h/g;

    iget-object v10, v1, Le/k0/h/e;->b:Le/e;

    iget-object v11, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v6, v10, v11, v2, v0}, Le/k0/h/g;->g(Le/e;Le/k0/h/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v3, v0, Le/k0/h/k;->i:Le/k0/h/f;

    const/4 v9, 0x1

    goto :goto_5

    :cond_a
    move-object v2, v5

    :cond_b
    :goto_5
    if-nez v9, :cond_d

    if-nez v8, :cond_c

    iget-object v0, v1, Le/k0/h/e;->f:Le/k0/h/j$a;

    invoke-virtual {v0}, Le/k0/h/j$a;->c()Le/i0;

    move-result-object v8

    :cond_c
    new-instance v3, Le/k0/h/f;

    iget-object v0, v1, Le/k0/h/e;->c:Le/k0/h/g;

    invoke-direct {v3, v0, v8}, Le/k0/h/f;-><init>(Le/k0/h/g;Le/i0;)V

    iput-object v3, v1, Le/k0/h/e;->h:Le/k0/h/f;

    :cond_d
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v9, :cond_e

    :goto_6
    iget-object v0, v1, Le/k0/h/e;->e:Le/v;

    iget-object v2, v1, Le/k0/h/e;->d:Le/j;

    invoke-virtual {v0, v2, v3}, Le/v;->g(Le/j;Le/n;)V

    return-object v3

    :cond_e
    iget-object v0, v1, Le/k0/h/e;->d:Le/j;

    iget-object v4, v1, Le/k0/h/e;->e:Le/v;

    move-object v10, v3

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p5

    move-object/from16 v16, v0

    move-object/from16 v17, v4

    invoke-virtual/range {v10 .. v17}, Le/k0/h/f;->d(IIIIZLe/j;Le/v;)V

    iget-object v0, v1, Le/k0/h/e;->c:Le/k0/h/g;

    iget-object v0, v0, Le/k0/h/g;->e:Le/k0/h/h;

    invoke-virtual {v3}, Le/k0/h/f;->q()Le/i0;

    move-result-object v4

    invoke-virtual {v0, v4}, Le/k0/h/h;->a(Le/i0;)V

    iget-object v6, v1, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v6

    :try_start_2
    iput-object v5, v1, Le/k0/h/e;->h:Le/k0/h/f;

    iget-object v0, v1, Le/k0/h/e;->c:Le/k0/h/g;

    iget-object v4, v1, Le/k0/h/e;->b:Le/e;

    iget-object v9, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v0, v4, v9, v2, v7}, Le/k0/h/g;->g(Le/e;Le/k0/h/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    iput-boolean v7, v3, Le/k0/h/f;->k:Z

    invoke-virtual {v3}, Le/k0/h/f;->s()Ljava/net/Socket;

    move-result-object v5

    iget-object v0, v1, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v3, v0, Le/k0/h/k;->i:Le/k0/h/f;

    iput-object v8, v1, Le/k0/h/e;->j:Le/i0;

    goto :goto_7

    :cond_f
    iget-object v0, v1, Le/k0/h/e;->c:Le/k0/h/g;

    invoke-virtual {v0, v3}, Le/k0/h/g;->f(Le/k0/h/f;)V

    iget-object v0, v1, Le/k0/h/e;->a:Le/k0/h/k;

    invoke-virtual {v0, v3}, Le/k0/h/k;->a(Le/k0/h/f;)V

    :goto_7
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v5}, Le/k0/e;->f(Ljava/net/Socket;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_10
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_11
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_9

    :goto_8
    throw v0

    :goto_9
    goto :goto_8
.end method

.method private d(IIIIZZ)Le/k0/h/f;
    .locals 3

    :goto_0
    invoke-direct/range {p0 .. p5}, Le/k0/h/e;->c(IIIIZ)Le/k0/h/f;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v1

    :try_start_0
    iget v2, v0, Le/k0/h/f;->m:I

    if-nez v2, :cond_0

    invoke-virtual {v0}, Le/k0/h/f;->n()Z

    move-result v2

    if-nez v2, :cond_0

    monitor-exit v1

    return-object v0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p6}, Le/k0/h/f;->m(Z)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Le/k0/h/f;->p()V

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private g()Z
    .locals 2

    iget-object v0, p0, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v0, v0, Le/k0/h/k;->i:Le/k0/h/f;

    if-eqz v0, :cond_0

    iget v1, v0, Le/k0/h/f;->l:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Le/k0/h/f;->q()Le/i0;

    move-result-object v0

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/e;->b:Le/e;

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-static {v0, v1}, Le/k0/e;->C(Le/y;Le/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method a()Le/k0/h/f;
    .locals 1

    iget-object v0, p0, Le/k0/h/e;->h:Le/k0/h/f;

    return-object v0
.end method

.method public b(Le/b0;Le/z$a;Z)Le/k0/i/c;
    .locals 7

    invoke-interface {p2}, Le/z$a;->d()I

    move-result v1

    invoke-interface {p2}, Le/z$a;->e()I

    move-result v2

    invoke-interface {p2}, Le/z$a;->a()I

    move-result v3

    invoke-virtual {p1}, Le/b0;->u()I

    move-result v4

    invoke-virtual {p1}, Le/b0;->A()Z

    move-result v5

    move-object v0, p0

    move v6, p3

    :try_start_0
    invoke-direct/range {v0 .. v6}, Le/k0/h/e;->d(IIIIZZ)Le/k0/h/f;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Le/k0/h/f;->o(Le/b0;Le/z$a;)Le/k0/i/c;

    move-result-object p1
    :try_end_0
    .catch Le/k0/h/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Le/k0/h/e;->h()V

    new-instance p2, Le/k0/h/i;

    invoke-direct {p2, p1}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :catch_1
    move-exception p1

    invoke-virtual {p0}, Le/k0/h/e;->h()V

    throw p1
.end method

.method e()Z
    .locals 3

    iget-object v0, p0, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/h/e;->j:Le/i0;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    invoke-direct {p0}, Le/k0/h/e;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/k0/h/e;->a:Le/k0/h/k;

    iget-object v1, v1, Le/k0/h/k;->i:Le/k0/h/f;

    invoke-virtual {v1}, Le/k0/h/f;->q()Le/i0;

    move-result-object v1

    iput-object v1, p0, Le/k0/h/e;->j:Le/i0;

    monitor-exit v0

    return v2

    :cond_1
    iget-object v1, p0, Le/k0/h/e;->f:Le/k0/h/j$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, Le/k0/h/e;->f:Le/k0/h/j$a;

    invoke-virtual {v1}, Le/k0/h/j$a;->b()Z

    move-result v1

    if-nez v1, :cond_4

    :cond_2
    iget-object v1, p0, Le/k0/h/e;->g:Le/k0/h/j;

    invoke-virtual {v1}, Le/k0/h/j;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method f()Z
    .locals 2

    iget-object v0, p0, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/k0/h/e;->i:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method h()V
    .locals 2

    iget-object v0, p0, Le/k0/h/e;->c:Le/k0/h/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le/k0/h/e;->i:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
