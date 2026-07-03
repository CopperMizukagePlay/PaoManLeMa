package p090l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l5.a */
/* loaded from: classes.dex */
public final class EnumC2465a {

    /* renamed from: e */
    public static final EnumC2465a f13750e;

    /* renamed from: f */
    public static final EnumC2465a f13751f;

    /* renamed from: g */
    public static final EnumC2465a f13752g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC2465a[] f13753h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l5.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l5.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l5.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f13750e = r02;
        ?? r12 = new Enum("UNDECIDED", 1);
        f13751f = r12;
        ?? r22 = new Enum("RESUMED", 2);
        f13752g = r22;
        f13753h = new EnumC2465a[]{r02, r12, r22};
    }

    public static EnumC2465a valueOf(String str) {
        return (EnumC2465a) Enum.valueOf(EnumC2465a.class, str);
    }

    public static EnumC2465a[] values() {
        return (EnumC2465a[]) f13753h.clone();
    }
}
