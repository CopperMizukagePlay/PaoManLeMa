package p039e5;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p171w2.DialogC3769s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j0 */
/* loaded from: classes.dex */
public final class C0979j0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5002i;

    /* renamed from: j */
    public final /* synthetic */ Object f5003j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0979j0(Object obj, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f5002i = i7;
        this.f5003j = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5002i) {
            case 0:
                C0979j0 c0979j0 = (C0979j0) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0979j0.mo29m(c1694m);
                return c1694m;
            case 1:
                C0979j0 c0979j02 = (C0979j0) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c0979j02.mo29m(c1694m2);
                return c1694m2;
            default:
                C0979j0 c0979j03 = (C0979j0) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m3 = C1694m.f10482a;
                c0979j03.mo29m(c1694m3);
                return c1694m3;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5002i) {
            case 0:
                return new C0979j0((C1196q0) this.f5003j, interfaceC2313c, 0);
            case 1:
                return new C0979j0((InterfaceC2425y0) this.f5003j, interfaceC2313c, 1);
            default:
                return new C0979j0((DialogC3769s) this.f5003j, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f5002i;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f5003j;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                C1196q0 c1196q0 = (C1196q0) obj2;
                AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C1072m0(c1196q0, null, 1), 3);
                return c1694m;
            case 1:
                AbstractC1793a0.m2972L(obj);
                AbstractC1092mk.m1695L0((InterfaceC2425y0) obj2);
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                ((DialogC3769s) obj2).show();
                return c1694m;
        }
    }
}
