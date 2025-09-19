.class public final Lc/b/a/a/a/a/l0;
.super Lc/b/a/a/a/a/i0;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/n0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService"

    invoke-direct {p0, p1, v0}, Lc/b/a/a/a/a/i0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final J(Ljava/lang/String;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final N(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final S(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;",
            "Landroid/os/Bundle;",
            "Lc/b/a/a/a/a/p0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xe

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final t(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final u(Ljava/lang/String;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final z(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lc/b/a/a/a/a/p0;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p4}, Lc/b/a/a/a/a/k0;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method
