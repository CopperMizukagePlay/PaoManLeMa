package p122q;

import p027d1.C0464b;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.h0 */
/* loaded from: classes.dex */
public final class C2910h0 extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public final /* synthetic */ int f15162i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2910h0(int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(i7, interfaceC2313c);
        this.f15162i = i8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f15162i) {
            case 0:
                long j6 = ((C0464b) obj2).f1623a;
                C2910h0 c2910h0 = new C2910h0(3, (InterfaceC2313c) obj3, 0);
                C1694m c1694m = C1694m.f10482a;
                c2910h0.mo29m(c1694m);
                return c1694m;
            case 1:
                ((Number) obj2).floatValue();
                C2910h0 c2910h02 = new C2910h0(3, (InterfaceC2313c) obj3, 1);
                C1694m c1694m2 = C1694m.f10482a;
                c2910h02.mo29m(c1694m2);
                return c1694m2;
            default:
                long j7 = ((C0464b) obj2).f1623a;
                C2910h0 c2910h03 = new C2910h0(3, (InterfaceC2313c) obj3, 2);
                C1694m c1694m3 = C1694m.f10482a;
                c2910h03.mo29m(c1694m3);
                return c1694m3;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f15162i;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                return c1694m;
            case 1:
                AbstractC1793a0.m2972L(obj);
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                return c1694m;
        }
    }
}
