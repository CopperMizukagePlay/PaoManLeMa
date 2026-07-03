package p063i0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p160v.AbstractC3405d0;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f */
/* loaded from: classes.dex */
public final class C1887f extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11162f;

    /* renamed from: g */
    public final /* synthetic */ C3173d f11163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887f(C3173d c3173d) {
        super(2);
        this.f11162f = 1;
        this.f11163g = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f11162f;
        C1694m c1694m = C1694m.f10482a;
        C3173d c3173d = this.f11163g;
        switch (i7) {
            case 0:
                ((Number) obj2).intValue();
                float f7 = AbstractC1930k.f11406a;
                float f8 = AbstractC1930k.f11406a;
                AbstractC1930k.m3130b(c3173d, (C2395p) obj, AbstractC2418w.m3957F(439));
                return c1694m;
            case 1:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p, 0);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, C3807o.f17991a);
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
                    c3173d.mo24c(C3154s.f15836a, c2395p, 6);
                    c2395p.m3888r(true);
                }
                return c1694m;
            default:
                ((Number) obj2).intValue();
                AbstractC3405d0.m5168c(c3173d, (C2395p) obj, AbstractC2418w.m3957F(7));
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1887f(C3173d c3173d, int i7, int i8) {
        super(2);
        this.f11162f = i8;
        switch (i8) {
            case 2:
                this.f11163g = c3173d;
                super(2);
                return;
            default:
                float f7 = AbstractC1930k.f11406a;
                float f8 = AbstractC1930k.f11406a;
                this.f11163g = c3173d;
                return;
        }
    }
}
