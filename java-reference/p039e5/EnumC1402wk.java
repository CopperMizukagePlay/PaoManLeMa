package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wk */
/* loaded from: classes.dex */
public final class EnumC1402wk {

    /* renamed from: f */
    public static final EnumC1402wk f8483f;

    /* renamed from: g */
    public static final EnumC1402wk f8484g;

    /* renamed from: h */
    public static final EnumC1402wk f8485h;

    /* renamed from: i */
    public static final /* synthetic */ EnumC1402wk[] f8486i;

    /* renamed from: j */
    public static final /* synthetic */ C2719b f8487j;

    /* renamed from: e */
    public final String f8488e;

    static {
        EnumC1402wk enumC1402wk = new EnumC1402wk(0, "DUAL_STACK", "IPv4/IPv6");
        f8483f = enumC1402wk;
        EnumC1402wk enumC1402wk2 = new EnumC1402wk(1, "IPV4", "仅 IPv4");
        f8484g = enumC1402wk2;
        EnumC1402wk enumC1402wk3 = new EnumC1402wk(2, "IPV6", "仅 IPv6");
        f8485h = enumC1402wk3;
        EnumC1402wk[] enumC1402wkArr = {enumC1402wk, enumC1402wk2, enumC1402wk3};
        f8486i = enumC1402wkArr;
        f8487j = new C2719b(enumC1402wkArr);
    }

    public EnumC1402wk(int i7, String str, String str2) {
        this.f8488e = str2;
    }

    public static EnumC1402wk valueOf(String str) {
        return (EnumC1402wk) Enum.valueOf(EnumC1402wk.class, str);
    }

    public static EnumC1402wk[] values() {
        return (EnumC1402wk[]) f8486i.clone();
    }
}
