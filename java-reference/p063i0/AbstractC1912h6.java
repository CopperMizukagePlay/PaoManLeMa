package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.p007ui.layout.AbstractC0172a;
import p001a0.C0005b;
import p001a0.C0060o2;
import p035e1.C0677s;
import p042f1.AbstractC1516c;
import p068i5.AbstractC2080d;
import p078k0.AbstractC2252u;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p092m.C2491g;
import p100n.AbstractC2638e;
import p100n.AbstractC2658k1;
import p100n.AbstractC2667n1;
import p100n.AbstractC2699z;
import p100n.C2634c1;
import p100n.C2643f1;
import p100n.C2661l1;
import p100n.C2664m1;
import p144t.AbstractC3144n;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3802j;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.h6 */
/* loaded from: classes.dex */
public abstract class AbstractC1912h6 {

    /* renamed from: a */
    public static final float f11287a;

    /* renamed from: b */
    public static final float f11288b;

    /* renamed from: c */
    public static final float f11289c;

    /* renamed from: d */
    public static final float f11290d;

    /* renamed from: e */
    public static final long f11291e;

    static {
        float f7 = AbstractC2252u.f13065a;
        f11287a = AbstractC2252u.f13067c;
        f11288b = 16;
        f11289c = 14;
        f11290d = 6;
        f11291e = AbstractC2080d.m3405r(20);
    }

    /* renamed from: a */
    public static final void m3121a(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z8, long j6, long j7, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c2395p.m3859a0(-202735880);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i8 = i16 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i8 |= i15;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i8 |= i14;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(z8)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i8 |= i13;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3868f(j6)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i8 |= i12;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3868f(j7)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i8 |= i11;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3870g(null)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i8 |= i10;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i8 |= i9;
        }
        int i17 = i8;
        if ((4793491 & i17) == 4793490 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            int i18 = i17 >> 12;
            m3123c(j6, j7, z7, AbstractC3178i.m4873d(-551896140, new C1867c6(interfaceC3810r, z7, AbstractC1999s4.m3176a(true, 0.0f, j6, c2395p, ((i17 >> 6) & 896) | 6, 2), z8, interfaceC3277a, c3173d), c2395p), c2395p, (i18 & 112) | (i18 & 14) | 3072 | ((i17 << 6) & 896));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1876d6(z7, interfaceC3277a, interfaceC3810r, z8, j6, j7, c3173d, i7);
        }
    }

    /* renamed from: b */
    public static final void m3122b(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z8, InterfaceC3281e interfaceC3281e, long j6, long j7, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        boolean z9;
        InterfaceC3810r interfaceC3810r2;
        long j8;
        long j9;
        C3173d m4873d;
        InterfaceC3810r interfaceC3810r3;
        boolean z10;
        long j10;
        long j11;
        c2395p.m3859a0(-350627181);
        if (c2395p.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8;
        if (c2395p.m3874i(interfaceC3277a)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9 | 105581952;
        if ((38347923 & i12) == 38347922 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            z10 = z8;
            j10 = j6;
            j11 = j7;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i10 = i12 & (-33030145);
                interfaceC3810r2 = interfaceC3810r;
                z9 = z8;
                j8 = j6;
                j9 = j7;
            } else {
                long j12 = ((C0677s) c2395p.m3878k(AbstractC1862c1.f10996a)).f2211a;
                i10 = i12 & (-33030145);
                z9 = true;
                interfaceC3810r2 = C3807o.f17991a;
                j8 = j12;
                j9 = j8;
            }
            c2395p.m3889s();
            c2395p.m3857Z(79583089);
            if (interfaceC3281e == null) {
                m4873d = null;
            } else {
                m4873d = AbstractC3178i.m4873d(708874428, new C1851b(4, interfaceC3281e), c2395p);
            }
            c2395p.m3888r(false);
            m3121a(z7, interfaceC3277a, interfaceC3810r2, z9, j8, j9, AbstractC3178i.m4873d(1540996038, new C0060o2(3, m4873d), c2395p), c2395p, (i10 & 112) | (i10 & 14) | 12582912 | 1576320);
            interfaceC3810r3 = interfaceC3810r2;
            z10 = z9;
            j10 = j8;
            j11 = j9;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1858b6(z7, interfaceC3277a, interfaceC3810r3, z10, interfaceC3281e, j10, j11, i7);
        }
    }

    /* renamed from: c */
    public static final void m3123c(long j6, long j7, boolean z7, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        long j8;
        long j9;
        long j10;
        C2661l1 m4232r;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(735731848);
        if ((i7 & 6) == 0) {
            if (c2395p.m3868f(j6)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i8 = i12 | i7;
        } else {
            i8 = i7;
        }
        int i13 = 16;
        if ((i7 & 48) == 0) {
            if (c2395p.m3868f(j7)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i7 & 384) == 0) {
            z8 = z7;
            if (c2395p.m3872h(z8)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i8 |= i10;
        } else {
            z8 = z7;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i8 |= i9;
        }
        if ((i8 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i14 = i8 >> 6;
            C2643f1 m4264c = AbstractC2658k1.m4264c(Boolean.valueOf(z8), null, c2395p, i14 & 14, 2);
            C2361g1 c2361g1 = m4264c.f14308d;
            boolean booleanValue = ((Boolean) c2361g1.getValue()).booleanValue();
            c2395p.m3857Z(-1997025499);
            if (booleanValue) {
                j8 = j6;
            } else {
                j8 = j7;
            }
            c2395p.m3888r(false);
            AbstractC1516c m1457f = C0677s.m1457f(j8);
            boolean m3870g = c2395p.m3870g(m1457f);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                C2491g c2491g = C2491g.f13800h;
                C0005b c0005b = new C0005b(i13, m1457f);
                C2664m1 c2664m1 = AbstractC2667n1.f14365a;
                C2664m1 c2664m12 = new C2664m1(c2491g, c0005b);
                c2395p.m3877j0(c2664m12);
                m3847O = c2664m12;
            }
            C2664m1 c2664m13 = (C2664m1) m3847O;
            boolean booleanValue2 = ((Boolean) m4264c.m4238c()).booleanValue();
            c2395p.m3857Z(-1997025499);
            if (booleanValue2) {
                j9 = j6;
            } else {
                j9 = j7;
            }
            c2395p.m3888r(false);
            C0677s c0677s = new C0677s(j9);
            boolean booleanValue3 = ((Boolean) c2361g1.getValue()).booleanValue();
            c2395p.m3857Z(-1997025499);
            if (booleanValue3) {
                j10 = j6;
            } else {
                j10 = j7;
            }
            c2395p.m3888r(false);
            C0677s c0677s2 = new C0677s(j10);
            C2634c1 m4241f = m4264c.m4241f();
            c2395p.m3857Z(-899623535);
            if (m4241f.m4202a(Boolean.FALSE, Boolean.TRUE)) {
                m4232r = new C2661l1(150, 100, AbstractC2699z.f14500d);
            } else {
                m4232r = AbstractC2638e.m4232r(100, 2, AbstractC2699z.f14500d);
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3959a(AbstractC1862c1.f10996a.mo3716a(new C0677s(((C0677s) AbstractC2658k1.m4263b(m4264c, c0677s, c0677s2, m4232r, c2664m13, c2395p, 0).f14279l.getValue()).f2211a)), c3173d, c2395p, (i14 & 112) | 8);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1903g6(j6, j7, z8, c3173d, i7);
        }
    }

    /* renamed from: d */
    public static final void m3124d(InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        C3802j c3802j = C3795c.f17964e;
        c2395p.m3859a0(514131524);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(null)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i11 = i8 & 14;
            if (i11 == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i8 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z10 = z8 | z7;
            Object m3847O = c2395p.m3847O();
            if (z10 || m3847O == C2375k.f13421a) {
                m3847O = new C1976p5(1, interfaceC3281e);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, c3807o);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(interfaceC3217l0, c2395p, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p, c3504h4);
            c2395p.m3857Z(871566271);
            if (interfaceC3281e != null) {
                InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0172a.m393c(c3807o, "text"), f11288b, 0.0f, 2);
                InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(c3802j, false);
                int hashCode2 = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m339j);
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(c3558z);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(m4853e, c2395p, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p, c3504h2);
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p, hashCode2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p, c3504h4);
                interfaceC3281e.mo22d(c2395p, Integer.valueOf(i11));
                z9 = true;
                c2395p.m3888r(true);
            } else {
                z9 = true;
            }
            c2395p.m3888r(false);
            c2395p.m3857Z(871570579);
            c2395p.m3888r(false);
            c2395p.m3888r(z9);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1894f6(i7, 0, interfaceC3281e);
        }
    }
}
