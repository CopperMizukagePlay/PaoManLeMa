package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nl */
/* loaded from: classes.dex */
public final class EnumC1124nl {

    /* renamed from: e */
    public static final EnumC1124nl f6339e;

    /* renamed from: f */
    public static final EnumC1124nl f6340f;

    /* renamed from: g */
    public static final EnumC1124nl f6341g;

    /* renamed from: h */
    public static final EnumC1124nl f6342h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC1124nl[] f6343i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.nl] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.nl] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.nl] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, e5.nl] */
    static {
        ?? r02 = new Enum("Ipv4", 0);
        f6339e = r02;
        ?? r12 = new Enum("Ipv6", 1);
        f6340f = r12;
        ?? r22 = new Enum("Hostname", 2);
        f6341g = r22;
        ?? r32 = new Enum("Invalid", 3);
        f6342h = r32;
        f6343i = new EnumC1124nl[]{r02, r12, r22, r32};
    }

    public static EnumC1124nl valueOf(String str) {
        return (EnumC1124nl) Enum.valueOf(EnumC1124nl.class, str);
    }

    public static EnumC1124nl[] values() {
        return (EnumC1124nl[]) f6343i.clone();
    }
}
