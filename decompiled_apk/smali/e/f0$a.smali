.class Le/f0$a;
.super Le/f0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/f0;->d(Le/a0;[BII)Le/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le/a0;

.field final synthetic b:I

.field final synthetic c:[B

.field final synthetic d:I


# direct methods
.method constructor <init>(Le/a0;I[BI)V
    .locals 0

    iput-object p1, p0, Le/f0$a;->a:Le/a0;

    iput p2, p0, Le/f0$a;->b:I

    iput-object p3, p0, Le/f0$a;->c:[B

    iput p4, p0, Le/f0$a;->d:I

    invoke-direct {p0}, Le/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, Le/f0$a;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Le/a0;
    .locals 1

    iget-object v0, p0, Le/f0$a;->a:Le/a0;

    return-object v0
.end method

.method public g(Lf/d;)V
    .locals 3

    iget-object v0, p0, Le/f0$a;->c:[B

    iget v1, p0, Le/f0$a;->d:I

    iget v2, p0, Le/f0$a;->b:I

    invoke-interface {p1, v0, v1, v2}, Lf/d;->d([BII)Lf/d;

    return-void
.end method
