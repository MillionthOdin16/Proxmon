.class Lb/e/e/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/e/e/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/e/j;->h([Lb/e/g/b$f;I)Lb/e/g/b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb/e/e/j$c<",
        "Lb/e/g/b$f;",
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

    check-cast p1, Lb/e/g/b$f;

    invoke-virtual {p0, p1}, Lb/e/e/j$a;->c(Lb/e/g/b$f;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb/e/g/b$f;

    invoke-virtual {p0, p1}, Lb/e/e/j$a;->d(Lb/e/g/b$f;)Z

    move-result p1

    return p1
.end method

.method public c(Lb/e/g/b$f;)I
    .locals 0

    invoke-virtual {p1}, Lb/e/g/b$f;->d()I

    move-result p1

    return p1
.end method

.method public d(Lb/e/g/b$f;)Z
    .locals 0

    invoke-virtual {p1}, Lb/e/g/b$f;->e()Z

    move-result p1

    return p1
.end method
