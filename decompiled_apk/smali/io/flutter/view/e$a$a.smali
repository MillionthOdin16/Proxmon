.class Lio/flutter/view/e$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/view/e$a;


# direct methods
.method constructor <init>(Lio/flutter/view/e$a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/e$a$a;->a:Lio/flutter/view/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/view/e$a$a;->a:Lio/flutter/view/e$a;

    invoke-static {p1}, Lio/flutter/view/e$a;->d(Lio/flutter/view/e$a;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/flutter/view/e$a$a;->a:Lio/flutter/view/e$a;

    iget-object p1, p1, Lio/flutter/view/e$a;->e:Lio/flutter/view/e;

    invoke-static {p1}, Lio/flutter/view/e;->e(Lio/flutter/view/e;)Lio/flutter/view/d;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/view/e$a$a;->a:Lio/flutter/view/e$a;

    iget-object p1, p1, Lio/flutter/view/e$a;->e:Lio/flutter/view/e;

    invoke-static {p1}, Lio/flutter/view/e;->e(Lio/flutter/view/e;)Lio/flutter/view/d;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/view/d;->b()Lio/flutter/embedding/engine/FlutterJNI;

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
