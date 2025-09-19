.class public final Le/k0/j/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/k0/i/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/k0/j/a$g;,
        Le/k0/j/a$d;,
        Le/k0/j/a$e;,
        Le/k0/j/a$b;,
        Le/k0/j/a$c;,
        Le/k0/j/a$f;
    }
.end annotation


# instance fields
.field private final a:Le/b0;

.field private final b:Le/k0/h/f;

.field private final c:Lf/e;

.field private final d:Lf/d;

.field private e:I

.field private f:J

.field private g:Le/x;


# direct methods
.method public constructor <init>(Le/b0;Le/k0/h/f;Lf/e;Lf/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Le/k0/j/a;->e:I

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Le/k0/j/a;->f:J

    iput-object p1, p0, Le/k0/j/a;->a:Le/b0;

    iput-object p2, p0, Le/k0/j/a;->b:Le/k0/h/f;

    iput-object p3, p0, Le/k0/j/a;->c:Lf/e;

    iput-object p4, p0, Le/k0/j/a;->d:Lf/d;

    return-void
.end method

.method static synthetic i(Le/k0/j/a;)Le/b0;
    .locals 0

    iget-object p0, p0, Le/k0/j/a;->a:Le/b0;

    return-object p0
.end method

.method static synthetic j(Le/k0/j/a;)Lf/d;
    .locals 0

    iget-object p0, p0, Le/k0/j/a;->d:Lf/d;

    return-object p0
.end method

.method static synthetic k(Le/k0/j/a;Lf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Le/k0/j/a;->s(Lf/i;)V

    return-void
.end method

.method static synthetic l(Le/k0/j/a;)I
    .locals 0

    iget p0, p0, Le/k0/j/a;->e:I

    return p0
.end method

.method static synthetic m(Le/k0/j/a;I)I
    .locals 0

    iput p1, p0, Le/k0/j/a;->e:I

    return p1
.end method

.method static synthetic n(Le/k0/j/a;)Lf/e;
    .locals 0

    iget-object p0, p0, Le/k0/j/a;->c:Lf/e;

    return-object p0
.end method

.method static synthetic o(Le/k0/j/a;)Le/k0/h/f;
    .locals 0

    iget-object p0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    return-object p0
.end method

.method static synthetic p(Le/k0/j/a;)Le/x;
    .locals 0

    iget-object p0, p0, Le/k0/j/a;->g:Le/x;

    return-object p0
.end method

.method static synthetic q(Le/k0/j/a;Le/x;)Le/x;
    .locals 0

    iput-object p1, p0, Le/k0/j/a;->g:Le/x;

    return-object p1
.end method

.method static synthetic r(Le/k0/j/a;)Le/x;
    .locals 0

    invoke-direct {p0}, Le/k0/j/a;->z()Le/x;

    move-result-object p0

    return-object p0
.end method

.method private s(Lf/i;)V
    .locals 2

    invoke-virtual {p1}, Lf/i;->i()Lf/u;

    move-result-object v0

    sget-object v1, Lf/u;->d:Lf/u;

    invoke-virtual {p1, v1}, Lf/i;->j(Lf/u;)Lf/i;

    invoke-virtual {v0}, Lf/u;->a()Lf/u;

    invoke-virtual {v0}, Lf/u;->b()Lf/u;

    return-void
.end method

.method private t()Lf/s;
    .locals 3

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Le/k0/j/a;->e:I

    new-instance v0, Le/k0/j/a$c;

    invoke-direct {v0, p0}, Le/k0/j/a$c;-><init>(Le/k0/j/a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/k0/j/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private u(Le/y;)Lf/t;
    .locals 2

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Le/k0/j/a;->e:I

    new-instance v0, Le/k0/j/a$d;

    invoke-direct {v0, p0, p1}, Le/k0/j/a$d;-><init>(Le/k0/j/a;Le/y;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/k0/j/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private v(J)Lf/t;
    .locals 2

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Le/k0/j/a;->e:I

    new-instance v0, Le/k0/j/a$e;

    invoke-direct {v0, p0, p1, p2}, Le/k0/j/a$e;-><init>(Le/k0/j/a;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/k0/j/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private w()Lf/s;
    .locals 3

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Le/k0/j/a;->e:I

    new-instance v0, Le/k0/j/a$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/k0/j/a$f;-><init>(Le/k0/j/a;Le/k0/j/a$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/k0/j/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private x()Lf/t;
    .locals 3

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Le/k0/j/a;->e:I

    iget-object v0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    invoke-virtual {v0}, Le/k0/h/f;->p()V

    new-instance v0, Le/k0/j/a$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/k0/j/a$g;-><init>(Le/k0/j/a;Le/k0/j/a$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/k0/j/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private y()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Le/k0/j/a;->c:Lf/e;

    iget-wide v1, p0, Le/k0/j/a;->f:J

    invoke-interface {v0, v1, v2}, Lf/e;->k(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Le/k0/j/a;->f:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Le/k0/j/a;->f:J

    return-object v0
.end method

.method private z()Le/x;
    .locals 3

    new-instance v0, Le/x$a;

    invoke-direct {v0}, Le/x$a;-><init>()V

    :goto_0
    invoke-direct {p0}, Le/k0/j/a;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Le/k0/c;->a:Le/k0/c;

    invoke-virtual {v2, v0, v1}, Le/k0/c;->a(Le/x$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Le/x$a;->d()Le/x;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A(Le/g0;)V
    .locals 4

    invoke-static {p1}, Le/k0/i/e;->b(Le/g0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, v0, v1}, Le/k0/j/a;->v(J)Lf/t;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, Le/k0/e;->D(Lf/t;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, Lf/t;->close()V

    return-void
.end method

.method public B(Le/x;Ljava/lang/String;)V
    .locals 4

    iget v0, p0, Le/k0/j/a;->e:I

    if-nez v0, :cond_1

    iget-object v0, p0, Le/k0/j/a;->d:Lf/d;

    invoke-interface {v0, p2}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    const/4 p2, 0x0

    invoke-virtual {p1}, Le/x;->h()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    iget-object v2, p0, Le/k0/j/a;->d:Lf/d;

    invoke-virtual {p1, p2}, Le/x;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    move-result-object v2

    invoke-virtual {p1, p2}, Le/x;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    move-result-object v2

    invoke-interface {v2, v0}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le/k0/j/a;->d:Lf/d;

    invoke-interface {p1, v0}, Lf/d;->s(Ljava/lang/String;)Lf/d;

    const/4 p1, 0x1

    iput p1, p0, Le/k0/j/a;->e:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le/k0/j/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Le/k0/j/a;->d:Lf/d;

    invoke-interface {v0}, Lf/d;->flush()V

    return-void
.end method

.method public b(Le/e0;)V
    .locals 1

    iget-object v0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    invoke-virtual {v0}, Le/k0/h/f;->q()Le/i0;

    move-result-object v0

    invoke-virtual {v0}, Le/i0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    invoke-static {p1, v0}, Le/k0/i/i;->a(Le/e0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Le/e0;->d()Le/x;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Le/k0/j/a;->B(Le/x;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Le/k0/j/a;->d:Lf/d;

    invoke-interface {v0}, Lf/d;->flush()V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/k0/h/f;->c()V

    :cond_0
    return-void
.end method

.method public d(Le/e0;J)Lf/s;
    .locals 2

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Le/e0;->a()Le/f0;

    move-result-object v0

    invoke-virtual {v0}, Le/f0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Le/e0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Le/k0/j/a;->t()Lf/s;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-direct {p0}, Le/k0/j/a;->w()Lf/s;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Le/g0;)J
    .locals 2

    invoke-static {p1}, Le/k0/i/e;->c(Le/g0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_1
    invoke-static {p1}, Le/k0/i/e;->b(Le/g0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public f(Le/g0;)Lf/t;
    .locals 4

    invoke-static {p1}, Le/k0/i/e;->c(Le/g0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Le/k0/j/a;->v(J)Lf/t;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Le/g0;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Le/g0;->J()Le/e0;

    move-result-object p1

    invoke-virtual {p1}, Le/e0;->h()Le/y;

    move-result-object p1

    invoke-direct {p0, p1}, Le/k0/j/a;->u(Le/y;)Lf/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Le/k0/i/e;->b(Le/g0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    invoke-direct {p0, v0, v1}, Le/k0/j/a;->v(J)Lf/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0}, Le/k0/j/a;->x()Lf/t;

    move-result-object p1

    return-object p1
.end method

.method public g(Z)Le/g0$a;
    .locals 4

    iget v0, p0, Le/k0/j/a;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/k0/j/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-direct {p0}, Le/k0/j/a;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/k0/i/k;->a(Ljava/lang/String;)Le/k0/i/k;

    move-result-object v0

    new-instance v2, Le/g0$a;

    invoke-direct {v2}, Le/g0$a;-><init>()V

    iget-object v3, v0, Le/k0/i/k;->a:Le/c0;

    invoke-virtual {v2, v3}, Le/g0$a;->o(Le/c0;)Le/g0$a;

    iget v3, v0, Le/k0/i/k;->b:I

    invoke-virtual {v2, v3}, Le/g0$a;->g(I)Le/g0$a;

    iget-object v3, v0, Le/k0/i/k;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Le/g0$a;->l(Ljava/lang/String;)Le/g0$a;

    invoke-direct {p0}, Le/k0/j/a;->z()Le/x;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/g0$a;->j(Le/x;)Le/g0$a;

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, Le/k0/i/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget p1, v0, Le/k0/i/k;->b:I

    if-ne p1, v3, :cond_3

    iput v1, p0, Le/k0/j/a;->e:I

    return-object v2

    :cond_3
    const/4 p1, 0x4

    iput p1, p0, Le/k0/j/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    iget-object v0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Le/k0/h/f;->q()Le/i0;

    move-result-object v0

    invoke-virtual {v0}, Le/i0;->a()Le/e;

    move-result-object v0

    invoke-virtual {v0}, Le/e;->l()Le/y;

    move-result-object v0

    invoke-virtual {v0}, Le/y;->z()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, "unknown"

    :goto_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public h()Le/k0/h/f;
    .locals 1

    iget-object v0, p0, Le/k0/j/a;->b:Le/k0/h/f;

    return-object v0
.end method
