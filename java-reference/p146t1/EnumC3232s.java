package p146t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.s */
/* loaded from: classes.dex */
public final class EnumC3232s {

    /* renamed from: e */
    public static final EnumC3232s f16040e;

    /* renamed from: f */
    public static final EnumC3232s f16041f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC3232s[] f16042g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t1.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t1.s] */
    static {
        ?? r02 = new Enum("Width", 0);
        f16040e = r02;
        ?? r12 = new Enum("Height", 1);
        f16041f = r12;
        f16042g = new EnumC3232s[]{r02, r12};
    }

    public static EnumC3232s valueOf(String str) {
        return (EnumC3232s) Enum.valueOf(EnumC3232s.class, str);
    }

    public static EnumC3232s[] values() {
        return (EnumC3232s[]) f16042g.clone();
    }
}
