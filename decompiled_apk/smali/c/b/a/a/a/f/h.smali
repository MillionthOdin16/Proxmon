.class final Lc/b/a/a/a/f/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic b:Lc/b/a/a/a/f/e;

.field final synthetic c:Lc/b/a/a/a/f/i;


# direct methods
.method constructor <init>(Lc/b/a/a/a/f/i;Lc/b/a/a/a/f/e;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/a/f/h;->c:Lc/b/a/a/a/f/i;

    iput-object p2, p0, Lc/b/a/a/a/f/h;->b:Lc/b/a/a/a/f/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/b/a/a/a/f/h;->c:Lc/b/a/a/a/f/i;

    invoke-static {v0}, Lc/b/a/a/a/f/i;->b(Lc/b/a/a/a/f/i;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/a/f/h;->c:Lc/b/a/a/a/f/i;

    invoke-static {v1}, Lc/b/a/a/a/f/i;->c(Lc/b/a/a/a/f/i;)Lc/b/a/a/a/f/a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/a/f/h;->c:Lc/b/a/a/a/f/i;

    invoke-static {v1}, Lc/b/a/a/a/f/i;->c(Lc/b/a/a/a/f/i;)Lc/b/a/a/a/f/a;

    move-result-object v1

    iget-object v2, p0, Lc/b/a/a/a/f/h;->b:Lc/b/a/a/a/f/e;

    invoke-interface {v1, v2}, Lc/b/a/a/a/f/a;->a(Lc/b/a/a/a/f/e;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
