package p162v1;

import p001a0.C0031h1;
import p035e1.AbstractC0670o;
import p035e1.C0654g;
import p035e1.C0660j;
import p035e1.C0666m;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1571e;
import p049g1.C1567a;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p057h1.C1752b;
import p067i4.AbstractC2072e;
import p092m.AbstractC2487d;
import p101n0.C2705e;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.i0 */
/* loaded from: classes.dex */
public final class C3508i0 implements InterfaceC1570d {

    /* renamed from: e */
    public final C1568b f16933e = new C1568b();

    /* renamed from: f */
    public InterfaceC3522n f16934f;

    @Override // p049g1.InterfaceC1570d
    /* renamed from: B */
    public final void mo2523B(C0660j c0660j, AbstractC0670o abstractC0670o, float f7, AbstractC1571e abstractC1571e, int i7) {
        this.f16933e.mo2523B(c0660j, abstractC0670o, f7, abstractC1571e, i7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: E */
    public final C0031h1 mo2524E() {
        return this.f16933e.f10182f;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f16933e.mo4511H(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f16933e.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f16933e.mo4513Q(f7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: W */
    public final void mo2525W(long j6, long j7, long j8, float f7, int i7) {
        this.f16933e.mo2525W(j6, j7, j8, f7, i7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: Y */
    public final long mo2545Y() {
        return this.f16933e.mo2545Y();
    }

    /* renamed from: a */
    public final void m5460a() {
        C1568b c1568b = this.f16933e;
        InterfaceC0674q m106u = c1568b.f10182f.m106u();
        InterfaceC3516l interfaceC3516l = this.f16934f;
        if (interfaceC3516l != null) {
            AbstractC3809q abstractC3809q = (AbstractC3809q) interfaceC3516l;
            AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e.f17997j;
            if (abstractC3809q2 != null && (abstractC3809q2.f17995h & 4) != 0) {
                while (abstractC3809q2 != null) {
                    int i7 = abstractC3809q2.f17994g;
                    if ((i7 & 2) != 0) {
                        break;
                    } else if ((i7 & 4) != 0) {
                        break;
                    } else {
                        abstractC3809q2 = abstractC3809q2.f17997j;
                    }
                }
            }
            abstractC3809q2 = null;
            if (abstractC3809q2 != null) {
                C2705e c2705e = null;
                while (abstractC3809q2 != null) {
                    if (abstractC3809q2 instanceof InterfaceC3522n) {
                        InterfaceC3522n interfaceC3522n = (InterfaceC3522n) abstractC3809q2;
                        C1752b c1752b = (C1752b) c1568b.f10182f.f153g;
                        AbstractC3497e1 m5380t = AbstractC3498f.m5380t(interfaceC3522n, 4);
                        long m3347y = AbstractC2072e.m3347y(m5380t.f16055g);
                        C3502g0 c3502g0 = m5380t.f16847s;
                        c3502g0.getClass();
                        ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getSharedDrawScope().m5461d(m106u, m3347y, m5380t, interfaceC3522n, c1752b);
                    } else if ((abstractC3809q2.f17994g & 4) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                        int i8 = 0;
                        for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                            if ((abstractC3809q3.f17994g & 4) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    abstractC3809q2 = abstractC3809q3;
                                } else {
                                    if (c2705e == null) {
                                        c2705e = new C2705e(new AbstractC3809q[16]);
                                    }
                                    if (abstractC3809q2 != null) {
                                        c2705e.m4300b(abstractC3809q2);
                                        abstractC3809q2 = null;
                                    }
                                    c2705e.m4300b(abstractC3809q3);
                                }
                            }
                        }
                        if (i8 == 1) {
                        }
                    }
                    abstractC3809q2 = AbstractC3498f.m5366f(c2705e);
                }
                return;
            }
            AbstractC3497e1 m5380t2 = AbstractC3498f.m5380t(interfaceC3516l, 4);
            if (m5380t2.mo5333V0() == abstractC3809q.f17992e) {
                m5380t2 = m5380t2.f16848t;
                AbstractC3367j.m5097b(m5380t2);
            }
            m5380t2.mo5348k1(m106u, (C1752b) c1568b.f10182f.f153g);
            return;
        }
        throw AbstractC2487d.m4041e("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f16933e.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16933e.mo559b();
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: b0 */
    public final void mo2526b0(C0660j c0660j, long j6, AbstractC1571e abstractC1571e) {
        this.f16933e.mo2526b0(c0660j, j6, abstractC1571e);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: c */
    public final long mo2546c() {
        return this.f16933e.mo2546c();
    }

    /* renamed from: d */
    public final void m5461d(InterfaceC0674q interfaceC0674q, long j6, AbstractC3497e1 abstractC3497e1, InterfaceC3522n interfaceC3522n, C1752b c1752b) {
        InterfaceC3522n interfaceC3522n2 = this.f16934f;
        this.f16934f = interfaceC3522n;
        EnumC3103m enumC3103m = abstractC3497e1.f16847s.f16866C;
        C1568b c1568b = this.f16933e;
        C0031h1 c0031h1 = c1568b.f10182f;
        C1567a c1567a = ((C1568b) c0031h1.f154h).f10181e;
        InterfaceC3093c interfaceC3093c = c1567a.f10177a;
        EnumC3103m enumC3103m2 = c1567a.f10178b;
        InterfaceC0674q m106u = c0031h1.m106u();
        C0031h1 c0031h12 = c1568b.f10182f;
        long m109x = c0031h12.m109x();
        C1752b c1752b2 = (C1752b) c0031h12.f153g;
        c0031h12.m84H(abstractC3497e1);
        c0031h12.m85I(enumC3103m);
        c0031h12.m83G(interfaceC0674q);
        c0031h12.m86J(j6);
        c0031h12.f153g = c1752b;
        interfaceC0674q.mo1341m();
        try {
            interfaceC3522n.mo555f(this);
            interfaceC0674q.mo1338j();
            c0031h12.m84H(interfaceC3093c);
            c0031h12.m85I(enumC3103m2);
            c0031h12.m83G(m106u);
            c0031h12.m86J(m109x);
            c0031h12.f153g = c1752b2;
            this.f16934f = interfaceC3522n2;
        } catch (Throwable th) {
            interfaceC0674q.mo1338j();
            c0031h12.m84H(interfaceC3093c);
            c0031h12.m85I(enumC3103m2);
            c0031h12.m83G(m106u);
            c0031h12.m86J(m109x);
            c0031h12.f153g = c1752b2;
            throw th;
        }
    }

    /* renamed from: e */
    public final void m5462e(AbstractC0670o abstractC0670o, long j6, long j7, float f7, AbstractC1571e abstractC1571e) {
        C1568b c1568b = this.f16933e;
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        c1568b.f10181e.f10179c.mo1334f(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat(i8) + Float.intBitsToFloat((int) (j7 & 4294967295L)), c1568b.m2527d(abstractC0670o, abstractC1571e, f7, null, 3, 1));
    }

    /* renamed from: f */
    public final void m5463f(AbstractC0670o abstractC0670o, long j6, long j7, long j8, float f7, AbstractC1571e abstractC1571e) {
        C1568b c1568b = this.f16933e;
        int i7 = (int) (j6 >> 32);
        int i8 = (int) (j6 & 4294967295L);
        c1568b.f10181e.f10179c.mo1340l(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), c1568b.m2527d(abstractC0670o, abstractC1571e, f7, null, 3, 1));
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f16933e.mo4518f0(j6);
    }

    @Override // p049g1.InterfaceC1570d
    public final EnumC3103m getLayoutDirection() {
        return this.f16933e.f10181e.f10178b;
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: i */
    public final void mo2530i(C0654g c0654g, long j6, long j7, long j8, float f7, C0666m c0666m, int i7) {
        this.f16933e.mo2530i(c0654g, j6, j7, j8, f7, c0666m, i7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: j0 */
    public final void mo2531j0(long j6, long j7, long j8, float f7, int i7) {
        this.f16933e.mo2531j0(j6, j7, j8, f7, i7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: k */
    public final void mo2532k(long j6, float f7, long j7, AbstractC1571e abstractC1571e) {
        this.f16933e.mo2532k(j6, f7, j7, abstractC1571e);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16933e.mo560l();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f16933e.mo4521n0(f7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: r0 */
    public final void mo2533r0(long j6, long j7, long j8, long j9, AbstractC1571e abstractC1571e) {
        this.f16933e.mo2533r0(j6, j7, j8, j9, abstractC1571e);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f16933e.mo4522t0(i7);
    }

    @Override // p049g1.InterfaceC1570d
    /* renamed from: u */
    public final void mo2534u(long j6, float f7, float f8, long j7, long j8, AbstractC1571e abstractC1571e) {
        this.f16933e.mo2534u(j6, f7, f8, j7, j8, abstractC1571e);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f16933e.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return f7 / this.f16933e.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f16933e.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f16933e.mo559b() * f7;
    }
}
