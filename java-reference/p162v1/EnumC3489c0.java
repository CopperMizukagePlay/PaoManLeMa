package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.c0 */
/* loaded from: classes.dex */
public final class EnumC3489c0 {

    /* renamed from: e */
    public static final EnumC3489c0 f16791e;

    /* renamed from: f */
    public static final EnumC3489c0 f16792f;

    /* renamed from: g */
    public static final EnumC3489c0 f16793g;

    /* renamed from: h */
    public static final EnumC3489c0 f16794h;

    /* renamed from: i */
    public static final EnumC3489c0 f16795i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC3489c0[] f16796j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.c0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.c0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.c0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v1.c0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, v1.c0] */
    static {
        ?? r02 = new Enum("Measuring", 0);
        f16791e = r02;
        ?? r12 = new Enum("LookaheadMeasuring", 1);
        f16792f = r12;
        ?? r22 = new Enum("LayingOut", 2);
        f16793g = r22;
        ?? r32 = new Enum("LookaheadLayingOut", 3);
        f16794h = r32;
        ?? r42 = new Enum("Idle", 4);
        f16795i = r42;
        f16796j = new EnumC3489c0[]{r02, r12, r22, r32, r42};
    }

    public static EnumC3489c0 valueOf(String str) {
        return (EnumC3489c0) Enum.valueOf(EnumC3489c0.class, str);
    }

    public static EnumC3489c0[] values() {
        return (EnumC3489c0[]) f16796j.clone();
    }
}
