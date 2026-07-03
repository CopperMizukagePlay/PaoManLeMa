package p019c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.t */
/* loaded from: classes.dex */
public final class EnumC0376t {

    /* renamed from: e */
    public static final EnumC0376t f1266e;

    /* renamed from: f */
    public static final EnumC0376t f1267f;

    /* renamed from: g */
    public static final EnumC0376t f1268g;

    /* renamed from: h */
    public static final EnumC0376t f1269h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC0376t[] f1270i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c1.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c1.t] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c1.t] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, c1.t] */
    static {
        ?? r02 = new Enum("Active", 0);
        f1266e = r02;
        ?? r12 = new Enum("ActiveParent", 1);
        f1267f = r12;
        ?? r22 = new Enum("Captured", 2);
        f1268g = r22;
        ?? r32 = new Enum("Inactive", 3);
        f1269h = r32;
        f1270i = new EnumC0376t[]{r02, r12, r22, r32};
    }

    public static EnumC0376t valueOf(String str) {
        return (EnumC0376t) Enum.valueOf(EnumC0376t.class, str);
    }

    public static EnumC0376t[] values() {
        return (EnumC0376t[]) f1270i.clone();
    }

    /* renamed from: a */
    public final boolean m844a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new RuntimeException();
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
