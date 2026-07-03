package p117p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.x */
/* loaded from: classes.dex */
public final class EnumC2873x {

    /* renamed from: e */
    public static final EnumC2873x f15035e;

    /* renamed from: f */
    public static final EnumC2873x f15036f;

    /* renamed from: g */
    public static final EnumC2873x f15037g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2873x[] f15038h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p1.x] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p1.x] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p1.x] */
    static {
        ?? r02 = new Enum("Unknown", 0);
        f15035e = r02;
        ?? r12 = new Enum("Dispatching", 1);
        f15036f = r12;
        ?? r22 = new Enum("NotDispatching", 2);
        f15037g = r22;
        f15038h = new EnumC2873x[]{r02, r12, r22};
    }

    public static EnumC2873x valueOf(String str) {
        return (EnumC2873x) Enum.valueOf(EnumC2873x.class, str);
    }

    public static EnumC2873x[] values() {
        return (EnumC2873x[]) f15038h.clone();
    }
}
