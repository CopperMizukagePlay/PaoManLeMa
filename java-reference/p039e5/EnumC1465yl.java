package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yl */
/* loaded from: classes.dex */
public final class EnumC1465yl {

    /* renamed from: e */
    public static final EnumC1465yl f9455e;

    /* renamed from: f */
    public static final EnumC1465yl f9456f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1465yl[] f9457g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.yl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.yl] */
    static {
        ?? r02 = new Enum("PUBLIC", 0);
        f9455e = r02;
        ?? r12 = new Enum("DEPLOY", 1);
        f9456f = r12;
        f9457g = new EnumC1465yl[]{r02, r12};
    }

    public static EnumC1465yl valueOf(String str) {
        return (EnumC1465yl) Enum.valueOf(EnumC1465yl.class, str);
    }

    public static EnumC1465yl[] values() {
        return (EnumC1465yl[]) f9457g.clone();
    }
}
