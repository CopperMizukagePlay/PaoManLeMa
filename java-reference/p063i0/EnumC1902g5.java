package p063i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.g5 */
/* loaded from: classes.dex */
public final class EnumC1902g5 {

    /* renamed from: e */
    public static final EnumC1902g5 f11236e;

    /* renamed from: f */
    public static final EnumC1902g5 f11237f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1902g5[] f11238g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.g5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.g5] */
    static {
        ?? r02 = new Enum("THUMB", 0);
        f11236e = r02;
        ?? r12 = new Enum("TRACK", 1);
        f11237f = r12;
        f11238g = new EnumC1902g5[]{r02, r12};
    }

    public static EnumC1902g5 valueOf(String str) {
        return (EnumC1902g5) Enum.valueOf(EnumC1902g5.class, str);
    }

    public static EnumC1902g5[] values() {
        return (EnumC1902g5[]) f11238g.clone();
    }
}
