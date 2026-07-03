package p171w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.z */
/* loaded from: classes.dex */
public final class EnumC3776z {

    /* renamed from: e */
    public static final EnumC3776z f17910e;

    /* renamed from: f */
    public static final EnumC3776z f17911f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3776z[] f17912g;

    /* JADX WARN: Type inference failed for: r0v0, types: [w2.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w2.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [w2.z, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Inherit", 0);
        f17910e = r02;
        ?? r12 = new Enum("SecureOn", 1);
        f17911f = r12;
        f17912g = new EnumC3776z[]{r02, r12, new Enum("SecureOff", 2)};
    }

    public static EnumC3776z valueOf(String str) {
        return (EnumC3776z) Enum.valueOf(EnumC3776z.class, str);
    }

    public static EnumC3776z[] values() {
        return (EnumC3776z[]) f17912g.clone();
    }
}
