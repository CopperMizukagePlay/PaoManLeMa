package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cb */
/* loaded from: classes.dex */
public final class EnumC0770cb {

    /* renamed from: e */
    public static final EnumC0770cb f3018e;

    /* renamed from: f */
    public static final EnumC0770cb f3019f;

    /* renamed from: g */
    public static final EnumC0770cb f3020g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0770cb[] f3021h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.cb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.cb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.cb] */
    static {
        ?? r02 = new Enum("Selected", 0);
        f3018e = r02;
        ?? r12 = new Enum("All", 1);
        f3019f = r12;
        ?? r22 = new Enum("Partial", 2);
        f3020g = r22;
        f3021h = new EnumC0770cb[]{r02, r12, r22};
    }

    public static EnumC0770cb valueOf(String str) {
        return (EnumC0770cb) Enum.valueOf(EnumC0770cb.class, str);
    }

    public static EnumC0770cb[] values() {
        return (EnumC0770cb[]) f3021h.clone();
    }
}
