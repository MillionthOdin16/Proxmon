.class public final Le/k0/g/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z;


# instance fields
.field final a:Le/k0/g/d;


# direct methods
.method public constructor <init>(Le/k0/g/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/g/a;->a:Le/k0/g/d;

    return-void
.end method

.method private b(Le/k0/g/b;Le/g0;)Le/g0;
    .locals 4

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-interface {p1}, Le/k0/g/b;->b()Lf/s;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p2}, Le/g0;->r()Le/h0;

    move-result-object v1

    invoke-virtual {v1}, Le/h0;->E()Lf/e;

    move-result-object v1

    invoke-static {v0}, Lf/l;->a(Lf/s;)Lf/d;

    move-result-object v0

    new-instance v2, Le/k0/g/a$a;

    invoke-direct {v2, p0, v1, p1, v0}, Le/k0/g/a$a;-><init>(Le/k0/g/a;Lf/e;Le/k0/g/b;Lf/d;)V

    const-string p1, "Content-Type"

    invoke-virtual {p2, p1}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Le/g0;->r()Le/h0;

    move-result-object v0

    invoke-virtual {v0}, Le/h0;->B()J

    move-result-wide v0

    invoke-virtual {p2}, Le/g0;->G()Le/g0$a;

    move-result-object p2

    new-instance v3, Le/k0/i/h;

    invoke-static {v2}, Lf/l;->b(Lf/t;)Lf/e;

    move-result-object v2

    invoke-direct {v3, p1, v0, v1, v2}, Le/k0/i/h;-><init>(Ljava/lang/String;JLf/e;)V

    invoke-virtual {p2, v3}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    invoke-virtual {p2}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    return-object p1
.end method

.method private static c(Le/x;Le/x;)Le/x;
    .locals 7

    new-instance v0, Le/x$a;

    invoke-direct {v0}, Le/x$a;-><init>()V

    invoke-virtual {p0}, Le/x;->h()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, v3}, Le/x;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v4}, Le/k0/g/a;->d(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v4}, Le/k0/g/a;->e(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v4}, Le/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    sget-object v6, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {v6, v0, v4, v5}, Le/k0/c;->b(Le/x$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Le/x;->h()I

    move-result p0

    :goto_2
    if-ge v2, p0, :cond_5

    invoke-virtual {p1, v2}, Le/x;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Le/k0/g/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Le/k0/g/a;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {p1, v2}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v4}, Le/k0/c;->b(Le/x$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Le/x$a;->d()Le/x;

    move-result-object p0

    return-object p0
.end method

.method static d(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Content-Length"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Type"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method static e(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static f(Le/g0;)Le/g0;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Le/g0;->r()Le/h0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/g0;->G()Le/g0$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    invoke-virtual {p0}, Le/g0$a;->c()Le/g0;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Le/z$a;)Le/g0;
    .locals 5

    iget-object v0, p0, Le/k0/g/a;->a:Le/k0/g/d;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Le/z$a;->c()Le/e0;

    move-result-object v1

    invoke-interface {v0, v1}, Le/k0/g/d;->b(Le/e0;)Le/g0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Le/k0/g/c$a;

    invoke-interface {p1}, Le/z$a;->c()Le/e0;

    move-result-object v4

    invoke-direct {v3, v1, v2, v4, v0}, Le/k0/g/c$a;-><init>(JLe/e0;Le/g0;)V

    invoke-virtual {v3}, Le/k0/g/c$a;->c()Le/k0/g/c;

    move-result-object v1

    iget-object v2, v1, Le/k0/g/c;->a:Le/e0;

    iget-object v3, v1, Le/k0/g/c;->b:Le/g0;

    iget-object v4, p0, Le/k0/g/a;->a:Le/k0/g/d;

    if-eqz v4, :cond_1

    invoke-interface {v4, v1}, Le/k0/g/d;->d(Le/k0/g/c;)V

    :cond_1
    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    invoke-virtual {v0}, Le/g0;->r()Le/h0;

    move-result-object v1

    invoke-static {v1}, Le/k0/e;->e(Ljava/io/Closeable;)V

    :cond_2
    if-nez v2, :cond_3

    if-nez v3, :cond_3

    new-instance v0, Le/g0$a;

    invoke-direct {v0}, Le/g0$a;-><init>()V

    invoke-interface {p1}, Le/z$a;->c()Le/e0;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    sget-object p1, Le/c0;->d:Le/c0;

    invoke-virtual {v0, p1}, Le/g0$a;->o(Le/c0;)Le/g0$a;

    const/16 p1, 0x1f8

    invoke-virtual {v0, p1}, Le/g0$a;->g(I)Le/g0$a;

    const-string p1, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {v0, p1}, Le/g0$a;->l(Ljava/lang/String;)Le/g0$a;

    sget-object p1, Le/k0/e;->d:Le/h0;

    invoke-virtual {v0, p1}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Le/g0$a;->r(J)Le/g0$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/g0$a;->p(J)Le/g0$a;

    invoke-virtual {v0}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    invoke-virtual {v3}, Le/g0;->G()Le/g0$a;

    move-result-object p1

    invoke-static {v3}, Le/k0/g/a;->f(Le/g0;)Le/g0;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/g0$a;->d(Le/g0;)Le/g0$a;

    invoke-virtual {p1}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    return-object p1

    :cond_4
    :try_start_0
    invoke-interface {p1, v2}, Le/z$a;->b(Le/e0;)Le/g0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_5

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Le/g0;->r()Le/h0;

    move-result-object v0

    invoke-static {v0}, Le/k0/e;->e(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v3, :cond_7

    invoke-virtual {p1}, Le/g0;->B()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Le/g0;->G()Le/g0$a;

    move-result-object v0

    invoke-virtual {v3}, Le/g0;->F()Le/x;

    move-result-object v1

    invoke-virtual {p1}, Le/g0;->F()Le/x;

    move-result-object v2

    invoke-static {v1, v2}, Le/k0/g/a;->c(Le/x;Le/x;)Le/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/g0$a;->j(Le/x;)Le/g0$a;

    invoke-virtual {p1}, Le/g0;->K()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/g0$a;->r(J)Le/g0$a;

    invoke-virtual {p1}, Le/g0;->I()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/g0$a;->p(J)Le/g0$a;

    invoke-static {v3}, Le/k0/g/a;->f(Le/g0;)Le/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/g0$a;->d(Le/g0;)Le/g0$a;

    invoke-static {p1}, Le/k0/g/a;->f(Le/g0;)Le/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/g0$a;->m(Le/g0;)Le/g0$a;

    invoke-virtual {v0}, Le/g0$a;->c()Le/g0;

    move-result-object v0

    invoke-virtual {p1}, Le/g0;->r()Le/h0;

    move-result-object p1

    invoke-virtual {p1}, Le/h0;->close()V

    iget-object p1, p0, Le/k0/g/a;->a:Le/k0/g/d;

    invoke-interface {p1}, Le/k0/g/d;->c()V

    iget-object p1, p0, Le/k0/g/a;->a:Le/k0/g/d;

    invoke-interface {p1, v3, v0}, Le/k0/g/d;->a(Le/g0;Le/g0;)V

    return-object v0

    :cond_6
    invoke-virtual {v3}, Le/g0;->r()Le/h0;

    move-result-object v0

    invoke-static {v0}, Le/k0/e;->e(Ljava/io/Closeable;)V

    :cond_7
    invoke-virtual {p1}, Le/g0;->G()Le/g0$a;

    move-result-object v0

    invoke-static {v3}, Le/k0/g/a;->f(Le/g0;)Le/g0;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/g0$a;->d(Le/g0;)Le/g0$a;

    invoke-static {p1}, Le/k0/g/a;->f(Le/g0;)Le/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/g0$a;->m(Le/g0;)Le/g0$a;

    invoke-virtual {v0}, Le/g0$a;->c()Le/g0;

    move-result-object p1

    iget-object v0, p0, Le/k0/g/a;->a:Le/k0/g/d;

    if-eqz v0, :cond_9

    invoke-static {p1}, Le/k0/i/e;->c(Le/g0;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1, v2}, Le/k0/g/c;->a(Le/g0;Le/e0;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Le/k0/g/a;->a:Le/k0/g/d;

    invoke-interface {v0, p1}, Le/k0/g/d;->f(Le/g0;)Le/k0/g/b;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Le/k0/g/a;->b(Le/k0/g/b;Le/g0;)Le/g0;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-virtual {v2}, Le/e0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/k0/i/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    :try_start_1
    iget-object v0, p0, Le/k0/g/a;->a:Le/k0/g/d;

    invoke-interface {v0, v2}, Le/k0/g/d;->e(Le/e0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_9
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Le/g0;->r()Le/h0;

    move-result-object v0

    invoke-static {v0}, Le/k0/e;->e(Ljava/io/Closeable;)V

    :cond_a
    throw p1
.end method
