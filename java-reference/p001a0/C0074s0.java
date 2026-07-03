package p001a0;

import androidx.compose.foundation.AbstractC0150f;
import androidx.compose.p007ui.layout.AbstractC0172a;
import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p034e0.C0622o0;
import p047f6.AbstractC1555j;
import p047f6.C1548c;
import p053g5.C1694m;
import p063i0.AbstractC1884e5;
import p063i0.AbstractC1999s4;
import p065i2.AbstractC2064e;
import p071j0.C2125f0;
import p078k0.AbstractC2248q;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p100n.C2648h0;
import p117p1.C2868s;
import p122q.AbstractC2907g0;
import p122q.C2904f0;
import p122q.C2908g1;
import p122q.C2911h1;
import p122q.C2936q;
import p140s2.C3100j;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p144t.C3149p0;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.AbstractC3382y;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p168w.AbstractC3642y;
import p170w1.AbstractC3652a;
import p170w1.C3670e1;
import p171w2.C3766p;
import p171w2.C3771u;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;
import p177x0.C3802j;
import p177x0.C3805m;
import p177x0.C3807o;
import p177x0.InterfaceC3808p;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.s0 */
/* loaded from: classes.dex */
public final class C0074s0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f368f;

    /* renamed from: g */
    public final /* synthetic */ Object f369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0074s0(int i7, int i8, Object obj) {
        super(2);
        this.f368f = i8;
        this.f369g = obj;
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [u5.k, java.lang.Object, t5.f] */
    /* JADX WARN: Type inference failed for: r6v6, types: [t5.c, u5.k] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        int i7 = this.f368f;
        C3807o c3807o = C3807o.f17991a;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f369g;
        switch (i7) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0027g1.m59e((C0622o0) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
            case 1:
                ((InterfaceC0071r1) obj3).mo165e(((C0464b) obj2).f1623a);
                return c1694m;
            case 2:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC3282f interfaceC3282f = (InterfaceC3282f) obj3;
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15790b, C3795c.f17974o, c2395p, 54);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, c3807o);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    interfaceC3282f.mo24c(C3149p0.f15825a, c2395p, 6);
                    c2395p.m3888r(true);
                }
                return c1694m;
            case 3:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    InterfaceC3810r m393c = AbstractC0172a.m393c(c3807o, "indicatorRipple");
                    float f7 = AbstractC2248q.f13006a;
                    AbstractC3144n.m4849a(AbstractC0150f.m326a(AbstractC3784a.m5799c(m393c, AbstractC1884e5.m3117a(5, c2395p2)), (C2125f0) obj3, AbstractC1999s4.m3176a(false, 0.0f, 0L, c2395p2, 0, 7)), c2395p2, 0);
                }
                return c1694m;
            case 4:
                ((Number) obj2).intValue();
                ((C2648h0) obj3).m4259a(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                long j6 = ((C0464b) obj2).f1623a;
                ((C0051m1) obj3).f264g.mo163c(((C2868s) obj).f15008c);
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2868s c2868s = (C2868s) obj;
                long j7 = ((C0464b) obj2).f1623a;
                AbstractC2907g0 abstractC2907g0 = (AbstractC2907g0) obj3;
                if (((Boolean) abstractC2907g0.f15151v.mo23f(c2868s)).booleanValue()) {
                    if (!abstractC2907g0.f15148A) {
                        if (abstractC2907g0.f15154y == null) {
                            abstractC2907g0.f15154y = AbstractC1555j.m2510a(Integer.MAX_VALUE, 6, null);
                        }
                        abstractC2907g0.f15148A = true;
                        AbstractC0525d0.m1141s(abstractC2907g0.m5830y0(), null, new C2904f0(abstractC2907g0, null), 3);
                    }
                    long j8 = c2868s.f15008c;
                    long m1010f = C0464b.m1010f(j8, AbstractC3784a.m5797a(C0464b.m1008d(j7) * Math.signum(C0464b.m1008d(j8)), C0464b.m1009e(j7) * Math.signum(C0464b.m1009e(j8))));
                    C1548c c1548c = abstractC2907g0.f15154y;
                    if (c1548c != null) {
                        c1548c.mo2505v(new C2936q(m1010f));
                    }
                }
                return c1694m;
            case 7:
                C2911h1 c2911h1 = (C2911h1) obj3;
                AbstractC0525d0.m1141s(c2911h1.m5830y0(), null, new C2908g1(c2911h1, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 8:
                ((Number) obj2).intValue();
                AbstractC3144n.m4849a((InterfaceC3810r) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                return new C3100j(AbstractC2064e.m3234d(0, ((C3801i) obj3).m5826a(0, (int) (((C3102l) obj).f15702a & 4294967295L))));
            case AbstractC3122c.f15760e /* 10 */:
                return new C3100j(((C3802j) obj3).mo5825a(0L, ((C3102l) obj).f15702a, (EnumC3103m) obj2));
            case 11:
                return new C3100j(AbstractC2064e.m3234d(((C3800h) obj3).mo5824a(0, (int) (((C3102l) obj).f15702a >> 32), (EnumC3103m) obj2), 0));
            case 12:
                AbstractC3642y abstractC3642y = (AbstractC3642y) obj3;
                abstractC3642y.f17411r.m3742h(abstractC3642y.m5607h(((Number) obj2).intValue()));
                return c1694m;
            case 13:
                C2395p c2395p3 = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (c2395p3.m3849R(intValue & 1, z7)) {
                    ((AbstractC3652a) obj3).mo5617a(0, c2395p3);
                } else {
                    c2395p3.m3852U();
                }
                return c1694m;
            case 14:
                ((Number) obj2).intValue();
                ((C3670e1) obj3).mo5617a(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                ((Number) obj2).intValue();
                ((C3766p) obj3).mo5617a(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case 16:
                ((Number) obj2).intValue();
                ((C3771u) obj3).mo5617a(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            default:
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) obj;
                InterfaceC3810r interfaceC3810r2 = (InterfaceC3808p) obj2;
                C2395p c2395p4 = (C2395p) obj3;
                if (interfaceC3810r2 instanceof C3805m) {
                    ?? r22 = ((C3805m) interfaceC3810r2).f17989b;
                    AbstractC3382y.m5111b(3, r22);
                    interfaceC3810r2 = AbstractC3793a.m5822b(c2395p4, (InterfaceC3810r) r22.mo24c(c3807o, c2395p4, 0));
                }
                return interfaceC3810r.mo5829e(interfaceC3810r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0074s0(int i7, Object obj) {
        super(2);
        this.f368f = i7;
        this.f369g = obj;
    }
}
