package p050g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.i */
/* loaded from: classes.dex */
public final class EnumC1591i {

    /* renamed from: e */
    public static final EnumC1591i f10263e;

    /* renamed from: f */
    public static final EnumC1591i f10264f;

    /* renamed from: g */
    public static final EnumC1591i f10265g;

    /* renamed from: h */
    public static final EnumC1591i f10266h;

    /* renamed from: i */
    public static final EnumC1591i f10267i;

    /* renamed from: j */
    public static final EnumC1591i f10268j;

    /* renamed from: k */
    public static final EnumC1591i f10269k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC1591i[] f10270l;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, g2.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, g2.i] */
    static {
        ?? r02 = new Enum("Paragraph", 0);
        f10263e = r02;
        ?? r12 = new Enum("Span", 1);
        f10264f = r12;
        ?? r22 = new Enum("VerbatimTts", 2);
        f10265g = r22;
        ?? r32 = new Enum("Url", 3);
        f10266h = r32;
        ?? r42 = new Enum("Link", 4);
        f10267i = r42;
        ?? r52 = new Enum("Clickable", 5);
        f10268j = r52;
        ?? r62 = new Enum("String", 6);
        f10269k = r62;
        f10270l = new EnumC1591i[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static EnumC1591i valueOf(String str) {
        return (EnumC1591i) Enum.valueOf(EnumC1591i.class, str);
    }

    public static EnumC1591i[] values() {
        return (EnumC1591i[]) f10270l.clone();
    }
}
