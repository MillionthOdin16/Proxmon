.class public Lf/i;
.super Lf/u;
.source ""


# instance fields
.field private e:Lf/u;


# direct methods
.method public constructor <init>(Lf/u;)V
    .locals 1

    invoke-direct {p0}, Lf/u;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lf/i;->e:Lf/u;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lf/u;
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->a()Lf/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->b()Lf/u;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Lf/u;
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0, p1, p2}, Lf/u;->d(J)Lf/u;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Lf/u;
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0, p1, p2, p3}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    move-result-object p1

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, Lf/i;->e:Lf/u;

    invoke-virtual {v0}, Lf/u;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()Lf/u;
    .locals 1

    iget-object v0, p0, Lf/i;->e:Lf/u;

    return-object v0
.end method

.method public final j(Lf/u;)Lf/i;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lf/i;->e:Lf/u;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
