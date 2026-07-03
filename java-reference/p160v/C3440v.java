package p160v;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p140s2.C3100j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.v */
/* loaded from: classes.dex */
public final class C3440v extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f16621i;

    /* renamed from: j */
    public int f16622j;

    /* renamed from: k */
    public final /* synthetic */ C3444x f16623k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3440v(C3444x c3444x, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f16621i = i7;
        this.f16623k = c3444x;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f16621i) {
            case 0:
                return ((C3440v) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C3440v) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C3440v) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 3:
                return ((C3440v) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C3440v) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f16621i) {
            case 0:
                return new C3440v(this.f16623k, interfaceC2313c, 0);
            case 1:
                return new C3440v(this.f16623k, interfaceC2313c, 1);
            case 2:
                return new C3440v(this.f16623k, interfaceC2313c, 2);
            case 3:
                return new C3440v(this.f16623k, interfaceC2313c, 3);
            default:
                return new C3440v(this.f16623k, interfaceC2313c, 4);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f16621i;
        C1694m c1694m = C1694m.f10482a;
        C3444x c3444x = this.f16623k;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        switch (i7) {
            case 0:
                int i8 = this.f16622j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2635d c2635d = c3444x.f16653p;
                Float f7 = new Float(1.0f);
                this.f16622j = 1;
                if (c2635d.m4207e(f7, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 1:
                int i9 = this.f16622j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d2 = c3444x.f16652o;
                    C3100j c3100j = new C3100j(0L);
                    this.f16622j = 1;
                    if (c2635d2.m4207e(c3100j, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                int i10 = C3444x.f16637t;
                c3444x.m5194g(0L);
                c3444x.m5193f(false);
                return c1694m;
            case 2:
                int i11 = this.f16622j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2635d c2635d3 = c3444x.f16652o;
                this.f16622j = 1;
                if (c2635d3.m4208f(this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 3:
                int i12 = this.f16622j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2635d c2635d4 = c3444x.f16653p;
                this.f16622j = 1;
                if (c2635d4.m4208f(this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i13 = this.f16622j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2635d c2635d5 = c3444x.f16653p;
                this.f16622j = 1;
                if (c2635d5.m4208f(this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
        }
    }
}
