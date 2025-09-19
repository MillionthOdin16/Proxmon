.class final Lc/b/a/a/a/b/b;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field final synthetic a:Lc/b/a/a/a/b/c;


# direct methods
.method synthetic constructor <init>(Lc/b/a/a/a/b/c;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/a/b/b;->a:Lc/b/a/a/a/b/c;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/a/a/b/b;->a:Lc/b/a/a/a/b/c;

    invoke-virtual {v0, p1, p2}, Lc/b/a/a/a/b/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
