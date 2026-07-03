package p107o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.y0 */
/* loaded from: classes.dex */
public final class EnumC2788y0 {

    /* renamed from: e */
    public static final EnumC2788y0 f14796e;

    /* renamed from: f */
    public static final EnumC2788y0 f14797f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC2788y0[] f14798g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o.y0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o.y0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o.y0] */
    static {
        ?? r02 = new Enum("Default", 0);
        f14796e = r02;
        ?? r12 = new Enum("UserInput", 1);
        f14797f = r12;
        f14798g = new EnumC2788y0[]{r02, r12, new Enum("PreventUserInput", 2)};
    }

    public static EnumC2788y0 valueOf(String str) {
        return (EnumC2788y0) Enum.valueOf(EnumC2788y0.class, str);
    }

    public static EnumC2788y0[] values() {
        return (EnumC2788y0[]) f14798g.clone();
    }
}
