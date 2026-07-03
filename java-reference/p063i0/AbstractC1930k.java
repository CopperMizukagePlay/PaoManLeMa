package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import p034e0.C0612j0;
import p035e1.InterfaceC0667m0;
import p065i2.AbstractC2064e;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.C3137j0;
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
import p171w2.C3767q;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.k */
/* loaded from: classes.dex */
public abstract class AbstractC1930k {

    /* renamed from: a */
    public static final float f11406a = 280;

    /* renamed from: b */
    public static final float f11407b = 560;

    /* renamed from: c */
    public static final float f11408c = 8;

    /* renamed from: d */
    public static final float f11409d = 12;

    /* renamed from: e */
    public static final C3137j0 f11410e;

    /* renamed from: f */
    public static final C3137j0 f11411f;

    /* renamed from: g */
    public static final C3137j0 f11412g;

    static {
        float f7 = 24;
        f11410e = new C3137j0(f7, f7, f7, f7);
        float f8 = 16;
        AbstractC0154b.m332c(f8);
        f11411f = AbstractC0154b.m332c(f8);
        f11412g = AbstractC0154b.m332c(f7);
    }

    /* renamed from: a */
    public static final void m3129a(C3173d c3173d, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, InterfaceC3281e interfaceC3281e2, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, long j7, long j8, long j9, long j10, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c7;
        char c8;
        InterfaceC3810r interfaceC3810r2;
        c2395p.m3859a0(1522575799);
        int i16 = i7 | 48;
        if (c2395p.m3874i(null)) {
            i8 = 256;
        } else {
            i8 = 128;
        }
        int i17 = i16 | i8;
        if (c2395p.m3874i(interfaceC3281e)) {
            i9 = 2048;
        } else {
            i9 = 1024;
        }
        int i18 = i17 | i9;
        if (c2395p.m3874i(interfaceC3281e2)) {
            i10 = 16384;
        } else {
            i10 = 8192;
        }
        int i19 = i18 | i10;
        if (c2395p.m3870g(interfaceC0667m0)) {
            i11 = 131072;
        } else {
            i11 = 65536;
        }
        int i20 = i19 | i11;
        if (c2395p.m3868f(j6)) {
            i12 = 1048576;
        } else {
            i12 = 524288;
        }
        int i21 = i20 | i12;
        if (c2395p.m3864d(f7)) {
            i13 = 8388608;
        } else {
            i13 = 4194304;
        }
        int i22 = i21 | i13;
        if (c2395p.m3868f(j7)) {
            i14 = 67108864;
        } else {
            i14 = 33554432;
        }
        int i23 = i22 | i14;
        if (c2395p.m3868f(j8)) {
            i15 = 536870912;
        } else {
            i15 = 268435456;
        }
        int i24 = i23 | i15;
        if (c2395p.m3868f(j9)) {
            c7 = 4;
        } else {
            c7 = 2;
        }
        if (c2395p.m3868f(j10)) {
            c8 = ' ';
        } else {
            c8 = 16;
        }
        int i25 = c7 | c8;
        if ((i24 & 306783379) == 306783378 && (i25 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
        } else {
            C3173d m4873d = AbstractC3178i.m4873d(-2126308228, new C1860c(interfaceC3281e, interfaceC3281e2, j8, j9, j10, j7, c3173d), c2395p);
            int i26 = i24 >> 12;
            int i27 = (i26 & 896) | (i26 & 112) | 12582918 | ((i24 >> 9) & 57344);
            C3807o c3807o = C3807o.f17991a;
            AbstractC2048y5.m3210a(c3807o, interfaceC0667m0, j6, 0L, f7, 0.0f, m4873d, c2395p, i27, 104);
            interfaceC3810r2 = c3807o;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1869d(c3173d, interfaceC3810r2, interfaceC3281e, interfaceC3281e2, interfaceC0667m0, j6, f7, j7, j8, j9, j10, i7);
        }
    }

    /* renamed from: b */
    public static final void m3130b(C3173d c3173d, C2395p c2395p, int i7) {
        c2395p.m3859a0(586821353);
        if ((i7 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = new Object();
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, C3807o.f17991a);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(interfaceC3217l0, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            c3173d.mo22d(c2395p, 6);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1887f(c3173d, i7, 0);
        }
    }

    /* renamed from: c */
    public static final void m3131c(InterfaceC3277a interfaceC3277a, C3173d c3173d, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, InterfaceC3281e interfaceC3281e2, InterfaceC3281e interfaceC3281e3, InterfaceC0667m0 interfaceC0667m0, long j6, long j7, long j8, long j9, float f7, C3767q c3767q, C2395p c2395p, int i7, int i8) {
        int i9;
        C3173d c3173d2;
        InterfaceC3281e interfaceC3281e4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        c2395p.m3859a0(-919826268);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i9 = i24 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            c3173d2 = c3173d;
            if (c2395p.m3874i(c3173d2)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i9 |= i23;
        } else {
            c3173d2 = c3173d;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i9 |= i22;
        }
        if ((i7 & 3072) == 0) {
            interfaceC3281e4 = interfaceC3281e;
            if (c2395p.m3874i(interfaceC3281e4)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i9 |= i21;
        } else {
            interfaceC3281e4 = interfaceC3281e;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(null)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i9 |= i20;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3281e2)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i9 |= i19;
        }
        if ((i7 & 1572864) == 0) {
            if (c2395p.m3874i(interfaceC3281e3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i9 |= i18;
        }
        if ((i7 & 12582912) == 0) {
            if (c2395p.m3870g(interfaceC0667m0)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i9 |= i17;
        }
        if ((i7 & 100663296) == 0) {
            if (c2395p.m3868f(j6)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i9 |= i16;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3868f(j7)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i9 |= i15;
        }
        if ((i8 & 6) == 0) {
            if (c2395p.m3868f(j8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i8 | i14;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3868f(j9)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i8 & 384) == 0) {
            if (c2395p.m3864d(f7)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p.m3870g(c3767q)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        int i25 = i10;
        if ((i9 & 306783379) == 306783378 && (i25 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            m3132d(interfaceC3277a, interfaceC3810r, c3767q, AbstractC3178i.m4873d(-1852840226, new C1905h(interfaceC3281e2, interfaceC3281e3, interfaceC0667m0, j6, f7, j7, j8, j9, interfaceC3281e4, c3173d2), c2395p), c2395p, (i9 & 14) | 3072 | ((i9 >> 3) & 112) | ((i25 >> 3) & 896));
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1914i(interfaceC3277a, c3173d, interfaceC3810r, interfaceC3281e, interfaceC3281e2, interfaceC3281e3, interfaceC0667m0, j6, j7, j8, j9, f7, c3767q, i7, i8);
        }
    }

    /* renamed from: d */
    public static final void m3132d(InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, C3767q c3767q, C3173d c3173d, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(-1922902937);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i8 = i12 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(c3767q)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i8 |= i10;
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
            AbstractC2064e.m3231a(interfaceC3277a, c3767q, AbstractC3178i.m4873d(905289008, new C0612j0(interfaceC3810r, c3173d), c2395p), c2395p, ((i8 >> 3) & 112) | (i8 & 14) | 384);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1922j(interfaceC3277a, interfaceC3810r, c3767q, c3173d, i7, 0);
        }
    }
}
