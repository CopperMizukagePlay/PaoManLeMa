package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bm */
/* loaded from: classes.dex */
public final class EnumC0749bm {

    /* renamed from: e */
    public static final EnumC0749bm f2843e;

    /* renamed from: f */
    public static final EnumC0749bm f2844f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0749bm[] f2845g;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.bm, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e5.bm, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TEST", 0);
        f2843e = r02;
        ?? r12 = new Enum("MONITOR", 1);
        f2844f = r12;
        f2845g = new EnumC0749bm[]{r02, r12};
    }

    public static EnumC0749bm valueOf(String str) {
        return (EnumC0749bm) Enum.valueOf(EnumC0749bm.class, str);
    }

    public static EnumC0749bm[] values() {
        return (EnumC0749bm[]) f2845g.clone();
    }
}
