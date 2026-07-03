package p162v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.e0 */
/* loaded from: classes.dex */
public final class EnumC3496e0 {

    /* renamed from: e */
    public static final EnumC3496e0 f16824e;

    /* renamed from: f */
    public static final EnumC3496e0 f16825f;

    /* renamed from: g */
    public static final EnumC3496e0 f16826g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC3496e0[] f16827h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v1.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v1.e0] */
    static {
        ?? r02 = new Enum("InMeasureBlock", 0);
        f16824e = r02;
        ?? r12 = new Enum("InLayoutBlock", 1);
        f16825f = r12;
        ?? r22 = new Enum("NotUsed", 2);
        f16826g = r22;
        f16827h = new EnumC3496e0[]{r02, r12, r22};
    }

    public static EnumC3496e0 valueOf(String str) {
        return (EnumC3496e0) Enum.valueOf(EnumC3496e0.class, str);
    }

    public static EnumC3496e0[] values() {
        return (EnumC3496e0[]) f16827h.clone();
    }
}
