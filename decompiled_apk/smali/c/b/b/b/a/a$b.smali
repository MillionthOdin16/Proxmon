.class abstract Lc/b/b/b/a/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/b/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/b/b/b/a/a$a;)V
    .locals 0

    invoke-direct {p0}, Lc/b/b/b/a/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(Lc/b/b/b/a/a;Lc/b/b/b/a/a$e;Lc/b/b/b/a/a$e;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/b/b/a/a<",
            "*>;",
            "Lc/b/b/b/a/a$e;",
            "Lc/b/b/b/a/a$e;",
            ")Z"
        }
    .end annotation
.end method

.method abstract b(Lc/b/b/b/a/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/b/b/a/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation
.end method

.method abstract c(Lc/b/b/b/a/a;Lc/b/b/b/a/a$l;Lc/b/b/b/a/a$l;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/b/b/a/a<",
            "*>;",
            "Lc/b/b/b/a/a$l;",
            "Lc/b/b/b/a/a$l;",
            ")Z"
        }
    .end annotation
.end method

.method abstract d(Lc/b/b/b/a/a$l;Lc/b/b/b/a/a$l;)V
.end method

.method abstract e(Lc/b/b/b/a/a$l;Ljava/lang/Thread;)V
.end method
