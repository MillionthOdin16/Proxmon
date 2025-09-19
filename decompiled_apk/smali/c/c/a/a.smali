.class public Lc/c/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$c;
.implements Lio/flutter/embedding/engine/i/a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ApplySharedPref"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/c/a/a$a;,
        Lc/c/a/a$b;
    }
.end annotation


# instance fields
.field private b:Ld/a/c/a/i;

.field private c:Landroid/content/SharedPreferences;

.field private d:Ljava/nio/charset/Charset;

.field private e:Lc/c/a/b/c;

.field private f:Landroid/content/Context;

.field private g:Landroid/os/HandlerThread;

.field private h:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lc/c/a/a;)V
    .locals 0

    invoke-direct {p0}, Lc/c/a/a;->m()V

    return-void
.end method

.method static synthetic b(Lc/c/a/a;Ld/a/c/a/h;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lc/c/a/a;->n(Ld/a/c/a/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lc/c/a/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/c/a/a;->r(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lc/c/a/a;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static synthetic e(Lc/c/a/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lc/c/a/a;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lc/c/a/a;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lc/c/a/a;->q()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lc/c/a/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/c/a/a;->k(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h(Lc/c/a/a;)V
    .locals 0

    invoke-direct {p0}, Lc/c/a/a;->l()V

    return-void
.end method

.method private i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    iget-object v0, p0, Lc/c/a/a;->e:Lc/c/a/b/c;

    invoke-interface {v0, p1}, Lc/c/a/b/c;->b([B)[B

    move-result-object p1

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lc/c/a/a;->d:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method private k(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private m()V
    .locals 3

    iget-object v0, p0, Lc/c/a/a;->e:Lc/c/a/b/c;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lc/c/a/b/b;

    iget-object v1, p0, Lc/c/a/a;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lc/c/a/b/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/c/a/a;->e:Lc/c/a/b/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "FlutterSecureStoragePl"

    const-string v2, "StorageCipher initialization failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method private n(Ld/a/c/a/h;)Ljava/lang/String;
    .locals 1

    iget-object p1, p1, Ld/a/c/a/h;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "key"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lc/c/a/a;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private p(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/c/a/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private q()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_"

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lc/c/a/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private r(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc/c/a/a;->e:Lc/c/a/b/c;

    iget-object v1, p0, Lc/c/a/a;->d:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-interface {v0, p2}, Lc/c/a/b/c;->a([B)[B

    move-result-object p2

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p2, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method


# virtual methods
.method public o(Ld/a/c/a/b;Landroid/content/Context;)V
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lc/c/a/a;->f:Landroid/content/Context;

    const-string v0, "FlutterSecureStorage"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lc/c/a/a;->d:Ljava/nio/charset/Charset;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "com.it_nomads.fluttersecurestorage.worker"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lc/c/a/a;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lc/c/a/a;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lc/c/a/a;->h:Landroid/os/Handler;

    iget-object v0, p0, Lc/c/a/a;->c:Landroid/content/SharedPreferences;

    invoke-static {v0, p2}, Lc/c/a/b/b;->c(Landroid/content/SharedPreferences;Landroid/content/Context;)V

    new-instance p2, Ld/a/c/a/i;

    const-string v0, "plugins.it_nomads.com/flutter_secure_storage"

    invoke-direct {p2, p1, v0}, Ld/a/c/a/i;-><init>(Ld/a/c/a/b;Ljava/lang/String;)V

    iput-object p2, p0, Lc/c/a/a;->b:Ld/a/c/a/i;

    invoke-virtual {p2, p0}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "FlutterSecureStoragePl"

    const-string v0, "Registration failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->b()Ld/a/c/a/b;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/i/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lc/c/a/a;->o(Ld/a/c/a/b;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/i/a$b;)V
    .locals 1

    iget-object p1, p0, Lc/c/a/a;->b:Ld/a/c/a/i;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/c/a/a;->g:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quitSafely()Z

    const/4 p1, 0x0

    iput-object p1, p0, Lc/c/a/a;->g:Landroid/os/HandlerThread;

    iget-object v0, p0, Lc/c/a/a;->b:Ld/a/c/a/i;

    invoke-virtual {v0, p1}, Ld/a/c/a/i;->e(Ld/a/c/a/i$c;)V

    iput-object p1, p0, Lc/c/a/a;->b:Ld/a/c/a/i;

    :cond_0
    return-void
.end method

.method public onMethodCall(Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 2

    new-instance v0, Lc/c/a/a$a;

    invoke-direct {v0, p2}, Lc/c/a/a$a;-><init>(Ld/a/c/a/i$d;)V

    iget-object p2, p0, Lc/c/a/a;->h:Landroid/os/Handler;

    new-instance v1, Lc/c/a/a$b;

    invoke-direct {v1, p0, p1, v0}, Lc/c/a/a$b;-><init>(Lc/c/a/a;Ld/a/c/a/h;Ld/a/c/a/i$d;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
