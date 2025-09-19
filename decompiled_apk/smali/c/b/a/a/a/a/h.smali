.class final Lc/b/a/a/a/a/h;
.super Lc/b/a/a/a/a/f;
.source ""


# instance fields
.field final synthetic c:Lc/b/a/a/a/a/f;

.field final synthetic d:Lc/b/a/a/a/a/o;


# direct methods
.method constructor <init>(Lc/b/a/a/a/a/o;Lc/b/a/a/a/f/p;Lc/b/a/a/a/a/f;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/a/a/h;->d:Lc/b/a/a/a/a/o;

    iput-object p3, p0, Lc/b/a/a/a/a/h;->c:Lc/b/a/a/a/a/f;

    invoke-direct {p0, p2}, Lc/b/a/a/a/a/f;-><init>(Lc/b/a/a/a/f/p;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/a/a/h;->d:Lc/b/a/a/a/a/o;

    iget-object v1, p0, Lc/b/a/a/a/a/h;->c:Lc/b/a/a/a/a/f;

    invoke-static {v0, v1}, Lc/b/a/a/a/a/o;->e(Lc/b/a/a/a/a/o;Lc/b/a/a/a/a/f;)V

    return-void
.end method
