package p039e5;

import p000a.AbstractC0000a;
import p060h5.AbstractC1793a0;
import p079k1.C2266e;
import p102n1.AbstractC2710c;
import p105n5.C2719b;
import p174w5.AbstractC3784a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n2 */
/* loaded from: classes.dex */
public final class EnumC1105n2 {

    /* renamed from: g */
    public static final EnumC1105n2 f6151g;

    /* renamed from: h */
    public static final EnumC1105n2 f6152h;

    /* renamed from: i */
    public static final EnumC1105n2 f6153i;

    /* renamed from: j */
    public static final EnumC1105n2 f6154j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1105n2[] f6155k;

    /* renamed from: l */
    public static final /* synthetic */ C2719b f6156l;

    /* renamed from: e */
    public final String f6157e;

    /* renamed from: f */
    public final C2266e f6158f;

    static {
        EnumC1105n2 enumC1105n2 = new EnumC1105n2("Ping", 0, "Ping", AbstractC1793a0.m2996x());
        f6151g = enumC1105n2;
        EnumC1105n2 enumC1105n22 = new EnumC1105n2("TraceRoute", 1, "路由跟踪", AbstractC3784a.m5810p());
        f6152h = enumC1105n22;
        EnumC1105n2 enumC1105n23 = new EnumC1105n2("Iperf3", 2, "打流", AbstractC2710c.m4352z());
        f6153i = enumC1105n23;
        EnumC1105n2 enumC1105n24 = new EnumC1105n2("Dns", 3, "DNS", AbstractC3784a.m5806l());
        EnumC1105n2 enumC1105n25 = new EnumC1105n2("Nat", 4, "NAT", AbstractC3784a.m5804i());
        f6154j = enumC1105n25;
        EnumC1105n2[] enumC1105n2Arr = {enumC1105n2, enumC1105n22, enumC1105n23, enumC1105n24, enumC1105n25, new EnumC1105n2("SessionLimit", 5, "会话数", AbstractC0000a.m16q())};
        f6155k = enumC1105n2Arr;
        f6156l = new C2719b(enumC1105n2Arr);
    }

    public EnumC1105n2(String str, int i7, String str2, C2266e c2266e) {
        this.f6157e = str2;
        this.f6158f = c2266e;
    }

    public static EnumC1105n2 valueOf(String str) {
        return (EnumC1105n2) Enum.valueOf(EnumC1105n2.class, str);
    }

    public static EnumC1105n2[] values() {
        return (EnumC1105n2[]) f6155k.clone();
    }
}
