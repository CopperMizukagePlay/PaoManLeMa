package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p150t5.InterfaceC3281e;
import p168w.C3619d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.n5 */
/* loaded from: classes.dex */
public final class C1108n5 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f6181i;

    /* renamed from: j */
    public int f6182j;

    /* renamed from: k */
    public final /* synthetic */ C3619d f6183k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1108n5(C3619d c3619d, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f6181i = i7;
        this.f6183k = c3619d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f6181i) {
            case 0:
                return ((C1108n5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1108n5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f6181i) {
            case 0:
                return new C1108n5(this.f6183k, interfaceC2313c, 0);
            default:
                return new C1108n5(this.f6183k, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f6181i) {
            case 0:
                int i7 = this.f6182j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    int ordinal = EnumC1105n2.f6151g.ordinal();
                    this.f6182j = 1;
                    Object m5605f = this.f6183k.m5605f(ordinal, AbstractC2638e.m4231q(7, null), this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m5605f == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f6182j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    int ordinal2 = EnumC1105n2.f6152h.ordinal();
                    this.f6182j = 1;
                    Object m5605f2 = this.f6183k.m5605f(ordinal2, AbstractC2638e.m4231q(7, null), this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m5605f2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
