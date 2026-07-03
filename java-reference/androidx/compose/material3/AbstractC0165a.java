package androidx.compose.material3;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.AbstractC0150f;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.C0153a;
import androidx.compose.foundation.selection.AbstractC0161b;
import p028d2.C0474g;
import p035e1.AbstractC0659i0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p035e1.InterfaceC0667m0;
import p063i0.AbstractC1884e5;
import p063i0.AbstractC1957n2;
import p063i0.AbstractC1999s4;
import p063i0.AbstractC2019v0;
import p063i0.C1849a6;
import p063i0.C1967o4;
import p063i0.C2003t0;
import p063i0.C2056z5;
import p078k0.AbstractC2257z;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p100n.C2661l1;
import p100n.C2669o0;
import p100n.InterfaceC2697y;
import p137s.C3081j;
import p137s.InterfaceC3080i;
import p144t.AbstractC3144n;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.material3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0165a {

    /* renamed from: a */
    public static final float f735a;

    /* renamed from: b */
    public static final float f736b;

    /* renamed from: c */
    public static final float f737c;

    /* renamed from: d */
    public static final float f738d;

    /* renamed from: e */
    public static final float f739e;

    /* renamed from: f */
    public static final C2669o0 f740f;

    /* renamed from: g */
    public static final C2661l1 f741g;

    static {
        float f7 = AbstractC2257z.f13087b;
        f735a = f7;
        f736b = AbstractC2257z.f13092g;
        f737c = AbstractC2257z.f13091f;
        float f8 = AbstractC2257z.f13089d;
        f738d = f8;
        f739e = (f8 - f7) / 2;
        f740f = new C2669o0(0);
        f741g = new C2661l1(100, (InterfaceC2697y) null, 6);
    }

    /* renamed from: a */
    public static final void m376a(boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, boolean z8, C2056z5 c2056z5, C2395p c2395p, int i7) {
        int i8;
        C2056z5 c2056z52;
        int i9;
        int i10;
        int i11;
        InterfaceC3810r interfaceC3810r2;
        C2056z5 c2056z53;
        InterfaceC3810r interfaceC3810r3;
        int i12;
        int i13;
        int i14;
        c2395p.m3859a0(1580463220);
        if ((i7 & 6) == 0) {
            if (c2395p.m3872h(z7)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i8 = i14 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3874i(interfaceC3279c)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i8 |= i13;
        }
        int i15 = i8 | 3456;
        if ((i7 & 24576) == 0) {
            if (c2395p.m3872h(z8)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i15 |= i12;
        }
        if ((196608 & i7) == 0) {
            i15 |= 65536;
        }
        int i16 = i15 | 1572864;
        if ((599187 & i16) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3810r3 = interfaceC3810r;
            c2056z53 = c2056z5;
        } else {
            c2395p.m3854W();
            int i17 = i7 & 1;
            InterfaceC3810r interfaceC3810r4 = C3807o.f17991a;
            if (i17 != 0 && !c2395p.m3834B()) {
                c2395p.m3852U();
                i11 = i16 & (-458753);
                interfaceC3810r2 = interfaceC3810r;
                c2056z52 = c2056z5;
            } else {
                C2003t0 c2003t0 = (C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a);
                c2056z52 = c2003t0.f11805W;
                long j6 = c2003t0.f11822p;
                if (c2056z52 == null) {
                    float f7 = AbstractC2257z.f13086a;
                    long m3195d = AbstractC2019v0.m3195d(c2003t0, 10);
                    long m3195d2 = AbstractC2019v0.m3195d(c2003t0, 26);
                    long j7 = C0677s.f2208f;
                    i10 = -458753;
                    i9 = i16;
                    C2056z5 c2056z54 = new C2056z5(m3195d, m3195d2, j7, AbstractC2019v0.m3195d(c2003t0, 11), AbstractC2019v0.m3195d(c2003t0, 24), AbstractC2019v0.m3195d(c2003t0, 39), AbstractC2019v0.m3195d(c2003t0, 24), AbstractC2019v0.m3195d(c2003t0, 39), AbstractC0659i0.m1410j(C0677s.m1453b(1.0f, AbstractC2019v0.m3195d(c2003t0, 35)), j6), AbstractC0659i0.m1410j(C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, 18)), j6), j7, AbstractC0659i0.m1410j(C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)), j6), AbstractC0659i0.m1410j(C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 18)), j6), AbstractC0659i0.m1410j(C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, 39)), j6), AbstractC0659i0.m1410j(C0677s.m1453b(0.12f, AbstractC2019v0.m3195d(c2003t0, 18)), j6), AbstractC0659i0.m1410j(C0677s.m1453b(0.38f, AbstractC2019v0.m3195d(c2003t0, 39)), j6));
                    c2003t0.f11805W = c2056z54;
                    c2056z52 = c2056z54;
                } else {
                    i9 = i16;
                    i10 = -458753;
                }
                i11 = i9 & i10;
                interfaceC3810r2 = interfaceC3810r4;
            }
            int i18 = i11;
            c2395p.m3889s();
            c2395p.m3857Z(783532531);
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = new C3081j();
                c2395p.m3877j0(m3847O);
            }
            C3081j c3081j = (C3081j) m3847O;
            c2395p.m3888r(false);
            if (interfaceC3279c != null) {
                C2394o2 c2394o2 = AbstractC1957n2.f11577a;
                interfaceC3810r4 = AbstractC0161b.m372b(MinimumInteractiveModifier.f732a, z7, c3081j, z8, new C0474g(2), interfaceC3279c);
            }
            InterfaceC3810r m351j = AbstractC0155c.m351j(AbstractC0155c.m360s(interfaceC3810r2.mo5829e(interfaceC3810r4), C3795c.f17968i), f737c, f738d);
            float f8 = AbstractC2257z.f13086a;
            int i19 = i18 << 3;
            C2056z5 c2056z55 = c2056z52;
            m377b(m351j, z7, z8, c2056z55, c3081j, AbstractC1884e5.m3117a(5, c2395p), c2395p, (i19 & 112) | ((i18 >> 6) & 896) | (i19 & 57344));
            c2056z53 = c2056z55;
            interfaceC3810r3 = interfaceC3810r2;
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1967o4(z7, interfaceC3279c, interfaceC3810r3, z8, c2056z53, i7, 1);
        }
    }

    /* renamed from: b */
    public static final void m377b(InterfaceC3810r interfaceC3810r, boolean z7, boolean z8, C2056z5 c2056z5, InterfaceC3080i interfaceC3080i, InterfaceC0667m0 interfaceC0667m0, C2395p c2395p, int i7) {
        int i8;
        long j6;
        long j7;
        long j8;
        long j9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c2395p.m3859a0(-1594099146);
        if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
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
            if (c2395p.m3872h(z8)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i8 |= i13;
        }
        if ((i7 & 3072) == 0) {
            if (c2395p.m3870g(c2056z5)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i8 |= i12;
        }
        if ((i7 & 24576) == 0) {
            if (c2395p.m3874i(null)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i8 |= i11;
        }
        if ((196608 & i7) == 0) {
            if (c2395p.m3870g(interfaceC3080i)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i8 |= i10;
        }
        if ((1572864 & i7) == 0) {
            if (c2395p.m3870g(interfaceC0667m0)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i8 |= i9;
        }
        if ((i8 & 599187) == 599186 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            if (z8) {
                if (z7) {
                    j6 = c2056z5.f12214b;
                } else {
                    j6 = c2056z5.f12218f;
                }
            } else if (z7) {
                j6 = c2056z5.f12222j;
            } else {
                j6 = c2056z5.f12226n;
            }
            if (z8) {
                if (z7) {
                    j7 = c2056z5.f12213a;
                } else {
                    j7 = c2056z5.f12217e;
                }
            } else if (z7) {
                j7 = c2056z5.f12221i;
            } else {
                j7 = c2056z5.f12225m;
            }
            long j10 = j7;
            float f7 = AbstractC2257z.f13086a;
            InterfaceC0667m0 m3117a = AbstractC1884e5.m3117a(5, c2395p);
            float f8 = AbstractC2257z.f13090e;
            if (z8) {
                j8 = j6;
                if (z7) {
                    j9 = c2056z5.f12215c;
                } else {
                    j9 = c2056z5.f12219g;
                }
            } else {
                j8 = j6;
                if (z7) {
                    j9 = c2056z5.f12223k;
                } else {
                    j9 = c2056z5.f12227o;
                }
            }
            InterfaceC3810r m319b = AbstractC0145a.m319b(interfaceC3810r.mo5829e(new BorderModifierNodeElement(f8, new C0671o0(j9), m3117a)), j8, m3117a);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m319b);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4853e, c2395p, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p, c3504h4);
            InterfaceC3810r m319b2 = AbstractC0145a.m319b(AbstractC0150f.m326a(C0153a.f657a.m329a(C3795c.f17967h).mo5829e(new ThumbElement(interfaceC3080i, z7)), interfaceC3080i, AbstractC1999s4.m3176a(false, AbstractC2257z.f13088c / 2, 0L, c2395p, 54, 4)), j10, interfaceC0667m0);
            InterfaceC3217l0 m4853e2 = AbstractC3144n.m4853e(C3795c.f17968i, false);
            int hashCode2 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m319b2);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e2, c2395p, c3504h);
            AbstractC2418w.m3954C(m3882m2, c2395p, c3504h2);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode2))) {
                AbstractC2487d.m4050n(hashCode2, c2395p, hashCode2, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c2, c2395p, c3504h4);
            c2395p.m3857Z(1163457794);
            c2395p.m3888r(false);
            c2395p.m3888r(true);
            c2395p.m3888r(true);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1849a6(interfaceC3810r, z7, z8, c2056z5, interfaceC3080i, interfaceC0667m0, i7);
        }
    }
}
