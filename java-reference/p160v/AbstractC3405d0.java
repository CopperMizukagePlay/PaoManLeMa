package p160v;

import androidx.compose.foundation.lazy.layout.C0157b;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p001a0.C0053n;
import p001a0.C0057o;
import p001a0.C0068q2;
import p031d5.C0512l;
import p053g5.C1694m;
import p060h5.C1813u;
import p063i0.C1879e0;
import p063i0.C1887f;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p101n0.C2705e;
import p107o.C2765o0;
import p122q.C2891b;
import p122q.EnumC2931o0;
import p140s2.EnumC3103m;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p146t1.AbstractC3235t0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p153u0.AbstractC3340g;
import p153u0.AbstractC3344k;
import p153u0.InterfaceC3335b;
import p153u0.InterfaceC3338e;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;
import p177x0.InterfaceC3810r;
import p195z5.C3877b;
import p195z5.C3879d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC3405d0 {

    /* renamed from: a */
    public static final C3444x[] f16533a = new C3444x[0];

    /* renamed from: a */
    public static final void m5166a(InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, C3431q0 c3431q0, InterfaceC3281e interfaceC3281e, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        c2395p.m3859a0(2002163445);
        if (c2395p.m3874i(interfaceC3277a)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i12 = i8 | i7;
        if (c2395p.m3870g(interfaceC3810r)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i13 = i12 | i9;
        if (c2395p.m3870g(c3431q0)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i14 = i13 | i10;
        if (c2395p.m3874i(interfaceC3281e)) {
            i11 = 2048;
        } else {
            i11 = 1024;
        }
        if (((i14 | i11) & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            m5168c(AbstractC3178i.m4873d(-1488997347, new C0157b(c3431q0, interfaceC3810r, interfaceC3281e, AbstractC2418w.m3953A(interfaceC3277a, c2395p)), c2395p), c2395p, 6);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C2765o0(interfaceC3277a, interfaceC3810r, c3431q0, interfaceC3281e, i7, 1);
        }
    }

    /* renamed from: b */
    public static final void m5167b(Object obj, int i7, C3425n0 c3425n0, C3173d c3173d, C2395p c2395p, int i8) {
        int i9;
        InterfaceC3279c interfaceC3279c;
        int i10;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(-2079116560);
        if ((i8 & 6) == 0) {
            if (c2395p.m3874i(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3866e(i7)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 384) == 0) {
            if (c2395p.m3874i(c3425n0)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p.m3874i(c3173d)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean m3870g = c2395p.m3870g(obj) | c2395p.m3870g(c3425n0);
            Object m3847O = c2395p.m3847O();
            Object obj2 = C2375k.f13421a;
            if (m3870g || m3847O == obj2) {
                m3847O = new C3421l0(obj, c3425n0);
                c2395p.m3877j0(m3847O);
            }
            C3421l0 c3421l0 = (C3421l0) m3847O;
            C2349d1 c2349d1 = c3421l0.f16589c;
            C2361g1 c2361g1 = c3421l0.f16591e;
            C2361g1 c2361g12 = c3421l0.f16592f;
            c2349d1.m3742h(i7);
            AbstractC2397p1 abstractC2397p1 = AbstractC3235t0.f16049a;
            C3421l0 c3421l02 = (C3421l0) c2395p.m3878k(abstractC2397p1);
            AbstractC3459f m5263d = AbstractC3470q.m5263d();
            if (m5263d != null) {
                interfaceC3279c = m5263d.mo5207e();
            } else {
                interfaceC3279c = null;
            }
            AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
            try {
                if (c3421l02 != ((C3421l0) c2361g12.getValue())) {
                    c2361g12.setValue(c3421l02);
                    if (c3421l0.f16590d.m3741g() > 0) {
                        C3421l0 c3421l03 = (C3421l0) c2361g1.getValue();
                        if (c3421l03 != null) {
                            c3421l03.m5183b();
                        }
                        if (c3421l02 != null) {
                            c3421l02.m5182a();
                        } else {
                            c3421l02 = null;
                        }
                        c2361g1.setValue(c3421l02);
                    }
                }
                AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                boolean m3870g2 = c2395p.m3870g(c3421l0);
                Object m3847O2 = c2395p.m3847O();
                if (m3870g2 || m3847O2 == obj2) {
                    m3847O2 = new C3423m0(0, c3421l0);
                    c2395p.m3877j0(m3847O2);
                }
                AbstractC2418w.m3962d(c3421l0, (InterfaceC3279c) m3847O2, c2395p);
                AbstractC2418w.m3959a(abstractC2397p1.mo3716a(c3421l0), c3173d, c2395p, ((i9 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
                throw th;
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3411g0(obj, i7, c3425n0, c3173d, i8);
        }
    }

    /* renamed from: c */
    public static final void m5168c(C3173d c3173d, C2395p c2395p, int i7) {
        C2395p c2395p2;
        c2395p.m3859a0(674185128);
        if ((i7 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            AbstractC2397p1 abstractC2397p1 = AbstractC3340g.f16400a;
            InterfaceC3338e interfaceC3338e = (InterfaceC3338e) c2395p.m3878k(abstractC2397p1);
            Object[] objArr = {interfaceC3338e};
            C0068q2 c0068q2 = new C0068q2(22, C3445x0.f16656f, new C3443w0(interfaceC3338e, 1));
            boolean m3874i = c2395p.m3874i(interfaceC3338e);
            Object m3847O = c2395p.m3847O();
            if (m3874i || m3847O == C2375k.f13421a) {
                m3847O = new C0053n(28, interfaceC3338e);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
            c2395p2 = c2395p;
            Object obj = (C3447y0) AbstractC3344k.m5081d(objArr, c0068q2, interfaceC3277a, c2395p2, 0, 4);
            AbstractC2418w.m3959a(abstractC2397p1.mo3716a(obj), AbstractC3178i.m4873d(1863926504, new C1879e0(12, obj, c3173d), c2395p2), c2395p2, 56);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1887f(c3173d, i7, 2);
        }
    }

    /* renamed from: d */
    public static final void m5169d(InterfaceC3413h0 interfaceC3413h0, Object obj, int i7, Object obj2, C2395p c2395p, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        c2395p.m3859a0(1439843069);
        if ((i8 & 6) == 0) {
            if (c2395p.m3870g(interfaceC3413h0)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            if (c2395p.m3870g(obj)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 384) == 0) {
            if (c2395p.m3866e(i7)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 3072) == 0) {
            if (c2395p.m3870g(obj2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            ((InterfaceC3335b) obj).mo5073b(obj2, AbstractC3178i.m4873d(980966366, new C0057o(i7, obj2, interfaceC3413h0), c2395p), c2395p, 48);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C3411g0(interfaceC3413h0, obj, i7, obj2, i8);
        }
    }

    /* renamed from: e */
    public static final int m5170e(int i7, C2705e c2705e) {
        int i8 = c2705e.f14519g - 1;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = ((i8 - i9) / 2) + i9;
            Object[] objArr = c2705e.f14517e;
            int i11 = ((C3412h) objArr[i10]).f16551a;
            if (i11 != i7) {
                if (i11 < i7) {
                    i9 = i10 + 1;
                    if (i7 < ((C3412h) objArr[i9]).f16551a) {
                    }
                } else {
                    i8 = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }

    /* renamed from: f */
    public static final List m5171f(InterfaceC3413h0 interfaceC3413h0, C3425n0 c3425n0, C2891b c2891b) {
        C3877b c3877b;
        C2705e c2705e = c2891b.f15099a;
        if (c2705e.f14519g == 0 && c3425n0.f16598e.isEmpty()) {
            return C1813u.f10860e;
        }
        ArrayList arrayList = new ArrayList();
        if (c2705e.f14519g != 0) {
            int i7 = c2705e.f14519g;
            if (i7 != 0) {
                Object[] objArr = c2705e.f14517e;
                int i8 = ((C3426o) objArr[0]).f16599a;
                if (i7 > 0) {
                    int i9 = 0;
                    do {
                        int i10 = ((C3426o) objArr[i9]).f16599a;
                        if (i10 < i8) {
                            i8 = i10;
                        }
                        i9++;
                    } while (i9 < i7);
                }
                if (i8 >= 0) {
                    int i11 = c2705e.f14519g;
                    if (i11 != 0) {
                        Object[] objArr2 = c2705e.f14517e;
                        int i12 = ((C3426o) objArr2[0]).f16600b;
                        if (i11 > 0) {
                            int i13 = 0;
                            do {
                                int i14 = ((C3426o) objArr2[i13]).f16600b;
                                if (i14 > i12) {
                                    i12 = i14;
                                }
                                i13++;
                            } while (i13 < i11);
                        }
                        c3877b = new C3877b(i8, Math.min(i12, interfaceC3413h0.mo5055a() - 1), 1);
                    } else {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                } else {
                    throw new IllegalArgumentException("negative minIndex");
                }
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        } else {
            c3877b = C3879d.f18170h;
        }
        int size = c3425n0.f16598e.size();
        for (int i15 = 0; i15 < size; i15++) {
            C3421l0 c3421l0 = (C3421l0) c3425n0.get(i15);
            int m5173h = m5173h(c3421l0.f16589c.m3741g(), c3421l0.f16587a, interfaceC3413h0);
            int i16 = c3877b.f18163e;
            if ((m5173h > c3877b.f18164f || i16 > m5173h) && m5173h >= 0 && m5173h < interfaceC3413h0.mo5055a()) {
                arrayList.add(Integer.valueOf(m5173h));
            }
        }
        int i17 = c3877b.f18163e;
        int i18 = c3877b.f18164f;
        if (i17 <= i18) {
            while (true) {
                arrayList.add(Integer.valueOf(i17));
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static InterfaceC2425y0 m5172g() {
        return new C2361g1(C1694m.f10482a, C2413u0.f13572g);
    }

    /* renamed from: h */
    public static final int m5173h(int i7, Object obj, InterfaceC3413h0 interfaceC3413h0) {
        int mo5056b;
        if (obj != null && interfaceC3413h0.mo5055a() != 0 && ((i7 >= interfaceC3413h0.mo5055a() || !obj.equals(interfaceC3413h0.mo5057c(i7))) && (mo5056b = interfaceC3413h0.mo5056b(obj)) != -1)) {
            return mo5056b;
        }
        return i7;
    }

    /* renamed from: k */
    public static final InterfaceC3810r m5174k(InterfaceC3810r interfaceC3810r, InterfaceC3434s interfaceC3434s, C2891b c2891b, EnumC3103m enumC3103m, EnumC2931o0 enumC2931o0, boolean z7, C2395p c2395p, int i7) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (!z7) {
            c2395p.m3857Z(-1890658823);
            c2395p.m3888r(false);
            return interfaceC3810r;
        }
        c2395p.m3857Z(-1890632411);
        boolean z12 = true;
        if ((((i7 & 112) ^ 48) > 32 && c2395p.m3870g(interfaceC3434s)) || (i7 & 48) == 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((((i7 & 896) ^ 384) > 256 && c2395p.m3870g(c2891b)) || (i7 & 384) == 256) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z13 = z8 | z9;
        if ((((i7 & 7168) ^ 3072) > 2048 && c2395p.m3872h(false)) || (i7 & 3072) == 2048) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = z13 | z10;
        if ((((57344 & i7) ^ 24576) > 16384 && c2395p.m3870g(enumC3103m)) || (i7 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = z14 | z11;
        if ((((458752 & i7) ^ 196608) <= 131072 || !c2395p.m3870g(enumC2931o0)) && (i7 & 196608) != 131072) {
            z12 = false;
        }
        boolean z16 = z15 | z12;
        Object m3847O = c2395p.m3847O();
        if (z16 || m3847O == C2375k.f13421a) {
            m3847O = new C3432r(interfaceC3434s, c2891b, enumC3103m, enumC2931o0);
            c2395p.m3877j0(m3847O);
        }
        InterfaceC3810r mo5829e = interfaceC3810r.mo5829e((C3432r) m3847O);
        c2395p.m3888r(false);
        return mo5829e;
    }

    /* renamed from: i */
    public abstract C0512l mo5053i();

    /* renamed from: j */
    public Object m5175j(int i7) {
        Object mo23f;
        C3412h m1100d = mo5053i().m1100d(i7);
        int i8 = i7 - m1100d.f16551a;
        InterfaceC3279c key = m1100d.f16553c.getKey();
        if (key != null && (mo23f = key.mo23f(Integer.valueOf(i8))) != null) {
            return mo23f;
        }
        return new C3408f(i7);
    }
}
