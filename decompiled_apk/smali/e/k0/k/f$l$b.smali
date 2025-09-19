.class Le/k0/k/f$l$b;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/k0/k/f$l;->d(ZLe/k0/k/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Le/k0/k/m;

.field final synthetic e:Le/k0/k/f$l;


# direct methods
.method varargs constructor <init>(Le/k0/k/f$l;Ljava/lang/String;[Ljava/lang/Object;ZLe/k0/k/m;)V
    .locals 0

    iput-object p1, p0, Le/k0/k/f$l$b;->e:Le/k0/k/f$l;

    iput-boolean p4, p0, Le/k0/k/f$l$b;->c:Z

    iput-object p5, p0, Le/k0/k/f$l$b;->d:Le/k0/k/m;

    invoke-direct {p0, p2, p3}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    iget-object v0, p0, Le/k0/k/f$l$b;->e:Le/k0/k/f$l;

    iget-boolean v1, p0, Le/k0/k/f$l$b;->c:Z

    iget-object v2, p0, Le/k0/k/f$l$b;->d:Le/k0/k/m;

    invoke-virtual {v0, v1, v2}, Le/k0/k/f$l;->l(ZLe/k0/k/m;)V

    return-void
.end method
