package p039e5;

import androidx.compose.animation.AbstractC0144a;
import androidx.compose.foundation.layout.AbstractC0154b;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p079k1.C2266e;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p092m.AbstractC2501q;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yd */
/* loaded from: classes.dex */
public final class C1457yd implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f9328e = 0;

    /* renamed from: f */
    public final /* synthetic */ boolean f9329f;

    /* renamed from: g */
    public final /* synthetic */ boolean f9330g;

    /* renamed from: h */
    public final /* synthetic */ boolean f9331h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f9332i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f9333j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f9334k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f9335l;

    /* renamed from: m */
    public final /* synthetic */ boolean f9336m;

    /* renamed from: n */
    public final /* synthetic */ boolean f9337n;

    /* renamed from: o */
    public final /* synthetic */ Object f9338o;

    /* renamed from: p */
    public final /* synthetic */ Object f9339p;

    /* renamed from: q */
    public final /* synthetic */ Object f9340q;

    public C1457yd(boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, boolean z8, InterfaceC3279c interfaceC3279c2, InterfaceC3277a interfaceC3277a2, boolean z9, InterfaceC3279c interfaceC3279c3, boolean z10, InterfaceC3279c interfaceC3279c4, boolean z11, InterfaceC3279c interfaceC3279c5) {
        this.f9329f = z7;
        this.f9332i = interfaceC3279c;
        this.f9339p = interfaceC3277a;
        this.f9330g = z8;
        this.f9333j = interfaceC3279c2;
        this.f9340q = interfaceC3277a2;
        this.f9331h = z9;
        this.f9334k = interfaceC3279c3;
        this.f9336m = z10;
        this.f9335l = interfaceC3279c4;
        this.f9337n = z11;
        this.f9338o = interfaceC3279c5;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z7;
        boolean z8;
        int i7;
        switch (this.f9328e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    float f7 = 4;
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m338i = AbstractC0154b.m338i(c3807o, f7, 8);
                    C3130g m4843g = AbstractC3136j.m4843g(2);
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f9339p;
                    InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) this.f9340q;
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f9338o;
                    C3152r m4857a = AbstractC3150q.m4857a(m4843g, C3795c.f17976q, c2395p, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m338i);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    AbstractC1850a7.m3108b("确认事项（须全部勾选）", AbstractC0154b.m338i(c3807o, 12, f7), 0L, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11256m, c2395p, 196662, 0, 65500);
                    AbstractC1249rm.m2272m(this.f9329f, this.f9332i, "我已阅读并同意", "《用户协议》", interfaceC3277a, c2395p, 3456, 0);
                    AbstractC1249rm.m2272m(this.f9330g, this.f9333j, "我已阅读并同意", "《隐私政策》", interfaceC3277a2, c2395p, 3456, 0);
                    AbstractC1249rm.m2272m(this.f9331h, this.f9334k, "本人已满 14 周岁，或已取得监护人同意使用本应用", null, null, c2395p, 384, 24);
                    AbstractC1249rm.m2272m(this.f9336m, this.f9335l, "本人承诺仅对拥有或已获授权的网络/服务器进行测速与探测，不用于未授权压测或干扰他人服务", null, null, c2395p, 384, 24);
                    AbstractC1249rm.m2272m(this.f9337n, interfaceC3279c, "本人理解 VPN 切换、高流量测速、ROOT、第三方 API 等能力的风险，并自愿承担使用后果", null, null, c2395p, 384, 24);
                    c2395p.m3888r(true);
                }
                return C1694m.f10482a;
            default:
                C3154s c3154s = (C3154s) obj;
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e(c3154s, "$this$SpeedSettingsSectionCard");
                if ((intValue2 & 6) == 0) {
                    if (c2395p2.m3870g(c3154s)) {
                        i7 = 4;
                    } else {
                        i7 = 2;
                    }
                    intValue2 |= i7;
                }
                if ((intValue2 & 19) == 18 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    boolean z9 = this.f9329f;
                    if (z9) {
                        str = "多接口测速时自动禁用限速";
                    } else {
                        str = "总速与下载/上传互斥，按 Mbps 限制";
                    }
                    String str2 = str;
                    C2266e m5807m = AbstractC3784a.m5807m();
                    if (this.f9331h && !z9) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0945hr.m1558B("启用限速", str2, m5807m, this.f9330g, z7, this.f9332i, c2395p2, 6);
                    if (this.f9330g && !z9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    AbstractC0144a.m315b(c3154s, z8, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(-291990563, new C0880fq((String) this.f9338o, (String) this.f9339p, (String) this.f9340q, this.f9333j, this.f9334k, this.f9335l, this.f9331h, this.f9336m, this.f9337n, 1), c2395p2), c2395p2, (intValue2 & 14) | 1600512);
                }
                return C1694m.f10482a;
        }
    }

    public C1457yd(boolean z7, boolean z8, boolean z9, InterfaceC3279c interfaceC3279c, String str, String str2, String str3, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3, InterfaceC3279c interfaceC3279c4, boolean z10, boolean z11) {
        this.f9329f = z7;
        this.f9330g = z8;
        this.f9331h = z9;
        this.f9332i = interfaceC3279c;
        this.f9338o = str;
        this.f9339p = str2;
        this.f9340q = str3;
        this.f9333j = interfaceC3279c2;
        this.f9334k = interfaceC3279c3;
        this.f9335l = interfaceC3279c4;
        this.f9336m = z10;
        this.f9337n = z11;
    }
}
