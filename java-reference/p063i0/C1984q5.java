package p063i0;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.q5 */
/* loaded from: classes.dex */
public final class C1984q5 extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public final /* synthetic */ C2016u5 f11697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1984q5(C2016u5 c2016u5, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f11697i = c2016u5;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        C1984q5 c1984q5 = new C1984q5(this.f11697i, (InterfaceC2313c) obj3);
        C1694m c1694m = C1694m.f10482a;
        c1984q5.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        this.f11697i.f11931o.mo52a();
        return C1694m.f10482a;
    }
}
