package p117p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.k */
/* loaded from: classes.dex */
public final class EnumC2860k {

    /* renamed from: e */
    public static final EnumC2860k f14995e;

    /* renamed from: f */
    public static final EnumC2860k f14996f;

    /* renamed from: g */
    public static final EnumC2860k f14997g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2860k[] f14998h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p1.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p1.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p1.k] */
    static {
        ?? r02 = new Enum("Initial", 0);
        f14995e = r02;
        ?? r12 = new Enum("Main", 1);
        f14996f = r12;
        ?? r22 = new Enum("Final", 2);
        f14997g = r22;
        f14998h = new EnumC2860k[]{r02, r12, r22};
    }

    public static EnumC2860k valueOf(String str) {
        return (EnumC2860k) Enum.valueOf(EnumC2860k.class, str);
    }

    public static EnumC2860k[] values() {
        return (EnumC2860k[]) f14998h.clone();
    }
}
