package p071j0;

import p060h5.C1814v;
import p063i0.C1901g4;
import p085l0.C2395p;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2634c1;
import p100n.C2661l1;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C2116b extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: g */
    public static final C2116b f12405g;

    /* renamed from: h */
    public static final C2116b f12406h;

    /* renamed from: f */
    public final /* synthetic */ int f12407f;

    static {
        int i7 = 3;
        f12405g = new C2116b(i7, 0);
        f12406h = new C2116b(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2116b(int i7, int i8) {
        super(i7);
        this.f12407f = i8;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        Object c2661l1;
        switch (this.f12407f) {
            case 0:
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) obj;
                long j6 = ((C3091a) obj3).f15687a;
                int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC2120d.f12413a);
                int i7 = mo4513Q * 2;
                AbstractC3239v0 mo4918e = ((InterfaceC3214k0) obj2).mo4918e(AbstractC3092b.m4772i(i7, 0, j6));
                int i8 = mo4918e.f16054f;
                return interfaceC3223n0.mo4941K(mo4918e.f16053e - i7, i8, C1814v.f10861e, new C1901g4(mo4513Q, 1, mo4918e));
            default:
                C2634c1 c2634c1 = (C2634c1) obj;
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p.m3857Z(-1154662212);
                EnumC2158w enumC2158w = EnumC2158w.f12551e;
                EnumC2158w enumC2158w2 = EnumC2158w.f12552f;
                if (c2634c1.m4202a(enumC2158w, enumC2158w2)) {
                    c2661l1 = AbstractC2638e.m4232r(67, 2, AbstractC2699z.f14500d);
                } else if (!c2634c1.m4202a(enumC2158w2, enumC2158w) && !c2634c1.m4202a(EnumC2158w.f12553g, enumC2158w2)) {
                    c2661l1 = AbstractC2638e.m4231q(7, null);
                } else {
                    c2661l1 = new C2661l1(83, 67, AbstractC2699z.f14500d);
                }
                c2395p.m3888r(false);
                return c2661l1;
        }
    }
}
