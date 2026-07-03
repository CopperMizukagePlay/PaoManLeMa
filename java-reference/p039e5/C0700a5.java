package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1956n1;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p150t5.InterfaceC3281e;
import p168w.AbstractC3642y;
import p168w.C3619d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a5 */
/* loaded from: classes.dex */
public final class C0700a5 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f2322i;

    /* renamed from: j */
    public int f2323j;

    /* renamed from: k */
    public final /* synthetic */ C1956n1 f2324k;

    /* renamed from: l */
    public final /* synthetic */ int f2325l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC3642y f2326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0700a5(C1956n1 c1956n1, AbstractC3642y abstractC3642y, int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(2, interfaceC2313c);
        this.f2322i = i8;
        this.f2324k = c1956n1;
        this.f2326m = abstractC3642y;
        this.f2325l = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f2322i) {
            case 0:
                return ((C0700a5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0700a5) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f2322i) {
            case 0:
                return new C0700a5(this.f2324k, (C3619d) this.f2326m, this.f2325l, interfaceC2313c, 0);
            default:
                return new C0700a5(this.f2324k, this.f2326m, this.f2325l, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f2322i) {
            case 0:
                int i7 = this.f2323j;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f2323j = 1;
                    if (this.f2324k.m3147b(this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                C3619d c3619d = (C3619d) this.f2326m;
                this.f2323j = 2;
                if (c3619d.m5605f(this.f2325l, AbstractC2638e.m4231q(7, null), this) == enumC2465a) {
                    return enumC2465a;
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f2323j;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f2323j = 1;
                    if (this.f2324k.m3147b(this) == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                this.f2323j = 2;
                if (this.f2326m.m5605f(this.f2325l, AbstractC2638e.m4231q(7, null), this) == enumC2465a2) {
                    return enumC2465a2;
                }
                return C1694m.f10482a;
        }
    }
}
