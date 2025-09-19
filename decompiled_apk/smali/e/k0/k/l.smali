.class public interface abstract Le/k0/k/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Le/k0/k/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/k0/k/l$a;

    invoke-direct {v0}, Le/k0/k/l$a;-><init>()V

    sput-object v0, Le/k0/k/l;->a:Le/k0/k/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract b(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Le/k0/k/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract c(ILe/k0/k/b;)V
.end method

.method public abstract d(ILf/e;IZ)Z
.end method
