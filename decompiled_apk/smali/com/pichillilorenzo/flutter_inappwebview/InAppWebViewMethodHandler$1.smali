.class Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;->onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;

.field final synthetic val$result:Ld/a/c/a/i$d;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;->val$result:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewMethodHandler$1;->val$result:Ld/a/c/a/i$d;

    invoke-interface {v0, p1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method
