.class Le/k0/k/f$f;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f;->R(ILf/e;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lf/c;

.field final synthetic e:I

.field final synthetic f:Z

.field final synthetic g:Le/k0/k/f;


# direct methods
.method varargs constructor <init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILf/c;IZ)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$f;->g:Le/k0/k/f;

    iput p4, p0, Le/k0/k/f$f;->c:I

    iput-object p5, p0, Le/k0/k/f$f;->d:Lf/c;

    iput p6, p0, Le/k0/k/f$f;->e:I

    iput-boolean p7, p0, Le/k0/k/f$f;->f:Z

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Le/k0/k/f$f;->g:Le/k0/k/f;

    iget-object v0, v0, Le/k0/k/f;->k:Le/k0/k/l;

    iget v1, p0, Le/k0/k/f$f;->c:I

    iget-object v2, p0, Le/k0/k/f$f;->d:Lf/c;

    iget v3, p0, Le/k0/k/f$f;->e:I

    iget-boolean v4, p0, Le/k0/k/f$f;->f:Z

    invoke-interface {v0, v1, v2, v3, v4}, Le/k0/k/l;->d(ILf/e;IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/k0/k/f$f;->g:Le/k0/k/f;

    iget-object v1, v1, Le/k0/k/f;->w:Le/k0/k/j;

    iget v2, p0, Le/k0/k/f$f;->c:I

    sget-object v3, Le/k0/k/b;->h:Le/k0/k/b;

    invoke-virtual {v1, v2, v3}, Le/k0/k/j;->J(ILe/k0/k/b;)V

    :cond_0
    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/k0/k/f$f;->f:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Le/k0/k/f$f;->g:Le/k0/k/f;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Le/k0/k/f$f;->g:Le/k0/k/f;

    iget-object v1, v1, Le/k0/k/f;->y:Ljava/util/Set;

    iget v2, p0, Le/k0/k/f$f;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
