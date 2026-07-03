package p039e5;

import p008b.C0242k0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.m0 */
/* loaded from: classes.dex */
public final class C1072m0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f5752i;

    /* renamed from: j */
    public int f5753j;

    /* renamed from: k */
    public final /* synthetic */ C1196q0 f5754k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1072m0(C1196q0 c1196q0, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f5752i = i7;
        this.f5754k = c1196q0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f5752i) {
            case 0:
                return ((C1072m0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1072m0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f5752i) {
            case 0:
                return new C1072m0(this.f5754k, interfaceC2313c, 0);
            default:
                return new C1072m0(this.f5754k, interfaceC2313c, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r4 == r5) goto L17;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        switch (this.f5752i) {
            case 0:
                int i7 = this.f5753j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f5753j = 1;
                C1196q0.m2101h(this.f5754k);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (c1694m == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i8 = this.f5753j;
                C1196q0 c1196q0 = this.f5754k;
                C1694m c1694m2 = C1694m.f10482a;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return c1694m2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0242k0 c0242k0 = new C0242k0(20);
                    this.f5753j = 1;
                    c1196q0.m2109A(c0242k0);
                    break;
                }
                this.f5753j = 2;
                C1196q0.m2101h(c1196q0);
                if (c1694m2 != enumC2465a2) {
                    return c1694m2;
                }
                return enumC2465a2;
        }
    }
}
