.class public final Le/b0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field A:I

.field B:I

.field a:Le/s;

.field b:Ljava/net/Proxy;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/c0;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/p;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation
.end field

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation
.end field

.field g:Le/v$b;

.field h:Ljava/net/ProxySelector;

.field i:Le/r;

.field j:Le/h;

.field k:Le/k0/g/d;

.field l:Ljavax/net/SocketFactory;

.field m:Ljavax/net/ssl/SSLSocketFactory;

.field n:Le/k0/n/c;

.field o:Ljavax/net/ssl/HostnameVerifier;

.field p:Le/l;

.field q:Le/g;

.field r:Le/g;

.field s:Le/o;

.field t:Le/u;

.field u:Z

.field v:Z

.field w:Z

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b0$b;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b0$b;->f:Ljava/util/List;

    new-instance v0, Le/s;

    invoke-direct {v0}, Le/s;-><init>()V

    iput-object v0, p0, Le/b0$b;->a:Le/s;

    sget-object v0, Le/b0;->D:Ljava/util/List;

    iput-object v0, p0, Le/b0$b;->c:Ljava/util/List;

    sget-object v0, Le/b0;->E:Ljava/util/List;

    iput-object v0, p0, Le/b0$b;->d:Ljava/util/List;

    sget-object v0, Le/v;->a:Le/v;

    invoke-static {v0}, Le/v;->k(Le/v;)Le/v$b;

    move-result-object v0

    iput-object v0, p0, Le/b0$b;->g:Le/v$b;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Le/b0$b;->h:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    new-instance v0, Le/k0/m/a;

    invoke-direct {v0}, Le/k0/m/a;-><init>()V

    iput-object v0, p0, Le/b0$b;->h:Ljava/net/ProxySelector;

    :cond_0
    sget-object v0, Le/r;->a:Le/r;

    iput-object v0, p0, Le/b0$b;->i:Le/r;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Le/b0$b;->l:Ljavax/net/SocketFactory;

    sget-object v0, Le/k0/n/d;->a:Le/k0/n/d;

    iput-object v0, p0, Le/b0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Le/l;->c:Le/l;

    iput-object v0, p0, Le/b0$b;->p:Le/l;

    sget-object v0, Le/g;->a:Le/g;

    iput-object v0, p0, Le/b0$b;->q:Le/g;

    iput-object v0, p0, Le/b0$b;->r:Le/g;

    new-instance v0, Le/o;

    invoke-direct {v0}, Le/o;-><init>()V

    iput-object v0, p0, Le/b0$b;->s:Le/o;

    sget-object v0, Le/u;->a:Le/u;

    iput-object v0, p0, Le/b0$b;->t:Le/u;

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/b0$b;->u:Z

    iput-boolean v0, p0, Le/b0$b;->v:Z

    iput-boolean v0, p0, Le/b0$b;->w:Z

    const/4 v0, 0x0

    iput v0, p0, Le/b0$b;->x:I

    const/16 v1, 0x2710

    iput v1, p0, Le/b0$b;->y:I

    iput v1, p0, Le/b0$b;->z:I

    iput v1, p0, Le/b0$b;->A:I

    iput v0, p0, Le/b0$b;->B:I

    return-void
.end method

.method constructor <init>(Le/b0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b0$b;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b0$b;->f:Ljava/util/List;

    iget-object v0, p1, Le/b0;->b:Le/s;

    iput-object v0, p0, Le/b0$b;->a:Le/s;

    iget-object v0, p1, Le/b0;->c:Ljava/net/Proxy;

    iput-object v0, p0, Le/b0$b;->b:Ljava/net/Proxy;

    iget-object v0, p1, Le/b0;->d:Ljava/util/List;

    iput-object v0, p0, Le/b0$b;->c:Ljava/util/List;

    iget-object v0, p1, Le/b0;->e:Ljava/util/List;

    iput-object v0, p0, Le/b0$b;->d:Ljava/util/List;

    iget-object v0, p0, Le/b0$b;->e:Ljava/util/List;

    iget-object v1, p1, Le/b0;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Le/b0$b;->f:Ljava/util/List;

    iget-object v1, p1, Le/b0;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Le/b0;->h:Le/v$b;

    iput-object v0, p0, Le/b0$b;->g:Le/v$b;

    iget-object v0, p1, Le/b0;->i:Ljava/net/ProxySelector;

    iput-object v0, p0, Le/b0$b;->h:Ljava/net/ProxySelector;

    iget-object v0, p1, Le/b0;->j:Le/r;

    iput-object v0, p0, Le/b0$b;->i:Le/r;

    iget-object v0, p1, Le/b0;->l:Le/k0/g/d;

    iput-object v0, p0, Le/b0$b;->k:Le/k0/g/d;

    iget-object v0, p1, Le/b0;->k:Le/h;

    iput-object v0, p0, Le/b0$b;->j:Le/h;

    iget-object v0, p1, Le/b0;->m:Ljavax/net/SocketFactory;

    iput-object v0, p0, Le/b0$b;->l:Ljavax/net/SocketFactory;

    iget-object v0, p1, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Le/b0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Le/b0;->o:Le/k0/n/c;

    iput-object v0, p0, Le/b0$b;->n:Le/k0/n/c;

    iget-object v0, p1, Le/b0;->p:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Le/b0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Le/b0;->q:Le/l;

    iput-object v0, p0, Le/b0$b;->p:Le/l;

    iget-object v0, p1, Le/b0;->r:Le/g;

    iput-object v0, p0, Le/b0$b;->q:Le/g;

    iget-object v0, p1, Le/b0;->s:Le/g;

    iput-object v0, p0, Le/b0$b;->r:Le/g;

    iget-object v0, p1, Le/b0;->t:Le/o;

    iput-object v0, p0, Le/b0$b;->s:Le/o;

    iget-object v0, p1, Le/b0;->u:Le/u;

    iput-object v0, p0, Le/b0$b;->t:Le/u;

    iget-boolean v0, p1, Le/b0;->v:Z

    iput-boolean v0, p0, Le/b0$b;->u:Z

    iget-boolean v0, p1, Le/b0;->w:Z

    iput-boolean v0, p0, Le/b0$b;->v:Z

    iget-boolean v0, p1, Le/b0;->x:Z

    iput-boolean v0, p0, Le/b0$b;->w:Z

    iget v0, p1, Le/b0;->y:I

    iput v0, p0, Le/b0$b;->x:I

    iget v0, p1, Le/b0;->z:I

    iput v0, p0, Le/b0$b;->y:I

    iget v0, p1, Le/b0;->A:I

    iput v0, p0, Le/b0$b;->z:I

    iget v0, p1, Le/b0;->B:I

    iput v0, p0, Le/b0$b;->A:I

    iget p1, p1, Le/b0;->C:I

    iput p1, p0, Le/b0$b;->B:I

    return-void
.end method


# virtual methods
.method public a()Le/b0;
    .locals 1

    new-instance v0, Le/b0;

    invoke-direct {v0, p0}, Le/b0;-><init>(Le/b0$b;)V

    return-object v0
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Le/b0$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Le/k0/e;->c(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Le/b0$b;->y:I

    return-object p0
.end method

.method public c(Ljavax/net/ssl/HostnameVerifier;)Le/b0$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Le/b0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "hostnameVerifier == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(JLjava/util/concurrent/TimeUnit;)Le/b0$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Le/k0/e;->c(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Le/b0$b;->z:I

    return-object p0
.end method

.method public e(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Le/b0$b;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Le/b0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {p2}, Le/k0/n/c;->b(Ljavax/net/ssl/X509TrustManager;)Le/k0/n/c;

    move-result-object p1

    iput-object p1, p0, Le/b0$b;->n:Le/k0/n/c;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "trustManager == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "sslSocketFactory == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(JLjava/util/concurrent/TimeUnit;)Le/b0$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Le/k0/e;->c(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Le/b0$b;->A:I

    return-object p0
.end method
