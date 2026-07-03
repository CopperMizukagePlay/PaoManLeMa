package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zk */
/* loaded from: classes.dex */
public final class EnumC1495zk {

    /* renamed from: f */
    public static final EnumC1495zk f9910f;

    /* renamed from: g */
    public static final EnumC1495zk f9911g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1495zk[] f9912h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f9913i;

    /* renamed from: e */
    public final String f9914e;

    static {
        EnumC1495zk enumC1495zk = new EnumC1495zk(0, "RFC3489", "RFC 3489");
        f9910f = enumC1495zk;
        EnumC1495zk enumC1495zk2 = new EnumC1495zk(1, "RFC5780", "RFC5780/8489");
        f9911g = enumC1495zk2;
        EnumC1495zk[] enumC1495zkArr = {enumC1495zk, enumC1495zk2};
        f9912h = enumC1495zkArr;
        f9913i = new C2719b(enumC1495zkArr);
    }

    public EnumC1495zk(int i7, String str, String str2) {
        this.f9914e = str2;
    }

    public static EnumC1495zk valueOf(String str) {
        return (EnumC1495zk) Enum.valueOf(EnumC1495zk.class, str);
    }

    public static EnumC1495zk[] values() {
        return (EnumC1495zk[]) f9912h.clone();
    }
}
