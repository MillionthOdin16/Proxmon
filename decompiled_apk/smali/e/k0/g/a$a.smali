.class Le/k0/g/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/g/a;->b(Le/k0/g/b;Le/g0;)Le/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field b:Z

.field final synthetic c:Lf/e;

.field final synthetic d:Le/k0/g/b;

.field final synthetic e:Lf/d;


# direct methods
.method constructor <init>(Le/k0/g/a;Lf/e;Le/k0/g/b;Lf/d;)V
    .locals 0

    iput-object p2, p0, Le/k0/g/a$a;->c:Lf/e;

    iput-object p3, p0, Le/k0/g/a$a;->d:Le/k0/g/b;

    iput-object p4, p0, Le/k0/g/a$a;->e:Lf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/g/a$a;->c:Lf/e;

    invoke-interface {v0}, Lf/t;->b()Lf/u;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Le/k0/g/a$a;->b:Z

    if-nez v0, :cond_0

    const/16 v0, 0x64

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1}, Le/k0/e;->n(Lf/t;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/k0/g/a$a;->b:Z

    iget-object v0, p0, Le/k0/g/a$a;->d:Le/k0/g/b;

    invoke-interface {v0}, Le/k0/g/b;->a()V

    :cond_0
    iget-object v0, p0, Le/k0/g/a$a;->c:Lf/e;

    invoke-interface {v0}, Lf/t;->close()V

    return-void
.end method

.method public i(Lf/c;J)J
    .locals 8

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Le/k0/g/a$a;->c:Lf/e;

    invoke-interface {v1, p1, p2, p3}, Lf/t;->i(Lf/c;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    iget-boolean p1, p0, Le/k0/g/a$a;->b:Z

    if-nez p1, :cond_0

    iput-boolean v0, p0, Le/k0/g/a$a;->b:Z

    iget-object p1, p0, Le/k0/g/a$a;->e:Lf/d;

    invoke-interface {p1}, Lf/s;->close()V

    :cond_0
    return-wide v1

    :cond_1
    iget-object v0, p0, Le/k0/g/a$a;->e:Lf/d;

    invoke-interface {v0}, Lf/d;->a()Lf/c;

    move-result-object v3

    invoke-virtual {p1}, Lf/c;->N()J

    move-result-wide v0

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Lf/c;->D(Lf/c;JJ)Lf/c;

    iget-object p1, p0, Le/k0/g/a$a;->e:Lf/d;

    invoke-interface {p1}, Lf/d;->g()Lf/d;

    return-wide p2

    :catch_0
    move-exception p1

    iget-boolean p2, p0, Le/k0/g/a$a;->b:Z

    if-nez p2, :cond_2

    iput-boolean v0, p0, Le/k0/g/a$a;->b:Z

    iget-object p2, p0, Le/k0/g/a$a;->d:Le/k0/g/b;

    invoke-interface {p2}, Le/k0/g/b;->a()V

    :cond_2
    throw p1
.end method
