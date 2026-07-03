package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.um */
/* loaded from: classes.dex */
public final class EnumC1342um {

    /* renamed from: e */
    public static final EnumC1342um f7976e;

    /* renamed from: f */
    public static final EnumC1342um f7977f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC1342um[] f7978g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.um] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.um] */
    static {
        ?? r02 = new Enum("IPV4", 0);
        f7976e = r02;
        ?? r12 = new Enum("IPV6", 1);
        f7977f = r12;
        f7978g = new EnumC1342um[]{r02, r12};
    }

    public static EnumC1342um valueOf(String str) {
        return (EnumC1342um) Enum.valueOf(EnumC1342um.class, str);
    }

    public static EnumC1342um[] values() {
        return (EnumC1342um[]) f7978g.clone();
    }
}
