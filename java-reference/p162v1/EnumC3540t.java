package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.t */
/* loaded from: classes.dex */
public final class EnumC3540t {

    /* renamed from: e */
    public static final EnumC3540t f17016e;

    /* renamed from: f */
    public static final EnumC3540t f17017f;

    /* renamed from: g */
    public static final EnumC3540t f17018g;

    /* renamed from: h */
    public static final EnumC3540t f17019h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC3540t[] f17020i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.t] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v1.t] */
    static {
        ?? r02 = new Enum("LookaheadMeasurement", 0);
        f17016e = r02;
        ?? r12 = new Enum("LookaheadPlacement", 1);
        f17017f = r12;
        ?? r22 = new Enum("Measurement", 2);
        f17018g = r22;
        ?? r32 = new Enum("Placement", 3);
        f17019h = r32;
        f17020i = new EnumC3540t[]{r02, r12, r22, r32};
    }

    public static EnumC3540t valueOf(String str) {
        return (EnumC3540t) Enum.valueOf(EnumC3540t.class, str);
    }

    public static EnumC3540t[] values() {
        return (EnumC3540t[]) f17020i.clone();
    }
}
