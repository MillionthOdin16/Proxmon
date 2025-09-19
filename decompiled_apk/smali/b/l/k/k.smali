.class public Lb/l/k/k;
.super Lb/l/f;
.source ""


# instance fields
.field private a:Landroid/webkit/WebMessagePort;

.field private b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;


# direct methods
.method public constructor <init>(Landroid/webkit/WebMessagePort;)V
    .locals 0

    invoke-direct {p0}, Lb/l/f;-><init>()V

    iput-object p1, p0, Lb/l/k/k;->a:Landroid/webkit/WebMessagePort;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    invoke-direct {p0}, Lb/l/f;-><init>()V

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {v0, p1}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    iput-object p1, p0, Lb/l/k/k;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    return-void
.end method

.method public static f(Lb/l/e;)Landroid/webkit/WebMessage;
    .locals 2

    new-instance v0, Landroid/webkit/WebMessage;

    invoke-virtual {p0}, Lb/l/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lb/l/e;->b()[Lb/l/f;

    move-result-object p0

    invoke-static {p0}, Lb/l/k/k;->g([Lb/l/f;)[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/webkit/WebMessage;-><init>(Ljava/lang/String;[Landroid/webkit/WebMessagePort;)V

    return-object v0
.end method

.method public static g([Lb/l/f;)[Landroid/webkit/WebMessagePort;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v1, v0, [Landroid/webkit/WebMessagePort;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Lb/l/f;->b()Landroid/webkit/WebMessagePort;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static h(Landroid/webkit/WebMessage;)Lb/l/e;
    .locals 2

    new-instance v0, Lb/l/e;

    invoke-virtual {p0}, Landroid/webkit/WebMessage;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/webkit/WebMessage;->getPorts()[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-static {p0}, Lb/l/k/k;->k([Landroid/webkit/WebMessagePort;)[Lb/l/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lb/l/e;-><init>(Ljava/lang/String;[Lb/l/f;)V

    return-object v0
.end method

.method private i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;
    .locals 3

    iget-object v0, p0, Lb/l/k/k;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    if-nez v0, :cond_0

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {}, Lb/l/k/m;->c()Lb/l/k/t;

    move-result-object v1

    iget-object v2, p0, Lb/l/k/k;->a:Landroid/webkit/WebMessagePort;

    invoke-virtual {v1, v2}, Lb/l/k/t;->d(Landroid/webkit/WebMessagePort;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/chromium/support_lib_boundary/a/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    iput-object v0, p0, Lb/l/k/k;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb/l/k/k;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    return-object v0
.end method

.method private j()Landroid/webkit/WebMessagePort;
    .locals 2

    iget-object v0, p0, Lb/l/k/k;->a:Landroid/webkit/WebMessagePort;

    if-nez v0, :cond_0

    invoke-static {}, Lb/l/k/m;->c()Lb/l/k/t;

    move-result-object v0

    iget-object v1, p0, Lb/l/k/k;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/l/k/t;->c(Ljava/lang/reflect/InvocationHandler;)Landroid/webkit/WebMessagePort;

    move-result-object v0

    iput-object v0, p0, Lb/l/k/k;->a:Landroid/webkit/WebMessagePort;

    :cond_0
    iget-object v0, p0, Lb/l/k/k;->a:Landroid/webkit/WebMessagePort;

    return-object v0
.end method

.method public static k([Landroid/webkit/WebMessagePort;)[Lb/l/f;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v0, v0, [Lb/l/f;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    new-instance v2, Lb/l/k/k;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lb/l/k/k;-><init>(Landroid/webkit/WebMessagePort;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->F:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/k;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebMessagePort;->close()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/k;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->close()V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public b()Landroid/webkit/WebMessagePort;
    .locals 1

    invoke-direct {p0}, Lb/l/k/k;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/reflect/InvocationHandler;
    .locals 1

    invoke-direct {p0}, Lb/l/k/k;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    return-object v0
.end method

.method public d(Lb/l/e;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->E:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/k;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    invoke-static {p1}, Lb/l/k/k;->f(Lb/l/e;)Landroid/webkit/WebMessage;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/webkit/WebMessagePort;->postMessage(Landroid/webkit/WebMessage;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/k;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb/l/k/h;

    invoke-direct {v1, p1}, Lb/l/k/h;-><init>(Lb/l/e;)V

    invoke-static {v1}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->postMessage(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public e(Lb/l/f$a;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lb/l/k/l;->G:Lb/l/k/l;

    invoke-virtual {v0}, Lb/l/k/l;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lb/l/k/k;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    new-instance v1, Lb/l/k/k$a;

    invoke-direct {v1, p0, p1}, Lb/l/k/k$a;-><init>(Lb/l/k/k;Lb/l/f$a;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebMessagePort;->setWebMessageCallback(Landroid/webkit/WebMessagePort$WebMessageCallback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb/l/k/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/l/k/k;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb/l/k/i;

    invoke-direct {v1, p1}, Lb/l/k/i;-><init>(Lb/l/f$a;)V

    invoke-static {v1}, Lorg/chromium/support_lib_boundary/a/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->setWebMessageCallback(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb/l/k/l;->c()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method
