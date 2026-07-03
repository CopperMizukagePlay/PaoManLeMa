package p034e0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import android.view.ActionMode;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0027g1;
import p001a0.C0019e1;
import p001a0.C0022f0;
import p001a0.C0043k1;
import p001a0.C0064p2;
import p001a0.C0072r2;
import p001a0.EnumC0091x0;
import p019c1.C0370n;
import p019c1.C0373q;
import p027d1.C0464b;
import p027d1.C0465c;
import p035e1.C0665l0;
import p035e1.C0677s;
import p050g2.AbstractC1586f0;
import p050g2.C1575a;
import p050g2.C1581d;
import p050g2.C1583e;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p050g2.C1610s;
import p058h2.C1773j;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p086l1.InterfaceC2430a;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3038l;
import p132r2.C3042p;
import p140s2.C3105o;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.C3680h;
import p170w1.C3709o0;
import p170w1.EnumC3671e2;
import p170w1.InterfaceC3658b1;
import p170w1.InterfaceC3667d2;
import p174w5.AbstractC3784a;
import p184y1.C3845a;
import p184y1.C3847c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.o0 */
/* loaded from: classes.dex */
public final class C0622o0 {

    /* renamed from: a */
    public final C0072r2 f2044a;

    /* renamed from: d */
    public C0043k1 f2047d;

    /* renamed from: f */
    public InterfaceC3658b1 f2049f;

    /* renamed from: g */
    public InterfaceC3667d2 f2050g;

    /* renamed from: h */
    public InterfaceC2430a f2051h;

    /* renamed from: i */
    public C0373q f2052i;

    /* renamed from: j */
    public final C2361g1 f2053j;

    /* renamed from: k */
    public final C2361g1 f2054k;

    /* renamed from: l */
    public long f2055l;

    /* renamed from: m */
    public Integer f2056m;

    /* renamed from: n */
    public long f2057n;

    /* renamed from: o */
    public final C2361g1 f2058o;

    /* renamed from: p */
    public final C2361g1 f2059p;

    /* renamed from: q */
    public int f2060q;

    /* renamed from: r */
    public C2459w f2061r;

    /* renamed from: s */
    public C0614k0 f2062s;

    /* renamed from: t */
    public final C0618m0 f2063t;

    /* renamed from: u */
    public final C0019e1 f2064u;

    /* renamed from: b */
    public InterfaceC2453q f2045b = AbstractC0027g1.f130c;

    /* renamed from: c */
    public InterfaceC3279c f2046c = C0594a0.f1954i;

    /* renamed from: e */
    public final C2361g1 f2048e = AbstractC2418w.m3980x(new C2459w((String) null, 0, 7));

    public C0622o0(C0072r2 c0072r2) {
        this.f2044a = c0072r2;
        Boolean bool = Boolean.TRUE;
        this.f2053j = AbstractC2418w.m3980x(bool);
        this.f2054k = AbstractC2418w.m3980x(bool);
        this.f2055l = 0L;
        this.f2057n = 0L;
        this.f2058o = AbstractC2418w.m3980x(null);
        this.f2059p = AbstractC2418w.m3980x(null);
        this.f2060q = -1;
        this.f2061r = new C2459w((String) null, 0L, 7);
        this.f2063t = new C0618m0(this, 1);
        this.f2064u = new C0019e1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        if (r4.f2042b == r8.f2042b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0151, code lost:
    
        r6 = ((p050g2.C1598l0) r3.f2038e).f10288a.f10276a.f10239f;
        r1 = (p034e0.C0623p) r1;
        r7 = r9.f2017b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x015f, code lost:
    
        if (r1 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0165, code lost:
    
        if (r6.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0169, code lost:
    
        r6 = ((p050g2.C1598l0) r3.f2038e).f10288a.f10276a.f10239f;
        r9 = r3.f2035b;
        r10 = r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x017a, code lost:
    
        if (r9 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017c, code lost:
    
        r1 = p001a0.AbstractC0027g1.m67m(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0181, code lost:
    
        if (r7 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0183, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, p060h5.AbstractC1793a0.m2981i(r4, r3, r1), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018c, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018f, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, null, p060h5.AbstractC1793a0.m2981i(r8, r3, r1), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019b, code lost:
    
        if (r9 != r10) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019d, code lost:
    
        r1 = p001a0.AbstractC0027g1.m70p(r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a1, code lost:
    
        if (r7 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a3, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, p060h5.AbstractC1793a0.m2981i(r4, r3, r1), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ac, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, null, p060h5.AbstractC1793a0.m2981i(r8, r3, r1), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b7, code lost:
    
        if (r1.f2067c != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01b9, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01be, code lost:
    
        if ((r7 ^ r13) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c0, code lost:
    
        r1 = p001a0.AbstractC0027g1.m70p(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01c9, code lost:
    
        if (r7 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01cb, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, p060h5.AbstractC1793a0.m2981i(r4, r3, r1), null, r13, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01d5, code lost:
    
        r1 = p034e0.C0623p.m1294a(r5, null, p060h5.AbstractC1793a0.m2981i(r8, r3, r1), r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c5, code lost:
    
        r1 = p001a0.AbstractC0027g1.m67m(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bb, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x014d, code lost:
    
        if (((p050g2.C1598l0) r3.f2038e).f10288a.f10276a.f10239f.length() != r6.f2042b) goto L109;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m1278a(C0622o0 c0622o0, C2459w c2459w, long j6, boolean z7, boolean z8, C0625q c0625q, boolean z9) {
        C0064p2 m120d;
        int i7;
        int i8;
        long j7;
        C0623p c0623p;
        long j8;
        C1587g c1587g;
        C0623p c0623p2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        InterfaceC2430a interfaceC2430a;
        C0621o m2979g;
        C0621o c0621o;
        boolean z16;
        C0621o c0621o2;
        C0621o c0621o3;
        C0043k1 c0043k1 = c0622o0.f2047d;
        if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
            InterfaceC2453q interfaceC2453q = c0622o0.f2045b;
            long j9 = c2459w.f13724b;
            C1587g c1587g2 = c2459w.f13723a;
            int i9 = C1602n0.f10303c;
            long m2558b = AbstractC1586f0.m2558b(interfaceC2453q.mo168b((int) (j9 >> 32)), c0622o0.f2045b.mo168b((int) (j9 & 4294967295L)));
            int m127b = m120d.m127b(j6, false);
            if (!z8 && !z7) {
                i7 = (int) (m2558b >> 32);
            } else {
                i7 = m127b;
            }
            if (z8 && !z7) {
                i8 = (int) (m2558b & 4294967295L);
            } else {
                i8 = m127b;
            }
            C0614k0 c0614k0 = c0622o0.f2062s;
            int i10 = -1;
            if (!z7 && c0614k0 != null) {
                j7 = 4294967295L;
                int i11 = c0622o0.f2060q;
                if (i11 != -1) {
                    i10 = i11;
                }
            } else {
                j7 = 4294967295L;
            }
            C1598l0 c1598l0 = m120d.f322a;
            if (z7) {
                c1587g = c1587g2;
                j8 = j9;
                c0623p = null;
            } else {
                int i12 = (int) (m2558b >> 32);
                j8 = j9;
                int i13 = (int) (m2558b & j7);
                c1587g = c1587g2;
                c0623p = new C0623p(new C0621o(AbstractC3784a.m5813u(c1598l0, i12), i12, 1L), new C0621o(AbstractC3784a.m5813u(c1598l0, i13), i13, 1L), C1602n0.m2590f(m2558b));
            }
            C0614k0 c0614k02 = new C0614k0(z8, c0623p, new C0619n(i7, i8, i10, c1598l0));
            if (c0623p != null && c0614k0 != null && z8 == c0614k0.f2017b) {
                C0619n c0619n = (C0619n) c0614k0.f2019d;
                if (i7 == c0619n.f2035b && i8 == c0619n.f2036c) {
                    return j8;
                }
            }
            c0622o0.f2062s = c0614k02;
            c0622o0.f2060q = m127b;
            int i14 = c0625q.f2070a;
            Object obj = c0614k02.f2019d;
            switch (i14) {
                case 0:
                    C0619n c0619n2 = (C0619n) obj;
                    C0621o m1274a = c0619n2.m1274a(c0619n2.f2035b);
                    C0621o m1274a2 = c0619n2.m1274a(c0619n2.f2036c);
                    if (c0614k02.m1251b() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c0623p2 = new C0623p(m1274a, m1274a2, z10);
                    break;
                case 1:
                    c0623p2 = AbstractC1793a0.m2977e(c0614k02, C0627r.f2073c);
                    break;
                case 2:
                    c0623p2 = AbstractC1793a0.m2977e(c0614k02, C0627r.f2072b);
                    break;
                default:
                    Object obj2 = c0614k02.f2018c;
                    c0623p2 = (C0623p) obj2;
                    if (c0623p2 == null) {
                        c0623p2 = AbstractC1793a0.m2977e(c0614k02, C0627r.f2073c);
                        break;
                    } else {
                        C0621o c0621o4 = c0623p2.f2066b;
                        C0621o c0621o5 = c0623p2.f2065a;
                        C0619n c0619n3 = (C0619n) obj;
                        if (c0614k02.f2017b) {
                            c0621o = AbstractC1793a0.m2979g(c0614k02, c0619n3, c0621o5);
                            m2979g = c0621o4;
                            c0621o4 = c0621o5;
                            c0621o5 = c0621o;
                        } else {
                            m2979g = AbstractC1793a0.m2979g(c0614k02, c0619n3, c0621o4);
                            c0621o = m2979g;
                        }
                        if (!AbstractC3367j.m5096a(c0621o, c0621o4)) {
                            if (c0614k02.m1251b() != 1 && (c0614k02.m1251b() != 3 || c0621o5.f2042b <= m2979g.f2042b)) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            C0623p c0623p3 = new C0623p(c0621o5, m2979g, z16);
                            C0619n c0619n4 = (C0619n) obj;
                            C0621o c0621o6 = c0623p3.f2065a;
                            long j10 = c0621o6.f2043c;
                            C0621o c0621o7 = c0623p3.f2066b;
                            if (j10 != c0621o7.f2043c) {
                                boolean z17 = c0623p3.f2067c;
                                if (z17) {
                                    c0621o2 = c0621o6;
                                } else {
                                    c0621o2 = c0621o7;
                                }
                                if (c0621o2.f2042b == 0) {
                                    if (z17) {
                                        c0621o3 = c0621o7;
                                    } else {
                                        c0621o3 = c0621o6;
                                    }
                                    break;
                                }
                                c0623p2 = c0623p3;
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                    break;
            }
            long m2558b2 = AbstractC1586f0.m2558b(c0622o0.f2045b.mo167a(c0623p2.f2065a.f2042b), c0622o0.f2045b.mo167a(c0623p2.f2066b.f2042b));
            long j11 = j8;
            if (C1602n0.m2585a(m2558b2, j11)) {
                return j11;
            }
            if (C1602n0.m2590f(m2558b2) != C1602n0.m2590f(j11) && C1602n0.m2585a(AbstractC1586f0.m2558b((int) (m2558b2 & j7), (int) (m2558b2 >> 32)), j11)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (C1602n0.m2586b(m2558b2) && C1602n0.m2586b(j11)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z9 && c1587g.f10239f.length() > 0 && !z11 && !z12 && (interfaceC2430a = c0622o0.f2051h) != null) {
                interfaceC2430a.mo4009a();
            }
            c0622o0.f2046c.mo23f(m1279c(c1587g, m2558b2));
            if (!z9) {
                c0622o0.m1293p(!C1602n0.m2586b(m2558b2));
            }
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.f227q.setValue(Boolean.valueOf(z9));
            }
            C0043k1 c0043k13 = c0622o0.f2047d;
            if (c0043k13 != null) {
                if (!C1602n0.m2586b(m2558b2) && AbstractC1793a0.m2963C(c0622o0, true)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c0043k13.f223m.setValue(Boolean.valueOf(z15));
            }
            C0043k1 c0043k14 = c0622o0.f2047d;
            if (c0043k14 == null) {
                z13 = false;
            } else {
                z13 = false;
                if (!C1602n0.m2586b(m2558b2) && AbstractC1793a0.m2963C(c0622o0, false)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c0043k14.f224n.setValue(Boolean.valueOf(z14));
            }
            C0043k1 c0043k15 = c0622o0.f2047d;
            if (c0043k15 == null) {
                return m2558b2;
            }
            if (C1602n0.m2586b(m2558b2) && AbstractC1793a0.m2963C(c0622o0, true)) {
                z13 = true;
            }
            c0043k15.f225o.setValue(Boolean.valueOf(z13));
            return m2558b2;
        }
        return C1602n0.f10302b;
    }

    /* renamed from: c */
    public static C2459w m1279c(C1587g c1587g, long j6) {
        return new C2459w(c1587g, j6, (C1602n0) null);
    }

    /* renamed from: b */
    public final void m1280b(boolean z7) {
        if (!C1602n0.m2586b(m1287j().f13724b)) {
            InterfaceC3658b1 interfaceC3658b1 = this.f2049f;
            if (interfaceC3658b1 != null) {
                ((C3680h) interfaceC3658b1).m5679a(AbstractC2080d.m3403p(m1287j()));
            }
            if (!z7) {
                return;
            }
            int m2588d = C1602n0.m2588d(m1287j().f13724b);
            this.f2046c.mo23f(m1279c(m1287j().f13723a, AbstractC1586f0.m2558b(m2588d, m2588d)));
            m1291n(EnumC0091x0.f416e);
        }
    }

    /* renamed from: d */
    public final void m1281d() {
        if (C1602n0.m2586b(m1287j().f13724b)) {
            return;
        }
        InterfaceC3658b1 interfaceC3658b1 = this.f2049f;
        if (interfaceC3658b1 != null) {
            ((C3680h) interfaceC3658b1).m5679a(AbstractC2080d.m3403p(m1287j()));
        }
        C1587g m3407t = AbstractC2080d.m3407t(m1287j(), m1287j().f13723a.f10239f.length());
        C1587g m3406s = AbstractC2080d.m3406s(m1287j(), m1287j().f13723a.f10239f.length());
        C1581d c1581d = new C1581d(m3407t);
        c1581d.m2554a(m3406s);
        C1587g m2555b = c1581d.m2555b();
        int m2589e = C1602n0.m2589e(m1287j().f13724b);
        this.f2046c.mo23f(m1279c(m2555b, AbstractC1586f0.m2558b(m2589e, m2589e)));
        m1291n(EnumC0091x0.f416e);
        this.f2044a.f360e = true;
    }

    /* renamed from: e */
    public final void m1282e(C0464b c0464b) {
        EnumC0091x0 enumC0091x0;
        C0064p2 c0064p2;
        int m2588d;
        if (!C1602n0.m2586b(m1287j().f13724b)) {
            C0043k1 c0043k1 = this.f2047d;
            if (c0043k1 != null) {
                c0064p2 = c0043k1.m120d();
            } else {
                c0064p2 = null;
            }
            if (c0464b != null && c0064p2 != null) {
                m2588d = this.f2045b.mo167a(c0064p2.m127b(c0464b.f1623a, true));
            } else {
                m2588d = C1602n0.m2588d(m1287j().f13724b);
            }
            this.f2046c.mo23f(C2459w.m4026a(m1287j(), null, AbstractC1586f0.m2558b(m2588d, m2588d), 5));
        }
        if (c0464b != null && m1287j().f13723a.f10239f.length() > 0) {
            enumC0091x0 = EnumC0091x0.f418g;
        } else {
            enumC0091x0 = EnumC0091x0.f416e;
        }
        m1291n(enumC0091x0);
        m1293p(false);
    }

    /* renamed from: f */
    public final void m1283f(boolean z7) {
        C0373q c0373q;
        C0043k1 c0043k1 = this.f2047d;
        if (c0043k1 != null && !c0043k1.m118b() && (c0373q = this.f2052i) != null) {
            c0373q.m843a(new C0370n(1, 3));
        }
        this.f2061r = m1287j();
        m1293p(z7);
        m1291n(EnumC0091x0.f417f);
    }

    /* renamed from: g */
    public final C0464b m1284g() {
        return (C0464b) this.f2059p.getValue();
    }

    /* renamed from: h */
    public final boolean m1285h() {
        return ((Boolean) this.f2054k.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final long m1286i(boolean z7) {
        C0064p2 m120d;
        C1587g c1587g;
        long j6;
        int max;
        boolean z8;
        int m2560d;
        float m2936i;
        C0043k1 c0043k1 = this.f2047d;
        if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
            C1598l0 c1598l0 = m120d.f322a;
            C0043k1 c0043k12 = this.f2047d;
            if (c0043k12 != null) {
                c1587g = c0043k12.f211a.f332a;
            } else {
                c1587g = null;
            }
            if (c1587g != null) {
                if (AbstractC3367j.m5096a(c1587g.f10239f, c1598l0.f10288a.f10276a.f10239f)) {
                    C2459w m1287j = m1287j();
                    if (z7) {
                        long j7 = m1287j.f13724b;
                        int i7 = C1602n0.f10303c;
                        j6 = j7 >> 32;
                    } else {
                        long j8 = m1287j.f13724b;
                        int i8 = C1602n0.f10303c;
                        j6 = j8 & 4294967295L;
                    }
                    int mo168b = this.f2045b.mo168b((int) j6);
                    boolean m2590f = C1602n0.m2590f(m1287j().f13724b);
                    int m2578e = c1598l0.m2578e(mo168b);
                    long j9 = c1598l0.f10290c;
                    C1605p c1605p = c1598l0.f10289b;
                    if (m2578e < c1605p.f10317f) {
                        if ((z7 && !m2590f) || (!z7 && m2590f)) {
                            max = mo168b;
                        } else {
                            max = Math.max(mo168b - 1, 0);
                        }
                        if (c1598l0.m2574a(max) == c1598l0.m2582i(mo168b)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        ArrayList arrayList = c1605p.f10319h;
                        c1605p.m2605i(mo168b);
                        if (mo168b == ((C1587g) c1605p.f10312a.f10325b).f10239f.length()) {
                            m2560d = AbstractC1806n.m3066N(arrayList);
                        } else {
                            m2560d = AbstractC1586f0.m2560d(mo168b, arrayList);
                        }
                        C1610s c1610s = (C1610s) arrayList.get(m2560d);
                        C1575a c1575a = c1610s.f10329a;
                        int m2620d = c1610s.m2620d(mo168b);
                        C1773j c1773j = c1575a.f10195d;
                        if (z8) {
                            m2936i = c1773j.m2935h(m2620d, false);
                        } else {
                            m2936i = c1773j.m2936i(m2620d, false);
                        }
                        return AbstractC3784a.m5797a(AbstractC2168e.m3529p(m2936i, 0.0f, (int) (j9 >> 32)), AbstractC2168e.m3529p(c1605p.m2599b(m2578e), 0.0f, (int) (4294967295L & j9)));
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    /* renamed from: j */
    public final C2459w m1287j() {
        return (C2459w) this.f2048e.getValue();
    }

    /* renamed from: k */
    public final void m1288k() {
        EnumC3671e2 enumC3671e2;
        InterfaceC3667d2 interfaceC3667d2 = this.f2050g;
        if (interfaceC3667d2 != null) {
            enumC3671e2 = ((C3709o0) interfaceC3667d2).f17629d;
        } else {
            enumC3671e2 = null;
        }
        if (enumC3671e2 == EnumC3671e2.f17506e && interfaceC3667d2 != null) {
            C3709o0 c3709o0 = (C3709o0) interfaceC3667d2;
            c3709o0.f17629d = EnumC3671e2.f17507f;
            ActionMode actionMode = c3709o0.f17627b;
            if (actionMode != null) {
                actionMode.finish();
            }
            c3709o0.f17627b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, w1.g1] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1289l() {
        C1587g c1587g;
        CharSequence charSequence;
        CharSequence charSequence2;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        InterfaceC3658b1 interfaceC3658b1 = this.f2049f;
        if (interfaceC3658b1 != null) {
            ClipData primaryClip = ((C3680h) interfaceC3658b1).f17534a.getPrimaryClip();
            byte b13 = 1;
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                byte b14 = 0;
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt != null) {
                    charSequence = itemAt.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    if (!(charSequence instanceof Spanned)) {
                        c1587g = new C1587g(charSequence.toString());
                    } else {
                        Spanned spanned = (Spanned) charSequence;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        AbstractC3367j.m5100e(annotationArr, "<this>");
                        int length = annotationArr.length - 1;
                        byte b15 = 4;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i7];
                                if (!AbstractC3367j.m5096a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    charSequence2 = charSequence;
                                    b8 = b14;
                                } else {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    ?? obj = new Object();
                                    Parcel obtain = Parcel.obtain();
                                    obj.f17533a = obtain;
                                    byte[] decode = Base64.decode(value, 0);
                                    b8 = b14;
                                    obtain.unmarshall(decode, 0, decode.length);
                                    obtain.setDataPosition(0);
                                    Parcel parcel = obj.f17533a;
                                    long j6 = C0677s.f2209g;
                                    long j7 = j6;
                                    long j8 = C3105o.f15708c;
                                    long j9 = j8;
                                    C2300k c2300k = null;
                                    C2298i c2298i = null;
                                    C2299j c2299j = null;
                                    String str = null;
                                    C3027a c3027a = null;
                                    C3042p c3042p = null;
                                    C3038l c3038l = null;
                                    C0665l0 c0665l0 = null;
                                    while (parcel.dataAvail() > b13) {
                                        byte readByte = parcel.readByte();
                                        if (readByte == b13) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                j6 = obj.m5670a();
                                            }
                                        } else if (readByte == 2) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            } else {
                                                j8 = obj.m5671b();
                                            }
                                        } else if (readByte == 3) {
                                            if (parcel.dataAvail() < b15) {
                                                break;
                                            } else {
                                                c2300k = new C2300k(parcel.readInt());
                                            }
                                        } else if (readByte == b15) {
                                            if (parcel.dataAvail() < b13) {
                                                break;
                                            }
                                            byte readByte2 = parcel.readByte();
                                            if (readByte2 == 0 || readByte2 != b13) {
                                                b9 = b8;
                                            } else {
                                                b9 = b13;
                                            }
                                            c2298i = new C2298i(b9);
                                        } else if (readByte == 5) {
                                            if (parcel.dataAvail() < b13) {
                                                break;
                                            }
                                            byte readByte3 = parcel.readByte();
                                            if (readByte3 != 0) {
                                                if (readByte3 == b13) {
                                                    b10 = 65535;
                                                } else if (readByte3 == 3) {
                                                    b10 = 2;
                                                } else if (readByte3 == 2) {
                                                    b10 = b13;
                                                }
                                                c2299j = new C2299j(b10);
                                            }
                                            b10 = b8;
                                            c2299j = new C2299j(b10);
                                        } else if (readByte == 6) {
                                            str = parcel.readString();
                                        } else if (readByte == 7) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            } else {
                                                j9 = obj.m5671b();
                                            }
                                        } else if (readByte == 8) {
                                            if (parcel.dataAvail() < b15) {
                                                break;
                                            } else {
                                                c3027a = new C3027a(parcel.readFloat());
                                            }
                                        } else if (readByte == 9) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                c3042p = new C3042p(parcel.readFloat(), parcel.readFloat());
                                            }
                                        } else if (readByte == 10) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            } else {
                                                j7 = obj.m5670a();
                                            }
                                        } else if (readByte == 11) {
                                            if (parcel.dataAvail() < b15) {
                                                break;
                                            }
                                            int readInt = parcel.readInt();
                                            if ((readInt & 2) != 0) {
                                                b11 = b13;
                                            } else {
                                                b11 = b8;
                                            }
                                            if ((readInt & 1) != 0) {
                                                b12 = b13;
                                            } else {
                                                b12 = b8;
                                            }
                                            C3038l c3038l2 = C3038l.f15606d;
                                            C3038l c3038l3 = C3038l.f15605c;
                                            if (b11 != 0 && b12 != 0) {
                                                List m3067O = AbstractC1806n.m3067O(c3038l2, c3038l3);
                                                Integer valueOf = Integer.valueOf(b8);
                                                int size = m3067O.size();
                                                for (int i8 = b8; i8 < size; i8++) {
                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((C3038l) m3067O.get(i8)).f15607a);
                                                }
                                                c3038l = new C3038l(valueOf.intValue());
                                            } else if (b11 != 0) {
                                                c3038l = c3038l2;
                                            } else {
                                                if (b12 == 0) {
                                                    c3038l3 = C3038l.f15604b;
                                                }
                                                c3038l = c3038l3;
                                            }
                                            b13 = 1;
                                            b15 = 4;
                                        } else {
                                            if (readByte == 12) {
                                                if (parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                long m5670a = obj.m5670a();
                                                float readFloat = parcel.readFloat();
                                                float readFloat2 = parcel.readFloat();
                                                charSequence = charSequence;
                                                c0665l0 = new C0665l0(m5670a, (Float.floatToRawIntBits(readFloat) << 32) | (Float.floatToRawIntBits(readFloat2) & 4294967295L), parcel.readFloat());
                                            }
                                            b13 = 1;
                                            b15 = 4;
                                        }
                                    }
                                    charSequence2 = charSequence;
                                    arrayList.add(new C1583e(spanStart, spanEnd, new C1588g0(j6, j8, c2300k, c2298i, c2299j, (AbstractC2305p) null, str, j9, c3027a, c3042p, (C2714b) null, j7, c3038l, c0665l0, 49152)));
                                }
                                if (i7 == length) {
                                    break;
                                }
                                i7++;
                                charSequence = charSequence2;
                                b14 = b8;
                                b13 = 1;
                                b15 = 4;
                            }
                        } else {
                            charSequence2 = charSequence;
                        }
                        c1587g = new C1587g(charSequence2.toString(), arrayList, 4);
                    }
                    if (c1587g == null) {
                        C1581d c1581d = new C1581d(AbstractC2080d.m3407t(m1287j(), m1287j().f13723a.f10239f.length()));
                        c1581d.m2554a(c1587g);
                        C1587g m2555b = c1581d.m2555b();
                        C1587g m3406s = AbstractC2080d.m3406s(m1287j(), m1287j().f13723a.f10239f.length());
                        C1581d c1581d2 = new C1581d(m2555b);
                        c1581d2.m2554a(m3406s);
                        C1587g m2555b2 = c1581d2.m2555b();
                        int length2 = c1587g.f10239f.length() + C1602n0.m2589e(m1287j().f13724b);
                        this.f2046c.mo23f(m1279c(m2555b2, AbstractC1586f0.m2558b(length2, length2)));
                        m1291n(EnumC0091x0.f416e);
                        this.f2044a.f360e = true;
                        return;
                    }
                    return;
                }
            }
            c1587g = null;
            if (c1587g == null) {
            }
        }
    }

    /* renamed from: m */
    public final void m1290m() {
        C2459w m1279c = m1279c(m1287j().f13723a, AbstractC1586f0.m2558b(0, m1287j().f13723a.f10239f.length()));
        this.f2046c.mo23f(m1279c);
        this.f2061r = C2459w.m4026a(this.f2061r, null, m1279c.f13724b, 5);
        m1283f(true);
    }

    /* renamed from: n */
    public final void m1291n(EnumC0091x0 enumC0091x0) {
        C0043k1 c0043k1 = this.f2047d;
        if (c0043k1 != null) {
            if (c0043k1.m117a() == enumC0091x0) {
                c0043k1 = null;
            }
            if (c0043k1 != null) {
                c0043k1.f221k.setValue(enumC0091x0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a0  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1292o() {
        C0022f0 c0022f0;
        C0022f0 c0022f02;
        C0022f0 c0022f03;
        C0022f0 c0022f04;
        InterfaceC3667d2 interfaceC3667d2;
        InterfaceC3667d2 interfaceC3667d22;
        C0465c c0465c;
        ActionMode actionMode;
        long j6;
        float f7;
        InterfaceC3238v m119c;
        float f8;
        InterfaceC3238v m119c2;
        float f9;
        InterfaceC3238v m119c3;
        InterfaceC3238v m119c4;
        InterfaceC3658b1 interfaceC3658b1;
        boolean z7;
        if (m1285h()) {
            C0043k1 c0043k1 = this.f2047d;
            if (c0043k1 == null || ((Boolean) c0043k1.f227q.getValue()).booleanValue()) {
                C0043k1 c0043k12 = null;
                if (!C1602n0.m2586b(m1287j().f13724b)) {
                    c0022f0 = new C0022f0(this, 4);
                } else {
                    c0022f0 = null;
                }
                boolean m2586b = C1602n0.m2586b(m1287j().f13724b);
                C2361g1 c2361g1 = this.f2053j;
                if (!m2586b && ((Boolean) c2361g1.getValue()).booleanValue()) {
                    c0022f02 = new C0022f0(this, 5);
                } else {
                    c0022f02 = null;
                }
                if (((Boolean) c2361g1.getValue()).booleanValue() && (interfaceC3658b1 = this.f2049f) != null) {
                    ClipDescription primaryClipDescription = ((C3680h) interfaceC3658b1).f17534a.getPrimaryClipDescription();
                    if (primaryClipDescription != null) {
                        z7 = primaryClipDescription.hasMimeType("text/*");
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        c0022f03 = new C0022f0(this, 6);
                        if (C1602n0.m2587c(m1287j().f13724b) == m1287j().f13723a.f10239f.length()) {
                            c0022f04 = new C0022f0(this, 7);
                        } else {
                            c0022f04 = null;
                        }
                        interfaceC3667d2 = this.f2050g;
                        if (interfaceC3667d2 == null) {
                            C0043k1 c0043k13 = this.f2047d;
                            if (c0043k13 != null) {
                                if (!c0043k13.f226p) {
                                    c0043k12 = c0043k13;
                                }
                                if (c0043k12 != null) {
                                    int mo168b = this.f2045b.mo168b((int) (m1287j().f13724b >> 32));
                                    int mo168b2 = this.f2045b.mo168b((int) (m1287j().f13724b & 4294967295L));
                                    C0043k1 c0043k14 = this.f2047d;
                                    long j7 = 0;
                                    if (c0043k14 != null && (m119c4 = c0043k14.m119c()) != null) {
                                        j6 = m119c4.mo4927U(m1286i(true));
                                    } else {
                                        j6 = 0;
                                    }
                                    C0043k1 c0043k15 = this.f2047d;
                                    if (c0043k15 != null && (m119c3 = c0043k15.m119c()) != null) {
                                        j7 = m119c3.mo4927U(m1286i(false));
                                    }
                                    C0043k1 c0043k16 = this.f2047d;
                                    float f10 = 0.0f;
                                    if (c0043k16 != null && (m119c2 = c0043k16.m119c()) != null) {
                                        C0064p2 m120d = c0043k12.m120d();
                                        if (m120d != null) {
                                            f9 = m120d.f322a.m2576c(mo168b).f1626b;
                                        } else {
                                            f9 = 0.0f;
                                        }
                                        interfaceC3667d22 = interfaceC3667d2;
                                        f7 = C0464b.m1009e(m119c2.mo4927U(AbstractC3784a.m5797a(0.0f, f9)));
                                    } else {
                                        interfaceC3667d22 = interfaceC3667d2;
                                        f7 = 0.0f;
                                    }
                                    C0043k1 c0043k17 = this.f2047d;
                                    if (c0043k17 != null && (m119c = c0043k17.m119c()) != null) {
                                        C0064p2 m120d2 = c0043k12.m120d();
                                        if (m120d2 != null) {
                                            f8 = m120d2.f322a.m2576c(mo168b2).f1626b;
                                        } else {
                                            f8 = 0.0f;
                                        }
                                        f10 = C0464b.m1009e(m119c.mo4927U(AbstractC3784a.m5797a(0.0f, f8)));
                                    }
                                    c0465c = new C0465c(Math.min(C0464b.m1008d(j6), C0464b.m1008d(j7)), Math.min(f7, f10), Math.max(C0464b.m1008d(j6), C0464b.m1008d(j7)), (c0043k12.f211a.f338g.mo559b() * 25) + Math.max(C0464b.m1009e(j6), C0464b.m1009e(j7)));
                                    C3709o0 c3709o0 = (C3709o0) interfaceC3667d22;
                                    C3847c c3847c = c3709o0.f17628c;
                                    c3847c.f18070b = c0465c;
                                    c3847c.f18071c = c0022f0;
                                    c3847c.f18073e = c0022f02;
                                    c3847c.f18072d = c0022f03;
                                    c3847c.f18074f = c0022f04;
                                    actionMode = c3709o0.f17627b;
                                    if (actionMode != null) {
                                        c3709o0.f17629d = EnumC3671e2.f17506e;
                                        c3709o0.f17627b = c3709o0.f17626a.startActionMode(new C3845a(c3847c), 1);
                                        return;
                                    } else {
                                        actionMode.invalidate();
                                        return;
                                    }
                                }
                            }
                            interfaceC3667d22 = interfaceC3667d2;
                            c0465c = C0465c.f1624e;
                            C3709o0 c3709o02 = (C3709o0) interfaceC3667d22;
                            C3847c c3847c2 = c3709o02.f17628c;
                            c3847c2.f18070b = c0465c;
                            c3847c2.f18071c = c0022f0;
                            c3847c2.f18073e = c0022f02;
                            c3847c2.f18072d = c0022f03;
                            c3847c2.f18074f = c0022f04;
                            actionMode = c3709o02.f17627b;
                            if (actionMode != null) {
                            }
                        } else {
                            return;
                        }
                    }
                }
                c0022f03 = null;
                if (C1602n0.m2587c(m1287j().f13724b) == m1287j().f13723a.f10239f.length()) {
                }
                interfaceC3667d2 = this.f2050g;
                if (interfaceC3667d2 == null) {
                }
            }
        }
    }

    /* renamed from: p */
    public final void m1293p(boolean z7) {
        C0043k1 c0043k1 = this.f2047d;
        if (c0043k1 != null) {
            c0043k1.f222l.setValue(Boolean.valueOf(z7));
        }
        if (z7) {
            m1292o();
        } else {
            m1288k();
        }
    }
}
