.class Lb/j/b/c$d;
.super Landroid/view/animation/Animation;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/j/b/c;->startAlphaAnimation(II)Landroid/view/animation/Animation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lb/j/b/c;


# direct methods
.method constructor <init>(Lb/j/b/c;II)V
    .locals 0

    iput-object p1, p0, Lb/j/b/c$d;->d:Lb/j/b/c;

    iput p2, p0, Lb/j/b/c$d;->b:I

    iput p3, p0, Lb/j/b/c$d;->c:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    iget-object p2, p0, Lb/j/b/c$d;->d:Lb/j/b/c;

    iget-object p2, p2, Lb/j/b/c;->mProgress:Lb/j/b/b;

    iget v0, p0, Lb/j/b/c$d;->b:I

    int-to-float v1, v0

    iget v2, p0, Lb/j/b/c$d;->c:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float v0, v0, p1

    add-float/2addr v1, v0

    float-to-int p1, v1

    invoke-virtual {p2, p1}, Lb/j/b/b;->setAlpha(I)V

    return-void
.end method
