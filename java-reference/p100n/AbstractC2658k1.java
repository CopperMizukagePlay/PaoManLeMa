package p100n;

import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC2658k1 {

    /* renamed from: a */
    public static final /* synthetic */ int f14347a = 0;

    static {
        AbstractC2710c.m4326I(C2646g1.f14317f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [t5.c, u5.k] */
    /* renamed from: a */
    public static final C2631b1 m4262a(C2643f1 c2643f1, C2664m1 c2664m1, String str, C2395p c2395p) {
        C2628a1 c2628a1;
        boolean m3870g = c2395p.m3870g(c2643f1);
        Object m3847O = c2395p.m3847O();
        Object obj = C2375k.f13421a;
        if (m3870g || m3847O == obj) {
            m3847O = new C2631b1(c2643f1, c2664m1, str);
            c2395p.m3877j0(m3847O);
        }
        C2631b1 c2631b1 = (C2631b1) m3847O;
        boolean m3870g2 = c2395p.m3870g(c2643f1) | c2395p.m3874i(c2631b1);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == obj) {
            m3847O2 = new C2649h1(1, c2643f1, c2631b1);
            c2395p.m3877j0(m3847O2);
        }
        AbstractC2418w.m3962d(c2631b1, (InterfaceC3279c) m3847O2, c2395p);
        if (c2643f1.m4242g() && (c2628a1 = (C2628a1) c2631b1.f14250b.getValue()) != null) {
            C2643f1 c2643f12 = c2631b1.f14251c;
            c2628a1.f14243e.m4213f(c2628a1.f14245g.mo23f(c2643f12.m4241f().f14255a), c2628a1.f14245g.mo23f(c2643f12.m4241f().f14256b), (InterfaceC2627a0) c2628a1.f14244f.mo23f(c2643f12.m4241f()));
        }
        return c2631b1;
    }

    /* renamed from: b */
    public static final C2637d1 m4263b(C2643f1 c2643f1, Object obj, Object obj2, InterfaceC2627a0 interfaceC2627a0, C2664m1 c2664m1, C2395p c2395p, int i7) {
        boolean m3870g = c2395p.m3870g(c2643f1);
        Object m3847O = c2395p.m3847O();
        Object obj3 = C2375k.f13421a;
        if (m3870g || m3847O == obj3) {
            AbstractC2674q abstractC2674q = (AbstractC2674q) c2664m1.f14361a.mo23f(obj2);
            abstractC2674q.mo4269d();
            m3847O = new C2637d1(c2643f1, obj, abstractC2674q, c2664m1);
            c2395p.m3877j0(m3847O);
        }
        C2637d1 c2637d1 = (C2637d1) m3847O;
        if (c2643f1.m4242g()) {
            c2637d1.m4213f(obj, obj2, interfaceC2627a0);
        } else {
            c2637d1.m4214g(obj2, interfaceC2627a0);
        }
        boolean m3870g2 = c2395p.m3870g(c2643f1) | c2395p.m3870g(c2637d1);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == obj3) {
            m3847O2 = new C2649h1(2, c2643f1, c2637d1);
            c2395p.m3877j0(m3847O2);
        }
        AbstractC2418w.m3962d(c2637d1, (InterfaceC3279c) m3847O2, c2395p);
        return c2637d1;
    }

    /* renamed from: c */
    public static final C2643f1 m4264c(Object obj, String str, C2395p c2395p, int i7, int i8) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3847O == c2413u0) {
            m3847O = new C2643f1(new C2657k0(obj), null, str);
            c2395p.m3877j0(m3847O);
        }
        C2643f1 c2643f1 = (C2643f1) m3847O;
        c2643f1.m4236a(obj, c2395p, (i7 & 8) | 48 | (i7 & 14));
        Object m3847O2 = c2395p.m3847O();
        if (m3847O2 == c2413u0) {
            m3847O2 = new C2655j1(c2643f1, 1);
            c2395p.m3877j0(m3847O2);
        }
        AbstractC2418w.m3962d(c2643f1, (InterfaceC3279c) m3847O2, c2395p);
        return c2643f1;
    }
}
