package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.g1 */
/* loaded from: classes.dex */
public final class EnumC3503g1 {

    /* renamed from: e */
    public static final EnumC3503g1 f16906e;

    /* renamed from: f */
    public static final EnumC3503g1 f16907f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3503g1[] f16908g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.g1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.g1] */
    static {
        ?? r02 = new Enum("Min", 0);
        f16906e = r02;
        ?? r12 = new Enum("Max", 1);
        f16907f = r12;
        f16908g = new EnumC3503g1[]{r02, r12};
    }

    public static EnumC3503g1 valueOf(String str) {
        return (EnumC3503g1) Enum.valueOf(EnumC3503g1.class, str);
    }

    public static EnumC3503g1[] values() {
        return (EnumC3503g1[]) f16908g.clone();
    }
}
