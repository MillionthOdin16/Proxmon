.class public final Lc/b/a/a/a/e/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/a/a/g0<",
        "Lc/b/a/a/a/e/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/a/a/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/a/a/a/a/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/a/a/a/e/b;->a:Lc/b/a/a/a/a/g0;

    return-void
.end method

.method public static b(Lc/b/a/a/a/a/g0;)Lc/b/a/a/a/e/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/a/a/g0<",
            "Landroid/content/Context;",
            ">;)",
            "Lc/b/a/a/a/e/b;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/a/e/b;

    invoke-direct {v0, p0}, Lc/b/a/a/a/e/b;-><init>(Lc/b/a/a/a/a/g0;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc/b/a/a/a/e/b;->a:Lc/b/a/a/a/a/g0;

    invoke-interface {v0}, Lc/b/a/a/a/a/g0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v1, Lc/b/a/a/a/e/a;

    invoke-direct {v1, v0}, Lc/b/a/a/a/e/a;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
