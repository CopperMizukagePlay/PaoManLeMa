package p085l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.p0 */
/* loaded from: classes.dex */
public final class EnumC2396p0 {

    /* renamed from: e */
    public static final EnumC2396p0 f13514e;

    /* renamed from: f */
    public static final EnumC2396p0 f13515f;

    /* renamed from: g */
    public static final EnumC2396p0 f13516g;

    /* renamed from: h */
    public static final EnumC2396p0 f13517h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC2396p0[] f13518i;

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.p0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l0.p0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l0.p0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l0.p0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("IGNORED", 0);
        f13514e = r02;
        ?? r12 = new Enum("SCHEDULED", 1);
        f13515f = r12;
        ?? r22 = new Enum("DEFERRED", 2);
        f13516g = r22;
        ?? r32 = new Enum("IMMINENT", 3);
        f13517h = r32;
        f13518i = new EnumC2396p0[]{r02, r12, r22, r32};
    }

    public static EnumC2396p0 valueOf(String str) {
        return (EnumC2396p0) Enum.valueOf(EnumC2396p0.class, str);
    }

    public static EnumC2396p0[] values() {
        return (EnumC2396p0[]) f13518i.clone();
    }
}
