package p056h0;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p071j0.C2135k0;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.C2635d;
import p100n.C2643f1;
import p100n.InterfaceC2656k;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.u */
/* loaded from: classes.dex */
public final class C1747u extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10645i = 0;

    /* renamed from: j */
    public float f10646j;

    /* renamed from: k */
    public int f10647k;

    /* renamed from: l */
    public /* synthetic */ Object f10648l;

    /* renamed from: m */
    public final /* synthetic */ Object f10649m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1747u(C1748v c1748v, float f7, InterfaceC2656k interfaceC2656k, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f10648l = c1748v;
        this.f10646j = f7;
        this.f10649m = interfaceC2656k;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f10645i) {
            case 0:
                return ((C1747u) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1747u) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10645i) {
            case 0:
                return new C1747u((C1748v) this.f10648l, this.f10646j, (InterfaceC2656k) this.f10649m, interfaceC2313c);
            default:
                C1747u c1747u = new C1747u((C2643f1) this.f10649m, interfaceC2313c);
                c1747u.f10648l = obj;
                return c1747u;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        float m4228n;
        InterfaceC0516a0 interfaceC0516a0;
        switch (this.f10645i) {
            case 0:
                int i7 = this.f10647k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2635d c2635d = (C2635d) ((C1748v) this.f10648l).f10652c;
                    Float f7 = new Float(this.f10646j);
                    InterfaceC2656k interfaceC2656k = (InterfaceC2656k) this.f10649m;
                    this.f10647k = 1;
                    Object m4205c = C2635d.m4205c(c2635d, f7, interfaceC2656k, null, this, 12);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4205c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f10647k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        m4228n = this.f10646j;
                        interfaceC0516a0 = (InterfaceC0516a0) this.f10648l;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f10648l;
                    m4228n = AbstractC2638e.m4228n(interfaceC0516a02.mo1107i());
                    interfaceC0516a0 = interfaceC0516a02;
                }
                while (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    C2135k0 c2135k0 = new C2135k0((C2643f1) this.f10649m, m4228n);
                    this.f10648l = interfaceC0516a0;
                    this.f10646j = m4228n;
                    this.f10647k = 1;
                    InterfaceC2318h interfaceC2318h = this.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h);
                    Object mo3790m = AbstractC2418w.m3976s(interfaceC2318h).mo3790m(c2135k0, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo3790m == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1747u(C2643f1 c2643f1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f10649m = c2643f1;
    }
}
