.class public Lio/flutter/view/e;
.super Landroid/view/SurfaceView;
.source ""

# interfaces
.implements Ld/a/c/a/b;
.implements Lio/flutter/view/f;
.implements Ld/a/c/c/a$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/view/e$a;,
        Lio/flutter/view/e$c;,
        Lio/flutter/view/e$b;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final b:Lio/flutter/embedding/engine/f/a;

.field private final c:Lio/flutter/embedding/engine/j/h;

.field private final d:Lio/flutter/embedding/engine/j/l;

.field private final e:Lio/flutter/plugin/editing/d;

.field private final f:Ld/a/c/b/a;

.field private final g:Lio/flutter/embedding/android/m;

.field private final h:Lio/flutter/embedding/android/b;

.field private i:Lio/flutter/view/c;

.field private final j:Lio/flutter/view/e$b;

.field private final k:Ljava/util/concurrent/atomic/AtomicLong;

.field private l:Lio/flutter/view/d;


# direct methods
.method static synthetic e(Lio/flutter/view/e;)Lio/flutter/view/d;
    .locals 0

    iget-object p0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    return-object p0
.end method

.method private g()Lio/flutter/view/e$c;
    .locals 3

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lio/flutter/view/e$c;->d:Lio/flutter/view/e$c;

    return-object v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    sget-object v0, Lio/flutter/view/e$c;->c:Lio/flutter/view/e$c;

    goto :goto_0

    :cond_1
    sget-object v0, Lio/flutter/view/e$c;->d:Lio/flutter/view/e$c;

    :goto_0
    return-object v0

    :cond_2
    if-eqz v0, :cond_3

    if-ne v0, v2, :cond_4

    :cond_3
    sget-object v0, Lio/flutter/view/e$c;->e:Lio/flutter/view/e$c;

    return-object v0

    :cond_4
    sget-object v0, Lio/flutter/view/e$c;->b:Lio/flutter/view/e$c;

    return-object v0
.end method

.method private h(Landroid/view/WindowInsets;)I
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v1

    int-to-double v1, v1

    int-to-double v3, v0

    const-wide v5, 0x3fc70a3d70a3d70aL    # 0.18

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    cmpg-double v0, v1, v3

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result p1

    return p1
.end method

.method private i()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lio/flutter/view/d;->e()Z

    const/4 v0, 0x0

    throw v0
.end method

.method private j()V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->i:Lio/flutter/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/view/c;->K()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/view/e;->i:Lio/flutter/view/c;

    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v0, Lio/flutter/embedding/engine/j/l$b;->d:Lio/flutter/embedding/engine/j/l$b;

    goto :goto_1

    :cond_1
    sget-object v0, Lio/flutter/embedding/engine/j/l$b;->c:Lio/flutter/embedding/engine/j/l$b;

    :goto_1
    iget-object v1, p0, Lio/flutter/view/e;->d:Lio/flutter/embedding/engine/j/l;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/j/l;->a()Lio/flutter/embedding/engine/j/l$a;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/j/l$a;->c(F)Lio/flutter/embedding/engine/j/l$a;

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lio/flutter/embedding/engine/j/l$a;->d(Z)Lio/flutter/embedding/engine/j/l$a;

    invoke-virtual {v1, v0}, Lio/flutter/embedding/engine/j/l$a;->b(Lio/flutter/embedding/engine/j/l$b;)Lio/flutter/embedding/engine/j/l$a;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/j/l$a;->a()V

    return-void
.end method

.method private l()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0}, Lio/flutter/view/d;->b()Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/nio/ByteBuffer;Ld/a/c/a/b$b;)V
    .locals 1

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "FlutterView.send called on a detached view, channel="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FlutterView"

    invoke-static {p2, p1}, Ld/a/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/view/d;->a(Ljava/lang/String;Ljava/nio/ByteBuffer;Ld/a/c/a/b$b;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/view/autofill/AutofillValue;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/view/e;->e:Lio/flutter/plugin/editing/d;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/editing/d;->j(Landroid/util/SparseArray;)V

    return-void
.end method

.method public b()Lio/flutter/view/f$a;
    .locals 4

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    new-instance v1, Lio/flutter/view/e$a;

    iget-object v2, p0, Lio/flutter/view/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v2

    invoke-direct {v1, p0, v2, v3, v0}, Lio/flutter/view/e$a;-><init>(Lio/flutter/view/e;JLandroid/graphics/SurfaceTexture;)V

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0}, Lio/flutter/view/d;->b()Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v0, 0x0

    throw v0
.end method

.method public c(Ljava/lang/String;Ld/a/c/a/b$a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0, p1, p2}, Lio/flutter/view/d;->c(Ljava/lang/String;Ld/a/c/a/b$a;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public checkInputConnectionProxy(Landroid/view/View;)Z
    .locals 0

    iget-object p1, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {p1}, Lio/flutter/view/d;->d()Lio/flutter/app/a;

    const/4 p1, 0x0

    throw p1
.end method

.method public d(I)Landroid/view/PointerIcon;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "dispatchKeyEvent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterView"

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    :cond_1
    :goto_0
    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/view/e;->g:Lio/flutter/embedding/android/m;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/m;->c(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_1
    return v1
.end method

.method f()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Platform view is not attached"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iput v1, v0, Lio/flutter/view/e$b;->d:I

    iget v1, p1, Landroid/graphics/Rect;->right:I

    iput v1, v0, Lio/flutter/view/e$b;->e:I

    const/4 v1, 0x0

    iput v1, v0, Lio/flutter/view/e$b;->f:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iput v2, v0, Lio/flutter/view/e$b;->g:I

    iput v1, v0, Lio/flutter/view/e$b;->h:I

    iput v1, v0, Lio/flutter/view/e$b;->i:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    iput p1, v0, Lio/flutter/view/e$b;->j:I

    iput v1, v0, Lio/flutter/view/e$b;->k:I

    invoke-direct {p0}, Lio/flutter/view/e;->l()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->i:Lio/flutter/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/view/c;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/view/e;->i:Lio/flutter/view/c;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/view/e;->f()V

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0}, Lio/flutter/view/d;->b()Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v0, 0x0

    throw v0
.end method

.method public getDartExecutor()Lio/flutter/embedding/engine/f/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->b:Lio/flutter/embedding/engine/f/a;

    return-object v0
.end method

.method getDevicePixelRatio()F
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v0, v0, Lio/flutter/view/e$b;->a:F

    return v0
.end method

.method public getFlutterNativeView()Lio/flutter/view/d;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    return-object v0
.end method

.method public getPluginRegistry()Lio/flutter/app/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->l:Lio/flutter/view/d;

    invoke-virtual {v0}, Lio/flutter/view/d;->d()Lio/flutter/app/a;

    const/4 v0, 0x0

    throw v0
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi",
            "NewApi"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0x14
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->top:I

    iput v2, v1, Lio/flutter/view/e$b;->l:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->right:I

    iput v2, v1, Lio/flutter/view/e$b;->m:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->bottom:I

    iput v2, v1, Lio/flutter/view/e$b;->n:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v0, v0, Landroid/graphics/Insets;->left:I

    iput v0, v1, Lio/flutter/view/e$b;->o:I

    :cond_0
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getWindowSystemUiVisibility()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getWindowSystemUiVisibility()I

    move-result v3

    and-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v3, v4, :cond_5

    if-eqz v1, :cond_3

    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    move-result v1

    or-int/2addr v2, v1

    :cond_3
    if-eqz v0, :cond_4

    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    move-result v0

    or-int/2addr v2, v0

    :cond_4
    invoke-virtual {p1, v2}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->top:I

    iput v2, v1, Lio/flutter/view/e$b;->d:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->right:I

    iput v2, v1, Lio/flutter/view/e$b;->e:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->bottom:I

    iput v2, v1, Lio/flutter/view/e$b;->f:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v0, v0, Landroid/graphics/Insets;->left:I

    iput v0, v1, Lio/flutter/view/e$b;->g:I

    invoke-static {}, Landroid/view/WindowInsets$Type;->ime()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->top:I

    iput v2, v1, Lio/flutter/view/e$b;->h:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->right:I

    iput v2, v1, Lio/flutter/view/e$b;->i:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->bottom:I

    iput v2, v1, Lio/flutter/view/e$b;->j:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v0, v0, Landroid/graphics/Insets;->left:I

    iput v0, v1, Lio/flutter/view/e$b;->k:I

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->top:I

    iput v2, v1, Lio/flutter/view/e$b;->l:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->right:I

    iput v2, v1, Lio/flutter/view/e$b;->m:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v2, v0, Landroid/graphics/Insets;->bottom:I

    iput v2, v1, Lio/flutter/view/e$b;->n:I

    iget-object v1, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v0, v0, Landroid/graphics/Insets;->left:I

    iput v0, v1, Lio/flutter/view/e$b;->o:I

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getWaterfallInsets()Landroid/graphics/Insets;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v3, v2, Lio/flutter/view/e$b;->d:I

    iget v4, v1, Landroid/graphics/Insets;->top:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/view/e$b;->d:I

    iget-object v2, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v3, v2, Lio/flutter/view/e$b;->e:I

    iget v4, v1, Landroid/graphics/Insets;->right:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/view/e$b;->e:I

    iget-object v2, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v3, v2, Lio/flutter/view/e$b;->f:I

    iget v4, v1, Landroid/graphics/Insets;->bottom:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v2, Lio/flutter/view/e$b;->f:I

    iget-object v2, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iget v3, v2, Lio/flutter/view/e$b;->g:I

    iget v1, v1, Landroid/graphics/Insets;->left:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v2, Lio/flutter/view/e$b;->g:I

    goto :goto_8

    :cond_5
    sget-object v3, Lio/flutter/view/e$c;->b:Lio/flutter/view/e$c;

    if-nez v1, :cond_6

    invoke-direct {p0}, Lio/flutter/view/e;->g()Lio/flutter/view/e$c;

    move-result-object v3

    :cond_6
    iget-object v4, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v0

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    iput v0, v4, Lio/flutter/view/e$b;->d:I

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    sget-object v4, Lio/flutter/view/e$c;->d:Lio/flutter/view/e$c;

    if-eq v3, v4, :cond_9

    sget-object v4, Lio/flutter/view/e$c;->e:Lio/flutter/view/e$c;

    if-ne v3, v4, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v4

    goto :goto_4

    :cond_9
    :goto_3
    const/4 v4, 0x0

    :goto_4
    iput v4, v0, Lio/flutter/view/e$b;->e:I

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    if-eqz v1, :cond_a

    invoke-direct {p0, p1}, Lio/flutter/view/e;->h(Landroid/view/WindowInsets;)I

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v1

    goto :goto_5

    :cond_a
    const/4 v1, 0x0

    :goto_5
    iput v1, v0, Lio/flutter/view/e$b;->f:I

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    sget-object v1, Lio/flutter/view/e$c;->c:Lio/flutter/view/e$c;

    if-eq v3, v1, :cond_c

    sget-object v1, Lio/flutter/view/e$c;->e:Lio/flutter/view/e$c;

    if-ne v3, v1, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {p1}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v1

    goto :goto_7

    :cond_c
    :goto_6
    const/4 v1, 0x0

    :goto_7
    iput v1, v0, Lio/flutter/view/e$b;->g:I

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iput v2, v0, Lio/flutter/view/e$b;->h:I

    iput v2, v0, Lio/flutter/view/e$b;->i:I

    invoke-direct {p0, p1}, Lio/flutter/view/e;->h(Landroid/view/WindowInsets;)I

    move-result v1

    iput v1, v0, Lio/flutter/view/e$b;->j:I

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iput v2, v0, Lio/flutter/view/e$b;->k:I

    :cond_d
    :goto_8
    invoke-direct {p0}, Lio/flutter/view/e;->l()V

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/SurfaceView;->onAttachedToWindow()V

    invoke-virtual {p0}, Lio/flutter/view/e;->getPluginRegistry()Lio/flutter/app/a;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/app/a;->b()Lio/flutter/plugin/platform/k;

    const/4 v0, 0x0

    throw v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lio/flutter/view/e;->f:Ld/a/c/b/a;

    invoke-virtual {v0, p1}, Ld/a/c/b/a;->d(Landroid/content/res/Configuration;)V

    invoke-direct {p0}, Lio/flutter/view/e;->k()V

    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    iget-object v0, p0, Lio/flutter/view/e;->e:Lio/flutter/plugin/editing/d;

    iget-object v1, p0, Lio/flutter/view/e;->g:Lio/flutter/embedding/android/m;

    invoke-virtual {v0, p0, v1, p1}, Lio/flutter/plugin/editing/d;->o(Landroid/view/View;Lio/flutter/embedding/android/m;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/SurfaceView;->onDetachedFromWindow()V

    invoke-direct {p0}, Lio/flutter/view/e;->j()V

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/view/e;->h:Lio/flutter/embedding/android/b;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/b;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    :goto_1
    return v1
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lio/flutter/view/e;->i:Lio/flutter/view/c;

    invoke-virtual {v0, p1}, Lio/flutter/view/c;->E(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    iget-object v0, p0, Lio/flutter/view/e;->e:Lio/flutter/plugin/editing/d;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/d;->z(Landroid/view/ViewStructure;I)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->j:Lio/flutter/view/e$b;

    iput p1, v0, Lio/flutter/view/e$b;->b:I

    iput p2, v0, Lio/flutter/view/e$b;->c:I

    invoke-direct {p0}, Lio/flutter/view/e;->l()V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;->onSizeChanged(IIII)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-direct {p0}, Lio/flutter/view/e;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/SurfaceView;->requestUnbufferedDispatch(Landroid/view/MotionEvent;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/view/e;->h:Lio/flutter/embedding/android/b;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/android/b;->e(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setInitialRoute(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/view/e;->c:Lio/flutter/embedding/engine/j/h;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/j/h;->c(Ljava/lang/String;)V

    return-void
.end method
