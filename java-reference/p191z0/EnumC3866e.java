package p191z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z0.e */
/* loaded from: classes.dex */
public final class EnumC3866e {

    /* renamed from: e */
    public static final EnumC3866e f18123e;

    /* renamed from: f */
    public static final EnumC3866e f18124f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3866e[] f18125g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z0.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z0.e] */
    static {
        ?? r02 = new Enum("VIEW_APPEAR", 0);
        f18123e = r02;
        ?? r12 = new Enum("VIEW_DISAPPEAR", 1);
        f18124f = r12;
        f18125g = new EnumC3866e[]{r02, r12};
    }

    public static EnumC3866e valueOf(String str) {
        return (EnumC3866e) Enum.valueOf(EnumC3866e.class, str);
    }

    public static EnumC3866e[] values() {
        return (EnumC3866e[]) f18125g.clone();
    }
}
