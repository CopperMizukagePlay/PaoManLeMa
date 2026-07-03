package p122q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.o0 */
/* loaded from: classes.dex */
public final class EnumC2931o0 {

    /* renamed from: e */
    public static final EnumC2931o0 f15240e;

    /* renamed from: f */
    public static final EnumC2931o0 f15241f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC2931o0[] f15242g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q.o0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q.o0] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f15240e = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f15241f = r12;
        f15242g = new EnumC2931o0[]{r02, r12};
    }

    public static EnumC2931o0 valueOf(String str) {
        return (EnumC2931o0) Enum.valueOf(EnumC2931o0.class, str);
    }

    public static EnumC2931o0[] values() {
        return (EnumC2931o0[]) f15242g.clone();
    }
}
