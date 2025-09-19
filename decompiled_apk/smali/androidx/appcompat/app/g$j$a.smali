.class Landroidx/appcompat/app/g$j$a;
.super Lb/e/j/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/g$j;->d(Lb/a/n/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/g$j;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/g$j;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    invoke-direct {p0}, Lb/e/j/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object p1, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, p1, Landroidx/appcompat/app/g;->r:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object p1, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lb/e/j/r;->G(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object p1, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object p1, p1, Landroidx/appcompat/app/g;->t:Lb/e/j/v;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb/e/j/v;->f(Lb/e/j/w;)Lb/e/j/v;

    iget-object p1, p0, Landroidx/appcompat/app/g$j$a;->a:Landroidx/appcompat/app/g$j;

    iget-object p1, p1, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iput-object v0, p1, Landroidx/appcompat/app/g;->t:Lb/e/j/v;

    iget-object p1, p1, Landroidx/appcompat/app/g;->w:Landroid/view/ViewGroup;

    invoke-static {p1}, Lb/e/j/r;->G(Landroid/view/View;)V

    return-void
.end method
