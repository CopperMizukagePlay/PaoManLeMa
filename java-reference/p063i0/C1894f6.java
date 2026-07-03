package p063i0;

import p031d5.C0512l;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p152u.C3319g;
import p152u.C3321i;
import p158u5.AbstractC3368k;
import p160v.C3412h;
import p168w.C3629l;
import p168w.C3635r;
import p168w.C3638u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f6 */
/* loaded from: classes.dex */
public final class C1894f6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11198f;

    /* renamed from: g */
    public final /* synthetic */ int f11199g;

    /* renamed from: h */
    public final /* synthetic */ Object f11200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1894f6(int i7, int i8, Object obj) {
        super(2);
        this.f11198f = i8;
        this.f11200h = obj;
        this.f11199g = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11198f) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC1912h6.m3124d((InterfaceC3281e) this.f11200h, (C2395p) obj, AbstractC2418w.m3957F(this.f11199g | 1));
                return C1694m.f10482a;
            case 1:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3321i c3321i = (C3321i) this.f11200h;
                    C0512l c0512l = c3321i.f16288b.f16286b;
                    int i7 = this.f11199g;
                    C3412h m1100d = c0512l.m1100d(i7);
                    ((C3319g) m1100d.f16553c).f16285c.mo1493i(c3321i.f16289c, Integer.valueOf(i7 - m1100d.f16551a), c2395p, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C0512l mo5053i = ((C3635r) this.f11200h).f17346b.mo5053i();
                    int i8 = this.f11199g;
                    C3412h m1100d2 = mo5053i.m1100d(i8);
                    int i9 = i8 - m1100d2.f16551a;
                    ((C3629l) m1100d2.f16553c).f17322b.mo1493i(C3638u.f17375a, Integer.valueOf(i9), c2395p2, 0);
                }
                return C1694m.f10482a;
        }
    }
}
