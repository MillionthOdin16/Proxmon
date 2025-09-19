.class Lb/j/b/c$g;
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

    iput-object p1, p0, Lb/j/b/c$g;->b:Lb/j/b/c;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 0

    iget-object p2, p0, Lb/j/b/c$g;->b:Lb/j/b/c;

    invoke-virtual {p2, p1}, Lb/j/b/c;->moveToStart(F)V

    return-void
.end method
