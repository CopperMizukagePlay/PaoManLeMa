package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w8 */
/* loaded from: classes.dex */
public final class EnumC1390w8 {

    /* renamed from: f */
    public static final EnumC1390w8 f8310f;

    /* renamed from: g */
    public static final EnumC1390w8 f8311g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1390w8[] f8312h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f8313i;

    /* renamed from: e */
    public final String f8314e;

    static {
        EnumC1390w8 enumC1390w8 = new EnumC1390w8(0, "DEFAULT", "默认");
        f8310f = enumC1390w8;
        EnumC1390w8 enumC1390w82 = new EnumC1390w8(1, "PREFERRED", "最低延迟");
        EnumC1390w8 enumC1390w83 = new EnumC1390w8(2, "MULTI_SELECT", "多服务器");
        f8311g = enumC1390w83;
        EnumC1390w8[] enumC1390w8Arr = {enumC1390w8, enumC1390w82, enumC1390w83};
        f8312h = enumC1390w8Arr;
        f8313i = new C2719b(enumC1390w8Arr);
    }

    public EnumC1390w8(int i7, String str, String str2) {
        this.f8314e = str2;
    }

    public static EnumC1390w8 valueOf(String str) {
        return (EnumC1390w8) Enum.valueOf(EnumC1390w8.class, str);
    }

    public static EnumC1390w8[] values() {
        return (EnumC1390w8[]) f8312h.clone();
    }
}
