.class public abstract Lc/b/a/a/a/a/a;
.super Lc/b/a/a/a/a/j0;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/b;


# direct methods
.method public static X(Landroid/os/IBinder;)Lc/b/a/a/a/a/b;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.inappreview.protocol.IInAppReviewService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lc/b/a/a/a/a/b;

    if-eqz v1, :cond_1

    check-cast v0, Lc/b/a/a/a/a/b;

    return-object v0

    :cond_1
    new-instance v0, Lc/b/a/a/a/a/u0;

    invoke-direct {v0, p0}, Lc/b/a/a/a/a/u0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
