.class final Le/k0/k/f$i;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "i"
.end annotation


# instance fields
.field final synthetic c:Le/k0/k/f;


# direct methods
.method constructor <init>(Le/k0/k/f;)V
    .locals 2

    iput-object p1, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, Le/k0/k/f;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping"

    invoke-direct {p0, p1, v0}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 8

    iget-object v0, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    invoke-static {v1}, Le/k0/k/f;->A(Le/k0/k/f;)J

    move-result-wide v1

    iget-object v3, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    invoke-static {v3}, Le/k0/k/f;->C(Le/k0/k/f;)J

    move-result-wide v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    cmp-long v7, v1, v3

    if-gez v7, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    invoke-static {v1}, Le/k0/k/f;->D(Le/k0/k/f;)J

    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le/k0/k/f$i;->c:Le/k0/k/f;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le/k0/k/f;->r(Le/k0/k/f;Ljava/io/IOException;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v6, v5, v6}, Le/k0/k/f;->f0(ZII)V

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
