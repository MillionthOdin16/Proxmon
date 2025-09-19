.class Le/k0/k/f$a;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f;->h0(ILe/k0/k/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Le/k0/k/b;

.field final synthetic e:Le/k0/k/f;


# direct methods
.method varargs constructor <init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;ILe/k0/k/b;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$a;->e:Le/k0/k/f;

    iput p4, p0, Le/k0/k/f$a;->c:I

    iput-object p5, p0, Le/k0/k/f$a;->d:Le/k0/k/b;

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Le/k0/k/f$a;->e:Le/k0/k/f;

    iget v1, p0, Le/k0/k/f$a;->c:I

    iget-object v2, p0, Le/k0/k/f$a;->d:Le/k0/k/b;

    invoke-virtual {v0, v1, v2}, Le/k0/k/f;->g0(ILe/k0/k/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Le/k0/k/f$a;->e:Le/k0/k/f;

    invoke-static {v1, v0}, Le/k0/k/f;->r(Le/k0/k/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
