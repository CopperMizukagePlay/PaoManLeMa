package p063i0;

import p027d1.C0464b;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r5 */
/* loaded from: classes.dex */
public final class C1992r5 extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public /* synthetic */ long f11723i;

    /* renamed from: j */
    public final /* synthetic */ C2016u5 f11724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1992r5(C2016u5 c2016u5, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f11724j = c2016u5;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        long j6 = ((C0464b) obj2).f1623a;
        C1992r5 c1992r5 = new C1992r5(this.f11724j, (InterfaceC2313c) obj3);
        c1992r5.f11723i = j6;
        C1694m c1694m = C1694m.f10482a;
        c1992r5.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        float m1008d;
        AbstractC1793a0.m2972L(obj);
        long j6 = this.f11723i;
        C2016u5 c2016u5 = this.f11724j;
        if (c2016u5.f11927k) {
            m1008d = c2016u5.f11926j.m3741g() - C0464b.m1008d(j6);
        } else {
            m1008d = C0464b.m1008d(j6);
        }
        c2016u5.f11933q.m3730h(m1008d - c2016u5.f11932p.m3729g());
        return C1694m.f10482a;
    }
}
