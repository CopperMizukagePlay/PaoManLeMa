package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tb */
/* loaded from: classes.dex */
public final class EnumC1300tb {

    /* renamed from: e */
    public static final EnumC1300tb f7779e;

    /* renamed from: f */
    public static final EnumC1300tb f7780f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1300tb[] f7781g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.tb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.tb] */
    static {
        ?? r02 = new Enum("KeepBoth", 0);
        f7779e = r02;
        ?? r12 = new Enum("Overwrite", 1);
        f7780f = r12;
        f7781g = new EnumC1300tb[]{r02, r12};
    }

    public static EnumC1300tb valueOf(String str) {
        return (EnumC1300tb) Enum.valueOf(EnumC1300tb.class, str);
    }

    public static EnumC1300tb[] values() {
        return (EnumC1300tb[]) f7781g.clone();
    }
}
