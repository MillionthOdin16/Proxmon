.class public Le/g0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Le/e0;

.field b:Le/c0;

.field c:I

.field d:Ljava/lang/String;

.field e:Le/w;

.field f:Le/x$a;

.field g:Le/h0;

.field h:Le/g0;

.field i:Le/g0;

.field j:Le/g0;

.field k:J

.field l:J

.field m:Le/k0/h/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le/g0$a;->c:I

    new-instance v0, Le/x$a;

    invoke-direct {v0}, Le/x$a;-><init>()V

    iput-object v0, p0, Le/g0$a;->f:Le/x$a;

    return-void
.end method

.method constructor <init>(Le/g0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le/g0$a;->c:I

    iget-object v0, p1, Le/g0;->b:Le/e0;

    iput-object v0, p0, Le/g0$a;->a:Le/e0;

    iget-object v0, p1, Le/g0;->c:Le/c0;

    iput-object v0, p0, Le/g0$a;->b:Le/c0;

    iget v0, p1, Le/g0;->d:I

    iput v0, p0, Le/g0$a;->c:I

    iget-object v0, p1, Le/g0;->e:Ljava/lang/String;

    iput-object v0, p0, Le/g0$a;->d:Ljava/lang/String;

    iget-object v0, p1, Le/g0;->f:Le/w;

    iput-object v0, p0, Le/g0$a;->e:Le/w;

    iget-object v0, p1, Le/g0;->g:Le/x;

    invoke-virtual {v0}, Le/x;->f()Le/x$a;

    move-result-object v0

    iput-object v0, p0, Le/g0$a;->f:Le/x$a;

    iget-object v0, p1, Le/g0;->h:Le/h0;

    iput-object v0, p0, Le/g0$a;->g:Le/h0;

    iget-object v0, p1, Le/g0;->i:Le/g0;

    iput-object v0, p0, Le/g0$a;->h:Le/g0;

    iget-object v0, p1, Le/g0;->j:Le/g0;

    iput-object v0, p0, Le/g0$a;->i:Le/g0;

    iget-object v0, p1, Le/g0;->k:Le/g0;

    iput-object v0, p0, Le/g0$a;->j:Le/g0;

    iget-wide v0, p1, Le/g0;->l:J

    iput-wide v0, p0, Le/g0$a;->k:J

    iget-wide v0, p1, Le/g0;->m:J

    iput-wide v0, p0, Le/g0$a;->l:J

    iget-object p1, p1, Le/g0;->n:Le/k0/h/d;

    iput-object p1, p0, Le/g0$a;->m:Le/k0/h/d;

    return-void
.end method

.method private e(Le/g0;)V
    .locals 1

    iget-object p1, p1, Le/g0;->h:Le/h0;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private f(Ljava/lang/String;Le/g0;)V
    .locals 1

    iget-object v0, p2, Le/g0;->h:Le/h0;

    if-nez v0, :cond_3

    iget-object v0, p2, Le/g0;->i:Le/g0;

    if-nez v0, :cond_2

    iget-object v0, p2, Le/g0;->j:Le/g0;

    if-nez v0, :cond_1

    iget-object p2, p2, Le/g0;->k:Le/g0;

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Le/g0$a;
    .locals 1

    iget-object v0, p0, Le/g0$a;->f:Le/x$a;

    invoke-virtual {v0, p1, p2}, Le/x$a;->a(Ljava/lang/String;Ljava/lang/String;)Le/x$a;

    return-object p0
.end method

.method public b(Le/h0;)Le/g0$a;
    .locals 0

    iput-object p1, p0, Le/g0$a;->g:Le/h0;

    return-object p0
.end method

.method public c()Le/g0;
    .locals 3

    iget-object v0, p0, Le/g0$a;->a:Le/e0;

    if-eqz v0, :cond_3

    iget-object v0, p0, Le/g0$a;->b:Le/c0;

    if-eqz v0, :cond_2

    iget v0, p0, Le/g0$a;->c:I

    if-ltz v0, :cond_1

    iget-object v0, p0, Le/g0$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Le/g0;

    invoke-direct {v0, p0}, Le/g0;-><init>(Le/g0$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/g0$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Le/g0;)Le/g0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, Le/g0$a;->f(Ljava/lang/String;Le/g0;)V

    :cond_0
    iput-object p1, p0, Le/g0$a;->i:Le/g0;

    return-object p0
.end method

.method public g(I)Le/g0$a;
    .locals 0

    iput p1, p0, Le/g0$a;->c:I

    return-object p0
.end method

.method public h(Le/w;)Le/g0$a;
    .locals 0

    iput-object p1, p0, Le/g0$a;->e:Le/w;

    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Le/g0$a;
    .locals 1

    iget-object v0, p0, Le/g0$a;->f:Le/x$a;

    invoke-virtual {v0, p1, p2}, Le/x$a;->f(Ljava/lang/String;Ljava/lang/String;)Le/x$a;

    return-object p0
.end method

.method public j(Le/x;)Le/g0$a;
    .locals 0

    invoke-virtual {p1}, Le/x;->f()Le/x$a;

    move-result-object p1

    iput-object p1, p0, Le/g0$a;->f:Le/x$a;

    return-object p0
.end method

.method k(Le/k0/h/d;)V
    .locals 0

    iput-object p1, p0, Le/g0$a;->m:Le/k0/h/d;

    return-void
.end method

.method public l(Ljava/lang/String;)Le/g0$a;
    .locals 0

    iput-object p1, p0, Le/g0$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public m(Le/g0;)Le/g0$a;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, Le/g0$a;->f(Ljava/lang/String;Le/g0;)V

    :cond_0
    iput-object p1, p0, Le/g0$a;->h:Le/g0;

    return-object p0
.end method

.method public n(Le/g0;)Le/g0$a;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Le/g0$a;->e(Le/g0;)V

    :cond_0
    iput-object p1, p0, Le/g0$a;->j:Le/g0;

    return-object p0
.end method

.method public o(Le/c0;)Le/g0$a;
    .locals 0

    iput-object p1, p0, Le/g0$a;->b:Le/c0;

    return-object p0
.end method

.method public p(J)Le/g0$a;
    .locals 0

    iput-wide p1, p0, Le/g0$a;->l:J

    return-object p0
.end method

.method public q(Le/e0;)Le/g0$a;
    .locals 0

    iput-object p1, p0, Le/g0$a;->a:Le/e0;

    return-object p0
.end method

.method public r(J)Le/g0$a;
    .locals 0

    iput-wide p1, p0, Le/g0$a;->k:J

    return-object p0
.end method
