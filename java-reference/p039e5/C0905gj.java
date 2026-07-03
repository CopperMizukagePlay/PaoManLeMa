package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1951m4;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gj */
/* loaded from: classes.dex */
public final class C0905gj implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2425y0 f4301e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4302f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4303g;

    public C0905gj(InterfaceC2425y0 interfaceC2425y0, boolean z7, boolean z8) {
        this.f4301e = interfaceC2425y0;
        this.f4302f = z7;
        this.f4303g = z8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(12), C3795c.f17974o, c2395p, 54);
            int m3975r = AbstractC2418w.m3975r(c2395p);
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
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            AbstractC1951m4.m3141a(AbstractC0155c.m353l(c3807o, 24), 0L, 0.0f, 0L, 0, c2395p, 6, 30);
            String str = (String) this.f4301e.getValue();
            if (AbstractC0444k.m937a0(str)) {
                str = "正在解析最终域名、测量延迟并查询 Geo";
                if (!this.f4302f && this.f4303g) {
                    str = "正在通过自定义 DNS 查询目标域名";
                }
            }
            AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
