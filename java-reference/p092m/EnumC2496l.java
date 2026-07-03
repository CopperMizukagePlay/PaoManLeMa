package p092m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.l */
/* loaded from: classes.dex */
public final class EnumC2496l {

    /* renamed from: e */
    public static final EnumC2496l f13811e;

    /* renamed from: f */
    public static final EnumC2496l f13812f;

    /* renamed from: g */
    public static final EnumC2496l f13813g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2496l[] f13814h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m.l] */
    static {
        ?? r02 = new Enum("PreEnter", 0);
        f13811e = r02;
        ?? r12 = new Enum("Visible", 1);
        f13812f = r12;
        ?? r22 = new Enum("PostExit", 2);
        f13813g = r22;
        f13814h = new EnumC2496l[]{r02, r12, r22};
    }

    public static EnumC2496l valueOf(String str) {
        return (EnumC2496l) Enum.valueOf(EnumC2496l.class, str);
    }

    public static EnumC2496l[] values() {
        return (EnumC2496l[]) f13814h.clone();
    }
}
