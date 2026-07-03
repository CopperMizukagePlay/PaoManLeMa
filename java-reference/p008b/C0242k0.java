package p008b;

import android.content.res.Resources;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0581w;
import p039e5.AbstractC1172p7;
import p039e5.C0729b2;
import p039e5.C0800d9;
import p039e5.C0831e9;
import p039e5.C0878fo;
import p039e5.C1094mm;
import p039e5.C1132nt;
import p039e5.C1196q0;
import p039e5.C1485za;
import p039e5.EnumC0748bl;
import p039e5.EnumC0768c9;
import p039e5.EnumC1402wk;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p082k5.InterfaceC2316f;
import p092m.AbstractC2487d;
import p135r5.AbstractC3063j;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.k0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0242k0 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f938e;

    public /* synthetic */ C0242k0(int i7) {
        this.f938e = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        boolean z8;
        C1689h c1689h;
        String str;
        String str2;
        switch (this.f938e) {
            case 0:
                Resources resources = (Resources) obj;
                AbstractC3367j.m5100e(resources, "resources");
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            case 1:
                if (obj == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case 2:
                InterfaceC2316f interfaceC2316f = (InterfaceC2316f) obj;
                if (interfaceC2316f instanceof AbstractC0581w) {
                    return (AbstractC0581w) interfaceC2316f;
                }
                return null;
            case 3:
                C0831e9 c0831e9 = (C0831e9) obj;
                AbstractC3367j.m5100e(c0831e9, "it");
                return C0831e9.m1519a(c0831e9, 0L, 0L, 0L, 0L, null, "失败", 47);
            case 4:
                C0831e9 c0831e92 = (C0831e9) obj;
                AbstractC3367j.m5100e(c0831e92, "it");
                return C0831e9.m1519a(c0831e92, 0L, 0L, 0L, 0L, null, "已完成", 47);
            case AbstractC3122c.f15761f /* 5 */:
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                return AbstractC2487d.m4044h(AbstractC0444k.m955s0(c0800d9.f3340a, 8), ":", c0800d9.f3351l.name());
            case AbstractC3122c.f15759d /* 6 */:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3367j.m5100e(entry, "it");
                return ((EnumC0768c9) entry.getKey()).name() + ":" + entry.getValue();
            case 7:
                C1687f c1687f = (C1687f) obj;
                AbstractC3367j.m5100e(c1687f, "<destruct>");
                String str3 = (String) c1687f.f10471e;
                File file = (File) c1687f.f10472f;
                if (!file.exists()) {
                    C1196q0.m2106w("candidate_missing source=" + str3 + " file=" + file.getName());
                    return null;
                }
                try {
                    String m4737N = AbstractC3063j.m4737N(file, AbstractC0434a.f1477a);
                    List m2087E = C1196q0.m2087E(m4737N, str3);
                    C1196q0.m2106w("candidate_loaded source=" + str3 + " chars=" + m4737N.length() + " " + C1196q0.m2092R(m2087E));
                    c1689h = m2087E;
                } catch (Throwable th) {
                    c1689h = AbstractC1793a0.m2985m(th);
                }
                Throwable m2747a = C1690i.m2747a(c1689h);
                if (m2747a != null) {
                    C1196q0.m2105v("candidate_failed source=" + str3 + " " + C1196q0.m2104q(file), m2747a);
                }
                boolean z9 = c1689h instanceof C1689h;
                Object obj2 = c1689h;
                if (z9) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list == null) {
                    return null;
                }
                return new C1687f(str3, list);
            case 8:
                C0800d9 c0800d92 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d92, "it");
                return C0800d9.m1498a(c0800d92, null, null, EnumC0768c9.f3006f, 0L, 0L, 0L, false, "", 0L, null, null, 4044799);
            case AbstractC3122c.f15758c /* 9 */:
                C0800d9 c0800d93 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d93, "it");
                return C0800d9.m1498a(c0800d93, null, null, EnumC0768c9.f3006f, 0L, 0L, 0L, false, "服务器不再支持分片，已切换为单连接", 0L, null, null, 4003839);
            case AbstractC3122c.f15760e /* 10 */:
                C0800d9 c0800d94 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d94, "it");
                return C0800d9.m1498a(c0800d94, null, null, EnumC0768c9.f3008h, 0L, 0L, 0L, false, null, 0L, null, null, 4175871);
            case 11:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (((C0800d9) obj3).f3351l == EnumC0768c9.f3010j) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 12:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : (List) obj) {
                    if (((C0800d9) obj4).f3351l != EnumC0768c9.f3010j) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 13:
                C0800d9 c0800d95 = (C0800d9) obj;
                if (c0800d95.f3351l != EnumC0768c9.f3010j) {
                    return C0800d9.m1498a(c0800d95, null, null, EnumC0768c9.f3009i, 0L, 0L, 0L, false, null, 0L, null, null, 4175871);
                }
                return c0800d95;
            case 14:
                return C0831e9.m1519a((C0831e9) obj, 0L, 0L, 0L, 0L, null, "已暂停", 47);
            case AbstractC3122c.f15762g /* 15 */:
                List<C0800d9> list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list2));
                for (C0800d9 c0800d96 : list2) {
                    if (c0800d96.f3351l != EnumC0768c9.f3010j) {
                        c0800d96 = C0800d9.m1498a(c0800d96, null, null, EnumC0768c9.f3009i, 0L, 0L, 0L, false, null, 0L, null, null, 4175871);
                    }
                    arrayList3.add(c0800d96);
                }
                return arrayList3;
            case 16:
                return C0831e9.m1519a((C0831e9) obj, 0L, 0L, 0L, 0L, null, "已暂停", 47);
            case 17:
                return C0800d9.m1498a((C0800d9) obj, null, null, EnumC0768c9.f3005e, 0L, 0L, 0L, false, "", 0L, null, null, 4061183);
            case 18:
                return C0831e9.m1519a((C0831e9) obj, 0L, 0L, 0L, 0L, null, "已完成", 47);
            case 19:
                return C0800d9.m1498a((C0800d9) obj, null, null, EnumC0768c9.f3005e, 0L, 0L, 0L, false, null, 0L, null, null, 4175871);
            case 20:
                List<C0800d9> list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(list3));
                for (C0800d9 c0800d97 : list3) {
                    EnumC0768c9 enumC0768c9 = c0800d97.f3351l;
                    if (enumC0768c9 == EnumC0768c9.f3009i || enumC0768c9 == EnumC0768c9.f3011k) {
                        c0800d97 = C0800d9.m1498a(c0800d97, null, null, EnumC0768c9.f3005e, 0L, 0L, 0L, false, "", 0L, null, null, 4061183);
                    }
                    arrayList4.add(c0800d97);
                }
                return arrayList4;
            case 21:
                C0878fo c0878fo = (C0878fo) obj;
                AbstractC3367j.m5100e(c0878fo, "it");
                return AbstractC2487d.m4044h(c0878fo.f4047a, "@", c0878fo.f4048b);
            case 22:
                C0729b2 c0729b2 = (C0729b2) obj;
                AbstractC3367j.m5100e(c0729b2, "job");
                String str4 = c0729b2.f2565a;
                C1485za c1485za = c0729b2.f2566b;
                if (c1485za == null || (str = c1485za.m2437a()) == null) {
                    String str5 = c0729b2.f2567c;
                    if (AbstractC0444k.m937a0(str5)) {
                        str5 = "plain";
                    }
                    str = str5;
                }
                return AbstractC2487d.m4044h(str4, ":", str);
            case 23:
                EnumC0748bl enumC0748bl = (EnumC0748bl) obj;
                AbstractC3367j.m5100e(enumC0748bl, "it");
                return enumC0748bl.name();
            case 24:
                C1094mm c1094mm = (C1094mm) obj;
                AbstractC3367j.m5100e(c1094mm, "it");
                return Integer.valueOf(c1094mm.f5961a);
            case 25:
                C1687f c1687f2 = (C1687f) obj;
                AbstractC3367j.m5100e(c1687f2, "<destruct>");
                EnumC1402wk enumC1402wk = (EnumC1402wk) c1687f2.f10471e;
                String str6 = (String) c1687f2.f10472f;
                int ordinal = enumC1402wk.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            str2 = "IPv6";
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str2 = "IPv4";
                    }
                } else {
                    str2 = "IPv4/IPv6";
                }
                return AbstractC2487d.m4044h(str2, " ", str6);
            case 26:
                return AbstractC0451r.m969K(AbstractC1172p7.m2048Y(((Double) obj).doubleValue()), " ms", "");
            case 27:
                C1132nt c1132nt = (C1132nt) obj;
                AbstractC3367j.m5100e(c1132nt, "it");
                return Integer.valueOf(c1132nt.f6404a);
            case 28:
                AbstractC3367j.m5100e((String) obj, "it");
                return C1694m.f10482a;
            default:
                AbstractC3367j.m5100e((String) obj, "it");
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0242k0(C1196q0 c1196q0) {
        this.f938e = 7;
    }
}
