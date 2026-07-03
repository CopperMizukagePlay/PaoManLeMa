package p001a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.x0 */
/* loaded from: classes.dex */
public final class EnumC0091x0 {

    /* renamed from: e */
    public static final EnumC0091x0 f416e;

    /* renamed from: f */
    public static final EnumC0091x0 f417f;

    /* renamed from: g */
    public static final EnumC0091x0 f418g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0091x0[] f419h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a0.x0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a0.x0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a0.x0] */
    static {
        ?? r02 = new Enum("None", 0);
        f416e = r02;
        ?? r12 = new Enum("Selection", 1);
        f417f = r12;
        ?? r22 = new Enum("Cursor", 2);
        f418g = r22;
        f419h = new EnumC0091x0[]{r02, r12, r22};
    }

    public static EnumC0091x0 valueOf(String str) {
        return (EnumC0091x0) Enum.valueOf(EnumC0091x0.class, str);
    }

    public static EnumC0091x0[] values() {
        return (EnumC0091x0[]) f419h.clone();
    }
}
