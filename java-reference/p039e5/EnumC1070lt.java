package p039e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lt */
/* loaded from: classes.dex */
public final class EnumC1070lt {

    /* renamed from: e */
    public static final EnumC1070lt f5744e;

    /* renamed from: f */
    public static final EnumC1070lt f5745f;

    /* renamed from: g */
    public static final EnumC1070lt f5746g;

    /* renamed from: h */
    public static final EnumC1070lt f5747h;

    /* renamed from: i */
    public static final EnumC1070lt f5748i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC1070lt[] f5749j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e5.lt] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e5.lt] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e5.lt] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, e5.lt] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, e5.lt] */
    static {
        ?? r02 = new Enum("WIFI", 0);
        f5744e = r02;
        ?? r12 = new Enum("CELLULAR", 1);
        f5745f = r12;
        ?? r22 = new Enum("ETHERNET", 2);
        f5746g = r22;
        ?? r32 = new Enum("USB", 3);
        f5747h = r32;
        ?? r42 = new Enum("OTHER", 4);
        f5748i = r42;
        f5749j = new EnumC1070lt[]{r02, r12, r22, r32, r42};
    }

    public static EnumC1070lt valueOf(String str) {
        return (EnumC1070lt) Enum.valueOf(EnumC1070lt.class, str);
    }

    public static EnumC1070lt[] values() {
        return (EnumC1070lt[]) f5749j.clone();
    }
}
