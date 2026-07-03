package p063i0;

import p028d2.AbstractC0479l;
import p066i3.AbstractC2067b;
import p078k0.AbstractC2252u;
import p085l0.C2395p;
import p085l0.C2405r1;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2661l1;
import p100n.C2686u;
import p107o.C2769p1;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p182y.C3828a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u6 */
/* loaded from: classes.dex */
public abstract class AbstractC2017u6 {

    /* renamed from: a */
    public static final float f11936a = 90;

    /* renamed from: b */
    public static final C2661l1 f11937b;

    /* renamed from: c */
    public static final C2661l1 f11938c;

    static {
        C2686u c2686u = AbstractC2699z.f14497a;
        f11937b = AbstractC2638e.m4232r(250, 2, c2686u);
        f11938c = AbstractC2638e.m4232r(250, 2, c2686u);
    }

    /* renamed from: a */
    public static final void m3188a(int i7, InterfaceC3810r interfaceC3810r, long j6, long j7, float f7, InterfaceC3282f interfaceC3282f, InterfaceC3281e interfaceC3281e, C3173d c3173d, C2395p c2395p, int i8) {
        int i9;
        InterfaceC3281e interfaceC3281e2;
        int i10;
        InterfaceC3282f interfaceC3282f2;
        float f8;
        long j8;
        long j9;
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3281e interfaceC3281e3;
        InterfaceC3282f interfaceC3282f3;
        c2395p.m3859a0(-497821003);
        if (c2395p.m3866e(i7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i11 = i8 | i9 | 1795248;
        if ((4793491 & i11) == 4793490 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
            j9 = j6;
            j8 = j7;
            f8 = f7;
            interfaceC3282f3 = interfaceC3282f;
            interfaceC3281e3 = interfaceC3281e;
        } else {
            c2395p.m3854W();
            if ((i8 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                j9 = j6;
                j8 = j7;
                f8 = f7;
                interfaceC3281e2 = interfaceC3281e;
                i10 = i11 & (-8065);
                interfaceC3282f2 = interfaceC3282f;
            } else {
                C1937k6 c1937k6 = C1937k6.f11436a;
                long m3196e = AbstractC2019v0.m3196e(AbstractC2252u.f13066b, c2395p);
                long m3196e2 = AbstractC2019v0.m3196e(AbstractC2252u.f13068d, c2395p);
                float f9 = C1937k6.f11437b;
                C3173d m4873d = AbstractC3178i.m4873d(-913748678, new C1945l6(i7, 0), c2395p);
                interfaceC3281e2 = AbstractC1853b1.f10943b;
                i10 = i11 & (-8065);
                interfaceC3282f2 = m4873d;
                f8 = f9;
                j8 = m3196e2;
                j9 = m3196e;
                interfaceC3810r2 = C3807o.f17991a;
            }
            c2395p.m3889s();
            m3189b(i7, interfaceC3282f2, interfaceC3810r2, j9, j8, f8, interfaceC3281e2, c3173d, AbstractC2067b.m3297v(c2395p), c2395p, 14352816 | (i10 & 14));
            interfaceC3281e3 = interfaceC3281e2;
            interfaceC3282f3 = interfaceC3282f2;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1953m6(i7, interfaceC3810r2, j9, j8, f8, interfaceC3282f3, interfaceC3281e3, c3173d, i8);
        }
    }

    /* renamed from: b */
    public static final void m3189b(int i7, InterfaceC3282f interfaceC3282f, InterfaceC3810r interfaceC3810r, long j6, long j7, float f7, InterfaceC3281e interfaceC3281e, C3173d c3173d, C2769p1 c2769p1, C2395p c2395p, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        c2395p.m3859a0(-955409947);
        if ((i8 & 6) == 0) {
            if (c2395p.m3866e(i7)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i9 = i18 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3282f)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i9 |= i17;
        }
        if ((i8 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i9 |= i16;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p.m3868f(j6)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i9 |= i15;
        }
        if ((i8 & 24576) == 0) {
            if (c2395p.m3868f(j7)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i9 |= i14;
        }
        if ((196608 & i8) == 0) {
            if (c2395p.m3864d(f7)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i9 |= i13;
        }
        if ((1572864 & i8) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i9 |= i12;
        }
        if ((i8 & 12582912) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i9 |= i11;
        }
        if ((100663296 & i8) == 0) {
            if (c2395p.m3870g(c2769p1)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i9 |= i10;
        }
        if ((38347923 & i9) == 38347922 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3854W();
            if ((i8 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
            }
            c2395p.m3889s();
            int i19 = ((i9 >> 6) & 14) | 12582912;
            int i20 = i9 >> 3;
            AbstractC2048y5.m3210a(interfaceC3810r, null, j6, j7, 0.0f, 0.0f, AbstractC3178i.m4873d(-1572959552, new C1977p6(c2769p1, f7, c3173d, interfaceC3281e, interfaceC3282f, i7), c2395p), c2395p, (i20 & 7168) | i19 | (i20 & 896), 114);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1985q6(i7, interfaceC3282f, interfaceC3810r, j6, j7, f7, interfaceC3281e, c3173d, c2769p1, i8);
        }
    }

    /* renamed from: c */
    public static final void m3190c(int i7, InterfaceC3810r interfaceC3810r, long j6, long j7, InterfaceC3282f interfaceC3282f, InterfaceC3281e interfaceC3281e, C3173d c3173d, C2395p c2395p, int i8) {
        int i9;
        InterfaceC3281e interfaceC3281e2;
        long j8;
        long j9;
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3282f interfaceC3282f2;
        c2395p.m3859a0(-1199178586);
        if (c2395p.m3866e(i7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        if (((i8 | i9 | 222384) & 599187) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
            j9 = j6;
            j8 = j7;
            interfaceC3282f2 = interfaceC3282f;
            interfaceC3281e2 = interfaceC3281e;
        } else {
            c2395p.m3854W();
            if ((i8 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                j9 = j6;
                j8 = j7;
                interfaceC3282f2 = interfaceC3282f;
                interfaceC3281e2 = interfaceC3281e;
            } else {
                C1937k6 c1937k6 = C1937k6.f11436a;
                long m3196e = AbstractC2019v0.m3196e(AbstractC2252u.f13066b, c2395p);
                long m3196e2 = AbstractC2019v0.m3196e(AbstractC2252u.f13068d, c2395p);
                C3173d m4873d = AbstractC3178i.m4873d(-2052073983, new C1945l6(i7, 1), c2395p);
                interfaceC3281e2 = AbstractC1853b1.f10942a;
                j8 = m3196e2;
                j9 = m3196e;
                interfaceC3810r2 = C3807o.f17991a;
                interfaceC3282f2 = m4873d;
            }
            c2395p.m3889s();
            m3191d(interfaceC3810r2, j9, j8, interfaceC3282f2, interfaceC3281e2, c3173d, c2395p, 224262);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1993r6(i7, interfaceC3810r2, j9, j8, interfaceC3282f2, interfaceC3281e2, c3173d, i8);
        }
    }

    /* renamed from: d */
    public static final void m3191d(InterfaceC3810r interfaceC3810r, long j6, long j7, InterfaceC3282f interfaceC3282f, InterfaceC3281e interfaceC3281e, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        c2395p.m3859a0(-160898917);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3868f(j6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3868f(j7)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(interfaceC3282f)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i15 = i8 << 3;
            AbstractC2048y5.m3210a(AbstractC0479l.m1037a(interfaceC3810r, false, C3828a.f18037f), null, j6, j7, 0.0f, 0.0f, AbstractC3178i.m4873d(-1617702432, new C2009t6(c3173d, interfaceC3281e, interfaceC3282f, 1), c2395p), c2395p, (i15 & 896) | 12582912 | (i15 & 7168), 114);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1993r6(interfaceC3810r, j6, j7, interfaceC3282f, interfaceC3281e, c3173d, i7);
        }
    }
}
