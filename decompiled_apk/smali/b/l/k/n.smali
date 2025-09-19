.class public Lb/l/k/n;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/k/n;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[Ljava/lang/String;Lb/l/g$a;)V
    .locals 2

    iget-object v0, p0, Lb/l/k/n;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    new-instance v1, Lb/l/k/j;

    invoke-direct {v1, p3}, Lb/l/k/j;-><init>(Lb/l/g$a;)V

    invoke-static {v1}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addWebMessageListener(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)V

    return-void
.end method

.method public b()[Lb/l/f;
    .locals 5

    iget-object v0, p0, Lb/l/k/n;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->createWebMessageChannel()[Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [Lb/l/f;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    new-instance v3, Lb/l/k/k;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Lb/l/k/k;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public c(Lb/l/e;Landroid/net/Uri;)V
    .locals 2

    iget-object v0, p0, Lb/l/k/n;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    new-instance v1, Lb/l/k/h;

    invoke-direct {v1, p1}, Lb/l/k/h;-><init>(Lb/l/e;)V

    invoke-static {v1}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->postMessageToMainFrame(Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;)V

    return-void
.end method

.method public d(Ljava/util/concurrent/Executor;Lb/l/j;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    if-eqz p2, :cond_0

    new-instance v0, Lb/l/k/q;

    invoke-direct {v0, p1, p2}, Lb/l/k/q;-><init>(Ljava/util/concurrent/Executor;Lb/l/j;)V

    invoke-static {v0}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lb/l/k/n;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {p2, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->setWebViewRendererClient(Ljava/lang/reflect/InvocationHandler;)V

    return-void
.end method
