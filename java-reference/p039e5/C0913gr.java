package p039e5;

import androidx.compose.animation.AbstractC0144a;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
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
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p092m.AbstractC2501q;
import p102n1.AbstractC2710c;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3137j0;
import p144t.C3147o0;
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
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gr */
/* loaded from: classes.dex */
public final class C0913gr implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f4365e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4366f;

    /* renamed from: g */
    public final /* synthetic */ boolean f4367g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f4368h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3277a f4369i;

    /* renamed from: j */
    public final /* synthetic */ int f4370j;

    public C0913gr(boolean z7, boolean z8, boolean z9, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, int i7) {
        this.f4365e = z7;
        this.f4366f = z8;
        this.f4367g = z9;
        this.f4368h = interfaceC3279c;
        this.f4369i = interfaceC3277a;
        this.f4370j = i7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        boolean z8;
        int i7;
        C3154s c3154s = (C3154s) obj;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e(c3154s, "$this$SpeedSettingsSectionCard");
        if ((intValue & 6) == 0) {
            if (c2395p.m3870g(c3154s)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            intValue |= i7;
        }
        int i8 = intValue;
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            float f7 = 1.0f;
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            float f8 = 8;
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f8), C3795c.f17974o, c2395p, 54);
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
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p, c3504h4);
            AbstractC0945hr.m1562F(AbstractC2710c.m4341o(), c2395p, 0);
            if (1.0f > 0.0d) {
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p, 0);
                int m3975r2 = AbstractC2418w.m3975r(c2395p);
                InterfaceC2385m1 m3882m2 = c2395p.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, layoutWeightElement);
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(c3558z);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p, c3504h2);
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r2))) {
                    AbstractC2487d.m4050n(m3975r2, c2395p, m3975r2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p, c3504h4);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                AbstractC1850a7.m3108b("当前版本：V5.0.1", null, 0L, 0L, C2300k.f13234i, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11254k, c2395p, 196608, 0, 65502);
                C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11258o;
                C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                AbstractC1850a7.m3108b("从 GitHub Releases 检查新版 APK", null, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 6, 0, 65530);
                c2395p.m3888r(true);
                boolean z9 = this.f4367g;
                boolean z10 = this.f4366f;
                if (!z10 && !z9) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                float f9 = 12;
                AbstractC1991r4.m3166g(this.f4369i, null, z7, null, null, null, new C3137j0(f9, f8, f9, f8), AbstractC3178i.m4873d(1318808056, new C0881fr(z9, z10), c2395p), c2395p, 817889280, 378);
                c2395p.m3888r(true);
                AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(c2394o22)).f11784B), c2395p, 0, 3);
                C2266e m18s = AbstractC0000a.m18s();
                if (!z10 && !z9) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0945hr.m1558B("启动时检查更新", "关闭后仅在手动点击“检查更新”时联网检查", m18s, this.f4365e, z8, this.f4368h, c2395p, 54);
                AbstractC0144a.m315b(c3154s, this.f4367g, null, AbstractC2501q.m4059a(), AbstractC2501q.m4061c(), null, AbstractC3178i.m4873d(-521338246, new C1284sq(this.f4370j, 1), c2395p), c2395p, (i8 & 14) | 1600512);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        return C1694m.f10482a;
    }
}
