package p071j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.t0 */
/* loaded from: classes.dex */
public final class EnumC2153t0 {

    /* renamed from: e */
    public static final EnumC2153t0 f12530e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC2153t0[] f12531f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2153t0 EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j0.t0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j0.t0] */
    static {
        ?? r02 = new Enum("Filled", 0);
        ?? r12 = new Enum("Outlined", 1);
        f12530e = r12;
        f12531f = new EnumC2153t0[]{r02, r12};
    }

    public static EnumC2153t0 valueOf(String str) {
        return (EnumC2153t0) Enum.valueOf(EnumC2153t0.class, str);
    }

    public static EnumC2153t0[] values() {
        return (EnumC2153t0[]) f12531f.clone();
    }
}
