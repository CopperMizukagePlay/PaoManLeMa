package p085l0;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.k2 */
/* loaded from: classes.dex */
public final class C2378k2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f13426i;

    /* renamed from: j */
    public int f13427j;

    /* renamed from: k */
    public /* synthetic */ Object f13428k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3281e f13429l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f13430m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2378k2(InterfaceC3281e interfaceC3281e, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f13426i = i7;
        this.f13429l = interfaceC3281e;
        this.f13430m = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f13426i) {
            case 0:
                return ((C2378k2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2378k2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f13426i) {
            case 0:
                C2378k2 c2378k2 = new C2378k2(this.f13429l, this.f13430m, interfaceC2313c, 0);
                c2378k2.f13428k = obj;
                return c2378k2;
            default:
                C2378k2 c2378k22 = new C2378k2(this.f13429l, this.f13430m, interfaceC2313c, 1);
                c2378k22.f13428k = obj;
                return c2378k22;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f13426i) {
            case 0:
                int i7 = this.f13427j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2393o1 c2393o1 = new C2393o1(this.f13430m, ((InterfaceC0516a0) this.f13428k).mo1107i());
                    this.f13427j = 1;
                    Object mo22d = this.f13429l.mo22d(c2393o1, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (mo22d == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f13427j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2393o1 c2393o12 = new C2393o1(this.f13430m, ((InterfaceC0516a0) this.f13428k).mo1107i());
                    this.f13427j = 1;
                    Object mo22d2 = this.f13429l.mo22d(c2393o12, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo22d2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
