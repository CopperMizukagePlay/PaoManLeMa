package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bu */
/* loaded from: classes.dex */
public final class EnumC0757bu {

    /* renamed from: e */
    public static final EnumC0757bu f2914e;

    /* renamed from: f */
    public static final EnumC0757bu f2915f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0757bu[] f2916g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.bu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.bu] */
    static {
        ?? r02 = new Enum("UID", 0);
        f2914e = r02;
        ?? r12 = new Enum("ROOT_NETDEV", 1);
        f2915f = r12;
        f2916g = new EnumC0757bu[]{r02, r12};
    }

    public static EnumC0757bu valueOf(String str) {
        return (EnumC0757bu) Enum.valueOf(EnumC0757bu.class, str);
    }

    public static EnumC0757bu[] values() {
        return (EnumC0757bu[]) f2916g.clone();
    }
}
