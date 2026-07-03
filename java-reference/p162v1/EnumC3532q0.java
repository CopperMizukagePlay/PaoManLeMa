package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.q0 */
/* loaded from: classes.dex */
public final class EnumC3532q0 {

    /* renamed from: e */
    public static final EnumC3532q0 f17002e;

    /* renamed from: f */
    public static final EnumC3532q0 f17003f;

    /* renamed from: g */
    public static final EnumC3532q0 f17004g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC3532q0[] f17005h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.q0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.q0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.q0] */
    static {
        ?? r02 = new Enum("IsPlacedInLookahead", 0);
        f17002e = r02;
        ?? r12 = new Enum("IsPlacedInApproach", 1);
        f17003f = r12;
        ?? r22 = new Enum("IsNotPlaced", 2);
        f17004g = r22;
        f17005h = new EnumC3532q0[]{r02, r12, r22};
    }

    public static EnumC3532q0 valueOf(String str) {
        return (EnumC3532q0) Enum.valueOf(EnumC3532q0.class, str);
    }

    public static EnumC3532q0[] values() {
        return (EnumC3532q0[]) f17005h.clone();
    }
}
