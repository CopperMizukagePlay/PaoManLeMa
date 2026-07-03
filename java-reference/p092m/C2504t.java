package p092m;

import p100n.C2634c1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.t */
/* loaded from: classes.dex */
public final class C2504t extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13836f;

    /* renamed from: g */
    public final /* synthetic */ C2505u f13837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2504t(C2505u c2505u, int i7) {
        super(1);
        this.f13836f = i7;
        this.f13837g = c2505u;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f13836f) {
            case 0:
                C2634c1 c2634c1 = (C2634c1) obj;
                EnumC2496l enumC2496l = EnumC2496l.f13811e;
                EnumC2496l enumC2496l2 = EnumC2496l.f13812f;
                boolean m4202a = c2634c1.m4202a(enumC2496l, enumC2496l2);
                Object obj2 = null;
                C2505u c2505u = this.f13837g;
                if (m4202a) {
                    C2495k c2495k = c2505u.f13843v.f13849a.f13788b;
                    if (c2495k != null) {
                        obj2 = c2495k.f13810c;
                    }
                } else if (c2634c1.m4202a(enumC2496l2, EnumC2496l.f13813g)) {
                    C2495k c2495k2 = c2505u.f13844w.f13852a.f13788b;
                    if (c2495k2 != null) {
                        obj2 = c2495k2.f13810c;
                    }
                } else {
                    obj2 = AbstractC2501q.f13827c;
                }
                if (obj2 == null) {
                    return AbstractC2501q.f13827c;
                }
                return obj2;
            default:
                C2634c1 c2634c12 = (C2634c1) obj;
                EnumC2496l enumC2496l3 = EnumC2496l.f13811e;
                EnumC2496l enumC2496l4 = EnumC2496l.f13812f;
                boolean m4202a2 = c2634c12.m4202a(enumC2496l3, enumC2496l4);
                C2505u c2505u2 = this.f13837g;
                if (m4202a2) {
                    c2505u2.f13843v.f13849a.getClass();
                    return AbstractC2501q.f13826b;
                }
                if (c2634c12.m4202a(enumC2496l4, EnumC2496l.f13813g)) {
                    c2505u2.f13844w.f13852a.getClass();
                    return AbstractC2501q.f13826b;
                }
                return AbstractC2501q.f13826b;
        }
    }
}
