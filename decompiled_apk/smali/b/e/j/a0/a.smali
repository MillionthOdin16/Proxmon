.class public final Lb/e/j/a0/a;
.super Landroid/text/style/ClickableSpan;
.source ""


# instance fields
.field private final b:I

.field private final c:Lb/e/j/a0/b;

.field private final d:I


# direct methods
.method public constructor <init>(ILb/e/j/a0/b;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Lb/e/j/a0/a;->b:I

    iput-object p2, p0, Lb/e/j/a0/a;->c:Lb/e/j/a0/b;

    iput p3, p0, Lb/e/j/a0/a;->d:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lb/e/j/a0/a;->b:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lb/e/j/a0/a;->c:Lb/e/j/a0/b;

    iget v1, p0, Lb/e/j/a0/a;->d:I

    invoke-virtual {v0, v1, p1}, Lb/e/j/a0/b;->F(ILandroid/os/Bundle;)Z

    return-void
.end method
