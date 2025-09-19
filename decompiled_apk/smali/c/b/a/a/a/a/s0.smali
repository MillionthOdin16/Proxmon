.class public final Lc/b/a/a/a/a/s0;
.super Lc/b/a/a/a/a/i0;
.source ""

# interfaces
.implements Lc/b/a/a/a/a/t0;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"

    invoke-direct {p0, p1, v0}, Lc/b/a/a/a/a/i0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final f(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/a/a/i0;->W()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/a/a/a/a/k0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/a/a/i0;->X(ILandroid/os/Parcel;)V

    return-void
.end method
