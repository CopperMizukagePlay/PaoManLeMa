package p056h0;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.i */
/* loaded from: classes.dex */
public final class C1735i extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10602i;

    /* renamed from: j */
    public /* synthetic */ Object f10603j;

    /* renamed from: k */
    public final /* synthetic */ C1736j f10604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1735i(C1736j c1736j, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f10602i = i7;
        this.f10604k = c1736j;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f10602i) {
            case 0:
                return ((C1735i) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1735i) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10602i) {
            case 0:
                C1735i c1735i = new C1735i(this.f10604k, interfaceC2313c, 0);
                c1735i.f10603j = obj;
                return c1735i;
            default:
                C1735i c1735i2 = new C1735i(this.f10604k, interfaceC2313c, 1);
                c1735i2.f10603j = obj;
                return c1735i2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f10602i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f10603j;
                C1736j c1736j = this.f10604k;
                InterfaceC2313c interfaceC2313c = null;
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C1734h(c1736j, interfaceC2313c, 0), 3);
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C1734h(c1736j, interfaceC2313c, 1), 3);
                return AbstractC0525d0.m1141s(interfaceC0516a0, null, new C1734h(c1736j, interfaceC2313c, 2), 3);
            default:
                AbstractC1793a0.m2972L(obj);
                return AbstractC0525d0.m1141s((InterfaceC0516a0) this.f10603j, null, new C1734h(this.f10604k, null, 3), 3);
        }
    }
}
