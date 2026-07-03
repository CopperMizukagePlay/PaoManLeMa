package p146t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.p0 */
/* loaded from: classes.dex */
public final class EnumC3227p0 {

    /* renamed from: e */
    public static final EnumC3227p0 f16031e;

    /* renamed from: f */
    public static final EnumC3227p0 f16032f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3227p0[] f16033g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t1.p0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t1.p0] */
    static {
        ?? r02 = new Enum("Width", 0);
        f16031e = r02;
        ?? r12 = new Enum("Height", 1);
        f16032f = r12;
        f16033g = new EnumC3227p0[]{r02, r12};
    }

    public static EnumC3227p0 valueOf(String str) {
        return (EnumC3227p0) Enum.valueOf(EnumC3227p0.class, str);
    }

    public static EnumC3227p0[] values() {
        return (EnumC3227p0[]) f16033g.clone();
    }
}
