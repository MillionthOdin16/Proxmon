.class Le/k0/k/f$b;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f;->i0(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:J

.field final synthetic e:Le/k0/k/f;


# direct methods
.method varargs constructor <init>(Le/k0/k/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$b;->e:Le/k0/k/f;

    iput p4, p0, Le/k0/k/f$b;->c:I

    iput-wide p5, p0, Le/k0/k/f$b;->d:J

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Le/k0/k/f$b;->e:Le/k0/k/f;

    iget-object v0, v0, Le/k0/k/f;->w:Le/k0/k/j;

    iget v1, p0, Le/k0/k/f$b;->c:I

    iget-wide v2, p0, Le/k0/k/f$b;->d:J

    invoke-virtual {v0, v1, v2, v3}, Le/k0/k/j;->L(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Le/k0/k/f$b;->e:Le/k0/k/f;

    invoke-static {v1, v0}, Le/k0/k/f;->r(Le/k0/k/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
