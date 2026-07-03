package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.p007ui.layout.AbstractC0172a;
import p027d1.C0467e;
import p028d2.AbstractC0479l;
import p034e0.C0625q;
import p034e0.C0630s0;
import p035e1.C0677s;
import p037e3.C0691e;
import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p078k0.AbstractC2253v;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p100n.AbstractC2638e;
import p100n.AbstractC2667n1;
import p100n.AbstractC2699z;
import p100n.C2642f0;
import p100n.C2648h0;
import p100n.C2651i0;
import p100n.C2654j0;
import p100n.C2664m1;
import p100n.C2686u;
import p107o.C2755l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p170w1.AbstractC3674f1;
import p174w5.AbstractC3784a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p195z5.C3876a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.m4 */
/* loaded from: classes.dex */
public abstract class AbstractC1951m4 {

    /* renamed from: a */
    public static final float f11526a;

    /* renamed from: b */
    public static final InterfaceC3810r f11527b;

    /* renamed from: c */
    public static final float f11528c = 240;

    /* renamed from: d */
    public static final float f11529d;

    /* renamed from: e */
    public static final float f11530e;

    /* renamed from: f */
    public static final C2686u f11531f;

    /* renamed from: g */
    public static final C2686u f11532g;

    /* renamed from: h */
    public static final C2686u f11533h;

    /* renamed from: i */
    public static final C2686u f11534i;

    /* renamed from: j */
    public static final C2686u f11535j;

    static {
        float f7 = 10;
        f11526a = f7;
        f11527b = AbstractC0154b.m339j(AbstractC0479l.m1037a(AbstractC0172a.m392b(C3807o.f17991a, C2043y0.f12163h), true, C1870d0.f11047m), 0.0f, f7, 1);
        float f8 = AbstractC2253v.f13072c;
        f11529d = f8;
        f11530e = AbstractC2253v.f13073d - (f8 * 2);
        f11531f = new C2686u(0.2f, 0.0f, 0.8f, 1.0f);
        f11532g = new C2686u(0.4f, 0.0f, 1.0f, 1.0f);
        f11533h = new C2686u(0.0f, 0.0f, 0.65f, 1.0f);
        f11534i = new C2686u(0.1f, 0.0f, 0.45f, 1.0f);
        f11535j = new C2686u(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3141a(InterfaceC3810r interfaceC3810r, long j6, float f7, long j7, int i7, C2395p c2395p, int i8, int i9) {
        float f8;
        int i10;
        int i11;
        float f9;
        long j8;
        int i12;
        int i13;
        float f10;
        long j9;
        int i14;
        boolean z7;
        boolean m3868f;
        Object m3847O;
        long j10;
        float f11;
        long j11;
        float f12;
        long j12;
        int i15;
        C2405r1 m3891u;
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        c2395p.m3859a0(-115871647);
        int i16 = i8 | 16;
        int i17 = i9 & 4;
        if (i17 != 0) {
            i16 = i8 | 400;
        } else if ((i8 & 384) == 0) {
            f8 = f7;
            if (c2395p.m3864d(f8)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i16 |= i10;
            i11 = i16 | 25600;
            if ((i11 & 9363) != 9362 && c2395p.m3836D()) {
                c2395p.m3852U();
                j11 = j7;
                i15 = i7;
                f12 = f8;
                j12 = j6;
            } else {
                c2395p.m3854W();
                if ((i8 & 1) == 0 && !c2395p.m3834B()) {
                    c2395p.m3852U();
                    i12 = i11 & (-7281);
                    j9 = j6;
                    j8 = j7;
                    f10 = f8;
                    i13 = i7;
                } else {
                    float f13 = AbstractC1874d4.f11066a;
                    float f14 = AbstractC2253v.f13070a;
                    long m3196e = AbstractC2019v0.m3196e(26, c2395p);
                    if (i17 == 0) {
                        f9 = AbstractC1874d4.f11066a;
                    } else {
                        f9 = f8;
                    }
                    j8 = C0677s.f2208f;
                    i12 = i11 & (-7281);
                    i13 = AbstractC1874d4.f11068c;
                    f10 = f9;
                    j9 = m3196e;
                }
                c2395p.m3889s();
                int i18 = i13;
                C1574h c1574h = new C1574h(((InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h)).mo4526y(f10), 0.0f, i18, 0, 26);
                i14 = i12;
                C2648h0 m4230p = AbstractC2638e.m4230p(c2395p);
                C2664m1 c2664m1 = AbstractC2667n1.f14366b;
                C0625q c0625q = AbstractC2699z.f14500d;
                long j13 = j8;
                C2642f0 m4224j = AbstractC2638e.m4224j(m4230p, 0, 5, c2664m1, AbstractC2638e.m4229o(AbstractC2638e.m4232r(6660, 2, c0625q)), c2395p, 33208, 16);
                C2642f0 m4221g = AbstractC2638e.m4221g(m4230p, 286.0f, AbstractC2638e.m4229o(AbstractC2638e.m4232r(1332, 2, c0625q)), c2395p);
                C0691e c0691e = new C0691e(2);
                c0691e.f2244a = 1332;
                C2651i0 m1477b = c0691e.m1477b(valueOf2, 0);
                C2686u c2686u = f11535j;
                m1477b.f14329b = c2686u;
                c0691e.m1477b(valueOf, 666);
                C2642f0 m4221g2 = AbstractC2638e.m4221g(m4230p, 290.0f, AbstractC2638e.m4229o(new C2654j0(c0691e)), c2395p);
                C0691e c0691e2 = new C0691e(2);
                c0691e2.f2244a = 1332;
                c0691e2.m1477b(valueOf2, 666).f14329b = c2686u;
                c0691e2.m1477b(valueOf, c0691e2.f2244a);
                C2642f0 m4221g3 = AbstractC2638e.m4221g(m4230p, 290.0f, AbstractC2638e.m4229o(new C2654j0(c0691e2)), c2395p);
                InterfaceC3810r m353l = AbstractC0155c.m353l(AbstractC0479l.m1037a(interfaceC3810r, true, C2755l.f14704j), f11530e);
                boolean m3868f2 = c2395p.m3868f(j13) | c2395p.m3874i(c1574h) | c2395p.m3870g(m4224j) | c2395p.m3870g(m4221g2) | c2395p.m3870g(m4221g3) | c2395p.m3870g(m4221g);
                if ((i14 & 896) != 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m3868f = z7 | m3868f2 | c2395p.m3868f(j9);
                m3847O = c2395p.m3847O();
                if (!m3868f || m3847O == C2375k.f13421a) {
                    j10 = j9;
                    f11 = f10;
                    Object c1883e4 = new C1883e4(j13, c1574h, m4224j, m4221g2, m4221g3, m4221g, f11, j10);
                    c2395p.m3877j0(c1883e4);
                    m3847O = c1883e4;
                } else {
                    j10 = j9;
                    f11 = f10;
                }
                AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O, m353l);
                j11 = j13;
                f12 = f11;
                j12 = j10;
                i15 = i18;
            }
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new C1892f4(interfaceC3810r, j12, f12, j11, i15, i8, i9);
                return;
            }
            return;
        }
        f8 = f7;
        i11 = i16 | 25600;
        if ((i11 & 9363) != 9362) {
        }
        c2395p.m3854W();
        if ((i8 & 1) == 0) {
        }
        float f132 = AbstractC1874d4.f11066a;
        float f142 = AbstractC2253v.f13070a;
        long m3196e2 = AbstractC2019v0.m3196e(26, c2395p);
        if (i17 == 0) {
        }
        j8 = C0677s.f2208f;
        i12 = i11 & (-7281);
        i13 = AbstractC1874d4.f11068c;
        f10 = f9;
        j9 = m3196e2;
        c2395p.m3889s();
        int i182 = i13;
        C1574h c1574h2 = new C1574h(((InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h)).mo4526y(f10), 0.0f, i182, 0, 26);
        i14 = i12;
        C2648h0 m4230p2 = AbstractC2638e.m4230p(c2395p);
        C2664m1 c2664m12 = AbstractC2667n1.f14366b;
        C0625q c0625q2 = AbstractC2699z.f14500d;
        long j132 = j8;
        C2642f0 m4224j2 = AbstractC2638e.m4224j(m4230p2, 0, 5, c2664m12, AbstractC2638e.m4229o(AbstractC2638e.m4232r(6660, 2, c0625q2)), c2395p, 33208, 16);
        C2642f0 m4221g4 = AbstractC2638e.m4221g(m4230p2, 286.0f, AbstractC2638e.m4229o(AbstractC2638e.m4232r(1332, 2, c0625q2)), c2395p);
        C0691e c0691e3 = new C0691e(2);
        c0691e3.f2244a = 1332;
        C2651i0 m1477b2 = c0691e3.m1477b(valueOf2, 0);
        C2686u c2686u2 = f11535j;
        m1477b2.f14329b = c2686u2;
        c0691e3.m1477b(valueOf, 666);
        C2642f0 m4221g22 = AbstractC2638e.m4221g(m4230p2, 290.0f, AbstractC2638e.m4229o(new C2654j0(c0691e3)), c2395p);
        C0691e c0691e22 = new C0691e(2);
        c0691e22.f2244a = 1332;
        c0691e22.m1477b(valueOf2, 666).f14329b = c2686u2;
        c0691e22.m1477b(valueOf, c0691e22.f2244a);
        C2642f0 m4221g32 = AbstractC2638e.m4221g(m4230p2, 290.0f, AbstractC2638e.m4229o(new C2654j0(c0691e22)), c2395p);
        InterfaceC3810r m353l2 = AbstractC0155c.m353l(AbstractC0479l.m1037a(interfaceC3810r, true, C2755l.f14704j), f11530e);
        boolean m3868f22 = c2395p.m3868f(j132) | c2395p.m3874i(c1574h2) | c2395p.m3870g(m4224j2) | c2395p.m3870g(m4221g22) | c2395p.m3870g(m4221g32) | c2395p.m3870g(m4221g4);
        if ((i14 & 896) != 256) {
        }
        m3868f = z7 | m3868f22 | c2395p.m3868f(j9);
        m3847O = c2395p.m3847O();
        if (!m3868f) {
        }
        j10 = j9;
        f11 = f10;
        Object c1883e42 = new C1883e4(j132, c1574h2, m4224j2, m4221g22, m4221g32, m4221g4, f11, j10);
        c2395p.m3877j0(c1883e42);
        m3847O = c1883e42;
        AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O, m353l2);
        j11 = j132;
        f12 = f11;
        j12 = j10;
        i15 = i182;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: b */
    public static final void m3142b(InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, long j6, long j7, int i7, float f7, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z7;
        boolean z8;
        InterfaceC3279c interfaceC3279c2;
        int i17;
        int i18;
        float f8;
        boolean z9;
        int i19;
        int i20;
        InterfaceC3279c interfaceC3279c3;
        long j8;
        long j9;
        int i21;
        float f9;
        long j10;
        long j11;
        InterfaceC3279c interfaceC3279c4;
        int i22;
        int i23;
        c2395p.m3859a0(-339970038);
        if ((i8 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i8 | i23;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        long j12 = j6;
        if ((i9 & 4) == 0 && c2395p.m3868f(j12)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i24 = i10 | i11;
        long j13 = j7;
        if ((i9 & 8) == 0 && c2395p.m3868f(j13)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i25 = i24 | i12;
        int i26 = i9 & 16;
        if (i26 != 0) {
            i15 = i25 | 24576;
            i13 = i7;
        } else {
            i13 = i7;
            if (c2395p.m3866e(i13)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i15 = i25 | i14;
        }
        int i27 = i15 | 720896;
        if ((i27 & 599187) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
            f9 = f7;
            j11 = j12;
            j10 = j13;
            i21 = i13;
            interfaceC3279c4 = interfaceC3279c;
        } else {
            c2395p.m3854W();
            int i28 = i8 & 1;
            Object obj = C2375k.f13421a;
            int i29 = 1;
            if (i28 != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                if ((i9 & 4) != 0) {
                    i27 &= -897;
                }
                if ((i9 & 8) != 0) {
                    i27 &= -7169;
                }
                i17 = i27 & (-3670017);
                f8 = f7;
                interfaceC3279c2 = interfaceC3279c;
                i18 = i13;
            } else {
                if ((i9 & 4) != 0) {
                    float f10 = AbstractC1874d4.f11066a;
                    float f11 = AbstractC2253v.f13070a;
                    j12 = AbstractC2019v0.m3196e(26, c2395p);
                    i27 &= -897;
                }
                if ((i9 & 8) != 0) {
                    float f12 = AbstractC1874d4.f11066a;
                    float f13 = AbstractC2253v.f13070a;
                    j13 = AbstractC2019v0.m3196e(32, c2395p);
                    i27 &= -7169;
                }
                if (i26 != 0) {
                    i16 = AbstractC1874d4.f11067b;
                } else {
                    i16 = i13;
                }
                float f14 = AbstractC1874d4.f11070e;
                if ((((i27 & 896) ^ 384) > 256 && c2395p.m3868f(j12)) || (i27 & 384) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i27 & 57344) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z10 = z7 | z8;
                Object m3847O = c2395p.m3847O();
                Object obj2 = m3847O;
                if (z10 || m3847O == obj) {
                    Object c1910h4 = new C1910h4(i16, j12);
                    c2395p.m3877j0(c1910h4);
                    obj2 = c1910h4;
                }
                interfaceC3279c2 = (InterfaceC3279c) obj2;
                i17 = i27 & (-3670017);
                i18 = i16;
                f8 = f14;
            }
            c2395p.m3889s();
            if ((i17 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object m3847O2 = c2395p.m3847O();
            Object obj3 = m3847O2;
            if (z9 || m3847O2 == obj) {
                Object c1974p3 = new C1974p3(i29, interfaceC3277a);
                c2395p.m3877j0(c1974p3);
                obj3 = c1974p3;
            }
            InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) obj3;
            InterfaceC3810r mo5829e = interfaceC3810r.mo5829e(f11527b);
            boolean m3870g = c2395p.m3870g(interfaceC3277a2);
            Object m3847O3 = c2395p.m3847O();
            Object obj4 = m3847O3;
            if (m3870g || m3847O3 == obj) {
                Object c0630s0 = new C0630s0(2, interfaceC3277a2);
                c2395p.m3877j0(c0630s0);
                obj4 = c0630s0;
            }
            InterfaceC3810r m354m = AbstractC0155c.m354m(AbstractC0479l.m1037a(mo5829e, true, (InterfaceC3279c) obj4), f11528c, f11529d);
            if ((i17 & 57344) == 16384) {
                i19 = 1;
            } else {
                i19 = 0;
            }
            int i30 = i19 | (c2395p.m3870g(interfaceC3277a2) ? 1 : 0);
            if ((((i17 & 7168) ^ 3072) > 2048 && c2395p.m3868f(j13)) || (i17 & 3072) == 2048) {
                i20 = 1;
            } else {
                i20 = 0;
            }
            int i31 = i30 | i20;
            if ((((i17 & 896) ^ 384) <= 256 || !c2395p.m3868f(j12)) && (i17 & 384) != 256) {
                i29 = 0;
            }
            int i32 = i31 | i29 | (c2395p.m3870g(interfaceC3279c2) ? 1 : 0);
            Object m3847O4 = c2395p.m3847O();
            if (i32 == 0 && m3847O4 != obj) {
                interfaceC3279c3 = interfaceC3279c2;
                j8 = j12;
                j9 = j13;
            } else {
                interfaceC3279c3 = interfaceC3279c2;
                j8 = j12;
                j9 = j13;
                m3847O4 = new C1919i4(i18, f8, interfaceC3277a2, j9, j8, interfaceC3279c3);
                c2395p.m3877j0(m3847O4);
            }
            AbstractC2080d.m3388a(0, c2395p, (InterfaceC3279c) m3847O4, m354m);
            i21 = i18;
            f9 = f8;
            j10 = j9;
            j11 = j8;
            interfaceC3279c4 = interfaceC3279c3;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1927j4(interfaceC3277a, interfaceC3810r, j11, j10, i21, f9, interfaceC3279c4, i8, i9);
        }
    }

    /* renamed from: c */
    public static final void m3143c(InterfaceC3810r interfaceC3810r, long j6, long j7, int i7, float f7, C2395p c2395p, int i8) {
        long m3196e;
        long m3196e2;
        int i9;
        float f8;
        InterfaceC3810r interfaceC3810r2;
        long j8;
        long j9;
        int i10;
        int i11;
        float f9;
        long j10;
        long j11;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        c2395p.m3859a0(567589233);
        if (((i8 | 27792) & 9363) == 9362 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
            j11 = j6;
            j10 = j7;
            i11 = i7;
            f9 = f7;
        } else {
            c2395p.m3854W();
            if ((i8 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                m3196e = j6;
                m3196e2 = j7;
                i9 = i7;
                f8 = f7;
            } else {
                float f10 = AbstractC1874d4.f11066a;
                float f11 = AbstractC2253v.f13070a;
                m3196e = AbstractC2019v0.m3196e(26, c2395p);
                m3196e2 = AbstractC2019v0.m3196e(32, c2395p);
                i9 = AbstractC1874d4.f11067b;
                f8 = AbstractC1874d4.f11070e;
            }
            c2395p.m3889s();
            C2648h0 m4230p = AbstractC2638e.m4230p(c2395p);
            C0691e c0691e = new C0691e(2);
            c0691e.f2244a = 1800;
            c0691e.m1477b(valueOf2, 0).f14329b = f11531f;
            c0691e.m1477b(valueOf, 750);
            C2642f0 m4221g = AbstractC2638e.m4221g(m4230p, 1.0f, AbstractC2638e.m4229o(new C2654j0(c0691e)), c2395p);
            C0691e c0691e2 = new C0691e(2);
            c0691e2.f2244a = 1800;
            c0691e2.m1477b(valueOf2, 333).f14329b = f11532g;
            c0691e2.m1477b(valueOf, 1183);
            C2642f0 m4221g2 = AbstractC2638e.m4221g(m4230p, 1.0f, AbstractC2638e.m4229o(new C2654j0(c0691e2)), c2395p);
            C0691e c0691e3 = new C0691e(2);
            c0691e3.f2244a = 1800;
            c0691e3.m1477b(valueOf2, 1000).f14329b = f11533h;
            c0691e3.m1477b(valueOf, 1567);
            C2642f0 m4221g3 = AbstractC2638e.m4221g(m4230p, 1.0f, AbstractC2638e.m4229o(new C2654j0(c0691e3)), c2395p);
            C0691e c0691e4 = new C0691e(2);
            c0691e4.f2244a = 1800;
            c0691e4.m1477b(valueOf2, 1267).f14329b = f11534i;
            c0691e4.m1477b(valueOf, 1800);
            C2642f0 m4221g4 = AbstractC2638e.m4221g(m4230p, 1.0f, AbstractC2638e.m4229o(new C2654j0(c0691e4)), c2395p);
            interfaceC3810r2 = interfaceC3810r;
            InterfaceC3810r m354m = AbstractC0155c.m354m(AbstractC0479l.m1037a(interfaceC3810r2.mo5829e(f11527b), true, C2755l.f14704j), f11528c, f11529d);
            boolean m3870g = c2395p.m3870g(m4221g) | c2395p.m3868f(m3196e2) | c2395p.m3870g(m4221g2) | c2395p.m3868f(m3196e) | c2395p.m3870g(m4221g3) | c2395p.m3870g(m4221g4);
            Object m3847O = c2395p.m3847O();
            if (!m3870g && m3847O != C2375k.f13421a) {
                j8 = m3196e;
                j9 = m3196e2;
                i10 = 0;
            } else {
                j8 = m3196e;
                j9 = m3196e2;
                i10 = 0;
                m3847O = new C1935k4(i9, f8, m4221g, j9, m4221g2, j8, m4221g3, m4221g4);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2080d.m3388a(i10, c2395p, (InterfaceC3279c) m3847O, m354m);
            i11 = i9;
            f9 = f8;
            j10 = j9;
            j11 = j8;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1943l4(interfaceC3810r2, j11, j10, i11, f9, i8);
        }
    }

    /* renamed from: d */
    public static final void m3144d(InterfaceC1570d interfaceC1570d, float f7, float f8, long j6, float f9, int i7) {
        boolean z7;
        float f10;
        float f11;
        float m1026d = C0467e.m1026d(interfaceC1570d.mo2546c());
        float m1024b = C0467e.m1024b(interfaceC1570d.mo2546c());
        float f12 = 2;
        float f13 = m1024b / f12;
        if (interfaceC1570d.getLayoutDirection() == EnumC3103m.f15703e) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            f10 = f7;
        } else {
            f10 = 1.0f - f8;
        }
        float f14 = f10 * m1026d;
        if (z7) {
            f11 = f8;
        } else {
            f11 = 1.0f - f7;
        }
        float f15 = f11 * m1026d;
        if (i7 == 0 || m1024b > m1026d) {
            InterfaceC1570d.m2543m(interfaceC1570d, j6, AbstractC3784a.m5797a(f14, f13), AbstractC3784a.m5797a(f15, f13), f9, 0, 496);
            return;
        }
        float f16 = f9 / f12;
        C3876a c3876a = new C3876a(f16, m1026d - f16);
        float floatValue = ((Number) AbstractC2168e.m3532s(Float.valueOf(f14), c3876a)).floatValue();
        float floatValue2 = ((Number) AbstractC2168e.m3532s(Float.valueOf(f15), c3876a)).floatValue();
        if (Math.abs(f8 - f7) > 0.0f) {
            InterfaceC1570d.m2543m(interfaceC1570d, j6, AbstractC3784a.m5797a(floatValue, f13), AbstractC3784a.m5797a(floatValue2, f13), f9, i7, 480);
        }
    }

    /* renamed from: e */
    public static final void m3145e(InterfaceC1570d interfaceC1570d, float f7, float f8, long j6, C1574h c1574h) {
        float f9 = 2;
        float f10 = c1574h.f10188a / f9;
        float m1026d = C0467e.m1026d(interfaceC1570d.mo2546c()) - (f9 * f10);
        interfaceC1570d.mo2534u(j6, f7, f8, AbstractC3784a.m5797a(f10, f10), AbstractC1793a0.m2975c(m1026d, m1026d), c1574h);
    }
}
