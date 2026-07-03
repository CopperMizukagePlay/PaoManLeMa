package p063i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.v6 */
/* loaded from: classes.dex */
public final class EnumC2025v6 {

    /* renamed from: e */
    public static final EnumC2025v6 f11985e;

    /* renamed from: f */
    public static final EnumC2025v6 f11986f;

    /* renamed from: g */
    public static final EnumC2025v6 f11987g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2025v6[] f11988h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.v6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.v6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i0.v6] */
    static {
        ?? r02 = new Enum("Tabs", 0);
        f11985e = r02;
        ?? r12 = new Enum("Divider", 1);
        f11986f = r12;
        ?? r22 = new Enum("Indicator", 2);
        f11987g = r22;
        f11988h = new EnumC2025v6[]{r02, r12, r22};
    }

    public static EnumC2025v6 valueOf(String str) {
        return (EnumC2025v6) Enum.valueOf(EnumC2025v6.class, str);
    }

    public static EnumC2025v6[] values() {
        return (EnumC2025v6[]) f11988h.clone();
    }
}
