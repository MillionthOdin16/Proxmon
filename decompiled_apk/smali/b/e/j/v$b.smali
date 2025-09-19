.class Lb/e/j/v$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/j/v;->i(Lb/e/j/y;)Lb/e/j/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/e/j/y;

.field final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lb/e/j/v;Lb/e/j/y;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lb/e/j/v$b;->a:Lb/e/j/y;

    iput-object p3, p0, Lb/e/j/v$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object p1, p0, Lb/e/j/v$b;->a:Lb/e/j/y;

    iget-object v0, p0, Lb/e/j/v$b;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lb/e/j/y;->a(Landroid/view/View;)V

    return-void
.end method
