.class public final synthetic Lio/flutter/plugin/platform/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lio/flutter/plugin/platform/k;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/k;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/c;->b:Lio/flutter/plugin/platform/k;

    iput p2, p0, Lio/flutter/plugin/platform/c;->c:I

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/c;->b:Lio/flutter/plugin/platform/k;

    iget v1, p0, Lio/flutter/plugin/platform/c;->c:I

    invoke-virtual {v0, v1, p1, p2}, Lio/flutter/plugin/platform/k;->L(ILandroid/view/View;Z)V

    return-void
.end method
