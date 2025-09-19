.class public Lb/l/k/g;
.super Lb/l/d;
.source ""


# instance fields
.field private a:Landroid/webkit/ServiceWorkerWebSettings;

.field private b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;


# direct methods
.method public constructor <init>(Landroid/webkit/ServiceWorkerWebSettings;)V
    .locals 0

    invoke-direct {p0}, Lb/l/d;-><init>()V

    iput-object p1, p0, Lb/l/k/g;->a:Landroid/webkit/ServiceWorkerWebSettings;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    invoke-direct {p0}, Lb/l/d;-><init>()V

    const-class v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    iput-object p1, p0, Lb/l/k/g;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    return-void
.end method

.method private i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;
    .locals 3

    iget-object v0, p0, Lb/l/k/g;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    if-nez v0, :cond_0

    const-class v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {}, Lb/l/k/m;->c()Lb/l/k/t;

    move-result-object v1

    iget-object v2, p0, Lb/l/k/g;->a:Landroid/webkit/ServiceWorkerWebSettings;

    invoke-virtual {v1, v2}, Lb/l/k/t;->b(Landroid/webkit/ServiceWorkerWebSettings;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    iput-object v0, p0, Lb/l/k/g;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb/l/k/g;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    return-object v0
.end method

.method private j()Landroid/webkit/ServiceWorkerWebSettings;
    .locals 2

    iget-object v0, p0, Lb/l/k/g;->a:Landroid/webkit/ServiceWorkerWebSettings;

    if-nez v0, :cond_0

    invoke-static {}, Lb/l/k/m;->c()Lb/l/k/t;

    move-result-object v0

    iget-object v1, p0, Lb/l/k/g;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/l/k/t;->a(Ljava/lang/reflect/InvocationHandler;)Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/g;->a:Landroid/webkit/ServiceWorkerWebSettings;

    :cond_0
    iget-object v0, p0, Lb/l/k/g;->a:Landroid/webkit/ServiceWorkerWebSettings;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->q:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/ServiceWorkerWebSettings;->getAllowContentAccess()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getAllowContentAccess()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public b()Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->r:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/ServiceWorkerWebSettings;->getAllowFileAccess()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getAllowFileAccess()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public c()Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->s:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/ServiceWorkerWebSettings;->getBlockNetworkLoads()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getBlockNetworkLoads()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public d()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->p:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/ServiceWorkerWebSettings;->getCacheMode()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getCacheMode()I

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public e(Z)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->q:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setAllowContentAccess(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setAllowContentAccess(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public f(Z)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->r:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setAllowFileAccess(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setAllowFileAccess(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public g(Z)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->s:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setBlockNetworkLoads(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setBlockNetworkLoads(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public h(I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->p:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/g;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setCacheMode(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/g;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setCacheMode(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
