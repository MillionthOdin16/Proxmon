.class abstract Le/k0/j/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "b"
.end annotation


# instance fields
.field protected final b:Lf/i;

.field protected c:Z

.field final synthetic d:Le/k0/j/a;


# direct methods
.method private constructor <init>(Le/k0/j/a;)V
    .locals 1

    iput-object p1, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf/i;

    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->n(Le/k0/j/a;)Lf/e;

    move-result-object v0

    invoke-interface {v0}, Lf/t;->b()Lf/u;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/i;-><init>(Lf/u;)V

    iput-object p1, p0, Le/k0/j/a$b;->b:Lf/i;

    return-void
.end method

.method synthetic constructor <init>(Le/k0/j/a;Le/k0/j/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le/k0/j/a$b;-><init>(Le/k0/j/a;)V

    return-void
.end method


# virtual methods
.method public b()Lf/u;
    .locals 1

    iget-object v0, p0, Le/k0/j/a$b;->b:Lf/i;

    return-object v0
.end method

.method public i(Lf/c;J)J
    .locals 1

    :try_start_0
    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->n(Le/k0/j/a;)Lf/e;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lf/t;->i(Lf/c;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {p2}, Le/k0/j/a;->o(Le/k0/j/a;)Le/k0/h/f;

    move-result-object p2

    invoke-virtual {p2}, Le/k0/h/f;->p()V

    invoke-virtual {p0}, Le/k0/j/a$b;->r()V

    throw p1
.end method

.method final r()V
    .locals 3

    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->l(Le/k0/j/a;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v0}, Le/k0/j/a;->l(Le/k0/j/a;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    iget-object v2, p0, Le/k0/j/a$b;->b:Lf/i;

    invoke-static {v0, v2}, Le/k0/j/a;->k(Le/k0/j/a;Lf/i;)V

    iget-object v0, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v0, v1}, Le/k0/j/a;->m(Le/k0/j/a;I)I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/k0/j/a$b;->d:Le/k0/j/a;

    invoke-static {v2}, Le/k0/j/a;->l(Le/k0/j/a;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
