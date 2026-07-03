package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nm */
/* loaded from: classes.dex */
public final class EnumC1125nm {

    /* renamed from: f */
    public static final EnumC1125nm f6344f;

    /* renamed from: g */
    public static final EnumC1125nm f6345g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1125nm[] f6346h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f6347i;

    /* renamed from: e */
    public final String f6348e;

    static {
        EnumC1125nm enumC1125nm = new EnumC1125nm(0, "ICMP", "ICMP");
        f6344f = enumC1125nm;
        EnumC1125nm enumC1125nm2 = new EnumC1125nm(1, "TCP", "TCP");
        f6345g = enumC1125nm2;
        EnumC1125nm[] enumC1125nmArr = {enumC1125nm, enumC1125nm2};
        f6346h = enumC1125nmArr;
        f6347i = new C2719b(enumC1125nmArr);
    }

    public EnumC1125nm(int i7, String str, String str2) {
        this.f6348e = str2;
    }

    public static EnumC1125nm valueOf(String str) {
        return (EnumC1125nm) Enum.valueOf(EnumC1125nm.class, str);
    }

    public static EnumC1125nm[] values() {
        return (EnumC1125nm[]) f6346h.clone();
    }
}
