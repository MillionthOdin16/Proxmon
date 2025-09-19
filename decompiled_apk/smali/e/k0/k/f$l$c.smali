.class Le/k0/k/f$l$c;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f$l;->l(ZLe/k0/k/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Le/k0/k/f$l;


# direct methods
.method varargs constructor <init>(Le/k0/k/f$l;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$l$c;->c:Le/k0/k/f$l;

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 2

    iget-object v0, p0, Le/k0/k/f$l$c;->c:Le/k0/k/f$l;

    iget-object v0, v0, Le/k0/k/f$l;->d:Le/k0/k/f;

    iget-object v1, v0, Le/k0/k/f;->c:Le/k0/k/f$j;

    invoke-virtual {v1, v0}, Le/k0/k/f$j;->a(Le/k0/k/f;)V

    return-void
.end method
