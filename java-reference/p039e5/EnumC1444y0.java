package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.y0 */
/* loaded from: classes.dex */
public final class EnumC1444y0 {

    /* renamed from: e */
    public static final EnumC1444y0 f9249e;

    /* renamed from: f */
    public static final EnumC1444y0 f9250f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1444y0[] f9251g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.y0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.y0] */
    static {
        ?? r02 = new Enum("Download", 0);
        f9249e = r02;
        ?? r12 = new Enum("Upload", 1);
        f9250f = r12;
        f9251g = new EnumC1444y0[]{r02, r12};
    }

    public static EnumC1444y0 valueOf(String str) {
        return (EnumC1444y0) Enum.valueOf(EnumC1444y0.class, str);
    }

    public static EnumC1444y0[] values() {
        return (EnumC1444y0[]) f9251g.clone();
    }
}
