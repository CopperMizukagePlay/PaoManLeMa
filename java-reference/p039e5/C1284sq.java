package p039e5;

import p001a0.AbstractC0094y0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2000s5;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p092m.C2493i;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3149p0;
import p144t.C3152r;
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
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sq */
/* loaded from: classes.dex */
public final class C1284sq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f7655e;

    /* renamed from: f */
    public final /* synthetic */ int f7656f;

    public /* synthetic */ C1284sq(int i7, int i8) {
        this.f7655e = i8;
        this.f7656f = i7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f7655e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3149p0) obj, "$this$OutlinedButton");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC1850a7.m3108b(this.f7656f + "B", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 0, 3072, 57342);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(6), C3795c.f17976q, c2395p2, 6);
                int m3975r = AbstractC2418w.m3975r(c2395p2);
                InterfaceC2385m1 m3882m = c2395p2.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, C3807o.f17991a);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z = C3507i.f16928b;
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
                C3504h c3504h = C3507i.f16932f;
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r))) {
                    AbstractC2487d.m4050n(m3975r, c2395p2, m3975r, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
                int i7 = this.f7656f;
                float m3530q = AbstractC2168e.m3530q(i7, 0, 100);
                c2395p2.m3857Z(1424212198);
                Object m3847O = c2395p2.m3847O();
                if (m3847O == C2375k.f13421a) {
                    m3847O = new C0866fc(25);
                    c2395p2.m3877j0(m3847O);
                }
                c2395p2.m3888r(false);
                AbstractC2000s5.m3178b(m3530q, (InterfaceC3279c) m3847O, null, false, new C3876a(0.0f, 100.0f), null, null, null, c2395p2, 3120, 484);
                AbstractC1850a7.m3108b(AbstractC0094y0.m184k(AbstractC2168e.m3530q(i7, 0, 100), "更新包下载进度：", "%"), null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p2, 0, 0, 65530);
                c2395p2.m3888r(true);
                return C1694m.f10482a;
        }
    }
}
