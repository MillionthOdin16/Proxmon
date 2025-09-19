.class public Lb/l/k/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewRendererClientBoundaryInterface;


# static fields
.field private static final c:[Ljava/lang/String;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lb/l/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb/l/k/q;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lb/l/j;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/k/q;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lb/l/k/q;->b:Lb/l/j;

    return-void
.end method


# virtual methods
.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lb/l/k/q;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public final onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Lb/l/k/s;->b(Ljava/lang/reflect/InvocationHandler;)Lb/l/k/s;

    move-result-object p2

    iget-object v0, p0, Lb/l/k/q;->b:Lb/l/j;

    iget-object v1, p0, Lb/l/k/q;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lb/l/j;->onRenderProcessResponsive(Landroid/webkit/WebView;Lb/l/i;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lb/l/k/q$b;

    invoke-direct {v2, p0, v0, p1, p2}, Lb/l/k/q$b;-><init>(Lb/l/k/q;Lb/l/j;Landroid/webkit/WebView;Lb/l/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Lb/l/k/s;->b(Ljava/lang/reflect/InvocationHandler;)Lb/l/k/s;

    move-result-object p2

    iget-object v0, p0, Lb/l/k/q;->b:Lb/l/j;

    iget-object v1, p0, Lb/l/k/q;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lb/l/j;->onRenderProcessUnresponsive(Landroid/webkit/WebView;Lb/l/i;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lb/l/k/q$a;

    invoke-direct {v2, p0, v0, p1, p2}, Lb/l/k/q$a;-><init>(Lb/l/k/q;Lb/l/j;Landroid/webkit/WebView;Lb/l/i;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
