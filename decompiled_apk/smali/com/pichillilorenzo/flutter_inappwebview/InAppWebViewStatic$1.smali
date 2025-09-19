.class Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;->onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

.field final synthetic val$result:Ld/a/c/a/i$d;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;->val$result:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewStatic$1;->val$result:Ld/a/c/a/i$d;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method
