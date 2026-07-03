package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.b9 */
/* loaded from: classes.dex */
public final class EnumC0736b9 {

    /* renamed from: e */
    public static final EnumC0736b9 f2628e;

    /* renamed from: f */
    public static final EnumC0736b9 f2629f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0736b9[] f2630g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.b9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.b9] */
    static {
        ?? r02 = new Enum("OKHTTP", 0);
        f2628e = r02;
        ?? r12 = new Enum("FETCH_STREAM", 1);
        f2629f = r12;
        f2630g = new EnumC0736b9[]{r02, r12};
    }

    public static EnumC0736b9 valueOf(String str) {
        return (EnumC0736b9) Enum.valueOf(EnumC0736b9.class, str);
    }

    public static EnumC0736b9[] values() {
        return (EnumC0736b9[]) f2630g.clone();
    }
}
