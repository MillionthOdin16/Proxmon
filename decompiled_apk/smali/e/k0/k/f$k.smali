.class final Le/k0/k/f$k;
.super Le/k0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/k0/k/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "k"
.end annotation


# instance fields
.field final c:Z

.field final d:I

.field final e:I

.field final synthetic f:Le/k0/k/f;


# direct methods
.method constructor <init>(Le/k0/k/f;ZII)V
    .locals 2

    iput-object p1, p0, Le/k0/k/f$k;->f:Le/k0/k/f;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, Le/k0/k/f;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s ping %08x%08x"

    invoke-direct {p0, p1, v0}, Le/k0/d;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p2, p0, Le/k0/k/f$k;->c:Z

    iput p3, p0, Le/k0/k/f$k;->d:I

    iput p4, p0, Le/k0/k/f$k;->e:I

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    iget-object v0, p0, Le/k0/k/f$k;->f:Le/k0/k/f;

    iget-boolean v1, p0, Le/k0/k/f$k;->c:Z

    iget v2, p0, Le/k0/k/f$k;->d:I

    iget v3, p0, Le/k0/k/f$k;->e:I

    invoke-virtual {v0, v1, v2, v3}, Le/k0/k/f;->f0(ZII)V

    return-void
.end method
