.class public final Le/k0/h/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/k0/h/d$b;,
        Le/k0/h/d$a;
    }
.end annotation


# instance fields
.field final a:Le/k0/h/k;

.field final b:Le/j;

.field final c:Le/v;

.field final d:Le/k0/h/e;

.field final e:Le/k0/i/c;

.field private f:Z


# direct methods
.method public constructor <init>(Le/k0/h/k;Le/j;Le/v;Le/k0/h/e;Le/k0/i/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/h/d;->a:Le/k0/h/k;

    iput-object p2, p0, Le/k0/h/d;->b:Le/j;

    iput-object p3, p0, Le/k0/h/d;->c:Le/v;

    iput-object p4, p0, Le/k0/h/d;->d:Le/k0/h/e;

    iput-object p5, p0, Le/k0/h/d;->e:Le/k0/i/c;

    return-void
.end method


# virtual methods
.method a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    if-eqz p5, :cond_0

    invoke-virtual {p0, p5}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    if-eqz p5, :cond_1

    invoke-virtual {v0, v1, p5}, Le/v;->o(Le/j;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, p1, p2}, Le/v;->m(Le/j;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, Le/k0/h/d;->c:Le/v;

    iget-object p2, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {p1, p2, p5}, Le/v;->t(Le/j;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1, p2}, Le/v;->r(Le/j;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, Le/k0/h/d;->a:Le/k0/h/k;

    invoke-virtual {p1, p0, p4, p3, p5}, Le/k0/h/k;->g(Le/k0/h/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->cancel()V

    return-void
.end method

.method public c()Le/k0/h/f;
    .locals 1

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->h()Le/k0/h/f;

    move-result-object v0

    return-object v0
.end method

.method public d(Le/e0;Z)Lf/s;
    .locals 3

    iput-boolean p2, p0, Le/k0/h/d;->f:Z

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object p2

    invoke-virtual {p2}, Le/f0;->a()J

    move-result-wide v0

    iget-object p2, p0, Le/k0/h/d;->c:Le/v;

    iget-object v2, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {p2, v2}, Le/v;->n(Le/j;)V

    iget-object p2, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {p2, p1, v0, v1}, Le/k0/i/c;->d(Le/e0;J)Lf/s;

    move-result-object p1

    new-instance p2, Le/k0/h/d$a;

    invoke-direct {p2, p0, p1, v0, v1}, Le/k0/h/d$a;-><init>(Le/k0/h/d;Lf/s;J)V

    return-object p2
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->cancel()V

    iget-object v0, p0, Le/k0/h/d;->a:Le/k0/h/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Le/k0/h/k;->g(Le/k0/h/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public f()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Le/k0/h/d;->c:Le/v;

    iget-object v2, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v1, v2, v0}, Le/v;->o(Le/j;Ljava/io/IOException;)V

    invoke-virtual {p0, v0}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    throw v0
.end method

.method public g()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Le/k0/h/d;->c:Le/v;

    iget-object v2, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v1, v2, v0}, Le/v;->o(Le/j;Ljava/io/IOException;)V

    invoke-virtual {p0, v0}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    throw v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Le/k0/h/d;->f:Z

    return v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->h()Le/k0/h/f;

    move-result-object v0

    invoke-virtual {v0}, Le/k0/h/f;->p()V

    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Le/k0/h/d;->a:Le/k0/h/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Le/k0/h/k;->g(Le/k0/h/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public k(Le/g0;)Le/h0;
    .locals 4

    :try_start_0
    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1}, Le/v;->s(Le/j;)V

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v1, p1}, Le/k0/i/c;->e(Le/g0;)J

    move-result-wide v1

    iget-object v3, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v3, p1}, Le/k0/i/c;->f(Le/g0;)Lf/t;

    move-result-object p1

    new-instance v3, Le/k0/h/d$b;

    invoke-direct {v3, p0, p1, v1, v2}, Le/k0/h/d$b;-><init>(Le/k0/h/d;Lf/t;J)V

    new-instance p1, Le/k0/i/h;

    invoke-static {v3}, Lf/l;->b(Lf/t;)Lf/e;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Le/k0/i/h;-><init>(Ljava/lang/String;JLf/e;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1}, Le/v;->t(Le/j;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    throw p1
.end method

.method public l(Z)Le/g0$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0, p1}, Le/k0/i/c;->g(Z)Le/g0$a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {v0, p1, p0}, Le/k0/c;->g(Le/g0$a;Le/k0/h/d;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1}, Le/v;->t(Le/j;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    throw p1
.end method

.method public m(Le/g0;)V
    .locals 2

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1}, Le/v;->u(Le/j;Le/g0;)V

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1}, Le/v;->v(Le/j;)V

    return-void
.end method

.method o(Ljava/io/IOException;)V
    .locals 1

    iget-object v0, p0, Le/k0/h/d;->d:Le/k0/h/e;

    invoke-virtual {v0}, Le/k0/h/e;->h()V

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0}, Le/k0/i/c;->h()Le/k0/h/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k0/h/f;->v(Ljava/io/IOException;)V

    return-void
.end method

.method public p(Le/e0;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1}, Le/v;->q(Le/j;)V

    iget-object v0, p0, Le/k0/h/d;->e:Le/k0/i/c;

    invoke-interface {v0, p1}, Le/k0/i/c;->b(Le/e0;)V

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1}, Le/v;->p(Le/j;Le/e0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Le/k0/h/d;->c:Le/v;

    iget-object v1, p0, Le/k0/h/d;->b:Le/j;

    invoke-virtual {v0, v1, p1}, Le/v;->o(Le/j;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Le/k0/h/d;->o(Ljava/io/IOException;)V

    throw p1
.end method
