.class Lb/e/e/j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/e/e/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/e/j;->f(Lb/e/d/d/c$b;I)Lb/e/d/d/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/e/e/j$c<",
        "Lb/e/d/d/c$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lb/e/e/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb/e/d/d/c$c;

    invoke-virtual {p0, p1}, Lb/e/e/j$b;->c(Lb/e/d/d/c$c;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb/e/d/d/c$c;

    invoke-virtual {p0, p1}, Lb/e/e/j$b;->d(Lb/e/d/d/c$c;)Z

    move-result p1

    return p1
.end method

.method public c(Lb/e/d/d/c$c;)I
    .locals 0

    invoke-virtual {p1}, Lb/e/d/d/c$c;->e()I

    move-result p1

    return p1
.end method

.method public d(Lb/e/d/d/c$c;)Z
    .locals 0

    invoke-virtual {p1}, Lb/e/d/d/c$c;->f()Z

    move-result p1

    return p1
.end method
