package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.C2659l;
import p100n.C2675q0;
import p122q.InterfaceC2958x0;
import p150t5.InterfaceC3281e;
import p152u.C3330r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zd */
/* loaded from: classes.dex */
public final class C1488zd extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f9852i;

    /* renamed from: j */
    public final /* synthetic */ C3330r f9853j;

    /* renamed from: k */
    public int f9854k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1488zd(C3330r c3330r, int i7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9852i = 1;
        this.f9853j = c3330r;
        this.f9854k = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f9852i) {
            case 0:
                return ((C1488zd) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                C1488zd c1488zd = (C1488zd) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m = C1694m.f10482a;
                c1488zd.mo29m(c1694m);
                return c1694m;
            case 2:
                return ((C1488zd) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C1488zd) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f9852i) {
            case 0:
                return new C1488zd(this.f9853j, interfaceC2313c, 0);
            case 1:
                return new C1488zd(this.f9853j, this.f9854k, interfaceC2313c);
            case 2:
                return new C1488zd(this.f9853j, interfaceC2313c, 2);
            default:
                return new C1488zd(this.f9853j, interfaceC2313c, 3);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f9852i) {
            case 0:
                int i7 = this.f9854k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f9854k = 1;
                    Object m5065i = C3330r.m5065i(this.f9853j, 0, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m5065i == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            case 1:
                AbstractC1793a0.m2972L(obj);
                this.f9853j.m5069j(this.f9854k);
                return C1694m.f10482a;
            case 2:
                int i8 = this.f9854k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2659l c2659l = this.f9853j.f16382w;
                    Float f7 = new Float(0.0f);
                    C2675q0 m4231q = AbstractC2638e.m4231q(1, new Float(0.5f));
                    this.f9854k = 1;
                    Object m4223i = AbstractC2638e.m4223i(c2659l, f7, m4231q, true, null, this, 8);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m4223i == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            default:
                int i9 = this.f9854k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2659l c2659l2 = this.f9853j.f16382w;
                    Float f8 = new Float(0.0f);
                    C2675q0 m4231q2 = AbstractC2638e.m4231q(1, new Float(0.5f));
                    this.f9854k = 1;
                    Object m4223i2 = AbstractC2638e.m4223i(c2659l2, f8, m4231q2, true, null, this, 8);
                    EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                    if (m4223i2 == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1488zd(C3330r c3330r, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f9852i = i7;
        this.f9853j = c3330r;
    }
}
