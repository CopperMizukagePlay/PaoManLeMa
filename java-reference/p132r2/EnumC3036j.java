package p132r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.j */
/* loaded from: classes.dex */
public final class EnumC3036j {

    /* renamed from: e */
    public static final EnumC3036j f15600e;

    /* renamed from: f */
    public static final EnumC3036j f15601f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3036j[] f15602g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r2.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r2.j] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f15600e = r02;
        ?? r12 = new Enum("Rtl", 1);
        f15601f = r12;
        f15602g = new EnumC3036j[]{r02, r12};
    }

    public static EnumC3036j valueOf(String str) {
        return (EnumC3036j) Enum.valueOf(EnumC3036j.class, str);
    }

    public static EnumC3036j[] values() {
        return (EnumC3036j[]) f15602g.clone();
    }
}
