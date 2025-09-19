.class Lb/e/j/r$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/e/j/r;->O(Landroid/view/View;Lb/e/j/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/e/j/o;


# direct methods
.method constructor <init>(Lb/e/j/o;)V
    .locals 0

    iput-object p1, p0, Lb/e/j/r$a;->a:Lb/e/j/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    invoke-static {p2}, Lb/e/j/z;->m(Landroid/view/WindowInsets;)Lb/e/j/z;

    move-result-object p2

    iget-object v0, p0, Lb/e/j/r$a;->a:Lb/e/j/o;

    invoke-interface {v0, p1, p2}, Lb/e/j/o;->a(Landroid/view/View;Lb/e/j/z;)Lb/e/j/z;

    move-result-object p1

    invoke-virtual {p1}, Lb/e/j/z;->l()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
