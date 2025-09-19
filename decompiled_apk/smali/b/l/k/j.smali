.class public Lb/l/k/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;


# instance fields
.field private a:Lb/l/g$a;


# direct methods
.method public constructor <init>(Lb/l/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/k/j;->a:Lb/l/g$a;

    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_LISTENER"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 6

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {v0, p2}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p2}, Lb/l/k/h;->b(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Lb/l/e;

    move-result-object v2

    invoke-static {p5}, Lb/l/k/d;->b(Ljava/lang/reflect/InvocationHandler;)Lb/l/k/d;

    move-result-object v5

    iget-object v0, p0, Lb/l/k/j;->a:Lb/l/g$a;

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, Lb/l/g$a;->onPostMessage(Landroid/webkit/WebView;Lb/l/e;Landroid/net/Uri;ZLb/l/a;)V

    return-void
.end method
