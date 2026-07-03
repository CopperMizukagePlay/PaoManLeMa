package p170w1;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.r2 */
/* loaded from: classes.dex */
public final class C3723r2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f17686i;

    /* renamed from: j */
    public int f17687j;

    /* renamed from: k */
    public final /* synthetic */ C3731t2 f17688k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3723r2(C3731t2 c3731t2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f17686i = i7;
        this.f17688k = c3731t2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f17686i) {
            case 0:
                return ((C3723r2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C3723r2) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f17686i) {
            case 0:
                return new C3723r2(this.f17688k, interfaceC2313c, 0);
            default:
                return new C3723r2(this.f17688k, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f17686i) {
            case 0:
                int i7 = this.f17687j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C3728t c3728t = this.f17688k.f17785e;
                this.f17687j = 1;
                Object m5639e = c3728t.f17775w.m5639e(this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m5639e != enumC2465a) {
                    m5639e = c1694m;
                }
                if (m5639e == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i8 = this.f17687j;
                C1694m c1694m2 = C1694m.f10482a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C3728t c3728t2 = this.f17688k.f17785e;
                this.f17687j = 1;
                Object m5874a = c3728t2.f17777x.m5874a(this);
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (m5874a != enumC2465a2) {
                    m5874a = c1694m2;
                }
                if (m5874a == enumC2465a2) {
                    return enumC2465a2;
                }
                return c1694m2;
        }
    }
}
