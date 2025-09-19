.class public final synthetic Le/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/u;


# static fields
.field public static final synthetic b:Le/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le/c;

    invoke-direct {v0}, Le/c;-><init>()V

    sput-object v0, Le/c;->b:Le/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p1}, Le/t;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
