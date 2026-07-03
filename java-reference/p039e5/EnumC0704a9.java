package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a9 */
/* loaded from: classes.dex */
public final class EnumC0704a9 {

    /* renamed from: f */
    public static final EnumC0704a9 f2345f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0704a9[] f2346g;

    /* renamed from: h */
    public static final /* synthetic */ C2719b f2347h;

    /* renamed from: e */
    public final String f2348e;

    static {
        EnumC0704a9 enumC0704a9 = new EnumC0704a9(0, "IPV4_ONLY", "仅 IPv4");
        EnumC0704a9 enumC0704a92 = new EnumC0704a9(1, "IPV6_ONLY", "仅 IPv6");
        EnumC0704a9 enumC0704a93 = new EnumC0704a9(2, "DUAL_STACK", "双栈");
        f2345f = enumC0704a93;
        EnumC0704a9[] enumC0704a9Arr = {enumC0704a9, enumC0704a92, enumC0704a93};
        f2346g = enumC0704a9Arr;
        f2347h = new C2719b(enumC0704a9Arr);
    }

    public EnumC0704a9(int i7, String str, String str2) {
        this.f2348e = str2;
    }

    public static EnumC0704a9 valueOf(String str) {
        return (EnumC0704a9) Enum.valueOf(EnumC0704a9.class, str);
    }

    public static EnumC0704a9[] values() {
        return (EnumC0704a9[]) f2346g.clone();
    }
}
