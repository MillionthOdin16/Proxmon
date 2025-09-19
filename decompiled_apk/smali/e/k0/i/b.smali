.class public final Le/k0/i/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le/k0/i/b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Le/z$a;)Le/g0;
    .locals 8

    check-cast p1, Le/k0/i/g;

    invoke-virtual {p1}, Le/k0/i/g;->f()Le/k0/h/d;

    move-result-object v0

    invoke-virtual {p1}, Le/k0/i/g;->c()Le/e0;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, p1}, Le/k0/h/d;->p(Le/e0;)V

    invoke-virtual {p1}, Le/e0;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/k0/i/f;->b(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v3, "Expect"

    invoke-virtual {p1, v3}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "100-continue"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Le/k0/h/d;->g()V

    invoke-virtual {v0}, Le/k0/h/d;->n()V

    invoke-virtual {v0, v6}, Le/k0/h/d;->l(Z)Le/g0$a;

    move-result-object v5

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v5, :cond_2

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v7

    invoke-virtual {v7}, Le/f0;->e()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v0}, Le/k0/h/d;->g()V

    invoke-virtual {v0, p1, v6}, Le/k0/h/d;->d(Le/e0;Z)Lf/s;

    move-result-object v6

    invoke-static {v6}, Lf/l;->a(Lf/s;)Lf/d;

    move-result-object v6

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v7

    invoke-virtual {v7, v6}, Le/f0;->g(Lf/d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1, v4}, Le/k0/h/d;->d(Le/e0;Z)Lf/s;

    move-result-object v6

    invoke-static {v6}, Lf/l;->a(Lf/s;)Lf/d;

    move-result-object v6

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v7

    invoke-virtual {v7, v6}, Le/f0;->g(Lf/d;)V

    invoke-interface {v6}, Lf/s;->close()V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Le/k0/h/d;->j()V

    invoke-virtual {v0}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object v6

    invoke-virtual {v6}, Le/k0/h/f;->n()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v0}, Le/k0/h/d;->i()V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Le/k0/h/d;->j()V

    const/4 v3, 0x0

    :cond_4
    :goto_1
    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v6

    invoke-virtual {v6}, Le/f0;->e()Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-virtual {v0}, Le/k0/h/d;->f()V

    :cond_6
    if-nez v3, :cond_7

    invoke-virtual {v0}, Le/k0/h/d;->n()V

    :cond_7
    if-nez v5, :cond_8

    invoke-virtual {v0, v4}, Le/k0/h/d;->l(Z)Le/g0$a;

    move-result-object v5

    :cond_8
    invoke-virtual {v5, p1}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    invoke-virtual {v0}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object v3

    invoke-virtual {v3}, Le/k0/h/f;->k()Le/w;

    move-result-object v3

    invoke-virtual {v5, v3}, Le/g0$a;->h(Le/w;)Le/g0$a;

    invoke-virtual {v5, v1, v2}, Le/g0$a;->r(J)Le/g0$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Le/g0$a;->p(J)Le/g0$a;

    invoke-virtual {v5}, Le/g0$a;->c()Le/g0;

    move-result-object v3

    invoke-virtual {v3}, Le/g0;->B()I

    move-result v5

    const/16 v6, 0x64

    if-ne v5, v6, :cond_9

    invoke-virtual {v0, v4}, Le/k0/h/d;->l(Z)Le/g0$a;

    move-result-object v3

    invoke-virtual {v3, p1}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    invoke-virtual {v0}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object p1

    invoke-virtual {p1}, Le/k0/h/f;->k()Le/w;

    move-result-object p1

    invoke-virtual {v3, p1}, Le/g0$a;->h(Le/w;)Le/g0$a;

    invoke-virtual {v3, v1, v2}, Le/g0$a;->r(J)Le/g0$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v3, v1, v2}, Le/g0$a;->p(J)Le/g0$a;

    invoke-virtual {v3}, Le/g0$a;->c()Le/g0;

    move-result-object v3

    invoke-virtual {v3}, Le/g0;->B()I

    move-result v5

    :cond_9
    invoke-virtual {v0, v3}, Le/k0/h/d;->m(Le/g0;)V

    iget-boolean p1, p0, Le/k0/i/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v5, p1, :cond_a

    invoke-virtual {v3}, Le/g0;->G()Le/g0$a;

    move-result-object p1

    sget-object v1, Le/k0/e;->d:Le/h0;

    goto :goto_2

    :cond_a
    invoke-virtual {v3}, Le/g0;->G()Le/g0$a;

    move-result-object p1

    invoke-virtual {v0, v3}, Le/k0/h/d;->k(Le/g0;)Le/h0;

    move-result-object v1

    :goto_2
    invoke-virtual {p1, v1}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    invoke-virtual {p1}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "close"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {p1, v2}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    invoke-virtual {v0}, Le/k0/h/d;->i()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v5, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v5, v0, :cond_e

    :cond_d
    invoke-virtual {p1}, Le/g0;->r()Le/h0;

    move-result-object v0

    invoke-virtual {v0}, Le/h0;->B()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_f

    :cond_e
    return-object p1

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/g0;->r()Le/h0;

    move-result-object p1

    invoke-virtual {p1}, Le/h0;->B()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
