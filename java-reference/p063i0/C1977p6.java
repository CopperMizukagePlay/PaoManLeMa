package p063i0;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.List;
import p028d2.AbstractC0479l;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.C1814v;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.C2427z;
import p107o.C2769p1;
import p140s2.C3091a;
import p140s2.C3096f;
import p145t0.C3173d;
import p146t1.AbstractC3191c1;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p182y.C3828a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.p6 */
/* loaded from: classes.dex */
public final class C1977p6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11665f = 0;

    /* renamed from: g */
    public final /* synthetic */ float f11666g;

    /* renamed from: h */
    public final /* synthetic */ C3173d f11667h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f11668i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3282f f11669j;

    /* renamed from: k */
    public final /* synthetic */ int f11670k;

    /* renamed from: l */
    public final /* synthetic */ Object f11671l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977p6(float f7, C3173d c3173d, InterfaceC3281e interfaceC3281e, C1857b5 c1857b5, int i7, InterfaceC3282f interfaceC3282f) {
        super(2);
        this.f11666g = f7;
        this.f11667h = c3173d;
        this.f11668i = interfaceC3281e;
        this.f11671l = c1857b5;
        this.f11670k = i7;
        this.f11669j = interfaceC3282f;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11665f) {
            case 0:
                InterfaceC3203g1 interfaceC3203g1 = (InterfaceC3203g1) obj;
                long j6 = ((C3091a) obj2).f15687a;
                int mo4513Q = interfaceC3203g1.mo4513Q(AbstractC2017u6.f11936a);
                int mo4513Q2 = interfaceC3203g1.mo4513Q(this.f11666g);
                List mo4888g0 = interfaceC3203g1.mo4888g0(EnumC2025v6.f11985e, this.f11667h);
                Integer num = 0;
                int size = mo4888g0.size();
                for (int i7 = 0; i7 < size; i7++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((InterfaceC3214k0) mo4888g0.get(i7)).mo4920f(Integer.MAX_VALUE)));
                }
                int intValue = num.intValue();
                long m4753a = C3091a.m4753a(j6, mo4513Q, 0, intValue, intValue, 2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size2 = mo4888g0.size();
                int i8 = 0;
                while (i8 < size2) {
                    InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) mo4888g0.get(i8);
                    AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(m4753a);
                    float mo4522t0 = interfaceC3203g1.mo4522t0(Math.min(interfaceC3214k0.mo4917c0(mo4918e.f16054f), mo4918e.f16053e)) - (AbstractC1912h6.f11288b * 2);
                    arrayList.add(mo4918e);
                    arrayList2.add(new C3096f(mo4522t0));
                    i8++;
                    mo4888g0 = mo4888g0;
                }
                Integer valueOf = Integer.valueOf(mo4513Q2 * 2);
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    valueOf = Integer.valueOf(valueOf.intValue() + ((AbstractC3239v0) arrayList.get(i9)).f16053e);
                }
                int intValue2 = valueOf.intValue();
                return interfaceC3203g1.mo4941K(intValue2, intValue, C1814v.f10861e, new C1969o6(mo4513Q2, arrayList, interfaceC3203g1, this.f11668i, (C1857b5) this.f11671l, this.f11670k, arrayList2, j6, intValue2, intValue, this.f11669j));
            default:
                C2395p c2395p = (C2395p) obj;
                int intValue3 = ((Number) obj2).intValue();
                C2769p1 c2769p1 = (C2769p1) this.f11671l;
                if ((intValue3 & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    Object m3847O = c2395p.m3847O();
                    C2413u0 c2413u0 = C2375k.f13421a;
                    if (m3847O == c2413u0) {
                        C2427z c2427z = new C2427z(AbstractC2418w.m3971n(c2395p));
                        c2395p.m3877j0(c2427z);
                        m3847O = c2427z;
                    }
                    InterfaceC0516a0 interfaceC0516a0 = ((C2427z) m3847O).f13636e;
                    boolean m3870g = c2395p.m3870g(c2769p1) | c2395p.m3870g(interfaceC0516a0);
                    Object m3847O2 = c2395p.m3847O();
                    if (m3870g || m3847O2 == c2413u0) {
                        m3847O2 = new C1857b5(c2769p1, interfaceC0516a0);
                        c2395p.m3877j0(m3847O2);
                    }
                    C1857b5 c1857b5 = (C1857b5) m3847O2;
                    InterfaceC3810r m5800d = AbstractC3784a.m5800d(AbstractC0479l.m1037a(AbstractC2067b.m3293r(AbstractC0155c.m360s(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), C3795c.f17967h), c2769p1), false, C3828a.f18037f));
                    boolean m3864d = c2395p.m3864d(this.f11666g);
                    C3173d c3173d = this.f11667h;
                    boolean m3870g2 = m3864d | c2395p.m3870g(c3173d) | c2395p.m3870g(this.f11668i) | c2395p.m3870g(this.f11669j) | c2395p.m3874i(c1857b5) | c2395p.m3866e(this.f11670k);
                    Object m3847O3 = c2395p.m3847O();
                    if (m3870g2 || m3847O3 == c2413u0) {
                        C1977p6 c1977p6 = new C1977p6(this.f11666g, c3173d, this.f11668i, c1857b5, this.f11670k, this.f11669j);
                        c2395p.m3877j0(c1977p6);
                        m3847O3 = c1977p6;
                    }
                    AbstractC3191c1.m4891b(m5800d, (InterfaceC3281e) m3847O3, c2395p, 0, 0);
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977p6(C2769p1 c2769p1, float f7, C3173d c3173d, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, int i7) {
        super(2);
        this.f11671l = c2769p1;
        this.f11666g = f7;
        this.f11667h = c3173d;
        this.f11668i = interfaceC3281e;
        this.f11669j = interfaceC3282f;
        this.f11670k = i7;
    }
}
