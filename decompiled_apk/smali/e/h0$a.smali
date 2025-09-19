.class Le/h0$a;
.super Le/h0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/h0;->C(Le/a0;JLf/e;)Le/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic c:Lf/e;


# direct methods
.method constructor <init>(Le/a0;JLf/e;)V
    .locals 0

    iput-wide p2, p0, Le/h0$a;->b:J

    iput-object p4, p0, Le/h0$a;->c:Lf/e;

    invoke-direct {p0}, Le/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public B()J
    .locals 2

    iget-wide v0, p0, Le/h0$a;->b:J

    return-wide v0
.end method

.method public E()Lf/e;
    .locals 1

    iget-object v0, p0, Le/h0$a;->c:Lf/e;

    return-object v0
.end method
