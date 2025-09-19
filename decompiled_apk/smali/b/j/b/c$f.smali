.class Lb/j/b/c$f;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/j/b/c;
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

    iput-object p1, p0, Lb/j/b/c$f;->b:Lb/j/b/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Lb/j/b/c$f;->b:Lb/j/b/c;

    iget-boolean v0, p2, Lb/j/b/c;->mUsingCustomStart:Z

    if-nez v0, :cond_0

    iget v0, p2, Lb/j/b/c;->mSpinnerOffsetEnd:I

    iget p2, p2, Lb/j/b/c;->mOriginalOffsetTop:I

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr v0, p2

    goto :goto_0

    :cond_0
    iget v0, p2, Lb/j/b/c;->mSpinnerOffsetEnd:I

    :goto_0
    iget-object p2, p0, Lb/j/b/c$f;->b:Lb/j/b/c;

    iget v1, p2, Lb/j/b/c;->mFrom:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int v0, v0

    add-int/2addr v1, v0

    iget-object p2, p2, Lb/j/b/c;->mCircleView:Lb/j/b/a;

    invoke-virtual {p2}, Landroid/widget/ImageView;->getTop()I

    move-result p2

    sub-int/2addr v1, p2

    iget-object p2, p0, Lb/j/b/c$f;->b:Lb/j/b/c;

    invoke-virtual {p2, v1}, Lb/j/b/c;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p0, Lb/j/b/c$f;->b:Lb/j/b/c;

    iget-object p2, p2, Lb/j/b/c;->mProgress:Lb/j/b/b;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-virtual {p2, v0}, Lb/j/b/b;->e(F)V

    return-void
.end method
