package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xn */
/* loaded from: classes.dex */
public final class EnumC1436xn {

    /* renamed from: f */
    public static final EnumC1436xn f8846f;

    /* renamed from: g */
    public static final EnumC1436xn f8847g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC1436xn[] f8848h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f8849i;

    /* renamed from: e */
    public final String f8850e;

    static {
        EnumC1436xn enumC1436xn = new EnumC1436xn(0, "MBPS", "Mbps");
        f8846f = enumC1436xn;
        EnumC1436xn enumC1436xn2 = new EnumC1436xn(1, "MB_PER_SEC", "MB/s");
        f8847g = enumC1436xn2;
        EnumC1436xn[] enumC1436xnArr = {enumC1436xn, enumC1436xn2};
        f8848h = enumC1436xnArr;
        f8849i = new C2719b(enumC1436xnArr);
    }

    public EnumC1436xn(int i7, String str, String str2) {
        this.f8850e = str2;
    }

    public static EnumC1436xn valueOf(String str) {
        return (EnumC1436xn) Enum.valueOf(EnumC1436xn.class, str);
    }

    public static EnumC1436xn[] values() {
        return (EnumC1436xn[]) f8848h.clone();
    }
}
