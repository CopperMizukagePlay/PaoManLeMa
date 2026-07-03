package p043f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f2.a */
/* loaded from: classes.dex */
public final class EnumC1533a {

    /* renamed from: e */
    public static final EnumC1533a f10090e;

    /* renamed from: f */
    public static final EnumC1533a f10091f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1533a[] f10092g;

    /* JADX WARN: Type inference failed for: r0v0, types: [f2.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f2.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [f2.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("On", 0);
        f10090e = r02;
        ?? r12 = new Enum("Off", 1);
        f10091f = r12;
        f10092g = new EnumC1533a[]{r02, r12, new Enum("Indeterminate", 2)};
    }

    public static EnumC1533a valueOf(String str) {
        return (EnumC1533a) Enum.valueOf(EnumC1533a.class, str);
    }

    public static EnumC1533a[] values() {
        return (EnumC1533a[]) f10092g.clone();
    }
}
