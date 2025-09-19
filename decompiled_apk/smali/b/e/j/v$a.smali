.class Lb/e/j/v$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/j/v;->g(Landroid/view/View;Lb/e/j/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/e/j/w;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lb/e/j/v;Lb/e/j/w;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lb/e/j/v$a;->a:Lb/e/j/w;

    iput-object p3, p0, Lb/e/j/v$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lb/e/j/v$a;->a:Lb/e/j/w;

    iget-object v0, p0, Lb/e/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lb/e/j/w;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lb/e/j/v$a;->a:Lb/e/j/w;

    iget-object v0, p0, Lb/e/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lb/e/j/w;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lb/e/j/v$a;->a:Lb/e/j/w;

    iget-object v0, p0, Lb/e/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lb/e/j/w;->b(Landroid/view/View;)V

    return-void
.end method
