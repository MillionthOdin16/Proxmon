.class final enum Lio/flutter/view/c$f;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/view/c$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lio/flutter/view/c$f;

.field public static final enum d:Lio/flutter/view/c$f;

.field public static final enum e:Lio/flutter/view/c$f;

.field private static final synthetic f:[Lio/flutter/view/c$f;


# instance fields
.field final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lio/flutter/view/c$f;

    const-string v1, "ACCESSIBLE_NAVIGATION"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/c$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/c$f;->c:Lio/flutter/view/c$f;

    new-instance v0, Lio/flutter/view/c$f;

    const-string v1, "INVERT_COLORS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lio/flutter/view/c$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/c$f;->d:Lio/flutter/view/c$f;

    new-instance v0, Lio/flutter/view/c$f;

    const-string v1, "DISABLE_ANIMATIONS"

    const/4 v5, 0x4

    invoke-direct {v0, v1, v4, v5}, Lio/flutter/view/c$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/c$f;->e:Lio/flutter/view/c$f;

    const/4 v1, 0x3

    new-array v1, v1, [Lio/flutter/view/c$f;

    sget-object v5, Lio/flutter/view/c$f;->c:Lio/flutter/view/c$f;

    aput-object v5, v1, v2

    sget-object v2, Lio/flutter/view/c$f;->d:Lio/flutter/view/c$f;

    aput-object v2, v1, v3

    aput-object v0, v1, v4

    sput-object v1, Lio/flutter/view/c$f;->f:[Lio/flutter/view/c$f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/view/c$f;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/c$f;
    .locals 1

    const-class v0, Lio/flutter/view/c$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/c$f;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/c$f;
    .locals 1

    sget-object v0, Lio/flutter/view/c$f;->f:[Lio/flutter/view/c$f;

    invoke-virtual {v0}, [Lio/flutter/view/c$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/c$f;

    return-object v0
.end method
