package p146t1;

import p001a0.C0053n;
import p027d1.C0465c;
import p034e0.C0593a;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2387n;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3529p0;
import p162v1.C3502g0;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.c1 */
/* loaded from: classes.dex */
public abstract class AbstractC3191c1 {

    /* renamed from: a */
    public static final C3229q0 f15934a = new C3229q0(3);

    /* renamed from: a */
    public static final void m4890a(C3200f1 c3200f1, InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(-511989831);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c3200f1)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i11 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        if ((i7 & 384) == 0) {
            if (c2395p.m3874i(interfaceC3281e)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i8 |= i9;
        }
        if ((i8 & 147) != 146) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i8 & 1, z7)) {
            int hashCode = Long.hashCode(c2395p.f13486T);
            C2387n m3982z = AbstractC2418w.m3982z(c2395p);
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(C3558z.f17107f);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(c3200f1, c2395p, c3200f1.f15950c);
            AbstractC2418w.m3954C(m3982z, c2395p, c3200f1.f15951d);
            AbstractC2418w.m3954C(interfaceC3281e, c2395p, c3200f1.f15952e);
            InterfaceC3510j.f16935d.getClass();
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            c2395p.m3888r(true);
            if (!c2395p.m3836D()) {
                c2395p.m3857Z(-1259274676);
                boolean m3874i = c2395p.m3874i(c3200f1);
                Object m3847O = c2395p.m3847O();
                if (m3874i || m3847O == C2375k.f13421a) {
                    m3847O = new C0053n(25, c3200f1);
                    c2395p.m3877j0(m3847O);
                }
                AbstractC2418w.m3967i((InterfaceC3277a) m3847O, c2395p);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(-1259216055);
                c2395p.m3888r(false);
            }
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0593a(c3200f1, interfaceC3810r, interfaceC3281e, i7, 4);
        }
    }

    /* renamed from: b */
    public static final void m4891b(InterfaceC3810r interfaceC3810r, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        boolean z7;
        c2395p.m3859a0(-1298353104);
        int i12 = i8 & 1;
        if (i12 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i7;
        } else {
            i9 = i7;
        }
        if (c2395p.m3874i(interfaceC3281e)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i9 | i11;
        if ((i13 & 19) != 18) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i13 & 1, z7)) {
            if (i12 != 0) {
                interfaceC3810r = C3807o.f17991a;
            }
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = new C3200f1(C3229q0.f16034f);
                c2395p.m3877j0(m3847O);
            }
            m4890a((C3200f1) m3847O, interfaceC3810r, interfaceC3281e, c2395p, (i13 << 3) & 1008);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3188b1(interfaceC3810r, interfaceC3281e, i7, i8);
        }
    }

    /* renamed from: c */
    public static final float m4892c(long j6, long j7) {
        return Math.min(Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    /* renamed from: d */
    public static final float m4893d(AbstractC3237u0 abstractC3237u0, boolean z7, C3222n[] c3222nArr, float f7) {
        boolean z8;
        float f8 = Float.NaN;
        for (C3222n c3222n : c3222nArr) {
            float mo4913d = abstractC3237u0.mo4913d(c3222n);
            if (!Float.isNaN(f8)) {
                if (mo4913d > f8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z7 != z8) {
                }
            }
            f8 = mo4913d;
        }
        if (Float.isNaN(f8)) {
            return f7;
        }
        return f8;
    }

    /* renamed from: e */
    public static final C0465c m4894e(InterfaceC3238v interfaceC3238v) {
        InterfaceC3238v mo4935o = interfaceC3238v.mo4935o();
        if (mo4935o != null) {
            return mo4935o.mo4934j(interfaceC3238v, true);
        }
        return new C0465c(0.0f, 0.0f, (int) (interfaceC3238v.mo4926S() >> 32), (int) (interfaceC3238v.mo4926S() & 4294967295L));
    }

    /* renamed from: f */
    public static final C0465c m4895f(InterfaceC3238v interfaceC3238v) {
        InterfaceC3238v m4897h = m4897h(interfaceC3238v);
        float mo4926S = (int) (m4897h.mo4926S() >> 32);
        float mo4926S2 = (int) (m4897h.mo4926S() & 4294967295L);
        C0465c mo4934j = m4897h.mo4934j(interfaceC3238v, true);
        float f7 = mo4934j.f1625a;
        float f8 = 0.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > mo4926S) {
            f7 = mo4926S;
        }
        float f9 = mo4934j.f1626b;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > mo4926S2) {
            f9 = mo4926S2;
        }
        float f10 = mo4934j.f1627c;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 <= mo4926S) {
            mo4926S = f10;
        }
        float f11 = mo4934j.f1628d;
        if (f11 >= 0.0f) {
            f8 = f11;
        }
        if (f8 <= mo4926S2) {
            mo4926S2 = f8;
        }
        if (f7 == mo4926S || f9 == mo4926S2) {
            return C0465c.f1624e;
        }
        long mo4933h = m4897h.mo4933h((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L));
        long mo4933h2 = m4897h.mo4933h((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(mo4926S) << 32));
        long mo4933h3 = m4897h.mo4933h((Float.floatToRawIntBits(mo4926S) << 32) | (Float.floatToRawIntBits(mo4926S2) & 4294967295L));
        long mo4933h4 = m4897h.mo4933h((Float.floatToRawIntBits(mo4926S2) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (mo4933h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo4933h2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (mo4933h4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (mo4933h3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (mo4933h & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (mo4933h2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (mo4933h4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (mo4933h3 & 4294967295L));
        return new C0465c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    /* renamed from: g */
    public static final boolean m4896g(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final InterfaceC3238v m4897h(InterfaceC3238v interfaceC3238v) {
        InterfaceC3238v interfaceC3238v2;
        AbstractC3497e1 abstractC3497e1;
        InterfaceC3238v mo4935o = interfaceC3238v.mo4935o();
        while (true) {
            InterfaceC3238v interfaceC3238v3 = mo4935o;
            interfaceC3238v2 = interfaceC3238v;
            interfaceC3238v = interfaceC3238v3;
            if (interfaceC3238v == null) {
                break;
            }
            mo4935o = interfaceC3238v.mo4935o();
        }
        if (interfaceC3238v2 instanceof AbstractC3497e1) {
            abstractC3497e1 = (AbstractC3497e1) interfaceC3238v2;
        } else {
            abstractC3497e1 = null;
        }
        if (abstractC3497e1 == null) {
            return interfaceC3238v2;
        }
        AbstractC3497e1 abstractC3497e12 = abstractC3497e1.f16849u;
        while (true) {
            AbstractC3497e1 abstractC3497e13 = abstractC3497e12;
            AbstractC3497e1 abstractC3497e14 = abstractC3497e1;
            abstractC3497e1 = abstractC3497e13;
            if (abstractC3497e1 != null) {
                abstractC3497e12 = abstractC3497e1.f16849u;
            } else {
                return abstractC3497e14;
            }
        }
    }

    /* renamed from: i */
    public static final AbstractC3529p0 m4898i(AbstractC3529p0 abstractC3529p0) {
        C3502g0 c3502g0;
        C3502g0 c3502g02 = abstractC3529p0.f16985s.f16847s;
        while (true) {
            C3502g0 m5447u = c3502g02.m5447u();
            C3502g0 c3502g03 = null;
            if (m5447u != null) {
                c3502g0 = m5447u.f16890k;
            } else {
                c3502g0 = null;
            }
            if (c3502g0 != null) {
                C3502g0 m5447u2 = c3502g02.m5447u();
                if (m5447u2 != null) {
                    c3502g03 = m5447u2.f16890k;
                }
                AbstractC3367j.m5097b(c3502g03);
                C3502g0 m5447u3 = c3502g02.m5447u();
                AbstractC3367j.m5097b(m5447u3);
                c3502g02 = m5447u3.f16890k;
                AbstractC3367j.m5097b(c3502g02);
            } else {
                AbstractC3529p0 mo5331T0 = c3502g02.f16872I.f16800d.mo5331T0();
                AbstractC3367j.m5097b(mo5331T0);
                return mo5331T0;
            }
        }
    }

    /* renamed from: j */
    public static final long m4899j(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
