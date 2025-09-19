.class Le/k0/k/f$j$a;
.super Le/k0/k/f$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/f$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le/k0/k/f$j;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Le/k0/k/i;)V
    .locals 2

    sget-object v0, Le/k0/k/b;->g:Le/k0/k/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Le/k0/k/i;->d(Le/k0/k/b;Ljava/io/IOException;)V

    return-void
.end method
