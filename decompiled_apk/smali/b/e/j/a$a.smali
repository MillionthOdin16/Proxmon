.class final Lb/e/j/a$a;
.super Landroid/view/View$AccessibilityDelegate;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/e/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Lb/e/j/a;


# direct methods
.method constructor <init>(Lb/e/j/a;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2}, Lb/e/j/a;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1}, Lb/e/j/a;->b(Landroid/view/View;)Lb/e/j/a0/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb/e/j/a0/c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2}, Lb/e/j/a;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-static {p2}, Lb/e/j/a0/b;->O(Landroid/view/accessibility/AccessibilityNodeInfo;)Lb/e/j/a0/b;

    move-result-object v0

    invoke-static {p1}, Lb/e/j/r;->y(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lb/e/j/a0/b;->L(Z)V

    invoke-static {p1}, Lb/e/j/r;->u(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lb/e/j/a0/b;->J(Z)V

    invoke-static {p1}, Lb/e/j/r;->k(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/e/j/a0/b;->K(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v1, p1, v0}, Lb/e/j/a;->g(Landroid/view/View;Lb/e/j/a0/b;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lb/e/j/a0/b;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    invoke-static {p1}, Lb/e/j/a;->c(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/j/a0/b$a;

    invoke-virtual {v0, v1}, Lb/e/j/a0/b;->a(Lb/e/j/a0/b$a;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2}, Lb/e/j/a;->h(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2, p3}, Lb/e/j/a;->i(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2, p3}, Lb/e/j/a;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2}, Lb/e/j/a;->l(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lb/e/j/a$a;->a:Lb/e/j/a;

    invoke-virtual {v0, p1, p2}, Lb/e/j/a;->m(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
