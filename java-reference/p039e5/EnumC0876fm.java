package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fm */
/* loaded from: classes.dex */
public final class EnumC0876fm {

    /* renamed from: e */
    public static final EnumC0876fm f4041e;

    /* renamed from: f */
    public static final EnumC0876fm f4042f;

    /* renamed from: g */
    public static final EnumC0876fm f4043g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0876fm[] f4044h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.fm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.fm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.fm] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f4041e = r02;
        ?? r12 = new Enum("MILD", 1);
        f4042f = r12;
        ?? r22 = new Enum("SEVERE", 2);
        f4043g = r22;
        f4044h = new EnumC0876fm[]{r02, r12, r22};
    }

    public static EnumC0876fm valueOf(String str) {
        return (EnumC0876fm) Enum.valueOf(EnumC0876fm.class, str);
    }

    public static EnumC0876fm[] values() {
        return (EnumC0876fm[]) f4044h.clone();
    }
}
