.class public Lb/l/k/d;
.super Lb/l/a;
.source ""


# instance fields
.field private a:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;)V
    .locals 0

    invoke-direct {p0}, Lb/l/a;-><init>()V

    iput-object p1, p0, Lb/l/k/d;->a:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    return-void
.end method

.method public static b(Ljava/lang/reflect/InvocationHandler;)Lb/l/k/d;
    .locals 1

    const-class v0, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    invoke-static {v0, p0}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    new-instance v0, Lb/l/k/d$a;

    invoke-direct {v0, p0}, Lb/l/k/d$a;-><init>(Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;)V

    invoke-interface {p0, v0}, Lorg/chromium/support_lib_boundary/IsomorphicObjectBoundaryInterface;->getOrCreatePeer(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb/l/k/d;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lb/l/k/l;->V:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/l/k/d;->a:Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;->postMessage(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
