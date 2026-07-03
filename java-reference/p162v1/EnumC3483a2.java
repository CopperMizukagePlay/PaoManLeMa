package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.a2 */
/* loaded from: classes.dex */
public final class EnumC3483a2 {

    /* renamed from: e */
    public static final EnumC3483a2 f16782e;

    /* renamed from: f */
    public static final EnumC3483a2 f16783f;

    /* renamed from: g */
    public static final EnumC3483a2 f16784g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC3483a2[] f16785h;

    /* JADX WARN: Type inference failed for: r0v0, types: [v1.a2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v1.a2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v1.a2, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ContinueTraversal", 0);
        f16782e = r02;
        ?? r12 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f16783f = r12;
        ?? r22 = new Enum("CancelTraversal", 2);
        f16784g = r22;
        f16785h = new EnumC3483a2[]{r02, r12, r22};
    }

    public static EnumC3483a2 valueOf(String str) {
        return (EnumC3483a2) Enum.valueOf(EnumC3483a2.class, str);
    }

    public static EnumC3483a2[] values() {
        return (EnumC3483a2[]) f16785h.clone();
    }
}
