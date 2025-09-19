.class final enum Lio/flutter/plugin/editing/d$c$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/editing/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugin/editing/d$c$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lio/flutter/plugin/editing/d$c$a;

.field public static final enum c:Lio/flutter/plugin/editing/d$c$a;

.field public static final enum d:Lio/flutter/plugin/editing/d$c$a;

.field public static final enum e:Lio/flutter/plugin/editing/d$c$a;

.field private static final synthetic f:[Lio/flutter/plugin/editing/d$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/flutter/plugin/editing/d$c$a;

    const-string v1, "NO_TARGET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/d$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/d$c$a;->b:Lio/flutter/plugin/editing/d$c$a;

    new-instance v0, Lio/flutter/plugin/editing/d$c$a;

    const-string v1, "FRAMEWORK_CLIENT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/flutter/plugin/editing/d$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/d$c$a;->c:Lio/flutter/plugin/editing/d$c$a;

    new-instance v0, Lio/flutter/plugin/editing/d$c$a;

    const-string v1, "VD_PLATFORM_VIEW"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/flutter/plugin/editing/d$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/d$c$a;->d:Lio/flutter/plugin/editing/d$c$a;

    new-instance v0, Lio/flutter/plugin/editing/d$c$a;

    const-string v1, "HC_PLATFORM_VIEW"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/flutter/plugin/editing/d$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/d$c$a;->e:Lio/flutter/plugin/editing/d$c$a;

    const/4 v1, 0x4

    new-array v1, v1, [Lio/flutter/plugin/editing/d$c$a;

    sget-object v6, Lio/flutter/plugin/editing/d$c$a;->b:Lio/flutter/plugin/editing/d$c$a;

    aput-object v6, v1, v2

    sget-object v2, Lio/flutter/plugin/editing/d$c$a;->c:Lio/flutter/plugin/editing/d$c$a;

    aput-object v2, v1, v3

    sget-object v2, Lio/flutter/plugin/editing/d$c$a;->d:Lio/flutter/plugin/editing/d$c$a;

    aput-object v2, v1, v4

    aput-object v0, v1, v5

    sput-object v1, Lio/flutter/plugin/editing/d$c$a;->f:[Lio/flutter/plugin/editing/d$c$a;

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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugin/editing/d$c$a;
    .locals 1

    const-class v0, Lio/flutter/plugin/editing/d$c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugin/editing/d$c$a;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugin/editing/d$c$a;
    .locals 1

    sget-object v0, Lio/flutter/plugin/editing/d$c$a;->f:[Lio/flutter/plugin/editing/d$c$a;

    invoke-virtual {v0}, [Lio/flutter/plugin/editing/d$c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugin/editing/d$c$a;

    return-object v0
.end method
