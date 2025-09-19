.class Landroidx/appcompat/app/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/e/j/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/g;->T()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/g;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/g$c;->a:Landroidx/appcompat/app/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lb/e/j/z;)Lb/e/j/z;
    .locals 4

    invoke-virtual {p2}, Lb/e/j/z;->g()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/app/g$c;->a:Landroidx/appcompat/app/g;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Landroidx/appcompat/app/g;->N0(Lb/e/j/z;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lb/e/j/z;->e()I

    move-result v0

    invoke-virtual {p2}, Lb/e/j/z;->f()I

    move-result v2

    invoke-virtual {p2}, Lb/e/j/z;->d()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Lb/e/j/z;->k(IIII)Lb/e/j/z;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Lb/e/j/r;->B(Landroid/view/View;Lb/e/j/z;)Lb/e/j/z;

    move-result-object p1

    return-object p1
.end method
