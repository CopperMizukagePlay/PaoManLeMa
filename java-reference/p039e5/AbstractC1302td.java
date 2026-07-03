package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p015b6.C0296c;
import p017c.C0328m;
import p018c0.C0341k;
import p024c6.AbstractC0444k;
import p035e1.C0671o0;
import p035e1.C0677s;
import p048g.C1566b;
import p050g2.C1604o0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1949m2;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.AbstractC2050z;
import p063i0.AbstractC2052z1;
import p063i0.C1904g7;
import p063i0.C1906h0;
import p063i0.C2003t0;
import p065i2.AbstractC2064e;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p079k1.C2272i;
import p079k1.C2274k;
import p079k1.C2276m;
import p079k1.C2281r;
import p079k1.C2284u;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p102n1.AbstractC2710c;
import p105n5.C2719b;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3137j0;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.C3320h;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p171w2.C3767q;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.td */
/* loaded from: classes.dex */
public abstract class AbstractC1302td {

    /* renamed from: a */
    public static final C3137j0 f7786a;

    /* renamed from: b */
    public static final C3860d f7787b = AbstractC3861e.m5873a(10);

    /* renamed from: c */
    public static final List f7788c = AbstractC1806n.m3067O("1", "4", "8", "16", "32", "64");

    /* renamed from: d */
    public static final List f7789d = AbstractC1806n.m3067O("10", "30", "60", "120", "300", "600", "3600");

    /* renamed from: e */
    public static final List f7790e = AbstractC1806n.m3067O("1", "2", "5", "10", "30", "60");

    static {
        float f7 = 2;
        f7786a = new C3137j0(f7, f7, f7, f7);
    }

    /* renamed from: a */
    public static final void m2334a(final C3154s c3154s, final String str, final InterfaceC3279c interfaceC3279c, final String str2, final InterfaceC3279c interfaceC3279c2, final boolean z7, final InterfaceC3277a interfaceC3277a, C2395p c2395p, final int i7) {
        int i8;
        InterfaceC3279c interfaceC3279c3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c2395p.m3859a0(431745750);
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 384) == 0) {
            interfaceC3279c3 = interfaceC3279c;
            if (c2395p.m3874i(interfaceC3279c3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i8 |= i13;
        } else {
            interfaceC3279c3 = interfaceC3279c;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(str2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i8 |= i12;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(interfaceC3279c2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i8 |= i11;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3872h(z7)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i8 |= i10;
        }
        if ((i7 & 1572864) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i8 |= i9;
        }
        int i15 = i8;
        if ((i15 & 599185) == 599184 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(6), C3795c.f17973n, c2395p, 54);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3149p0 c3149p0 = C3149p0.f15825a;
            InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.6f, true);
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            int i16 = i15 >> 3;
            int i17 = (i15 >> 6) & 7168;
            AbstractC1847a4.m3102a(str, interfaceC3279c3, m4856a, z7, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC1042l1.f5359c, AbstractC1042l1.f5360d, AbstractC1042l1.f5361e, null, null, null, null, null, true, 0, 0, null, null, c2395p, (i16 & 14) | 114819072 | (i16 & 112) | i17, 12582912, 8257040);
            int i18 = i15 >> 9;
            AbstractC1847a4.m3102a(str2, interfaceC3279c2, c3149p0.m4856a(c3807o, 0.9f, true), z7, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC1042l1.f5362f, null, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, (i18 & 14) | 1572864 | (i18 & 112) | i17, 12582912, 8257424);
            c2395p.m3888r(true);
            AbstractC1991r4.m3166g(interfaceC3277a, AbstractC0155c.m347f(AbstractC0155c.m346e(c3807o, 1.0f), 40), z7, f7787b, null, null, null, AbstractC1042l1.f5363g, c2395p, ((i15 >> 18) & 14) | 805309488 | (i18 & 896), 496);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e() { // from class: e5.hd
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC1302td.m2334a(C3154s.this, str, interfaceC3279c, str2, interfaceC3279c2, z7, interfaceC3277a, (C2395p) obj, AbstractC2418w.m3957F(i7 | 1));
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: b */
    public static final void m2335b(final C3154s c3154s, final EnumC1332uc enumC1332uc, final InterfaceC3279c interfaceC3279c, final EnumC0803dc enumC0803dc, final InterfaceC3279c interfaceC3279c2, final String str, final InterfaceC3279c interfaceC3279c3, final String str2, final InterfaceC3279c interfaceC3279c4, final String str3, final InterfaceC3279c interfaceC3279c5, final EnumC0771cc enumC0771cc, final InterfaceC3279c interfaceC3279c6, final boolean z7, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        String str4;
        String str5;
        EnumC0803dc enumC0803dc2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        c2395p.m3859a0(1442687068);
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(enumC1332uc)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i8 = i19 | i7;
        } else {
            i8 = i7;
        }
        int i20 = 128;
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i8 |= i18;
        }
        int i21 = 1024;
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(enumC0803dc)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i8 |= i17;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(interfaceC3279c2)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i8 |= i16;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3870g(str)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i8 |= i15;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3279c3)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i8 |= i14;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3870g(str2)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i8 |= i13;
        }
        if ((i7 & 100663296) == 0) {
            if (c2395p.m3874i(interfaceC3279c4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i8 |= i12;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3870g(str3)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i8 |= i11;
        }
        if (c2395p.m3874i(interfaceC3279c5)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        if (c2395p.m3870g(enumC0771cc)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i22 = i9 | i10;
        if (c2395p.m3874i(interfaceC3279c6)) {
            i20 = 256;
        }
        int i23 = i22 | i20;
        if (c2395p.m3872h(z7)) {
            i21 = 2048;
        }
        int i24 = i23 | i21;
        if ((306783377 & i8) == 306783376 && (i24 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C2266e m4346t = AbstractC2710c.m4346t();
            String str11 = enumC1332uc.f7923e;
            C2719b c2719b = EnumC1332uc.f7922i;
            int i25 = i8;
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c2719b));
            C0296c c0296c = new C0296c(c2719b);
            while (c0296c.hasNext()) {
                EnumC1332uc enumC1332uc2 = (EnumC1332uc) c0296c.next();
                C0296c c0296c2 = c0296c;
                String str12 = enumC1332uc2.f7923e;
                if (enumC1332uc2 == EnumC1332uc.f7919f) {
                    str10 = "可靠传输（默认）";
                } else {
                    str10 = "无连接，可测丢包";
                }
                arrayList.add(new C0834ec(enumC1332uc2, str12, str10));
                c0296c = c0296c2;
            }
            int i26 = ((i24 << 6) & 458752) | 54;
            int i27 = 3670016;
            int i28 = 2;
            m2336c("协议", "TCP 或 UDP 打流", m4346t, str11, arrayList, z7, interfaceC3279c, 0.0f, c2395p, ((i25 << 12) & 3670016) | i26);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p, 0, 3);
            C2266e m5812t = AbstractC3784a.m5812t();
            int ordinal = enumC0803dc.ordinal();
            String str13 = "反向";
            if (ordinal == 0) {
                str4 = "反向";
                str5 = "双向";
                str13 = "正向";
            } else if (ordinal == 1) {
                str4 = "反向";
                str5 = "双向";
            } else if (ordinal == 2) {
                str4 = "反向";
                str13 = "双向";
                str5 = str13;
            } else {
                throw new RuntimeException();
            }
            C2719b c2719b2 = EnumC0803dc.f3389j;
            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(c2719b2));
            C0296c c0296c3 = new C0296c(c2719b2);
            while (c0296c3.hasNext()) {
                EnumC0803dc enumC0803dc3 = (EnumC0803dc) c0296c3.next();
                int i29 = i27;
                int ordinal2 = enumC0803dc3.ordinal();
                if (ordinal2 == 0) {
                    str9 = "正向";
                } else if (ordinal2 != 1) {
                    if (ordinal2 == i28) {
                        str9 = str5;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    str9 = str4;
                }
                arrayList2.add(new C0834ec(enumC0803dc3, str9, enumC0803dc3.f3390e));
                i27 = i29;
                i28 = 2;
            }
            int i30 = i27;
            C2395p c2395p2 = c2395p;
            int i31 = 1;
            m2336c("方向", "客户端视角的上传/下载/双向", m5812t, str13, arrayList2, z7, interfaceC3279c2, 0.0f, c2395p2, i26 | ((i25 << 6) & i30));
            c2395p2.m3857Z(-129207814);
            EnumC0803dc enumC0803dc4 = EnumC0803dc.f3387h;
            if (enumC0803dc == enumC0803dc4) {
                AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p2, 0, 3);
                C2266e m5812t2 = AbstractC3784a.m5812t();
                int ordinal3 = enumC0771cc.ordinal();
                String str14 = "单端口";
                if (ordinal3 == 0) {
                    str7 = "单端口";
                    str14 = "双端口";
                } else if (ordinal3 == 1) {
                    str7 = "单端口";
                } else {
                    throw new RuntimeException();
                }
                C2719b c2719b3 = EnumC0771cc.f3024h;
                ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(c2719b3));
                C0296c c0296c4 = new C0296c(c2719b3);
                while (c0296c4.hasNext()) {
                    EnumC0771cc enumC0771cc2 = (EnumC0771cc) c0296c4.next();
                    int ordinal4 = enumC0771cc2.ordinal();
                    if (ordinal4 == 0) {
                        str8 = "双端口";
                    } else if (ordinal4 == i31) {
                        str8 = str7;
                    } else {
                        throw new RuntimeException();
                    }
                    arrayList3.add(new C0834ec(enumC0771cc2, str8, enumC0771cc2.f3025e));
                    i31 = 1;
                }
                int i32 = i26 | ((i24 << 12) & i30);
                enumC0803dc2 = enumC0803dc4;
                c2395p2 = c2395p;
                m2336c("双向模式", "双端口并行或标准 --bidir", m5812t2, str14, arrayList3, z7, interfaceC3279c6, 0.0f, c2395p2, i32);
            } else {
                enumC0803dc2 = enumC0803dc4;
            }
            c2395p2.m3888r(false);
            C2394o2 c2394o2 = AbstractC2019v0.f11943a;
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(c2394o2)).f11784B), c2395p2, 0, 3);
            int i33 = (i24 << 9) & i30;
            m2339f("线程数", "并发流 1 ~ 64", AbstractC3784a.m5806l(), str, f7788c, 2, z7, interfaceC3279c3, c2395p, ((i25 >> 6) & 7168) | 196662 | i33 | ((i25 << 3) & 29360128));
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            C2266e c2266e = AbstractC1793a0.f10844o;
            if (c2266e == null) {
                C2264d c2264d = new C2264d("Filled.Schedule", false);
                int i34 = AbstractC2263c0.f13117a;
                long j6 = C0677s.f2204b;
                C0671o0 c0671o0 = new C0671o0(j6);
                C0811dk m179f = AbstractC0094y0.m179f(11.99f, 2.0f);
                m179f.m1506g(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                m179f.m1514o(4.47f, 10.0f, 9.99f, 10.0f);
                m179f.m1506g(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                m179f.m1513n(17.52f, 2.0f, 11.99f, 2.0f);
                m179f.m1505f();
                m179f.m1512m(12.0f, 20.0f);
                m179f.m1507h(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                m179f.m1514o(3.58f, -8.0f, 8.0f, -8.0f);
                m179f.m1514o(8.0f, 3.58f, 8.0f, 8.0f);
                m179f.m1514o(-3.58f, 8.0f, -8.0f, 8.0f);
                m179f.m1505f();
                C2264d.m3672a(c2264d, m179f.f3514f, c0671o0);
                C0671o0 c0671o02 = new C0671o0(j6);
                ArrayList arrayList4 = new ArrayList(32);
                arrayList4.add(new C2276m(12.5f, 7.0f));
                arrayList4.add(new C2274k(11.0f));
                arrayList4.add(new C2284u(6.0f));
                arrayList4.add(new C2281r(5.25f, 3.15f));
                arrayList4.add(new C2281r(0.75f, -1.23f));
                arrayList4.add(new C2281r(-4.5f, -2.67f));
                arrayList4.add(C2272i.f13166b);
                C2264d.m3672a(c2264d, arrayList4, c0671o02);
                c2266e = c2264d.m3673b();
                AbstractC1793a0.f10844o = c2266e;
            }
            m2339f("测试时长（秒）", "范围 1 ~ 86400", c2266e, str2, f7789d, 5, z7, interfaceC3279c4, c2395p, ((i25 >> 12) & 7168) | 196662 | i33 | ((i25 >> 3) & 29360128));
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            m2339f("报告间隔（秒）", "范围 1 ~ 600", AbstractC2710c.m4319B(), str3, f7790e, 3, z7, interfaceC3279c5, c2395p, ((i25 >> 18) & 7168) | 196662 | i33 | ((i24 << 21) & 29360128));
            if (enumC0803dc == enumC0803dc2) {
                int ordinal5 = enumC0771cc.ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 == 1) {
                        str6 = "单端口 --bidir：与 PC 端 iperf3 -c <IP> --bidir 相同，服务端只需 iperf3 -s -p <端口>（需 iperf3 3.7+）。";
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    str6 = "双端口：主端口上传、主端口+1 下载（如 5201/5202）。App 服务端自动双端口；PC 需另开 iperf3 -s -p <主端口+1>。";
                }
                AbstractC1850a7.m3108b(str6, null, ((C2003t0) c2395p.m3878k(c2394o2)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 0, 0, 65530);
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e() { // from class: e5.id
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(i7 | 1);
                    AbstractC1302td.m2335b(C3154s.this, enumC1332uc, interfaceC3279c, enumC0803dc, interfaceC3279c2, str, interfaceC3279c3, str2, interfaceC3279c4, str3, interfaceC3279c5, enumC0771cc, interfaceC3279c6, z7, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: c */
    public static final void m2336c(final String str, final String str2, final C2266e c2266e, final String str3, final ArrayList arrayList, final boolean z7, final InterfaceC3279c interfaceC3279c, float f7, C2395p c2395p, final int i7) {
        int i8;
        boolean z8;
        float f8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(1116646307);
        if ((i7 & 6) == 0) {
            if (c2395p2.m3870g(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i8 = i15 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p2.m3870g(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i8 |= i14;
        }
        if ((i7 & 384) == 0) {
            if (c2395p2.m3870g(c2266e)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i8 |= i13;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p2.m3870g(str3)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i8 |= i12;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p2.m3874i(arrayList)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i8 |= i11;
        }
        if ((i7 & 196608) == 0) {
            if (c2395p2.m3872h(z7)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i8 |= i10;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p2.m3874i(interfaceC3279c)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i8 |= i9;
        }
        int i16 = i8 | 12582912;
        if ((4793491 & i16) == 4793490 && c2395p2.m3836D()) {
            c2395p2.m3852U();
            f8 = f7;
        } else {
            float f9 = 132;
            c2395p2.m3857Z(-267189042);
            Object m3847O = c2395p2.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            c2395p2.m3888r(false);
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, 2, 1);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m339j);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            m2342i(c2266e, c2395p2, (i16 >> 6) & 14);
            float f10 = 8;
            AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, f10));
            if (1.0f > 0.0d) {
                float f11 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f11 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f11, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                int hashCode2 = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(c2394o2)).f11254k;
                C2300k c2300k = C2300k.f13234i;
                C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11823q, 0L, c2300k, null, 0L, null, 0L, 2, false, 1, 0, c1604o0, c2395p, (i16 & 14) | 196608, 3120, 55258);
                AbstractC1850a7.m3108b(str2, null, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, (i16 >> 3) & 14, 3120, 55290);
                c2395p.m3888r(true);
                AbstractC3122c.m4828a(c2395p, AbstractC0155c.m357p(c3807o, f10));
                boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                c2395p.m3857Z(-949557015);
                if ((i16 & 458752) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object m3847O2 = c2395p.m3847O();
                if (z8 || m3847O2 == c2413u0) {
                    m3847O2 = new C0762c3(z7, interfaceC2425y0, 5);
                    c2395p.m3877j0(m3847O2);
                }
                c2395p.m3888r(false);
                f8 = f9;
                c2395p2 = c2395p;
                AbstractC2052z1.m3218a(booleanValue, (InterfaceC3279c) m3847O2, AbstractC0155c.m357p(c3807o, f9), AbstractC3178i.m4873d(1651035625, new C1386w4(str3, z7, interfaceC2425y0, arrayList, interfaceC3279c), c2395p), c2395p2, 3072);
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            final float f12 = f8;
            m3891u.f13542d = new InterfaceC3281e() { // from class: e5.yc
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1302td.m2336c(str, str2, c2266e, str3, arrayList, z7, interfaceC3279c, f12, (C2395p) obj, AbstractC2418w.m3957F(i7 | 1));
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: d */
    public static final void m2337d(C1394wc c1394wc, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        c2395p.m3859a0(-1614247334);
        if (c2395p.m3874i(c1394wc)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            Object[] objArr = new Object[0];
            c2395p.m3857Z(2028511114);
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = new C1236r9(4);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, m2348o(c2395p), null, AbstractC3178i.m4873d(-1892211636, new C1297t8(2, (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48), c1394wc), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0835ed(c1394wc, i7, 0);
        }
    }

    /* renamed from: e */
    public static final void m2338e(C1394wc c1394wc, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        C2395p c2395p2;
        c2395p.m3859a0(220705939);
        if (c2395p.m3874i(c1394wc)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            if (c1394wc.f8329e != EnumC0803dc.f3387h && (c1394wc.f8337m <= 0.0d || c1394wc.f8338n <= 0.0d)) {
                z7 = false;
            } else {
                z7 = true;
            }
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, m2348o(c2395p), null, AbstractC3178i.m4873d(-57258363, new C1116nd(0, c1394wc, z7), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0835ed(c1394wc, i7, 1);
        }
    }

    /* renamed from: f */
    public static final void m2339f(final String str, final String str2, final C2266e c2266e, final String str3, final List list, final int i7, final boolean z7, final InterfaceC3279c interfaceC3279c, C2395p c2395p, final int i8) {
        int i9;
        boolean z8;
        String str4;
        String str5;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(21819084);
        if ((i8 & 6) == 0) {
            if (c2395p2.m3870g(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i9 = i17 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p2.m3870g(str2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i9 |= i16;
        }
        if ((i8 & 384) == 0) {
            if (c2395p2.m3870g(c2266e)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i9 |= i15;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p2.m3870g(str3)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i9 |= i14;
        }
        if ((i8 & 24576) == 0) {
            if (c2395p2.m3874i(list)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i9 |= i13;
        }
        if ((i8 & 196608) == 0) {
            if (c2395p2.m3866e(i7)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i9 |= i12;
        }
        if ((1572864 & i8) == 0) {
            if (c2395p2.m3872h(z7)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i9 |= i11;
        }
        if ((12582912 & i8) == 0) {
            if (c2395p2.m3874i(interfaceC3279c)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i9 |= i10;
        }
        if ((4793491 & i9) == 4793490 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            c2395p2.m3857Z(1440679068);
            Object m3847O = c2395p2.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            c2395p2.m3888r(false);
            c2395p2.m3857Z(1440681016);
            if ((i9 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean m3870g = z8 | c2395p2.m3870g(list);
            Object m3847O2 = c2395p2.m3847O();
            if (m3870g || m3847O2 == c2413u0) {
                m3847O2 = AbstractC2418w.m3980x(Boolean.valueOf(!list.contains(str3)));
                c2395p2.m3877j0(m3847O2);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O2;
            c2395p2.m3888r(false);
            if (AbstractC0444k.m937a0(str3)) {
                str4 = (String) AbstractC1805m.m3047k0(list);
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = str3;
            }
            C3807o c3807o = C3807o.f17991a;
            int i18 = i9;
            String str6 = str4;
            InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, 2, 1);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m339j);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            m2342i(c2266e, c2395p2, (i18 >> 6) & 14);
            float f7 = 8;
            AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, f7));
            if (1.0f > 0.0d) {
                float f8 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f8 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f8, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                int hashCode2 = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(c2394o2)).f11254k;
                C2300k c2300k = C2300k.f13234i;
                C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11823q, 0L, c2300k, null, 0L, null, 0L, 2, false, 1, 0, c1604o0, c2395p2, (i18 & 14) | 196608, 3120, 55258);
                if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                    str5 = str2.concat(" · 自定义");
                } else {
                    str5 = str2;
                }
                AbstractC1850a7.m3108b(str5, null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11258o, c2395p2, 0, 3120, 55290);
                c2395p2.m3888r(true);
                AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, f7));
                boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                c2395p2.m3857Z(914074935);
                if ((i18 & 3670016) == 1048576) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Object m3847O3 = c2395p2.m3847O();
                if (z9 || m3847O3 == c2413u0) {
                    m3847O3 = new C0762c3(z7, interfaceC2425y0, 4);
                    c2395p2.m3877j0(m3847O3);
                }
                c2395p2.m3888r(false);
                InterfaceC3810r m357p = AbstractC0155c.m357p(c3807o, 132);
                C3173d m4873d = AbstractC3178i.m4873d(297967250, new C1147od(str6, interfaceC2425y02, interfaceC3279c, i7, z7, interfaceC2425y0, list), c2395p2);
                c2395p2 = c2395p2;
                AbstractC2052z1.m3218a(booleanValue, (InterfaceC3279c) m3847O3, m357p, m4873d, c2395p2, 3456);
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e() { // from class: e5.jd
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1302td.m2339f(str, str2, c2266e, str3, list, i7, z7, interfaceC3279c, (C2395p) obj, AbstractC2418w.m3957F(i8 | 1));
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: g */
    public static final void m2340g(InterfaceC3810r interfaceC3810r, final C1270sc c1270sc, final C1394wc c1394wc, final EnumC1363vc enumC1363vc, C2395p c2395p, int i7) {
        InterfaceC2425y0 interfaceC2425y0;
        InterfaceC2425y0 interfaceC2425y02;
        InterfaceC2425y0 interfaceC2425y03;
        InterfaceC2425y0 interfaceC2425y04;
        Context context;
        final InterfaceC2425y0 interfaceC2425y05;
        InterfaceC2425y0 interfaceC2425y06;
        InterfaceC2425y0 interfaceC2425y07;
        InterfaceC2425y0 interfaceC2425y08;
        C2413u0 c2413u0;
        InterfaceC2425y0 interfaceC2425y09;
        boolean z7;
        InterfaceC2425y0 interfaceC2425y010;
        InterfaceC2425y0 interfaceC2425y011;
        C0328m c0328m;
        C2395p c2395p2;
        Object c0740bd;
        AbstractC3367j.m5100e(c1394wc, "state");
        AbstractC3367j.m5100e(enumC1363vc, "role");
        c2395p.m3859a0(481819208);
        int i8 = i7 | (c2395p.m3874i(c1270sc) ? 32 : 16) | (c2395p.m3874i(c1394wc) ? 256 : 128) | (c2395p.m3870g(enumC1363vc) ? 2048 : 1024);
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context2 = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            Object[] objArr = new Object[0];
            c2395p.m3857Z(1978019496);
            boolean m3874i = c2395p.m3874i(context2);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u02 = C2375k.f13421a;
            if (m3874i || m3847O == c2413u02) {
                m3847O = new C1229r2(context2, 26);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y012 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 0);
            Object[] objArr2 = new Object[0];
            c2395p.m3857Z(1978022856);
            boolean m3874i2 = c2395p.m3874i(context2);
            Object m3847O2 = c2395p.m3847O();
            if (m3874i2 || m3847O2 == c2413u02) {
                m3847O2 = new C1229r2(context2, 28);
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y013 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O2, c2395p, 0);
            Object[] objArr3 = new Object[0];
            c2395p.m3857Z(1978026216);
            boolean m3874i3 = c2395p.m3874i(context2);
            Object m3847O3 = c2395p.m3847O();
            if (m3874i3 || m3847O3 == c2413u02) {
                m3847O3 = new C1229r2(context2, 29);
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y014 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O3, c2395p, 0);
            Object[] objArr4 = new Object[0];
            c2395p.m3857Z(1978029510);
            boolean m3874i4 = c2395p.m3874i(context2);
            Object m3847O4 = c2395p.m3847O();
            if (m3874i4 || m3847O4 == c2413u02) {
                m3847O4 = new C0804dd(context2, 0);
                c2395p.m3877j0(m3847O4);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y015 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O4, c2395p, 0);
            Object[] objArr5 = new Object[0];
            c2395p.m3857Z(1978032775);
            boolean m3874i5 = c2395p.m3874i(context2);
            Object m3847O5 = c2395p.m3847O();
            if (m3874i5 || m3847O5 == c2413u02) {
                m3847O5 = new C0804dd(context2, 1);
                c2395p.m3877j0(m3847O5);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y016 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr5, (InterfaceC3277a) m3847O5, c2395p, 0);
            Object[] objArr6 = new Object[0];
            c2395p.m3857Z(1978036005);
            boolean m3874i6 = c2395p.m3874i(context2);
            Object m3847O6 = c2395p.m3847O();
            if (m3874i6 || m3847O6 == c2413u02) {
                m3847O6 = new C0804dd(context2, 2);
                c2395p.m3877j0(m3847O6);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y017 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr6, (InterfaceC3277a) m3847O6, c2395p, 0);
            Object[] objArr7 = new Object[0];
            c2395p.m3857Z(1978039206);
            boolean m3874i7 = c2395p.m3874i(context2);
            Object m3847O7 = c2395p.m3847O();
            if (m3874i7 || m3847O7 == c2413u02) {
                m3847O7 = new C0804dd(context2, 3);
                c2395p.m3877j0(m3847O7);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y018 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr7, (InterfaceC3277a) m3847O7, c2395p, 0);
            Object[] objArr8 = new Object[0];
            c2395p.m3857Z(1978042438);
            boolean m3874i8 = c2395p.m3874i(context2);
            Object m3847O8 = c2395p.m3847O();
            if (m3874i8 || m3847O8 == c2413u02) {
                m3847O8 = new C0804dd(context2, 4);
                c2395p.m3877j0(m3847O8);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y019 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr8, (InterfaceC3277a) m3847O8, c2395p, 0);
            Object[] objArr9 = new Object[0];
            c2395p.m3857Z(1978045703);
            boolean m3874i9 = c2395p.m3874i(context2);
            Object m3847O9 = c2395p.m3847O();
            if (m3874i9 || m3847O9 == c2413u02) {
                m3847O9 = new C0804dd(context2, 5);
                c2395p.m3877j0(m3847O9);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y020 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr9, (InterfaceC3277a) m3847O9, c2395p, 0);
            Object[] objArr10 = new Object[0];
            c2395p.m3857Z(1978049183);
            Object m3847O10 = c2395p.m3847O();
            if (m3847O10 == c2413u02) {
                interfaceC2425y0 = interfaceC2425y020;
                m3847O10 = new C1236r9(3);
                c2395p.m3877j0(m3847O10);
            } else {
                interfaceC2425y0 = interfaceC2425y020;
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y021 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr10, (InterfaceC3277a) m3847O10, c2395p, 48);
            Object[] objArr11 = new Object[0];
            c2395p.m3857Z(1978051452);
            boolean m3874i10 = c2395p.m3874i(context2);
            Object m3847O11 = c2395p.m3847O();
            if (m3874i10 || m3847O11 == c2413u02) {
                m3847O11 = new C1229r2(context2, 27);
                c2395p.m3877j0(m3847O11);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y022 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr11, (InterfaceC3277a) m3847O11, c2395p, 0);
            Object[] objArr12 = new Object[0];
            c2395p.m3857Z(1978056511);
            Object m3847O12 = c2395p.m3847O();
            if (m3847O12 == c2413u02) {
                interfaceC2425y02 = interfaceC2425y022;
                m3847O12 = new C1236r9(1);
                c2395p.m3877j0(m3847O12);
            } else {
                interfaceC2425y02 = interfaceC2425y022;
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y023 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr12, (InterfaceC3277a) m3847O12, c2395p, 48);
            Object[] objArr13 = new Object[0];
            c2395p.m3857Z(1978058592);
            Object m3847O13 = c2395p.m3847O();
            if (m3847O13 == c2413u02) {
                interfaceC2425y03 = interfaceC2425y023;
                m3847O13 = new C1236r9(2);
                c2395p.m3877j0(m3847O13);
            } else {
                interfaceC2425y03 = interfaceC2425y023;
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y024 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr13, (InterfaceC3277a) m3847O13, c2395p, 48);
            c2395p.m3857Z(1978060295);
            boolean m3874i11 = c2395p.m3874i(c1270sc) | c2395p.m3874i(context2);
            Object m3847O14 = c2395p.m3847O();
            if (m3874i11 || m3847O14 == c2413u02) {
                interfaceC2425y04 = interfaceC2425y021;
                m3847O14 = new C0341k(c1270sc, context2, null, 4);
                c2395p.m3877j0(m3847O14);
            } else {
                interfaceC2425y04 = interfaceC2425y021;
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3965g(C1694m.f10482a, c2395p, (InterfaceC3281e) m3847O14);
            C1566b c1566b = new C1566b(2, false);
            c2395p.m3857Z(1978066423);
            boolean m3870g = c2395p.m3870g(interfaceC2425y024) | c2395p.m3874i(context2);
            Object m3847O15 = c2395p.m3847O();
            if (m3870g || m3847O15 == c2413u02) {
                m3847O15 = new C0708ad(context2, interfaceC2425y024, 0);
                c2395p.m3877j0(m3847O15);
            }
            c2395p.m3888r(false);
            C0328m m5793C = AbstractC3784a.m5793C(c1566b, (InterfaceC3279c) m3847O15, c2395p);
            c2395p.m3857Z(1978081152);
            if (((Boolean) interfaceC2425y024.getValue()).booleanValue()) {
                c2395p.m3857Z(1978083288);
                boolean m3870g2 = c2395p.m3870g(interfaceC2425y013) | c2395p.m3870g(interfaceC2425y014) | c2395p.m3874i(context2) | c2395p.m3870g(interfaceC2425y024);
                Object m3847O16 = c2395p.m3847O();
                if (m3870g2 || m3847O16 == c2413u02) {
                    interfaceC2425y05 = interfaceC2425y024;
                    interfaceC2425y06 = interfaceC2425y0;
                    interfaceC2425y08 = interfaceC2425y017;
                    interfaceC2425y09 = interfaceC2425y04;
                    interfaceC2425y010 = interfaceC2425y015;
                    interfaceC2425y011 = interfaceC2425y018;
                    c0328m = m5793C;
                    context = context2;
                    interfaceC2425y07 = interfaceC2425y03;
                    c0740bd = new C0740bd(context, interfaceC2425y013, interfaceC2425y014, interfaceC2425y05, 0);
                    c2395p.m3877j0(c0740bd);
                } else {
                    interfaceC2425y05 = interfaceC2425y024;
                    c0740bd = m3847O16;
                    context = context2;
                    interfaceC2425y06 = interfaceC2425y0;
                    interfaceC2425y07 = interfaceC2425y03;
                    interfaceC2425y08 = interfaceC2425y017;
                    interfaceC2425y09 = interfaceC2425y04;
                    interfaceC2425y010 = interfaceC2425y015;
                    interfaceC2425y011 = interfaceC2425y018;
                    c0328m = m5793C;
                }
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) c0740bd;
                c2395p.m3888r(false);
                c2395p.m3857Z(1978101534);
                boolean m3870g3 = c2395p.m3870g(interfaceC2425y05);
                Object m3847O17 = c2395p.m3847O();
                if (m3870g3 || m3847O17 == c2413u02) {
                    c2413u0 = c2413u02;
                    m3847O17 = new C0705aa(interfaceC2425y05, 15);
                    c2395p.m3877j0(m3847O17);
                } else {
                    c2413u0 = c2413u02;
                }
                z7 = false;
                c2395p.m3888r(false);
                m2343j(interfaceC3279c, (InterfaceC3277a) m3847O17, c2395p, 0);
            } else {
                context = context2;
                interfaceC2425y05 = interfaceC2425y024;
                interfaceC2425y06 = interfaceC2425y0;
                interfaceC2425y07 = interfaceC2425y03;
                interfaceC2425y08 = interfaceC2425y017;
                c2413u0 = c2413u02;
                interfaceC2425y09 = interfaceC2425y04;
                z7 = false;
                interfaceC2425y010 = interfaceC2425y015;
                interfaceC2425y011 = interfaceC2425y018;
                c0328m = m5793C;
            }
            c2395p.m3888r(z7);
            InterfaceC3810r m346e = AbstractC0155c.m346e(interfaceC3810r, 1.0f);
            C3130g m4843g = AbstractC3136j.m4843g(6);
            c2395p.m3857Z(1978114709);
            boolean m3870g4 = ((i8 & 7168) == 2048 ? true : z7) | c2395p.m3870g(interfaceC2425y07) | c2395p.m3874i(c1394wc) | c2395p.m3870g(interfaceC2425y012) | c2395p.m3874i(context) | c2395p.m3874i(c1270sc) | c2395p.m3870g(interfaceC2425y019) | c2395p.m3870g(interfaceC2425y09) | c2395p.m3870g(interfaceC2425y013) | c2395p.m3870g(interfaceC2425y014) | c2395p.m3870g(interfaceC2425y05) | c2395p.m3874i(c0328m);
            final InterfaceC2425y0 interfaceC2425y025 = interfaceC2425y02;
            final InterfaceC2425y0 interfaceC2425y026 = interfaceC2425y010;
            final InterfaceC2425y0 interfaceC2425y027 = interfaceC2425y08;
            boolean m3870g5 = m3870g4 | c2395p.m3870g(interfaceC2425y025) | c2395p.m3870g(interfaceC2425y026) | c2395p.m3870g(interfaceC2425y016) | c2395p.m3870g(interfaceC2425y027);
            final InterfaceC2425y0 interfaceC2425y028 = interfaceC2425y011;
            boolean m3870g6 = m3870g5 | c2395p.m3870g(interfaceC2425y028);
            final InterfaceC2425y0 interfaceC2425y029 = interfaceC2425y06;
            boolean m3870g7 = m3870g6 | c2395p.m3870g(interfaceC2425y029);
            Object m3847O18 = c2395p.m3847O();
            if (m3870g7 || m3847O18 == c2413u0) {
                final InterfaceC2425y0 interfaceC2425y030 = interfaceC2425y09;
                final InterfaceC2425y0 interfaceC2425y031 = interfaceC2425y07;
                final Context context3 = context;
                final C0328m c0328m2 = c0328m;
                m3847O18 = new InterfaceC3279c() { // from class: e5.cd
                    @Override // p150t5.InterfaceC3279c
                    /* renamed from: f */
                    public final Object mo23f(Object obj) {
                        boolean z8;
                        C3320h c3320h = (C3320h) obj;
                        AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                        EnumC1363vc enumC1363vc2 = EnumC1363vc.f8154f;
                        EnumC1363vc enumC1363vc3 = EnumC1363vc.this;
                        C1394wc c1394wc2 = c1394wc;
                        Context context4 = context3;
                        C1270sc c1270sc2 = c1270sc;
                        InterfaceC2425y0 interfaceC2425y032 = interfaceC2425y019;
                        if (enumC1363vc3 == enumC1363vc2) {
                            C3320h.m5052l(c3320h, "server_config", new C3173d(-1599562057, new C0765c6(interfaceC2425y031, c1394wc2, interfaceC2425y012, context4, c1270sc2, interfaceC2425y032, 4), true), 2);
                            z8 = true;
                        } else {
                            InterfaceC2425y0 interfaceC2425y033 = interfaceC2425y030;
                            InterfaceC2425y0 interfaceC2425y034 = interfaceC2425y013;
                            InterfaceC2425y0 interfaceC2425y035 = interfaceC2425y014;
                            C3320h.m5052l(c3320h, "client_connect", new C3173d(-469262464, new C1262s4(interfaceC2425y033, interfaceC2425y034, context4, interfaceC2425y035, c1394wc2, interfaceC2425y05, c0328m2, 2), true), 2);
                            InterfaceC2425y0 interfaceC2425y036 = interfaceC2425y025;
                            InterfaceC2425y0 interfaceC2425y037 = interfaceC2425y026;
                            InterfaceC2425y0 interfaceC2425y038 = interfaceC2425y016;
                            InterfaceC2425y0 interfaceC2425y039 = interfaceC2425y027;
                            InterfaceC2425y0 interfaceC2425y040 = interfaceC2425y028;
                            InterfaceC2425y0 interfaceC2425y041 = interfaceC2425y029;
                            C3320h.m5052l(c3320h, "client_params", new C3173d(1244861495, new C1049l8(interfaceC2425y036, context4, interfaceC2425y037, interfaceC2425y038, interfaceC2425y039, interfaceC2425y040, interfaceC2425y032, interfaceC2425y041, c1394wc2), true), 2);
                            z8 = true;
                            C1080m8 c1080m8 = new C1080m8(c1394wc2, c1270sc2, interfaceC2425y034, interfaceC2425y035, interfaceC2425y037, interfaceC2425y038, interfaceC2425y039, interfaceC2425y040, interfaceC2425y032, interfaceC2425y041);
                            c1394wc2 = c1394wc2;
                            C3320h.m5052l(c3320h, "client_action", new C3173d(1508558520, c1080m8, true), 2);
                        }
                        C3320h.m5052l(c3320h, "live_rate", new C3173d(817748700, new C1085md(c1394wc2, 1), z8), 2);
                        if (!AbstractC0444k.m937a0(c1394wc2.f8344t)) {
                            C3320h.m5052l(c3320h, "summary", new C3173d(1032990638, new C1085md(c1394wc2, 2), z8), 2);
                        }
                        if (!AbstractC0444k.m937a0(c1394wc2.f8345u)) {
                            C3320h.m5052l(c3320h, "error", new C3173d(71365423, new C1085md(c1394wc2, 3), z8), 2);
                        }
                        if (!c1394wc2.f8343s.isEmpty()) {
                            C3320h.m5052l(c3320h, "intervals", new C3173d(-890259792, new C1085md(c1394wc2, 4), z8), 2);
                        }
                        return C1694m.f10482a;
                    }
                };
                c2395p2 = c2395p;
                c2395p2.m3877j0(m3847O18);
            } else {
                c2395p2 = c2395p;
            }
            c2395p2.m3888r(false);
            AbstractC2064e.m3235e(24960, 234, c2395p2, null, m4843g, f7786a, (InterfaceC3279c) m3847O18, null, null, m346e, false);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1291t2(interfaceC3810r, c1270sc, c1394wc, enumC1363vc, i7, 2);
        }
    }

    /* renamed from: h */
    public static final void m2341h(final String str, final C2266e c2266e, final String str2, final long j6, final InterfaceC3810r interfaceC3810r, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(601418293);
        if (c2395p.m3870g(c2266e)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i12 = i7 | i8;
        if (c2395p.m3870g(str2)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i13 = i12 | i9;
        if (c2395p.m3868f(j6)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i14 = i13 | i10;
        if (c2395p.m3870g(interfaceC3810r)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i15 = i14 | i11;
        if ((i15 & 9363) == 9362 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3857Z(651856502);
            C1906h0 m3168i = AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11790H, c2395p);
            c2395p.m3888r(false);
            AbstractC1991r4.m3162c(interfaceC3810r, null, m3168i, null, AbstractC3178i.m4873d(661395879, new C1178pd(str2, j6, c2266e, str), c2395p), c2395p, ((i15 >> 12) & 14) | 196608, 26);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(str, c2266e, str2, j6, interfaceC3810r, i7) { // from class: e5.gd

                /* renamed from: e */
                public final /* synthetic */ String f4221e;

                /* renamed from: f */
                public final /* synthetic */ C2266e f4222f;

                /* renamed from: g */
                public final /* synthetic */ String f4223g;

                /* renamed from: h */
                public final /* synthetic */ long f4224h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC3810r f4225i;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(7);
                    AbstractC1302td.m2341h(this.f4221e, this.f4222f, this.f4223g, this.f4224h, this.f4225i, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: i */
    public static final void m2342i(C2266e c2266e, C2395p c2395p, int i7) {
        int i8;
        C2266e c2266e2;
        C2395p c2395p2;
        int i9;
        c2395p.m3859a0(-835454725);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2266e)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i8 = i9 | i7;
        } else {
            i8 = i7;
        }
        if ((i8 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2266e2 = c2266e;
            c2395p2 = c2395p;
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m353l = AbstractC0155c.m353l(c3807o, 36);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17968i, false);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m353l);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c2266e2 = c2266e;
            c2395p2 = c2395p;
            AbstractC1949m2.m3140b(c2266e2, null, AbstractC0155c.m353l(c3807o, 18), ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a, c2395p2, (i8 & 14) | 432, 0);
            c2395p2.m3888r(true);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1487zc(c2266e2, i7, 0);
        }
    }

    /* renamed from: j */
    public static final void m2343j(InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        c2395p.m3859a0(1538148453);
        if (c2395p.m3874i(interfaceC3279c)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i8 | i7;
        if (c2395p.m3874i(interfaceC3277a)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i11 = i10 | i9;
        if ((i11 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3857Z(-331204992);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3980x(null);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            c2395p.m3888r(false);
            c2395p.m3857Z(-331202341);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == c2413u0) {
                m3847O2 = new C1478z3(interfaceC2425y0, 10);
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3962d(C1694m.f10482a, (InterfaceC3279c) m3847O2, c2395p);
            AbstractC2064e.m3231a(interfaceC3277a, new C3767q(3), AbstractC3178i.m4873d(-2078965252, new C0862f8(interfaceC3279c, interfaceC3277a, interfaceC2425y0), c2395p), c2395p, ((i11 >> 3) & 14) | 432);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1019k9(i7, 1, interfaceC3279c, interfaceC3277a);
        }
    }

    /* renamed from: k */
    public static final void m2344k(String str, C2266e c2266e, boolean z7, InterfaceC3277a interfaceC3277a, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        c2395p.m3859a0(-551638322);
        if (c2395p.m3870g(c2266e)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i11 = i7 | i8;
        if (c2395p.m3872h(z7)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(interfaceC3277a)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        if (((i12 | i10) & 9363) == 9362 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, m2348o(c2395p), null, AbstractC3178i.m4873d(-64765924, new C1386w4(interfaceC3277a, z7, c2266e, str, c3173d), c2395p), c2395p, 196614, 26);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0730b3(str, c2266e, z7, interfaceC3277a, c3173d, i7);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: l */
    public static final void m2345l(p144t.C3154s r41, p039e5.C1394wc r42, java.lang.String r43, p150t5.InterfaceC3279c r44, p150t5.InterfaceC3277a r45, p150t5.InterfaceC3277a r46, p085l0.C2395p r47, int r48) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.AbstractC1302td.m2345l(t.s, e5.wc, java.lang.String, t5.c, t5.a, t5.a, l0.p, int):void");
    }

    /* renamed from: m */
    public static final void m2346m(boolean z7, String str, String str2, boolean z8, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(-1579874452);
        if ((i7 & 6) == 0) {
            if (c2395p2.m3872h(z7)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p2.m3870g(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p2.m3870g(str2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p2.m3872h(z8)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p2.m3874i(interfaceC3277a)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p2.m3874i(interfaceC3277a2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        int i15 = i8;
        if ((74899 & i15) == 74898 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            if (z7) {
                c2395p2.m3857Z(-698757415);
                InterfaceC3810r m347f = AbstractC0155c.m347f(AbstractC0155c.m346e(c3807o, 1.0f), 40);
                C3137j0 m330a = AbstractC0154b.m330a(0.0f, 0, 1);
                C3137j0 c3137j0 = AbstractC2050z.f12193a;
                c2395p2 = c2395p2;
                AbstractC1991r4.m3161b(interfaceC3277a2, m347f, false, f7787b, AbstractC2050z.m3214a(((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11829w, 0L, c2395p2, 14), null, null, m330a, AbstractC3178i.m4873d(-395789385, new C0859f5(str2, 2), c2395p2), c2395p2, ((i15 >> 15) & 14) | 817892400, 356);
                c2395p2.m3888r(false);
            } else {
                c2395p2.m3857Z(-698166121);
                AbstractC1991r4.m3161b(interfaceC3277a, AbstractC0155c.m347f(AbstractC0155c.m346e(c3807o, 1.0f), 40), z8, f7787b, null, null, null, AbstractC0154b.m330a(0.0f, 0, 1), AbstractC3178i.m4873d(1952205824, new C0859f5(str, 3), c2395p2), c2395p2, ((i15 >> 12) & 14) | 817892400 | ((i15 >> 3) & 896), 368);
                c2395p2.m3888r(false);
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1425xc(z7, str, str2, z8, interfaceC3277a, interfaceC3277a2, i7);
        }
    }

    /* renamed from: n */
    public static final void m2347n(C1394wc c1394wc, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        c2395p.m3859a0(432664087);
        if (c2395p.m3874i(c1394wc)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, m2348o(c2395p), null, AbstractC3178i.m4873d(839339493, new C1085md(c1394wc, 5), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0835ed(c1394wc, i7, 2);
        }
    }

    /* renamed from: o */
    public static final C1906h0 m2348o(C2395p c2395p) {
        c2395p.m3857Z(1414224302);
        C1906h0 m3168i = AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11789G, c2395p);
        c2395p.m3888r(false);
        return m3168i;
    }
}
