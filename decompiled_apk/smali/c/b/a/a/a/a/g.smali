.class final synthetic Lc/b/a/a/a/a/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field private final a:Lc/b/a/a/a/a/o;


# direct methods
.method constructor <init>(Lc/b/a/a/a/a/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/a/a/a/a/g;->a:Lc/b/a/a/a/a/o;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lc/b/a/a/a/a/g;->a:Lc/b/a/a/a/a/o;

    invoke-virtual {v0}, Lc/b/a/a/a/a/o;->k()V

    return-void
.end method
