package p001a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.w0 */
/* loaded from: classes.dex */
public final class EnumC0088w0 {

    /* renamed from: e */
    public static final EnumC0088w0 f405e;

    /* renamed from: f */
    public static final EnumC0088w0 f406f;

    /* renamed from: g */
    public static final EnumC0088w0 f407g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0088w0[] f408h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a0.w0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a0.w0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a0.w0] */
    static {
        ?? r02 = new Enum("Cursor", 0);
        f405e = r02;
        ?? r12 = new Enum("SelectionStart", 1);
        f406f = r12;
        ?? r22 = new Enum("SelectionEnd", 2);
        f407g = r22;
        f408h = new EnumC0088w0[]{r02, r12, r22};
    }

    public static EnumC0088w0 valueOf(String str) {
        return (EnumC0088w0) Enum.valueOf(EnumC0088w0.class, str);
    }

    public static EnumC0088w0[] values() {
        return (EnumC0088w0[]) f408h.clone();
    }
}
