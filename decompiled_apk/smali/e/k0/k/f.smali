.class public final Le/k0/k/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/k0/k/f$j;,
        Le/k0/k/f$l;,
        Le/k0/k/f$h;,
        Le/k0/k/f$i;,
        Le/k0/k/f$k;
    }
.end annotation


# static fields
.field private static final z:Ljava/util/concurrent/ExecutorService;


# instance fields
.field final b:Z

.field final c:Le/k0/k/f$j;

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Le/k0/k/i;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/lang/String;

.field f:I

.field g:I

.field private h:Z

.field private final i:Ljava/util/concurrent/ScheduledExecutorService;

.field private final j:Ljava/util/concurrent/ExecutorService;

.field final k:Le/k0/k/l;

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field r:J

.field s:J

.field t:Le/k0/k/m;

.field final u:Le/k0/k/m;

.field final v:Ljava/net/Socket;

.field final w:Le/k0/k/j;

.field final x:Le/k0/k/f$l;

.field final y:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-class v0, Le/k0/k/f;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x1

    const-string v8, "OkHttp Http2Connection"

    invoke-static {v8, v1}, Le/k0/e;->G(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Le/k0/k/f;->z:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method constructor <init>(Le/k0/k/f$h;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Le/k0/k/f;->d:Ljava/util/Map;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Le/k0/k/f;->l:J

    iput-wide v2, v0, Le/k0/k/f;->m:J

    iput-wide v2, v0, Le/k0/k/f;->n:J

    iput-wide v2, v0, Le/k0/k/f;->o:J

    iput-wide v2, v0, Le/k0/k/f;->p:J

    iput-wide v2, v0, Le/k0/k/f;->q:J

    iput-wide v2, v0, Le/k0/k/f;->r:J

    new-instance v2, Le/k0/k/m;

    invoke-direct {v2}, Le/k0/k/m;-><init>()V

    iput-object v2, v0, Le/k0/k/f;->t:Le/k0/k/m;

    new-instance v2, Le/k0/k/m;

    invoke-direct {v2}, Le/k0/k/m;-><init>()V

    iput-object v2, v0, Le/k0/k/f;->u:Le/k0/k/m;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v2, v0, Le/k0/k/f;->y:Ljava/util/Set;

    iget-object v2, v1, Le/k0/k/f$h;->f:Le/k0/k/l;

    iput-object v2, v0, Le/k0/k/f;->k:Le/k0/k/l;

    iget-boolean v2, v1, Le/k0/k/f$h;->g:Z

    iput-boolean v2, v0, Le/k0/k/f;->b:Z

    iget-object v3, v1, Le/k0/k/f$h;->e:Le/k0/k/f$j;

    iput-object v3, v0, Le/k0/k/f;->c:Le/k0/k/f$j;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    iput v2, v0, Le/k0/k/f;->g:I

    iget-boolean v5, v1, Le/k0/k/f$h;->g:Z

    if-eqz v5, :cond_1

    add-int/2addr v2, v3

    iput v2, v0, Le/k0/k/f;->g:I

    :cond_1
    iget-boolean v2, v1, Le/k0/k/f$h;->g:Z

    const/4 v3, 0x7

    if-eqz v2, :cond_2

    iget-object v2, v0, Le/k0/k/f;->t:Le/k0/k/m;

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v3, v5}, Le/k0/k/m;->i(II)Le/k0/k/m;

    :cond_2
    iget-object v2, v1, Le/k0/k/f$h;->b:Ljava/lang/String;

    iput-object v2, v0, Le/k0/k/f;->e:Ljava/lang/String;

    new-instance v5, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v6, v0, Le/k0/k/f;->e:Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v6, v2, v12

    const-string v6, "OkHttp %s Writer"

    invoke-static {v6, v2}, Le/k0/e;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v12}, Le/k0/e;->G(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v2

    invoke-direct {v5, v4, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v5, v0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    iget v2, v1, Le/k0/k/f$h;->h:I

    if-eqz v2, :cond_3

    new-instance v6, Le/k0/k/f$i;

    invoke-direct {v6, v0}, Le/k0/k/f$i;-><init>(Le/k0/k/f;)V

    iget v2, v1, Le/k0/k/f$h;->h:I

    int-to-long v7, v2

    int-to-long v9, v2

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v5 .. v11}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v14, 0x0

    const/4 v15, 0x1

    const-wide/16 v16, 0x3c

    sget-object v18, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v19, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, v0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v6, v5, v12

    const-string v6, "OkHttp %s Push Observer"

    invoke-static {v6, v5}, Le/k0/e;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Le/k0/e;->G(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v20

    move-object v13, v2

    invoke-direct/range {v13 .. v20}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v2, v0, Le/k0/k/f;->j:Ljava/util/concurrent/ExecutorService;

    iget-object v2, v0, Le/k0/k/f;->u:Le/k0/k/m;

    const v4, 0xffff

    invoke-virtual {v2, v3, v4}, Le/k0/k/m;->i(II)Le/k0/k/m;

    iget-object v2, v0, Le/k0/k/f;->u:Le/k0/k/m;

    const/4 v3, 0x5

    const/16 v4, 0x4000

    invoke-virtual {v2, v3, v4}, Le/k0/k/m;->i(II)Le/k0/k/m;

    iget-object v2, v0, Le/k0/k/f;->u:Le/k0/k/m;

    invoke-virtual {v2}, Le/k0/k/m;->d()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Le/k0/k/f;->s:J

    iget-object v2, v1, Le/k0/k/f$h;->a:Ljava/net/Socket;

    iput-object v2, v0, Le/k0/k/f;->v:Ljava/net/Socket;

    new-instance v2, Le/k0/k/j;

    iget-object v3, v1, Le/k0/k/f$h;->d:Lf/d;

    iget-boolean v4, v0, Le/k0/k/f;->b:Z

    invoke-direct {v2, v3, v4}, Le/k0/k/j;-><init>(Lf/d;Z)V

    iput-object v2, v0, Le/k0/k/f;->w:Le/k0/k/j;

    new-instance v2, Le/k0/k/f$l;

    new-instance v3, Le/k0/k/h;

    iget-object v1, v1, Le/k0/k/f$h;->c:Lf/e;

    iget-boolean v4, v0, Le/k0/k/f;->b:Z

    invoke-direct {v3, v1, v4}, Le/k0/k/h;-><init>(Lf/e;Z)V

    invoke-direct {v2, v0, v3}, Le/k0/k/f$l;-><init>(Le/k0/k/f;Le/k0/k/h;)V

    iput-object v2, v0, Le/k0/k/f;->x:Le/k0/k/f$l;

    return-void
.end method

.method static synthetic A(Le/k0/k/f;)J
    .locals 2

    iget-wide v0, p0, Le/k0/k/f;->m:J

    return-wide v0
.end method

.method static synthetic B(Le/k0/k/f;)J
    .locals 4

    iget-wide v0, p0, Le/k0/k/f;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Le/k0/k/f;->m:J

    return-wide v0
.end method

.method static synthetic C(Le/k0/k/f;)J
    .locals 2

    iget-wide v0, p0, Le/k0/k/f;->l:J

    return-wide v0
.end method

.method static synthetic D(Le/k0/k/f;)J
    .locals 4

    iget-wide v0, p0, Le/k0/k/f;->l:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Le/k0/k/f;->l:J

    return-wide v0
.end method

.method static synthetic E(Le/k0/k/f;)Z
    .locals 0

    iget-boolean p0, p0, Le/k0/k/f;->h:Z

    return p0
.end method

.method static synthetic F(Le/k0/k/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Le/k0/k/f;->h:Z

    return p1
.end method

.method static synthetic G()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Le/k0/k/f;->z:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic H(Le/k0/k/f;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic I(Le/k0/k/f;)J
    .locals 4

    iget-wide v0, p0, Le/k0/k/f;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Le/k0/k/f;->o:J

    return-wide v0
.end method

.method static synthetic J(Le/k0/k/f;)J
    .locals 4

    iget-wide v0, p0, Le/k0/k/f;->p:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Le/k0/k/f;->p:J

    return-wide v0
.end method

.method private L(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Le/k0/k/b;->d:Le/k0/k/b;

    invoke-virtual {p0, v0, v0, p1}, Le/k0/k/f;->K(Le/k0/k/b;Le/k0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method private P(ILjava/util/List;Z)Le/k0/k/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;Z)",
            "Le/k0/k/i;"
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    iget-object v7, p0, Le/k0/k/f;->w:Le/k0/k/j;

    monitor-enter v7

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v0, p0, Le/k0/k/f;->g:I

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    sget-object v0, Le/k0/k/b;->g:Le/k0/k/b;

    invoke-virtual {p0, v0}, Le/k0/k/f;->Z(Le/k0/k/b;)V

    :cond_0
    iget-boolean v0, p0, Le/k0/k/f;->h:Z

    if-nez v0, :cond_7

    iget v8, p0, Le/k0/k/f;->g:I

    iget v0, p0, Le/k0/k/f;->g:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Le/k0/k/f;->g:I

    new-instance v9, Le/k0/k/i;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Le/k0/k/i;-><init>(ILe/k0/k/f;ZZLe/x;)V

    if-eqz p3, :cond_2

    iget-wide v0, p0, Le/k0/k/f;->s:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_2

    iget-wide v0, v9, Le/k0/k/i;->b:J

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    :goto_1
    invoke-virtual {v9}, Le/k0/k/i;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_4

    :try_start_2
    iget-object p1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {p1, v6, v8, p2}, Le/k0/k/j;->F(ZILjava/util/List;)V

    goto :goto_2

    :cond_4
    iget-boolean v0, p0, Le/k0/k/f;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v0, p1, v8, p2}, Le/k0/k/j;->I(IILjava/util/List;)V

    :goto_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p3, :cond_5

    iget-object p1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {p1}, Le/k0/k/j;->flush()V

    :cond_5
    return-object v9

    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "client streams shouldn\'t have associated stream IDs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    new-instance p1, Le/k0/k/a;

    invoke-direct {p1}, Le/k0/k/a;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method private declared-synchronized S(Le/k0/d;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/k/f;->h:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le/k0/k/f;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
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

.method static synthetic r(Le/k0/k/f;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Le/k0/k/f;->L(Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method K(Le/k0/k/b;Le/k0/k/b;Ljava/io/IOException;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Le/k0/k/f;->Z(Le/k0/k/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Le/k0/k/i;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Le/k0/k/i;

    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    :try_start_2
    invoke-virtual {v2, p2, p3}, Le/k0/k/i;->d(Le/k0/k/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :try_start_3
    iget-object p1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {p1}, Le/k0/k/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Le/k0/k/f;->v:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    iget-object p1, p0, Le/k0/k/f;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method declared-synchronized M(I)Le/k0/k/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/k0/k/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized N(J)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le/k0/k/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Le/k0/k/f;->o:J

    iget-wide v4, p0, Le/k0/k/f;->n:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Le/k0/k/f;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized O()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->u:Le/k0/k/m;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Le/k0/k/m;->e(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public Q(Ljava/util/List;Z)Le/k0/k/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;Z)",
            "Le/k0/k/i;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Le/k0/k/f;->P(ILjava/util/List;Z)Le/k0/k/i;

    move-result-object p1

    return-object p1
.end method

.method R(ILf/e;IZ)V
    .locals 8

    new-instance v5, Lf/c;

    invoke-direct {v5}, Lf/c;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Lf/e;->q(J)V

    invoke-interface {p2, v5, v0, v1}, Lf/t;->i(Lf/c;J)J

    invoke-virtual {v5}, Lf/c;->N()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    new-instance p2, Le/k0/k/f$f;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v2, "OkHttp %s Push Data[%s]"

    move-object v0, p2

    move-object v1, p0

    move v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Le/k0/k/f$f;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILf/c;IZ)V

    invoke-direct {p0, p2}, Le/k0/k/f;->S(Le/k0/d;)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lf/c;->N()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method T(ILjava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    new-instance v7, Le/k0/k/f$e;

    const-string v2, "OkHttp %s Push Headers[%s]"

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    move-object v0, v7

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Le/k0/k/f$e;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-direct {p0, v7}, Le/k0/k/f;->S(Le/k0/d;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method U(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->y:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Le/k0/k/b;->d:Le/k0/k/b;

    invoke-virtual {p0, p1, p2}, Le/k0/k/f;->h0(ILe/k0/k/b;)V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/k/f;->y:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Le/k0/k/f$d;

    const-string v4, "OkHttp %s Push Request[%s]"

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v1

    move-object v2, v0

    move-object v3, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Le/k0/k/f$d;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-direct {p0, v0}, Le/k0/k/f;->S(Le/k0/d;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method V(ILe/k0/k/b;)V
    .locals 7

    new-instance v6, Le/k0/k/f$g;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v0, p0, Le/k0/k/f;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v2, "OkHttp %s Push Reset[%s]"

    move-object v0, v6

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Le/k0/k/f$g;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILe/k0/k/b;)V

    invoke-direct {p0, v6}, Le/k0/k/f;->S(Le/k0/d;)V

    return-void
.end method

.method W(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method declared-synchronized X(I)Le/k0/k/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/k0/k/i;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method Y()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Le/k0/k/f;->o:J

    iget-wide v2, p0, Le/k0/k/f;->n:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    iget-wide v0, p0, Le/k0/k/f;->n:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Le/k0/k/f;->n:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0x3b9aca00

    add-long/2addr v0, v2

    iput-wide v0, p0, Le/k0/k/f;->q:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Le/k0/k/f$c;

    const-string v2, "OkHttp %s ping"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-direct {v1, p0, v2, v3}, Le/k0/k/f$c;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public Z(Le/k0/k/b;)V
    .locals 4

    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Le/k0/k/f;->h:Z

    if-eqz v1, :cond_0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Le/k0/k/f;->h:Z

    iget v1, p0, Le/k0/k/f;->f:I

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v2, p0, Le/k0/k/f;->w:Le/k0/k/j;

    sget-object v3, Le/k0/e;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Le/k0/k/j;->E(ILe/k0/k/b;[B)V

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public a0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Le/k0/k/f;->b0(Z)V

    return-void
.end method

.method b0(Z)V
    .locals 5

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {p1}, Le/k0/k/j;->A()V

    iget-object p1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    iget-object v0, p0, Le/k0/k/f;->t:Le/k0/k/m;

    invoke-virtual {p1, v0}, Le/k0/k/j;->K(Le/k0/k/m;)V

    iget-object p1, p0, Le/k0/k/f;->t:Le/k0/k/m;

    invoke-virtual {p1}, Le/k0/k/m;->d()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Le/k0/k/f;->w:Le/k0/k/j;

    const/4 v2, 0x0

    sub-int/2addr p1, v0

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Le/k0/k/j;->L(IJ)V

    :cond_0
    new-instance p1, Ljava/lang/Thread;

    iget-object v0, p0, Le/k0/k/f;->x:Le/k0/k/f$l;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method declared-synchronized c0(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Le/k0/k/f;->r:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Le/k0/k/f;->r:J

    iget-object p1, p0, Le/k0/k/f;->t:Le/k0/k/m;

    invoke-virtual {p1}, Le/k0/k/m;->d()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x0

    iget-wide v0, p0, Le/k0/k/f;->r:J

    invoke-virtual {p0, p1, v0, v1}, Le/k0/k/f;->i0(IJ)V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Le/k0/k/f;->r:J
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

.method public close()V
    .locals 3

    sget-object v0, Le/k0/k/b;->c:Le/k0/k/b;

    sget-object v1, Le/k0/k/b;->h:Le/k0/k/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Le/k0/k/f;->K(Le/k0/k/b;Le/k0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method public d0(IZLf/c;J)V
    .locals 8

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    iget-object p4, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {p4, p2, p1, p3, v0}, Le/k0/k/j;->B(ZILf/c;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    if-lez v3, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v3, p0, Le/k0/k/f;->s:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_2

    iget-object v3, p0, Le/k0/k/f;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    iget-wide v3, p0, Le/k0/k/f;->s:J

    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    iget-object v3, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v3}, Le/k0/k/j;->G()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-wide v4, p0, Le/k0/k/f;->s:J

    int-to-long v6, v3

    sub-long/2addr v4, v6

    iput-wide v4, p0, Le/k0/k/f;->s:J

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr p4, v6

    iget-object v4, p0, Le/k0/k/f;->w:Le/k0/k/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v1

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Le/k0/k/j;->B(ZILf/c;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method e0(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v0, p2, p1, p3}, Le/k0/k/j;->F(ZILjava/util/List;)V

    return-void
.end method

.method f0(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v0, p1, p2, p3}, Le/k0/k/j;->H(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Le/k0/k/f;->L(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v0}, Le/k0/k/j;->flush()V

    return-void
.end method

.method g0(ILe/k0/k/b;)V
    .locals 1

    iget-object v0, p0, Le/k0/k/f;->w:Le/k0/k/j;

    invoke-virtual {v0, p1, p2}, Le/k0/k/j;->J(ILe/k0/k/b;)V

    return-void
.end method

.method h0(ILe/k0/k/b;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, Le/k0/k/f$a;

    const-string v3, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Le/k0/k/f$a;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILe/k0/k/b;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method i0(IJ)V
    .locals 9

    :try_start_0
    iget-object v0, p0, Le/k0/k/f;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Le/k0/k/f$b;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Le/k0/k/f;->e:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v8

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Le/k0/k/f$b;-><init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
