.class public final Lc/b/a/a/a/f/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/a/f/s;

    invoke-direct {v0}, Lc/b/a/a/a/f/s;-><init>()V

    sput-object v0, Lc/b/a/a/a/f/f;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lc/b/a/a/a/f/r;

    invoke-direct {v0}, Lc/b/a/a/a/f/r;-><init>()V

    sput-object v0, Lc/b/a/a/a/f/f;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
