.class Lb/e/j/z$c;
.super Lb/e/j/z$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final b:Landroid/view/WindowInsets$Builder;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/e/j/z$d;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lb/e/j/z$c;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method constructor <init>(Lb/e/j/z;)V
    .locals 1

    invoke-direct {p0}, Lb/e/j/z$d;-><init>()V

    invoke-virtual {p1}, Lb/e/j/z;->l()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Lb/e/j/z$c;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method a()Lb/e/j/z;
    .locals 1

    iget-object v0, p0, Lb/e/j/z$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lb/e/j/z;->m(Landroid/view/WindowInsets;)Lb/e/j/z;

    move-result-object v0

    return-object v0
.end method

.method b(Lb/e/e/b;)V
    .locals 1

    iget-object v0, p0, Lb/e/j/z$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/e/e/b;->b()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method c(Lb/e/e/b;)V
    .locals 1

    iget-object v0, p0, Lb/e/j/z$c;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, Lb/e/e/b;->b()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
