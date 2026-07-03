package p063i0;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import p001a0.C0046l0;
import p035e1.AbstractC0659i0;
import p035e1.InterfaceC0667m0;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p100n.AbstractC2638e;
import p100n.AbstractC2658k1;
import p100n.AbstractC2667n1;
import p100n.AbstractC2699z;
import p100n.C2634c1;
import p100n.C2637d1;
import p100n.C2643f1;
import p100n.C2655j1;
import p100n.C2657k0;
import p100n.C2661l1;
import p100n.C2664m1;
import p100n.InterfaceC2697y;
import p107o.C2769p1;
import p140s2.C3101k;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p144t.InterfaceC3135i0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3722r1;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.v2 */
/* loaded from: classes.dex */
public abstract class AbstractC2021v2 {

    /* renamed from: a */
    public static final float f11948a;

    /* renamed from: b */
    public static final float f11949b;

    /* renamed from: c */
    public static final float f11950c = 12;

    /* renamed from: d */
    public static final float f11951d = 8;

    /* renamed from: e */
    public static final float f11952e = 112;

    /* renamed from: f */
    public static final float f11953f = 280;

    static {
        float f7 = 48;
        f11948a = f7;
        f11949b = f7;
    }

    /* renamed from: a */
    public static final void m3198a(InterfaceC3810r interfaceC3810r, C2657k0 c2657k0, InterfaceC2425y0 interfaceC2425y0, C2769p1 c2769p1, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, float f8, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z7;
        float f9;
        InterfaceC2697y interfaceC2697y;
        C2661l1 m4232r;
        float f10;
        C2661l1 m4232r2;
        c2395p.m3859a0(-151448888);
        if (c2395p.m3870g(interfaceC3810r)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i17 = i7 | i8;
        if (c2395p.m3870g(c2657k0)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i18 = i17 | i9;
        if (c2395p.m3870g(c2769p1)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i19 = i18 | i10;
        if (c2395p.m3870g(interfaceC0667m0)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i20 = i19 | i11;
        if (c2395p.m3868f(j6)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        int i21 = i20 | i12;
        if (c2395p.m3864d(f7)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        int i22 = i21 | i13;
        if (c2395p.m3864d(f8)) {
            i14 = 8388608;
        } else {
            i14 = 4194304;
        }
        int i23 = i22 | i14;
        if (c2395p.m3870g(null)) {
            i15 = 67108864;
        } else {
            i15 = 33554432;
        }
        int i24 = i23 | i15;
        if (c2395p.m3874i(c3173d)) {
            i16 = 536870912;
        } else {
            i16 = 268435456;
        }
        int i25 = i24 | i16;
        if ((i25 & 306783379) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i26 = ((i25 >> 3) & 14) | 48;
            int i27 = AbstractC2658k1.f14347a;
            if ((((i26 & 14) ^ 6) > 4 && c2395p.m3870g(c2657k0)) || (i26 & 6) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (z7 || m3847O == obj) {
                m3847O = new C2643f1(c2657k0, null, "DropDownMenu");
                c2395p.m3877j0(m3847O);
            }
            C2643f1 c2643f1 = (C2643f1) m3847O;
            c2395p.m3857Z(1030744251);
            c2643f1.m4236a(c2657k0.f14346c.getValue(), c2395p, 0);
            C2361g1 c2361g1 = c2643f1.f14308d;
            c2395p.m3888r(false);
            boolean m3870g = c2395p.m3870g(c2643f1);
            Object m3847O2 = c2395p.m3847O();
            if (m3870g || m3847O2 == obj) {
                m3847O2 = new C2655j1(c2643f1, 0);
                c2395p.m3877j0(m3847O2);
            }
            AbstractC2418w.m3962d(c2643f1, (InterfaceC3279c) m3847O2, c2395p);
            C2664m1 c2664m1 = AbstractC2667n1.f14365a;
            boolean booleanValue = ((Boolean) c2643f1.m4238c()).booleanValue();
            c2395p.m3857Z(2139028452);
            float f11 = 0.8f;
            float f12 = 1.0f;
            if (booleanValue) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            c2395p.m3888r(false);
            Float valueOf = Float.valueOf(f9);
            boolean booleanValue2 = ((Boolean) c2361g1.getValue()).booleanValue();
            c2395p.m3857Z(2139028452);
            if (booleanValue2) {
                f11 = 1.0f;
            }
            c2395p.m3888r(false);
            Float valueOf2 = Float.valueOf(f11);
            C2634c1 m4241f = c2643f1.m4241f();
            c2395p.m3857Z(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (m4241f.m4202a(bool, bool2)) {
                m4232r = AbstractC2638e.m4232r(120, 2, AbstractC2699z.f14498b);
                interfaceC2697y = null;
            } else {
                interfaceC2697y = null;
                m4232r = AbstractC2638e.m4232r(1, 4, null);
            }
            c2395p.m3888r(false);
            C2637d1 m4263b = AbstractC2658k1.m4263b(c2643f1, valueOf, valueOf2, m4232r, c2664m1, c2395p, 0);
            boolean booleanValue3 = ((Boolean) c2643f1.m4238c()).booleanValue();
            c2395p.m3857Z(-249413128);
            if (booleanValue3) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c2395p.m3888r(false);
            Float valueOf3 = Float.valueOf(f10);
            boolean booleanValue4 = ((Boolean) c2361g1.getValue()).booleanValue();
            c2395p.m3857Z(-249413128);
            if (!booleanValue4) {
                f12 = 0.0f;
            }
            c2395p.m3888r(false);
            Float valueOf4 = Float.valueOf(f12);
            C2634c1 m4241f2 = c2643f1.m4241f();
            c2395p.m3857Z(-1355418157);
            if (m4241f2.m4202a(bool, bool2)) {
                m4232r2 = AbstractC2638e.m4232r(30, 6, interfaceC2697y);
            } else {
                m4232r2 = AbstractC2638e.m4232r(75, 6, interfaceC2697y);
            }
            C2661l1 c2661l1 = m4232r2;
            boolean z8 = false;
            c2395p.m3888r(false);
            C2637d1 m4263b2 = AbstractC2658k1.m4263b(c2643f1, valueOf3, valueOf4, c2661l1, c2664m1, c2395p, 0);
            boolean booleanValue5 = ((Boolean) c2395p.m3878k(AbstractC3722r1.f17685a)).booleanValue();
            boolean m3872h = c2395p.m3872h(booleanValue5) | c2395p.m3870g(m4263b);
            if ((i25 & 112) == 32) {
                z8 = true;
            }
            boolean m3870g2 = z8 | m3872h | c2395p.m3870g(m4263b2);
            Object m3847O3 = c2395p.m3847O();
            if (m3870g2 || m3847O3 == obj) {
                Object c1997s2 = new C1997s2(booleanValue5, c2657k0, interfaceC2425y0, m4263b, m4263b2);
                c2395p.m3877j0(c1997s2);
                m3847O3 = c1997s2;
            }
            int i28 = i25 >> 9;
            int i29 = i25 >> 6;
            AbstractC2048y5.m3210a(AbstractC0168a.m384a(C3807o.f17991a, (InterfaceC3279c) m3847O3), interfaceC0667m0, j6, 0L, f7, f8, AbstractC3178i.m4873d(1573559053, new C0046l0(interfaceC3810r, c2769p1, c3173d, 1), c2395p), c2395p, (i28 & 896) | (i28 & 112) | 12582912 | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 8);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1946m(interfaceC3810r, c2657k0, interfaceC2425y0, c2769p1, interfaceC0667m0, j6, f7, f8, c3173d, i7);
        }
    }

    /* renamed from: b */
    public static final void m3199b(InterfaceC3281e interfaceC3281e, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e2, boolean z7, C1989r2 c1989r2, InterfaceC3135i0 interfaceC3135i0, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3810r interfaceC3810r2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c2395p.m3859a0(-1564716777);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i8 = i17 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i8 |= i16;
        }
        if ((i7 & 384) == 0) {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p.m3870g(interfaceC3810r2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i8 |= i15;
        } else {
            interfaceC3810r2 = interfaceC3810r;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(interfaceC3281e2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i8 |= i14;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(null)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i8 |= i13;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3872h(z7)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i8 |= i12;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3870g(c1989r2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i8 |= i11;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3870g(interfaceC3135i0)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i8 |= i10;
        }
        if ((100663296 & i7) == 0) {
            if (c2395p.m3870g(null)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i8 |= i9;
        }
        if ((i8 & 38347923) == 38347922 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC3810r m336g = AbstractC0154b.m336g(AbstractC0155c.m356o(AbstractC0155c.m346e(AbstractC0145a.m321d(interfaceC3810r2, null, AbstractC1999s4.m3176a(true, 0.0f, 0L, c2395p, 6, 6), z7, null, interfaceC3277a, 24), 1.0f), f11952e, f11953f, 8), interfaceC3135i0);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p, 48);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m336g);
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
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            AbstractC1850a7.m3107a(((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11256m, AbstractC3178i.m4873d(1065051884, new C2005t2(interfaceC3281e2, c1989r2, z7, interfaceC3281e), c2395p), c2395p, 48);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2013u2(interfaceC3281e, interfaceC3277a, interfaceC3810r, interfaceC3281e2, z7, c1989r2, interfaceC3135i0, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3200c(C3101k c3101k, C3101k c3101k2) {
        float min;
        int i7 = c3101k2.f15698a;
        int i8 = c3101k2.f15701d;
        int i9 = c3101k2.f15698a;
        int i10 = c3101k2.f15700c;
        int i11 = c3101k2.f15699b;
        int i12 = c3101k.f15700c;
        int i13 = c3101k.f15699b;
        int i14 = c3101k.f15701d;
        int i15 = c3101k.f15698a;
        float f7 = 1.0f;
        if (i7 < i12) {
            if (i10 <= i15) {
                min = 1.0f;
            } else if (c3101k2.m4789c() != 0) {
                min = (((Math.min(c3101k.f15700c, i10) + Math.max(i15, i9)) / 2) - i9) / c3101k2.m4789c();
            }
            if (i11 < i14) {
                if (i8 > i13) {
                    if (c3101k2.m4788b() != 0) {
                        f7 = (((Math.min(i14, i8) + Math.max(i13, i11)) / 2) - i11) / c3101k2.m4788b();
                    }
                }
                return AbstractC0659i0.m1408h(min, f7);
            }
            f7 = 0.0f;
            return AbstractC0659i0.m1408h(min, f7);
        }
        min = 0.0f;
        if (i11 < i14) {
        }
        f7 = 0.0f;
        return AbstractC0659i0.m1408h(min, f7);
    }
}
