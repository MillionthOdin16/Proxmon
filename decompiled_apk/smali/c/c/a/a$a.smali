.class Lc/c/a/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/c/a/i$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ld/a/c/a/i$d;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ld/a/c/a/i$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lc/c/a/a$a;->b:Landroid/os/Handler;

    iput-object p1, p0, Lc/c/a/a$a;->a:Ld/a/c/a/i$d;

    return-void
.end method

.method static synthetic a(Lc/c/a/a$a;)Ld/a/c/a/i$d;
    .locals 0

    iget-object p0, p0, Lc/c/a/a$a;->a:Ld/a/c/a/i$d;

    return-object p0
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/c/a/a$a;->b:Landroid/os/Handler;

    new-instance v1, Lc/c/a/a$a$b;

    invoke-direct {v1, p0, p1, p2, p3}, Lc/c/a/a$a$b;-><init>(Lc/c/a/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public notImplemented()V
    .locals 2

    iget-object v0, p0, Lc/c/a/a$a;->b:Landroid/os/Handler;

    new-instance v1, Lc/c/a/a$a$c;

    invoke-direct {v1, p0}, Lc/c/a/a$a$c;-><init>(Lc/c/a/a$a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/c/a/a$a;->b:Landroid/os/Handler;

    new-instance v1, Lc/c/a/a$a$a;

    invoke-direct {v1, p0, p1}, Lc/c/a/a$a$a;-><init>(Lc/c/a/a$a;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
