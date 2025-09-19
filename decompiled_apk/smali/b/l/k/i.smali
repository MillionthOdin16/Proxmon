.class public Lb/l/k/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageCallbackBoundaryInterface;


# instance fields
.field a:Lb/l/f$a;


# direct methods
.method public constructor <init>(Lb/l/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/k/i;->a:Lb/l/f$a;

    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onMessage(Ljava/lang/reflect/InvocationHandler;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    iget-object v0, p0, Lb/l/k/i;->a:Lb/l/f$a;

    new-instance v1, Lb/l/k/k;

    invoke-direct {v1, p1}, Lb/l/k/k;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    const-class p1, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p1, p2}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p1}, Lb/l/k/h;->b(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Lb/l/e;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lb/l/f$a;->onMessage(Lb/l/f;Lb/l/e;)V

    return-void
.end method
