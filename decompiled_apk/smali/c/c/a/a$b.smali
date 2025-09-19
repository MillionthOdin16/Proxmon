.class Lc/c/a/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final b:Ld/a/c/a/h;

.field private final c:Ld/a/c/a/i$d;

.field final synthetic d:Lc/c/a/a;


# direct methods
.method constructor <init>(Lc/c/a/a;Ld/a/c/a/h;Ld/a/c/a/i$d;)V
    .locals 0

    iput-object p1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    iput-object p3, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    iget-object v0, v0, Ld/a/c/a/h;->a:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "readAll"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "write"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :sswitch_2
    const-string v2, "read"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "deleteAll"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :sswitch_4
    const-string v2, "delete"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x3

    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eqz v1, :cond_6

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    iget-object v0, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    invoke-interface {v0}, Ld/a/c/a/i$d;->notImplemented()V

    goto/16 :goto_2

    :cond_1
    iget-object v1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v1}, Lc/c/a/a;->h(Lc/c/a/a;)V

    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    :goto_1
    invoke-interface {v1, v0}, Ld/a/c/a/i$d;->success(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    iget-object v2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    invoke-static {v1, v2}, Lc/c/a/a;->b(Lc/c/a/a;Ld/a/c/a/h;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v2, v1}, Lc/c/a/a;->g(Lc/c/a/a;Ljava/lang/String;)V

    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v0}, Lc/c/a/a;->a(Lc/c/a/a;)V

    iget-object v0, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v0}, Lc/c/a/a;->f(Lc/c/a/a;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    iget-object v2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    invoke-static {v1, v2}, Lc/c/a/a;->b(Lc/c/a/a;Ld/a/c/a/h;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v2}, Lc/c/a/a;->d(Lc/c/a/a;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v0, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v0}, Lc/c/a/a;->a(Lc/c/a/a;)V

    iget-object v0, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v0, v1}, Lc/c/a/a;->e(Lc/c/a/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v1}, Lc/c/a/a;->a(Lc/c/a/a;)V

    iget-object v1, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    iget-object v2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    invoke-static {v1, v2}, Lc/c/a/a;->b(Lc/c/a/a;Ld/a/c/a/h;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    iget-object v2, v2, Ld/a/c/a/h;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-string v3, "value"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lc/c/a/a$b;->d:Lc/c/a/a;

    invoke-static {v3, v1, v2}, Lc/c/a/a;->c(Lc/c/a/a;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {v0, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    iget-object v0, p0, Lc/c/a/a$b;->c:Ld/a/c/a/i$d;

    iget-object v2, p0, Lc/c/a/a$b;->b:Ld/a/c/a/h;

    iget-object v2, v2, Ld/a/c/a/h;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Exception encountered"

    invoke-interface {v0, v3, v2, v1}, Ld/a/c/a/i$d;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4f997a55 -> :sswitch_4
        -0x1561e80a -> :sswitch_3
        0x355996 -> :sswitch_2
        0x6c257df -> :sswitch_1
        0x4065382b -> :sswitch_0
    .end sparse-switch
.end method
