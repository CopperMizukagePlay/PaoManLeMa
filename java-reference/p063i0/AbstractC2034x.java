package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.WeakHashMap;
import p001a0.C0074s0;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p039e5.AbstractC1104n1;
import p050g2.C1604o0;
import p071j0.AbstractC2152t;
import p078k0.AbstractC2230c0;
import p085l0.AbstractC2418w;
import p085l0.C2336a0;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2484b0;
import p092m.AbstractC2487d;
import p100n.AbstractC2638e;
import p100n.AbstractC2699z;
import p100n.C2686u;
import p140s2.C3096f;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p144t.AbstractC3144n;
import p144t.C3120b;
import p144t.C3129f0;
import p144t.C3161v0;
import p144t.InterfaceC3128f;
import p144t.InterfaceC3132h;
import p144t.InterfaceC3159u0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3802j;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.x */
/* loaded from: classes.dex */
public abstract class AbstractC2034x {

    /* renamed from: a */
    public static final float f12092a;

    /* renamed from: b */
    public static final float f12093b;

    static {
        new C2686u(0.8f, 0.0f, 0.8f, 0.15f);
        float f7 = 4;
        f12092a = f7;
        f12093b = 16 - f7;
    }

    /* renamed from: a */
    public static final void m3201a(InterfaceC3810r interfaceC3810r, C1604o0 c1604o0, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, float f7, InterfaceC3159u0 interfaceC3159u0, C1886e7 c1886e7, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        boolean z8;
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
        C3173d c3173d = AbstractC1104n1.f6138e;
        c2395p.m3859a0(-342194911);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i8 = i18 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i8 |= i17;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3870g(c1604o0)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i8 |= i16;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3872h(false)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i8 |= i15;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i8 |= i14;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(interfaceC3282f)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i8 |= i13;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3864d(f7)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i8 |= i12;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3870g(interfaceC3159u0)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i8 |= i11;
        }
        if ((100663296 & i7) == 0) {
            if (c2395p.m3870g(c1886e7)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i8 |= i10;
        }
        if ((805306368 & i7) == 0) {
            if (c2395p.m3870g(null)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i8 |= i9;
        }
        if ((306783379 & i8) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else if (!Float.isNaN(f7) && f7 != Float.POSITIVE_INFINITY) {
            float mo4526y = ((InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h)).mo4526y(f7);
            if (mo4526y < 0.0f) {
                mo4526y = 0.0f;
            }
            int i19 = i8 & 1879048192;
            if (i19 == 536870912) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean m3864d = c2395p.m3864d(mo4526y) | z7;
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3864d || m3847O == c2413u0) {
                m3847O = new C2011u0(0, 12);
                c2395p.m3877j0(m3847O);
            }
            AbstractC2418w.m3967i((InterfaceC3277a) m3847O, c2395p);
            if (i19 == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object m3847O2 = c2395p.m3847O();
            if (z8 || m3847O2 == c2413u0) {
                m3847O2 = AbstractC2418w.m3974q(new C2011u0(0, 13));
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC2390n2 m4035a = AbstractC2484b0.m4035a(AbstractC0659i0.m1415o(c1886e7.f11157a, c1886e7.f11158b, AbstractC2699z.f14499c.mo1295a(((Number) ((InterfaceC2390n2) m3847O2).getValue()).floatValue())), AbstractC2638e.m4231q(5, null), c2395p, 48);
            C3173d m4873d = AbstractC3178i.m4873d(1370231018, new C0074s0(2, interfaceC3282f), c2395p);
            c2395p.m3857Z(-1193605157);
            c2395p.m3888r(false);
            AbstractC2048y5.m3210a(interfaceC3810r.mo5829e(C3807o.f17991a), null, ((C0677s) m4035a.getValue()).f2211a, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(-1943739546, new C1994s(interfaceC3159u0, f7, c1886e7, c1604o0, interfaceC3281e, m4873d), c2395p), c2395p, 12582912, 122);
        } else {
            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2002t(interfaceC3810r, c1604o0, interfaceC3281e, interfaceC3282f, f7, interfaceC3159u0, c1886e7, i7);
        }
    }

    /* renamed from: b */
    public static final void m3202b(InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, float f7, InterfaceC3159u0 interfaceC3159u0, C1886e7 c1886e7, C2395p c2395p, int i7) {
        int i8;
        int i9;
        InterfaceC3159u0 interfaceC3159u02;
        float f8;
        InterfaceC3282f interfaceC3282f2;
        InterfaceC3159u0 interfaceC3159u03;
        InterfaceC3281e interfaceC3281e2;
        InterfaceC3810r interfaceC3810r2;
        C3173d c3173d = AbstractC1104n1.f6134a;
        c2395p.m3859a0(226148675);
        int i10 = i7 | 93616;
        if (c2395p.m3870g(c1886e7)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i11 = i10 | i8 | 12582912;
        if ((4793491 & i11) == 4793490 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r2 = interfaceC3810r;
            interfaceC3281e2 = interfaceC3281e;
            interfaceC3282f2 = interfaceC3282f;
            interfaceC3159u03 = interfaceC3159u0;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i9 = i11 & (-458753);
                interfaceC3159u02 = interfaceC3159u0;
            } else {
                interfaceC3281e = AbstractC2051z0.f12197a;
                interfaceC3282f = AbstractC2051z0.f12198b;
                f7 = AbstractC1895f7.f11201a;
                WeakHashMap weakHashMap = C3161v0.f15846u;
                C3129f0 c3129f0 = new C3129f0(C3120b.m4822e(c2395p).f15853g, AbstractC3122c.f15762g | 16);
                i9 = i11 & (-458753);
                interfaceC3810r = C3807o.f17991a;
                interfaceC3159u02 = c3129f0;
            }
            int i12 = i9;
            InterfaceC3810r interfaceC3810r3 = interfaceC3810r;
            InterfaceC3281e interfaceC3281e3 = interfaceC3281e;
            InterfaceC3282f interfaceC3282f3 = interfaceC3282f;
            c2395p.m3889s();
            C1604o0 m3125a = AbstractC1913h7.m3125a(AbstractC2230c0.f12847c, c2395p);
            if (!C3096f.m4776a(f7, Float.NaN) && !C3096f.m4776a(f7, Float.POSITIVE_INFINITY)) {
                f8 = f7;
            } else {
                f8 = AbstractC1895f7.f11201a;
            }
            m3201a(interfaceC3810r3, m3125a, interfaceC3281e3, interfaceC3282f3, f8, interfaceC3159u02, c1886e7, c2395p, ((i12 << 6) & 234881024) | 805530678);
            interfaceC3282f2 = interfaceC3282f3;
            interfaceC3159u03 = interfaceC3159u02;
            interfaceC3281e2 = interfaceC3281e3;
            interfaceC3810r2 = interfaceC3810r3;
        }
        float f9 = f7;
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1994s(interfaceC3810r2, interfaceC3281e2, interfaceC3282f2, f9, interfaceC3159u03, c1886e7, i7);
        }
    }

    /* renamed from: c */
    public static final void m3203c(InterfaceC3810r interfaceC3810r, C1986r c1986r, long j6, long j7, long j8, C1604o0 c1604o0, InterfaceC3132h interfaceC3132h, InterfaceC3128f interfaceC3128f, InterfaceC3281e interfaceC3281e, C3173d c3173d, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        C2395p c2395p2;
        long j9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean m3874i;
        int i20;
        int i21;
        C3173d c3173d2 = c3173d;
        C3173d c3173d3 = AbstractC1104n1.f6138e;
        c2395p.m3859a0(-742442296);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i9 = i21 | i7;
        } else {
            i9 = i7;
        }
        int i22 = 16;
        if ((i7 & 48) == 0) {
            if ((i7 & 64) == 0) {
                m3874i = c2395p.m3870g(c1986r);
            } else {
                m3874i = c2395p.m3874i(c1986r);
            }
            if (m3874i) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i9 |= i20;
        }
        int i23 = 128;
        if ((i7 & 384) == 0) {
            if (c2395p.m3868f(j6)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i9 |= i19;
        }
        int i24 = 1024;
        int i25 = i9;
        if ((i7 & 3072) == 0) {
            if (c2395p.m3868f(j7)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i25 |= i18;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3868f(j8)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i25 |= i17;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3874i(c3173d3)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i25 |= i16;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3870g(c1604o0)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i25 |= i15;
        }
        if ((12582912 & i7) == 0) {
            if (c2395p.m3864d(1.0f)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i25 |= i14;
        }
        if ((100663296 & i7) == 0) {
            if (c2395p.m3870g(interfaceC3132h)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i25 |= i13;
        }
        if ((i7 & 805306368) == 0) {
            if (c2395p.m3870g(interfaceC3128f)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i25 |= i12;
        }
        if ((i8 & 6) == 0) {
            if (c2395p.m3866e(0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3872h(false)) {
                i22 = 32;
            }
            i10 |= i22;
        }
        if ((i8 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i23 = 256;
            }
            i10 |= i23;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p.m3874i(c3173d2)) {
                i24 = 2048;
            }
            i10 |= i24;
        }
        int i26 = i10;
        if ((i25 & 306783379) == 306783378 && (i26 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
            j9 = j8;
        } else {
            if ((i25 & 112) != 32 && ((i25 & 64) == 0 || !c2395p.m3874i(c1986r))) {
                z7 = false;
            } else {
                z7 = true;
            }
            if ((i25 & 1879048192) == 536870912) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z11 = z8 | z7;
            if ((i25 & 234881024) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z12 = z11 | z9;
            if ((i26 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z13 = z12 | z10;
            Object m3847O = c2395p.m3847O();
            if (z13 || m3847O == C2375k.f13421a) {
                m3847O = new C2018v(c1986r, interfaceC3128f, interfaceC3132h, 0);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3217l0 interfaceC3217l0 = (InterfaceC3217l0) m3847O;
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
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
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m393c = AbstractC0172a.m393c(c3807o, "navigationIcon");
            float f7 = f12092a;
            InterfaceC3810r m340k = AbstractC0154b.m340k(m393c, f7, 0.0f, 0.0f, 0.0f, 14);
            C3802j c3802j = C3795c.f17964e;
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(c3802j, false);
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m340k);
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
            C2336a0 c2336a0 = AbstractC1862c1.f10996a;
            AbstractC2418w.m3959a(c2336a0.mo3716a(new C0677s(j6)), interfaceC3281e, c2395p, ((i26 >> 3) & 112) | 8);
            c2395p.m3888r(true);
            InterfaceC3810r m385b = AbstractC0168a.m385b(AbstractC0154b.m339j(AbstractC0172a.m393c(c3807o, "title"), f7, 0.0f, 2).mo5829e(c3807o), 0.0f, null, 131067);
            InterfaceC3217l0 m4853e2 = AbstractC3144n.m4853e(c3802j, false);
            int hashCode3 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m3 = c2395p.m3882m();
            InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m385b);
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
            int i27 = i25 >> 9;
            AbstractC2152t.m3496b(j7, c1604o0, c3173d3, c2395p, (i27 & 14) | ((i25 >> 15) & 112) | (i27 & 896));
            c2395p2 = c2395p;
            c2395p2.m3888r(true);
            InterfaceC3810r m340k2 = AbstractC0154b.m340k(AbstractC0172a.m393c(c3807o, "actionIcons"), 0.0f, 0.0f, f7, 0.0f, 11);
            InterfaceC3217l0 m4853e3 = AbstractC3144n.m4853e(c3802j, false);
            int hashCode4 = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m4 = c2395p2.m3882m();
            InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p2, m340k2);
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e3, c2395p2, c3504h);
            AbstractC2418w.m3954C(m3882m4, c2395p2, c3504h2);
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode4))) {
                AbstractC2487d.m4050n(hashCode4, c2395p2, hashCode4, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c4, c2395p2, c3504h4);
            j9 = j8;
            c3173d2 = c3173d;
            AbstractC2418w.m3959a(c2336a0.mo3716a(new C0677s(j9)), c3173d2, c2395p2, 8 | ((i26 >> 6) & 112));
            c2395p2.m3888r(true);
            c2395p2.m3888r(true);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2026w(interfaceC3810r, c1986r, j6, j7, j9, c1604o0, interfaceC3132h, interfaceC3128f, interfaceC3281e, c3173d2, i7, i8);
        }
    }
}
