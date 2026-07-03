package p146t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.r */
/* loaded from: classes.dex */
public final class EnumC3230r {

    /* renamed from: e */
    public static final EnumC3230r f16036e;

    /* renamed from: f */
    public static final EnumC3230r f16037f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3230r[] f16038g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t1.r] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t1.r] */
    static {
        ?? r02 = new Enum("Min", 0);
        f16036e = r02;
        ?? r12 = new Enum("Max", 1);
        f16037f = r12;
        f16038g = new EnumC3230r[]{r02, r12};
    }

    public static EnumC3230r valueOf(String str) {
        return (EnumC3230r) Enum.valueOf(EnumC3230r.class, str);
    }

    public static EnumC3230r[] values() {
        return (EnumC3230r[]) f16038g.clone();
    }
}
