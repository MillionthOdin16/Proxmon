.class public final Le/e0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/e0$a;
    }
.end annotation


# instance fields
.field final a:Le/y;

.field final b:Ljava/lang/String;

.field final c:Le/x;

.field final d:Le/f0;

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:Le/i;


# direct methods
.method constructor <init>(Le/e0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Le/e0$a;->a:Le/y;

    iput-object v0, p0, Le/e0;->a:Le/y;

    iget-object v0, p1, Le/e0$a;->b:Ljava/lang/String;

    iput-object v0, p0, Le/e0;->b:Ljava/lang/String;

    iget-object v0, p1, Le/e0$a;->c:Le/x$a;

    invoke-virtual {v0}, Le/x$a;->d()Le/x;

    move-result-object v0

    iput-object v0, p0, Le/e0;->c:Le/x;

    iget-object v0, p1, Le/e0$a;->d:Le/f0;

    iput-object v0, p0, Le/e0;->d:Le/f0;

    iget-object p1, p1, Le/e0$a;->e:Ljava/util/Map;

    invoke-static {p1}, Le/k0/e;->t(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Le/e0;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Le/f0;
    .locals 1

    iget-object v0, p0, Le/e0;->d:Le/f0;

    return-object v0
.end method

.method public b()Le/i;
    .locals 1

    iget-object v0, p0, Le/e0;->f:Le/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/e0;->c:Le/x;

    invoke-static {v0}, Le/i;->k(Le/x;)Le/i;

    move-result-object v0

    iput-object v0, p0, Le/e0;->f:Le/i;

    :goto_0
    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/e0;->c:Le/x;

    invoke-virtual {v0, p1}, Le/x;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Le/x;
    .locals 1

    iget-object v0, p0, Le/e0;->c:Le/x;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Le/e0;->a:Le/y;

    invoke-virtual {v0}, Le/y;->m()Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/e0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public g()Le/e0$a;
    .locals 1

    new-instance v0, Le/e0$a;

    invoke-direct {v0, p0}, Le/e0$a;-><init>(Le/e0;)V

    return-object v0
.end method

.method public h()Le/y;
    .locals 1

    iget-object v0, p0, Le/e0;->a:Le/y;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/e0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/e0;->a:Le/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/e0;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
