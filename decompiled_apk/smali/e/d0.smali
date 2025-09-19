.class final Le/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/d0$a;
    }
.end annotation


# instance fields
.field final b:Le/b0;

.field private c:Le/k0/h/k;

.field final d:Le/e0;

.field final e:Z

.field private f:Z


# direct methods
.method private constructor <init>(Le/b0;Le/e0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/d0;->b:Le/b0;

    iput-object p2, p0, Le/d0;->d:Le/e0;

    iput-boolean p3, p0, Le/d0;->e:Z

    return-void
.end method

.method static synthetic a(Le/d0;)Le/k0/h/k;
    .locals 0

    iget-object p0, p0, Le/d0;->c:Le/k0/h/k;

    return-object p0
.end method

.method static f(Le/b0;Le/e0;Z)Le/d0;
    .locals 1

    new-instance v0, Le/d0;

    invoke-direct {v0, p0, p1, p2}, Le/d0;-><init>(Le/b0;Le/e0;Z)V

    new-instance p1, Le/k0/h/k;

    invoke-direct {p1, p0, v0}, Le/k0/h/k;-><init>(Le/b0;Le/j;)V

    iput-object p1, v0, Le/d0;->c:Le/k0/h/k;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0}, Le/k0/h/k;->d()V

    return-void
.end method

.method public c()Le/d0;
    .locals 3

    iget-object v0, p0, Le/d0;->b:Le/b0;

    iget-object v1, p0, Le/d0;->d:Le/e0;

    iget-boolean v2, p0, Le/d0;->e:Z

    invoke-static {v0, v1, v2}, Le/d0;->f(Le/b0;Le/e0;Z)Le/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le/d0;->c()Le/d0;

    move-result-object v0

    return-object v0
.end method

.method d()Le/g0;
    .locals 11

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Le/k0/i/j;

    iget-object v2, p0, Le/d0;->b:Le/b0;

    invoke-direct {v0, v2}, Le/k0/i/j;-><init>(Le/b0;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Le/k0/i/a;

    iget-object v2, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v2}, Le/b0;->g()Le/r;

    move-result-object v2

    invoke-direct {v0, v2}, Le/k0/i/a;-><init>(Le/r;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Le/k0/g/a;

    iget-object v2, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v2}, Le/b0;->o()Le/k0/g/d;

    move-result-object v2

    invoke-direct {v0, v2}, Le/k0/g/a;-><init>(Le/k0/g/d;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Le/k0/h/b;

    iget-object v2, p0, Le/d0;->b:Le/b0;

    invoke-direct {v0, v2}, Le/k0/h/b;-><init>(Le/b0;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Le/d0;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    new-instance v0, Le/k0/i/b;

    iget-boolean v2, p0, Le/d0;->e:Z

    invoke-direct {v0, v2}, Le/k0/i/b;-><init>(Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v10, Le/k0/i/g;

    iget-object v2, p0, Le/d0;->c:Le/k0/h/k;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Le/d0;->d:Le/e0;

    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->d()I

    move-result v7

    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->z()I

    move-result v8

    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->D()I

    move-result v9

    move-object v0, v10

    move-object v6, p0

    invoke-direct/range {v0 .. v9}, Le/k0/i/g;-><init>(Ljava/util/List;Le/k0/h/k;Le/k0/h/d;ILe/e0;Le/j;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Le/d0;->d:Le/e0;

    invoke-interface {v10, v2}, Le/z$a;->b(Le/e0;)Le/g0;

    move-result-object v2

    iget-object v3, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v3}, Le/k0/h/k;->i()Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0, v1}, Le/k0/h/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, Le/k0/e;->e(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v2, 0x1

    :try_start_2
    iget-object v3, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v3, v0}, Le/k0/h/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    const/4 v0, 0x1

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0, v1}, Le/k0/h/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v2
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0}, Le/k0/h/k;->i()Z

    move-result v0

    return v0
.end method

.method g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/d0;->d:Le/e0;

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method h()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Le/d0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/d0;->e:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/d0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Le/g0;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/d0;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/d0;->f:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0}, Le/k0/h/k;->p()V

    iget-object v0, p0, Le/d0;->c:Le/k0/h/k;

    invoke-virtual {v0}, Le/k0/h/k;->b()V

    :try_start_1
    iget-object v0, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->h()Le/s;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/s;->a(Le/d0;)V

    invoke-virtual {p0}, Le/d0;->d()Le/g0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v1}, Le/b0;->h()Le/s;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/s;->e(Le/d0;)V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Le/d0;->b:Le/b0;

    invoke-virtual {v1}, Le/b0;->h()Le/s;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/s;->e(Le/d0;)V

    throw v0

    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
