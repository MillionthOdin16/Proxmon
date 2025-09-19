.class public Lb/a/n/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb/e/j/v;",
            ">;"
        }
    .end annotation
.end field

.field private b:J

.field private c:Landroid/view/animation/Interpolator;

.field d:Lb/e/j/w;

.field private e:Z

.field private final f:Lb/e/j/x;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lb/a/n/h;->b:J

    new-instance v0, Lb/a/n/h$a;

    invoke-direct {v0, p0}, Lb/a/n/h$a;-><init>(Lb/a/n/h;)V

    iput-object v0, p0, Lb/a/n/h;->f:Lb/e/j/x;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/j/v;

    invoke-virtual {v1}, Lb/e/j/v;->b()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/n/h;->e:Z

    return-void
.end method

.method b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/n/h;->e:Z

    return-void
.end method

.method public c(Lb/e/j/v;)Lb/a/n/h;
    .locals 1

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public d(Lb/e/j/v;Lb/e/j/v;)Lb/a/n/h;
    .locals 2

    iget-object v0, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lb/e/j/v;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lb/e/j/v;->h(J)Lb/e/j/v;

    iget-object p1, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public e(J)Lb/a/n/h;
    .locals 1

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-nez v0, :cond_0

    iput-wide p1, p0, Lb/a/n/h;->b:J

    :cond_0
    return-object p0
.end method

.method public f(Landroid/view/animation/Interpolator;)Lb/a/n/h;
    .locals 1

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lb/a/n/h;->c:Landroid/view/animation/Interpolator;

    :cond_0
    return-object p0
.end method

.method public g(Lb/e/j/w;)Lb/a/n/h;
    .locals 1

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lb/a/n/h;->d:Lb/e/j/w;

    :cond_0
    return-object p0
.end method

.method public h()V
    .locals 7

    iget-boolean v0, p0, Lb/a/n/h;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb/a/n/h;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/j/v;

    iget-wide v2, p0, Lb/a/n/h;->b:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    invoke-virtual {v1, v2, v3}, Lb/e/j/v;->d(J)Lb/e/j/v;

    :cond_1
    iget-object v2, p0, Lb/a/n/h;->c:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Lb/e/j/v;->e(Landroid/view/animation/Interpolator;)Lb/e/j/v;

    :cond_2
    iget-object v2, p0, Lb/a/n/h;->d:Lb/e/j/w;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lb/a/n/h;->f:Lb/e/j/x;

    invoke-virtual {v1, v2}, Lb/e/j/v;->f(Lb/e/j/w;)Lb/e/j/v;

    :cond_3
    invoke-virtual {v1}, Lb/e/j/v;->j()V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/n/h;->e:Z

    return-void
.end method
