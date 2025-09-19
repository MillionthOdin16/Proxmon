.class public Lb/l/k/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;


# instance fields
.field private a:Lb/l/e;


# direct methods
.method public constructor <init>(Lb/l/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/l/k/h;->a:Lb/l/e;

    return-void
.end method

.method private static a([Ljava/lang/reflect/InvocationHandler;)[Lb/l/f;
    .locals 4

    array-length v0, p0

    new-array v0, v0, [Lb/l/f;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    new-instance v2, Lb/l/k/k;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lb/l/k/k;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static b(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)Lb/l/e;
    .locals 2

    new-instance v0, Lb/l/e;

    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;->getPorts()[Ljava/lang/reflect/InvocationHandler;

    move-result-object p0

    invoke-static {p0}, Lb/l/k/h;->a([Ljava/lang/reflect/InvocationHandler;)[Lb/l/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lb/l/e;-><init>(Ljava/lang/String;[Lb/l/f;)V

    return-object v0
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/l/k/h;->a:Lb/l/e;

    invoke-virtual {v0}, Lb/l/e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPorts()[Ljava/lang/reflect/InvocationHandler;
    .locals 4

    iget-object v0, p0, Lb/l/k/h;->a:Lb/l/e;

    invoke-virtual {v0}, Lb/l/e;->b()[Lb/l/f;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    new-array v1, v1, [Ljava/lang/reflect/InvocationHandler;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lb/l/f;->c()Ljava/lang/reflect/InvocationHandler;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method
