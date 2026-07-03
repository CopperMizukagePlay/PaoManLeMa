package p100n;

import p001a0.C0033i;
import p039e5.C1339uj;
import p047f6.AbstractC1555j;
import p047f6.InterfaceC1552g;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p140s2.C3096f;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.f */
/* loaded from: classes.dex */
public abstract class AbstractC2641f {

    /* renamed from: a */
    public static final C2675q0 f14295a = AbstractC2638e.m4231q(7, null);

    static {
        Object obj = AbstractC2694w1.f14470a;
        new C3096f(0.1f);
        AbstractC1793a0.m2975c(0.5f, 0.5f);
        AbstractC3784a.m5797a(0.5f, 0.5f);
    }

    /* renamed from: a */
    public static final InterfaceC2390n2 m4234a(float f7, InterfaceC2656k interfaceC2656k, C2395p c2395p, int i7) {
        return m4235b(new C3096f(f7), AbstractC2667n1.f14367c, interfaceC2656k, null, "DpAnimation", c2395p, (i7 << 3) & 896, 8);
    }

    /* renamed from: b */
    public static final InterfaceC2390n2 m4235b(Object obj, C2664m1 c2664m1, InterfaceC2656k interfaceC2656k, Float f7, String str, C2395p c2395p, int i7, int i8) {
        if ((i8 & 8) != 0) {
            f7 = null;
        }
        Object m3847O = c2395p.m3847O();
        Object obj2 = C2375k.f13421a;
        if (m3847O == obj2) {
            m3847O = AbstractC2418w.m3980x(null);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
        Object m3847O2 = c2395p.m3847O();
        if (m3847O2 == obj2) {
            m3847O2 = new C2635d(obj, c2664m1, f7);
            c2395p.m3877j0(m3847O2);
        }
        C2635d c2635d = (C2635d) m3847O2;
        InterfaceC2425y0 m3953A = AbstractC2418w.m3953A(null, c2395p);
        if (f7 != null && (interfaceC2656k instanceof C2675q0)) {
            C2675q0 c2675q0 = (C2675q0) interfaceC2656k;
            if (!AbstractC3367j.m5096a(c2675q0.f14393c, f7)) {
                interfaceC2656k = new C2675q0(c2675q0.f14391a, c2675q0.f14392b, f7);
            }
        }
        InterfaceC2425y0 m3953A2 = AbstractC2418w.m3953A(interfaceC2656k, c2395p);
        Object m3847O3 = c2395p.m3847O();
        if (m3847O3 == obj2) {
            m3847O3 = AbstractC1555j.m2510a(-1, 6, null);
            c2395p.m3877j0(m3847O3);
        }
        InterfaceC1552g interfaceC1552g = (InterfaceC1552g) m3847O3;
        boolean m3874i = c2395p.m3874i(interfaceC1552g) | c2395p.m3874i(obj);
        Object m3847O4 = c2395p.m3847O();
        if (m3874i || m3847O4 == obj2) {
            m3847O4 = new C0033i(9, interfaceC1552g, obj);
            c2395p.m3877j0(m3847O4);
        }
        AbstractC2418w.m3967i((InterfaceC3277a) m3847O4, c2395p);
        boolean m3874i2 = c2395p.m3874i(interfaceC1552g) | c2395p.m3874i(c2635d) | c2395p.m3870g(m3953A2) | c2395p.m3870g(m3953A);
        Object m3847O5 = c2395p.m3847O();
        if (m3874i2 || m3847O5 == obj2) {
            Object c1339uj = new C1339uj(interfaceC1552g, c2635d, m3953A2, m3953A, (InterfaceC2313c) null);
            c2395p.m3877j0(c1339uj);
            m3847O5 = c1339uj;
        }
        AbstractC2418w.m3965g(interfaceC1552g, c2395p, (InterfaceC3281e) m3847O5);
        InterfaceC2390n2 interfaceC2390n2 = (InterfaceC2390n2) interfaceC2425y0.getValue();
        if (interfaceC2390n2 == null) {
            return c2635d.f14259c;
        }
        return interfaceC2390n2;
    }
}
