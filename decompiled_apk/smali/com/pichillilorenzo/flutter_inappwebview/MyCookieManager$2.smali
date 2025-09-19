.class Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->deleteCookie(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld/a/c/a/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

.field final synthetic val$result:Ld/a/c/a/i$d;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;->val$result:Ld/a/c/a/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/Boolean;)V
    .locals 1

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;->val$result:Ld/a/c/a/i$d;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;->onReceiveValue(Ljava/lang/Boolean;)V

    return-void
.end method
