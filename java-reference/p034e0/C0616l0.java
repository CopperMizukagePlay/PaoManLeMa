package p034e0;

import java.util.List;
import p001a0.AbstractC0027g1;
import p001a0.C0064p2;
import p027d1.C0465c;
import p027d1.C0467e;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p060h5.AbstractC1806n;
import p087l2.C2432a;
import p087l2.C2458v;
import p087l2.C2459w;
import p087l2.InterfaceC2443g;
import p087l2.InterfaceC2453q;
import p132r2.EnumC3036j;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.l0 */
/* loaded from: classes.dex */
public final class C0616l0 {

    /* renamed from: a */
    public final C1587g f2023a;

    /* renamed from: b */
    public final long f2024b;

    /* renamed from: c */
    public final C1598l0 f2025c;

    /* renamed from: d */
    public final InterfaceC2453q f2026d;

    /* renamed from: e */
    public final C0634u0 f2027e;

    /* renamed from: f */
    public long f2028f;

    /* renamed from: g */
    public final C1587g f2029g;

    /* renamed from: h */
    public final C2459w f2030h;

    /* renamed from: i */
    public final C0064p2 f2031i;

    public C0616l0(C2459w c2459w, InterfaceC2453q interfaceC2453q, C0064p2 c0064p2, C0634u0 c0634u0) {
        C1598l0 c1598l0;
        C1587g c1587g = c2459w.f13723a;
        long j6 = c2459w.f13724b;
        if (c0064p2 != null) {
            c1598l0 = c0064p2.f322a;
        } else {
            c1598l0 = null;
        }
        this.f2023a = c1587g;
        this.f2024b = j6;
        this.f2025c = c1598l0;
        this.f2026d = interfaceC2453q;
        this.f2027e = c0634u0;
        this.f2028f = j6;
        this.f2029g = c1587g;
        this.f2030h = c2459w;
        this.f2031i = c0064p2;
    }

    /* renamed from: a */
    public final List m1253a(InterfaceC3279c interfaceC3279c) {
        if (C1602n0.m2586b(this.f2028f)) {
            InterfaceC2443g interfaceC2443g = (InterfaceC2443g) interfaceC3279c.mo23f(this);
            if (interfaceC2443g != null) {
                return AbstractC3784a.m5817z(interfaceC2443g);
            }
            return null;
        }
        return AbstractC1806n.m3067O(new C2432a("", 0), new C2458v(C1602n0.m2589e(this.f2028f), C1602n0.m2589e(this.f2028f)));
    }

    /* renamed from: b */
    public final Integer m1254b() {
        C1598l0 c1598l0 = this.f2025c;
        if (c1598l0 != null) {
            int m2588d = C1602n0.m2588d(this.f2028f);
            InterfaceC2453q interfaceC2453q = this.f2026d;
            return Integer.valueOf(interfaceC2453q.mo167a(c1598l0.m2577d(c1598l0.m2578e(interfaceC2453q.mo168b(m2588d)), true)));
        }
        return null;
    }

    /* renamed from: c */
    public final Integer m1255c() {
        int length;
        C1598l0 c1598l0 = this.f2025c;
        if (c1598l0 != null) {
            int m1268p = m1268p();
            while (true) {
                C1587g c1587g = this.f2023a;
                if (m1268p >= c1587g.f10239f.length()) {
                    length = c1587g.f10239f.length();
                    break;
                }
                int length2 = this.f2029g.f10239f.length() - 1;
                if (m1268p <= length2) {
                    length2 = m1268p;
                }
                long m2584k = c1598l0.m2584k(length2);
                int i7 = C1602n0.f10303c;
                int i8 = (int) (m2584k & 4294967295L);
                if (i8 <= m1268p) {
                    m1268p++;
                } else {
                    length = this.f2026d.mo167a(i8);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    /* renamed from: d */
    public final Integer m1256d() {
        int i7;
        C1598l0 c1598l0 = this.f2025c;
        if (c1598l0 != null) {
            int m1268p = m1268p();
            while (true) {
                if (m1268p <= 0) {
                    i7 = 0;
                    break;
                }
                int length = this.f2029g.f10239f.length() - 1;
                if (m1268p <= length) {
                    length = m1268p;
                }
                long m2584k = c1598l0.m2584k(length);
                int i8 = C1602n0.f10303c;
                int i9 = (int) (m2584k >> 32);
                if (i9 >= m1268p) {
                    m1268p--;
                } else {
                    i7 = this.f2026d.mo167a(i9);
                    break;
                }
            }
            return Integer.valueOf(i7);
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m1257e() {
        EnumC3036j enumC3036j;
        C1598l0 c1598l0 = this.f2025c;
        if (c1598l0 != null) {
            enumC3036j = c1598l0.m2582i(m1268p());
        } else {
            enumC3036j = null;
        }
        if (enumC3036j != EnumC3036j.f15601f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m1258f(C1598l0 c1598l0, int i7) {
        int m1268p = m1268p();
        C0634u0 c0634u0 = this.f2027e;
        if (c0634u0.f2098a == null) {
            c0634u0.f2098a = Float.valueOf(c1598l0.m2576c(m1268p).f1625a);
        }
        int m2578e = c1598l0.m2578e(m1268p);
        C1605p c1605p = c1598l0.f10289b;
        int i8 = m2578e + i7;
        if (i8 < 0) {
            return 0;
        }
        if (i8 >= c1605p.f10317f) {
            return this.f2029g.f10239f.length();
        }
        float m2599b = c1605p.m2599b(i8) - 1;
        Float f7 = c0634u0.f2098a;
        AbstractC3367j.m5097b(f7);
        float floatValue = f7.floatValue();
        if ((m1257e() && floatValue >= c1598l0.m2580g(i8)) || (!m1257e() && floatValue <= c1598l0.m2579f(i8))) {
            return c1598l0.m2577d(i8, true);
        }
        return this.f2026d.mo167a(c1605p.m2602e(AbstractC3784a.m5797a(f7.floatValue(), m2599b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r7 == null) goto L9;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1259g(C0064p2 c0064p2, int i7) {
        C0465c c0465c;
        InterfaceC3238v interfaceC3238v = c0064p2.f323b;
        C1598l0 c1598l0 = c0064p2.f322a;
        if (interfaceC3238v != null) {
            InterfaceC3238v interfaceC3238v2 = c0064p2.f324c;
            if (interfaceC3238v2 != null) {
                c0465c = interfaceC3238v2.mo4934j(interfaceC3238v, true);
            } else {
                c0465c = null;
            }
        }
        c0465c = C0465c.f1624e;
        long j6 = this.f2030h.f13724b;
        int i8 = C1602n0.f10303c;
        int i9 = (int) (j6 & 4294967295L);
        InterfaceC2453q interfaceC2453q = this.f2026d;
        C0465c m2576c = c1598l0.m2576c(interfaceC2453q.mo168b(i9));
        return interfaceC2453q.mo167a(c1598l0.f10289b.m2602e(AbstractC3784a.m5797a(m2576c.f1625a, (C0467e.m1024b(c0465c.m1015b()) * i7) + m2576c.f1626b)));
    }

    /* renamed from: h */
    public final void m1260h() {
        C0634u0 c0634u0 = this.f2027e;
        c0634u0.f2098a = null;
        C1587g c1587g = this.f2029g;
        if (c1587g.f10239f.length() > 0) {
            if (m1257e()) {
                c0634u0.f2098a = null;
                if (c1587g.f10239f.length() > 0) {
                    String str = c1587g.f10239f;
                    long j6 = this.f2028f;
                    int i7 = C1602n0.f10303c;
                    int m70p = AbstractC0027g1.m70p(str, (int) (j6 & 4294967295L));
                    if (m70p != -1) {
                        m1267o(m70p, m70p);
                        return;
                    }
                    return;
                }
                return;
            }
            c0634u0.f2098a = null;
            if (c1587g.f10239f.length() > 0) {
                String str2 = c1587g.f10239f;
                long j7 = this.f2028f;
                int i8 = C1602n0.f10303c;
                int m67m = AbstractC0027g1.m67m(str2, (int) (j7 & 4294967295L));
                if (m67m != -1) {
                    m1267o(m67m, m67m);
                }
            }
        }
    }

    /* renamed from: i */
    public final void m1261i() {
        this.f2027e.f2098a = null;
        C1587g c1587g = this.f2029g;
        String str = c1587g.f10239f;
        String str2 = c1587g.f10239f;
        if (str.length() > 0) {
            int m68n = AbstractC0027g1.m68n(str2, C1602n0.m2588d(this.f2028f));
            if (m68n == C1602n0.m2588d(this.f2028f) && m68n != str2.length()) {
                m68n = AbstractC0027g1.m68n(str2, m68n + 1);
            }
            m1267o(m68n, m68n);
        }
    }

    /* renamed from: j */
    public final void m1262j() {
        this.f2027e.f2098a = null;
        C1587g c1587g = this.f2029g;
        String str = c1587g.f10239f;
        String str2 = c1587g.f10239f;
        if (str.length() > 0) {
            int m69o = AbstractC0027g1.m69o(str2, C1602n0.m2589e(this.f2028f));
            if (m69o == C1602n0.m2589e(this.f2028f) && m69o != 0) {
                m69o = AbstractC0027g1.m69o(str2, m69o - 1);
            }
            m1267o(m69o, m69o);
        }
    }

    /* renamed from: k */
    public final void m1263k() {
        C0634u0 c0634u0 = this.f2027e;
        c0634u0.f2098a = null;
        C1587g c1587g = this.f2029g;
        if (c1587g.f10239f.length() > 0) {
            if (m1257e()) {
                c0634u0.f2098a = null;
                if (c1587g.f10239f.length() > 0) {
                    String str = c1587g.f10239f;
                    long j6 = this.f2028f;
                    int i7 = C1602n0.f10303c;
                    int m67m = AbstractC0027g1.m67m(str, (int) (j6 & 4294967295L));
                    if (m67m != -1) {
                        m1267o(m67m, m67m);
                        return;
                    }
                    return;
                }
                return;
            }
            c0634u0.f2098a = null;
            if (c1587g.f10239f.length() > 0) {
                String str2 = c1587g.f10239f;
                long j7 = this.f2028f;
                int i8 = C1602n0.f10303c;
                int m70p = AbstractC0027g1.m70p(str2, (int) (j7 & 4294967295L));
                if (m70p != -1) {
                    m1267o(m70p, m70p);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m1264l() {
        Integer m1254b;
        this.f2027e.f2098a = null;
        if (this.f2029g.f10239f.length() > 0 && (m1254b = m1254b()) != null) {
            int intValue = m1254b.intValue();
            m1267o(intValue, intValue);
        }
    }

    /* renamed from: m */
    public final void m1265m() {
        Integer num = null;
        this.f2027e.f2098a = null;
        if (this.f2029g.f10239f.length() > 0) {
            C1598l0 c1598l0 = this.f2025c;
            if (c1598l0 != null) {
                int m2589e = C1602n0.m2589e(this.f2028f);
                InterfaceC2453q interfaceC2453q = this.f2026d;
                num = Integer.valueOf(interfaceC2453q.mo167a(c1598l0.m2581h(c1598l0.m2578e(interfaceC2453q.mo168b(m2589e)))));
            }
            if (num != null) {
                int intValue = num.intValue();
                m1267o(intValue, intValue);
            }
        }
    }

    /* renamed from: n */
    public final void m1266n() {
        if (this.f2029g.f10239f.length() > 0) {
            int i7 = C1602n0.f10303c;
            this.f2028f = AbstractC1586f0.m2558b((int) (this.f2024b >> 32), (int) (this.f2028f & 4294967295L));
        }
    }

    /* renamed from: o */
    public final void m1267o(int i7, int i8) {
        this.f2028f = AbstractC1586f0.m2558b(i7, i8);
    }

    /* renamed from: p */
    public final int m1268p() {
        long j6 = this.f2028f;
        int i7 = C1602n0.f10303c;
        return this.f2026d.mo168b((int) (j6 & 4294967295L));
    }
}
