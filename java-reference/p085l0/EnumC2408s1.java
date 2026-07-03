package p085l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.s1 */
/* loaded from: classes.dex */
public final class EnumC2408s1 {

    /* renamed from: e */
    public static final EnumC2408s1 f13550e;

    /* renamed from: f */
    public static final EnumC2408s1 f13551f;

    /* renamed from: g */
    public static final EnumC2408s1 f13552g;

    /* renamed from: h */
    public static final EnumC2408s1 f13553h;

    /* renamed from: i */
    public static final EnumC2408s1 f13554i;

    /* renamed from: j */
    public static final EnumC2408s1 f13555j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC2408s1[] f13556k;

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l0.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l0.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l0.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l0.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [l0.s1, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ShutDown", 0);
        f13550e = r02;
        ?? r12 = new Enum("ShuttingDown", 1);
        f13551f = r12;
        ?? r22 = new Enum("Inactive", 2);
        f13552g = r22;
        ?? r32 = new Enum("InactivePendingWork", 3);
        f13553h = r32;
        ?? r42 = new Enum("Idle", 4);
        f13554i = r42;
        ?? r52 = new Enum("PendingWork", 5);
        f13555j = r52;
        f13556k = new EnumC2408s1[]{r02, r12, r22, r32, r42, r52};
    }

    public static EnumC2408s1 valueOf(String str) {
        return (EnumC2408s1) Enum.valueOf(EnumC2408s1.class, str);
    }

    public static EnumC2408s1[] values() {
        return (EnumC2408s1[]) f13556k.clone();
    }
}
