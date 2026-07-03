package p100n;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C2629b extends AbstractC2590j implements InterfaceC3279c {

    /* renamed from: i */
    public final /* synthetic */ C2635d f14247i;

    /* renamed from: j */
    public final /* synthetic */ Object f14248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2629b(C2635d c2635d, Object obj, InterfaceC2313c interfaceC2313c) {
        super(1, interfaceC2313c);
        this.f14247i = c2635d;
        this.f14248j = obj;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C2629b c2629b = new C2629b(this.f14247i, this.f14248j, (InterfaceC2313c) obj);
        C1694m c1694m = C1694m.f10482a;
        c2629b.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        C2635d c2635d = this.f14247i;
        C2635d.m4204b(c2635d);
        Object m4203a = C2635d.m4203a(c2635d, this.f14248j);
        c2635d.f14259c.f14349f.setValue(m4203a);
        c2635d.f14261e.setValue(m4203a);
        return C1694m.f10482a;
    }
}
