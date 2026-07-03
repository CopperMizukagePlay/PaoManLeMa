package p107o;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3081j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.d */
/* loaded from: classes.dex */
public final class C2731d extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f14620i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC2734e f14621j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2731d(AbstractC2734e abstractC2734e, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f14620i = i7;
        this.f14621j = abstractC2734e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f14620i) {
            case 0:
                C2731d c2731d = (C2731d) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c2731d.mo29m(c1694m);
                return c1694m;
            default:
                C2731d c2731d2 = (C2731d) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c2731d2.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f14620i) {
            case 0:
                return new C2731d(this.f14621j, interfaceC2313c, 0);
            default:
                return new C2731d(this.f14621j, interfaceC2313c, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s.f] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f14620i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                AbstractC2734e abstractC2734e = this.f14621j;
                if (abstractC2734e.f14632F == null) {
                    ?? obj2 = new Object();
                    C3081j c3081j = abstractC2734e.f14638u;
                    if (c3081j != null) {
                        AbstractC0525d0.m1141s(abstractC2734e.m5830y0(), null, new C2722a(c3081j, obj2, null, 0), 3);
                    }
                    abstractC2734e.f14632F = obj2;
                }
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                AbstractC2734e abstractC2734e2 = this.f14621j;
                C3077f c3077f = abstractC2734e2.f14632F;
                if (c3077f != null) {
                    C3078g c3078g = new C3078g(c3077f);
                    C3081j c3081j2 = abstractC2734e2.f14638u;
                    InterfaceC2313c interfaceC2313c = null;
                    if (c3081j2 != null) {
                        AbstractC0525d0.m1141s(abstractC2734e2.m5830y0(), null, new C2722a(c3081j2, c3078g, interfaceC2313c, 1), 3);
                    }
                    abstractC2734e2.f14632F = null;
                }
                return C1694m.f10482a;
        }
    }
}
