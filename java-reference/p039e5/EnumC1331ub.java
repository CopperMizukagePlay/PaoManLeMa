package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ub */
/* loaded from: classes.dex */
public final class EnumC1331ub {

    /* renamed from: e */
    public static final EnumC1331ub f7916e;

    /* renamed from: f */
    public static final EnumC1331ub f7917f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1331ub[] f7918g;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.ub, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e5.ub, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Append", 0);
        f7916e = r02;
        ?? r12 = new Enum("Replace", 1);
        f7917f = r12;
        f7918g = new EnumC1331ub[]{r02, r12};
    }

    public static EnumC1331ub valueOf(String str) {
        return (EnumC1331ub) Enum.valueOf(EnumC1331ub.class, str);
    }

    public static EnumC1331ub[] values() {
        return (EnumC1331ub[]) f7918g.clone();
    }
}
