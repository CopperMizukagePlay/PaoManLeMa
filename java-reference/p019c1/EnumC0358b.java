package p019c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.b */
/* loaded from: classes.dex */
public final class EnumC0358b {

    /* renamed from: e */
    public static final EnumC0358b f1221e;

    /* renamed from: f */
    public static final EnumC0358b f1222f;

    /* renamed from: g */
    public static final EnumC0358b f1223g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0358b[] f1224h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c1.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c1.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, c1.b] */
    static {
        ?? r02 = new Enum("None", 0);
        f1221e = r02;
        ?? r12 = new Enum("Cancelled", 1);
        f1222f = r12;
        ?? r22 = new Enum("Redirected", 2);
        f1223g = r22;
        f1224h = new EnumC0358b[]{r02, r12, r22, new Enum("RedirectCancelled", 3)};
    }

    public static EnumC0358b valueOf(String str) {
        return (EnumC0358b) Enum.valueOf(EnumC0358b.class, str);
    }

    public static EnumC0358b[] values() {
        return (EnumC0358b[]) f1224h.clone();
    }
}
