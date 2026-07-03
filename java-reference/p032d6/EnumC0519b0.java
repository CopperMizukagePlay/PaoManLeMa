package p032d6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.b0 */
/* loaded from: classes.dex */
public final class EnumC0519b0 {

    /* renamed from: e */
    public static final EnumC0519b0 f1844e;

    /* renamed from: f */
    public static final EnumC0519b0 f1845f;

    /* renamed from: g */
    public static final EnumC0519b0 f1846g;

    /* renamed from: h */
    public static final EnumC0519b0 f1847h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC0519b0[] f1848i;

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.b0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d6.b0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d6.b0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [d6.b0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f1844e = r02;
        ?? r12 = new Enum("LAZY", 1);
        f1845f = r12;
        ?? r22 = new Enum("ATOMIC", 2);
        f1846g = r22;
        ?? r32 = new Enum("UNDISPATCHED", 3);
        f1847h = r32;
        f1848i = new EnumC0519b0[]{r02, r12, r22, r32};
    }

    public static EnumC0519b0 valueOf(String str) {
        return (EnumC0519b0) Enum.valueOf(EnumC0519b0.class, str);
    }

    public static EnumC0519b0[] values() {
        return (EnumC0519b0[]) f1848i.clone();
    }
}
