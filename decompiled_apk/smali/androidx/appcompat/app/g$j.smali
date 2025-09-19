.class Landroidx/appcompat/app/g$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/a/n/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field private a:Lb/a/n/b$a;

.field final synthetic b:Landroidx/appcompat/app/g;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/g;Lb/a/n/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/g$j;->a:Lb/a/n/b$a;

    return-void
.end method


# virtual methods
.method public a(Lb/a/n/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, v0, Landroidx/appcompat/app/g;->w:Landroid/view/ViewGroup;

    invoke-static {v0}, Lb/e/j/r;->G(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->a:Lb/a/n/b$a;

    invoke-interface {v0, p1, p2}, Lb/a/n/b$a;->a(Lb/a/n/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lb/a/n/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->a:Lb/a/n/b$a;

    invoke-interface {v0, p1, p2}, Lb/a/n/b$a;->b(Lb/a/n/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public c(Lb/a/n/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->a:Lb/a/n/b$a;

    invoke-interface {v0, p1, p2}, Lb/a/n/b$a;->c(Lb/a/n/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public d(Lb/a/n/b;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->a:Lb/a/n/b$a;

    invoke-interface {v0, p1}, Lb/a/n/b$a;->d(Lb/a/n/b;)V

    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, p1, Landroidx/appcompat/app/g;->r:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/g;->g:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, v0, Landroidx/appcompat/app/g;->s:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->Y()V

    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, p1, Landroidx/appcompat/app/g;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lb/e/j/r;->b(Landroid/view/View;)Lb/e/j/v;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lb/e/j/v;->a(F)Lb/e/j/v;

    iput-object v0, p1, Landroidx/appcompat/app/g;->t:Lb/e/j/v;

    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object p1, p1, Landroidx/appcompat/app/g;->t:Lb/e/j/v;

    new-instance v0, Landroidx/appcompat/app/g$j$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/g$j$a;-><init>(Landroidx/appcompat/app/g$j;)V

    invoke-virtual {p1, v0}, Lb/e/j/v;->f(Lb/e/j/w;)Lb/e/j/v;

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    iget-object v0, p1, Landroidx/appcompat/app/g;->i:Landroidx/appcompat/app/e;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/appcompat/app/g;->p:Lb/a/n/b;

    invoke-interface {v0, p1}, Landroidx/appcompat/app/e;->onSupportActionModeFinished(Lb/a/n/b;)V

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/g$j;->b:Landroidx/appcompat/app/g;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/appcompat/app/g;->p:Lb/a/n/b;

    iget-object p1, p1, Landroidx/appcompat/app/g;->w:Landroid/view/ViewGroup;

    invoke-static {p1}, Lb/e/j/r;->G(Landroid/view/View;)V

    return-void
.end method
