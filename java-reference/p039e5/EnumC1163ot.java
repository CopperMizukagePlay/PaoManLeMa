package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ot */
/* loaded from: classes.dex */
public final class EnumC1163ot {

    /* renamed from: g */
    public static final EnumC1163ot f6736g;

    /* renamed from: h */
    public static final EnumC1163ot f6737h;

    /* renamed from: i */
    public static final EnumC1163ot f6738i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC1163ot[] f6739j;

    /* renamed from: k */
    public static final /* synthetic */ C2719b f6740k;

    /* renamed from: e */
    public final String f6741e;

    /* renamed from: f */
    public final String f6742f;

    static {
        EnumC1163ot enumC1163ot = new EnumC1163ot(0, "ICMP", "icmp", "ICMP");
        f6736g = enumC1163ot;
        EnumC1163ot enumC1163ot2 = new EnumC1163ot(1, "TCP", "tcp", "TCP");
        f6737h = enumC1163ot2;
        EnumC1163ot enumC1163ot3 = new EnumC1163ot(2, "UDP", "udp", "UDP");
        f6738i = enumC1163ot3;
        EnumC1163ot[] enumC1163otArr = {enumC1163ot, enumC1163ot2, enumC1163ot3};
        f6739j = enumC1163otArr;
        f6740k = new C2719b(enumC1163otArr);
    }

    public EnumC1163ot(int i7, String str, String str2, String str3) {
        this.f6741e = str2;
        this.f6742f = str3;
    }

    public static EnumC1163ot valueOf(String str) {
        return (EnumC1163ot) Enum.valueOf(EnumC1163ot.class, str);
    }

    public static EnumC1163ot[] values() {
        return (EnumC1163ot[]) f6739j.clone();
    }
}
