package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.no */
/* loaded from: classes.dex */
public final class EnumC1127no {

    /* renamed from: g */
    public static final EnumC1127no f6360g;

    /* renamed from: h */
    public static final EnumC1127no f6361h;

    /* renamed from: i */
    public static final EnumC1127no f6362i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC1127no[] f6363j;

    /* renamed from: k */
    public static final /* synthetic */ C2719b f6364k;

    /* renamed from: e */
    public final String f6365e;

    /* renamed from: f */
    public final String f6366f;

    static {
        EnumC1127no enumC1127no = new EnumC1127no(0, "DUAL_STACK", "双栈", null);
        f6360g = enumC1127no;
        EnumC1127no enumC1127no2 = new EnumC1127no(1, "IPV4_ONLY", "仅 IPv4", "IPv4");
        f6361h = enumC1127no2;
        EnumC1127no enumC1127no3 = new EnumC1127no(2, "IPV6_ONLY", "仅 IPv6", "IPv6");
        f6362i = enumC1127no3;
        EnumC1127no[] enumC1127noArr = {enumC1127no, enumC1127no2, enumC1127no3};
        f6363j = enumC1127noArr;
        f6364k = new C2719b(enumC1127noArr);
    }

    public EnumC1127no(int i7, String str, String str2, String str3) {
        this.f6365e = str2;
        this.f6366f = str3;
    }

    public static EnumC1127no valueOf(String str) {
        return (EnumC1127no) Enum.valueOf(EnumC1127no.class, str);
    }

    public static EnumC1127no[] values() {
        return (EnumC1127no[]) f6363j.clone();
    }
}
