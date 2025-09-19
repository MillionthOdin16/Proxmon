.class Lb/j/b/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/j/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/j/b/c;


# direct methods
.method constructor <init>(Lb/j/b/c;)V
    .locals 0

    iput-object p1, p0, Lb/j/b/c$a;->a:Lb/j/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Lb/j/b/c$a;->a:Lb/j/b/c;

    iget-boolean v0, p1, Lb/j/b/c;->mRefreshing:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb/j/b/c;->mProgress:Lb/j/b/b;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Lb/j/b/b;->setAlpha(I)V

    iget-object p1, p0, Lb/j/b/c$a;->a:Lb/j/b/c;

    iget-object p1, p1, Lb/j/b/c;->mProgress:Lb/j/b/b;

    invoke-virtual {p1}, Lb/j/b/b;->start()V

    iget-object p1, p0, Lb/j/b/c$a;->a:Lb/j/b/c;

    iget-boolean v0, p1, Lb/j/b/c;->mNotify:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb/j/b/c;->mListener:Lb/j/b/c$j;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lb/j/b/c$j;->onRefresh()V

    :cond_0
    iget-object p1, p0, Lb/j/b/c$a;->a:Lb/j/b/c;

    iget-object v0, p1, Lb/j/b/c;->mCircleView:Lb/j/b/a;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    iput v0, p1, Lb/j/b/c;->mCurrentTargetOffsetTop:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lb/j/b/c;->reset()V

    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
