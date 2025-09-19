.class final enum Lio/flutter/embedding/android/k$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/android/k$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/flutter/embedding/android/k$e;

.field public static final enum c:Lio/flutter/embedding/android/k$e;

.field public static final enum d:Lio/flutter/embedding/android/k$e;

.field public static final enum e:Lio/flutter/embedding/android/k$e;

.field private static final synthetic f:[Lio/flutter/embedding/android/k$e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/flutter/embedding/android/k$e;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/android/k$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/k$e;->b:Lio/flutter/embedding/android/k$e;

    new-instance v0, Lio/flutter/embedding/android/k$e;

    const-string v1, "LEFT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/flutter/embedding/android/k$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/k$e;->c:Lio/flutter/embedding/android/k$e;

    new-instance v0, Lio/flutter/embedding/android/k$e;

    const-string v1, "RIGHT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/flutter/embedding/android/k$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/k$e;->d:Lio/flutter/embedding/android/k$e;

    new-instance v0, Lio/flutter/embedding/android/k$e;

    const-string v1, "BOTH"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/flutter/embedding/android/k$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/k$e;->e:Lio/flutter/embedding/android/k$e;

    const/4 v1, 0x4

    new-array v1, v1, [Lio/flutter/embedding/android/k$e;

    sget-object v6, Lio/flutter/embedding/android/k$e;->b:Lio/flutter/embedding/android/k$e;

    aput-object v6, v1, v2

    sget-object v2, Lio/flutter/embedding/android/k$e;->c:Lio/flutter/embedding/android/k$e;

    aput-object v2, v1, v3

    sget-object v2, Lio/flutter/embedding/android/k$e;->d:Lio/flutter/embedding/android/k$e;

    aput-object v2, v1, v4

    aput-object v0, v1, v5

    sput-object v1, Lio/flutter/embedding/android/k$e;->f:[Lio/flutter/embedding/android/k$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/android/k$e;
    .locals 1

    const-class v0, Lio/flutter/embedding/android/k$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/android/k$e;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/android/k$e;
    .locals 1

    sget-object v0, Lio/flutter/embedding/android/k$e;->f:[Lio/flutter/embedding/android/k$e;

    invoke-virtual {v0}, [Lio/flutter/embedding/android/k$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/android/k$e;

    return-object v0
.end method
