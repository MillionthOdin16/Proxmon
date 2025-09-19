.class public Lb/l/k/f;
.super Lb/l/c;
.source ""


# instance fields
.field private a:Landroid/webkit/ServiceWorkerController;

.field private b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

.field private final c:Lb/l/d;


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-direct {p0}, Lb/l/c;-><init>()V

    sget-object v0, Lb/l/k/l;->o:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Landroid/webkit/ServiceWorkerController;->getInstance()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/f;->a:Landroid/webkit/ServiceWorkerController;

    iput-object v2, p0, Lb/l/k/f;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    new-instance v1, Lb/l/k/g;

    invoke-virtual {v0}, Landroid/webkit/ServiceWorkerController;->getServiceWorkerWebSettings()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-direct {v1, v0}, Lb/l/k/g;-><init>(Landroid/webkit/ServiceWorkerWebSettings;)V

    :goto_0
    iput-object v1, p0, Lb/l/k/f;->c:Lb/l/d;

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v2, p0, Lb/l/k/f;->a:Landroid/webkit/ServiceWorkerController;

    invoke-static {}, Lb/l/k/m;->d()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0}, Lb/l/k/o;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/f;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    new-instance v1, Lb/l/k/g;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->getServiceWorkerWebSettings()Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    invoke-direct {v1, v0}, Lb/l/k/g;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    goto :goto_0

    :goto_1
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method private d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;
    .locals 1

    iget-object v0, p0, Lb/l/k/f;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    if-nez v0, :cond_0

    invoke-static {}, Lb/l/k/m;->d()Lb/l/k/o;

    move-result-object v0

    invoke-interface {v0}, Lb/l/k/o;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/f;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb/l/k/f;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    return-object v0
.end method

.method private e()Landroid/webkit/ServiceWorkerController;
    .locals 1

    iget-object v0, p0, Lb/l/k/f;->a:Landroid/webkit/ServiceWorkerController;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/webkit/ServiceWorkerController;->getInstance()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/f;->a:Landroid/webkit/ServiceWorkerController;

    :cond_0
    iget-object v0, p0, Lb/l/k/f;->a:Landroid/webkit/ServiceWorkerController;

    return-object v0
.end method


# virtual methods
.method public b()Lb/l/d;
    .locals 1

    iget-object v0, p0, Lb/l/k/f;->c:Lb/l/d;

    return-object v0
.end method

.method public c(Lb/l/b;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->o:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/f;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    new-instance v1, Lb/l/k/b;

    invoke-direct {v1, p1}, Lb/l/k/b;-><init>(Lb/l/b;)V

    invoke-virtual {v0, v1}, Landroid/webkit/ServiceWorkerController;->setServiceWorkerClient(Landroid/webkit/ServiceWorkerClient;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/f;->d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb/l/k/e;

    invoke-direct {v1, p1}, Lb/l/k/e;-><init>(Lb/l/b;)V

    invoke-static {v1}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->setServiceWorkerClient(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
