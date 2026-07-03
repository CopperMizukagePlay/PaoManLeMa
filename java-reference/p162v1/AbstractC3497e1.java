package p162v1;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import p001a0.C0031h1;
import p001a0.C0068q2;
import p027d1.C0463a;
import p027d1.C0464b;
import p027d1.C0465c;
import p027d1.C0466d;
import p035e1.AbstractC0655g0;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0664l;
import p035e1.AbstractC0683y;
import p035e1.C0647c0;
import p035e1.C0649d0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.C0660j;
import p035e1.C0661j0;
import p035e1.C0675q0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p035e1.InterfaceC0682x;
import p049g1.C1568b;
import p057h1.C1752b;
import p057h1.InterfaceC1754d;
import p060h5.AbstractC1806n;
import p063i0.C1879e0;
import p063i0.C2028w1;
import p067i4.AbstractC2072e;
import p068i5.AbstractC2080d;
import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p077k.C2184c0;
import p077k.C2223y;
import p092m.AbstractC2487d;
import p101n0.C2705e;
import p117p1.InterfaceC2852f;
import p139s1.AbstractC3088a;
import p140s2.C3100j;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3191c1;
import p146t1.C3211j0;
import p146t1.C3216l;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;
import p170w1.AbstractC3681h0;
import p170w1.C3710o1;
import p170w1.C3728t;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC3497e1 extends AbstractC3526o0 implements InterfaceC3214k0, InterfaceC3238v, InterfaceC3527o1 {

    /* renamed from: O */
    public static final C0661j0 f16828O;

    /* renamed from: P */
    public static final C3543u f16829P;

    /* renamed from: Q */
    public static final float[] f16830Q;

    /* renamed from: R */
    public static final C3492d f16831R;

    /* renamed from: S */
    public static final C3492d f16832S;

    /* renamed from: B */
    public InterfaceC3220m0 f16834B;

    /* renamed from: C */
    public C2182b0 f16835C;

    /* renamed from: E */
    public float f16837E;

    /* renamed from: F */
    public C0463a f16838F;

    /* renamed from: G */
    public C3543u f16839G;

    /* renamed from: H */
    public C1752b f16840H;

    /* renamed from: I */
    public InterfaceC0674q f16841I;

    /* renamed from: J */
    public C1879e0 f16842J;

    /* renamed from: L */
    public boolean f16844L;

    /* renamed from: M */
    public InterfaceC3521m1 f16845M;

    /* renamed from: N */
    public C1752b f16846N;

    /* renamed from: s */
    public final C3502g0 f16847s;

    /* renamed from: t */
    public AbstractC3497e1 f16848t;

    /* renamed from: u */
    public AbstractC3497e1 f16849u;

    /* renamed from: v */
    public boolean f16850v;

    /* renamed from: w */
    public boolean f16851w;

    /* renamed from: x */
    public InterfaceC3279c f16852x;

    /* renamed from: y */
    public InterfaceC3093c f16853y;

    /* renamed from: z */
    public EnumC3103m f16854z;

    /* renamed from: A */
    public float f16833A = 0.8f;

    /* renamed from: D */
    public long f16836D = 0;

    /* renamed from: K */
    public final C3494d1 f16843K = new C3494d1(this, 1);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e1.j0] */
    static {
        ?? obj = new Object();
        obj.f2155f = 1.0f;
        obj.f2156g = 1.0f;
        obj.f2157h = 1.0f;
        long j6 = AbstractC0683y.f2215a;
        obj.f2161l = j6;
        obj.f2162m = j6;
        obj.f2164o = 8.0f;
        obj.f2165p = C0675q0.f2200b;
        obj.f2166q = AbstractC0659i0.f2147a;
        obj.f2168s = 9205357640488583168L;
        obj.f2169t = AbstractC2080d.m3389b();
        obj.f2170u = EnumC3103m.f15703e;
        obj.f2171v = 3;
        f16828O = obj;
        f16829P = new C3543u();
        f16830Q = C0647c0.m1350a();
        f16831R = new C3492d(1);
        f16832S = new C3492d(2);
    }

    public AbstractC3497e1(C3502g0 c3502g0) {
        this.f16847s = c3502g0;
        this.f16853y = c3502g0.f16865B;
        this.f16854z = c3502g0.f16866C;
    }

    /* renamed from: p1 */
    public static AbstractC3497e1 m5314p1(InterfaceC3238v interfaceC3238v) {
        C3211j0 c3211j0;
        AbstractC3497e1 abstractC3497e1;
        if (interfaceC3238v instanceof C3211j0) {
            c3211j0 = (C3211j0) interfaceC3238v;
        } else {
            c3211j0 = null;
        }
        if (c3211j0 != null && (abstractC3497e1 = c3211j0.f15983e.f16985s) != null) {
            return abstractC3497e1;
        }
        AbstractC3367j.m5098c(interfaceC3238v, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC3497e1) interfaceC3238v;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: B0 */
    public final boolean mo5316B0() {
        if (this.f16834B != null) {
            return true;
        }
        return false;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: C */
    public final long mo4922C(long j6) {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return m5342e1(AbstractC3191c1.m4897h(this), ((C3728t) AbstractC3511j0.m5464a(this.f16847s)).m5733H(j6));
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: C0 */
    public final C3502g0 mo5317C0() {
        return this.f16847s;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: D0 */
    public final InterfaceC3220m0 mo5318D0() {
        InterfaceC3220m0 interfaceC3220m0 = this.f16834B;
        if (interfaceC3220m0 != null) {
            return interfaceC3220m0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: E0 */
    public final AbstractC3526o0 mo5319E0() {
        return this.f16849u;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: F0 */
    public final long mo5320F0() {
        return this.f16836D;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: J0 */
    public final void mo5321J0() {
        C1752b c1752b = this.f16846N;
        if (c1752b != null) {
            mo4958m0(this.f16836D, this.f16837E, c1752b);
        } else {
            mo4940o0(this.f16836D, this.f16837E, this.f16852x);
        }
    }

    /* renamed from: K0 */
    public final void m5322K0(AbstractC3497e1 abstractC3497e1, C0463a c0463a, boolean z7) {
        if (abstractC3497e1 != this) {
            AbstractC3497e1 abstractC3497e12 = this.f16849u;
            if (abstractC3497e12 != null) {
                abstractC3497e12.m5322K0(abstractC3497e1, c0463a, z7);
            }
            long j6 = this.f16836D;
            float f7 = (int) (j6 >> 32);
            c0463a.f1619a -= f7;
            c0463a.f1621c -= f7;
            float f8 = (int) (j6 & 4294967295L);
            c0463a.f1620b -= f8;
            c0463a.f1622d -= f8;
            InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
            if (interfaceC3521m1 != null) {
                C3710o1 c3710o1 = (C3710o1) interfaceC3521m1;
                float[] m5708a = c3710o1.m5708a();
                if (!c3710o1.f17648w) {
                    if (m5708a == null) {
                        c0463a.f1619a = 0.0f;
                        c0463a.f1620b = 0.0f;
                        c0463a.f1621c = 0.0f;
                        c0463a.f1622d = 0.0f;
                    } else {
                        C0647c0.m1352c(m5708a, c0463a);
                    }
                }
                if (this.f16851w && z7) {
                    long j7 = this.f16055g;
                    c0463a.m1003a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                }
            }
        }
    }

    /* renamed from: L0 */
    public final long m5323L0(AbstractC3497e1 abstractC3497e1, long j6) {
        if (abstractC3497e1 == this) {
            return j6;
        }
        AbstractC3497e1 abstractC3497e12 = this.f16849u;
        if (abstractC3497e12 != null && !AbstractC3367j.m5096a(abstractC3497e1, abstractC3497e12)) {
            return m5330S0(abstractC3497e12.m5323L0(abstractC3497e1, j6));
        }
        return m5330S0(j6);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: M */
    public final boolean mo4923M() {
        return mo5333V0().f18005r;
    }

    /* renamed from: M0 */
    public final long m5324M0(long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - mo4956k0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - mo4955i0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: N */
    public final void mo4924N(float[] fArr) {
        InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(this.f16847s);
        AbstractC3497e1 m5314p1 = m5314p1(AbstractC3191c1.m4897h(this));
        m5356t1(m5314p1, fArr);
        if (m5464a instanceof InterfaceC2852f) {
            ((C3728t) ((InterfaceC2852f) m5464a)).m5745t(fArr);
            return;
        }
        long mo4931d = m5314p1.mo4931d(0L);
        if ((9223372034707292159L & mo4931d) != 9205357640488583168L) {
            C0647c0.m1355f(fArr, Float.intBitsToFloat((int) (mo4931d >> 32)), Float.intBitsToFloat((int) (mo4931d & 4294967295L)));
        }
    }

    /* renamed from: N0 */
    public final float m5325N0(long j6, long j7) {
        float mo4956k0;
        float mo4955i0;
        if (mo4956k0() >= Float.intBitsToFloat((int) (j7 >> 32)) && mo4955i0() >= Float.intBitsToFloat((int) (j7 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m5324M0 = m5324M0(j7);
        float intBitsToFloat = Float.intBitsToFloat((int) (m5324M0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m5324M0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
        if (intBitsToFloat3 < 0.0f) {
            mo4956k0 = -intBitsToFloat3;
        } else {
            mo4956k0 = intBitsToFloat3 - mo4956k0();
        }
        float max = Math.max(0.0f, mo4956k0);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            mo4955i0 = -intBitsToFloat4;
        } else {
            mo4955i0 = intBitsToFloat4 - mo4955i0();
        }
        float max2 = Math.max(0.0f, mo4955i0);
        long floatToRawIntBits = (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i7 = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i7) <= intBitsToFloat) {
                int i8 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i8) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i7);
                    float intBitsToFloat6 = Float.intBitsToFloat(i8);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: O */
    public final void mo4925O(InterfaceC3238v interfaceC3238v, float[] fArr) {
        AbstractC3497e1 m5314p1 = m5314p1(interfaceC3238v);
        m5314p1.m5343f1();
        AbstractC3497e1 m5329R0 = m5329R0(m5314p1);
        C0647c0.m1353d(fArr);
        m5314p1.m5356t1(m5329R0, fArr);
        m5355s1(m5329R0, fArr);
    }

    /* renamed from: O0 */
    public final void m5326O0(InterfaceC0674q interfaceC0674q, C1752b c1752b) {
        boolean z7;
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            C3710o1 c3710o1 = (C3710o1) interfaceC3521m1;
            C1568b c1568b = c3710o1.f17642q;
            c3710o1.m5713f();
            if (c3710o1.f17630e.f10663a.mo2818G() > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            c3710o1.f17649x = z7;
            C0031h1 c0031h1 = c1568b.f10182f;
            c0031h1.m83G(interfaceC0674q);
            c0031h1.f153g = c1752b;
            AbstractC3784a.m5803g(c1568b, c3710o1.f17630e);
            return;
        }
        long j6 = this.f16836D;
        float f7 = (int) (j6 >> 32);
        float f8 = (int) (j6 & 4294967295L);
        interfaceC0674q.mo1336h(f7, f8);
        m5327P0(interfaceC0674q, c1752b);
        interfaceC0674q.mo1336h(-f7, -f8);
    }

    /* renamed from: P0 */
    public final void m5327P0(InterfaceC0674q interfaceC0674q, C1752b c1752b) {
        InterfaceC0674q interfaceC0674q2;
        C1752b c1752b2;
        AbstractC3809q m5334W0 = m5334W0(4);
        if (m5334W0 == null) {
            mo5348k1(interfaceC0674q, c1752b);
            return;
        }
        C3502g0 c3502g0 = this.f16847s;
        c3502g0.getClass();
        C3508i0 sharedDrawScope = ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getSharedDrawScope();
        long m3347y = AbstractC2072e.m3347y(this.f16055g);
        sharedDrawScope.getClass();
        C2705e c2705e = null;
        while (m5334W0 != null) {
            if (m5334W0 instanceof InterfaceC3522n) {
                interfaceC0674q2 = interfaceC0674q;
                c1752b2 = c1752b;
                sharedDrawScope.m5461d(interfaceC0674q2, m3347y, this, (InterfaceC3522n) m5334W0, c1752b2);
            } else {
                interfaceC0674q2 = interfaceC0674q;
                c1752b2 = c1752b;
                if ((m5334W0.f17994g & 4) != 0 && (m5334W0 instanceof AbstractC3519m)) {
                    int i7 = 0;
                    for (AbstractC3809q abstractC3809q = ((AbstractC3519m) m5334W0).f16962t; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
                        if ((abstractC3809q.f17994g & 4) != 0) {
                            i7++;
                            if (i7 == 1) {
                                m5334W0 = abstractC3809q;
                            } else {
                                if (c2705e == null) {
                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                }
                                if (m5334W0 != null) {
                                    c2705e.m4300b(m5334W0);
                                    m5334W0 = null;
                                }
                                c2705e.m4300b(abstractC3809q);
                            }
                        }
                    }
                    if (i7 == 1) {
                        interfaceC0674q = interfaceC0674q2;
                        c1752b = c1752b2;
                    }
                }
            }
            m5334W0 = AbstractC3498f.m5366f(c2705e);
            interfaceC0674q = interfaceC0674q2;
            c1752b = c1752b2;
        }
    }

    /* renamed from: Q0 */
    public abstract void mo5328Q0();

    /* renamed from: R0 */
    public final AbstractC3497e1 m5329R0(AbstractC3497e1 abstractC3497e1) {
        C3502g0 c3502g0 = abstractC3497e1.f16847s;
        C3502g0 c3502g02 = this.f16847s;
        if (c3502g0 == c3502g02) {
            AbstractC3809q mo5333V0 = abstractC3497e1.mo5333V0();
            AbstractC3809q mo5333V02 = mo5333V0();
            if (!mo5333V02.f17992e.f18005r) {
                AbstractC3088a.m4750b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC3809q abstractC3809q = mo5333V02.f17992e.f17996i; abstractC3809q != null; abstractC3809q = abstractC3809q.f17996i) {
                if ((abstractC3809q.f17994g & 2) != 0 && abstractC3809q == mo5333V0) {
                    return abstractC3497e1;
                }
            }
            return this;
        }
        while (c3502g0.f16898s > c3502g02.f16898s) {
            c3502g0 = c3502g0.m5447u();
            AbstractC3367j.m5097b(c3502g0);
        }
        C3502g0 c3502g03 = c3502g02;
        while (c3502g03.f16898s > c3502g0.f16898s) {
            c3502g03 = c3502g03.m5447u();
            AbstractC3367j.m5097b(c3502g03);
        }
        while (c3502g0 != c3502g03) {
            c3502g0 = c3502g0.m5447u();
            c3502g03 = c3502g03.m5447u();
            if (c3502g0 == null || c3502g03 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c3502g03 != c3502g02) {
            if (c3502g0 != abstractC3497e1.f16847s) {
                return c3502g0.f16872I.f16799c;
            }
            return abstractC3497e1;
        }
        return this;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: S */
    public final long mo4926S() {
        return this.f16055g;
    }

    /* renamed from: S0 */
    public final long m5330S0(long j6) {
        long j7 = this.f16836D;
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - ((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - ((int) (j7 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            return ((C3710o1) interfaceC3521m1).m5710c(floatToRawIntBits, true);
        }
        return floatToRawIntBits;
    }

    /* renamed from: T0 */
    public abstract AbstractC3529p0 mo5331T0();

    @Override // p146t1.InterfaceC3238v
    /* renamed from: U */
    public final long mo4927U(long j6) {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m5343f1();
        for (AbstractC3497e1 abstractC3497e1 = this; abstractC3497e1 != null; abstractC3497e1 = abstractC3497e1.f16849u) {
            j6 = abstractC3497e1.m5353q1(j6);
        }
        return j6;
    }

    /* renamed from: U0 */
    public final long m5332U0() {
        return this.f16853y.mo4515a0(this.f16847s.f16867D.mo5295g());
    }

    /* renamed from: V0 */
    public abstract AbstractC3809q mo5333V0();

    /* renamed from: W0 */
    public final AbstractC3809q m5334W0(int i7) {
        boolean m5393g = AbstractC3500f1.m5393g(i7);
        AbstractC3809q mo5333V0 = mo5333V0();
        if (m5393g || (mo5333V0 = mo5333V0.f17996i) != null) {
            for (AbstractC3809q m5335X0 = m5335X0(m5393g); m5335X0 != null && (m5335X0.f17995h & i7) != 0; m5335X0 = m5335X0.f17997j) {
                if ((m5335X0.f17994g & i7) != 0) {
                    return m5335X0;
                }
                if (m5335X0 == mo5333V0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: X */
    public final long mo4928X(InterfaceC3238v interfaceC3238v, long j6) {
        return m5342e1(interfaceC3238v, j6);
    }

    /* renamed from: X0 */
    public final AbstractC3809q m5335X0(boolean z7) {
        AbstractC3809q mo5333V0;
        C3490c1 c3490c1 = this.f16847s.f16872I;
        if (c3490c1.f16800d == this) {
            return c3490c1.f16802f;
        }
        if (z7) {
            AbstractC3497e1 abstractC3497e1 = this.f16849u;
            if (abstractC3497e1 == null || (mo5333V0 = abstractC3497e1.mo5333V0()) == null) {
                return null;
            }
            return mo5333V0.f17997j;
        }
        AbstractC3497e1 abstractC3497e12 = this.f16849u;
        if (abstractC3497e12 == null) {
            return null;
        }
        return abstractC3497e12.mo5333V0();
    }

    /* renamed from: Y0 */
    public final void m5336Y0(AbstractC3809q abstractC3809q, C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7) {
        if (abstractC3809q == null) {
            mo5339b1(c3492d, j6, c3531q, i7, z7);
            return;
        }
        int i8 = c3531q.f17001g;
        C2184c0 c2184c0 = c3531q.f16999e;
        c3531q.m5500b(i8 + 1, c2184c0.f12629b);
        c3531q.f17001g++;
        c2184c0.m3556a(abstractC3809q);
        c3531q.f17000f.m3659a(AbstractC3498f.m5361a(-1.0f, z7, false));
        m5336Y0(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i7, z7);
        c3531q.f17001g = i8;
    }

    /* renamed from: Z0 */
    public final void m5337Z0(AbstractC3809q abstractC3809q, C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7, float f7) {
        if (abstractC3809q == null) {
            mo5339b1(c3492d, j6, c3531q, i7, z7);
            return;
        }
        int i8 = c3531q.f17001g;
        C2184c0 c2184c0 = c3531q.f16999e;
        c3531q.m5500b(i8 + 1, c2184c0.f12629b);
        c3531q.f17001g++;
        c2184c0.m3556a(abstractC3809q);
        c3531q.f17000f.m3659a(AbstractC3498f.m5361a(f7, z7, false));
        m5347j1(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i7, z7, f7, true);
        c3531q.f17001g = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (p162v1.AbstractC3498f.m5368h(r18.m5499a(), p162v1.AbstractC3498f.m5361a(r2, r7, false)) > 0) goto L38;
     */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5338a1(C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7) {
        float f7;
        boolean z8;
        boolean z9;
        AbstractC3809q m5334W0 = m5334W0(c3492d.m5313b());
        if (!m5359w1(j6)) {
            if (i7 == 1) {
                float m5325N0 = m5325N0(j6, m5332U0());
                if ((Float.floatToRawIntBits(m5325N0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c3531q.f17001g != AbstractC1806n.m3066N(c3531q)) {
                        if (AbstractC3498f.m5368h(c3531q.m5499a(), AbstractC3498f.m5361a(m5325N0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m5337Z0(m5334W0, c3492d, j6, c3531q, i7, false, m5325N0);
                    return;
                }
                return;
            }
            return;
        }
        if (m5334W0 == null) {
            mo5339b1(c3492d, j6, c3531q, i7, z7);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < mo4956k0() && intBitsToFloat2 < mo4955i0()) {
            m5336Y0(m5334W0, c3492d, j6, c3531q, i7, z7);
            return;
        }
        if (i7 == 1) {
            f7 = m5325N0(j6, m5332U0());
        } else {
            f7 = Float.POSITIVE_INFINITY;
        }
        if ((Float.floatToRawIntBits(f7) & Integer.MAX_VALUE) < 2139095040) {
            if (c3531q.f17001g == AbstractC1806n.m3066N(c3531q)) {
                z8 = z7;
            } else {
                z8 = z7;
            }
            z9 = true;
            m5347j1(m5334W0, c3492d, j6, c3531q, i7, z8, f7, z9);
        }
        z8 = z7;
        z9 = false;
        m5347j1(m5334W0, c3492d, j6, c3531q, i7, z8, f7, z9);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16847s.f16865B.mo559b();
    }

    /* renamed from: b1 */
    public void mo5339b1(C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7) {
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        if (abstractC3497e1 != null) {
            abstractC3497e1.m5338a1(c3492d, abstractC3497e1.m5330S0(j6), c3531q, i7, z7);
        }
    }

    /* renamed from: c1 */
    public final void m5340c1() {
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            interfaceC3521m1.invalidate();
            return;
        }
        AbstractC3497e1 abstractC3497e1 = this.f16849u;
        if (abstractC3497e1 != null) {
            abstractC3497e1.m5340c1();
        }
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: d */
    public final long mo4931d(long j6) {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((C3728t) AbstractC3511j0.m5464a(this.f16847s)).m5746u(mo4927U(j6));
    }

    /* renamed from: d1 */
    public final boolean m5341d1() {
        if (this.f16845M != null && this.f16833A <= 0.0f) {
            return true;
        }
        AbstractC3497e1 abstractC3497e1 = this.f16849u;
        if (abstractC3497e1 != null) {
            return abstractC3497e1.m5341d1();
        }
        return false;
    }

    /* renamed from: e1 */
    public final long m5342e1(InterfaceC3238v interfaceC3238v, long j6) {
        if (interfaceC3238v instanceof C3211j0) {
            C3211j0 c3211j0 = (C3211j0) interfaceC3238v;
            c3211j0.f15983e.f16985s.m5343f1();
            return c3211j0.m4930b(this, j6 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC3497e1 m5314p1 = m5314p1(interfaceC3238v);
        m5314p1.m5343f1();
        AbstractC3497e1 m5329R0 = m5329R0(m5314p1);
        while (m5314p1 != m5329R0) {
            j6 = m5314p1.m5353q1(j6);
            m5314p1 = m5314p1.f16849u;
            AbstractC3367j.m5097b(m5314p1);
        }
        return m5323L0(m5329R0, j6);
    }

    /* renamed from: f1 */
    public final void m5343f1() {
        this.f16847s.f16873J.m5466b();
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: g */
    public final long mo4932g(long j6) {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC3238v m4897h = AbstractC3191c1.m4897h(this);
        C3728t c3728t = (C3728t) AbstractC3511j0.m5464a(this.f16847s);
        c3728t.m5729D();
        return m5342e1(m4897h, C0464b.m1010f(C0647c0.m1351b(j6, c3728t.f17735a0), m4897h.mo4927U(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: g1 */
    public final void m5344g1() {
        InterfaceC3279c interfaceC3279c;
        AbstractC3809q abstractC3809q;
        boolean m5393g = AbstractC3500f1.m5393g(128);
        AbstractC3809q m5335X0 = m5335X0(m5393g);
        if (m5335X0 != null && (m5335X0.f17992e.f17995h & 128) != 0) {
            AbstractC3459f m5263d = AbstractC3470q.m5263d();
            if (m5263d != null) {
                interfaceC3279c = m5263d.mo5207e();
            } else {
                interfaceC3279c = null;
            }
            AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
            try {
                if (m5393g) {
                    abstractC3809q = mo5333V0();
                } else {
                    abstractC3809q = mo5333V0().f17996i;
                    if (abstractC3809q == null) {
                    }
                }
                for (AbstractC3809q m5335X02 = m5335X0(m5393g); m5335X02 != null; m5335X02 = m5335X02.f17997j) {
                    if ((m5335X02.f17995h & 128) == 0) {
                        break;
                    }
                    if ((m5335X02.f17994g & 128) != 0) {
                        AbstractC3519m abstractC3519m = m5335X02;
                        ?? r8 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3546v) {
                                ((InterfaceC3546v) abstractC3519m).mo205r(this.f16055g);
                            } else if ((abstractC3519m.f17994g & 128) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r8 = r8;
                                while (abstractC3809q2 != null) {
                                    if ((abstractC3809q2.f17994g & 128) != 0) {
                                        i7++;
                                        r8 = r8;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r8.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r8.m4300b(abstractC3809q2);
                                        }
                                    }
                                    abstractC3809q2 = abstractC3809q2.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r8 = r8;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = AbstractC3498f.m5366f(r8);
                        }
                    }
                    if (m5335X02 == abstractC3809q) {
                        break;
                    }
                }
            } finally {
                AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            }
        }
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f16847s.f16866C;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: h */
    public final long mo4933h(long j6) {
        long mo4927U = mo4927U(j6);
        C3728t c3728t = (C3728t) AbstractC3511j0.m5464a(this.f16847s);
        c3728t.m5729D();
        return C0647c0.m1351b(mo4927U, c3728t.f17734W);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: h1 */
    public final void m5345h1() {
        boolean m5393g = AbstractC3500f1.m5393g(128);
        AbstractC3809q mo5333V0 = mo5333V0();
        if (m5393g || (mo5333V0 = mo5333V0.f17996i) != null) {
            for (AbstractC3809q m5335X0 = m5335X0(m5393g); m5335X0 != null && (m5335X0.f17995h & 128) != 0; m5335X0 = m5335X0.f17997j) {
                if ((m5335X0.f17994g & 128) != 0) {
                    AbstractC3519m abstractC3519m = m5335X0;
                    ?? r52 = 0;
                    while (abstractC3519m != 0) {
                        if (abstractC3519m instanceof InterfaceC3546v) {
                            ((InterfaceC3546v) abstractC3519m).mo5300U(this);
                        } else if ((abstractC3519m.f17994g & 128) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                            AbstractC3809q abstractC3809q = abstractC3519m.f16962t;
                            int i7 = 0;
                            abstractC3519m = abstractC3519m;
                            r52 = r52;
                            while (abstractC3809q != null) {
                                if ((abstractC3809q.f17994g & 128) != 0) {
                                    i7++;
                                    r52 = r52;
                                    if (i7 == 1) {
                                        abstractC3519m = abstractC3809q;
                                    } else {
                                        if (r52 == 0) {
                                            r52 = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3519m != 0) {
                                            r52.m4300b(abstractC3519m);
                                            abstractC3519m = 0;
                                        }
                                        r52.m4300b(abstractC3809q);
                                    }
                                }
                                abstractC3809q = abstractC3809q.f17997j;
                                abstractC3519m = abstractC3519m;
                                r52 = r52;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC3519m = AbstractC3498f.m5366f(r52);
                    }
                }
                if (m5335X0 == mo5333V0) {
                    return;
                }
            }
        }
    }

    /* renamed from: i1 */
    public final void m5346i1() {
        this.f16850v = true;
        this.f16843K.mo52a();
        m5351n1();
        if (!C3100j.m4783a(this.f16836D, 0L)) {
            this.f16847s.m5413O();
        }
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: j */
    public final C0465c mo4934j(InterfaceC3238v interfaceC3238v, boolean z7) {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC3238v.mo4923M()) {
            AbstractC3088a.m4750b("LayoutCoordinates " + interfaceC3238v + " is not attached!");
        }
        AbstractC3497e1 m5314p1 = m5314p1(interfaceC3238v);
        m5314p1.m5343f1();
        AbstractC3497e1 m5329R0 = m5329R0(m5314p1);
        C0463a c0463a = this.f16838F;
        if (c0463a == null) {
            c0463a = new C0463a();
            this.f16838F = c0463a;
        }
        c0463a.f1619a = 0.0f;
        c0463a.f1620b = 0.0f;
        c0463a.f1621c = (int) (interfaceC3238v.mo4926S() >> 32);
        c0463a.f1622d = (int) (interfaceC3238v.mo4926S() & 4294967295L);
        while (m5314p1 != m5329R0) {
            m5314p1.m5350m1(c0463a, z7, false);
            if (c0463a.m1004b()) {
                return C0465c.f1624e;
            }
            m5314p1 = m5314p1.f16849u;
            AbstractC3367j.m5097b(m5314p1);
        }
        m5322K0(m5329R0, c0463a, z7);
        return new C0465c(c0463a.f1619a, c0463a.f1620b, c0463a.f1621c, c0463a.f1622d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v10, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* renamed from: j1 */
    public final void m5347j1(AbstractC3809q abstractC3809q, C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7, float f7, boolean z8) {
        int m5312a;
        int m5312a2;
        AbstractC3809q m5366f;
        if (abstractC3809q == null) {
            mo5339b1(c3492d, j6, c3531q, i7, z7);
            return;
        }
        int i8 = i7;
        boolean z9 = z7;
        if (i8 == 3 || i8 == 4) {
            AbstractC3519m abstractC3519m = abstractC3809q;
            C2705e c2705e = null;
            while (true) {
                if (abstractC3519m == 0) {
                    break;
                }
                if (abstractC3519m instanceof InterfaceC3539s1) {
                    long mo4541q = ((InterfaceC3539s1) abstractC3519m).mo4541q();
                    int i9 = (int) (j6 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i9);
                    C3502g0 c3502g0 = this.f16847s;
                    EnumC3103m enumC3103m = c3502g0.f16866C;
                    int i10 = AbstractC3560z1.f17109b;
                    long j7 = mo4541q & Long.MIN_VALUE;
                    EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
                    if (j7 != 0 && enumC3103m != enumC3103m2) {
                        m5312a = C3492d.m5312a(2, mo4541q);
                    } else {
                        m5312a = C3492d.m5312a(0, mo4541q);
                    }
                    if (intBitsToFloat >= (-m5312a)) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i9);
                        int mo4956k0 = mo4956k0();
                        EnumC3103m enumC3103m3 = c3502g0.f16866C;
                        if (j7 != 0 && enumC3103m3 != enumC3103m2) {
                            m5312a2 = C3492d.m5312a(0, mo4541q);
                        } else {
                            m5312a2 = C3492d.m5312a(2, mo4541q);
                        }
                        if (intBitsToFloat2 < mo4956k0 + m5312a2) {
                            int i11 = (int) (j6 & 4294967295L);
                            if (Float.intBitsToFloat(i11) >= (-C3492d.m5312a(1, mo4541q))) {
                                if (Float.intBitsToFloat(i11) < C3492d.m5312a(3, mo4541q) + mo4955i0()) {
                                    C2223y c2223y = c3531q.f17000f;
                                    C2184c0 c2184c0 = c3531q.f16999e;
                                    if (c3531q.f17001g == AbstractC1806n.m3066N(c3531q)) {
                                        int i12 = c3531q.f17001g;
                                        c3531q.m5500b(i12 + 1, c2184c0.f12629b);
                                        c3531q.f17001g++;
                                        c2184c0.m3556a(abstractC3809q);
                                        c2223y.m3659a(AbstractC3498f.m5361a(0.0f, z9, true));
                                        m5347j1(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i8, z9, f7, z8);
                                        c3531q.f17001g = i12;
                                        return;
                                    }
                                    long m5499a = c3531q.m5499a();
                                    int i13 = c3531q.f17001g;
                                    if (AbstractC3498f.m5376p(m5499a)) {
                                        int m3066N = AbstractC1806n.m3066N(c3531q);
                                        c3531q.f17001g = m3066N;
                                        c3531q.m5500b(m3066N + 1, c2184c0.f12629b);
                                        c3531q.f17001g++;
                                        c2184c0.m3556a(abstractC3809q);
                                        c2223y.m3659a(AbstractC3498f.m5361a(0.0f, z9, true));
                                        m5347j1(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i7, z9, f7, z8);
                                        c3531q.f17001g = m3066N;
                                        if (AbstractC3498f.m5372l(c3531q.m5499a()) < 0.0f) {
                                            c3531q.m5500b(i13 + 1, c3531q.f17001g + 1);
                                        }
                                        c3531q.f17001g = i13;
                                        return;
                                    }
                                    if (AbstractC3498f.m5372l(m5499a) > 0.0f) {
                                        int i14 = c3531q.f17001g;
                                        c3531q.m5500b(i14 + 1, c2184c0.f12629b);
                                        c3531q.f17001g++;
                                        c2184c0.m3556a(abstractC3809q);
                                        c2223y.m3659a(AbstractC3498f.m5361a(0.0f, z9, true));
                                        m5347j1(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i7, z9, f7, z8);
                                        c3531q.f17001g = i14;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int i15 = 16;
                    if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                        AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                        int i16 = 0;
                        m5366f = abstractC3519m;
                        c2705e = c2705e;
                        while (abstractC3809q2 != null) {
                            if ((abstractC3809q2.f17994g & 16) != 0) {
                                i16++;
                                c2705e = c2705e;
                                if (i16 == 1) {
                                    m5366f = abstractC3809q2;
                                } else {
                                    if (c2705e == null) {
                                        c2705e = new C2705e(new AbstractC3809q[i15]);
                                    }
                                    if (m5366f != null) {
                                        c2705e.m4300b(m5366f);
                                        m5366f = null;
                                    }
                                    c2705e.m4300b(abstractC3809q2);
                                }
                            }
                            abstractC3809q2 = abstractC3809q2.f17997j;
                            i15 = 16;
                            m5366f = m5366f;
                            c2705e = c2705e;
                        }
                        if (i16 == 1) {
                            i8 = i7;
                            z9 = z7;
                            abstractC3519m = m5366f;
                            c2705e = c2705e;
                        }
                    }
                    m5366f = AbstractC3498f.m5366f(c2705e);
                    i8 = i7;
                    z9 = z7;
                    abstractC3519m = m5366f;
                    c2705e = c2705e;
                }
            }
        }
        if (z8) {
            m5337Z0(abstractC3809q, c3492d, j6, c3531q, i7, z7, f7);
            return;
        }
        switch (c3492d.f16807e) {
            case 1:
                AbstractC3519m abstractC3519m2 = abstractC3809q;
                ?? r42 = 0;
                while (abstractC3519m2 != 0) {
                    if (abstractC3519m2 instanceof InterfaceC3539s1) {
                        ((InterfaceC3539s1) abstractC3519m2).mo5302s0();
                    } else if ((abstractC3519m2.f17994g & 16) != 0 && (abstractC3519m2 instanceof AbstractC3519m)) {
                        AbstractC3809q abstractC3809q3 = abstractC3519m2.f16962t;
                        int i17 = 0;
                        abstractC3519m2 = abstractC3519m2;
                        r42 = r42;
                        while (abstractC3809q3 != null) {
                            if ((abstractC3809q3.f17994g & 16) != 0) {
                                i17++;
                                r42 = r42;
                                if (i17 == 1) {
                                    abstractC3519m2 = abstractC3809q3;
                                } else {
                                    if (r42 == 0) {
                                        r42 = new C2705e(new AbstractC3809q[16]);
                                    }
                                    if (abstractC3519m2 != 0) {
                                        r42.m4300b(abstractC3519m2);
                                        abstractC3519m2 = 0;
                                    }
                                    r42.m4300b(abstractC3809q3);
                                }
                            }
                            abstractC3809q3 = abstractC3809q3.f17997j;
                            abstractC3519m2 = abstractC3519m2;
                            r42 = r42;
                        }
                        if (i17 == 1) {
                        }
                    }
                    abstractC3519m2 = AbstractC3498f.m5366f(r42);
                }
                break;
        }
        m5347j1(AbstractC3498f.m5365e(abstractC3809q, c3492d.m5313b()), c3492d, j6, c3531q, i7, z7, f7, false);
    }

    /* renamed from: k1 */
    public abstract void mo5348k1(InterfaceC0674q interfaceC0674q, C1752b c1752b);

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16847s.f16865B.mo560l();
    }

    /* renamed from: l1 */
    public final void m5349l1(long j6, float f7, InterfaceC3279c interfaceC3279c, C1752b c1752b) {
        C3502g0 c3502g0 = this.f16847s;
        if (c1752b != null) {
            if (interfaceC3279c != null) {
                AbstractC3088a.m4749a("both ways to create layers shouldn't be used together");
            }
            if (this.f16846N != c1752b) {
                this.f16846N = null;
                m5357u1(null, false);
                this.f16846N = c1752b;
            }
            if (this.f16845M == null) {
                InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g0);
                C1879e0 c1879e0 = this.f16842J;
                if (c1879e0 == null) {
                    C1879e0 c1879e02 = new C1879e0(13, this, new C3494d1(this, 0));
                    this.f16842J = c1879e02;
                    c1879e0 = c1879e02;
                }
                C3494d1 c3494d1 = this.f16843K;
                InterfaceC3521m1 m5739k = ((C3728t) m5464a).m5739k(c1879e0, c3494d1, c1752b);
                C3710o1 c3710o1 = (C3710o1) m5739k;
                c3710o1.m5712e(this.f16055g);
                c3710o1.m5711d(j6);
                this.f16845M = m5739k;
                c3502g0.f16876M = true;
                c3494d1.mo52a();
            }
        } else {
            if (this.f16846N != null) {
                this.f16846N = null;
                m5357u1(null, false);
            }
            m5357u1(interfaceC3279c, false);
        }
        if (!C3100j.m4783a(this.f16836D, j6)) {
            ((C3728t) AbstractC3511j0.m5464a(c3502g0)).m5738M(-4.0f);
            this.f16836D = j6;
            c3502g0.f16873J.f16953p.m5533y0();
            InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
            if (interfaceC3521m1 != null) {
                ((C3710o1) interfaceC3521m1).m5711d(j6);
            } else {
                AbstractC3497e1 abstractC3497e1 = this.f16849u;
                if (abstractC3497e1 != null) {
                    abstractC3497e1.m5340c1();
                }
            }
            c3502g0.m5413O();
            AbstractC3526o0.m5486H0(this);
            InterfaceC3524n1 interfaceC3524n1 = c3502g0.f16896q;
            if (interfaceC3524n1 != null) {
                ((C3728t) interfaceC3524n1).m5751z(c3502g0);
            }
        }
        this.f16837E = f7;
        if (!this.f16978o) {
            m5493y0(mo5318D0());
        }
        if (this == c3502g0.f16872I.f16800d) {
            ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getRectManager().m1471g(c3502g0, !c3502g0.f16873J.f16953p.f17091o);
        }
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: m0 */
    public abstract void mo4958m0(long j6, float f7, C1752b c1752b);

    /* renamed from: m1 */
    public final void m5350m1(C0463a c0463a, boolean z7, boolean z8) {
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            if (this.f16851w) {
                if (z8) {
                    long m5332U0 = m5332U0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (m5332U0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (m5332U0 & 4294967295L)) / 2.0f;
                    long j6 = this.f16055g;
                    c0463a.m1003a(-intBitsToFloat, -intBitsToFloat2, ((int) (j6 >> 32)) + intBitsToFloat, ((int) (j6 & 4294967295L)) + intBitsToFloat2);
                } else if (z7) {
                    long j7 = this.f16055g;
                    c0463a.m1003a(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L));
                }
                if (c0463a.m1004b()) {
                    return;
                }
            }
            C3710o1 c3710o1 = (C3710o1) interfaceC3521m1;
            float[] m5709b = c3710o1.m5709b();
            if (!c3710o1.f17648w) {
                if (m5709b == null) {
                    c0463a.f1619a = 0.0f;
                    c0463a.f1620b = 0.0f;
                    c0463a.f1621c = 0.0f;
                    c0463a.f1622d = 0.0f;
                } else {
                    C0647c0.m1352c(m5709b, c0463a);
                }
            }
        }
        long j8 = this.f16836D;
        float f7 = (int) (j8 >> 32);
        c0463a.f1619a += f7;
        c0463a.f1621c += f7;
        float f8 = (int) (j8 & 4294967295L);
        c0463a.f1620b += f8;
        c0463a.f1622d += f8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p146t1.AbstractC3239v0, p146t1.InterfaceC3214k0
    /* renamed from: n */
    public final Object mo4921n() {
        C3502g0 c3502g0 = this.f16847s;
        if (!c3502g0.f16872I.m5308d(64)) {
            return null;
        }
        mo5333V0();
        Object obj = null;
        for (AbstractC3809q abstractC3809q = c3502g0.f16872I.f16801e; abstractC3809q != null; abstractC3809q = abstractC3809q.f17996i) {
            if ((abstractC3809q.f17994g & 64) != 0) {
                AbstractC3519m abstractC3519m = abstractC3809q;
                ?? r52 = 0;
                while (abstractC3519m != 0) {
                    if (abstractC3519m instanceof InterfaceC3533q1) {
                        obj = ((InterfaceC3533q1) abstractC3519m).mo4836p0(obj);
                    } else if ((abstractC3519m.f17994g & 64) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                        AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                        int i7 = 0;
                        abstractC3519m = abstractC3519m;
                        r52 = r52;
                        while (abstractC3809q2 != null) {
                            if ((abstractC3809q2.f17994g & 64) != 0) {
                                i7++;
                                r52 = r52;
                                if (i7 == 1) {
                                    abstractC3519m = abstractC3809q2;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new C2705e(new AbstractC3809q[16]);
                                    }
                                    if (abstractC3519m != 0) {
                                        r52.m4300b(abstractC3519m);
                                        abstractC3519m = 0;
                                    }
                                    r52.m4300b(abstractC3809q2);
                                }
                            }
                            abstractC3809q2 = abstractC3809q2.f17997j;
                            abstractC3519m = abstractC3519m;
                            r52 = r52;
                        }
                        if (i7 == 1) {
                        }
                    }
                    abstractC3519m = AbstractC3498f.m5366f(r52);
                }
            }
        }
        return obj;
    }

    /* renamed from: n1 */
    public final void m5351n1() {
        if (this.f16845M != null) {
            if (this.f16846N != null) {
                this.f16846N = null;
            }
            m5357u1(null, false);
            this.f16847s.m5420X(false);
        }
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: o */
    public final InterfaceC3238v mo4935o() {
        if (!mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m5343f1();
        return this.f16847s.f16872I.f16800d.f16849u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [n0.e] */
    /* renamed from: o1 */
    public final void m5352o1(InterfaceC3220m0 interfaceC3220m0) {
        AbstractC3497e1 abstractC3497e1;
        InterfaceC3220m0 interfaceC3220m02 = this.f16834B;
        if (interfaceC3220m0 != interfaceC3220m02) {
            this.f16834B = interfaceC3220m0;
            C3502g0 c3502g0 = this.f16847s;
            int i7 = 0;
            if (interfaceC3220m02 == null || interfaceC3220m0.mo4886e() != interfaceC3220m02.mo4886e() || interfaceC3220m0.mo4884c() != interfaceC3220m02.mo4884c()) {
                int mo4886e = interfaceC3220m0.mo4886e();
                int mo4884c = interfaceC3220m0.mo4884c();
                InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
                if (interfaceC3521m1 != null) {
                    ((C3710o1) interfaceC3521m1).m5712e((mo4886e << 32) | (mo4884c & 4294967295L));
                } else if (c3502g0.m5408J() && (abstractC3497e1 = this.f16849u) != null) {
                    abstractC3497e1.m5340c1();
                }
                m4959p0((mo4884c & 4294967295L) | (mo4886e << 32));
                if (this.f16852x != null) {
                    m5358v1(false);
                }
                boolean m5393g = AbstractC3500f1.m5393g(4);
                AbstractC3809q mo5333V0 = mo5333V0();
                if (m5393g || (mo5333V0 = mo5333V0.f17996i) != null) {
                    for (AbstractC3809q m5335X0 = m5335X0(m5393g); m5335X0 != null && (m5335X0.f17995h & 4) != 0; m5335X0 = m5335X0.f17997j) {
                        if ((m5335X0.f17994g & 4) != 0) {
                            AbstractC3519m abstractC3519m = m5335X0;
                            ?? r9 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3522n) {
                                    ((InterfaceC3522n) abstractC3519m).mo556q0();
                                } else if ((abstractC3519m.f17994g & 4) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q = abstractC3519m.f16962t;
                                    int i8 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r9 = r9;
                                    while (abstractC3809q != null) {
                                        if ((abstractC3809q.f17994g & 4) != 0) {
                                            i8++;
                                            r9 = r9;
                                            if (i8 == 1) {
                                                abstractC3519m = abstractC3809q;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r9.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r9.m4300b(abstractC3809q);
                                            }
                                        }
                                        abstractC3809q = abstractC3809q.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r9 = r9;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r9);
                            }
                        }
                        if (m5335X0 == mo5333V0) {
                            break;
                        }
                    }
                }
                InterfaceC3524n1 interfaceC3524n1 = c3502g0.f16896q;
                if (interfaceC3524n1 != null) {
                    ((C3728t) interfaceC3524n1).m5751z(c3502g0);
                }
            }
            C2182b0 c2182b0 = this.f16835C;
            if ((c2182b0 != null && c2182b0.f12625e != 0) || !interfaceC3220m0.mo4882a().isEmpty()) {
                C2182b0 c2182b02 = this.f16835C;
                Map mo4882a = interfaceC3220m0.mo4882a();
                if (c2182b02 != null && c2182b02.f12625e == mo4882a.size()) {
                    Object[] objArr = c2182b02.f12622b;
                    int[] iArr = c2182b02.f12623c;
                    long[] jArr = c2182b02.f12621a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        loop0: while (true) {
                            long j6 = jArr[i9];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length)) >>> 31);
                                for (int i11 = i7; i11 < i10; i11++) {
                                    if ((255 & j6) < 128) {
                                        int i12 = (i9 << 3) + i11;
                                        Object obj = objArr[i12];
                                        int i13 = iArr[i12];
                                        Integer num = (Integer) mo4882a.get((C3216l) obj);
                                        if (num == null || num.intValue() != i13) {
                                            break loop0;
                                        }
                                    }
                                    j6 >>= 8;
                                }
                                if (i10 != 8) {
                                    return;
                                }
                            }
                            if (i9 != length) {
                                i9++;
                                i7 = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                c3502g0.f16873J.f16953p.f17071C.m5457f();
                C2182b0 c2182b03 = this.f16835C;
                if (c2182b03 == null) {
                    C2182b0 c2182b04 = AbstractC2202l0.f12710a;
                    c2182b03 = new C2182b0();
                    this.f16835C = c2182b03;
                }
                c2182b03.m3548a();
                for (Map.Entry entry : interfaceC3220m0.mo4882a().entrySet()) {
                    c2182b03.m3555h(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    /* renamed from: q1 */
    public final long m5353q1(long j6) {
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            j6 = ((C3710o1) interfaceC3521m1).m5710c(j6, false);
        }
        long j7 = this.f16836D;
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + ((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + ((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: r1 */
    public final C0465c m5354r1() {
        if (mo5333V0().f18005r) {
            InterfaceC3238v m4897h = AbstractC3191c1.m4897h(this);
            C0463a c0463a = this.f16838F;
            if (c0463a == null) {
                c0463a = new C0463a();
                this.f16838F = c0463a;
            }
            long m5324M0 = m5324M0(m5332U0());
            int i7 = (int) (m5324M0 >> 32);
            c0463a.f1619a = -Float.intBitsToFloat(i7);
            int i8 = (int) (m5324M0 & 4294967295L);
            c0463a.f1620b = -Float.intBitsToFloat(i8);
            c0463a.f1621c = Float.intBitsToFloat(i7) + mo4956k0();
            c0463a.f1622d = Float.intBitsToFloat(i8) + mo4955i0();
            AbstractC3497e1 abstractC3497e1 = this;
            while (abstractC3497e1 != m4897h) {
                abstractC3497e1.m5350m1(c0463a, false, true);
                if (!c0463a.m1004b()) {
                    abstractC3497e1 = abstractC3497e1.f16849u;
                    AbstractC3367j.m5097b(abstractC3497e1);
                }
            }
            return new C0465c(c0463a.f1619a, c0463a.f1620b, c0463a.f1621c, c0463a.f1622d);
        }
        return C0465c.f1624e;
    }

    /* renamed from: s1 */
    public final void m5355s1(AbstractC3497e1 abstractC3497e1, float[] fArr) {
        float[] m5708a;
        if (!AbstractC3367j.m5096a(abstractC3497e1, this)) {
            AbstractC3497e1 abstractC3497e12 = this.f16849u;
            AbstractC3367j.m5097b(abstractC3497e12);
            abstractC3497e12.m5355s1(abstractC3497e1, fArr);
            if (!C3100j.m4783a(this.f16836D, 0L)) {
                float[] fArr2 = f16830Q;
                C0647c0.m1353d(fArr2);
                long j6 = this.f16836D;
                C0647c0.m1355f(fArr2, -((int) (j6 >> 32)), -((int) (j6 & 4294967295L)));
                C0647c0.m1354e(fArr, fArr2);
            }
            InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
            if (interfaceC3521m1 != null && (m5708a = ((C3710o1) interfaceC3521m1).m5708a()) != null) {
                C0647c0.m1354e(fArr, m5708a);
            }
        }
    }

    /* renamed from: t1 */
    public final void m5356t1(AbstractC3497e1 abstractC3497e1, float[] fArr) {
        AbstractC3497e1 abstractC3497e12 = this;
        while (!abstractC3497e12.equals(abstractC3497e1)) {
            InterfaceC3521m1 interfaceC3521m1 = abstractC3497e12.f16845M;
            if (interfaceC3521m1 != null) {
                C0647c0.m1354e(fArr, ((C3710o1) interfaceC3521m1).m5709b());
            }
            if (!C3100j.m4783a(abstractC3497e12.f16836D, 0L)) {
                float[] fArr2 = f16830Q;
                C0647c0.m1353d(fArr2);
                C0647c0.m1355f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C0647c0.m1354e(fArr, fArr2);
            }
            abstractC3497e12 = abstractC3497e12.f16849u;
            AbstractC3367j.m5097b(abstractC3497e12);
        }
    }

    /* renamed from: u1 */
    public final void m5357u1(InterfaceC3279c interfaceC3279c, boolean z7) {
        boolean z8;
        InterfaceC3524n1 interfaceC3524n1;
        C2705e c2705e;
        Reference poll;
        if (interfaceC3279c != null && this.f16846N != null) {
            AbstractC3088a.m4749a("layerBlock can't be provided when explicitLayer is provided");
        }
        C3502g0 c3502g0 = this.f16847s;
        if (!z7 && this.f16852x == interfaceC3279c && AbstractC3367j.m5096a(this.f16853y, c3502g0.f16865B) && this.f16854z == c3502g0.f16866C) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f16853y = c3502g0.f16865B;
        this.f16854z = c3502g0.f16866C;
        boolean m5407I = c3502g0.m5407I();
        C3494d1 c3494d1 = this.f16843K;
        if (m5407I && interfaceC3279c != null) {
            this.f16852x = interfaceC3279c;
            if (this.f16845M == null) {
                InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g0);
                C1879e0 c1879e0 = this.f16842J;
                if (c1879e0 == null) {
                    C1879e0 c1879e02 = new C1879e0(13, this, new C3494d1(this, 0));
                    this.f16842J = c1879e02;
                    c1879e0 = c1879e02;
                }
                InterfaceC3521m1 m5739k = ((C3728t) m5464a).m5739k(c1879e0, c3494d1, null);
                C3710o1 c3710o1 = (C3710o1) m5739k;
                c3710o1.m5712e(this.f16055g);
                c3710o1.m5711d(this.f16836D);
                this.f16845M = m5739k;
                m5358v1(true);
                c3502g0.f16876M = true;
                c3494d1.mo52a();
                return;
            }
            if (z8 && m5358v1(true)) {
                c3502g0.m5413O();
                ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getRectManager().m1470f(c3502g0);
                return;
            }
            return;
        }
        this.f16852x = null;
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            C3710o1 c3710o12 = (C3710o1) interfaceC3521m1;
            C3728t c3728t = c3710o12.f17632g;
            if (!AbstractC0659i0.m1414n(c3710o12.m5709b())) {
                c3502g0.m5413O();
            }
            c3710o12.f17633h = null;
            c3710o12.f17634i = null;
            c3710o12.f17636k = true;
            if (c3710o12.f17639n) {
                c3710o12.f17639n = false;
                c3728t.m5749x(c3710o12, false);
            }
            InterfaceC0682x interfaceC0682x = c3710o12.f17631f;
            if (interfaceC0682x != null) {
                interfaceC0682x.mo1359a(c3710o12.f17630e);
                C0068q2 c0068q2 = c3728t.f17780y0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) c0068q2.f345g;
                    c2705e = (C2705e) c0068q2.f344f;
                    poll = referenceQueue.poll();
                    if (poll != null) {
                        c2705e.m4308j(poll);
                    }
                } while (poll != null);
                c2705e.m4300b(new WeakReference(c3710o12, (ReferenceQueue) c0068q2.f345g));
                c3728t.f17703B.remove(c3710o12);
            }
            c3502g0.f16876M = true;
            c3494d1.mo52a();
            if (mo5333V0().f18005r && c3502g0.m5408J() && (interfaceC3524n1 = c3502g0.f16896q) != null) {
                ((C3728t) interfaceC3524n1).m5751z(c3502g0);
            }
        }
        this.f16845M = null;
        this.f16844L = false;
    }

    /* renamed from: v1 */
    public final boolean m5358v1(boolean z7) {
        C3502g0 c3502g0;
        boolean z8;
        boolean z9;
        InterfaceC3524n1 interfaceC3524n1;
        InterfaceC3277a interfaceC3277a;
        InterfaceC3277a interfaceC3277a2;
        if (this.f16846N != null) {
            return false;
        }
        InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
        if (interfaceC3521m1 != null) {
            InterfaceC3279c interfaceC3279c = this.f16852x;
            if (interfaceC3279c != null) {
                C0661j0 c0661j0 = f16828O;
                c0661j0.m1435f(1.0f);
                c0661j0.m1436g(1.0f);
                c0661j0.m1432a(1.0f);
                c0661j0.m1441p(0.0f);
                c0661j0.m1442q(0.0f);
                c0661j0.m1437h(0.0f);
                long j6 = AbstractC0683y.f2215a;
                c0661j0.m1433d(j6);
                c0661j0.m1439n(j6);
                if (c0661j0.f2163n != 0.0f) {
                    c0661j0.f2154e |= 1024;
                    c0661j0.f2163n = 0.0f;
                }
                if (c0661j0.f2164o != 8.0f) {
                    c0661j0.f2154e |= 2048;
                    c0661j0.f2164o = 8.0f;
                }
                long j7 = C0675q0.f2200b;
                c0661j0.m1440o(j7);
                c0661j0.m1438j(AbstractC0659i0.f2147a);
                c0661j0.m1434e(false);
                if (c0661j0.f2171v != 3) {
                    c0661j0.f2154e |= 524288;
                    c0661j0.f2171v = 3;
                }
                c0661j0.f2168s = 9205357640488583168L;
                c0661j0.f2172w = null;
                c0661j0.f2154e = 0;
                C3502g0 c3502g02 = this.f16847s;
                c0661j0.f2169t = c3502g02.f16865B;
                c0661j0.f2170u = c3502g02.f16866C;
                c0661j0.f2168s = AbstractC2072e.m3347y(this.f16055g);
                ((C3728t) AbstractC3511j0.m5464a(c3502g02)).getSnapshotObserver().m5498a(this, C3495e.f16814j, new C2028w1(interfaceC3279c, 1));
                C3543u c3543u = this.f16839G;
                if (c3543u == null) {
                    c3543u = new C3543u();
                    this.f16839G = c3543u;
                }
                C3543u c3543u2 = f16829P;
                c3543u2.getClass();
                c3543u2.f17041a = c3543u.f17041a;
                c3543u2.f17042b = c3543u.f17042b;
                c3543u2.f17043c = c3543u.f17043c;
                c3543u2.f17044d = c3543u.f17044d;
                c3543u2.f17045e = c3543u.f17045e;
                c3543u2.f17046f = c3543u.f17046f;
                c3543u2.f17047g = c3543u.f17047g;
                float f7 = c0661j0.f2155f;
                c3543u.f17041a = f7;
                c3543u.f17042b = c0661j0.f2156g;
                c3543u.f17043c = c0661j0.f2158i;
                c3543u.f17044d = c0661j0.f2159j;
                c3543u.f17045e = c0661j0.f2163n;
                c3543u.f17046f = c0661j0.f2164o;
                long j8 = c0661j0.f2165p;
                c3543u.f17047g = j8;
                C3710o1 c3710o1 = (C3710o1) interfaceC3521m1;
                C3728t c3728t = c3710o1.f17632g;
                int i7 = c0661j0.f2154e | c3710o1.f17643r;
                c3710o1.f17641p = c0661j0.f2170u;
                c3710o1.f17640o = c0661j0.f2169t;
                int i8 = i7 & 4096;
                if (i8 != 0) {
                    c3710o1.f17644s = j8;
                }
                if ((i7 & 1) != 0) {
                    InterfaceC1754d interfaceC1754d = c3710o1.f17630e.f10663a;
                    if (interfaceC1754d.mo2828d() != f7) {
                        interfaceC1754d.mo2840p(f7);
                    }
                }
                if ((i7 & 2) != 0) {
                    C1752b c1752b = c3710o1.f17630e;
                    float f8 = c0661j0.f2156g;
                    InterfaceC1754d interfaceC1754d2 = c1752b.f10663a;
                    if (interfaceC1754d2.mo2820I() != f8) {
                        interfaceC1754d2.mo2813B(f8);
                    }
                }
                if ((i7 & 4) != 0) {
                    c3710o1.f17630e.m2810f(c0661j0.f2157h);
                }
                if ((i7 & 8) != 0) {
                    C1752b c1752b2 = c3710o1.f17630e;
                    float f9 = c0661j0.f2158i;
                    InterfaceC1754d interfaceC1754d3 = c1752b2.f10663a;
                    if (interfaceC1754d3.mo2844t() != f9) {
                        interfaceC1754d3.mo2850z(f9);
                    }
                }
                if ((i7 & 16) != 0) {
                    C1752b c1752b3 = c3710o1.f17630e;
                    float f10 = c0661j0.f2159j;
                    InterfaceC1754d interfaceC1754d4 = c1752b3.f10663a;
                    if (interfaceC1754d4.mo2831g() != f10) {
                        interfaceC1754d4.mo2835k(f10);
                    }
                }
                if ((i7 & 32) != 0) {
                    C1752b c1752b4 = c3710o1.f17630e;
                    float f11 = c0661j0.f2160k;
                    InterfaceC1754d interfaceC1754d5 = c1752b4.f10663a;
                    if (interfaceC1754d5.mo2818G() != f11) {
                        interfaceC1754d5.mo2830f(f11);
                        c1752b4.f10669g = true;
                        c1752b4.m2805a();
                    }
                    if (c0661j0.f2160k > 0.0f && !c3710o1.f17649x && (interfaceC3277a2 = c3710o1.f17634i) != null) {
                        interfaceC3277a2.mo52a();
                    }
                }
                if ((i7 & 64) != 0) {
                    C1752b c1752b5 = c3710o1.f17630e;
                    long j9 = c0661j0.f2161l;
                    InterfaceC1754d interfaceC1754d6 = c1752b5.f10663a;
                    c3502g0 = c3502g02;
                    if (!C0677s.m1454c(j9, interfaceC1754d6.mo2824M())) {
                        interfaceC1754d6.mo2837m(j9);
                    }
                } else {
                    c3502g0 = c3502g02;
                }
                if ((i7 & 128) != 0) {
                    C1752b c1752b6 = c3710o1.f17630e;
                    long j10 = c0661j0.f2162m;
                    InterfaceC1754d interfaceC1754d7 = c1752b6.f10663a;
                    if (!C0677s.m1454c(j10, interfaceC1754d7.mo2836l())) {
                        interfaceC1754d7.mo2812A(j10);
                    }
                }
                if ((i7 & 1024) != 0) {
                    C1752b c1752b7 = c3710o1.f17630e;
                    float f12 = c0661j0.f2163n;
                    InterfaceC1754d interfaceC1754d8 = c1752b7.f10663a;
                    if (interfaceC1754d8.mo2821J() != f12) {
                        interfaceC1754d8.mo2833i(f12);
                    }
                }
                if ((i7 & 256) != 0) {
                    InterfaceC1754d interfaceC1754d9 = c3710o1.f17630e.f10663a;
                    if (interfaceC1754d9.mo2847w() != 0.0f) {
                        interfaceC1754d9.mo2826b();
                    }
                }
                if ((i7 & 512) != 0) {
                    InterfaceC1754d interfaceC1754d10 = c3710o1.f17630e.f10663a;
                    if (interfaceC1754d10.mo2816E() != 0.0f) {
                        interfaceC1754d10.mo2834j();
                    }
                }
                if ((i7 & 2048) != 0) {
                    C1752b c1752b8 = c3710o1.f17630e;
                    float f13 = c0661j0.f2164o;
                    InterfaceC1754d interfaceC1754d11 = c1752b8.f10663a;
                    if (interfaceC1754d11.mo2842r() != f13) {
                        interfaceC1754d11.mo2817F(f13);
                    }
                }
                if (i8 != 0) {
                    long j11 = c3710o1.f17644s;
                    if (j11 == j7) {
                        C1752b c1752b9 = c3710o1.f17630e;
                        if (!C0464b.m1006b(c1752b9.f10684v, 9205357640488583168L)) {
                            c1752b9.f10684v = 9205357640488583168L;
                            c1752b9.f10663a.mo2823L(9205357640488583168L);
                        }
                    } else {
                        C1752b c1752b10 = c3710o1.f17630e;
                        float m1449a = C0675q0.m1449a(j11) * ((int) (c3710o1.f17635j >> 32));
                        long floatToRawIntBits = (Float.floatToRawIntBits(C0675q0.m1450b(c3710o1.f17644s) * ((int) (c3710o1.f17635j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(m1449a) << 32);
                        if (!C0464b.m1006b(c1752b10.f10684v, floatToRawIntBits)) {
                            c1752b10.f10684v = floatToRawIntBits;
                            c1752b10.f10663a.mo2823L(floatToRawIntBits);
                        }
                    }
                }
                if ((i7 & 16384) != 0) {
                    C1752b c1752b11 = c3710o1.f17630e;
                    boolean z10 = c0661j0.f2167r;
                    if (c1752b11.f10685w != z10) {
                        c1752b11.f10685w = z10;
                        c1752b11.f10669g = true;
                        c1752b11.m2805a();
                    }
                }
                if ((131072 & i7) != 0) {
                    InterfaceC1754d interfaceC1754d12 = c3710o1.f17630e.f10663a;
                }
                if ((262144 & i7) != 0) {
                    InterfaceC1754d interfaceC1754d13 = c3710o1.f17630e.f10663a;
                    if (!AbstractC3367j.m5096a(interfaceC1754d13.mo2848x(), null)) {
                        interfaceC1754d13.mo2839o();
                    }
                }
                if ((i7 & 524288) != 0) {
                    C1752b c1752b12 = c3710o1.f17630e;
                    int i9 = c0661j0.f2171v;
                    InterfaceC1754d interfaceC1754d14 = c1752b12.f10663a;
                    if (interfaceC1754d14.mo2822K() != i9) {
                        interfaceC1754d14.mo2841q(i9);
                    }
                }
                if ((32768 & i7) != 0) {
                    InterfaceC1754d interfaceC1754d15 = c3710o1.f17630e.f10663a;
                    if (interfaceC1754d15.mo2846v() != 0) {
                        interfaceC1754d15.mo2849y(0);
                    }
                }
                if ((i7 & 7963) != 0) {
                    c3710o1.f17646u = true;
                    c3710o1.f17647v = true;
                }
                if (!AbstractC3367j.m5096a(c3710o1.f17645t, c0661j0.f2172w)) {
                    AbstractC0655g0 abstractC0655g0 = c0661j0.f2172w;
                    c3710o1.f17645t = abstractC0655g0;
                    if (abstractC0655g0 != null) {
                        C1752b c1752b13 = c3710o1.f17630e;
                        if (abstractC0655g0 instanceof C0651e0) {
                            C0465c c0465c = ((C0651e0) abstractC0655g0).f2135a;
                            float f14 = c0465c.f1625a;
                            float f15 = c0465c.f1626b;
                            c1752b13.m2811g((Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (Float.floatToRawIntBits(c0465c.f1627c - f14) << 32) | (Float.floatToRawIntBits(c0465c.f1628d - f15) & 4294967295L), 0.0f);
                        } else if (abstractC0655g0 instanceof C0649d0) {
                            C0660j c0660j = ((C0649d0) abstractC0655g0).f2132a;
                            c1752b13.f10673k = null;
                            c1752b13.f10671i = 9205357640488583168L;
                            c1752b13.f10670h = 0L;
                            c1752b13.f10672j = 0.0f;
                            c1752b13.f10669g = true;
                            c1752b13.f10676n = false;
                            c1752b13.f10674l = c0660j;
                            c1752b13.m2805a();
                        } else if (abstractC0655g0 instanceof C0653f0) {
                            C0653f0 c0653f0 = (C0653f0) abstractC0655g0;
                            C0660j c0660j2 = c0653f0.f2143b;
                            if (c0660j2 != null) {
                                c1752b13.f10673k = null;
                                c1752b13.f10671i = 9205357640488583168L;
                                c1752b13.f10670h = 0L;
                                c1752b13.f10672j = 0.0f;
                                c1752b13.f10669g = true;
                                c1752b13.f10676n = false;
                                c1752b13.f10674l = c0660j2;
                                c1752b13.m2805a();
                            } else {
                                C0466d c0466d = c0653f0.f2142a;
                                float f16 = c0466d.f1629a;
                                c1752b13.m2811g((Float.floatToRawIntBits(c0466d.f1630b) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32), (Float.floatToRawIntBits(c0466d.m1022b()) << 32) | (Float.floatToRawIntBits(c0466d.m1021a()) & 4294967295L), Float.intBitsToFloat((int) (c0466d.f1636h >> 32)));
                            }
                        } else {
                            throw new RuntimeException();
                        }
                        if ((abstractC0655g0 instanceof C0649d0) && Build.VERSION.SDK_INT < 33 && (interfaceC3277a = c3710o1.f17634i) != null) {
                            interfaceC3277a.mo52a();
                        }
                    }
                    z8 = true;
                } else {
                    z8 = false;
                }
                c3710o1.f17643r = c0661j0.f2154e;
                if (i7 != 0 || z8) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        ViewParent parent = c3728t.getParent();
                        if (parent != null) {
                            parent.onDescendantInvalidated(c3728t, c3728t);
                        }
                    } else {
                        c3728t.invalidate();
                    }
                    if (c3728t.f17749j) {
                        c3728t.m5738M(0.0f);
                    }
                }
                boolean z11 = this.f16851w;
                boolean z12 = c0661j0.f2167r;
                this.f16851w = z12;
                this.f16833A = c0661j0.f2157h;
                if (c3543u2.f17041a == c3543u.f17041a && c3543u2.f17042b == c3543u.f17042b && c3543u2.f17043c == c3543u.f17043c && c3543u2.f17044d == c3543u.f17044d && c3543u2.f17045e == c3543u.f17045e && c3543u2.f17046f == c3543u.f17046f && c3543u2.f17047g == c3543u.f17047g) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z13 = !z9;
                if (z7 && ((!z9 || z11 != z12) && (interfaceC3524n1 = c3502g0.f16896q) != null)) {
                    ((C3728t) interfaceC3524n1).m5751z(c3502g0);
                }
                return z13;
            }
            throw AbstractC2487d.m4041e("updateLayerParameters requires a non-null layerBlock");
        }
        if (this.f16852x == null) {
            return false;
        }
        AbstractC3088a.m4750b("null layer with a non-null layerBlock");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5359w1(long j6) {
        boolean z7;
        boolean z8;
        boolean z9;
        if ((((9187343241974906880L ^ (j6 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            InterfaceC3521m1 interfaceC3521m1 = this.f16845M;
            if (interfaceC3521m1 != null && this.f16851w) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                C1752b c1752b = ((C3710o1) interfaceC3521m1).f17630e;
                if (c1752b.f10685w) {
                    AbstractC0655g0 m2808d = c1752b.m2808d();
                    if (m2808d instanceof C0651e0) {
                        C0465c c0465c = ((C0651e0) m2808d).f2135a;
                        if (c0465c.f1625a > intBitsToFloat || intBitsToFloat >= c0465c.f1627c || c0465c.f1626b > intBitsToFloat2 || intBitsToFloat2 >= c0465c.f1628d) {
                            z7 = false;
                            z8 = true;
                        }
                    } else {
                        if (m2808d instanceof C0653f0) {
                            C0466d c0466d = ((C0653f0) m2808d).f2142a;
                            float f7 = c0466d.f1629a;
                            long j7 = c0466d.f1634f;
                            long j8 = c0466d.f1636h;
                            long j9 = c0466d.f1635g;
                            z7 = false;
                            float f8 = c0466d.f1632d;
                            z8 = true;
                            float f9 = c0466d.f1630b;
                            float f10 = c0466d.f1631c;
                            long j10 = c0466d.f1633e;
                            if (intBitsToFloat >= f7 && intBitsToFloat < f10 && intBitsToFloat2 >= f9 && intBitsToFloat2 < f8) {
                                int i7 = (int) (j10 >> 32);
                                float intBitsToFloat3 = Float.intBitsToFloat(i7);
                                int i8 = (int) (j7 >> 32);
                                if (Float.intBitsToFloat(i8) + intBitsToFloat3 <= c0466d.m1022b()) {
                                    int i9 = (int) (j8 >> 32);
                                    float intBitsToFloat4 = Float.intBitsToFloat(i9);
                                    int i10 = (int) (j9 >> 32);
                                    if (Float.intBitsToFloat(i10) + intBitsToFloat4 <= c0466d.m1022b()) {
                                        int i11 = (int) (j10 & 4294967295L);
                                        int i12 = (int) (j8 & 4294967295L);
                                        if (Float.intBitsToFloat(i12) + Float.intBitsToFloat(i11) <= c0466d.m1021a()) {
                                            int i13 = (int) (j7 & 4294967295L);
                                            int i14 = (int) (j9 & 4294967295L);
                                            if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= c0466d.m1021a()) {
                                                float intBitsToFloat5 = Float.intBitsToFloat(i7) + f7;
                                                float intBitsToFloat6 = Float.intBitsToFloat(i11) + f9;
                                                float intBitsToFloat7 = f10 - Float.intBitsToFloat(i8);
                                                float intBitsToFloat8 = Float.intBitsToFloat(i13) + f9;
                                                float intBitsToFloat9 = f10 - Float.intBitsToFloat(i10);
                                                float intBitsToFloat10 = f8 - Float.intBitsToFloat(i14);
                                                float intBitsToFloat11 = f8 - Float.intBitsToFloat(i12);
                                                float intBitsToFloat12 = Float.intBitsToFloat(i9) + f7;
                                                if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                                    z9 = AbstractC3681h0.m5696w(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, c0466d.f1633e);
                                                } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                                    z9 = AbstractC3681h0.m5696w(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, c0466d.f1636h);
                                                } else if (intBitsToFloat > intBitsToFloat7 && intBitsToFloat2 < intBitsToFloat8) {
                                                    z9 = AbstractC3681h0.m5696w(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, c0466d.f1634f);
                                                } else {
                                                    if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                        z9 = AbstractC3681h0.m5696w(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, c0466d.f1635g);
                                                    }
                                                    z9 = z8;
                                                }
                                            }
                                        }
                                    }
                                }
                                C0660j m1445a = AbstractC0664l.m1445a();
                                C0660j.m1427a(m1445a, c0466d);
                                z9 = AbstractC3681h0.m5695v(intBitsToFloat, intBitsToFloat2, m1445a);
                            }
                        } else {
                            z7 = false;
                            z8 = true;
                            if (m2808d instanceof C0649d0) {
                                z9 = AbstractC3681h0.m5695v(intBitsToFloat, intBitsToFloat2, ((C0649d0) m2808d).f2132a);
                            } else {
                                throw new RuntimeException();
                            }
                        }
                        if (z9) {
                            return z8;
                        }
                        return z7;
                    }
                    z9 = z7;
                    if (z9) {
                    }
                }
                z7 = false;
                z8 = true;
                z9 = z8;
                if (z9) {
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // p162v1.InterfaceC3527o1
    /* renamed from: z */
    public final boolean mo5303z() {
        if (this.f16845M != null && !this.f16850v && this.f16847s.m5407I()) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: z0 */
    public final AbstractC3526o0 mo5360z0() {
        return this.f16848t;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: A0 */
    public final InterfaceC3238v mo5315A0() {
        return this;
    }
}
