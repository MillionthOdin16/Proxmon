.class Lb/j/b/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/j/b/b;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/j/b/b$c;

.field final synthetic b:Lb/j/b/b;


# direct methods
.method constructor <init>(Lb/j/b/b;Lb/j/b/b$c;)V
    .locals 0

    iput-object p1, p0, Lb/j/b/b$a;->b:Lb/j/b/b;

    iput-object p2, p0, Lb/j/b/b$a;->a:Lb/j/b/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lb/j/b/b$a;->b:Lb/j/b/b;

    iget-object v1, p0, Lb/j/b/b$a;->a:Lb/j/b/b$c;

    invoke-virtual {v0, p1, v1}, Lb/j/b/b;->n(FLb/j/b/b$c;)V

    iget-object v0, p0, Lb/j/b/b$a;->b:Lb/j/b/b;

    iget-object v1, p0, Lb/j/b/b$a;->a:Lb/j/b/b$c;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lb/j/b/b;->b(FLb/j/b/b$c;Z)V

    iget-object p1, p0, Lb/j/b/b$a;->b:Lb/j/b/b;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
