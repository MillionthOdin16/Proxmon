.class public final Le/k0/h/f;
.super Le/k0/k/f$j;
.source ""

# interfaces
.implements Le/n;


# instance fields
.field public final b:Le/k0/h/g;

.field private final c:Le/i0;

.field private d:Ljava/net/Socket;

.field private e:Ljava/net/Socket;

.field private f:Le/w;

.field private g:Le/c0;

.field private h:Le/k0/k/f;

.field private i:Lf/e;

.field private j:Lf/d;

.field k:Z

.field l:I

.field m:I

.field private n:I

.field private o:I

.field final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Le/k0/h/k;",
            ">;>;"
        }
    .end annotation
.end field

.field q:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Le/k0/h/g;Le/i0;)V
    .locals 2

    invoke-direct {p0}, Le/k0/k/f$j;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Le/k0/h/f;->o:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/k0/h/f;->p:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Le/k0/h/f;->q:J

    iput-object p1, p0, Le/k0/h/f;->b:Le/k0/h/g;

    iput-object p2, p0, Le/k0/h/f;->c:Le/i0;

    return-void
.end method

.method private e(IILe/j;Le/v;)V
    .locals 4

    iget-object v0, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Le/e;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p4, p3, v1, v0}, Le/v;->f(Le/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    iget-object p3, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object p2

    iget-object p3, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    iget-object p4, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {p4}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p2, p3, p4, p1}, Le/k0/l/f;->h(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object p1, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->h(Ljava/net/Socket;)Lf/t;

    move-result-object p1

    invoke-static {p1}, Lf/l;->b(Lf/t;)Lf/e;

    move-result-object p1

    iput-object p1, p0, Le/k0/h/f;->i:Lf/e;

    iget-object p1, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->e(Ljava/net/Socket;)Lf/s;

    move-result-object p1

    invoke-static {p1}, Lf/l;->a(Lf/s;)Lf/d;

    move-result-object p1

    iput-object p1, p0, Le/k0/h/f;->j:Lf/d;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {p4}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private f(Le/k0/h/c;)V
    .locals 7

    iget-object v0, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v4

    invoke-virtual {v4}, Le/y;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v5

    invoke-virtual {v5}, Le/y;->w()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Le/k0/h/c;->a(Ljavax/net/ssl/SSLSocket;)Le/p;

    move-result-object p1

    invoke-virtual {p1}, Le/p;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v3

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v4

    invoke-virtual {v4}, Le/y;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Le/e;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Le/k0/l/f;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-static {v3}, Le/w;->b(Ljavax/net/ssl/SSLSession;)Le/w;

    move-result-object v4

    invoke-virtual {v0}, Le/e;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v6

    invoke-virtual {v6}, Le/y;->l()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, Le/w;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Hostname "

    if-nez v2, :cond_1

    const/4 v2, 0x0

    :try_start_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le/l;->c(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Le/k0/n/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Le/e;->a()Le/l;

    move-result-object v3

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Le/w;->d()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Le/l;->a(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1}, Le/p;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Le/k0/l/f;->l(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iput-object v1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-static {v1}, Lf/l;->h(Ljava/net/Socket;)Lf/t;

    move-result-object p1

    invoke-static {p1}, Lf/l;->b(Lf/t;)Lf/e;

    move-result-object p1

    iput-object p1, p0, Le/k0/h/f;->i:Lf/e;

    iget-object p1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-static {p1}, Lf/l;->e(Ljava/net/Socket;)Lf/s;

    move-result-object p1

    invoke-static {p1}, Lf/l;->a(Lf/s;)Lf/d;

    move-result-object p1

    iput-object p1, p0, Le/k0/h/f;->j:Lf/d;

    iput-object v4, p0, Le/k0/h/f;->f:Le/w;

    if-eqz v2, :cond_4

    invoke-static {v2}, Le/c0;->a(Ljava/lang/String;)Le/c0;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, Le/c0;->d:Le/c0;

    :goto_0
    iput-object p1, p0, Le/k0/h/f;->g:Le/c0;
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_5

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Le/k0/l/f;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_1
    :try_start_3
    invoke-static {p1}, Le/k0/e;->y(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v2, :cond_7

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Le/k0/l/f;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_7
    invoke-static {v2}, Le/k0/e;->f(Ljava/net/Socket;)V

    throw p1
.end method

.method private g(IIILe/j;Le/v;)V
    .locals 6

    invoke-direct {p0}, Le/k0/h/f;->i()Le/e0;

    move-result-object v0

    invoke-virtual {v0}, Le/e0;->h()Le/y;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    invoke-direct {p0, p1, p2, p4, p5}, Le/k0/h/f;->e(IILe/j;Le/v;)V

    invoke-direct {p0, p2, p3, v0, v1}, Le/k0/h/f;->h(IILe/e0;Le/y;)Le/e0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-static {v3}, Le/k0/e;->f(Ljava/net/Socket;)V

    const/4 v3, 0x0

    iput-object v3, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    iput-object v3, p0, Le/k0/h/f;->j:Lf/d;

    iput-object v3, p0, Le/k0/h/f;->i:Lf/e;

    iget-object v4, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v4}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v5}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Le/v;->d(Le/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/c0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private h(IILe/e0;Le/y;)Le/e0;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Le/k0/e;->q(Le/y;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    new-instance v0, Le/k0/j/a;

    iget-object v1, p0, Le/k0/h/f;->i:Lf/e;

    iget-object v2, p0, Le/k0/h/f;->j:Lf/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Le/k0/j/a;-><init>(Le/b0;Le/k0/h/f;Lf/e;Lf/d;)V

    iget-object v1, p0, Le/k0/h/f;->i:Lf/e;

    invoke-interface {v1}, Lf/t;->b()Lf/u;

    move-result-object v1

    int-to-long v4, p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    iget-object v1, p0, Le/k0/h/f;->j:Lf/d;

    invoke-interface {v1}, Lf/s;->b()Lf/u;

    move-result-object v1

    int-to-long v4, p2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    invoke-virtual {p3}, Le/e0;->d()Le/x;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Le/k0/j/a;->B(Le/x;Ljava/lang/String;)V

    invoke-virtual {v0}, Le/k0/j/a;->a()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/k0/j/a;->g(Z)Le/g0$a;

    move-result-object v1

    invoke-virtual {v1, p3}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    invoke-virtual {v1}, Le/g0$a;->c()Le/g0;

    move-result-object p3

    invoke-virtual {v0, p3}, Le/k0/j/a;->A(Le/g0;)V

    invoke-virtual {p3}, Le/g0;->B()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_3

    const/16 v1, 0x197

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->h()Le/g;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-interface {v0, v1, p3}, Le/g;->a(Le/i0;Le/g0;)Le/e0;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Connection"

    invoke-virtual {p3, v1}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "close"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Le/g0;->B()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, p0, Le/k0/h/f;->i:Lf/e;

    invoke-interface {p1}, Lf/e;->u()Lf/c;

    move-result-object p1

    invoke-virtual {p1}, Lf/c;->v()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Le/k0/h/f;->j:Lf/d;

    invoke-interface {p1}, Lf/d;->a()Lf/c;

    move-result-object p1

    invoke-virtual {p1}, Lf/c;->v()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v3

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private i()Le/e0;
    .locals 4

    new-instance v0, Le/e0$a;

    invoke-direct {v0}, Le/e0$a;-><init>()V

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/e0$a;->h(Le/y;)Le/e0$a;

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Le/e0$a;->e(Ljava/lang/String;Le/f0;)Le/e0$a;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Le/k0/e;->q(Le/y;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    invoke-static {}, Le/k0/f;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Le/e0$a;->c(Ljava/lang/String;Ljava/lang/String;)Le/e0$a;

    invoke-virtual {v0}, Le/e0$a;->a()Le/e0;

    move-result-object v0

    new-instance v1, Le/g0$a;

    invoke-direct {v1}, Le/g0$a;-><init>()V

    invoke-virtual {v1, v0}, Le/g0$a;->q(Le/e0;)Le/g0$a;

    sget-object v2, Le/c0;->d:Le/c0;

    invoke-virtual {v1, v2}, Le/g0$a;->o(Le/c0;)Le/g0$a;

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, Le/g0$a;->g(I)Le/g0$a;

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, Le/g0$a;->l(Ljava/lang/String;)Le/g0$a;

    sget-object v2, Le/k0/e;->d:Le/h0;

    invoke-virtual {v1, v2}, Le/g0$a;->b(Le/h0;)Le/g0$a;

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, Le/g0$a;->r(J)Le/g0$a;

    invoke-virtual {v1, v2, v3}, Le/g0$a;->p(J)Le/g0$a;

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, Le/g0$a;->i(Ljava/lang/String;Ljava/lang/String;)Le/g0$a;

    invoke-virtual {v1}, Le/g0$a;->c()Le/g0;

    move-result-object v1

    iget-object v2, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v2}, Le/i0;->a()Le/e;

    move-result-object v2

    invoke-virtual {v2}, Le/e;->h()Le/g;

    move-result-object v2

    iget-object v3, p0, Le/k0/h/f;->c:Le/i0;

    invoke-interface {v2, v3, v1}, Le/g;->a(Le/i0;Le/g0;)Le/e0;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method private j(Le/k0/h/c;ILe/j;Le/v;)V
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {p1}, Le/i0;->a()Le/e;

    move-result-object p1

    invoke-virtual {p1}, Le/e;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Le/c0;->g:Le/c0;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    iput-object p1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    sget-object p1, Le/c0;->g:Le/c0;

    iput-object p1, p0, Le/k0/h/f;->g:Le/c0;

    invoke-direct {p0, p2}, Le/k0/h/f;->t(I)V

    return-void

    :cond_0
    iget-object p1, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    iput-object p1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    sget-object p1, Le/c0;->d:Le/c0;

    iput-object p1, p0, Le/k0/h/f;->g:Le/c0;

    return-void

    :cond_1
    invoke-virtual {p4, p3}, Le/v;->x(Le/j;)V

    invoke-direct {p0, p1}, Le/k0/h/f;->f(Le/k0/h/c;)V

    iget-object p1, p0, Le/k0/h/f;->f:Le/w;

    invoke-virtual {p4, p3, p1}, Le/v;->w(Le/j;Le/w;)V

    iget-object p1, p0, Le/k0/h/f;->g:Le/c0;

    sget-object p3, Le/c0;->f:Le/c0;

    if-ne p1, p3, :cond_2

    invoke-direct {p0, p2}, Le/k0/h/f;->t(I)V

    :cond_2
    return-void
.end method

.method private r(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/i0;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/i0;

    invoke-virtual {v3}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v4}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v4}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-virtual {v3}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private t(I)V
    .locals 5

    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v0, Le/k0/k/f$h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le/k0/k/f$h;-><init>(Z)V

    iget-object v1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    iget-object v2, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v2}, Le/i0;->a()Le/e;

    move-result-object v2

    invoke-virtual {v2}, Le/e;->l()Le/y;

    move-result-object v2

    invoke-virtual {v2}, Le/y;->l()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Le/k0/h/f;->i:Lf/e;

    iget-object v4, p0, Le/k0/h/f;->j:Lf/d;

    invoke-virtual {v0, v1, v2, v3, v4}, Le/k0/k/f$h;->d(Ljava/net/Socket;Ljava/lang/String;Lf/e;Lf/d;)Le/k0/k/f$h;

    invoke-virtual {v0, p0}, Le/k0/k/f$h;->b(Le/k0/k/f$j;)Le/k0/k/f$h;

    invoke-virtual {v0, p1}, Le/k0/k/f$h;->c(I)Le/k0/k/f$h;

    invoke-virtual {v0}, Le/k0/k/f$h;->a()Le/k0/k/f;

    move-result-object p1

    iput-object p1, p0, Le/k0/h/f;->h:Le/k0/k/f;

    invoke-virtual {p1}, Le/k0/k/f;->a0()V

    return-void
.end method


# virtual methods
.method public a(Le/k0/k/f;)V
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Le/k0/k/f;->O()I

    move-result p1

    iput p1, p0, Le/k0/h/f;->o:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Le/k0/k/i;)V
    .locals 2

    sget-object v0, Le/k0/k/b;->g:Le/k0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Le/k0/k/i;->d(Le/k0/k/b;Ljava/io/IOException;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-static {v0}, Le/k0/e;->f(Ljava/net/Socket;)V

    return-void
.end method

.method public d(IIIIZLe/j;Le/v;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    iget-object v0, v7, Le/k0/h/f;->g:Le/c0;

    if-nez v0, :cond_b

    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->b()Ljava/util/List;

    move-result-object v0

    new-instance v10, Le/k0/h/c;

    invoke-direct {v10, v0}, Le/k0/h/c;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Le/p;->h:Le/p;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/k0/l/f;->n(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Le/k0/h/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Le/k0/h/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Le/c0;->g:Le/c0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    :goto_1
    :try_start_0
    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v6}, Le/k0/h/f;->g(IIILe/j;Le/v;)V

    iget-object v0, v7, Le/k0/h/f;->d:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    goto :goto_2

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    :try_start_1
    invoke-direct {v7, v13, v14, v8, v9}, Le/k0/h/f;->e(IILe/j;Le/v;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move/from16 v15, p4

    :try_start_2
    invoke-direct {v7, v10, v15, v8, v9}, Le/k0/h/f;->j(Le/k0/h/c;ILe/j;Le/v;)V

    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Le/k0/h/f;->g:Le/c0;

    invoke-virtual {v9, v8, v0, v1, v2}, Le/v;->d(Le/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/c0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    iget-object v0, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v0}, Le/i0;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Le/k0/h/f;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    new-instance v1, Le/k0/h/i;

    invoke-direct {v1, v0}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_6
    :goto_4
    iget-object v0, v7, Le/k0/h/f;->h:Le/k0/k/f;

    if-eqz v0, :cond_7

    iget-object v1, v7, Le/k0/h/f;->b:Le/k0/h/g;

    monitor-enter v1

    :try_start_3
    iget-object v0, v7, Le/k0/h/f;->h:Le/k0/k/f;

    invoke-virtual {v0}, Le/k0/k/f;->O()I

    move-result v0

    iput v0, v7, Le/k0/h/f;->o:I

    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_7
    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_6
    move/from16 v15, p4

    :goto_7
    iget-object v1, v7, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-static {v1}, Le/k0/e;->f(Ljava/net/Socket;)V

    iget-object v1, v7, Le/k0/h/f;->d:Ljava/net/Socket;

    invoke-static {v1}, Le/k0/e;->f(Ljava/net/Socket;)V

    iput-object v11, v7, Le/k0/h/f;->e:Ljava/net/Socket;

    iput-object v11, v7, Le/k0/h/f;->d:Ljava/net/Socket;

    iput-object v11, v7, Le/k0/h/f;->i:Lf/e;

    iput-object v11, v7, Le/k0/h/f;->j:Lf/d;

    iput-object v11, v7, Le/k0/h/f;->f:Le/w;

    iput-object v11, v7, Le/k0/h/f;->g:Le/c0;

    iput-object v11, v7, Le/k0/h/f;->h:Le/k0/k/f;

    iget-object v1, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Le/v;->e(Le/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Le/c0;Ljava/io/IOException;)V

    if-nez v12, :cond_8

    new-instance v12, Le/k0/h/i;

    invoke-direct {v12, v0}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v12, v0}, Le/k0/h/i;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_9

    invoke-virtual {v10, v0}, Le/k0/h/c;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    :cond_9
    throw v12

    :cond_a
    new-instance v0, Le/k0/h/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Le/k0/h/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method public k()Le/w;
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->f:Le/w;

    return-object v0
.end method

.method l(Le/e;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/e;",
            "Ljava/util/List<",
            "Le/i0;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Le/k0/h/f;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Le/k0/h/f;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_7

    iget-boolean v0, p0, Le/k0/h/f;->k:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le/k0/c;->a:Le/k0/c;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Le/k0/c;->e(Le/e;Le/e;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Le/k0/h/f;->q()Le/i0;

    move-result-object v1

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v1}, Le/y;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Le/k0/h/f;->h:Le/k0/k/f;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_7

    invoke-direct {p0, p2}, Le/k0/h/f;->r(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Le/e;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Le/k0/n/d;->a:Le/k0/n/d;

    if-eq p2, v0, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1}, Le/e;->l()Le/y;

    move-result-object p2

    invoke-virtual {p0, p2}, Le/k0/h/f;->u(Le/y;)Z

    move-result p2

    if-nez p2, :cond_6

    return v2

    :cond_6
    :try_start_0
    invoke-virtual {p1}, Le/e;->a()Le/l;

    move-result-object p2

    invoke-virtual {p1}, Le/e;->l()Le/y;

    move-result-object p1

    invoke-virtual {p1}, Le/y;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Le/k0/h/f;->k()Le/w;

    move-result-object v0

    invoke-virtual {v0}, Le/w;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Le/l;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_7
    :goto_0
    return v2
.end method

.method public m(Z)Z
    .locals 4

    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/k0/h/f;->h:Le/k0/k/f;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Le/k0/k/f;->N(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    :try_start_0
    iget-object p1, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v2, p0, Le/k0/h/f;->i:Lf/e;

    invoke-interface {v2}, Lf/e;->v()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    :try_start_2
    iget-object v2, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v2, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->h:Le/k0/k/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method o(Le/b0;Le/z$a;)Le/k0/i/c;
    .locals 4

    iget-object v0, p0, Le/k0/h/f;->h:Le/k0/k/f;

    if-eqz v0, :cond_0

    new-instance v0, Le/k0/k/g;

    iget-object v1, p0, Le/k0/h/f;->h:Le/k0/k/f;

    invoke-direct {v0, p1, p0, p2, v1}, Le/k0/k/g;-><init>(Le/b0;Le/k0/h/f;Le/z$a;Le/k0/k/f;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    invoke-interface {p2}, Le/z$a;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, p0, Le/k0/h/f;->i:Lf/e;

    invoke-interface {v0}, Lf/t;->b()Lf/u;

    move-result-object v0

    invoke-interface {p2}, Le/z$a;->e()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    iget-object v0, p0, Le/k0/h/f;->j:Lf/d;

    invoke-interface {v0}, Lf/s;->b()Lf/u;

    move-result-object v0

    invoke-interface {p2}, Le/z$a;->a()I

    move-result p2

    int-to-long v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p2}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    new-instance p2, Le/k0/j/a;

    iget-object v0, p0, Le/k0/h/f;->i:Lf/e;

    iget-object v1, p0, Le/k0/h/f;->j:Lf/d;

    invoke-direct {p2, p1, p0, v0, v1}, Le/k0/j/a;-><init>(Le/b0;Le/k0/h/f;Lf/e;Lf/d;)V

    return-object p2
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Le/k0/h/f;->b:Le/k0/h/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le/k0/h/f;->k:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public q()Le/i0;
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->c:Le/i0;

    return-object v0
.end method

.method public s()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Le/k0/h/f;->e:Ljava/net/Socket;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v1}, Le/y;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v1}, Le/y;->w()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->f:Le/w;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Le/w;->a()Le/m;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/k0/h/f;->g:Le/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Le/y;)Z
    .locals 4

    invoke-virtual {p1}, Le/y;->w()I

    move-result v0

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v1}, Le/y;->w()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Le/y;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1}, Le/i0;->a()Le/e;

    move-result-object v1

    invoke-virtual {v1}, Le/e;->l()Le/y;

    move-result-object v1

    invoke-virtual {v1}, Le/y;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Le/k0/h/f;->f:Le/w;

    if-eqz v0, :cond_1

    sget-object v0, Le/k0/n/d;->a:Le/k0/n/d;

    invoke-virtual {p1}, Le/y;->l()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Le/k0/h/f;->f:Le/w;

    invoke-virtual {v3}, Le/w;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, v3}, Le/k0/n/d;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method v(Ljava/io/IOException;)V
    .locals 4

    iget-object v0, p0, Le/k0/h/f;->b:Le/k0/h/g;

    monitor-enter v0

    :try_start_0
    instance-of v1, p1, Le/k0/k/n;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    check-cast p1, Le/k0/k/n;

    iget-object p1, p1, Le/k0/k/n;->b:Le/k0/k/b;

    sget-object v1, Le/k0/k/b;->g:Le/k0/k/b;

    if-ne p1, v1, :cond_0

    iget p1, p0, Le/k0/h/f;->n:I

    add-int/2addr p1, v2

    iput p1, p0, Le/k0/h/f;->n:I

    if-le p1, v2, :cond_4

    iput-boolean v2, p0, Le/k0/h/f;->k:Z

    iget p1, p0, Le/k0/h/f;->l:I

    :goto_0
    add-int/2addr p1, v2

    iput p1, p0, Le/k0/h/f;->l:I

    goto :goto_1

    :cond_0
    sget-object v1, Le/k0/k/b;->h:Le/k0/k/b;

    if-eq p1, v1, :cond_4

    iput-boolean v2, p0, Le/k0/h/f;->k:Z

    iget p1, p0, Le/k0/h/f;->l:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Le/k0/h/f;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Le/k0/k/a;

    if-eqz v1, :cond_4

    :cond_2
    iput-boolean v2, p0, Le/k0/h/f;->k:Z

    iget v1, p0, Le/k0/h/f;->m:I

    if-nez v1, :cond_4

    if-eqz p1, :cond_3

    iget-object v1, p0, Le/k0/h/f;->b:Le/k0/h/g;

    iget-object v3, p0, Le/k0/h/f;->c:Le/i0;

    invoke-virtual {v1, v3, p1}, Le/k0/h/g;->b(Le/i0;Ljava/io/IOException;)V

    :cond_3
    iget p1, p0, Le/k0/h/f;->l:I

    goto :goto_0

    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method
