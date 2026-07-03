package p039e5;

import androidx.compose.animation.AbstractC0144a;
import p000a.AbstractC0000a;
import p035e1.C0671o0;
import p035e1.C0677s;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p079k1.AbstractC2263c0;
import p079k1.C2264d;
import p079k1.C2266e;
import p085l0.AbstractC2397p1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2501q;
import p092m.C2506v;
import p092m.C2507w;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gq */
/* loaded from: classes.dex */
public final class C0912gq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f4353e = 0;

    /* renamed from: f */
    public final /* synthetic */ boolean f4354f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4355g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f4356h;

    /* renamed from: i */
    public final /* synthetic */ boolean f4357i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f4358j;

    /* renamed from: k */
    public final /* synthetic */ boolean f4359k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f4360l;

    /* renamed from: m */
    public final /* synthetic */ String f4361m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3279c f4362n;

    /* renamed from: o */
    public final /* synthetic */ Object f4363o;

    /* renamed from: p */
    public final /* synthetic */ Object f4364p;

    public C0912gq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, String str, String str2, String str3, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3, InterfaceC3279c interfaceC3279c4, boolean z9, boolean z10) {
        this.f4354f = z7;
        this.f4355g = z8;
        this.f4356h = interfaceC3279c;
        this.f4361m = str;
        this.f4363o = str2;
        this.f4364p = str3;
        this.f4358j = interfaceC3279c2;
        this.f4360l = interfaceC3279c3;
        this.f4362n = interfaceC3279c4;
        this.f4357i = z9;
        this.f4359k = z10;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i7 = this.f4353e;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f4364p;
        int i8 = 4;
        Object obj5 = this.f4363o;
        switch (i7) {
            case 0:
                C3154s c3154s = (C3154s) obj;
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e(c3154s, "$this$SpeedSettingsSectionCard");
                if ((intValue & 6) == 0) {
                    if (!c2395p.m3870g(c3154s)) {
                        i8 = 2;
                    }
                    intValue |= i8;
                }
                if ((intValue & 19) == 18 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C2266e c2266e = AbstractC1793a0.f10842m;
                    if (c2266e == null) {
                        C2264d c2264d = new C2264d("Filled.PieChart", false);
                        int i9 = AbstractC2263c0.f13117a;
                        C0671o0 c0671o0 = new C0671o0(C0677s.f2204b);
                        C0811dk c0811dk = new C0811dk(2);
                        c0811dk.m1512m(11.0f, 2.0f);
                        c0811dk.m1517r(20.0f);
                        c0811dk.m1507h(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f);
                        c0811dk.m1514o(3.93f, -9.5f, 9.0f, -10.0f);
                        c0811dk.m1505f();
                        c0811dk.m1512m(13.03f, 2.0f);
                        c0811dk.m1517r(8.99f);
                        c0811dk.m1510k(22.0f, 10.99f);
                        c0811dk.m1507h(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f);
                        c0811dk.m1505f();
                        c0811dk.m1512m(13.03f, 13.01f);
                        c0811dk.m1510k(13.03f, 22.0f);
                        c0811dk.m1507h(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f);
                        c0811dk.m1509j(-8.97f);
                        c0811dk.m1505f();
                        C2264d.m3672a(c2264d, c0811dk.f3514f, c0671o0);
                        c2266e = c2264d.m3673b();
                        AbstractC1793a0.f10842m = c2266e;
                    }
                    C2266e c2266e2 = c2266e;
                    AbstractC0945hr.m1558B("启用达量停止", "总量与下载/上传互斥，可填 500MB、2GB", c2266e2, this.f4354f, this.f4355g, this.f4356h, c2395p, 54);
                    AbstractC0144a.m315b(c3154s, this.f4354f, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(-1514593188, new C0880fq(this.f4361m, (String) obj5, (String) obj4, this.f4358j, this.f4360l, this.f4362n, this.f4355g, this.f4357i, this.f4359k, 0), c2395p), c2395p, (intValue & 14) | 1600512);
                }
                return c1694m;
            default:
                C3154s c3154s2 = (C3154s) obj;
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                EnumC1127no enumC1127no = (EnumC1127no) obj5;
                AbstractC3367j.m5100e(c3154s2, "$this$SpeedSettingsSectionCard");
                if ((intValue2 & 6) == 0) {
                    if (!c2395p2.m3870g(c3154s2)) {
                        i8 = 2;
                    }
                    intValue2 |= i8;
                }
                int i10 = intValue2;
                if ((i10 & 19) == 18 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    boolean z7 = this.f4354f;
                    if (z7) {
                        str = "当前：模式二";
                    } else {
                        str = "当前：模式一";
                    }
                    String str6 = str;
                    if (z7) {
                        str2 = "更适合多 URL 测速";
                    } else {
                        str2 = "标准 OkHttp / Fetch 测速";
                    }
                    String str7 = str2;
                    AbstractC0945hr.m1558B(str6, str7, AbstractC2710c.m4352z(), this.f4354f, this.f4355g, this.f4356h, c2395p2, 0);
                    AbstractC2397p1 abstractC2397p1 = AbstractC2019v0.f11943a;
                    AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(abstractC2397p1)).f11784B), c2395p2, 0, 3);
                    boolean z8 = this.f4357i;
                    if (z8) {
                        str3 = "当前：单端口复用模式（Beta）";
                    } else {
                        str3 = "单端口复用模式（Beta）";
                    }
                    if (z8) {
                        str4 = "固定 LocalPort，每 URL 8 路 H2 stream";
                    } else {
                        str4 = "与模式二并列；适合观察单端口复用能力";
                    }
                    AbstractC0945hr.m1558B(str3, str4, AbstractC3393k.m5145p(), this.f4357i, this.f4355g, this.f4358j, c2395p2, 0);
                    C2506v m4059a = AbstractC2501q.m4059a();
                    C2507w m4061c = AbstractC2501q.m4061c();
                    String str8 = this.f4361m;
                    InterfaceC3279c interfaceC3279c = this.f4362n;
                    boolean z9 = this.f4355g;
                    int i11 = (i10 & 14) | 1600512;
                    AbstractC0144a.m315b(c3154s2, this.f4357i, null, m4059a, m4061c, null, AbstractC3178i.m4873d(258046044, new C0753bq(str8, interfaceC3279c, z9, z8), c2395p2), c2395p2, i11);
                    AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(abstractC2397p1)).f11784B), c2395p2, 0, 3);
                    Object[] objArr = new Object[0];
                    c2395p2.m3857Z(-516100752);
                    Object m3847O = c2395p2.m3847O();
                    Object obj6 = C2375k.f13421a;
                    if (m3847O == obj6) {
                        m3847O = new C1148oe(26);
                        c2395p2.m3877j0(m3847O);
                    }
                    c2395p2.m3888r(false);
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p2, 48);
                    int ordinal = enumC1127no.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                str5 = "仅IPv6";
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            str5 = "仅IPv4";
                        }
                    } else {
                        str5 = "IPv4+IPv6";
                    }
                    String concat = "当前：".concat(str5);
                    C2266e m16q = AbstractC0000a.m16q();
                    boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
                    c2395p2.m3857Z(-516090651);
                    boolean m3870g = c2395p2.m3870g(interfaceC2425y0);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3870g || m3847O2 == obj6) {
                        m3847O2 = new C1035kp(interfaceC2425y0, 9);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    AbstractC0945hr.m1559C("网络栈模式", concat, m16q, booleanValue, this.f4355g, (InterfaceC3277a) m3847O2, "网络栈模式", c2395p2, 1572870);
                    AbstractC0144a.m315b(c3154s2, ((Boolean) interfaceC2425y0.getValue()).booleanValue(), null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(736053139, new C0896ga((Enum) enumC1127no, (InterfaceC3279c) obj4, z9, 2), c2395p2), c2395p2, i11);
                    c2395p2.m3857Z(-516011627);
                    c2395p2.m3888r(false);
                    AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p2.m3878k(abstractC2397p1)).f11784B), c2395p2, 0, 3);
                    AbstractC0945hr.m1558B("302 跳转增强", "测速前解析最终下载地址，跳过多次跳转以节省流量", AbstractC3393k.m5145p(), this.f4359k, this.f4355g, this.f4360l, c2395p2, 54);
                }
                return c1694m;
        }
    }

    public C0912gq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, boolean z9, InterfaceC3279c interfaceC3279c2, EnumC1127no enumC1127no, boolean z10, InterfaceC3279c interfaceC3279c3, String str, InterfaceC3279c interfaceC3279c4, InterfaceC3279c interfaceC3279c5) {
        this.f4354f = z7;
        this.f4355g = z8;
        this.f4356h = interfaceC3279c;
        this.f4357i = z9;
        this.f4358j = interfaceC3279c2;
        this.f4363o = enumC1127no;
        this.f4359k = z10;
        this.f4360l = interfaceC3279c3;
        this.f4361m = str;
        this.f4362n = interfaceC3279c4;
        this.f4364p = interfaceC3279c5;
    }
}
