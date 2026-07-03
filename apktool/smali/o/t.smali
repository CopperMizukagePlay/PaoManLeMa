.class public abstract Lo/t;
.super Ljava/lang/Object;
.source "r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    sput-wide v0, Lo/t;->a:J

    .line 7
    .line 8
    return-void
.end method
