package p063i0;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.FillElement;
import p000a.AbstractC0000a;
import p001a0.C0062p0;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0466d;
import p027d1.C0467e;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0664l;
import p035e1.C0660j;
import p035e1.C0677s;
import p049g1.InterfaceC1570d;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p078k0.AbstractC2256y;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p137s.C3081j;
import p140s2.C3098h;
import p140s2.EnumC3103m;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p161v0.C3469p;
import p170w1.AbstractC3674f1;
import p174w5.AbstractC3784a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.k5 */
/* loaded from: classes.dex */
public final class C1936k5 {

    /* renamed from: a */
    public static final C1936k5 f11432a = new Object();

    /* renamed from: b */
    public static final float f11433b;

    /* renamed from: c */
    public static final float f11434c;

    /* renamed from: d */
    public static final C0660j f11435d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i0.k5] */
    static {
        float f7 = AbstractC2256y.f13085e;
        f11433b = f7;
        f11434c = f7;
        f11435d = AbstractC0664l.m1445a();
    }

    /* renamed from: c */
    public static C1893f5 m3134c(C2395p c2395p) {
        C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
        C1893f5 c1893f5 = c2003t0.f11804V;
        if (c1893f5 == null) {
            float f7 = AbstractC2256y.f13081a;
            C1893f5 c1893f52 = new C1893f5(AbstractC2019v0.m3195d(c2003t0, 26), AbstractC2019v0.m3195d(c2003t0, 26), AbstractC2019v0.m3195d(c2003t0, 32), AbstractC2019v0.m3195d(c2003t0, 32), AbstractC2019v0.m3195d(c2003t0, 26), AbstractC0659i0.m1410j(C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)), c2003t0.f11822p), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)), C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, 18)), C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, 18)), C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)));
            c2003t0.f11804V = c1893f52;
            return c1893f52;
        }
        return c1893f5;
    }

    /* renamed from: d */
    public static void m3135d(InterfaceC1570d interfaceC1570d, long j6, long j7, long j8, float f7, float f8) {
        long m2973a = AbstractC1793a0.m2973a(f7, f7);
        long m2973a2 = AbstractC1793a0.m2973a(f8, f8);
        C0465c m3d = AbstractC0000a.m3d(AbstractC3784a.m5797a(C0464b.m1008d(j6), 0.0f), AbstractC1793a0.m2975c(C0467e.m1026d(j7), C0467e.m1024b(j7)));
        C0466d c0466d = new C0466d(m3d.f1625a, m3d.f1626b, m3d.f1627c, m3d.f1628d, m2973a, m2973a2, m2973a2, m2973a);
        C0660j c0660j = f11435d;
        C0660j.m1427a(c0660j, c0466d);
        InterfaceC1570d.m2539P(interfaceC1570d, c0660j, j8, null, 60);
        c0660j.f2151a.rewind();
    }

    /* renamed from: a */
    public final void m3136a(C3081j c3081j, InterfaceC3810r interfaceC3810r, C1893f5 c1893f5, boolean z7, long j6, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        long j7;
        InterfaceC3810r interfaceC3810r2;
        boolean z8;
        long j8;
        long j9;
        long j10;
        InterfaceC3810r interfaceC3810r3;
        c2395p.m3859a0(-290277409);
        if (c2395p.m3870g(c3081j)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8 | 48;
        if (c2395p.m3870g(c1893f5)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i12 = i11 | i9;
        if (c2395p.m3872h(z7)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i13 = i12 | i10 | 24576;
        if ((74899 & i13) == 74898 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            j10 = j6;
        } else {
            c2395p.m3854W();
            if ((i7 & 1) != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3810r2 = interfaceC3810r;
                j7 = j6;
            } else {
                j7 = AbstractC2000s5.f11763c;
                interfaceC3810r2 = C3807o.f17991a;
            }
            c2395p.m3889s();
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = new C3469p();
                c2395p.m3877j0(m3847O);
            }
            C3469p c3469p = (C3469p) m3847O;
            if ((i13 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object m3847O2 = c2395p.m3847O();
            if (z8 || m3847O2 == c2413u0) {
                m3847O2 = new C0062p0(c3081j, c3469p, (InterfaceC2313c) null, 26);
                c2395p.m3877j0(m3847O2);
            }
            AbstractC2418w.m3965g(c3081j, c2395p, (InterfaceC3281e) m3847O2);
            if (!c3469p.isEmpty()) {
                float m4780b = C3098h.m4780b(j7) / 2;
                float m4779a = C3098h.m4779a(j7);
                j8 = (Float.floatToRawIntBits(m4780b) << 32) | (Float.floatToRawIntBits(m4779a) & 4294967295L);
            } else {
                j8 = j7;
            }
            FillElement fillElement = AbstractC0155c.f658a;
            InterfaceC3810r m324g = AbstractC0145a.m324g(AbstractC0155c.m354m(interfaceC3810r2, C3098h.m4780b(j8), C3098h.m4779a(j8)), c3081j);
            if (z7) {
                j9 = c1893f5.f11188a;
            } else {
                j9 = c1893f5.f11193f;
            }
            float f7 = AbstractC2256y.f13081a;
            AbstractC3122c.m4828a(c2395p, AbstractC0145a.m319b(m324g, j9, AbstractC1884e5.m3117a(5, c2395p)));
            j10 = j7;
            interfaceC3810r3 = interfaceC3810r2;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1942l3(this, c3081j, interfaceC3810r3, c1893f5, z7, j10, i7);
        }
    }

    /* renamed from: b */
    public final void m3137b(C2016u5 c2016u5, InterfaceC3810r interfaceC3810r, boolean z7, C1893f5 c1893f5, InterfaceC3281e interfaceC3281e, InterfaceC3282f interfaceC3282f, float f7, float f8, C2395p c2395p, int i7) {
        int i8;
        boolean z8;
        boolean z9;
        float f9;
        float f10;
        int i9;
        InterfaceC3810r interfaceC3810r2;
        InterfaceC3281e interfaceC3281e2;
        InterfaceC3282f interfaceC3282f2;
        long j6;
        InterfaceC3282f interfaceC3282f3;
        long j7;
        float f11;
        boolean z10;
        boolean z11;
        boolean z12;
        InterfaceC3810r interfaceC3810r3;
        InterfaceC3810r interfaceC3810r4;
        float f12;
        InterfaceC3282f interfaceC3282f4;
        float f13;
        C2395p c2395p2;
        float f14;
        float f15;
        InterfaceC3281e interfaceC3281e3;
        InterfaceC3282f interfaceC3282f5;
        InterfaceC3810r interfaceC3810r5;
        int i10;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(49984771);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c2016u5)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i8 = i13 | i7;
        } else {
            i8 = i7;
        }
        int i14 = i8 | 48;
        if ((i7 & 384) == 0) {
            if (c2395p.m3872h(z7)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i14 |= i12;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c1893f5)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i14 |= i11;
        }
        if ((i7 & 24576) == 0) {
            i14 |= 8192;
        }
        int i15 = i14 | 14352384;
        if ((100663296 & i7) == 0) {
            if (c2395p.m3870g(this)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i15 |= i10;
        }
        if ((38347923 & i15) == 38347922 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r5 = interfaceC3810r;
            interfaceC3281e3 = interfaceC3281e;
            interfaceC3282f5 = interfaceC3282f;
            f14 = f7;
            f15 = f8;
            c2395p2 = c2395p;
        } else {
            c2395p.m3854W();
            int i16 = i7 & 1;
            C2413u0 c2413u0 = C2375k.f13421a;
            if (i16 != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                interfaceC3281e2 = interfaceC3281e;
                interfaceC3282f2 = interfaceC3282f;
                f9 = f7;
                f10 = f8;
                i9 = i15 & (-57345);
                interfaceC3810r2 = interfaceC3810r;
            } else {
                if ((((i15 & 7168) ^ 3072) > 2048 && c2395p.m3870g(c1893f5)) || (i15 & 3072) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i15 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z13 = z9 | z8;
                Object m3847O = c2395p.m3847O();
                if (z13 || m3847O == c2413u0) {
                    m3847O = new C1911h5(c1893f5, z7);
                    c2395p.m3877j0(m3847O);
                }
                InterfaceC3281e interfaceC3281e4 = (InterfaceC3281e) m3847O;
                C2043y0 c2043y0 = C2043y0.f12164i;
                f9 = AbstractC2000s5.f11764d;
                f10 = AbstractC2000s5.f11765e;
                i9 = i15 & (-57345);
                interfaceC3810r2 = C3807o.f17991a;
                interfaceC3281e2 = interfaceC3281e4;
                interfaceC3282f2 = c2043y0;
            }
            c2395p.m3889s();
            int i17 = i9;
            long m3119a = c1893f5.m3119a(z7, false);
            float f16 = f9;
            long m3119a2 = c1893f5.m3119a(z7, true);
            if (z7) {
                j6 = c1893f5.f11192e;
            } else {
                j6 = c1893f5.f11197j;
            }
            if (z7) {
                interfaceC3282f3 = interfaceC3282f2;
                j7 = c1893f5.f11190c;
            } else {
                interfaceC3282f3 = interfaceC3282f2;
                j7 = c1893f5.f11195h;
            }
            InterfaceC3810r interfaceC3810r6 = interfaceC3810r2;
            InterfaceC3810r m347f = AbstractC0155c.m347f(AbstractC0155c.m346e(interfaceC3810r2, 1.0f), AbstractC2000s5.f11761a);
            float f17 = f10;
            if (c2395p.m3878k(AbstractC3674f1.f17523n) == EnumC3103m.f15704f) {
                f11 = 180.0f;
            } else {
                f11 = 0.0f;
            }
            InterfaceC3810r m19t = AbstractC0000a.m19t(m347f, f11);
            boolean m3874i = c2395p.m3874i(c2016u5) | c2395p.m3868f(m3119a) | c2395p.m3868f(m3119a2) | c2395p.m3868f(j6) | c2395p.m3868f(j7);
            if ((i17 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z10 | m3874i;
            if ((i17 & 29360128) == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m3870g = z14 | z11 | c2395p.m3870g(interfaceC3281e2);
            if ((i17 & 458752) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = m3870g | z12;
            Object m3847O2 = c2395p.m3847O();
            if (!z15 && m3847O2 != c2413u0) {
                f12 = f16;
                interfaceC3282f4 = interfaceC3282f3;
                interfaceC3810r3 = interfaceC3810r6;
                f13 = f17;
                c2395p2 = c2395p;
                interfaceC3810r4 = m19t;
            } else {
                interfaceC3810r3 = interfaceC3810r6;
                interfaceC3810r4 = m19t;
                long j8 = j6;
                long j9 = j7;
                f12 = f16;
                interfaceC3282f4 = interfaceC3282f3;
                f13 = f17;
                c2395p2 = c2395p;
                C1920i5 c1920i5 = new C1920i5(c2016u5, m3119a, m3119a2, j8, j9, f12, f13, interfaceC3281e2, interfaceC3282f4);
                c2395p2.m3877j0(c1920i5);
                m3847O2 = c1920i5;
            }
            AbstractC2080d.m3388a(0, c2395p2, (InterfaceC3279c) m3847O2, interfaceC3810r4);
            f14 = f12;
            f15 = f13;
            interfaceC3281e3 = interfaceC3281e2;
            interfaceC3282f5 = interfaceC3282f4;
            interfaceC3810r5 = interfaceC3810r3;
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1928j5(this, c2016u5, interfaceC3810r5, z7, c1893f5, interfaceC3281e3, interfaceC3282f5, f14, f15, i7);
        }
    }
}
