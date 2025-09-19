.class Lb/l/k/q$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/l/k/q;->onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lb/l/j;

.field final synthetic c:Landroid/webkit/WebView;

.field final synthetic d:Lb/l/i;


# direct methods
.method constructor <init>(Lb/l/k/q;Lb/l/j;Landroid/webkit/WebView;Lb/l/i;)V
    .locals 0

    iput-object p2, p0, Lb/l/k/q$b;->b:Lb/l/j;

    iput-object p3, p0, Lb/l/k/q$b;->c:Landroid/webkit/WebView;

    iput-object p4, p0, Lb/l/k/q$b;->d:Lb/l/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lb/l/k/q$b;->b:Lb/l/j;

    iget-object v1, p0, Lb/l/k/q$b;->c:Landroid/webkit/WebView;

    iget-object v2, p0, Lb/l/k/q$b;->d:Lb/l/i;

    invoke-virtual {v0, v1, v2}, Lb/l/j;->onRenderProcessResponsive(Landroid/webkit/WebView;Lb/l/i;)V

    return-void
.end method
