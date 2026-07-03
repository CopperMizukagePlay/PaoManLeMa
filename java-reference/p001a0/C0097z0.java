package p001a0;

import androidx.compose.foundation.layout.AbstractC0155c;
import p050g2.AbstractC1586f0;
import p050g2.C1588g0;
import p050g2.C1604o0;
import p080k2.AbstractC2305p;
import p080k2.C2294e;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.InterfaceC2293d;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2390n2;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p170w1.AbstractC3674f1;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.z0 */
/* loaded from: classes.dex */
public final class C0097z0 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f463f;

    /* renamed from: g */
    public final /* synthetic */ int f464g;

    /* renamed from: h */
    public final /* synthetic */ C1604o0 f465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097z0(int i7, int i8, C1604o0 c1604o0) {
        super(3);
        this.f463f = i7;
        this.f464g = i8;
        this.f465h = c1604o0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7;
        int i8;
        Integer valueOf;
        float f7;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        c2395p.m3857Z(408240218);
        int i9 = this.f463f;
        int i10 = this.f464g;
        AbstractC0027g1.m73s(i9, i10);
        C3807o c3807o = C3807o.f17991a;
        if (i9 == 1 && i10 == Integer.MAX_VALUE) {
            c2395p.m3888r(false);
            return c3807o;
        }
        InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
        InterfaceC2293d interfaceC2293d = (InterfaceC2293d) c2395p.m3878k(AbstractC3674f1.f17520k);
        EnumC3103m enumC3103m = (EnumC3103m) c2395p.m3878k(AbstractC3674f1.f17523n);
        C1604o0 c1604o0 = this.f465h;
        boolean m3870g = c2395p.m3870g(c1604o0) | c2395p.m3870g(enumC3103m);
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3870g || m3847O == c2413u0) {
            m3847O = AbstractC1586f0.m2564h(c1604o0, enumC3103m);
            c2395p.m3877j0(m3847O);
        }
        C1604o0 c1604o02 = (C1604o0) m3847O;
        boolean m3870g2 = c2395p.m3870g(interfaceC2293d) | c2395p.m3870g(c1604o02);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == c2413u0) {
            C1588g0 c1588g0 = c1604o02.f10309a;
            AbstractC2305p abstractC2305p = c1588g0.f10247f;
            C2300k c2300k = c1588g0.f10244c;
            if (c2300k == null) {
                c2300k = C2300k.f13233h;
            }
            C2298i c2298i = c1588g0.f10245d;
            if (c2298i != null) {
                i7 = c2298i.f13229a;
            } else {
                i7 = 0;
            }
            C2299j c2299j = c1588g0.f10246e;
            if (c2299j != null) {
                i8 = c2299j.f13230a;
            } else {
                i8 = 65535;
            }
            m3847O2 = ((C2294e) interfaceC2293d).m3678b(abstractC2305p, c2300k, i7, i8);
            c2395p.m3877j0(m3847O2);
        }
        InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) m3847O2;
        boolean m3870g3 = c2395p.m3870g(interfaceC2390n2.getValue()) | c2395p.m3870g(interfaceC3093c) | c2395p.m3870g(interfaceC2293d) | c2395p.m3870g(c1604o0) | c2395p.m3870g(enumC3103m);
        Object m3847O3 = c2395p.m3847O();
        if (m3870g3 || m3847O3 == c2413u0) {
            m3847O3 = Integer.valueOf((int) (AbstractC0089w1.m171a(c1604o02, interfaceC3093c, interfaceC2293d, AbstractC0089w1.f409a, 1) & 4294967295L));
            c2395p.m3877j0(m3847O3);
        }
        int intValue = ((Number) m3847O3).intValue();
        boolean m3870g4 = c2395p.m3870g(interfaceC2390n2.getValue()) | c2395p.m3870g(interfaceC3093c) | c2395p.m3870g(interfaceC2293d) | c2395p.m3870g(c1604o0) | c2395p.m3870g(enumC3103m);
        Object m3847O4 = c2395p.m3847O();
        if (m3870g4 || m3847O4 == c2413u0) {
            StringBuilder sb = new StringBuilder();
            String str = AbstractC0089w1.f409a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            m3847O4 = Integer.valueOf((int) (AbstractC0089w1.m171a(c1604o02, interfaceC3093c, interfaceC2293d, sb.toString(), 2) & 4294967295L));
            c2395p.m3877j0(m3847O4);
        }
        int intValue2 = ((Number) m3847O4).intValue() - intValue;
        Integer num = null;
        if (i9 == 1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((i9 - 1) * intValue2) + intValue);
        }
        if (i10 != Integer.MAX_VALUE) {
            num = Integer.valueOf(((i10 - 1) * intValue2) + intValue);
        }
        float f8 = Float.NaN;
        if (valueOf != null) {
            f7 = interfaceC3093c.mo4522t0(valueOf.intValue());
        } else {
            f7 = Float.NaN;
        }
        if (num != null) {
            f8 = interfaceC3093c.mo4522t0(num.intValue());
        }
        InterfaceC3810r m348g = AbstractC0155c.m348g(c3807o, f7, f8);
        c2395p.m3888r(false);
        return m348g;
    }
}
