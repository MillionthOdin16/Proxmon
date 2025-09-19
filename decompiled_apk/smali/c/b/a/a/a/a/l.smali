.class final Lc/b/a/a/a/a/l;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:Landroid/os/IBinder;

.field final synthetic d:Lc/b/a/a/a/a/n;


# direct methods
.method constructor <init>(Lc/b/a/a/a/a/n;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iput-object p2, p0, Lc/b/a/a/a/a/l;->c:Landroid/os/IBinder;

    invoke-direct {p0}, Lc/b/a/a/a/a/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iget-object v0, v0, Lc/b/a/a/a/a/n;->a:Lc/b/a/a/a/a/o;

    invoke-static {v0}, Lc/b/a/a/a/a/o;->m(Lc/b/a/a/a/a/o;)Lc/b/a/a/a/a/k;

    move-result-object v1

    iget-object v2, p0, Lc/b/a/a/a/a/l;->c:Landroid/os/IBinder;

    invoke-interface {v1, v2}, Lc/b/a/a/a/a/k;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-static {v0, v1}, Lc/b/a/a/a/a/o;->d(Lc/b/a/a/a/a/o;Landroid/os/IInterface;)V

    iget-object v0, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iget-object v0, v0, Lc/b/a/a/a/a/n;->a:Lc/b/a/a/a/a/o;

    invoke-static {v0}, Lc/b/a/a/a/a/o;->n(Lc/b/a/a/a/a/o;)V

    iget-object v0, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iget-object v0, v0, Lc/b/a/a/a/a/n;->a:Lc/b/a/a/a/a/o;

    invoke-static {v0}, Lc/b/a/a/a/a/o;->r(Lc/b/a/a/a/a/o;)V

    iget-object v0, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iget-object v0, v0, Lc/b/a/a/a/a/n;->a:Lc/b/a/a/a/a/o;

    invoke-static {v0}, Lc/b/a/a/a/a/o;->o(Lc/b/a/a/a/a/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/a/a/a/a/l;->d:Lc/b/a/a/a/a/n;

    iget-object v0, v0, Lc/b/a/a/a/a/n;->a:Lc/b/a/a/a/a/o;

    invoke-static {v0}, Lc/b/a/a/a/a/o;->o(Lc/b/a/a/a/a/o;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
