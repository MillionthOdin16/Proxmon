.class Le/k0/k/f$g;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f;->V(ILe/k0/k/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Le/k0/k/b;

.field final synthetic e:Le/k0/k/f;


# direct methods
.method varargs constructor <init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILe/k0/k/b;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$g;->e:Le/k0/k/f;

    iput p4, p0, Le/k0/k/f$g;->c:I

    iput-object p5, p0, Le/k0/k/f$g;->d:Le/k0/k/b;

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Le/k0/k/f$g;->e:Le/k0/k/f;

    iget-object v0, v0, Le/k0/k/f;->k:Le/k0/k/l;

    iget v1, p0, Le/k0/k/f$g;->c:I

    iget-object v2, p0, Le/k0/k/f$g;->d:Le/k0/k/b;

    invoke-interface {v0, v1, v2}, Le/k0/k/l;->c(ILe/k0/k/b;)V

    iget-object v0, p0, Le/k0/k/f$g;->e:Le/k0/k/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/k0/k/f$g;->e:Le/k0/k/f;

    iget-object v1, v1, Le/k0/k/f;->y:Ljava/util/Set;

    iget v2, p0, Le/k0/k/f$g;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
