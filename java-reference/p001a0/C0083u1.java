package p001a0;

import androidx.compose.p007ui.draw.AbstractC0166a;
import p018c0.C0342l;
import p035e1.AbstractC0670o;
import p035e1.C0671o0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p170w1.AbstractC3674f1;
import p170w1.C3726s1;
import p170w1.InterfaceC3687i2;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.u1 */
/* loaded from: classes.dex */
public final class C0083u1 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ AbstractC0670o f394f;

    /* renamed from: g */
    public final /* synthetic */ C0043k1 f395g;

    /* renamed from: h */
    public final /* synthetic */ C2459w f396h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2453q f397i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083u1(AbstractC0670o abstractC0670o, C0043k1 c0043k1, C2459w c2459w, InterfaceC2453q interfaceC2453q) {
        super(3);
        this.f394f = abstractC0670o;
        this.f395g = c0043k1;
        this.f396h = c2459w;
        this.f397i = interfaceC2453q;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        Object obj4;
        InterfaceC3810r interfaceC3810r = (InterfaceC3810r) obj;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        C2459w c2459w = this.f396h;
        long j6 = c2459w.f13724b;
        c2395p.m3857Z(-84507373);
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3847O == c2413u0) {
            m3847O = new C0342l();
            c2395p.m3877j0(m3847O);
        }
        C0342l c0342l = (C0342l) m3847O;
        AbstractC0670o abstractC0670o = this.f394f;
        if ((abstractC0670o instanceof C0671o0) && ((C0671o0) abstractC0670o).f2197a == 16) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (((Boolean) ((C3726s1) ((InterfaceC3687i2) c2395p.m3878k(AbstractC3674f1.f17529t))).f17692a.getValue()).booleanValue()) {
            C0043k1 c0043k1 = this.f395g;
            if (c0043k1.m118b() && C1602n0.m2586b(j6) && z7) {
                c2395p.m3857Z(808320157);
                C1587g c1587g = c2459w.f13723a;
                C1602n0 c1602n0 = new C1602n0(j6);
                boolean m3874i = c2395p.m3874i(c0342l);
                Object m3847O2 = c2395p.m3847O();
                if (m3874i || m3847O2 == c2413u0) {
                    m3847O2 = new C0075s1(c0342l, null, 0);
                    c2395p.m3877j0(m3847O2);
                }
                AbstractC2418w.m3964f(c1587g, c1602n0, (InterfaceC3281e) m3847O2, c2395p);
                boolean m3874i2 = c2395p.m3874i(c0342l);
                InterfaceC2453q interfaceC2453q = this.f397i;
                boolean m3874i3 = m3874i2 | c2395p.m3874i(interfaceC2453q) | c2395p.m3870g(c2459w) | c2395p.m3874i(c0043k1) | c2395p.m3870g(abstractC0670o);
                Object m3847O3 = c2395p.m3847O();
                if (m3874i3 || m3847O3 == c2413u0) {
                    C0079t1 c0079t1 = new C0079t1(c0342l, interfaceC2453q, c2459w, c0043k1, this.f394f, 0);
                    c2395p.m3877j0(c0079t1);
                    m3847O3 = c0079t1;
                }
                obj4 = AbstractC0166a.m380c(interfaceC3810r, (InterfaceC3279c) m3847O3);
                c2395p.m3888r(false);
                c2395p.m3888r(false);
                return obj4;
            }
        }
        c2395p.m3857Z(809534830);
        c2395p.m3888r(false);
        obj4 = C3807o.f17991a;
        c2395p.m3888r(false);
        return obj4;
    }
}
