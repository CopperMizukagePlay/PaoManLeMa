package p049g1;

import p001a0.C0031h1;
import p035e1.AbstractC0670o;
import p035e1.C0654g;
import p035e1.C0660j;
import p035e1.C0666m;
import p060h5.AbstractC1793a0;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g1.d */
/* loaded from: classes.dex */
public interface InterfaceC1570d extends InterfaceC3093c {
    /* renamed from: D */
    static /* synthetic */ void m2535D(InterfaceC1570d interfaceC1570d, long j6, long j7, long j8, float f7, int i7) {
        long j9;
        float f8;
        int i8;
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        long j10 = j7;
        if ((i7 & 4) != 0) {
            j9 = m2544x0(interfaceC1570d.mo2546c(), j10);
        } else {
            j9 = j8;
        }
        if ((i7 & 8) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f7;
        }
        if ((i7 & 64) != 0) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        interfaceC1570d.mo2531j0(j6, j10, j9, f8, i8);
    }

    /* renamed from: F */
    static /* synthetic */ void m2536F(InterfaceC1570d interfaceC1570d, long j6, long j7, long j8, long j9, AbstractC1571e abstractC1571e, int i7) {
        long j10;
        if ((i7 & 2) != 0) {
            j10 = 0;
        } else {
            j10 = j7;
        }
        interfaceC1570d.mo2533r0(j6, j10, j8, j9, abstractC1571e);
    }

    /* renamed from: G */
    static void m2537G(C3508i0 c3508i0, AbstractC0670o abstractC0670o, long j6, long j7, long j8, AbstractC1571e abstractC1571e, int i7) {
        long j9;
        AbstractC1571e abstractC1571e2;
        if ((i7 & 2) != 0) {
            j6 = 0;
        }
        long j10 = j6;
        if ((i7 & 4) != 0) {
            j9 = m2544x0(c3508i0.f16933e.mo2546c(), j10);
        } else {
            j9 = j7;
        }
        if ((i7 & 32) != 0) {
            abstractC1571e2 = C1573g.f10187a;
        } else {
            abstractC1571e2 = abstractC1571e;
        }
        c3508i0.m5463f(abstractC0670o, j10, j9, j8, 1.0f, abstractC1571e2);
    }

    /* renamed from: J */
    static void m2538J(C3508i0 c3508i0, AbstractC0670o abstractC0670o, long j6, long j7, float f7, AbstractC1571e abstractC1571e, int i7) {
        float f8;
        AbstractC1571e abstractC1571e2;
        if ((i7 & 2) != 0) {
            j6 = 0;
        }
        long j8 = j6;
        if ((i7 & 4) != 0) {
            j7 = m2544x0(c3508i0.f16933e.mo2546c(), j8);
        }
        long j9 = j7;
        if ((i7 & 8) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f7;
        }
        if ((i7 & 16) != 0) {
            abstractC1571e2 = C1573g.f10187a;
        } else {
            abstractC1571e2 = abstractC1571e;
        }
        c3508i0.m5462e(abstractC0670o, j8, j9, f8, abstractC1571e2);
    }

    /* renamed from: P */
    static /* synthetic */ void m2539P(InterfaceC1570d interfaceC1570d, C0660j c0660j, long j6, C1574h c1574h, int i7) {
        AbstractC1571e abstractC1571e = c1574h;
        if ((i7 & 8) != 0) {
            abstractC1571e = C1573g.f10187a;
        }
        interfaceC1570d.mo2526b0(c0660j, j6, abstractC1571e);
    }

    /* renamed from: R */
    static /* synthetic */ void m2540R(InterfaceC1570d interfaceC1570d, long j6, float f7, long j7, AbstractC1571e abstractC1571e, int i7) {
        if ((i7 & 4) != 0) {
            j7 = interfaceC1570d.mo2545Y();
        }
        long j8 = j7;
        if ((i7 & 16) != 0) {
            abstractC1571e = C1573g.f10187a;
        }
        interfaceC1570d.mo2532k(j6, f7, j8, abstractC1571e);
    }

    /* renamed from: T */
    static /* synthetic */ void m2541T(InterfaceC1570d interfaceC1570d, C0660j c0660j, AbstractC0670o abstractC0670o, float f7, C1574h c1574h, int i7) {
        int i8;
        if ((i7 & 4) != 0) {
            f7 = 1.0f;
        }
        float f8 = f7;
        AbstractC1571e abstractC1571e = c1574h;
        if ((i7 & 8) != 0) {
            abstractC1571e = C1573g.f10187a;
        }
        AbstractC1571e abstractC1571e2 = abstractC1571e;
        if ((i7 & 32) != 0) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        interfaceC1570d.mo2523B(c0660j, abstractC0670o, f8, abstractC1571e2, i8);
    }

    /* renamed from: d0 */
    static void m2542d0(InterfaceC1570d interfaceC1570d, C0654g c0654g, long j6, long j7, float f7, C0666m c0666m, int i7, int i8) {
        long j8;
        float f8;
        int i9;
        if ((i8 & 16) != 0) {
            j8 = j6;
        } else {
            j8 = j7;
        }
        if ((i8 & 32) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f7;
        }
        if ((i8 & 512) != 0) {
            i9 = 1;
        } else {
            i9 = i7;
        }
        interfaceC1570d.mo2530i(c0654g, 0L, j6, j8, f8, c0666m, i9);
    }

    /* renamed from: m */
    static /* synthetic */ void m2543m(InterfaceC1570d interfaceC1570d, long j6, long j7, long j8, float f7, int i7, int i8) {
        int i9;
        if ((i8 & 16) != 0) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        interfaceC1570d.mo2525W(j6, j7, j8, f7, i9);
    }

    /* renamed from: x0 */
    static long m2544x0(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* renamed from: B */
    void mo2523B(C0660j c0660j, AbstractC0670o abstractC0670o, float f7, AbstractC1571e abstractC1571e, int i7);

    /* renamed from: E */
    C0031h1 mo2524E();

    /* renamed from: W */
    void mo2525W(long j6, long j7, long j8, float f7, int i7);

    /* renamed from: Y */
    default long mo2545Y() {
        return AbstractC1793a0.m2990r(mo2524E().m109x());
    }

    /* renamed from: b0 */
    void mo2526b0(C0660j c0660j, long j6, AbstractC1571e abstractC1571e);

    /* renamed from: c */
    default long mo2546c() {
        return mo2524E().m109x();
    }

    EnumC3103m getLayoutDirection();

    /* renamed from: i */
    void mo2530i(C0654g c0654g, long j6, long j7, long j8, float f7, C0666m c0666m, int i7);

    /* renamed from: j0 */
    void mo2531j0(long j6, long j7, long j8, float f7, int i7);

    /* renamed from: k */
    void mo2532k(long j6, float f7, long j7, AbstractC1571e abstractC1571e);

    /* renamed from: r0 */
    void mo2533r0(long j6, long j7, long j8, long j9, AbstractC1571e abstractC1571e);

    /* renamed from: u */
    void mo2534u(long j6, float f7, float f8, long j7, long j8, AbstractC1571e abstractC1571e);
}
