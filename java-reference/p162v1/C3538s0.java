package p162v1;

import p053g5.C1694m;
import p146t1.AbstractC3237u0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.s0 */
/* loaded from: classes.dex */
public final class C3538s0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ C3541t0 f17013f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3524n1 f17014g;

    /* renamed from: h */
    public final /* synthetic */ long f17015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3538s0(C3541t0 c3541t0, InterfaceC3524n1 interfaceC3524n1, long j6) {
        super(0);
        this.f17013f = c3541t0;
        this.f17014g = interfaceC3524n1;
        this.f17015h = j6;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        AbstractC3529p0 mo5331T0;
        C3514k0 c3514k0 = this.f17013f.f17024j;
        AbstractC3237u0 abstractC3237u0 = null;
        if (!AbstractC3498f.m5378r(c3514k0.f16938a) && !c3514k0.f16940c) {
            AbstractC3497e1 abstractC3497e1 = c3514k0.m5465a().f16849u;
            if (abstractC3497e1 != null && (mo5331T0 = abstractC3497e1.mo5331T0()) != null) {
                abstractC3237u0 = mo5331T0.f16979p;
            }
        } else {
            AbstractC3497e1 abstractC3497e12 = c3514k0.m5465a().f16849u;
            if (abstractC3497e12 != null) {
                abstractC3237u0 = abstractC3497e12.f16979p;
            }
        }
        if (abstractC3237u0 == null) {
            abstractC3237u0 = ((C3728t) this.f17014g).getPlacementScope();
        }
        AbstractC3529p0 mo5331T02 = c3514k0.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T02);
        AbstractC3237u0.m4950h(abstractC3237u0, mo5331T02, this.f17015h);
        return C1694m.f10482a;
    }
}
