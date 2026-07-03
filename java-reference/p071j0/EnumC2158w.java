package p071j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.w */
/* loaded from: classes.dex */
public final class EnumC2158w {

    /* renamed from: e */
    public static final EnumC2158w f12551e;

    /* renamed from: f */
    public static final EnumC2158w f12552f;

    /* renamed from: g */
    public static final EnumC2158w f12553g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2158w[] f12554h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j0.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j0.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j0.w] */
    static {
        ?? r02 = new Enum("Focused", 0);
        f12551e = r02;
        ?? r12 = new Enum("UnfocusedEmpty", 1);
        f12552f = r12;
        ?? r22 = new Enum("UnfocusedNotEmpty", 2);
        f12553g = r22;
        f12554h = new EnumC2158w[]{r02, r12, r22};
    }

    public static EnumC2158w valueOf(String str) {
        return (EnumC2158w) Enum.valueOf(EnumC2158w.class, str);
    }

    public static EnumC2158w[] values() {
        return (EnumC2158w[]) f12554h.clone();
    }
}
