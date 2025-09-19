.class Lio/flutter/embedding/engine/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/i/b;
.implements Lio/flutter/embedding/engine/i/c/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/d$e;,
        Lio/flutter/embedding/engine/d$d;,
        Lio/flutter/embedding/engine/d$f;,
        Lio/flutter/embedding/engine/d$c;,
        Lio/flutter/embedding/engine/d$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;",
            "Lio/flutter/embedding/engine/i/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lio/flutter/embedding/engine/b;

.field private final c:Lio/flutter/embedding/engine/i/a$b;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;",
            "Lio/flutter/embedding/engine/i/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/app/Activity;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private f:Lio/flutter/embedding/android/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/embedding/android/d<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lio/flutter/embedding/engine/d$c;

.field private h:Z

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;",
            "Lio/flutter/embedding/engine/i/f/a;",
            ">;"
        }
    .end annotation
.end field

.field private j:Landroid/app/Service;

.field private k:Lio/flutter/embedding/engine/d$f;

.field private final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;",
            "Lio/flutter/embedding/engine/i/d/a;",
            ">;"
        }
    .end annotation
.end field

.field private m:Landroid/content/BroadcastReceiver;

.field private n:Lio/flutter/embedding/engine/d$d;

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;",
            "Lio/flutter/embedding/engine/i/e/a;",
            ">;"
        }
    .end annotation
.end field

.field private p:Landroid/content/ContentProvider;

.field private q:Lio/flutter/embedding/engine/d$e;


# direct methods
.method constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/b;Lio/flutter/embedding/engine/h/c;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/engine/d;->h:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->l:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->o:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    new-instance v0, Lio/flutter/embedding/engine/i/a$b;

    invoke-virtual {p2}, Lio/flutter/embedding/engine/b;->h()Lio/flutter/embedding/engine/f/a;

    move-result-object v4

    invoke-virtual {p2}, Lio/flutter/embedding/engine/b;->q()Lio/flutter/embedding/engine/renderer/a;

    move-result-object v5

    invoke-virtual {p2}, Lio/flutter/embedding/engine/b;->o()Lio/flutter/plugin/platform/k;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugin/platform/k;->I()Lio/flutter/plugin/platform/h;

    move-result-object v6

    new-instance v7, Lio/flutter/embedding/engine/d$b;

    const/4 v1, 0x0

    invoke-direct {v7, p3, v1}, Lio/flutter/embedding/engine/d$b;-><init>(Lio/flutter/embedding/engine/h/c;Lio/flutter/embedding/engine/d$a;)V

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lio/flutter/embedding/engine/i/a$b;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/b;Ld/a/c/a/b;Lio/flutter/view/f;Lio/flutter/plugin/platform/h;Lio/flutter/embedding/engine/i/a$a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->c:Lio/flutter/embedding/engine/i/a$b;

    return-void
.end method

.method private i(Landroid/app/Activity;Landroidx/lifecycle/d;)V
    .locals 2

    new-instance v0, Lio/flutter/embedding/engine/d$c;

    invoke-direct {v0, p1, p2}, Lio/flutter/embedding/engine/d$c;-><init>(Landroid/app/Activity;Landroidx/lifecycle/d;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    iget-object p2, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    invoke-virtual {p2}, Lio/flutter/embedding/engine/b;->o()Lio/flutter/plugin/platform/k;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/b;->q()Lio/flutter/embedding/engine/renderer/a;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/b;->h()Lio/flutter/embedding/engine/f/a;

    move-result-object v1

    invoke-virtual {p2, p1, v0, v1}, Lio/flutter/plugin/platform/k;->u(Landroid/content/Context;Lio/flutter/view/f;Lio/flutter/embedding/engine/f/a;)V

    iget-object p1, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/embedding/engine/i/c/a;

    iget-boolean v0, p0, Lio/flutter/embedding/engine/d;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-interface {p2, v0}, Lio/flutter/embedding/engine/i/c/a;->onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/i/c/c;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-interface {p2, v0}, Lio/flutter/embedding/engine/i/c/a;->onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/embedding/engine/d;->h:Z

    return-void
.end method

.method private j()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->f:Lio/flutter/embedding/android/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/embedding/android/d;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/d;->e:Landroid/app/Activity;

    :goto_0
    return-object v0
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/b;->o()Lio/flutter/plugin/platform/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/k;->C()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->f:Lio/flutter/embedding/android/d;

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->e:Landroid/app/Activity;

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    return-void
.end method

.method private m()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/engine/d;->f()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/flutter/embedding/engine/d;->p()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/flutter/embedding/engine/d;->n()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lio/flutter/embedding/engine/d;->o()V

    :cond_3
    :goto_0
    return-void
.end method

.method private r()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->e:Landroid/app/Activity;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->f:Lio/flutter/embedding/android/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private s()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->m:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private t()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->p:Landroid/content/ContentProvider;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private u()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->j:Landroid/app/Service;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onNewIntent() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/d$c;->d(Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string p1, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached."

    invoke-static {v0, p1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onRestoreInstanceState() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/d$c;->f(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const-string p1, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."

    invoke-static {v0, p1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onSaveInstanceState() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/d$c;->g(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    const-string p1, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached."

    invoke-static {v0, p1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onUserLeaveHint() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/d$c;->h()V

    goto :goto_0

    :cond_0
    const-string v1, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached."

    invoke-static {v0, v1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public e(Lio/flutter/embedding/android/d;Landroidx/lifecycle/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/embedding/android/d<",
            "Landroid/app/Activity;",
            ">;",
            "Landroidx/lifecycle/d;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attaching to an exclusive Activity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lio/flutter/embedding/android/d;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " evicting previous activity "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->j()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/flutter/embedding/engine/d;->h:Z

    if-eqz v1, :cond_1

    const-string v2, " This is after a config change."

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterEngineCxnRegstry"

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->f:Lio/flutter/embedding/android/d;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lio/flutter/embedding/android/d;->c()V

    :cond_2
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->m()V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->e:Landroid/app/Activity;

    if-nez v0, :cond_3

    iput-object p1, p0, Lio/flutter/embedding/engine/d;->f:Lio/flutter/embedding/android/d;

    invoke-interface {p1}, Lio/flutter/embedding/android/d;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/d;->i(Landroid/app/Activity;Landroidx/lifecycle/d;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Only activity or exclusiveActivity should be set"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public f()V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Detaching from an Activity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->j()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/i/c/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/c/a;->onDetachedFromActivity()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->l()V

    goto :goto_1

    :cond_1
    const-string v0, "Attempted to detach plugins from an Activity when no Activity was attached."

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public g(Lio/flutter/embedding/engine/i/a;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/d;->q(Ljava/lang/Class;)Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to register plugin ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") but it was already registered with this FlutterEngine ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lio/flutter/embedding/engine/d;->b:Lio/flutter/embedding/engine/b;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ld/a/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding plugin: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->c:Lio/flutter/embedding/engine/i/a$b;

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/i/a;->onAttachedToEngine(Lio/flutter/embedding/engine/i/a$b;)V

    instance-of v0, p1, Lio/flutter/embedding/engine/i/c/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/i/c/a;

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/i/c/a;->onAttachedToActivity(Lio/flutter/embedding/engine/i/c/c;)V

    :cond_1
    instance-of v0, p1, Lio/flutter/embedding/engine/i/f/a;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/i/f/a;

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->i:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->u()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->k:Lio/flutter/embedding/engine/d$f;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/i/f/a;->a(Lio/flutter/embedding/engine/i/f/b;)V

    :cond_2
    instance-of v0, p1, Lio/flutter/embedding/engine/i/d/a;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/i/d/a;

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->l:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->s()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->n:Lio/flutter/embedding/engine/d$d;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/i/d/a;->a(Lio/flutter/embedding/engine/i/d/b;)V

    :cond_3
    instance-of v0, p1, Lio/flutter/embedding/engine/i/e/a;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/i/e/a;

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->o:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->t()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/flutter/embedding/engine/d;->q:Lio/flutter/embedding/engine/d$e;

    invoke-interface {v0, p1}, Lio/flutter/embedding/engine/i/e/a;->a(Lio/flutter/embedding/engine/i/e/b;)V

    :cond_4
    return-void
.end method

.method public h()V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Detaching from an Activity for config changes: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->j()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/embedding/engine/d;->h:Z

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/i/c/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/c/a;->onDetachedFromActivityForConfigChanges()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->l()V

    goto :goto_1

    :cond_1
    const-string v0, "Attempted to detach plugins from an Activity when no Activity was attached."

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public k()V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->m()V

    invoke-virtual {p0}, Lio/flutter/embedding/engine/d;->x()V

    return-void
.end method

.method public n()V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->s()Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Detaching from BroadcastReceiver: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/engine/d;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->l:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/i/d/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/d/a;->b()V

    goto :goto_0

    :cond_0
    const-string v0, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached."

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public o()V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->t()Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Detaching from ContentProvider: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/engine/d;->p:Landroid/content/ContentProvider;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/i/e/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/e/a;->b()V

    goto :goto_0

    :cond_0
    const-string v0, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached."

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onActivityResult() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/d$c;->c(IILandroid/content/Intent;)Z

    move-result p1

    return p1

    :cond_0
    const-string p1, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached."

    invoke-static {v0, p1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Forwarding onRequestPermissionsResult() to plugins."

    invoke-static {v0, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->g:Lio/flutter/embedding/engine/d$c;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/d$c;->e(I[Ljava/lang/String;[I)Z

    move-result p1

    return p1

    :cond_0
    const-string p1, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached."

    invoke-static {v0, p1}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public p()V
    .locals 3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->u()Z

    move-result v0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Detaching from a Service: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/embedding/engine/d;->j:Landroid/app/Service;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/i/f/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/f/a;->b()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->j:Landroid/app/Service;

    iput-object v0, p0, Lio/flutter/embedding/engine/d;->k:Lio/flutter/embedding/engine/d$f;

    goto :goto_1

    :cond_1
    const-string v0, "Attempted to detach plugins from a Service when no Service was attached."

    invoke-static {v1, v0}, Ld/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public q(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public v(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/embedding/engine/i/a;

    if-eqz v0, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Removing plugin: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FlutterEngineCxnRegstry"

    invoke-static {v2, v1}, Ld/a/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v1, v0, Lio/flutter/embedding/engine/i/c/a;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/i/c/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/c/a;->onDetachedFromActivity()V

    :cond_0
    iget-object v1, p0, Lio/flutter/embedding/engine/d;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    instance-of v1, v0, Lio/flutter/embedding/engine/i/f/a;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->u()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/i/f/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/f/a;->b()V

    :cond_2
    iget-object v1, p0, Lio/flutter/embedding/engine/d;->i:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    instance-of v1, v0, Lio/flutter/embedding/engine/i/d/a;

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->s()Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/i/d/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/d/a;->b()V

    :cond_4
    iget-object v1, p0, Lio/flutter/embedding/engine/d;->l:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    instance-of v1, v0, Lio/flutter/embedding/engine/i/e/a;

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lio/flutter/embedding/engine/d;->t()Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/i/e/a;

    invoke-interface {v1}, Lio/flutter/embedding/engine/i/e/a;->b()V

    :cond_6
    iget-object v1, p0, Lio/flutter/embedding/engine/d;->o:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Lio/flutter/embedding/engine/d;->c:Lio/flutter/embedding/engine/i/a$b;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/i/a;->onDetachedFromEngine(Lio/flutter/embedding/engine/i/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-void
.end method

.method public w(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/i/a;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/d;->v(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public x()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/d;->w(Ljava/util/Set;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/d;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
