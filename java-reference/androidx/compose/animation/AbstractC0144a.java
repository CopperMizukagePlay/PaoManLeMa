package androidx.compose.animation;

import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.layout.AbstractC0172a;
import p001a0.C0060o2;
import p001a0.C0070r0;
import p053g5.C1694m;
import p063i0.C1882e3;
import p063i0.C1922j;
import p063i0.C2013u2;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2378k2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p092m.AbstractC2501q;
import p092m.C2485c;
import p092m.C2488d0;
import p092m.C2489e;
import p092m.C2491g;
import p092m.C2492h;
import p092m.C2493i;
import p092m.C2497m;
import p092m.C2499o;
import p092m.C2506v;
import p092m.C2507w;
import p092m.EnumC2496l;
import p100n.AbstractC2658k1;
import p100n.AbstractC2667n1;
import p100n.C2631b1;
import p100n.C2643f1;
import p100n.C2649h1;
import p100n.C2657k0;
import p100n.C2664m1;
import p100n.C2675q0;
import p144t.C3154s;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.animation.a */
/* loaded from: classes.dex */
public abstract class AbstractC0144a {
    /* JADX WARN: Removed duplicated region for block: B:57:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m314a(C2643f1 c2643f1, InterfaceC3810r interfaceC3810r, C2506v c2506v, C2507w c2507w, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        boolean z8;
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        C2631b1 c2631b1;
        boolean z12;
        C2631b1 c2631b12;
        C2631b1 m4262a;
        C3173d c3173d2;
        boolean z13;
        C2405r1 m3891u;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C2361g1 c2361g1 = c2643f1.f14308d;
        Object obj = C2491g.f13799g;
        c2395p.m3859a0(-891967166);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2643f1)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i8 = i17 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(obj)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i8 |= i16;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i8 |= i15;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c2506v)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i8 |= i14;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3870g(c2507w)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i8 |= i13;
        }
        int i18 = 196608 & i7;
        C2492h c2492h = C2492h.f13805f;
        if (i18 == 0) {
            if (c2395p.m3874i(c2492h)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i8 |= i12;
        }
        int i19 = 1572864 | i8;
        if ((12582912 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i19 |= i11;
        }
        if ((4793491 & i19) == 4793490 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Boolean bool = (Boolean) c2361g1.getValue();
            bool.getClass();
            if (!bool.booleanValue()) {
                Boolean bool2 = (Boolean) c2643f1.m4238c();
                bool2.getClass();
                if (!bool2.booleanValue() && !c2643f1.m4242g() && !c2643f1.m4239d()) {
                    c2395p.m3857Z(1790262234);
                    c2395p.m3888r(false);
                }
            }
            c2395p.m3857Z(1787977937);
            int i20 = i19 & 14;
            int i21 = i20 | 48;
            int i22 = i21 & 14;
            if (((i22 ^ 6) > 4 && c2395p.m3870g(c2643f1)) || (i21 & 6) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object m3847O = c2395p.m3847O();
            Object obj2 = C2375k.f13421a;
            if (z7 || m3847O == obj2) {
                m3847O = c2643f1.m4238c();
                c2395p.m3877j0(m3847O);
            }
            if (c2643f1.m4242g()) {
                m3847O = c2643f1.m4238c();
            }
            c2395p.m3857Z(-466616829);
            EnumC2496l m317d = m317d(c2643f1, m3847O, c2395p);
            c2395p.m3888r(false);
            Object value = c2361g1.getValue();
            c2395p.m3857Z(-466616829);
            EnumC2496l m317d2 = m317d(c2643f1, value, c2395p);
            c2395p.m3888r(false);
            int i23 = i22 | 3072;
            int i24 = AbstractC2658k1.f14347a;
            int i25 = (i23 & 14) ^ 6;
            if ((i25 > 4 && c2395p.m3870g(c2643f1)) || (i23 & 6) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object m3847O2 = c2395p.m3847O();
            if (!z8 && m3847O2 != obj2) {
                i9 = i19;
                i10 = i23;
            } else {
                i9 = i19;
                i10 = i23;
                m3847O2 = new C2643f1(new C2657k0(m317d), c2643f1, AbstractC2487d.m4046j(new StringBuilder(), c2643f1.f14307c, " > EnterExitTransition"));
                c2395p.m3877j0(m3847O2);
            }
            C2643f1 c2643f12 = (C2643f1) m3847O2;
            if ((i25 > 4 && c2395p.m3870g(c2643f1)) || (i10 & 6) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean m3870g = z9 | c2395p.m3870g(c2643f12);
            Object m3847O3 = c2395p.m3847O();
            if (m3870g || m3847O3 == obj2) {
                m3847O3 = new C2649h1(0, c2643f1, c2643f12);
                c2395p.m3877j0(m3847O3);
            }
            AbstractC2418w.m3962d(c2643f12, (InterfaceC3279c) m3847O3, c2395p);
            if (c2643f1.m4242g()) {
                c2643f12.m4246k(m317d, m317d2);
            } else {
                c2643f12.m4247l(m317d2);
                c2643f12.f14315k.setValue(Boolean.FALSE);
            }
            Object m3953A = AbstractC2418w.m3953A(c2492h, c2395p);
            Object m4238c = c2643f12.m4238c();
            C2361g1 c2361g12 = c2643f12.f14308d;
            Object mo22d = c2492h.mo22d(m4238c, c2361g12.getValue());
            boolean m3870g2 = c2395p.m3870g(c2643f12) | c2395p.m3870g(m3953A);
            Object m3847O4 = c2395p.m3847O();
            if (m3870g2 || m3847O4 == obj2) {
                m3847O4 = new C0070r0(c2643f12, m3953A, (InterfaceC2313c) null, 21);
                c2395p.m3877j0(m3847O4);
            }
            InterfaceC3281e interfaceC3281e = (InterfaceC3281e) m3847O4;
            Object m3847O5 = c2395p.m3847O();
            if (m3847O5 == obj2) {
                m3847O5 = AbstractC2418w.m3980x(mo22d);
                c2395p.m3877j0(m3847O5);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O5;
            boolean m3874i = c2395p.m3874i(interfaceC3281e);
            Object m3847O6 = c2395p.m3847O();
            if (m3874i || m3847O6 == obj2) {
                m3847O6 = new C2378k2(interfaceC3281e, interfaceC2425y0, null, 0);
                c2395p.m3877j0(m3847O6);
            }
            AbstractC2418w.m3965g(C1694m.f10482a, c2395p, (InterfaceC3281e) m3847O6);
            Object m4238c2 = c2643f12.m4238c();
            EnumC2496l enumC2496l = EnumC2496l.f13813g;
            if (m4238c2 == enumC2496l && c2361g12.getValue() == enumC2496l && ((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                c2395p.m3857Z(1790256282);
                z13 = false;
                c2395p.m3888r(false);
                c3173d2 = c3173d;
            } else {
                c2395p.m3857Z(1788869559);
                if (i20 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object m3847O7 = c2395p.m3847O();
                if (z10 || m3847O7 == obj2) {
                    m3847O7 = new C2493i();
                    c2395p.m3877j0(m3847O7);
                }
                C2493i c2493i = (C2493i) m3847O7;
                C2675q0 c2675q0 = AbstractC2501q.f13825a;
                boolean m3870g3 = c2395p.m3870g(c2643f12);
                Object m3847O8 = c2395p.m3847O();
                if (m3870g3 || m3847O8 == obj2) {
                    m3847O8 = AbstractC2418w.m3980x(c2506v);
                    c2395p.m3877j0(m3847O8);
                }
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O8;
                Object m4238c3 = c2643f12.m4238c();
                Object value2 = c2361g12.getValue();
                EnumC2496l enumC2496l2 = EnumC2496l.f13812f;
                if (m4238c3 == value2 && c2643f12.m4238c() == enumC2496l2) {
                    if (c2643f12.m4242g()) {
                        interfaceC2425y02.setValue(c2506v);
                    } else {
                        interfaceC2425y02.setValue(C2506v.f13848b);
                    }
                } else if (c2361g12.getValue() == enumC2496l2) {
                    interfaceC2425y02.setValue(((C2506v) interfaceC2425y02.getValue()).m4063a(c2506v));
                }
                C2506v c2506v2 = (C2506v) interfaceC2425y02.getValue();
                boolean m3870g4 = c2395p.m3870g(c2643f12);
                Object m3847O9 = c2395p.m3847O();
                if (m3870g4 || m3847O9 == obj2) {
                    m3847O9 = AbstractC2418w.m3980x(c2507w);
                    c2395p.m3877j0(m3847O9);
                }
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) m3847O9;
                if (c2643f12.m4238c() == c2361g12.getValue() && c2643f12.m4238c() == enumC2496l2) {
                    if (c2643f12.m4242g()) {
                        interfaceC2425y03.setValue(c2507w);
                    } else {
                        interfaceC2425y03.setValue(C2507w.f13850b);
                    }
                } else if (c2361g12.getValue() != enumC2496l2) {
                    interfaceC2425y03.setValue(((C2507w) interfaceC2425y03.getValue()).m4064a(c2507w));
                }
                C2507w c2507w2 = (C2507w) interfaceC2425y03.getValue();
                C2488d0 c2488d0 = c2506v2.f13849a;
                C2488d0 c2488d02 = c2507w2.f13852a;
                if (c2488d0.f13788b == null && c2488d02.f13788b == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                c2395p.m3857Z(-821278096);
                c2395p.m3888r(false);
                if (z11) {
                    c2395p.m3857Z(-821202177);
                    C2664m1 c2664m1 = AbstractC2667n1.f14372h;
                    Object m3847O10 = c2395p.m3847O();
                    if (m3847O10 == obj2) {
                        m3847O10 = "Built-in shrink/expand";
                        c2395p.m3877j0("Built-in shrink/expand");
                    }
                    C2631b1 m4262a2 = AbstractC2658k1.m4262a(c2643f12, c2664m1, (String) m3847O10, c2395p);
                    c2395p.m3888r(false);
                    c2631b1 = m4262a2;
                } else {
                    c2395p.m3857Z(-821099041);
                    c2395p.m3888r(false);
                    c2631b1 = null;
                }
                if (z11) {
                    c2395p.m3857Z(-821034002);
                    C2664m1 c2664m12 = AbstractC2667n1.f14371g;
                    Object m3847O11 = c2395p.m3847O();
                    if (m3847O11 == obj2) {
                        m3847O11 = "Built-in InterruptionHandlingOffset";
                        c2395p.m3877j0("Built-in InterruptionHandlingOffset");
                    }
                    C2631b1 m4262a3 = AbstractC2658k1.m4262a(c2643f12, c2664m12, (String) m3847O11, c2395p);
                    z12 = false;
                    c2395p.m3888r(false);
                    c2631b12 = m4262a3;
                } else {
                    z12 = false;
                    c2395p.m3857Z(-820883777);
                    c2395p.m3888r(false);
                    c2631b12 = null;
                }
                boolean z14 = !z11;
                if (c2488d0.f13787a == null && c2488d02.f13787a == null) {
                    c2395p.m3857Z(-675252433);
                    c2395p.m3888r(z12);
                    m4262a = null;
                } else {
                    c2395p.m3857Z(-675389204);
                    C2664m1 c2664m13 = AbstractC2667n1.f14365a;
                    Object m3847O12 = c2395p.m3847O();
                    if (m3847O12 == obj2) {
                        m3847O12 = "Built-in alpha";
                        c2395p.m3877j0("Built-in alpha");
                    }
                    m4262a = AbstractC2658k1.m4262a(c2643f12, c2664m13, (String) m3847O12, c2395p);
                    z12 = false;
                    c2395p.m3888r(false);
                }
                c2395p.m3857Z(-675057009);
                c2395p.m3888r(z12);
                c2395p.m3857Z(-674835793);
                c2395p.m3888r(z12);
                boolean m3874i2 = c2395p.m3874i(m4262a) | c2395p.m3870g(c2506v2) | c2395p.m3870g(c2507w2) | c2395p.m3874i(null) | c2395p.m3870g(c2643f12) | c2395p.m3874i(null);
                Object m3847O13 = c2395p.m3847O();
                if (m3874i2 || m3847O13 == obj2) {
                    m3847O13 = new C2497m(m4262a, c2643f12, c2506v2, c2507w2);
                    c2395p.m3877j0(m3847O13);
                }
                C2497m c2497m = (C2497m) m3847O13;
                boolean m3872h = c2395p.m3872h(z14);
                C2499o c2499o = C2499o.f13822f;
                boolean m3870g5 = m3872h | c2395p.m3870g(c2499o);
                Object m3847O14 = c2395p.m3847O();
                if (m3870g5 || m3847O14 == obj2) {
                    m3847O14 = new C1882e3(1, c2499o, z14);
                    c2395p.m3877j0(m3847O14);
                }
                C3807o c3807o = C3807o.f17991a;
                InterfaceC3810r mo5829e = AbstractC0168a.m384a(c3807o, (InterfaceC3279c) m3847O14).mo5829e(new EnterExitTransitionElement(c2643f12, c2631b1, c2631b12, c2506v2, c2507w2, c2499o, c2497m));
                c2395p.m3857Z(1581766416);
                c2395p.m3888r(false);
                InterfaceC3810r mo5829e2 = interfaceC3810r.mo5829e(mo5829e.mo5829e(c3807o));
                Object m3847O15 = c2395p.m3847O();
                if (m3847O15 == obj2) {
                    m3847O15 = new C2485c(c2493i);
                    c2395p.m3877j0(m3847O15);
                }
                C2485c c2485c = (C2485c) m3847O15;
                int hashCode = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m = c2395p.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e2);
                InterfaceC3510j.f16935d.getClass();
                InterfaceC3277a interfaceC3277a = C3507i.f16928b;
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(interfaceC3277a);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(c2485c, c2395p, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                C3504h c3504h = C3507i.f16932f;
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                    AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                c3173d2 = c3173d;
                c3173d2.mo24c(c2493i, c2395p, Integer.valueOf((i9 >> 18) & 112));
                c2395p.m3888r(true);
                z13 = false;
                c2395p.m3888r(false);
            }
            c2395p.m3888r(z13);
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C2489e(c2643f1, interfaceC3810r, c2506v, c2507w, c3173d2, i7);
                return;
            }
            return;
        }
        c3173d2 = c3173d;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: b */
    public static final void m315b(C3154s c3154s, boolean z7, InterfaceC3810r interfaceC3810r, C2506v c2506v, C2507w c2507w, String str, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(1766503102);
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i8 = i12 | i7;
        } else {
            i8 = i7;
        }
        int i13 = i8 | 384;
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c2506v)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i13 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3870g(c2507w)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i13 |= i10;
        }
        int i14 = i13 | 196608;
        if ((1572864 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i14 |= i9;
        }
        if ((599185 & i14) == 599184 && c2395p.m3836D()) {
            c2395p.m3852U();
            str2 = str;
        } else {
            int i15 = i14 >> 3;
            str2 = "AnimatedVisibility";
            m316c(AbstractC2658k1.m4264c(Boolean.valueOf(z7), "AnimatedVisibility", c2395p, (i15 & 14) | ((i14 >> 12) & 112), 0), c2506v, c2507w, c3173d, c2395p, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i15 & 458752));
            interfaceC3810r = C3807o.f17991a;
        }
        InterfaceC3810r interfaceC3810r2 = interfaceC3810r;
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2013u2(c3154s, z7, interfaceC3810r2, c2506v, c2507w, str2, c3173d, i7);
        }
    }

    /* renamed from: c */
    public static final void m316c(C2643f1 c2643f1, C2506v c2506v, C2507w c2507w, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        C2507w c2507w2;
        C3173d c3173d2;
        boolean z7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj = C2491g.f13799g;
        c2395p.m3859a0(429978603);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c2643f1)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(obj)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        int i15 = i7 & 384;
        C3807o c3807o = C3807o.f17991a;
        if (i15 == 0) {
            if (c2395p.m3870g(c3807o)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c2506v)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            c2507w2 = c2507w;
            if (c2395p.m3870g(c2507w2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        } else {
            c2507w2 = c2507w;
        }
        if ((i7 & 196608) == 0) {
            c3173d2 = c3173d;
            if (c2395p.m3874i(c3173d2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        } else {
            c3173d2 = c3173d;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i16 = i8 & 112;
            boolean z8 = false;
            if (i16 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i17 = i8 & 14;
            if (i17 == 4) {
                z8 = true;
            }
            boolean z9 = z7 | z8;
            Object m3847O = c2395p.m3847O();
            if (z9 || m3847O == C2375k.f13421a) {
                m3847O = new C0060o2(5, c2643f1);
                c2395p.m3877j0(m3847O);
            }
            m314a(c2643f1, AbstractC0172a.m392b(c3807o, (InterfaceC3282f) m3847O), c2506v, c2507w2, c3173d2, c2395p, ((i8 << 6) & 29360128) | i17 | 196608 | i16 | (i8 & 7168) | (57344 & i8));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1922j(c2643f1, c2506v, c2507w, c3173d, i7);
        }
    }

    /* renamed from: d */
    public static final EnumC2496l m317d(C2643f1 c2643f1, Object obj, C2395p c2395p) {
        c2395p.m3853V(-902048200, 0, c2643f1, null);
        boolean m4242g = c2643f1.m4242g();
        EnumC2496l enumC2496l = EnumC2496l.f13811e;
        EnumC2496l enumC2496l2 = EnumC2496l.f13813g;
        EnumC2496l enumC2496l3 = EnumC2496l.f13812f;
        if (m4242g) {
            c2395p.m3857Z(2101296683);
            c2395p.m3888r(false);
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            if (bool.booleanValue()) {
                enumC2496l = enumC2496l3;
            } else {
                Boolean bool2 = (Boolean) c2643f1.m4238c();
                bool2.booleanValue();
                if (bool2.booleanValue()) {
                    enumC2496l = enumC2496l2;
                }
            }
        } else {
            c2395p.m3857Z(2101530516);
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            Boolean bool3 = (Boolean) c2643f1.m4238c();
            bool3.booleanValue();
            if (bool3.booleanValue()) {
                interfaceC2425y0.setValue(Boolean.TRUE);
            }
            Boolean bool4 = (Boolean) obj;
            bool4.booleanValue();
            if (bool4.booleanValue()) {
                enumC2496l = enumC2496l3;
            } else if (((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                enumC2496l = enumC2496l2;
            }
            c2395p.m3888r(false);
        }
        c2395p.m3888r(false);
        return enumC2496l;
    }
}
