package p063i0;

import androidx.compose.foundation.layout.AbstractC0155c;
import p001a0.C0060o2;
import p039e5.AbstractC1104n1;
import p050g2.C1604o0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p144t.AbstractC3136j;
import p144t.AbstractC3165x0;
import p144t.InterfaceC3159u0;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p154u1.C3352h;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.s */
/* loaded from: classes.dex */
public final class C1994s extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11733f = 0;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f11734g;

    /* renamed from: h */
    public final /* synthetic */ float f11735h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3159u0 f11736i;

    /* renamed from: j */
    public final /* synthetic */ C1886e7 f11737j;

    /* renamed from: k */
    public final /* synthetic */ Object f11738k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3282f f11739l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1994s(InterfaceC3159u0 interfaceC3159u0, float f7, C1886e7 c1886e7, C1604o0 c1604o0, InterfaceC3281e interfaceC3281e, C3173d c3173d) {
        super(2);
        C3173d c3173d2 = AbstractC1104n1.f6134a;
        this.f11736i = interfaceC3159u0;
        this.f11735h = f7;
        this.f11737j = c1886e7;
        this.f11738k = c1604o0;
        this.f11734g = interfaceC3281e;
        this.f11739l = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f11733f;
        C1694m c1694m = C1694m.f10482a;
        int i8 = 7;
        Object obj3 = this.f11738k;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3352h c3352h = AbstractC3165x0.f15870a;
                    InterfaceC3810r m349h = AbstractC0155c.m349h(AbstractC3784a.m5800d(AbstractC3793a.m5821a(C3807o.f17991a, new C0060o2(i8, this.f11736i))), 0.0f, this.f11735h, 1);
                    boolean m3870g = c2395p.m3870g(null);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g || m3847O == C2375k.f13421a) {
                        m3847O = new Object();
                        c2395p.m3877j0(m3847O);
                    }
                    C1986r c1986r = (C1986r) m3847O;
                    C1886e7 c1886e7 = this.f11737j;
                    long j6 = c1886e7.f11159c;
                    long j7 = c1886e7.f11160d;
                    long j8 = c1886e7.f11161e;
                    C3173d c3173d = AbstractC1104n1.f6134a;
                    AbstractC2034x.m3203c(m349h, c1986r, j6, j7, j8, (C1604o0) obj3, AbstractC3136j.f15793e, AbstractC3136j.f15789a, this.f11734g, (C3173d) this.f11739l, c2395p, 113246208, 3126);
                }
                return c1694m;
            default:
                ((Number) obj2).intValue();
                C3173d c3173d2 = AbstractC1104n1.f6134a;
                C1886e7 c1886e72 = this.f11737j;
                int m3957F = AbstractC2418w.m3957F(7);
                AbstractC2034x.m3202b((InterfaceC3810r) obj3, this.f11734g, this.f11739l, this.f11735h, this.f11736i, c1886e72, (C2395p) obj, m3957F);
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1994s(InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, float f7, InterfaceC3159u0 interfaceC3159u0, C1886e7 c1886e7, int i7) {
        super(2);
        C3173d c3173d = AbstractC1104n1.f6134a;
        this.f11738k = interfaceC3810r;
        this.f11734g = interfaceC3281e;
        this.f11739l = interfaceC3282f;
        this.f11735h = f7;
        this.f11736i = interfaceC3159u0;
        this.f11737j = c1886e7;
    }
}
