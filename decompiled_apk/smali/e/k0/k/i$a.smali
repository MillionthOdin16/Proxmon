.class final Le/k0/k/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final b:Lf/c;

.field private c:Le/x;

.field d:Z

.field e:Z

.field final synthetic f:Le/k0/k/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Le/k0/k/i;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf/c;

    invoke-direct {p1}, Lf/c;-><init>()V

    iput-object p1, p0, Le/k0/k/i$a;->b:Lf/c;

    return-void
.end method

.method private r(Z)V
    .locals 11

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v1, v1, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {v1}, Lf/a;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-wide v1, v1, Le/k0/k/i;->b:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    iget-boolean v1, p0, Le/k0/k/i$a;->e:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Le/k0/k/i$a;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v1, v1, Le/k0/k/i;->k:Le/k0/k/b;

    if-nez v1, :cond_0

    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    invoke-virtual {v1}, Le/k0/k/i;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v1, v1, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {v1}, Le/k0/k/i$c;->u()V

    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    invoke-virtual {v1}, Le/k0/k/i;->c()V

    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-wide v1, v1, Le/k0/k/i;->b:J

    iget-object v3, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v3}, Lf/c;->N()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-wide v2, v1, Le/k0/k/i;->b:J

    sub-long/2addr v2, v9

    iput-wide v2, v1, Le/k0/k/i;->b:J

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {v0}, Lf/a;->k()V

    if-eqz p1, :cond_1

    :try_start_3
    iget-object p1, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {p1}, Lf/c;->N()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    const/4 v7, 0x0

    :goto_1
    iget-object p1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v5, p1, Le/k0/k/i;->d:Le/k0/k/f;

    iget-object p1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget v6, p1, Le/k0/k/i;->c:I

    iget-object v8, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual/range {v5 .. v10}, Le/k0/k/f;->d0(IZLf/c;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object p1, p1, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {p1}, Le/k0/k/i$c;->u()V

    return-void

    :goto_2
    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {v0}, Le/k0/k/i$c;->u()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_4
    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v1, v1, Le/k0/k/i;->j:Le/k0/k/i$c;

    invoke-virtual {v1}, Le/k0/k/i$c;->u()V

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->j:Le/k0/k/i$c;

    return-object v0
.end method

.method public close()V
    .locals 8

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/k0/k/i$a;->d:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->h:Le/k0/k/i$a;

    iget-boolean v0, v0, Le/k0/k/i$a;->e:Z

    const/4 v1, 0x1

    if-nez v0, :cond_6

    iget-object v0, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v0}, Lf/c;->N()J

    move-result-wide v2

    const/4 v0, 0x0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Le/k0/k/i$a;->c:Le/x;

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    :goto_2
    iget-object v2, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v2}, Lf/c;->N()J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-lez v6, :cond_3

    invoke-direct {p0, v0}, Le/k0/k/i$a;->r(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v2, v0, Le/k0/k/i;->d:Le/k0/k/f;

    iget v0, v0, Le/k0/k/i;->c:I

    iget-object v3, p0, Le/k0/k/i$a;->c:Le/x;

    invoke-static {v3}, Le/k0/e;->H(Le/x;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Le/k0/k/f;->e0(IZLjava/util/List;)V

    goto :goto_4

    :cond_4
    if-eqz v2, :cond_5

    :goto_3
    iget-object v0, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v0}, Lf/c;->N()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_6

    invoke-direct {p0, v1}, Le/k0/k/i$a;->r(Z)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v2, v0, Le/k0/k/i;->d:Le/k0/k/f;

    iget v3, v0, Le/k0/k/i;->c:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Le/k0/k/f;->d0(IZLf/c;J)V

    :cond_6
    :goto_4
    iget-object v2, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    monitor-enter v2

    :try_start_1
    iput-boolean v1, p0, Le/k0/k/i$a;->d:Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->d:Le/k0/k/f;

    invoke-virtual {v0}, Le/k0/k/f;->flush()V

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    invoke-virtual {v0}, Le/k0/k/i;->b()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :goto_5
    throw v1

    :goto_6
    goto :goto_5
.end method

.method public e(Lf/c;J)V
    .locals 2

    iget-object v0, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v0, p1, p2, p3}, Lf/c;->e(Lf/c;J)V

    :goto_0
    iget-object p1, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {p1}, Lf/c;->N()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le/k0/k/i$a;->r(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public flush()V
    .locals 5

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    invoke-virtual {v1}, Le/k0/k/i;->c()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Le/k0/k/i$a;->b:Lf/c;

    invoke-virtual {v0}, Lf/c;->N()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le/k0/k/i$a;->r(Z)V

    iget-object v0, p0, Le/k0/k/i$a;->f:Le/k0/k/i;

    iget-object v0, v0, Le/k0/k/i;->d:Le/k0/k/f;

    invoke-virtual {v0}, Le/k0/k/f;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
