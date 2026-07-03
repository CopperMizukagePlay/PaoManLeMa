package p083k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.b */
/* loaded from: classes.dex */
public final class EnumC2322b {

    /* renamed from: e */
    public static final EnumC2322b f13285e;

    /* renamed from: f */
    public static final EnumC2322b f13286f;

    /* renamed from: g */
    public static final EnumC2322b f13287g;

    /* renamed from: h */
    public static final EnumC2322b f13288h;

    /* renamed from: i */
    public static final EnumC2322b f13289i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC2322b[] f13290j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k6.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k6.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k6.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, k6.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, k6.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13285e = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13286f = r12;
        ?? r22 = new Enum("PARKING", 2);
        f13287g = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f13288h = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f13289i = r42;
        f13290j = new EnumC2322b[]{r02, r12, r22, r32, r42};
    }

    public static EnumC2322b valueOf(String str) {
        return (EnumC2322b) Enum.valueOf(EnumC2322b.class, str);
    }

    public static EnumC2322b[] values() {
        return (EnumC2322b[]) f13290j.clone();
    }
}
