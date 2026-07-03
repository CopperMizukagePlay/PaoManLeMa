package p170w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.e2 */
/* loaded from: classes.dex */
public final class EnumC3671e2 {

    /* renamed from: e */
    public static final EnumC3671e2 f17506e;

    /* renamed from: f */
    public static final EnumC3671e2 f17507f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3671e2[] f17508g;

    /* JADX WARN: Type inference failed for: r0v0, types: [w1.e2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w1.e2, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Shown", 0);
        f17506e = r02;
        ?? r12 = new Enum("Hidden", 1);
        f17507f = r12;
        f17508g = new EnumC3671e2[]{r02, r12};
    }

    public static EnumC3671e2 valueOf(String str) {
        return (EnumC3671e2) Enum.valueOf(EnumC3671e2.class, str);
    }

    public static EnumC3671e2[] values() {
        return (EnumC3671e2[]) f17508g.clone();
    }
}
