.class public Lc/b/a/a/a/c/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lc/b/a/a/a/c/b;
    .locals 2

    invoke-static {p0}, Lcom/google/android/play/core/common/PlayCoreDialogWrapperActivity;->a(Landroid/content/Context;)V

    invoke-static {p0}, Lc/b/a/a/a/d/a;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lc/b/a/a/a/c/f;

    new-instance v1, Lc/b/a/a/a/c/k;

    invoke-direct {v1, p0}, Lc/b/a/a/a/c/k;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lc/b/a/a/a/c/f;-><init>(Lc/b/a/a/a/c/k;)V

    return-object v0
.end method
