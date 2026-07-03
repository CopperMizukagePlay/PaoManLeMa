package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bl */
/* loaded from: classes.dex */
public final class EnumC0748bl {

    /* renamed from: f */
    public static final EnumC0748bl f2838f;

    /* renamed from: g */
    public static final EnumC0748bl f2839g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0748bl[] f2840h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f2841i;

    /* renamed from: e */
    public final String f2842e;

    static {
        EnumC0748bl enumC0748bl = new EnumC0748bl(0, "UDP", "UDP");
        f2838f = enumC0748bl;
        EnumC0748bl enumC0748bl2 = new EnumC0748bl(1, "TCP", "TCP");
        EnumC0748bl enumC0748bl3 = new EnumC0748bl(2, "TLS", "TLS");
        f2839g = enumC0748bl3;
        EnumC0748bl[] enumC0748blArr = {enumC0748bl, enumC0748bl2, enumC0748bl3};
        f2840h = enumC0748blArr;
        f2841i = new C2719b(enumC0748blArr);
    }

    public EnumC0748bl(int i7, String str, String str2) {
        this.f2842e = str2;
    }

    public static EnumC0748bl valueOf(String str) {
        return (EnumC0748bl) Enum.valueOf(EnumC0748bl.class, str);
    }

    public static EnumC0748bl[] values() {
        return (EnumC0748bl[]) f2840h.clone();
    }
}
