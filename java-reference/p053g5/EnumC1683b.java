package p053g5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.b */
/* loaded from: classes.dex */
public final class EnumC1683b {

    /* renamed from: e */
    public static final EnumC1683b f10468e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC1683b[] f10469f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g5.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g5.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g5.b] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f10468e = r02;
        f10469f = new EnumC1683b[]{r02, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
    }

    public static EnumC1683b valueOf(String str) {
        return (EnumC1683b) Enum.valueOf(EnumC1683b.class, str);
    }

    public static EnumC1683b[] values() {
        return (EnumC1683b[]) f10469f.clone();
    }
}
