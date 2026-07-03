package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tm */
/* loaded from: classes.dex */
public final class EnumC1311tm {

    /* renamed from: e */
    public static final EnumC1311tm f7830e;

    /* renamed from: f */
    public static final EnumC1311tm f7831f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1311tm[] f7832g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.tm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.tm] */
    static {
        ?? r02 = new Enum("Download", 0);
        f7830e = r02;
        ?? r12 = new Enum("Upload", 1);
        f7831f = r12;
        f7832g = new EnumC1311tm[]{r02, r12};
    }

    public static EnumC1311tm valueOf(String str) {
        return (EnumC1311tm) Enum.valueOf(EnumC1311tm.class, str);
    }

    public static EnumC1311tm[] values() {
        return (EnumC1311tm[]) f7832g.clone();
    }
}
