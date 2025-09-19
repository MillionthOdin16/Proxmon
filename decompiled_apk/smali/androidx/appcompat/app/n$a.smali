.class Landroidx/appcompat/app/n$a;
.super Lb/e/j/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/n;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    invoke-direct {p0}, Lb/e/j/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    iget-boolean v0, p1, Landroidx/appcompat/app/n;->q:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/n;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    iget-object p1, p1, Landroidx/appcompat/app/n;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    iget-object p1, p1, Landroidx/appcompat/app/n;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    iget-object p1, p1, Landroidx/appcompat/app/n;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/n;->v:Lb/a/n/h;

    invoke-virtual {p1}, Landroidx/appcompat/app/n;->D()V

    iget-object p1, p0, Landroidx/appcompat/app/n$a;->a:Landroidx/appcompat/app/n;

    iget-object p1, p1, Landroidx/appcompat/app/n;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lb/e/j/r;->G(Landroid/view/View;)V

    :cond_1
    return-void
.end method
