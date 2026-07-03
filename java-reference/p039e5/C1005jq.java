package p039e5;

import p000a.AbstractC0000a;
import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p079k1.C2266e;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p102n1.AbstractC2710c;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jq */
/* loaded from: classes.dex */
public final class C1005jq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f5141e;

    /* renamed from: f */
    public final /* synthetic */ boolean f5142f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f5143g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5144h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f5145i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3277a f5146j;

    /* renamed from: k */
    public final /* synthetic */ String f5147k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f5148l;

    /* renamed from: m */
    public final /* synthetic */ String f5149m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3279c f5150n;

    /* renamed from: o */
    public final /* synthetic */ String f5151o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3279c f5152p;

    /* renamed from: q */
    public final /* synthetic */ String f5153q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC3279c f5154r;

    /* renamed from: s */
    public final /* synthetic */ String f5155s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC3279c f5156t;

    /* renamed from: u */
    public final /* synthetic */ String f5157u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC3279c f5158v;

    /* renamed from: w */
    public final /* synthetic */ String f5159w;

    /* renamed from: x */
    public final /* synthetic */ InterfaceC3279c f5160x;

    /* renamed from: y */
    public final /* synthetic */ String f5161y;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC3279c f5162z;

    public C1005jq(boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, boolean z9, InterfaceC3279c interfaceC3279c2, InterfaceC3277a interfaceC3277a, String str, InterfaceC3279c interfaceC3279c3, String str2, InterfaceC3279c interfaceC3279c4, String str3, InterfaceC3279c interfaceC3279c5, String str4, InterfaceC3279c interfaceC3279c6, String str5, InterfaceC3279c interfaceC3279c7, String str6, InterfaceC3279c interfaceC3279c8, String str7, InterfaceC3279c interfaceC3279c9, String str8, InterfaceC3279c interfaceC3279c10) {
        this.f5141e = z7;
        this.f5142f = z8;
        this.f5143g = interfaceC3279c;
        this.f5144h = z9;
        this.f5145i = interfaceC3279c2;
        this.f5146j = interfaceC3277a;
        this.f5147k = str;
        this.f5148l = interfaceC3279c3;
        this.f5149m = str2;
        this.f5150n = interfaceC3279c4;
        this.f5151o = str3;
        this.f5152p = interfaceC3279c5;
        this.f5153q = str4;
        this.f5154r = interfaceC3279c6;
        this.f5155s = str5;
        this.f5156t = interfaceC3279c7;
        this.f5157u = str6;
        this.f5158v = interfaceC3279c8;
        this.f5159w = str7;
        this.f5160x = interfaceC3279c9;
        this.f5161y = str8;
        this.f5162z = interfaceC3279c10;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l;
            C2394o2 c2394o2 = AbstractC2019v0.f11943a;
            AbstractC1850a7.m3108b("默认值就是当前稳定参数；关闭自定义时始终按默认参数测速。", null, ((C2003t0) c2395p.m3878k(c2394o2)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 6, 0, 65530);
            AbstractC0945hr.m1558B("掉速紧急补偿", "连接数塌陷时临时补一个 worker；关闭后只由速率推进控制线程增长", AbstractC0000a.m18s(), this.f5141e, this.f5142f, this.f5143g, c2395p, 54);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            Object[] objArr = new Object[0];
            c2395p.m3857Z(-515952688);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = new C1148oe(27);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
            if (this.f5144h) {
                str = "下次测速将使用下方参数";
            } else {
                str = "当前使用默认参数，下方输入仅保存不生效";
            }
            C2266e m4352z = AbstractC2710c.m4352z();
            boolean booleanValue = ((Boolean) interfaceC2425y0.getValue()).booleanValue();
            c2395p.m3857Z(-515934219);
            boolean m3870g = c2395p.m3870g(interfaceC2425y0);
            Object m3847O2 = c2395p.m3847O();
            if (m3870g || m3847O2 == c2413u0) {
                m3847O2 = new C0944hq(interfaceC2425y0, 0);
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            C3173d m4873d = AbstractC3178i.m4873d(-84142824, new C0975iq(this.f5142f, this.f5144h, this.f5146j, this.f5147k, this.f5148l, this.f5149m, this.f5150n, this.f5151o, this.f5152p, this.f5153q, this.f5154r, this.f5155s, this.f5156t, this.f5157u, this.f5158v, this.f5159w, this.f5160x, this.f5161y, this.f5162z), c2395p);
            AbstractC0945hr.m1557A("启用自定义参数", str, m4352z, this.f5144h, this.f5142f, this.f5145i, booleanValue, (InterfaceC3279c) m3847O2, m4873d, c2395p, 100663302);
        }
        return C1694m.f10482a;
    }
}
