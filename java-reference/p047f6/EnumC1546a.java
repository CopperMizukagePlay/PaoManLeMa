package p047f6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.a */
/* loaded from: classes.dex */
public final class EnumC1546a {

    /* renamed from: e */
    public static final EnumC1546a f10128e;

    /* renamed from: f */
    public static final EnumC1546a f10129f;

    /* renamed from: g */
    public static final EnumC1546a f10130g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1546a[] f10131h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f6.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f6.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f6.a] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f10128e = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f10129f = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f10130g = r22;
        f10131h = new EnumC1546a[]{r02, r12, r22};
    }

    public static EnumC1546a valueOf(String str) {
        return (EnumC1546a) Enum.valueOf(EnumC1546a.class, str);
    }

    public static EnumC1546a[] values() {
        return (EnumC1546a[]) f10131h.clone();
    }
}
