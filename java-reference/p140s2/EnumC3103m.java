package p140s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.m */
/* loaded from: classes.dex */
public final class EnumC3103m {

    /* renamed from: e */
    public static final EnumC3103m f15703e;

    /* renamed from: f */
    public static final EnumC3103m f15704f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3103m[] f15705g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, s2.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, s2.m] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f15703e = r02;
        ?? r12 = new Enum("Rtl", 1);
        f15704f = r12;
        f15705g = new EnumC3103m[]{r02, r12};
    }

    public static EnumC3103m valueOf(String str) {
        return (EnumC3103m) Enum.valueOf(EnumC3103m.class, str);
    }

    public static EnumC3103m[] values() {
        return (EnumC3103m[]) f15705g.clone();
    }
}
