package p063i0;

import p053g5.C1694m;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C1896g extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11202f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f11203g;

    /* renamed from: h */
    public final /* synthetic */ C3173d f11204h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1896g(InterfaceC3281e interfaceC3281e, C3173d c3173d, int i7) {
        super(2);
        this.f11202f = i7;
        this.f11203g = interfaceC3281e;
        this.f11204h = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f11202f;
        C1694m c1694m = C1694m.f10482a;
        int i8 = 0;
        C3173d c3173d = this.f11204h;
        InterfaceC3281e interfaceC3281e = this.f11203g;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(1497073862);
                    if (interfaceC3281e != null) {
                        interfaceC3281e.mo22d(c2395p, 0);
                    }
                    c2395p.m3888r(false);
                    c3173d.mo22d(c2395p, 0);
                }
                return c1694m;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    float f7 = AbstractC1930k.f11406a;
                    AbstractC1930k.m3130b(AbstractC3178i.m4873d(1887135077, new C1896g(interfaceC3281e, c3173d, i8), c2395p2), c2395p2, 438);
                }
                return c1694m;
        }
    }
}
