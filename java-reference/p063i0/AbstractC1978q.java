package p063i0;

import p035e1.C0675q0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p066i3.AbstractC2067b;
import p071j0.C2154u;
import p078k0.AbstractC2245n;
import p078k0.AbstractC2246o;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2425y0;
import p100n.C2657k0;
import p107o.C2769p1;
import p140s2.InterfaceC3093c;
import p144t.InterfaceC3135i0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p170w1.AbstractC3674f1;
import p171w2.AbstractC3760j;
import p171w2.C3775y;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.q */
/* loaded from: classes.dex */
public abstract class AbstractC1978q {

    /* renamed from: a */
    public static final C3775y f11672a = new C3775y(14);

    /* renamed from: a */
    public static final void m3150a(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, long j6, C2769p1 c2769p1, C3775y c3775y, InterfaceC0667m0 interfaceC0667m0, long j7, float f7, float f8, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        InterfaceC3277a interfaceC3277a2;
        long floatToRawIntBits;
        int i9;
        C3775y c3775y2;
        float f9;
        C2769p1 c2769p12;
        InterfaceC0667m0 interfaceC0667m02;
        long j8;
        float f10;
        InterfaceC3810r interfaceC3810r2;
        long j9;
        C3775y c3775y3;
        InterfaceC3810r interfaceC3810r3;
        C2769p1 c2769p13;
        InterfaceC0667m0 interfaceC0667m03;
        long j10;
        float f11;
        float f12;
        int i10;
        c2395p.m3859a0(1431928300);
        if (c2395p.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8;
        if ((i7 & 48) == 0) {
            interfaceC3277a2 = interfaceC3277a;
            if (c2395p.m3874i(interfaceC3277a2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i11 |= i10;
        } else {
            interfaceC3277a2 = interfaceC3277a;
        }
        int i12 = i11 | 910896512;
        if ((306783379 & i12) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            j9 = j6;
            c2769p13 = c2769p1;
            c3775y3 = c3775y;
            interfaceC0667m03 = interfaceC0667m0;
            j10 = j7;
            f11 = f7;
            f12 = f8;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i9 = i12 & (-33087489);
                interfaceC3810r2 = interfaceC3810r;
                floatToRawIntBits = j6;
                c2769p12 = c2769p1;
                c3775y2 = c3775y;
                interfaceC0667m02 = interfaceC0667m0;
                j8 = j7;
                f9 = f7;
                f10 = f8;
            } else {
                float f13 = 0;
                floatToRawIntBits = (Float.floatToRawIntBits(f13) << 32) | (4294967295L & Float.floatToRawIntBits(f13));
                C2769p1 m3297v = AbstractC2067b.m3297v(c2395p);
                float f14 = AbstractC1981q2.f11691a;
                InterfaceC0667m0 m3117a = AbstractC1884e5.m3117a(AbstractC2246o.f13003b, c2395p);
                long m3196e = AbstractC2019v0.m3196e(37, c2395p);
                i9 = i12 & (-33087489);
                float f15 = AbstractC1981q2.f11691a;
                float f16 = AbstractC1981q2.f11692b;
                C3807o c3807o = C3807o.f17991a;
                c3775y2 = f11672a;
                f9 = f15;
                c2769p12 = m3297v;
                interfaceC0667m02 = m3117a;
                j8 = m3196e;
                f10 = f16;
                interfaceC3810r2 = c3807o;
            }
            c2395p.m3889s();
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                m3847O = new C2657k0(Boolean.FALSE);
                c2395p.m3877j0(m3847O);
            }
            C2657k0 c2657k0 = (C2657k0) m3847O;
            c2657k0.f14346c.setValue(Boolean.valueOf(z7));
            if (((Boolean) c2657k0.f14345b.getValue()).booleanValue() || ((Boolean) c2657k0.f14346c.getValue()).booleanValue()) {
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == obj) {
                    m3847O2 = AbstractC2418w.m3980x(new C0675q0(C0675q0.f2200b));
                    c2395p.m3877j0(m3847O2);
                }
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O2;
                InterfaceC3093c interfaceC3093c = (InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h);
                boolean m3870g = c2395p.m3870g(interfaceC3093c);
                Object m3847O3 = c2395p.m3847O();
                if (m3870g || m3847O3 == obj) {
                    m3847O3 = new C2154u(floatToRawIntBits, interfaceC3093c, new C1962o(interfaceC2425y0, 0));
                    c2395p.m3877j0(m3847O3);
                }
                AbstractC3760j.m5760a((C2154u) m3847O3, interfaceC3277a2, c3775y2, AbstractC3178i.m4873d(2126968933, new C1946m(interfaceC3810r2, c2657k0, interfaceC2425y0, c2769p12, interfaceC0667m02, j8, f9, f10, c3173d), c2395p), c2395p, (i9 & 112) | 3456, 0);
            }
            j9 = floatToRawIntBits;
            c3775y3 = c3775y2;
            interfaceC3810r3 = interfaceC3810r2;
            c2769p13 = c2769p12;
            interfaceC0667m03 = interfaceC0667m02;
            j10 = j8;
            f11 = f9;
            f12 = f10;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1954n(z7, interfaceC3277a, interfaceC3810r3, j9, c2769p13, c3775y3, interfaceC0667m03, j10, f11, f12, c3173d, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3151b(InterfaceC3281e interfaceC3281e, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e2, boolean z7, C1989r2 c1989r2, InterfaceC3135i0 interfaceC3135i0, C2395p c2395p, int i7, int i8) {
        int i9;
        InterfaceC3281e interfaceC3281e3;
        int i10;
        int i11;
        boolean z8;
        int i12;
        int i13;
        C1989r2 c1989r22;
        int i14;
        C1989r2 c1989r23;
        InterfaceC3281e interfaceC3281e4;
        int i15;
        InterfaceC3135i0 interfaceC3135i02;
        boolean z9;
        InterfaceC3810r interfaceC3810r2;
        C1989r2 c1989r24;
        InterfaceC3135i0 interfaceC3135i03;
        C1989r2 c1989r25;
        boolean z10;
        InterfaceC3281e interfaceC3281e5;
        InterfaceC3810r interfaceC3810r3;
        C2405r1 m3891u;
        int i16;
        c2395p.m3859a0(1826340448);
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i9 = i16 | i7;
        } else {
            i9 = i7;
        }
        int i17 = i9 | 384;
        int i18 = i8 & 8;
        if (i18 != 0) {
            i17 = i9 | 3456;
        } else if ((i7 & 3072) == 0) {
            interfaceC3281e3 = interfaceC3281e2;
            if (c2395p.m3874i(interfaceC3281e3)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i17 |= i10;
            int i19 = i17 | 24576;
            i11 = i8 & 32;
            if (i11 == 0) {
                i19 = 221184 | i17;
            } else if ((196608 & i7) == 0) {
                z8 = z7;
                if (c2395p.m3872h(z8)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i19 |= i12;
                i13 = i19 | 113770496;
                if ((38347923 & i13) != 38347922 && c2395p.m3836D()) {
                    c2395p.m3852U();
                    interfaceC3810r3 = interfaceC3810r;
                    c1989r25 = c1989r2;
                    interfaceC3135i03 = interfaceC3135i0;
                    interfaceC3281e5 = interfaceC3281e3;
                    z10 = z8;
                } else {
                    c2395p.m3854W();
                    if ((i7 & 1) == 0 && !c2395p.m3834B()) {
                        c2395p.m3852U();
                        interfaceC3281e4 = interfaceC3281e3;
                        i15 = i13 & (-3670017);
                        c1989r24 = c1989r2;
                        interfaceC3135i02 = interfaceC3135i0;
                        z9 = z8;
                        interfaceC3810r2 = interfaceC3810r;
                    } else {
                        if (i18 != 0) {
                            interfaceC3281e3 = null;
                        }
                        if (i11 != 0) {
                            z8 = true;
                        }
                        float f7 = AbstractC1981q2.f11691a;
                        C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
                        c1989r22 = c2003t0.f11801S;
                        if (c1989r22 == null) {
                            i14 = -3670017;
                            c1989r23 = new C1989r2(AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f12999h), AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f13000i), AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f13001j), C0677s.m1453b(AbstractC2245n.f12992a, AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f12996e)), C0677s.m1453b(AbstractC2245n.f12993b, AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f12997f)), C0677s.m1453b(AbstractC2245n.f12994c, AbstractC2019v0.m3195d(c2003t0, AbstractC2245n.f12998g)));
                            c2003t0.f11801S = c1989r23;
                        } else {
                            i14 = -3670017;
                            c1989r23 = c1989r22;
                        }
                        interfaceC3281e4 = interfaceC3281e3;
                        i15 = i13 & i14;
                        interfaceC3135i02 = AbstractC1981q2.f11693c;
                        z9 = z8;
                        interfaceC3810r2 = C3807o.f17991a;
                        c1989r24 = c1989r23;
                    }
                    c2395p.m3889s();
                    AbstractC2021v2.m3199b(interfaceC3281e, interfaceC3277a, interfaceC3810r2, interfaceC3281e4, z9, c1989r24, interfaceC3135i02, c2395p, 268435454 & i15);
                    interfaceC3135i03 = interfaceC3135i02;
                    c1989r25 = c1989r24;
                    z10 = z9;
                    interfaceC3281e5 = interfaceC3281e4;
                    interfaceC3810r3 = interfaceC3810r2;
                }
                m3891u = c2395p.m3891u();
                if (m3891u != null) {
                    m3891u.f13542d = new C1970p(interfaceC3281e, interfaceC3277a, interfaceC3810r3, interfaceC3281e5, z10, c1989r25, interfaceC3135i03, i7, i8);
                    return;
                }
                return;
            }
            z8 = z7;
            i13 = i19 | 113770496;
            if ((38347923 & i13) != 38347922) {
            }
            c2395p.m3854W();
            if ((i7 & 1) == 0) {
            }
            if (i18 != 0) {
            }
            if (i11 != 0) {
            }
            float f72 = AbstractC1981q2.f11691a;
            C2003t0 c2003t02 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
            c1989r22 = c2003t02.f11801S;
            if (c1989r22 == null) {
            }
            interfaceC3281e4 = interfaceC3281e3;
            i15 = i13 & i14;
            interfaceC3135i02 = AbstractC1981q2.f11693c;
            z9 = z8;
            interfaceC3810r2 = C3807o.f17991a;
            c1989r24 = c1989r23;
            c2395p.m3889s();
            AbstractC2021v2.m3199b(interfaceC3281e, interfaceC3277a, interfaceC3810r2, interfaceC3281e4, z9, c1989r24, interfaceC3135i02, c2395p, 268435454 & i15);
            interfaceC3135i03 = interfaceC3135i02;
            c1989r25 = c1989r24;
            z10 = z9;
            interfaceC3281e5 = interfaceC3281e4;
            interfaceC3810r3 = interfaceC3810r2;
            m3891u = c2395p.m3891u();
            if (m3891u != null) {
            }
        }
        interfaceC3281e3 = interfaceC3281e2;
        int i192 = i17 | 24576;
        i11 = i8 & 32;
        if (i11 == 0) {
        }
        z8 = z7;
        i13 = i192 | 113770496;
        if ((38347923 & i13) != 38347922) {
        }
        c2395p.m3854W();
        if ((i7 & 1) == 0) {
        }
        if (i18 != 0) {
        }
        if (i11 != 0) {
        }
        float f722 = AbstractC1981q2.f11691a;
        C2003t0 c2003t022 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
        c1989r22 = c2003t022.f11801S;
        if (c1989r22 == null) {
        }
        interfaceC3281e4 = interfaceC3281e3;
        i15 = i13 & i14;
        interfaceC3135i02 = AbstractC1981q2.f11693c;
        z9 = z8;
        interfaceC3810r2 = C3807o.f17991a;
        c1989r24 = c1989r23;
        c2395p.m3889s();
        AbstractC2021v2.m3199b(interfaceC3281e, interfaceC3277a, interfaceC3810r2, interfaceC3281e4, z9, c1989r24, interfaceC3135i02, c2395p, 268435454 & i15);
        interfaceC3135i03 = interfaceC3135i02;
        c1989r25 = c1989r24;
        z10 = z9;
        interfaceC3281e5 = interfaceC3281e4;
        interfaceC3810r3 = interfaceC3810r2;
        m3891u = c2395p.m3891u();
        if (m3891u != null) {
        }
    }
}
