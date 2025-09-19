.class public Le/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b0$b;
    }
.end annotation


# static fields
.field static final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/c0;",
            ">;"
        }
    .end annotation
.end field

.field static final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final A:I

.field final B:I

.field final C:I

.field final b:Le/s;

.field final c:Ljava/net/Proxy;

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/c0;",
            ">;"
        }
    .end annotation
.end field

.field final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/p;",
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

.field final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation
.end field

.field final h:Le/v$b;

.field final i:Ljava/net/ProxySelector;

.field final j:Le/r;

.field final k:Le/h;

.field final l:Le/k0/g/d;

.field final m:Ljavax/net/SocketFactory;

.field final n:Ljavax/net/ssl/SSLSocketFactory;

.field final o:Le/k0/n/c;

.field final p:Ljavax/net/ssl/HostnameVerifier;

.field final q:Le/l;

.field final r:Le/g;

.field final s:Le/g;

.field final t:Le/o;

.field final u:Le/u;

.field final v:Z

.field final w:Z

.field final x:Z

.field final y:I

.field final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Le/c0;

    sget-object v2, Le/c0;->f:Le/c0;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Le/c0;->d:Le/c0;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Le/k0/e;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Le/b0;->D:Ljava/util/List;

    new-array v0, v0, [Le/p;

    sget-object v1, Le/p;->g:Le/p;

    aput-object v1, v0, v3

    sget-object v1, Le/p;->h:Le/p;

    aput-object v1, v0, v4

    invoke-static {v0}, Le/k0/e;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le/b0;->E:Ljava/util/List;

    new-instance v0, Le/b0$a;

    invoke-direct {v0}, Le/b0$a;-><init>()V

    sput-object v0, Le/k0/c;->a:Le/k0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Le/b0$b;

    invoke-direct {v0}, Le/b0$b;-><init>()V

    invoke-direct {p0, v0}, Le/b0;-><init>(Le/b0$b;)V

    return-void
.end method

.method constructor <init>(Le/b0$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Le/b0$b;->a:Le/s;

    iput-object v0, p0, Le/b0;->b:Le/s;

    iget-object v0, p1, Le/b0$b;->b:Ljava/net/Proxy;

    iput-object v0, p0, Le/b0;->c:Ljava/net/Proxy;

    iget-object v0, p1, Le/b0$b;->c:Ljava/util/List;

    iput-object v0, p0, Le/b0;->d:Ljava/util/List;

    iget-object v0, p1, Le/b0$b;->d:Ljava/util/List;

    iput-object v0, p0, Le/b0;->e:Ljava/util/List;

    iget-object v0, p1, Le/b0$b;->e:Ljava/util/List;

    invoke-static {v0}, Le/k0/e;->r(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/b0;->f:Ljava/util/List;

    iget-object v0, p1, Le/b0$b;->f:Ljava/util/List;

    invoke-static {v0}, Le/k0/e;->r(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/b0;->g:Ljava/util/List;

    iget-object v0, p1, Le/b0$b;->g:Le/v$b;

    iput-object v0, p0, Le/b0;->h:Le/v$b;

    iget-object v0, p1, Le/b0$b;->h:Ljava/net/ProxySelector;

    iput-object v0, p0, Le/b0;->i:Ljava/net/ProxySelector;

    iget-object v0, p1, Le/b0$b;->i:Le/r;

    iput-object v0, p0, Le/b0;->j:Le/r;

    iget-object v0, p1, Le/b0$b;->j:Le/h;

    iput-object v0, p0, Le/b0;->k:Le/h;

    iget-object v0, p1, Le/b0$b;->k:Le/k0/g/d;

    iput-object v0, p0, Le/b0;->l:Le/k0/g/d;

    iget-object v0, p1, Le/b0$b;->l:Ljavax/net/SocketFactory;

    iput-object v0, p0, Le/b0;->m:Ljavax/net/SocketFactory;

    iget-object v0, p0, Le/b0;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/p;

    if-nez v2, :cond_1

    invoke-virtual {v3}, Le/p;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p1, Le/b0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Le/k0/e;->B()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    invoke-static {v0}, Le/b0;->t(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Le/k0/n/c;->b(Ljavax/net/ssl/X509TrustManager;)Le/k0/n/c;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v0, p1, Le/b0$b;->m:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Le/b0$b;->n:Le/k0/n/c;

    :goto_2
    iput-object v0, p0, Le/b0;->o:Le/k0/n/c;

    iget-object v0, p0, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v0

    iget-object v1, p0, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Le/k0/l/f;->f(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_5
    iget-object v0, p1, Le/b0$b;->o:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Le/b0;->p:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Le/b0$b;->p:Le/l;

    iget-object v1, p0, Le/b0;->o:Le/k0/n/c;

    invoke-virtual {v0, v1}, Le/l;->f(Le/k0/n/c;)Le/l;

    move-result-object v0

    iput-object v0, p0, Le/b0;->q:Le/l;

    iget-object v0, p1, Le/b0$b;->q:Le/g;

    iput-object v0, p0, Le/b0;->r:Le/g;

    iget-object v0, p1, Le/b0$b;->r:Le/g;

    iput-object v0, p0, Le/b0;->s:Le/g;

    iget-object v0, p1, Le/b0$b;->s:Le/o;

    iput-object v0, p0, Le/b0;->t:Le/o;

    iget-object v0, p1, Le/b0$b;->t:Le/u;

    iput-object v0, p0, Le/b0;->u:Le/u;

    iget-boolean v0, p1, Le/b0$b;->u:Z

    iput-boolean v0, p0, Le/b0;->v:Z

    iget-boolean v0, p1, Le/b0$b;->v:Z

    iput-boolean v0, p0, Le/b0;->w:Z

    iget-boolean v0, p1, Le/b0$b;->w:Z

    iput-boolean v0, p0, Le/b0;->x:Z

    iget v0, p1, Le/b0$b;->x:I

    iput v0, p0, Le/b0;->y:I

    iget v0, p1, Le/b0$b;->y:I

    iput v0, p0, Le/b0;->z:I

    iget v0, p1, Le/b0$b;->z:I

    iput v0, p0, Le/b0;->A:I

    iget v0, p1, Le/b0$b;->A:I

    iput v0, p0, Le/b0;->B:I

    iget p1, p1, Le/b0$b;->B:I

    iput p1, p0, Le/b0;->C:I

    iget-object p1, p0, Le/b0;->f:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Le/b0;->g:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b0;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b0;->f:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method private static t(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    :try_start_0
    invoke-static {}, Le/k0/l/f;->j()Le/k0/l/f;

    move-result-object v0

    invoke-virtual {v0}, Le/k0/l/f;->k()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No System TLS"

    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-boolean v0, p0, Le/b0;->x:Z

    return v0
.end method

.method public B()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Le/b0;->m:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public C()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Le/b0;->n:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public D()I
    .locals 1

    iget v0, p0, Le/b0;->B:I

    return v0
.end method

.method public a()Le/g;
    .locals 1

    iget-object v0, p0, Le/b0;->s:Le/g;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Le/b0;->y:I

    return v0
.end method

.method public c()Le/l;
    .locals 1

    iget-object v0, p0, Le/b0;->q:Le/l;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Le/b0;->z:I

    return v0
.end method

.method public e()Le/o;
    .locals 1

    iget-object v0, p0, Le/b0;->t:Le/o;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/b0;->e:Ljava/util/List;

    return-object v0
.end method

.method public g()Le/r;
    .locals 1

    iget-object v0, p0, Le/b0;->j:Le/r;

    return-object v0
.end method

.method public h()Le/s;
    .locals 1

    iget-object v0, p0, Le/b0;->b:Le/s;

    return-object v0
.end method

.method public i()Le/u;
    .locals 1

    iget-object v0, p0, Le/b0;->u:Le/u;

    return-object v0
.end method

.method public j()Le/v$b;
    .locals 1

    iget-object v0, p0, Le/b0;->h:Le/v$b;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Le/b0;->w:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Le/b0;->v:Z

    return v0
.end method

.method public m()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Le/b0;->p:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/b0;->f:Ljava/util/List;

    return-object v0
.end method

.method o()Le/k0/g/d;
    .locals 1

    iget-object v0, p0, Le/b0;->k:Le/h;

    if-eqz v0, :cond_0

    iget-object v0, v0, Le/h;->b:Le/k0/g/d;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b0;->l:Le/k0/g/d;

    :goto_0
    return-object v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/z;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/b0;->g:Ljava/util/List;

    return-object v0
.end method

.method public q()Le/b0$b;
    .locals 1

    new-instance v0, Le/b0$b;

    invoke-direct {v0, p0}, Le/b0$b;-><init>(Le/b0;)V

    return-object v0
.end method

.method public s(Le/e0;)Le/j;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Le/d0;->f(Le/b0;Le/e0;Z)Le/d0;

    move-result-object p1

    return-object p1
.end method

.method public u()I
    .locals 1

    iget v0, p0, Le/b0;->C:I

    return v0
.end method

.method public v()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/c0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/b0;->d:Ljava/util/List;

    return-object v0
.end method

.method public w()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Le/b0;->c:Ljava/net/Proxy;

    return-object v0
.end method

.method public x()Le/g;
    .locals 1

    iget-object v0, p0, Le/b0;->r:Le/g;

    return-object v0
.end method

.method public y()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Le/b0;->i:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget v0, p0, Le/b0;->A:I

    return v0
.end method
