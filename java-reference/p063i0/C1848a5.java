package p063i0;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p067i4.AbstractC2072e;
import p082k5.InterfaceC2313c;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2661l1;
import p107o.C2769p1;
import p122q.InterfaceC2958x0;
import p128q6.C3002e;
import p150t5.InterfaceC3281e;
import p160v.C3419k0;
import p160v.C3441v0;
import p160v.InterfaceC3435s0;
import p162v1.C3502g0;
import p168w.AbstractC3642y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.a5 */
/* loaded from: classes.dex */
public final class C1848a5 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10922i;

    /* renamed from: j */
    public int f10923j;

    /* renamed from: k */
    public final /* synthetic */ int f10924k;

    /* renamed from: l */
    public final /* synthetic */ Object f10925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1848a5(Object obj, int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(2, interfaceC2313c);
        this.f10922i = i8;
        this.f10925l = obj;
        this.f10924k = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f10922i) {
            case 0:
                return ((C1848a5) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C1848a5) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C1848a5) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10922i) {
            case 0:
                return new C1848a5((C1857b5) this.f10925l, this.f10924k, interfaceC2313c, 0);
            case 1:
                return new C1848a5((C3441v0) this.f10925l, this.f10924k, interfaceC2313c, 1);
            default:
                return new C1848a5((AbstractC3642y) this.f10925l, this.f10924k, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f10922i) {
            case 0:
                int i7 = this.f10923j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2769p1 c2769p1 = ((C1857b5) this.f10925l).f10971a;
                C2661l1 c2661l1 = AbstractC2017u6.f11937b;
                this.f10923j = 1;
                Object m3327c = AbstractC2072e.m3327c(c2769p1, this.f10924k - c2769p1.f14745a.m3741g(), c2661l1, this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m3327c != enumC2465a) {
                    m3327c = c1694m;
                }
                if (m3327c == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 1:
                int i8 = this.f10923j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC3435s0 interfaceC3435s0 = ((C3441v0) this.f10925l).f16625t;
                    this.f10923j = 1;
                    Object mo5042c = interfaceC3435s0.mo5042c(this.f10924k, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo5042c == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            default:
                AbstractC3642y abstractC3642y = (AbstractC3642y) this.f10925l;
                int i9 = this.f10923j;
                C1694m c1694m2 = C1694m.f10482a;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f10923j = 1;
                    Object m5165h = abstractC3642y.f17415v.m5165h(this);
                    EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                    if (m5165h != enumC2465a3) {
                        m5165h = c1694m2;
                    }
                    if (m5165h == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                double d7 = 0.0f;
                if (-0.5d <= d7 && d7 <= 0.5d) {
                    int m5607h = abstractC3642y.m5607h(this.f10924k);
                    C3002e c3002e = abstractC3642y.f17396c;
                    ((C2349d1) c3002e.f15485c).m3742h(m5607h);
                    ((C3419k0) c3002e.f15488f).m5180a(m5607h);
                    ((C2345c1) c3002e.f15486d).m3730h(0.0f);
                    c3002e.f15487e = null;
                    C3502g0 c3502g0 = (C3502g0) abstractC3642y.f17416w.getValue();
                    if (c3502g0 != null) {
                        c3502g0.m5437k();
                        return c1694m2;
                    }
                    return c1694m2;
                }
                throw new IllegalArgumentException("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5".toString());
        }
    }
}
