package p168w;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.p */
/* loaded from: classes.dex */
public final class C3633p extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f17341i;

    /* renamed from: j */
    public int f17342j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC3642y f17343k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3633p(AbstractC3642y abstractC3642y, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f17341i = i7;
        this.f17343k = abstractC3642y;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f17341i) {
            case 0:
                return ((C3633p) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C3633p) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f17341i) {
            case 0:
                return new C3633p(this.f17343k, interfaceC2313c, 0);
            default:
                return new C3633p(this.f17343k, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object obj2;
        Object obj3;
        int i7 = this.f17341i;
        AbstractC3642y abstractC3642y = this.f17343k;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                int i8 = this.f17342j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f17342j = 1;
                    float f7 = AbstractC3618c0.f17274a;
                    if (abstractC3642y.m5608i() - 1 < 0 || (obj2 = abstractC3642y.m5605f(abstractC3642y.m5608i() - 1, AbstractC2638e.m4231q(7, null), this)) != enumC2465a) {
                        obj2 = c1694m;
                    }
                    if (obj2 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
            default:
                int i9 = this.f17342j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f17342j = 1;
                    float f8 = AbstractC3618c0.f17274a;
                    if (abstractC3642y.m5608i() + 1 >= abstractC3642y.mo5600k() || (obj3 = abstractC3642y.m5605f(abstractC3642y.m5608i() + 1, AbstractC2638e.m4231q(7, null), this)) != enumC2465a) {
                        obj3 = c1694m;
                    }
                    if (obj3 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
        }
    }
}
