.class public interface abstract Le/r;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Le/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/r$a;

    invoke-direct {v0}, Le/r$a;-><init>()V

    sput-object v0, Le/r;->a:Le/r;

    return-void
.end method


# virtual methods
.method public abstract a(Le/y;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/y;",
            ")",
            "Ljava/util/List<",
            "Le/q;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Le/y;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/y;",
            "Ljava/util/List<",
            "Le/q;",
            ">;)V"
        }
    .end annotation
.end method
