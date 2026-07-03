package p063i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o1 */
/* loaded from: classes.dex */
public final class EnumC1964o1 {

    /* renamed from: e */
    public static final EnumC1964o1 f11599e;

    /* renamed from: f */
    public static final EnumC1964o1 f11600f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1964o1[] f11601g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.o1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.o1] */
    static {
        ?? r02 = new Enum("Closed", 0);
        f11599e = r02;
        ?? r12 = new Enum("Open", 1);
        f11600f = r12;
        f11601g = new EnumC1964o1[]{r02, r12};
    }

    public static EnumC1964o1 valueOf(String str) {
        return (EnumC1964o1) Enum.valueOf(EnumC1964o1.class, str);
    }

    public static EnumC1964o1[] values() {
        return (EnumC1964o1[]) f11601g.clone();
    }
}
