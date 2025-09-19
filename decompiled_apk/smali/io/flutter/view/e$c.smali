.class final enum Lio/flutter/view/e$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/view/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/flutter/view/e$c;

.field public static final enum c:Lio/flutter/view/e$c;

.field public static final enum d:Lio/flutter/view/e$c;

.field public static final enum e:Lio/flutter/view/e$c;

.field private static final synthetic f:[Lio/flutter/view/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/flutter/view/e$c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/view/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/e$c;->b:Lio/flutter/view/e$c;

    new-instance v0, Lio/flutter/view/e$c;

    const-string v1, "LEFT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/flutter/view/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/e$c;->c:Lio/flutter/view/e$c;

    new-instance v0, Lio/flutter/view/e$c;

    const-string v1, "RIGHT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/flutter/view/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/e$c;->d:Lio/flutter/view/e$c;

    new-instance v0, Lio/flutter/view/e$c;

    const-string v1, "BOTH"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/flutter/view/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/e$c;->e:Lio/flutter/view/e$c;

    const/4 v1, 0x4

    new-array v1, v1, [Lio/flutter/view/e$c;

    sget-object v6, Lio/flutter/view/e$c;->b:Lio/flutter/view/e$c;

    aput-object v6, v1, v2

    sget-object v2, Lio/flutter/view/e$c;->c:Lio/flutter/view/e$c;

    aput-object v2, v1, v3

    sget-object v2, Lio/flutter/view/e$c;->d:Lio/flutter/view/e$c;

    aput-object v2, v1, v4

    aput-object v0, v1, v5

    sput-object v1, Lio/flutter/view/e$c;->f:[Lio/flutter/view/e$c;

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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/e$c;
    .locals 1

    const-class v0, Lio/flutter/view/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/e$c;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/e$c;
    .locals 1

    sget-object v0, Lio/flutter/view/e$c;->f:[Lio/flutter/view/e$c;

    invoke-virtual {v0}, [Lio/flutter/view/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/e$c;

    return-object v0
.end method
