package p034e0;

import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.InterfaceC0516a0;
import p039e5.C1100ms;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p100n.C2675q0;
import p109o1.C2799d;
import p117p1.C2855g0;
import p117p1.C2861l;
import p150t5.InterfaceC3281e;
import p163v2.AbstractC3569i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.c0 */
/* loaded from: classes.dex */
public final class C0598c0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f1964i;

    /* renamed from: j */
    public int f1965j;

    /* renamed from: k */
    public final /* synthetic */ long f1966k;

    /* renamed from: l */
    public final /* synthetic */ Object f1967l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0598c0(long j6, C2855g0 c2855g0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1964i = 2;
        this.f1966k = j6;
        this.f1967l = c2855g0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f1964i) {
            case 0:
                return ((C0598c0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0598c0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0598c0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0598c0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f1964i) {
            case 0:
                return new C0598c0((C2635d) this.f1967l, this.f1966k, interfaceC2313c, 0);
            case 1:
                return new C0598c0((C1100ms) this.f1967l, this.f1966k, interfaceC2313c, 1);
            case 2:
                return new C0598c0(this.f1966k, (C2855g0) this.f1967l, interfaceC2313c);
            default:
                return new C0598c0((AbstractC3569i) this.f1967l, this.f1966k, interfaceC2313c, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C0548l c0548l;
        switch (this.f1964i) {
            case 0:
                int i7 = this.f1965j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d = (C2635d) this.f1967l;
                    C0464b c0464b = new C0464b(this.f1966k);
                    C2675q0 c2675q0 = AbstractC0602e0.f1986d;
                    this.f1965j = 1;
                    Object m4205c = C2635d.m4205c(c2635d, c0464b, c2675q0, null, this, 12);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4205c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            case 1:
                int i8 = this.f1965j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1100ms c1100ms = (C1100ms) this.f1967l;
                    this.f1965j = 1;
                    Object m1914h = C1100ms.m1914h(c1100ms, this.f1966k, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m1914h == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            case 2:
                int i9 = this.f1965j;
                long j6 = this.f1966k;
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            c0548l = ((C2855g0) this.f1967l).f14966g;
                            if (c0548l != null) {
                                c0548l.mo663n(AbstractC1793a0.m2985m(new C2861l(j6)));
                            }
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f1965j = 1;
                    if (AbstractC0525d0.m1131i(j6 - 8, this) == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                this.f1965j = 2;
                if (AbstractC0525d0.m1131i(8L, this) == enumC2465a3) {
                    return enumC2465a3;
                }
                c0548l = ((C2855g0) this.f1967l).f14966g;
                if (c0548l != null) {
                }
                return C1694m.f10482a;
            default:
                int i10 = this.f1965j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2799d c2799d = ((AbstractC3569i) this.f1967l).f17137e;
                    this.f1965j = 1;
                    Object m4432b = c2799d.m4432b(this.f1966k, this);
                    EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                    if (m4432b == enumC2465a4) {
                        return enumC2465a4;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0598c0(Object obj, long j6, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f1964i = i7;
        this.f1967l = obj;
        this.f1966k = j6;
    }
}
