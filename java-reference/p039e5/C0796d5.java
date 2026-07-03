package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1956n1;
import p063i0.EnumC1964o1;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.d5 */
/* loaded from: classes.dex */
public final class C0796d5 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3318i;

    /* renamed from: j */
    public int f3319j;

    /* renamed from: k */
    public final /* synthetic */ C1956n1 f3320k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0796d5(C1956n1 c1956n1, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f3318i = i7;
        this.f3320k = c1956n1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3318i) {
            case 0:
                return ((C0796d5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0796d5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0796d5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0796d5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3318i) {
            case 0:
                return new C0796d5(this.f3320k, interfaceC2313c, 0);
            case 1:
                return new C0796d5(this.f3320k, interfaceC2313c, 1);
            case 2:
                return new C0796d5(this.f3320k, interfaceC2313c, 2);
            default:
                return new C0796d5(this.f3320k, interfaceC2313c, 3);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f3318i) {
            case 0:
                int i7 = this.f3319j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f3319j = 1;
                C1956n1 c1956n1 = this.f3320k;
                c1956n1.getClass();
                Object m3146a = C1956n1.m3146a(c1956n1, EnumC1964o1.f11600f, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m3146a != enumC2465a) {
                    m3146a = c1694m;
                }
                if (m3146a == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 1:
                int i8 = this.f3319j;
                C1694m c1694m2 = C1694m.f10482a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f3319j = 1;
                C1956n1 c1956n12 = this.f3320k;
                c1956n12.getClass();
                Object m3146a2 = C1956n1.m3146a(c1956n12, EnumC1964o1.f11600f, this);
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (m3146a2 != enumC2465a2) {
                    m3146a2 = c1694m2;
                }
                if (m3146a2 == enumC2465a2) {
                    return enumC2465a2;
                }
                return c1694m2;
            case 2:
                int i9 = this.f3319j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f3319j = 1;
                    Object m3147b = this.f3320k.m3147b(this);
                    EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                    if (m3147b == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
            default:
                int i10 = this.f3319j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f3319j = 1;
                    Object m3147b2 = this.f3320k.m3147b(this);
                    EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                    if (m3147b2 == enumC2465a4) {
                        return enumC2465a4;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
