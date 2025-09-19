.class Lb/e/j/z$e;
.super Lb/e/j/z$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field final b:Landroid/view/WindowInsets;

.field private c:Lb/e/e/b;


# direct methods
.method constructor <init>(Lb/e/j/z;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/e/j/z$i;-><init>(Lb/e/j/z;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lb/e/j/z$e;->c:Lb/e/e/b;

    iput-object p2, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    return-void
.end method

.method constructor <init>(Lb/e/j/z;Lb/e/j/z$e;)V
    .locals 1

    new-instance v0, Landroid/view/WindowInsets;

    iget-object p2, p2, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V

    invoke-direct {p0, p1, v0}, Lb/e/j/z$e;-><init>(Lb/e/j/z;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method final f()Lb/e/e/b;
    .locals 4

    iget-object v0, p0, Lb/e/j/z$e;->c:Lb/e/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lb/e/e/b;->a(IIII)Lb/e/e/b;

    move-result-object v0

    iput-object v0, p0, Lb/e/j/z$e;->c:Lb/e/e/b;

    :cond_0
    iget-object v0, p0, Lb/e/j/z$e;->c:Lb/e/e/b;

    return-object v0
.end method

.method g(IIII)Lb/e/j/z;
    .locals 2

    new-instance v0, Lb/e/j/z$a;

    iget-object v1, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-static {v1}, Lb/e/j/z;->m(Landroid/view/WindowInsets;)Lb/e/j/z;

    move-result-object v1

    invoke-direct {v0, v1}, Lb/e/j/z$a;-><init>(Lb/e/j/z;)V

    invoke-virtual {p0}, Lb/e/j/z$e;->f()Lb/e/e/b;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, Lb/e/j/z;->j(Lb/e/e/b;IIII)Lb/e/e/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/e/j/z$a;->c(Lb/e/e/b;)Lb/e/j/z$a;

    invoke-virtual {p0}, Lb/e/j/z$i;->e()Lb/e/e/b;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, Lb/e/j/z;->j(Lb/e/e/b;IIII)Lb/e/e/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb/e/j/z$a;->b(Lb/e/e/b;)Lb/e/j/z$a;

    invoke-virtual {v0}, Lb/e/j/z$a;->a()Lb/e/j/z;

    move-result-object p1

    return-object p1
.end method

.method i()Z
    .locals 1

    iget-object v0, p0, Lb/e/j/z$e;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method
