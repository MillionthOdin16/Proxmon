.class final Le/d0$a;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final c:Le/k;

.field private volatile d:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic e:Le/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Le/d0;

    return-void
.end method


# virtual methods
.method protected k()V
    .locals 5

    iget-object v0, p0, Le/d0$a;->e:Le/d0;

    invoke-static {v0}, Le/d0;->a(Le/d0;)Le/k0/h/k;

    move-result-object v0

    invoke-virtual {v0}, Le/k0/h/k;->p()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Le/d0$a;->e:Le/d0;

    invoke-virtual {v1}, Le/d0;->d()Le/g0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    :try_start_1
    iget-object v2, p0, Le/d0$a;->c:Le/k;

    iget-object v3, p0, Le/d0$a;->e:Le/d0;

    invoke-interface {v2, v3, v0}, Le/k;->a(Le/j;Le/g0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object v0, p0, Le/d0$a;->e:Le/d0;

    iget-object v0, v0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->h()Le/s;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/s;->d(Le/d0$a;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    :goto_1
    :try_start_2
    iget-object v2, p0, Le/d0$a;->e:Le/d0;

    invoke-virtual {v2}, Le/d0;->b()V

    if-nez v1, :cond_0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canceled due to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/io/IOException;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v2, p0, Le/d0$a;->c:Le/k;

    iget-object v3, p0, Le/d0$a;->e:Le/d0;

    invoke-interface {v2, v3, v1}, Le/k;->b(Le/j;Ljava/io/IOException;)V

    :cond_0
    throw v0

    :catchall_2
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v1

    move-object v0, v1

    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_1

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Callback failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/d0$a;->e:Le/d0;

    invoke-virtual {v4}, Le/d0;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Le/k0/l/f;->p(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Le/d0$a;->c:Le/k;

    iget-object v2, p0, Le/d0$a;->e:Le/d0;

    invoke-interface {v1, v2, v0}, Le/k;->b(Le/j;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :goto_3
    return-void

    :goto_4
    iget-object v1, p0, Le/d0$a;->e:Le/d0;

    iget-object v1, v1, Le/d0;->b:Le/b0;

    invoke-virtual {v1}, Le/b0;->h()Le/s;

    move-result-object v1

    invoke-virtual {v1, p0}, Le/s;->d(Le/d0$a;)V

    goto :goto_6

    :goto_5
    throw v0

    :goto_6
    goto :goto_5
.end method

.method l()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    iget-object v0, p0, Le/d0$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method m(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, Le/d0$a;->e:Le/d0;

    invoke-static {p1}, Le/d0;->a(Le/d0;)Le/k0/h/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Le/k0/h/k;->l(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object p1, p0, Le/d0$a;->c:Le/k;

    iget-object v1, p0, Le/d0$a;->e:Le/d0;

    invoke-interface {p1, v1, v0}, Le/k;->b(Le/j;Ljava/io/IOException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Le/d0$a;->e:Le/d0;

    iget-object p1, p1, Le/d0;->b:Le/b0;

    invoke-virtual {p1}, Le/b0;->h()Le/s;

    move-result-object p1

    invoke-virtual {p1, p0}, Le/s;->d(Le/d0$a;)V

    :goto_0
    return-void

    :goto_1
    iget-object v0, p0, Le/d0$a;->e:Le/d0;

    iget-object v0, v0, Le/d0;->b:Le/b0;

    invoke-virtual {v0}, Le/b0;->h()Le/s;

    move-result-object v0

    invoke-virtual {v0, p0}, Le/s;->d(Le/d0$a;)V

    throw p1
.end method
