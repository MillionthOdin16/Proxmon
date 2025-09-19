.class final Le/k0/j/a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final b:Lf/i;

.field private c:Z

.field final synthetic d:Le/k0/j/a;


# direct methods
.method private constructor <init>(Le/k0/j/a;)V
    .locals 1

    iput-object p1, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf/i;

    iget-object v0, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0}, Lf/s;->b()Lf/u;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/i;-><init>(Lf/u;)V

    iput-object p1, p0, Le/k0/j/a$f;->b:Lf/i;

    return-void
.end method

.method synthetic constructor <init>(Le/k0/j/a;Le/k0/j/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le/k0/j/a$f;-><init>(Le/k0/j/a;)V

    return-void
.end method


# virtual methods
.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/j/a$f;->b:Lf/i;

    return-object v0
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Le/k0/j/a$f;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Le/k0/j/a$f;->c:Z

    iget-object v0, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    iget-object v1, p0, Le/k0/j/a$f;->b:Lf/i;

    invoke-static {v0, v1}, Le/k0/j/a;->k(Le/k0/j/a;Lf/i;)V

    iget-object v0, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Le/k0/j/a;->m(Le/k0/j/a;I)I

    return-void
.end method

.method public e(Lf/c;J)V
    .locals 7

    iget-boolean v0, p0, Le/k0/j/a$f;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lf/c;->N()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Le/k0/e;->d(JJJ)V

    iget-object v0, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lf/s;->e(Lf/c;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public flush()V
    .locals 1

    iget-boolean v0, p0, Le/k0/j/a$f;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/j/a$f;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->j(Le/k0/j/a;)Lf/d;

    move-result-object v0

    invoke-interface {v0}, Lf/d;->flush()V

    return-void
.end method
