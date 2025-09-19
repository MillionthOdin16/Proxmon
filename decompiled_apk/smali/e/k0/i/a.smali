.class public final Le/k0/i/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z;


# instance fields
.field private final a:Le/r;


# direct methods
.method public constructor <init>(Le/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/i/a;->a:Le/r;

    return-void
.end method

.method private b(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/q;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    if-lez v2, :cond_0

    const-string v3, "; "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/q;

    invoke-virtual {v3}, Le/q;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Le/q;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Le/z$a;)Le/g0;
    .locals 9

    invoke-interface {p1}, Le/z$a;->c()Le/e0;

    move-result-object v0

    invoke-virtual {v0}, Le/e0;->g()Le/e0$a;

    move-result-object v1

    invoke-virtual {v0}, Le/e0;->a()Le/f0;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Length"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Le/f0;->b()Le/a0;

    move-result-object v6

    if-nez v6, :cond_1

    invoke-virtual {v2}, Le/f0;->a()J

    move-result-wide v6

    const-string v2, "Transfer-Encoding"

    cmp-long v8, v6, v3

    if-eqz v8, :cond_0

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    invoke-virtual {v1, v2}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    goto :goto_0

    :cond_0
    const-string v6, "chunked"

    invoke-virtual {v1, v2, v6}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    invoke-virtual {v1, v5}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Le/a0;->toString()Ljava/lang/String;

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_3

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v6

    invoke-static {v6, v7}, Le/k0/e;->q(Le/y;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    const-string v6, "Keep-Alive"

    invoke-virtual {v1, v2, v6}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "gzip"

    if-nez v6, :cond_5

    const-string v6, "Range"

    invoke-virtual {v0, v6}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    const/4 v7, 0x1

    invoke-virtual {v1, v2, v8}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    :cond_5
    iget-object v2, p0, Le/k0/i/a;->a:Le/r;

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v6

    invoke-interface {v2, v6}, Le/r;->a(Le/y;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-direct {p0, v2}, Le/k0/i/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "Cookie"

    invoke-virtual {v1, v6, v2}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    :cond_6
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    invoke-static {}, Le/k0/f;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    :cond_7
    invoke-virtual {v1}, Le/e0$a;->a()Le/e0;

    move-result-object v1

    invoke-interface {p1, v1}, Le/z$a;->b(Le/e0;)Le/g0;

    move-result-object p1

    iget-object v1, p0, Le/k0/i/a;->a:Le/r;

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v2

    invoke-virtual {p1}, Le/g0;->F()Le/x;

    move-result-object v6

    invoke-static {v1, v2, v6}, Le/k0/i/e;->e(Le/r;Le/y;Le/x;)V

    invoke-virtual {p1}, Le/g0;->G()Le/g0$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    if-eqz v7, :cond_8

    const-string v0, "Content-Encoding"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {p1}, Le/k0/i/e;->c(Le/g0;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Lf/j;

    invoke-virtual {p1}, Le/g0;->r()Le/h0;

    move-result-object v6

    invoke-virtual {v6}, Le/h0;->E()Lf/e;

    move-result-object v6

    invoke-direct {v2, v6}, Lf/j;-><init>(Lf/t;)V

    invoke-virtual {p1}, Le/g0;->F()Le/x;

    move-result-object v6

    invoke-virtual {v6}, Le/x;->f()Le/x$a;

    move-result-object v6

    invoke-virtual {v6, v0}, Le/x$a;->e(Ljava/lang/String;)Le/x$a;

    invoke-virtual {v6, v5}, Le/x$a;->e(Ljava/lang/String;)Le/x$a;

    invoke-virtual {v6}, Le/x$a;->d()Le/x;

    move-result-object v0

    invoke-virtual {v1, v0}, Le/g0$a;->j(Le/x;)Le/g0$a;

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Le/k0/i/h;

    invoke-static {v2}, Lf/l;->b(Lf/t;)Lf/e;

    move-result-object v2

    invoke-direct {v0, p1, v3, v4, v2}, Le/k0/i/h;-><init>(Ljava/lang/String;JLf/e;)V

    invoke-virtual {v1, v0}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    :cond_8
    invoke-virtual {v1}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    return-object p1
.end method
