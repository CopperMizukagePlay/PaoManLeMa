package p056h0;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2635d;
import p100n.C2661l1;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.h */
/* loaded from: classes.dex */
public final class C1734h extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10599i;

    /* renamed from: j */
    public int f10600j;

    /* renamed from: k */
    public final /* synthetic */ C1736j f10601k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1734h(C1736j c1736j, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f10599i = i7;
        this.f10601k = c1736j;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f10599i) {
            case 0:
                return ((C1734h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C1734h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C1734h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1734h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10599i) {
            case 0:
                return new C1734h(this.f10601k, interfaceC2313c, 0);
            case 1:
                return new C1734h(this.f10601k, interfaceC2313c, 1);
            case 2:
                return new C1734h(this.f10601k, interfaceC2313c, 2);
            default:
                return new C1734h(this.f10601k, interfaceC2313c, 3);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f10599i) {
            case 0:
                int i7 = this.f10600j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d = this.f10601k.f10610f;
                    Float f7 = new Float(1.0f);
                    C2661l1 m4232r = AbstractC2638e.m4232r(75, 2, AbstractC2699z.f14500d);
                    this.f10600j = 1;
                    Object m4205c = C2635d.m4205c(c2635d, f7, m4232r, null, this, 12);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4205c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            case 1:
                int i8 = this.f10600j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d2 = this.f10601k.f10611g;
                    Float f8 = new Float(1.0f);
                    C2661l1 m4232r2 = AbstractC2638e.m4232r(225, 2, AbstractC2699z.f14497a);
                    this.f10600j = 1;
                    Object m4205c2 = C2635d.m4205c(c2635d2, f8, m4232r2, null, this, 12);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m4205c2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            case 2:
                int i9 = this.f10600j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d3 = this.f10601k.f10612h;
                    Float f9 = new Float(1.0f);
                    C2661l1 m4232r3 = AbstractC2638e.m4232r(225, 2, AbstractC2699z.f14500d);
                    this.f10600j = 1;
                    Object m4205c3 = C2635d.m4205c(c2635d3, f9, m4232r3, null, this, 12);
                    EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                    if (m4205c3 == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
            default:
                int i10 = this.f10600j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d4 = this.f10601k.f10610f;
                    Float f10 = new Float(0.0f);
                    C2661l1 m4232r4 = AbstractC2638e.m4232r(150, 2, AbstractC2699z.f14500d);
                    this.f10600j = 1;
                    Object m4205c4 = C2635d.m4205c(c2635d4, f10, m4232r4, null, this, 12);
                    EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                    if (m4205c4 == enumC2465a4) {
                        return enumC2465a4;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
