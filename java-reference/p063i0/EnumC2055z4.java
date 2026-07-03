package p063i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.z4 */
/* loaded from: classes.dex */
public final class EnumC2055z4 {

    /* renamed from: e */
    public static final EnumC2055z4 f12207e;

    /* renamed from: f */
    public static final EnumC2055z4 f12208f;

    /* renamed from: g */
    public static final EnumC2055z4 f12209g;

    /* renamed from: h */
    public static final EnumC2055z4 f12210h;

    /* renamed from: i */
    public static final EnumC2055z4 f12211i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC2055z4[] f12212j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.z4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.z4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i0.z4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, i0.z4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, i0.z4] */
    static {
        ?? r02 = new Enum("TopBar", 0);
        f12207e = r02;
        ?? r12 = new Enum("MainContent", 1);
        f12208f = r12;
        ?? r22 = new Enum("Snackbar", 2);
        f12209g = r22;
        ?? r32 = new Enum("Fab", 3);
        f12210h = r32;
        ?? r42 = new Enum("BottomBar", 4);
        f12211i = r42;
        f12212j = new EnumC2055z4[]{r02, r12, r22, r32, r42};
    }

    public static EnumC2055z4 valueOf(String str) {
        return (EnumC2055z4) Enum.valueOf(EnumC2055z4.class, str);
    }

    public static EnumC2055z4[] values() {
        return (EnumC2055z4[]) f12212j.clone();
    }
}
