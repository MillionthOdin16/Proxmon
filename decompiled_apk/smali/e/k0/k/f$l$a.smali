.class Le/k0/k/f$l$a;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f$l;->a(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Le/k0/k/i;

.field final synthetic d:Le/k0/k/f$l;


# direct methods
.method varargs constructor <init>(Le/k0/k/f$l;Ljava/lang/String;[Ljava/lang/Object;Le/k0/k/i;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$l$a;->d:Le/k0/k/f$l;

    iput-object p4, p0, Le/k0/k/f$l$a;->c:Le/k0/k/i;

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Le/k0/k/f$l$a;->d:Le/k0/k/f$l;

    iget-object v0, v0, Le/k0/k/f$l;->d:Le/k0/k/f;

    iget-object v0, v0, Le/k0/k/f;->c:Le/k0/k/f$j;

    iget-object v1, p0, Le/k0/k/f$l$a;->c:Le/k0/k/i;

    invoke-virtual {v0, v1}, Le/k0/k/f$j;->b(Le/k0/k/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Http2Connection.Listener failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/k0/k/f$l$a;->d:Le/k0/k/f$l;

    iget-object v4, v4, Le/k0/k/f$l;->d:Le/k0/k/f;

    iget-object v4, v4, Le/k0/k/f;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Le/k0/l/f;->p(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, Le/k0/k/f$l$a;->c:Le/k0/k/i;

    sget-object v2, Le/k0/k/b;->d:Le/k0/k/b;

    invoke-virtual {v1, v2, v0}, Le/k0/k/i;->d(Le/k0/k/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-void
.end method
