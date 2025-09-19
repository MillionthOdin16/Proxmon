.class Lb/e/j/z$h;
.super Lb/e/j/z$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# direct methods
.method constructor <init>(Lb/e/j/z;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/e/j/z$g;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    return-void
.end method

.method constructor <init>(Lb/e/j/z;Lb/e/j/z$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/e/j/z$g;-><init>(Lb/e/j/z;Lb/e/j/z$g;)V

    return-void
.end method


# virtual methods
.method g(IIII)Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lb/e/j/z;->m(Landroid/view/WindowInsets;)Lb/e/j/z;

    move-result-object p1

    return-object p1
.end method
