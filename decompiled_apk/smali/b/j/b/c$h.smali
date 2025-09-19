.class Lb/j/b/c$h;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/j/b/c;->startScaleDownReturnToStartAnimation(ILandroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb/j/b/c;


# direct methods
.method constructor <init>(Lb/j/b/c;)V
    .locals 0

    iput-object p1, p0, Lb/j/b/c$h;->b:Lb/j/b/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Lb/j/b/c$h;->b:Lb/j/b/c;

    iget v0, p2, Lb/j/b/c;->mStartingScale:F

    neg-float v1, v0

    mul-float v1, v1, p1

    add-float/2addr v0, v1

    invoke-virtual {p2, v0}, Lb/j/b/c;->setAnimationProgress(F)V

    iget-object p2, p0, Lb/j/b/c$h;->b:Lb/j/b/c;

    invoke-virtual {p2, p1}, Lb/j/b/c;->moveToStart(F)V

    return-void
.end method
