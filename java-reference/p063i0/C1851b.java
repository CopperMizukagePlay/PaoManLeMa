package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import p050g2.C1604o0;
import p053g5.C1694m;
import p078k0.AbstractC2245n;
import p078k0.AbstractC2252u;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3144n;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C1851b extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f10934f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f10935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1851b(int i7, InterfaceC3281e interfaceC3281e) {
        super(2);
        this.f10934f = i7;
        this.f10935g = interfaceC3281e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f10934f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC3810r mo5829e = AbstractC0154b.m336g(C3807o.f17991a, AbstractC1930k.f11411f).mo5829e(new HorizontalAlignElement(C3795c.f17976q));
                    InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e);
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
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    this.f10935g.mo22d(c2395p, 0);
                    c2395p.m3888r(true);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    float f7 = 1.0f;
                    if (1.0f > 0.0d) {
                        if (1.0f > Float.MAX_VALUE) {
                            f7 = Float.MAX_VALUE;
                        }
                        InterfaceC3810r mo5829e2 = AbstractC0154b.m336g(new LayoutWeightElement(f7, false), AbstractC1930k.f11412g).mo5829e(new HorizontalAlignElement(C3795c.f17976q));
                        InterfaceC3217l0 m4853e2 = AbstractC3144n.m4853e(C3795c.f17964e, false);
                        int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                        InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                        InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, mo5829e2);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z2 = C3507i.f16928b;
                        c2395p2.m3863c0();
                        if (c2395p2.f13485S) {
                            c2395p2.m3880l(c3558z2);
                        } else {
                            c2395p2.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4853e2, c2395p2, C3507i.f16931e);
                        AbstractC2418w.m3954C(m3882m2, c2395p2, C3507i.f16930d);
                        C3504h c3504h2 = C3507i.f16932f;
                        if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r2))) {
                            AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h2);
                        }
                        AbstractC2418w.m3954C(m5823c2, c2395p2, C3507i.f16929c);
                        this.f10935g.mo22d(c2395p2, 0);
                        c2395p2.m3888r(true);
                    } else {
                        throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                }
                return C1694m.f10482a;
            case 2:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    InterfaceC3810r m343b = AbstractC0155c.m343b(C3807o.f17991a, AbstractC2245n.f12995d, 0.0f, 2);
                    InterfaceC3217l0 m4853e3 = AbstractC3144n.m4853e(C3795c.f17964e, false);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p3);
                    InterfaceC2385m1 m3882m3 = c2395p3.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p3, m343b);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z3 = C3507i.f16928b;
                    c2395p3.m3863c0();
                    if (c2395p3.f13485S) {
                        c2395p3.m3880l(c3558z3);
                    } else {
                        c2395p3.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4853e3, c2395p3, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m3, c2395p3, C3507i.f16930d);
                    C3504h c3504h3 = C3507i.f16932f;
                    if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p3, m3975r3, c3504h3);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p3, C3507i.f16929c);
                    this.f10935g.mo22d(c2395p3, 0);
                    c2395p3.m3888r(true);
                }
                return C1694m.f10482a;
            case 3:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    this.f10935g.mo22d(c2395p4, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p5 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p5.m3836D()) {
                    c2395p5.m3852U();
                } else {
                    AbstractC1850a7.m3107a(C1604o0.m2592a(AbstractC1913h7.m3125a(AbstractC2252u.f13069e, c2395p5), 0L, 0L, null, null, 0L, 0L, null, 16744447), this.f10935g, c2395p5, 0);
                }
                return C1694m.f10482a;
        }
    }
}
