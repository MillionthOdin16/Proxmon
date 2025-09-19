.class public Lb/l/k/b;
.super Landroid/webkit/ServiceWorkerClient;
.source ""


# instance fields
.field private final a:Lb/l/b;


# direct methods
.method public constructor <init>(Lb/l/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    iput-object p1, p0, Lb/l/k/b;->a:Lb/l/b;

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    iget-object v0, p0, Lb/l/k/b;->a:Lb/l/b;

    invoke-virtual {v0, p1}, Lb/l/b;->shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
