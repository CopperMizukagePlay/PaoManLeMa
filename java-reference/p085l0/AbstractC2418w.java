package p085l0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0070r0;
import p032d6.InterfaceC0516a0;
import p034e0.C0625q;
import p039e5.C1137o3;
import p039e5.C1306th;
import p054g6.InterfaceC1697a0;
import p060h5.AbstractC1804l;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p077k.C2220v;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p084l.AbstractC2334a;
import p093m0.C2512a0;
import p093m0.C2530j0;
import p101n0.C2705e;
import p123q0.C2969d;
import p145t0.C3177h;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.w */
/* loaded from: classes.dex */
public abstract class AbstractC2418w {

    /* renamed from: a */
    public static final Object f13623a = new Object();

    /* renamed from: b */
    public static final C2364h0 f13624b = new Object();

    /* renamed from: A */
    public static final InterfaceC2425y0 m3953A(Object obj, C2395p c2395p) {
        Object m3847O = c2395p.m3847O();
        if (m3847O == C2375k.f13421a) {
            m3847O = m3980x(obj);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
        interfaceC2425y0.setValue(obj);
        return interfaceC2425y0;
    }

    /* renamed from: C */
    public static final void m3954C(Object obj, C2395p c2395p, InterfaceC3281e interfaceC3281e) {
        if (!c2395p.f13485S && AbstractC3367j.m5096a(c2395p.m3847O(), obj)) {
            return;
        }
        c2395p.m3877j0(obj);
        c2395p.m3860b(obj, interfaceC3281e);
    }

    /* renamed from: D */
    public static final C0019e1 m3955D(InterfaceC3277a interfaceC3277a) {
        return new C0019e1((InterfaceC3281e) new C1306th(interfaceC3277a, null));
    }

    /* renamed from: E */
    public static final int m3956E(C2220v c2220v) {
        int m3645c;
        int i7 = c2220v.f12755b;
        int m3645c2 = c2220v.m3645c(0);
        while (c2220v.f12755b != 0 && c2220v.m3645c(0) == m3645c2) {
            int i8 = c2220v.f12755b;
            if (i8 != 0) {
                c2220v.m3647e(0, c2220v.f12754a[i8 - 1]);
                c2220v.m3646d(c2220v.f12755b - 1);
                int i9 = c2220v.f12755b;
                int i10 = i9 >>> 1;
                int i11 = 0;
                while (i11 < i10) {
                    int m3645c3 = c2220v.m3645c(i11);
                    int i12 = (i11 + 1) * 2;
                    int i13 = i12 - 1;
                    int m3645c4 = c2220v.m3645c(i13);
                    if (i12 < i9 && (m3645c = c2220v.m3645c(i12)) > m3645c4) {
                        if (m3645c > m3645c3) {
                            c2220v.m3647e(i11, m3645c);
                            c2220v.m3647e(i12, m3645c3);
                            i11 = i12;
                        }
                    } else if (m3645c4 > m3645c3) {
                        c2220v.m3647e(i11, m3645c4);
                        c2220v.m3647e(i13, m3645c3);
                        i11 = i13;
                    }
                }
            } else {
                AbstractC2334a.m3714e("IntList is empty.");
                throw null;
            }
        }
        return m3645c2;
    }

    /* renamed from: F */
    public static final int m3957F(int i7) {
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        return (i7 & (-920350135)) | (i9 >> 1) | i8 | ((i8 << 1) & i9);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [t0.g, q0.d] */
    /* renamed from: G */
    public static final C3177h m3958G(C2401q1[] c2401q1Arr, InterfaceC2385m1 interfaceC2385m1, InterfaceC2385m1 interfaceC2385m12) {
        C3177h c3177h = C3177h.f15889h;
        ?? c2969d = new C2969d(c3177h);
        c2969d.f15888k = c3177h;
        for (C2401q1 c2401q1 : c2401q1Arr) {
            AbstractC2397p1 abstractC2397p1 = c2401q1.f13529a;
            if (c2401q1.f13534f || !((C3177h) interfaceC2385m1).containsKey(abstractC2397p1)) {
                c2969d.put(abstractC2397p1, abstractC2397p1.m3897c(c2401q1, (InterfaceC2402q2) ((C3177h) interfaceC2385m12).get(abstractC2397p1)));
            }
        }
        return c2969d.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3959a(C2401q1 c2401q1, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        InterfaceC2402q2 interfaceC2402q2;
        boolean z7;
        C2405r1 m3891u;
        c2395p.m3859a0(-149765515);
        C2388n0 c2388n0 = c2395p.f13511x;
        InterfaceC2385m1 m3882m = c2395p.m3882m();
        c2395p.m3855X(201, AbstractC2399q.f13522b);
        Object m3847O = c2395p.m3847O();
        if (AbstractC3367j.m5096a(m3847O, C2375k.f13421a)) {
            interfaceC2402q2 = null;
        } else {
            AbstractC3367j.m5098c(m3847O, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            interfaceC2402q2 = (InterfaceC2402q2) m3847O;
        }
        AbstractC2397p1 abstractC2397p1 = c2401q1.f13529a;
        InterfaceC2402q2 m3897c = abstractC2397p1.m3897c(c2401q1, interfaceC2402q2);
        boolean equals = m3897c.equals(interfaceC2402q2);
        if (!equals) {
            c2395p.m3877j0(m3897c);
        }
        boolean z8 = true;
        if (c2395p.f13485S) {
            if (c2401q1.f13534f || !((C3177h) m3882m).containsKey(abstractC2397p1)) {
                m3882m = ((C3177h) m3882m).m4869c(abstractC2397p1, m3897c);
            }
            c2395p.f13476J = true;
        } else {
            C2429z1 c2429z1 = c2395p.f13473G;
            Object m3989b = c2429z1.m3989b(c2429z1.f13638b, c2429z1.f13643g);
            AbstractC3367j.m5098c(m3989b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC2385m1 interfaceC2385m1 = (InterfaceC2385m1) m3989b;
            if ((c2395p.m3836D() && equals) || (!c2401q1.f13534f && ((C3177h) m3882m).containsKey(abstractC2397p1))) {
                if ((equals && !c2395p.f13510w) || !c2395p.f13510w) {
                    m3882m = interfaceC2385m1;
                }
            } else {
                m3882m = ((C3177h) m3882m).m4869c(abstractC2397p1, m3897c);
            }
            if (c2395p.f13512y || interfaceC2385m1 != m3882m) {
                z7 = true;
                if (z7 && !c2395p.f13485S) {
                    c2395p.m3845M(m3882m);
                }
                c2388n0.m3823c(c2395p.f13510w ? 1 : 0);
                c2395p.f13510w = z7;
                c2395p.f13477K = m3882m;
                c2395p.m3853V(202, 0, AbstractC2399q.f13523c, m3882m);
                interfaceC3281e.mo22d(c2395p, Integer.valueOf((i7 >> 3) & 14));
                c2395p.m3888r(false);
                c2395p.m3888r(false);
                if (c2388n0.m3822b() == 0) {
                    z8 = false;
                }
                c2395p.f13510w = z8;
                c2395p.f13477K = null;
                m3891u = c2395p.m3891u();
                if (m3891u == null) {
                    m3891u.f13542d = new C1137o3(i7, 3, c2401q1, interfaceC3281e);
                    return;
                }
                return;
            }
        }
        z7 = false;
        if (z7) {
            c2395p.m3845M(m3882m);
        }
        c2388n0.m3823c(c2395p.f13510w ? 1 : 0);
        c2395p.f13510w = z7;
        c2395p.f13477K = m3882m;
        c2395p.m3853V(202, 0, AbstractC2399q.f13523c, m3882m);
        interfaceC3281e.mo22d(c2395p, Integer.valueOf((i7 >> 3) & 14));
        c2395p.m3888r(false);
        c2395p.m3888r(false);
        if (c2388n0.m3822b() == 0) {
        }
        c2395p.f13510w = z8;
        c2395p.f13477K = null;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l0.m1, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3960b(C2401q1[] c2401q1Arr, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        C3177h m3875i0;
        boolean z7;
        C2405r1 m3891u;
        c2395p.m3859a0(415205898);
        C2388n0 c2388n0 = c2395p.f13511x;
        InterfaceC2385m1 m3882m = c2395p.m3882m();
        c2395p.m3855X(201, AbstractC2399q.f13522b);
        boolean z8 = true;
        if (c2395p.f13485S) {
            m3875i0 = c2395p.m3875i0(m3882m, m3958G(c2401q1Arr, m3882m, C3177h.f15889h));
            c2395p.f13476J = true;
        } else {
            C2429z1 c2429z1 = c2395p.f13473G;
            Object m3995h = c2429z1.m3995h(c2429z1.f13643g, 0);
            AbstractC3367j.m5098c(m3995h, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r22 = (InterfaceC2385m1) m3995h;
            C2429z1 c2429z12 = c2395p.f13473G;
            Object m3995h2 = c2429z12.m3995h(c2429z12.f13643g, 1);
            AbstractC3367j.m5098c(m3995h2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC2385m1 interfaceC2385m1 = (InterfaceC2385m1) m3995h2;
            C3177h m3958G = m3958G(c2401q1Arr, m3882m, interfaceC2385m1);
            if (c2395p.m3836D() && !c2395p.f13512y && interfaceC2385m1.equals(m3958G)) {
                c2395p.f13499l = c2395p.f13473G.m4006s() + c2395p.f13499l;
                m3875i0 = r22;
            } else {
                m3875i0 = c2395p.m3875i0(m3882m, m3958G);
                if (c2395p.f13512y || !AbstractC3367j.m5096a(m3875i0, r22)) {
                    z7 = true;
                    if (z7 && !c2395p.f13485S) {
                        c2395p.m3845M(m3875i0);
                    }
                    c2388n0.m3823c(c2395p.f13510w ? 1 : 0);
                    c2395p.f13510w = z7;
                    c2395p.f13477K = m3875i0;
                    c2395p.m3853V(202, 0, AbstractC2399q.f13523c, m3875i0);
                    interfaceC3281e.mo22d(c2395p, Integer.valueOf((i7 >> 3) & 14));
                    c2395p.m3888r(false);
                    c2395p.m3888r(false);
                    if (c2388n0.m3822b() == 0) {
                        z8 = false;
                    }
                    c2395p.f13510w = z8;
                    c2395p.f13477K = null;
                    m3891u = c2395p.m3891u();
                    if (m3891u == null) {
                        m3891u.f13542d = new C1137o3(i7, 4, c2401q1Arr, interfaceC3281e);
                        return;
                    }
                    return;
                }
            }
        }
        z7 = false;
        if (z7) {
            c2395p.m3845M(m3875i0);
        }
        c2388n0.m3823c(c2395p.f13510w ? 1 : 0);
        c2395p.f13510w = z7;
        c2395p.f13477K = m3875i0;
        c2395p.m3853V(202, 0, AbstractC2399q.f13523c, m3875i0);
        interfaceC3281e.mo22d(c2395p, Integer.valueOf((i7 >> 3) & 14));
        c2395p.m3888r(false);
        c2395p.m3888r(false);
        if (c2388n0.m3822b() == 0) {
        }
        c2395p.f13510w = z8;
        c2395p.f13477K = null;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: c */
    public static final void m3961c(Object obj, Object obj2, InterfaceC3279c interfaceC3279c, C2395p c2395p) {
        boolean m3870g = c2395p.m3870g(obj) | c2395p.m3870g(obj2);
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            m3847O = new C2356f0(interfaceC3279c);
            c2395p.m3877j0(m3847O);
        }
    }

    /* renamed from: d */
    public static final void m3962d(Object obj, InterfaceC3279c interfaceC3279c, C2395p c2395p) {
        boolean m3870g = c2395p.m3870g(obj);
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            m3847O = new C2356f0(interfaceC3279c);
            c2395p.m3877j0(m3847O);
        }
    }

    /* renamed from: e */
    public static final void m3963e(Object obj, Object obj2, Object obj3, InterfaceC3281e interfaceC3281e, C2395p c2395p) {
        InterfaceC2318h interfaceC2318h = c2395p.f13484R;
        boolean m3870g = c2395p.m3870g(obj) | c2395p.m3870g(obj2) | c2395p.m3870g(obj3);
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            m3847O = new C2407s0(interfaceC2318h, interfaceC3281e);
            c2395p.m3877j0(m3847O);
        }
    }

    /* renamed from: f */
    public static final void m3964f(Object obj, Object obj2, InterfaceC3281e interfaceC3281e, C2395p c2395p) {
        InterfaceC2318h interfaceC2318h = c2395p.f13484R;
        boolean m3870g = c2395p.m3870g(obj) | c2395p.m3870g(obj2);
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            m3847O = new C2407s0(interfaceC2318h, interfaceC3281e);
            c2395p.m3877j0(m3847O);
        }
    }

    /* renamed from: g */
    public static final void m3965g(Object obj, C2395p c2395p, InterfaceC3281e interfaceC3281e) {
        InterfaceC2318h interfaceC2318h = c2395p.f13484R;
        boolean m3870g = c2395p.m3870g(obj);
        Object m3847O = c2395p.m3847O();
        if (m3870g || m3847O == C2375k.f13421a) {
            m3847O = new C2407s0(interfaceC2318h, interfaceC3281e);
            c2395p.m3877j0(m3847O);
        }
    }

    /* renamed from: h */
    public static final void m3966h(Object[] objArr, InterfaceC3281e interfaceC3281e, C2395p c2395p) {
        InterfaceC2318h interfaceC2318h = c2395p.f13484R;
        boolean z7 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z7 |= c2395p.m3870g(obj);
        }
        Object m3847O = c2395p.m3847O();
        if (!z7 && m3847O != C2375k.f13421a) {
            return;
        }
        c2395p.m3877j0(new C2407s0(interfaceC2318h, interfaceC3281e));
    }

    /* renamed from: i */
    public static final void m3967i(InterfaceC3277a interfaceC3277a, C2395p c2395p) {
        C2530j0 c2530j0 = c2395p.f13479M.f13862b.f13859a;
        c2530j0.m4077T(C2512a0.f13860d);
        AbstractC2072e.m3344v(c2530j0, 0, interfaceC3277a);
    }

    /* renamed from: j */
    public static final void m3968j(C2220v c2220v, int i7) {
        if (c2220v.f12755b != 0 && (c2220v.m3645c(0) == i7 || c2220v.m3645c(c2220v.f12755b - 1) == i7)) {
            return;
        }
        int i8 = c2220v.f12755b;
        c2220v.m3643a(i7);
        while (i8 > 0) {
            int i9 = ((i8 + 1) >>> 1) - 1;
            int m3645c = c2220v.m3645c(i9);
            if (i7 <= m3645c) {
                break;
            }
            c2220v.m3647e(i8, m3645c);
            i8 = i9;
        }
        c2220v.m3647e(i8, i7);
    }

    /* renamed from: k */
    public static void m3969k(C2350d2 c2350d2, List list, C2415v c2415v) {
        Object obj;
        C2405r1 c2405r1;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                int m3767c = c2350d2.m3767c((C2335a) list.get(i7));
                int m3757M = c2350d2.m3757M(c2350d2.f13360b, c2350d2.m3781r(m3767c));
                if (m3757M < c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(m3767c + 1))) {
                    obj = c2350d2.f13361c[c2350d2.m3772h(m3757M)];
                } else {
                    obj = C2375k.f13421a;
                }
                if (obj instanceof C2405r1) {
                    c2405r1 = (C2405r1) obj;
                } else {
                    c2405r1 = null;
                }
                if (c2405r1 != null) {
                    c2405r1.f13539a = c2415v;
                }
            }
        }
    }

    /* renamed from: m */
    public static final InterfaceC2425y0 m3970m(InterfaceC1697a0 interfaceC1697a0, C2395p c2395p) {
        Object value = interfaceC1697a0.getValue();
        Object obj = C2319i.f13273e;
        boolean m3874i = c2395p.m3874i(obj) | c2395p.m3874i(interfaceC1697a0);
        Object m3847O = c2395p.m3847O();
        InterfaceC2313c interfaceC2313c = null;
        Object obj2 = C2375k.f13421a;
        if (m3874i || m3847O == obj2) {
            m3847O = new C0070r0(obj, interfaceC1697a0, interfaceC2313c, 20);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3847O;
        Object m3847O2 = c2395p.m3847O();
        if (m3847O2 == obj2) {
            m3847O2 = m3980x(value);
            c2395p.m3877j0(m3847O2);
        }
        InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O2;
        boolean m3874i2 = c2395p.m3874i(interfaceC3281e);
        Object m3847O3 = c2395p.m3847O();
        if (m3874i2 || m3847O3 == obj2) {
            m3847O3 = new C2378k2(interfaceC3281e, interfaceC2425y0, interfaceC2313c, 1);
            c2395p.m3877j0(m3847O3);
        }
        m3964f(interfaceC1697a0, obj, (InterfaceC3281e) m3847O3, c2395p);
        return interfaceC2425y0;
    }

    /* renamed from: n */
    public static final InterfaceC0516a0 m3971n(C2395p c2395p) {
        return new C2426y1(c2395p.f13484R);
    }

    /* renamed from: o */
    public static final C2705e m3972o() {
        C0031h1 c0031h1 = AbstractC2374j2.f13420b;
        C2705e c2705e = (C2705e) c0031h1.m105t();
        if (c2705e == null) {
            C2705e c2705e2 = new C2705e(new C2391o[0]);
            c0031h1.m82F(c2705e2);
            return c2705e2;
        }
        return c2705e;
    }

    /* renamed from: p */
    public static final C2352e0 m3973p(InterfaceC2370i2 interfaceC2370i2, InterfaceC3277a interfaceC3277a) {
        C0031h1 c0031h1 = AbstractC2374j2.f13419a;
        return new C2352e0(interfaceC2370i2, interfaceC3277a);
    }

    /* renamed from: q */
    public static final C2352e0 m3974q(InterfaceC3277a interfaceC3277a) {
        C0031h1 c0031h1 = AbstractC2374j2.f13419a;
        return new C2352e0(null, interfaceC3277a);
    }

    /* renamed from: r */
    public static final int m3975r(C2395p c2395p) {
        c2395p.getClass();
        return Long.hashCode(c2395p.f13486T);
    }

    /* renamed from: s */
    public static final InterfaceC2416v0 m3976s(InterfaceC2318h interfaceC2318h) {
        InterfaceC2416v0 interfaceC2416v0 = (InterfaceC2416v0) interfaceC2318h.mo853h(C2413u0.f13571f);
        if (interfaceC2416v0 != null) {
            return interfaceC2416v0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static List m3977u(C2350d2 c2350d2, int i7, C2350d2 c2350d22, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        C1813u c1813u;
        boolean z11;
        boolean z12;
        int i8;
        int i9;
        int i10;
        int m3783t = c2350d2.m3783t(i7);
        int i11 = i7 + m3783t;
        int m3770f = c2350d2.m3770f(i7);
        int m3770f2 = c2350d2.m3770f(i11);
        int i12 = m3770f2 - m3770f;
        if (i7 >= 0 && (c2350d2.f13360b[(c2350d2.m3781r(i7) * 5) + 1] & 201326592) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c2350d22.m3785v(m3783t);
        c2350d22.m3786w(i12, c2350d22.f13378t);
        if (c2350d2.f13365g < i11) {
            c2350d2.m3745A(i11);
        }
        if (c2350d2.f13369k < m3770f2) {
            c2350d2.m3746B(m3770f2, i11);
        }
        int[] iArr = c2350d22.f13360b;
        int i13 = c2350d22.f13378t;
        int i14 = i13 * 5;
        AbstractC1804l.m3015H(c2350d2.f13360b, iArr, i14, i7 * 5, i11 * 5);
        Object[] objArr = c2350d22.f13361c;
        int i15 = c2350d22.f13367i;
        System.arraycopy(c2350d2.f13361c, m3770f, objArr, i15, i12);
        int i16 = c2350d22.f13380v;
        iArr[i14 + 2] = i16;
        int i17 = i13 - i7;
        int i18 = i13 + m3783t;
        int m3771g = i15 - c2350d22.m3771g(iArr, i13);
        int i19 = c2350d22.f13371m;
        int i20 = c2350d22.f13370l;
        int length = objArr.length;
        boolean z13 = z10;
        int i21 = i19;
        int i22 = i13;
        while (i22 < i18) {
            if (i22 != i13) {
                int i23 = (i22 * 5) + 2;
                iArr[i23] = iArr[i23] + i17;
            }
            int[] iArr2 = iArr;
            int m3771g2 = c2350d22.m3771g(iArr, i22) + m3771g;
            if (i21 < i22) {
                i9 = i13;
                i10 = 0;
            } else {
                i9 = i13;
                i10 = c2350d22.f13369k;
            }
            iArr2[(i22 * 5) + 4] = C2350d2.m3743i(m3771g2, i10, i20, length);
            if (i22 == i21) {
                i21++;
            }
            i22++;
            i13 = i9;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c2350d22.f13371m = i21;
        int m3732b = AbstractC2346c2.m3732b(c2350d2.f13362d, i7, c2350d2.m3779p());
        int m3732b2 = AbstractC2346c2.m3732b(c2350d2.f13362d, i11, c2350d2.m3779p());
        if (m3732b < m3732b2) {
            ArrayList arrayList = c2350d2.f13362d;
            ArrayList arrayList2 = new ArrayList(m3732b2 - m3732b);
            for (int i24 = m3732b; i24 < m3732b2; i24++) {
                C2335a c2335a = (C2335a) arrayList.get(i24);
                c2335a.f13325a += i17;
                arrayList2.add(c2335a);
            }
            c2350d22.f13362d.addAll(AbstractC2346c2.m3732b(c2350d22.f13362d, c2350d22.f13378t, c2350d22.m3779p()), arrayList2);
            arrayList.subList(m3732b, m3732b2).clear();
            c1813u = arrayList2;
        } else {
            c1813u = C1813u.f10860e;
        }
        if (!c1813u.isEmpty()) {
            HashMap hashMap = c2350d2.f13363e;
            HashMap hashMap2 = c2350d22.f13363e;
            if (hashMap != null && hashMap2 != null) {
                int size = c1813u.size();
                for (int i25 = 0; i25 < size; i25++) {
                }
            }
        }
        int i26 = c2350d22.f13380v;
        c2350d22.m3758N(i16);
        int m3748D = c2350d2.m3748D(c2350d2.f13360b, i7);
        if (!z9) {
            z11 = false;
        } else if (z7) {
            if (m3748D >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                c2350d2.m3759O();
                c2350d2.m3765a(m3748D - c2350d2.f13378t);
                c2350d2.m3759O();
            }
            c2350d2.m3765a(i7 - c2350d2.f13378t);
            boolean m3751G = c2350d2.m3751G();
            if (z12) {
                c2350d2.m3756L();
                c2350d2.m3773j();
                c2350d2.m3756L();
                c2350d2.m3773j();
            }
            z11 = m3751G;
        } else {
            boolean m3752H = c2350d2.m3752H(i7, m3783t);
            c2350d2.m3753I(m3770f, i12, i7 - 1);
            z11 = m3752H;
        }
        if (z11) {
            AbstractC2399q.m3900c("Unexpectedly removed anchors");
        }
        int i27 = c2350d22.f13373o;
        int i28 = iArr3[i14 + 1];
        if ((1073741824 & i28) != 0) {
            i8 = 1;
        } else {
            i8 = i28 & 67108863;
        }
        c2350d22.f13373o = i27 + i8;
        if (z8) {
            c2350d22.f13378t = i18;
            c2350d22.f13367i = i15 + i12;
        }
        if (z13) {
            c2350d22.m3763S(i16);
        }
        return c1813u;
    }

    /* renamed from: v */
    public static final C3469p m3978v() {
        return new C3469p();
    }

    /* renamed from: w */
    public static final C3472s m3979w() {
        return new C3472s();
    }

    /* renamed from: x */
    public static C2361g1 m3980x(Object obj) {
        return new C2361g1(obj, C2413u0.f13575j);
    }

    /* renamed from: y */
    public static final Object m3981y(InterfaceC2385m1 interfaceC2385m1, AbstractC2397p1 abstractC2397p1) {
        AbstractC3367j.m5098c(abstractC2397p1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C3177h c3177h = (C3177h) interfaceC2385m1;
        Object obj = c3177h.get(abstractC2397p1);
        if (obj == null) {
            obj = abstractC2397p1.mo3717b();
        }
        return ((InterfaceC2402q2) obj).mo3724a(c3177h);
    }

    /* renamed from: z */
    public static final C2387n m3982z(C2395p c2395p) {
        C2383m c2383m;
        C2395p c2395p2;
        c2395p.m3855X(206, AbstractC2399q.f13525e);
        if (c2395p.f13485S) {
            C2350d2.m3744y(c2395p.f13475I);
        }
        Object m3839G = c2395p.m3839G();
        if (m3839G instanceof C2383m) {
            c2383m = (C2383m) m3839G;
        } else {
            c2383m = null;
        }
        if (c2383m == null) {
            c2395p2 = c2395p;
            c2383m = new C2383m(new C2387n(c2395p2, c2395p.f13486T, c2395p.f13504q, c2395p.f13469C, c2395p.f13495h.f13619v));
            c2395p2.m3879k0(c2383m);
        } else {
            c2395p2 = c2395p;
        }
        C2387n c2387n = c2383m.f13446e;
        c2387n.f13456f.setValue(c2395p2.m3882m());
        c2395p2.m3888r(false);
        return c2387n;
    }

    /* renamed from: B */
    public abstract boolean m3983B(C0625q c0625q);

    /* renamed from: l */
    public abstract void m3984l();

    /* renamed from: t */
    public abstract void m3985t();
}
