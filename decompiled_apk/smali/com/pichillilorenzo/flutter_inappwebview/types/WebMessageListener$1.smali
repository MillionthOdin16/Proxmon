.class Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/l/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;-><init>(Ld/a/c/a/b;Ljava/lang/String;Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;


# direct methods
.method constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostMessage(Landroid/webkit/WebView;Lb/l/e;Landroid/net/Uri;ZLb/l/a;)V
    .locals 0

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    iput-object p5, p1, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->replyProxy:Lb/l/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lb/l/e;->a()Ljava/lang/String;

    move-result-object p2

    const-string p5, "message"

    invoke-interface {p1, p5, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p5, "null"

    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string p3, "sourceOrigin"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string p3, "isMainFrame"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    iget-object p2, p2, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->channel:Ld/a/c/a/i;

    const-string p3, "onPostMessage"

    invoke-virtual {p2, p3, p1}, Ld/a/c/a/i;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
