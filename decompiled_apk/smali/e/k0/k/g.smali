.class public final Le/k0/k/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/k0/i/c;


# static fields
.field private static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Le/z$a;

.field private final b:Le/k0/h/f;

.field private final c:Le/k0/k/f;

.field private volatile d:Le/k0/k/i;

.field private final e:Le/c0;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/k0/e;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/k0/k/g;->g:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/k0/e;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/k0/k/g;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Le/b0;Le/k0/h/f;Le/z$a;Le/k0/k/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le/k0/k/g;->b:Le/k0/h/f;

    iput-object p3, p0, Le/k0/k/g;->a:Le/z$a;

    iput-object p4, p0, Le/k0/k/g;->c:Le/k0/k/f;

    invoke-virtual {p1}, Le/b0;->v()Ljava/util/List;

    move-result-object p1

    sget-object p2, Le/c0;->g:Le/c0;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Le/c0;->g:Le/c0;

    goto :goto_0

    :cond_0
    sget-object p1, Le/c0;->f:Le/c0;

    :goto_0
    iput-object p1, p0, Le/k0/k/g;->e:Le/c0;

    return-void
.end method

.method public static i(Le/e0;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/e0;",
            ")",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Le/e0;->d()Le/x;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Le/x;->h()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Le/k0/k/c;

    sget-object v3, Le/k0/k/c;->f:Lf/f;

    invoke-virtual {p0}, Le/e0;->f()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Le/k0/k/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Le/k0/k/c;

    sget-object v3, Le/k0/k/c;->g:Lf/f;

    invoke-virtual {p0}, Le/e0;->h()Le/y;

    move-result-object v4

    invoke-static {v4}, Le/k0/i/i;->c(Le/y;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Le/k0/k/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v2, "Host"

    invoke-virtual {p0, v2}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Le/k0/k/c;

    sget-object v4, Le/k0/k/c;->i:Lf/f;

    invoke-direct {v3, v4, v2}, Le/k0/k/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Le/k0/k/c;

    sget-object v3, Le/k0/k/c;->h:Lf/f;

    invoke-virtual {p0}, Le/e0;->h()Le/y;

    move-result-object p0

    invoke-virtual {p0}, Le/y;->B()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Le/k0/k/c;-><init>(Lf/f;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x0

    invoke-virtual {v0}, Le/x;->h()I

    move-result v2

    :goto_0
    if-ge p0, v2, :cond_3

    invoke-virtual {v0, p0}, Le/x;->e(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Le/k0/k/g;->g:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "te"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, p0}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "trailers"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance v4, Le/k0/k/c;

    invoke-virtual {v0, p0}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Le/k0/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static j(Le/x;Le/c0;)Le/g0$a;
    .locals 7

    new-instance v0, Le/x$a;

    invoke-direct {v0}, Le/x$a;-><init>()V

    invoke-virtual {p0}, Le/x;->h()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, Le/x;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ":status"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP/1.1 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le/k0/i/k;->a(Ljava/lang/String;)Le/k0/i/k;

    move-result-object v2

    goto :goto_1

    :cond_0
    sget-object v6, Le/k0/k/g;->h:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    sget-object v6, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {v6, v0, v4, v5}, Le/k0/c;->b(Le/x$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    new-instance p0, Le/g0$a;

    invoke-direct {p0}, Le/g0$a;-><init>()V

    invoke-virtual {p0, p1}, Le/g0$a;->o(Le/c0;)Le/g0$a;

    iget p1, v2, Le/k0/i/k;->b:I

    invoke-virtual {p0, p1}, Le/g0$a;->g(I)Le/g0$a;

    iget-object p1, v2, Le/k0/i/k;->c:Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/g0$a;->l(Ljava/lang/String;)Le/g0$a;

    invoke-virtual {v0}, Le/x$a;->d()Le/x;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/g0$a;->j(Le/x;)Le/g0$a;

    return-object p0

    :cond_3
    new-instance p0, Ljava/net/ProtocolException;

    const-string p1, "Expected \':status\' header not present"

    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p0

    :goto_3
    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {v0}, Le/k0/k/i;->h()Lf/s;

    move-result-object v0

    invoke-interface {v0}, Lf/s;->close()V

    return-void
.end method

.method public b(Le/e0;)V
    .locals 3

    iget-object v0, p0, Le/k0/k/g;->d:Le/k0/k/i;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Le/k0/k/g;->i(Le/e0;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Le/k0/k/g;->c:Le/k0/k/f;

    invoke-virtual {v1, p1, v0}, Le/k0/k/f;->Q(Ljava/util/List;Z)Le/k0/k/i;

    move-result-object p1

    iput-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    iget-boolean p1, p0, Le/k0/k/g;->f:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {p1}, Le/k0/k/i;->l()Lf/u;

    move-result-object p1

    iget-object v0, p0, Le/k0/k/g;->a:Le/z$a;

    invoke-interface {v0}, Le/z$a;->e()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    iget-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {p1}, Le/k0/k/i;->r()Lf/u;

    move-result-object p1

    iget-object v0, p0, Le/k0/k/g;->a:Le/z$a;

    invoke-interface {v0}, Le/z$a;->a()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lf/u;->g(JLjava/util/concurrent/TimeUnit;)Lf/u;

    return-void

    :cond_2
    iget-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    sget-object v0, Le/k0/k/b;->h:Le/k0/k/b;

    invoke-virtual {p1, v0}, Le/k0/k/i;->f(Le/k0/k/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Le/k0/k/g;->c:Le/k0/k/f;

    invoke-virtual {v0}, Le/k0/k/f;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/k0/k/g;->f:Z

    iget-object v0, p0, Le/k0/k/g;->d:Le/k0/k/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/k0/k/g;->d:Le/k0/k/i;

    sget-object v1, Le/k0/k/b;->h:Le/k0/k/b;

    invoke-virtual {v0, v1}, Le/k0/k/i;->f(Le/k0/k/b;)V

    :cond_0
    return-void
.end method

.method public d(Le/e0;J)Lf/s;
    .locals 0

    iget-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {p1}, Le/k0/k/i;->h()Lf/s;

    move-result-object p1

    return-object p1
.end method

.method public e(Le/g0;)J
    .locals 2

    invoke-static {p1}, Le/k0/i/e;->b(Le/g0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f(Le/g0;)Lf/t;
    .locals 0

    iget-object p1, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {p1}, Le/k0/k/i;->i()Lf/t;

    move-result-object p1

    return-object p1
.end method

.method public g(Z)Le/g0$a;
    .locals 2

    iget-object v0, p0, Le/k0/k/g;->d:Le/k0/k/i;

    invoke-virtual {v0}, Le/k0/k/i;->p()Le/x;

    move-result-object v0

    iget-object v1, p0, Le/k0/k/g;->e:Le/c0;

    invoke-static {v0, v1}, Le/k0/k/g;->j(Le/x;Le/c0;)Le/g0$a;

    move-result-object v0

    if-eqz p1, :cond_0

    sget-object p1, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {p1, v0}, Le/k0/c;->d(Le/g0$a;)I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object v0
.end method

.method public h()Le/k0/h/f;
    .locals 1

    iget-object v0, p0, Le/k0/k/g;->b:Le/k0/h/f;

    return-object v0
.end method
