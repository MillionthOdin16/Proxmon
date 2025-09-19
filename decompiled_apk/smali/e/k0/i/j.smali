.class public final Le/k0/i/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/z;


# instance fields
.field private final a:Le/b0;


# direct methods
.method public constructor <init>(Le/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/k0/i/j;->a:Le/b0;

    return-void
.end method

.method private b(Le/g0;Le/i0;)Le/e0;
    .locals 6

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Le/g0;->B()I

    move-result v0

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v1

    invoke-virtual {v1}, Le/e0;->f()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x133

    const-string v3, "GET"

    const/4 v4, 0x0

    if-eq v0, v2, :cond_c

    const/16 v2, 0x134

    if-eq v0, v2, :cond_c

    const/16 v2, 0x191

    if-eq v0, v2, :cond_b

    const/16 v2, 0x1f7

    if-eq v0, v2, :cond_8

    const/16 v2, 0x197

    if-eq v0, v2, :cond_5

    const/16 p2, 0x198

    if-eq v0, p2, :cond_0

    packed-switch v0, :pswitch_data_0

    return-object v4

    :cond_0
    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->A()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v4

    :cond_1
    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v0

    invoke-virtual {v0}, Le/e0;->a()Le/f0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Le/f0;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v4

    :cond_2
    invoke-virtual {p1}, Le/g0;->H()Le/g0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Le/g0;->H()Le/g0;

    move-result-object v0

    invoke-virtual {v0}, Le/g0;->B()I

    move-result v0

    if-ne v0, p2, :cond_3

    return-object v4

    :cond_3
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Le/k0/i/j;->f(Le/g0;I)I

    move-result p2

    if-lez p2, :cond_4

    return-object v4

    :cond_4
    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object p1

    return-object p1

    :cond_5
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v0

    goto :goto_0

    :cond_6
    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->w()Ljava/net/Proxy;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->x()Le/g;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Le/g;->a(Le/i0;Le/g0;)Le/e0;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p1}, Le/g0;->H()Le/g0;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Le/g0;->H()Le/g0;

    move-result-object p2

    invoke-virtual {p2}, Le/g0;->B()I

    move-result p2

    if-ne p2, v2, :cond_9

    return-object v4

    :cond_9
    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, Le/k0/i/j;->f(Le/g0;I)I

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v4

    :cond_b
    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->a()Le/g;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Le/g;->a(Le/i0;Le/g0;)Le/e0;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    const-string p2, "HEAD"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    return-object v4

    :cond_d
    :pswitch_0
    iget-object p2, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {p2}, Le/b0;->k()Z

    move-result p2

    if-nez p2, :cond_e

    return-object v4

    :cond_e
    const-string p2, "Location"

    invoke-virtual {p1, p2}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_f

    return-object v4

    :cond_f
    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v0

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v0

    invoke-virtual {v0, p2}, Le/y;->A(Ljava/lang/String;)Le/y;

    move-result-object p2

    if-nez p2, :cond_10

    return-object v4

    :cond_10
    invoke-virtual {p2}, Le/y;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v2

    invoke-virtual {v2}, Le/e0;->h()Le/y;

    move-result-object v2

    invoke-virtual {v2}, Le/y;->B()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->l()Z

    move-result v0

    if-nez v0, :cond_11

    return-object v4

    :cond_11
    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v0

    invoke-virtual {v0}, Le/e0;->g()Le/e0$a;

    move-result-object v0

    invoke-static {v1}, Le/k0/i/f;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-static {v1}, Le/k0/i/f;->d(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v1}, Le/k0/i/f;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual {v0, v3, v4}, Le/e0$a;->e(Ljava/lang/String;Le/f0;)Le/e0$a;

    goto :goto_1

    :cond_12
    if-eqz v2, :cond_13

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object v3

    invoke-virtual {v3}, Le/e0;->a()Le/f0;

    move-result-object v4

    :cond_13
    invoke-virtual {v0, v1, v4}, Le/e0$a;->e(Ljava/lang/String;Le/f0;)Le/e0$a;

    :goto_1
    if-nez v2, :cond_14

    const-string v1, "Transfer-Encoding"

    invoke-virtual {v0, v1}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    :cond_14
    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object p1

    invoke-virtual {p1}, Le/e0;->h()Le/y;

    move-result-object p1

    invoke-static {p1, p2}, Le/k0/e;->C(Le/y;Le/y;)Z

    move-result p1

    if-nez p1, :cond_15

    const-string p1, "Authorization"

    invoke-virtual {v0, p1}, Le/e0$a;->f(Ljava/lang/String;)Le/e0$a;

    :cond_15
    invoke-virtual {v0, p2}, Le/e0$a;->h(Le/y;)Le/e0$a;

    invoke-virtual {v0}, Le/e0$a;->a()Le/e0;

    move-result-object p1

    return-object p1

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private c(Ljava/io/IOException;Z)Z
    .locals 3

    instance-of v0, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/security/cert/CertificateException;

    if-eqz p2, :cond_3

    return v1

    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method private d(Ljava/io/IOException;Le/k0/h/k;ZLe/e0;)Z
    .locals 2

    iget-object v0, p0, Le/k0/i/j;->a:Le/b0;

    invoke-virtual {v0}, Le/b0;->A()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p3, :cond_1

    invoke-direct {p0, p1, p4}, Le/k0/i/j;->e(Ljava/io/IOException;Le/e0;)Z

    move-result p4

    if-eqz p4, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1, p3}, Le/k0/i/j;->c(Ljava/io/IOException;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p2}, Le/k0/h/k;->c()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private e(Ljava/io/IOException;Le/e0;)Z
    .locals 0

    invoke-virtual {p2}, Le/e0;->a()Le/f0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Le/f0;->f()Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private f(Le/g0;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    :cond_0
    const-string p2, "\\d+"

    invoke-virtual {p1, p2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7fffffff

    return p1
.end method


# virtual methods
.method public a(Le/z$a;)Le/g0;
    .locals 8

    invoke-interface {p1}, Le/z$a;->c()Le/e0;

    move-result-object v0

    check-cast p1, Le/k0/i/g;

    invoke-virtual {p1}, Le/k0/i/g;->h()Le/k0/h/k;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v3

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Le/k0/h/k;->m(Le/e0;)V

    invoke-virtual {v1}, Le/k0/h/k;->i()Z

    move-result v6

    if-nez v6, :cond_a

    :try_start_0
    invoke-virtual {p1, v0, v1, v3}, Le/k0/i/g;->g(Le/e0;Le/k0/h/k;Le/k0/h/d;)Le/g0;

    move-result-object v0
    :try_end_0
    .catch Le/k0/h/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Le/g0;->G()Le/g0$a;

    move-result-object v0

    invoke-virtual {v4}, Le/g0;->G()Le/g0$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    invoke-virtual {v4}, Le/g0$a;->c()Le/g0;

    move-result-object v4

    invoke-virtual {v0, v4}, Le/g0$a;->n(Le/g0;)Le/g0$a;

    invoke-virtual {v0}, Le/g0$a;->c()Le/g0;

    move-result-object v0

    :cond_0
    move-object v4, v0

    sget-object v0, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {v0, v4}, Le/k0/c;->f(Le/g0;)Le/k0/h/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Le/k0/h/d;->c()Le/k0/h/f;

    move-result-object v6

    invoke-virtual {v6}, Le/k0/h/f;->q()Le/i0;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v3

    :goto_1
    invoke-direct {p0, v4, v6}, Le/k0/i/j;->b(Le/g0;Le/i0;)Le/e0;

    move-result-object v6

    if-nez v6, :cond_3

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Le/k0/h/d;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Le/k0/h/k;->o()V

    :cond_2
    return-object v4

    :cond_3
    invoke-virtual {v6}, Le/e0;->a()Le/f0;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Le/f0;->f()Z

    move-result v7

    if-eqz v7, :cond_4

    return-object v4

    :cond_4
    invoke-virtual {v4}, Le/g0;->r()Le/h0;

    move-result-object v7

    invoke-static {v7}, Le/k0/e;->e(Ljava/io/Closeable;)V

    invoke-virtual {v1}, Le/k0/h/k;->h()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v0}, Le/k0/h/d;->e()V

    :cond_5
    add-int/lit8 v5, v5, 0x1

    const/16 v0, 0x14

    if-gt v5, v0, :cond_6

    move-object v0, v6

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many follow-up requests: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception v6

    :try_start_1
    instance-of v7, v6, Le/k0/k/a;

    if-nez v7, :cond_7

    const/4 v7, 0x1

    goto :goto_2

    :cond_7
    const/4 v7, 0x0

    :goto_2
    invoke-direct {p0, v6, v1, v7, v0}, Le/k0/i/j;->d(Ljava/io/IOException;Le/k0/h/k;ZLe/e0;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_3

    :cond_8
    throw v6

    :catch_1
    move-exception v6

    invoke-virtual {v6}, Le/k0/h/i;->c()Ljava/io/IOException;

    move-result-object v7

    invoke-direct {p0, v7, v1, v2, v0}, Le/k0/i/j;->d(Ljava/io/IOException;Le/k0/h/k;ZLe/e0;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_9

    :goto_3
    invoke-virtual {v1}, Le/k0/h/k;->f()V

    goto/16 :goto_0

    :cond_9
    :try_start_2
    invoke-virtual {v6}, Le/k0/h/i;->b()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    invoke-virtual {v1}, Le/k0/h/k;->f()V

    throw p1

    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method
