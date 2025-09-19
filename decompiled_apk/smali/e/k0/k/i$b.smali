.class final Le/k0/k/i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final b:Lf/c;

.field private final c:Lf/c;

.field private final d:J

.field private e:Le/x;

.field f:Z

.field g:Z

.field final synthetic h:Le/k0/k/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Le/k0/k/i;J)V
    .locals 0

    iput-object p1, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf/c;

    invoke-direct {p1}, Lf/c;-><init>()V

    iput-object p1, p0, Le/k0/k/i$b;->b:Lf/c;

    new-instance p1, Lf/c;

    invoke-direct {p1}, Lf/c;-><init>()V

    iput-object p1, p0, Le/k0/k/i$b;->c:Lf/c;

    iput-wide p2, p0, Le/k0/k/i$b;->d:J

    return-void
.end method

.method private B(J)V
    .locals 1

    iget-object v0, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->d:Le/k0/k/f;

    invoke-virtual {v0, p1, p2}, Le/k0/k/f;->c0(J)V

    return-void
.end method

.method static synthetic r(Le/k0/k/i$b;Le/x;)Le/x;
    .locals 0

    iput-object p1, p0, Le/k0/k/i$b;->e:Le/x;

    return-object p1
.end method


# virtual methods
.method A(Lf/e;J)V
    .locals 11

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_8

    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, p0, Le/k0/k/i$b;->g:Z

    iget-object v4, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v4}, Lf/c;->N()J

    move-result-wide v4

    add-long/2addr v4, p2

    iget-wide v6, p0, Le/k0/k/i$b;->d:J

    const/4 v8, 0x1

    const/4 v9, 0x0

    cmp-long v10, v4, v6

    if-lez v10, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_2

    invoke-interface {p1, p2, p3}, Lf/e;->l(J)V

    iget-object p1, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    sget-object p2, Le/k0/k/b;->f:Le/k0/k/b;

    invoke-virtual {p1, p2}, Le/k0/k/i;->f(Le/k0/k/b;)V

    return-void

    :cond_2
    if-eqz v3, :cond_3

    invoke-interface {p1, p2, p3}, Lf/e;->l(J)V

    return-void

    :cond_3
    iget-object v2, p0, Le/k0/k/i$b;->b:Lf/c;

    invoke-interface {p1, v2, p2, p3}, Lf/t;->i(Lf/c;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_7

    sub-long/2addr p2, v2

    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    monitor-enter v2

    :try_start_1
    iget-boolean v3, p0, Le/k0/k/i$b;->f:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Le/k0/k/i$b;->b:Lf/c;

    invoke-virtual {v3}, Lf/c;->N()J

    move-result-wide v3

    iget-object v5, p0, Le/k0/k/i$b;->b:Lf/c;

    invoke-virtual {v5}, Lf/c;->A()V

    goto :goto_3

    :cond_4
    iget-object v3, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v3}, Lf/c;->N()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    :goto_2
    iget-object v3, p0, Le/k0/k/i$b;->c:Lf/c;

    iget-object v4, p0, Le/k0/k/i$b;->b:Lf/c;

    invoke-virtual {v3, v4}, Lf/c;->U(Lf/t;)J

    if-eqz v8, :cond_6

    iget-object v3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    :cond_6
    move-wide v3, v0

    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v2, v3, v0

    if-lez v2, :cond_0

    invoke-direct {p0, v3, v4}, Le/k0/k/i$b;->B(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_7
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_8
    return-void
.end method

.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->i:Le/k0/k/i$c;

    return-object v0
.end method

.method public close()V
    .locals 5

    iget-object v0, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le/k0/k/i$b;->f:Z

    iget-object v1, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v1}, Lf/c;->N()J

    move-result-wide v1

    iget-object v3, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v3}, Lf/c;->A()V

    iget-object v3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_0

    invoke-direct {p0, v1, v2}, Le/k0/k/i$b;->B(J)V

    :cond_0
    iget-object v0, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    invoke-virtual {v0}, Le/k0/k/i;->b()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public i(Lf/c;J)J
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_8

    :goto_0
    const/4 v2, 0x0

    iget-object v3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v4, v4, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {v4}, Lf/a;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v4, v4, Le/k0/k/i;->k:Le/k0/k/b;

    if-eqz v4, :cond_1

    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v2, v2, Le/k0/k/i;->l:Ljava/io/IOException;

    if-eqz v2, :cond_0

    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v2, v2, Le/k0/k/i;->l:Ljava/io/IOException;

    goto :goto_1

    :cond_0
    new-instance v2, Le/k0/k/n;

    iget-object v4, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v4, v4, Le/k0/k/i;->k:Le/k0/k/b;

    invoke-direct {v2, v4}, Le/k0/k/n;-><init>(Le/k0/k/b;)V

    :cond_1
    :goto_1
    iget-boolean v4, p0, Le/k0/k/i$b;->f:Z

    if-nez v4, :cond_7

    iget-object v4, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v4}, Lf/c;->N()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v0

    if-lez v8, :cond_2

    iget-object v4, p0, Le/k0/k/i$b;->c:Lf/c;

    iget-object v5, p0, Le/k0/k/i$b;->c:Lf/c;

    invoke-virtual {v5}, Lf/c;->N()J

    move-result-wide v8

    invoke-static {p2, p3, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v4, p1, p2, p3}, Lf/c;->i(Lf/c;J)J

    move-result-wide p1

    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-wide v4, p3, Le/k0/k/i;->a:J

    add-long/2addr v4, p1

    iput-wide v4, p3, Le/k0/k/i;->a:J

    if-nez v2, :cond_4

    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-wide v4, p3, Le/k0/k/i;->a:J

    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object p3, p3, Le/k0/k/i;->d:Le/k0/k/f;

    iget-object p3, p3, Le/k0/k/f;->t:Le/k0/k/m;

    invoke-virtual {p3}, Le/k0/k/m;->d()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-long v8, p3

    cmp-long p3, v4, v8

    if-ltz p3, :cond_4

    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object p3, p3, Le/k0/k/i;->d:Le/k0/k/f;

    iget-object v4, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget v4, v4, Le/k0/k/i;->c:I

    iget-object v5, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-wide v8, v5, Le/k0/k/i;->a:J

    invoke-virtual {p3, v4, v8, v9}, Le/k0/k/f;->i0(IJ)V

    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iput-wide v0, p3, Le/k0/k/i;->a:J

    goto :goto_2

    :cond_2
    iget-boolean v4, p0, Le/k0/k/i$b;->g:Z

    if-nez v4, :cond_3

    if-nez v2, :cond_3

    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    invoke-virtual {v2}, Le/k0/k/i;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object v2, v2, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {v2}, Le/k0/k/i$c;->u()V

    monitor-exit v3

    goto/16 :goto_0

    :cond_3
    move-wide p1, v6

    :cond_4
    :goto_2
    iget-object p3, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object p3, p3, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {p3}, Le/k0/k/i$c;->u()V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    cmp-long p3, p1, v6

    if-eqz p3, :cond_5

    invoke-direct {p0, p1, p2}, Le/k0/k/i$b;->B(J)V

    return-wide p1

    :cond_5
    if-nez v2, :cond_6

    return-wide v6

    :cond_6
    throw v2

    :cond_7
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_4
    iget-object p2, p0, Le/k0/k/i$b;->h:Le/k0/k/i;

    iget-object p2, p2, Le/k0/k/i;->i:Le/k0/k/i$c;

    invoke-virtual {p2}, Le/k0/k/i$c;->u()V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method
