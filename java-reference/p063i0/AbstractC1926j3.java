package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.selection.AbstractC0161b;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.WeakHashMap;
import p001a0.C0005b;
import p001a0.C0074s0;
import p028d2.C0474g;
import p034e0.C0596b0;
import p035e1.C0677s;
import p071j0.C2125f0;
import p078k0.AbstractC2248q;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2487d;
import p100n.AbstractC2638e;
import p100n.AbstractC2641f;
import p100n.AbstractC2667n1;
import p100n.C2675q0;
import p100n.InterfaceC2656k;
import p137s.C3081j;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p144t.AbstractC3144n;
import p144t.C3120b;
import p144t.C3129f0;
import p144t.C3149p0;
import p144t.C3161v0;
import p144t.InterfaceC3159u0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3802j;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.j3 */
/* loaded from: classes.dex */
public abstract class AbstractC1926j3 {

    /* renamed from: a */
    public static final float f11377a;

    /* renamed from: b */
    public static final float f11378b;

    /* renamed from: c */
    public static final float f11379c;

    /* renamed from: d */
    public static final float f11380d;

    /* renamed from: e */
    public static final float f11381e;

    /* renamed from: f */
    public static final float f11382f;

    static {
        float f7 = AbstractC2248q.f13006a;
        f11377a = AbstractC2248q.f13008c;
        f11378b = 8;
        f11379c = 4;
        float f8 = AbstractC2248q.f13007b;
        float f9 = AbstractC2248q.f13009d;
        float f10 = 2;
        f11380d = (f8 - f9) / f10;
        f11381e = (AbstractC2248q.f13006a - f9) / f10;
        f11382f = 12;
    }

    /* renamed from: a */
    public static final void m3126a(InterfaceC3810r interfaceC3810r, long j6, long j7, float f7, InterfaceC3159u0 interfaceC3159u0, C3173d c3173d, C2395p c2395p, int i7) {
        float f8;
        InterfaceC3159u0 c3129f0;
        InterfaceC3810r interfaceC3810r2;
        long j8;
        long j9;
        C3173d c3173d2;
        InterfaceC3810r interfaceC3810r3;
        InterfaceC3159u0 interfaceC3159u02;
        c2395p.m3859a0(1596802123);
        if (((i7 | 11414) & 74899) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            j9 = j6;
            j8 = j7;
            f8 = f7;
            interfaceC3159u02 = interfaceC3159u0;
            c3173d2 = c3173d;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                j9 = j6;
                j8 = j7;
                f8 = f7;
                c3129f0 = interfaceC3159u0;
            } else {
                float f9 = AbstractC2037x2.f12118a;
                float f10 = AbstractC2248q.f13006a;
                long m3196e = AbstractC2019v0.m3196e(37, c2395p);
                long m3192a = AbstractC2019v0.m3192a((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a), m3196e);
                float f11 = AbstractC2037x2.f12118a;
                WeakHashMap weakHashMap = C3161v0.f15846u;
                f8 = f11;
                c3129f0 = new C3129f0(C3120b.m4822e(c2395p).f15853g, AbstractC3122c.f15762g | 32);
                interfaceC3810r2 = C3807o.f17991a;
                j8 = m3192a;
                j9 = m3196e;
            }
            c2395p.m3889s();
            c3173d2 = c3173d;
            AbstractC2048y5.m3210a(interfaceC3810r2, null, j9, j8, f8, 0.0f, AbstractC3178i.m4873d(105663120, new C1879e0(3, c3129f0, c3173d2), c2395p), c2395p, 12607494, 98);
            interfaceC3810r3 = interfaceC3810r2;
            interfaceC3159u02 = c3129f0;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2053z2(interfaceC3810r3, j9, j8, f8, interfaceC3159u02, c3173d2, i7);
        }
    }

    /* renamed from: b */
    public static final void m3127b(C3149p0 c3149p0, boolean z7, InterfaceC3277a interfaceC3277a, C3173d c3173d, InterfaceC3810r interfaceC3810r, boolean z8, InterfaceC3281e interfaceC3281e, boolean z9, C2045y2 c2045y2, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        C2045y2 c2045y22;
        boolean z10;
        boolean z11;
        InterfaceC3810r interfaceC3810r2;
        C3173d m4873d;
        InterfaceC3810r m4856a;
        float f7;
        C2395p c2395p2;
        boolean z12;
        C2045y2 c2045y23;
        boolean z13;
        InterfaceC3810r interfaceC3810r3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c2395p.m3859a0(-663510974);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(c3149p0)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i8 = i15 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i8 |= i14;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i8 |= i13;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i8 |= i12;
        }
        int i16 = i8 | 221184;
        if ((1572864 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i16 |= i11;
        }
        int i17 = 12582912 | i16;
        if ((100663296 & i7) == 0) {
            i17 = 46137344 | i16;
        }
        int i18 = 805306368 | i17;
        if ((306783379 & i18) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            z13 = z8;
            z12 = z9;
            c2045y23 = c2045y2;
            c2395p2 = c2395p;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                z10 = z8;
                z11 = z9;
                i10 = i18 & (-234881025);
                c2045y22 = c2045y2;
            } else {
                C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
                C2045y2 c2045y24 = c2003t0.f11802T;
                if (c2045y24 == null) {
                    float f8 = AbstractC2248q.f13006a;
                    long m3195d = AbstractC2019v0.m3195d(c2003t0, 15);
                    long m3195d2 = AbstractC2019v0.m3195d(c2003t0, 18);
                    long m3195d3 = AbstractC2019v0.m3195d(c2003t0, 32);
                    int i19 = AbstractC2248q.f13010e;
                    long m3195d4 = AbstractC2019v0.m3195d(c2003t0, i19);
                    int i20 = AbstractC2248q.f13011f;
                    i9 = -234881025;
                    C2045y2 c2045y25 = new C2045y2(m3195d, m3195d2, m3195d3, m3195d4, AbstractC2019v0.m3195d(c2003t0, i20), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i19)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, i20)));
                    c2003t0.f11802T = c2045y25;
                    c2045y24 = c2045y25;
                } else {
                    i9 = -234881025;
                }
                i10 = i18 & i9;
                c2045y22 = c2045y24;
                z10 = true;
                z11 = true;
                interfaceC3810r2 = C3807o.f17991a;
            }
            c2395p.m3889s();
            c2395p.m3857Z(-103235253);
            Object m3847O = c2395p.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                m3847O = new C3081j();
                c2395p.m3877j0(m3847O);
            }
            C3081j c3081j = (C3081j) m3847O;
            c2395p.m3888r(false);
            C2045y2 c2045y26 = c2045y22;
            boolean z14 = z11;
            C3173d m4873d2 = AbstractC3178i.m4873d(-1419576100, new C1864c3(c2045y22, z7, z10, interfaceC3281e, z11, c3173d), c2395p);
            c2395p.m3857Z(-103209106);
            if (interfaceC3281e == null) {
                m4873d = null;
            } else {
                m4873d = AbstractC3178i.m4873d(1644987592, new C1873d3(c2045y26, z7, z10, interfaceC3281e), c2395p);
            }
            c2395p.m3888r(false);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj) {
                m3847O2 = new C2349d1(0);
                c2395p.m3877j0(m3847O2);
            }
            C2349d1 c2349d1 = (C2349d1) m3847O2;
            boolean z15 = z10;
            InterfaceC3810r interfaceC3810r4 = interfaceC3810r2;
            m4856a = c3149p0.m4856a(AbstractC0155c.m343b(AbstractC0161b.m371a(interfaceC3810r4, z7, c3081j, null, z15, new C0474g(4), interfaceC3277a), 0.0f, f11377a, 1), 1.0f, true);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj) {
                m3847O3 = new C0005b(13, c2349d1);
                c2395p.m3877j0(m3847O3);
            }
            InterfaceC3810r m395e = AbstractC0172a.m395e(m4856a, (InterfaceC3279c) m3847O3);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17968i, true);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m395e);
            InterfaceC3510j.f16935d.getClass();
            InterfaceC3277a interfaceC3277a2 = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a2);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            if (z7) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            InterfaceC2656k m4232r = AbstractC2638e.m4232r(100, 6, null);
            if (m4232r == AbstractC2641f.f14295a) {
                c2395p.m3857Z(1125598679);
                boolean m3864d = c2395p.m3864d(0.01f);
                Object m3847O4 = c2395p.m3847O();
                if (m3864d || m3847O4 == obj) {
                    m3847O4 = AbstractC2638e.m4231q(3, Float.valueOf(0.01f));
                    c2395p.m3877j0(m3847O4);
                }
                m4232r = (C2675q0) m3847O4;
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(1125708605);
                c2395p.m3888r(false);
            }
            InterfaceC2390n2 m4235b = AbstractC2641f.m4235b(Float.valueOf(f7), AbstractC2667n1.f14365a, m4232r, Float.valueOf(0.01f), "FloatAnimation", c2395p, 0, 0);
            long m5797a = AbstractC3784a.m5797a((c2349d1.m3741g() - r3.mo4513Q(AbstractC2248q.f13007b)) / 2, ((InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h)).mo4526y(f11382f));
            boolean m3870g = c2395p.m3870g(c3081j) | c2395p.m3868f(m5797a);
            Object m3847O5 = c2395p.m3847O();
            if (m3870g || m3847O5 == obj) {
                m3847O5 = new C2125f0(c3081j, m5797a);
                c2395p.m3877j0(m3847O5);
            }
            C3173d m4873d3 = AbstractC3178i.m4873d(691730997, new C0074s0(3, (C2125f0) m3847O5), c2395p);
            C3173d m4873d4 = AbstractC3178i.m4873d(-474426875, new C1879e0(4, m4235b, c2045y26), c2395p);
            boolean m3870g2 = c2395p.m3870g(m4235b);
            Object m3847O6 = c2395p.m3847O();
            if (m3870g2 || m3847O6 == obj) {
                m3847O6 = new C0596b0(m4235b, 2);
                c2395p.m3877j0(m3847O6);
            }
            m3128c(m4873d3, m4873d4, m4873d2, m4873d, z14, (InterfaceC3277a) m3847O6, c2395p, ((i10 >> 9) & 57344) | 438);
            c2395p2 = c2395p;
            c2395p2.m3888r(true);
            z12 = z14;
            c2045y23 = c2045y26;
            z13 = z15;
            interfaceC3810r3 = interfaceC3810r4;
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1855b3(c3149p0, z7, interfaceC3277a, c3173d, interfaceC3810r3, z13, interfaceC3281e, z12, c2045y23, i7);
        }
    }

    /* renamed from: c */
    public static final void m3128c(C3173d c3173d, C3173d c3173d2, C3173d c3173d3, InterfaceC3281e interfaceC3281e, boolean z7, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        InterfaceC3277a interfaceC3277a2;
        boolean z12;
        boolean z13;
        boolean z14;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        InterfaceC3281e interfaceC3281e2 = interfaceC3281e;
        c2395p.m3859a0(-1427075886);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c3173d2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(c3173d3)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i8 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3874i(interfaceC3281e2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i8 |= i11;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3872h(z7)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i8 |= i10;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3277a)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            z11 = z7;
            interfaceC3277a2 = interfaceC3277a;
        } else {
            int i15 = 458752 & i8;
            if (i15 == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i8 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z8 | z9;
            int i16 = 57344 & i8;
            if (i16 == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (z16 || m3847O == c2413u0) {
                m3847O = new C1891f3(interfaceC3277a, interfaceC3281e2, z7);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, c3807o);
            InterfaceC3510j.f16935d.getClass();
            int i17 = i8;
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
            c3173d.mo22d(c2395p, Integer.valueOf(i17 & 14));
            c3173d2.mo22d(c2395p, Integer.valueOf((i17 >> 3) & 14));
            InterfaceC3810r m393c = AbstractC0172a.m393c(c3807o, "icon");
            C3802j c3802j = C3795c.f17964e;
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(c3802j, false);
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m393c);
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
            c3173d3.mo22d(c2395p, Integer.valueOf((i17 >> 6) & 14));
            c2395p.m3888r(true);
            c2395p.m3857Z(1087198243);
            if (interfaceC3281e != null) {
                InterfaceC3810r m393c2 = AbstractC0172a.m393c(c3807o, "label");
                if (i16 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i15 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = z13 | z14;
                Object m3847O2 = c2395p.m3847O();
                if (!z17 && m3847O2 != c2413u0) {
                    z11 = z7;
                    interfaceC3277a2 = interfaceC3277a;
                } else {
                    z11 = z7;
                    interfaceC3277a2 = interfaceC3277a;
                    m3847O2 = new C1882e3(0, interfaceC3277a2, z11);
                    c2395p.m3877j0(m3847O2);
                }
                InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0168a.m384a(m393c2, (InterfaceC3279c) m3847O2), f11378b / 2, 0.0f, 2);
                InterfaceC3217l0 m4853e2 = AbstractC3144n.m4853e(c3802j, false);
                int hashCode3 = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m3 = c2395p.m3882m();
                InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m339j);
                c2395p.m3863c0();
                if (c2395p.f13485S) {
                    c2395p.m3880l(c3558z);
                } else {
                    c2395p.m3883m0();
                }
                AbstractC2418w.m3954C(m4853e2, c2395p, c3504h);
                AbstractC2418w.m3954C(m3882m3, c2395p, c3504h2);
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode3))) {
                    AbstractC2487d.m4050n(hashCode3, c2395p, hashCode3, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c3, c2395p, c3504h4);
                interfaceC3281e2 = interfaceC3281e;
                interfaceC3281e2.mo22d(c2395p, Integer.valueOf((i17 >> 9) & 14));
                z12 = true;
                c2395p.m3888r(true);
            } else {
                interfaceC3281e2 = interfaceC3281e;
                z11 = z7;
                interfaceC3277a2 = interfaceC3277a;
                z12 = true;
            }
            c2395p.m3888r(false);
            c2395p.m3888r(z12);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1900g3(c3173d, c3173d2, c3173d3, interfaceC3281e2, z11, interfaceC3277a2, i7);
        }
    }
}
