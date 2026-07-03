package p122q;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.f1 */
/* loaded from: classes.dex */
public final class C2905f1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15144i;

    /* renamed from: j */
    public /* synthetic */ Object f15145j;

    /* renamed from: k */
    public final /* synthetic */ long f15146k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2905f1(long j6, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f15144i = i7;
        this.f15146k = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2923l1 c2923l1 = (C2923l1) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f15144i) {
            case 0:
                C2905f1 c2905f1 = (C2905f1) mo28k(c2923l1, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c2905f1.mo29m(c1694m);
                return c1694m;
            default:
                C2905f1 c2905f12 = (C2905f1) mo28k(c2923l1, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c2905f12.mo29m(c1694m2);
                return c1694m2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15144i) {
            case 0:
                C2905f1 c2905f1 = new C2905f1(this.f15146k, interfaceC2313c, 0);
                c2905f1.f15145j = obj;
                return c2905f1;
            default:
                C2905f1 c2905f12 = new C2905f1(this.f15146k, interfaceC2313c, 1);
                c2905f12.f15145j = obj;
                return c2905f12;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f15144i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                C2929n1 c2929n1 = ((C2923l1) this.f15145j).f15214a;
                C2929n1.m4588a(c2929n1, c2929n1.f15236h, this.f15146k, 1);
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                C2929n1 c2929n12 = ((C2923l1) this.f15145j).f15214a;
                C2929n1.m4588a(c2929n12, c2929n12.f15236h, this.f15146k, 1);
                return C1694m.f10482a;
        }
    }
}
