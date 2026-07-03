package p034e0;

import p001a0.C0043k1;
import p001a0.C0064p2;
import p001a0.EnumC0088w0;
import p001a0.EnumC0091x0;
import p001a0.InterfaceC0071r1;
import p027d1.C0464b;
import p050g2.AbstractC1586f0;
import p050g2.C1602n0;
import p060h5.AbstractC1793a0;
import p085l0.C2361g1;
import p086l1.InterfaceC2430a;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.m0 */
/* loaded from: classes.dex */
public final class C0618m0 implements InterfaceC0071r1 {

    /* renamed from: a */
    public final /* synthetic */ int f2032a;

    /* renamed from: b */
    public final /* synthetic */ C0622o0 f2033b;

    public /* synthetic */ C0618m0(C0622o0 c0622o0, int i7) {
        this.f2032a = i7;
        this.f2033b = c0622o0;
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: a */
    public final void mo161a() {
        switch (this.f2032a) {
            case 0:
                C0622o0 c0622o0 = this.f2033b;
                c0622o0.f2058o.setValue(null);
                c0622o0.f2059p.setValue(null);
                return;
            default:
                m1273i();
                return;
        }
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: b */
    public final void mo162b() {
        switch (this.f2032a) {
            case 0:
                C0622o0 c0622o0 = this.f2033b;
                c0622o0.f2058o.setValue(null);
                c0622o0.f2059p.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: c */
    public final void mo163c(long j6) {
        C0064p2 m120d;
        long j7;
        C0064p2 m120d2;
        C0064p2 m120d3;
        switch (this.f2032a) {
            case 0:
                C0622o0 c0622o0 = this.f2033b;
                long m1286i = c0622o0.m1286i(true);
                float f7 = AbstractC0641z.f2120a;
                long m5797a = AbstractC3784a.m5797a(C0464b.m1008d(m1286i), C0464b.m1009e(m1286i) - 1.0f);
                C0043k1 c0043k1 = c0622o0.f2047d;
                if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
                    long m130e = m120d.m130e(m5797a);
                    c0622o0.f2055l = m130e;
                    c0622o0.f2059p.setValue(new C0464b(m130e));
                    c0622o0.f2057n = 0L;
                    c0622o0.f2058o.setValue(EnumC0088w0.f405e);
                    c0622o0.m1293p(false);
                    return;
                }
                return;
            default:
                C0622o0 c0622o02 = this.f2033b;
                C2361g1 c2361g1 = c0622o02.f2058o;
                if (c0622o02.m1285h() && ((EnumC0088w0) c2361g1.getValue()) == null) {
                    c2361g1.setValue(EnumC0088w0.f407g);
                    c0622o02.f2060q = -1;
                    c0622o02.m1288k();
                    C0043k1 c0043k12 = c0622o02.f2047d;
                    if (c0043k12 != null && (m120d3 = c0043k12.m120d()) != null && m120d3.m128c(j6)) {
                        if (c0622o02.m1287j().f13723a.f10239f.length() != 0) {
                            c0622o02.m1283f(false);
                            j7 = j6;
                            c0622o02.f2056m = Integer.valueOf((int) (C0622o0.m1278a(c0622o02, C2459w.m4026a(c0622o02.m1287j(), null, C1602n0.f10302b, 5), j7, true, false, C0627r.f2075e, true) >> 32));
                        } else {
                            return;
                        }
                    } else {
                        j7 = j6;
                        C0043k1 c0043k13 = c0622o02.f2047d;
                        if (c0043k13 != null && (m120d2 = c0043k13.m120d()) != null) {
                            int mo167a = c0622o02.f2045b.mo167a(m120d2.m127b(j7, true));
                            C2459w m1279c = C0622o0.m1279c(c0622o02.m1287j().f13723a, AbstractC1586f0.m2558b(mo167a, mo167a));
                            c0622o02.m1283f(false);
                            InterfaceC2430a interfaceC2430a = c0622o02.f2051h;
                            if (interfaceC2430a != null) {
                                interfaceC2430a.mo4009a();
                            }
                            c0622o02.f2046c.mo23f(m1279c);
                        }
                    }
                    c0622o02.m1291n(EnumC0091x0.f416e);
                    c0622o02.f2055l = j7;
                    c0622o02.f2059p.setValue(new C0464b(j7));
                    c0622o02.f2057n = 0L;
                    return;
                }
                return;
        }
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: d */
    public final void mo164d() {
        int i7 = this.f2032a;
    }

    @Override // p001a0.InterfaceC0071r1
    /* renamed from: e */
    public final void mo165e(long j6) {
        C0064p2 m120d;
        InterfaceC2430a interfaceC2430a;
        C0064p2 m120d2;
        int m127b;
        switch (this.f2032a) {
            case 0:
                C0622o0 c0622o0 = this.f2033b;
                c0622o0.f2057n = C0464b.m1011g(c0622o0.f2057n, j6);
                C0043k1 c0043k1 = c0622o0.f2047d;
                if (c0043k1 != null && (m120d = c0043k1.m120d()) != null) {
                    c0622o0.f2059p.setValue(new C0464b(C0464b.m1011g(c0622o0.f2055l, c0622o0.f2057n)));
                    InterfaceC2453q interfaceC2453q = c0622o0.f2045b;
                    C0464b m1284g = c0622o0.m1284g();
                    AbstractC3367j.m5097b(m1284g);
                    int mo167a = interfaceC2453q.mo167a(m120d.m127b(m1284g.f1623a, true));
                    long m2558b = AbstractC1586f0.m2558b(mo167a, mo167a);
                    if (!C1602n0.m2585a(m2558b, c0622o0.m1287j().f13724b)) {
                        C0043k1 c0043k12 = c0622o0.f2047d;
                        if ((c0043k12 == null || ((Boolean) c0043k12.f227q.getValue()).booleanValue()) && (interfaceC2430a = c0622o0.f2051h) != null) {
                            interfaceC2430a.mo4009a();
                        }
                        c0622o0.f2046c.mo23f(C0622o0.m1279c(c0622o0.m1287j().f13723a, m2558b));
                        return;
                    }
                    return;
                }
                return;
            default:
                C0625q c0625q = C0627r.f2075e;
                C0622o0 c0622o02 = this.f2033b;
                if (c0622o02.m1285h() && c0622o02.m1287j().f13723a.f10239f.length() != 0) {
                    c0622o02.f2057n = C0464b.m1011g(c0622o02.f2057n, j6);
                    C0043k1 c0043k13 = c0622o02.f2047d;
                    if (c0043k13 != null && (m120d2 = c0043k13.m120d()) != null) {
                        c0622o02.f2059p.setValue(new C0464b(C0464b.m1011g(c0622o02.f2055l, c0622o02.f2057n)));
                        if (c0622o02.f2056m == null) {
                            C0464b m1284g2 = c0622o02.m1284g();
                            AbstractC3367j.m5097b(m1284g2);
                            if (!m120d2.m128c(m1284g2.f1623a)) {
                                int mo167a2 = c0622o02.f2045b.mo167a(m120d2.m127b(c0622o02.f2055l, true));
                                InterfaceC2453q interfaceC2453q2 = c0622o02.f2045b;
                                C0464b m1284g3 = c0622o02.m1284g();
                                AbstractC3367j.m5097b(m1284g3);
                                if (mo167a2 == interfaceC2453q2.mo167a(m120d2.m127b(m1284g3.f1623a, true))) {
                                    c0625q = C0627r.f2074d;
                                }
                                C2459w m1287j = c0622o02.m1287j();
                                C0464b m1284g4 = c0622o02.m1284g();
                                AbstractC3367j.m5097b(m1284g4);
                                C0622o0.m1278a(c0622o02, m1287j, m1284g4.f1623a, false, false, c0625q, true);
                                int i7 = C1602n0.f10303c;
                            }
                        }
                        Integer num = c0622o02.f2056m;
                        if (num != null) {
                            m127b = num.intValue();
                        } else {
                            m127b = m120d2.m127b(c0622o02.f2055l, false);
                        }
                        C0464b m1284g5 = c0622o02.m1284g();
                        AbstractC3367j.m5097b(m1284g5);
                        int m127b2 = m120d2.m127b(m1284g5.f1623a, false);
                        if (c0622o02.f2056m != null || m127b != m127b2) {
                            C2459w m1287j2 = c0622o02.m1287j();
                            C0464b m1284g6 = c0622o02.m1284g();
                            AbstractC3367j.m5097b(m1284g6);
                            C0622o0.m1278a(c0622o02, m1287j2, m1284g6.f1623a, false, false, c0625q, true);
                            int i72 = C1602n0.f10303c;
                        } else {
                            return;
                        }
                    }
                    c0622o02.m1293p(false);
                    return;
                }
                return;
        }
    }

    /* renamed from: i */
    public void m1273i() {
        EnumC0091x0 enumC0091x0;
        boolean z7;
        boolean z8;
        C0622o0 c0622o0 = this.f2033b;
        c0622o0.f2058o.setValue(null);
        c0622o0.f2059p.setValue(null);
        boolean z9 = true;
        c0622o0.m1293p(true);
        c0622o0.f2056m = null;
        boolean m2586b = C1602n0.m2586b(c0622o0.m1287j().f13724b);
        if (m2586b) {
            enumC0091x0 = EnumC0091x0.f418g;
        } else {
            enumC0091x0 = EnumC0091x0.f417f;
        }
        c0622o0.m1291n(enumC0091x0);
        C0043k1 c0043k1 = c0622o0.f2047d;
        if (c0043k1 != null) {
            if (!m2586b && AbstractC1793a0.m2963C(c0622o0, true)) {
                z8 = true;
            } else {
                z8 = false;
            }
            c0043k1.f223m.setValue(Boolean.valueOf(z8));
        }
        C0043k1 c0043k12 = c0622o0.f2047d;
        if (c0043k12 != null) {
            if (!m2586b && AbstractC1793a0.m2963C(c0622o0, false)) {
                z7 = true;
            } else {
                z7 = false;
            }
            c0043k12.f224n.setValue(Boolean.valueOf(z7));
        }
        C0043k1 c0043k13 = c0622o0.f2047d;
        if (c0043k13 == null) {
            return;
        }
        if (!m2586b || !AbstractC1793a0.m2963C(c0622o0, true)) {
            z9 = false;
        }
        c0043k13.f225o.setValue(Boolean.valueOf(z9));
    }

    @Override // p001a0.InterfaceC0071r1
    public final void onCancel() {
        switch (this.f2032a) {
            case 0:
                return;
            default:
                m1273i();
                return;
        }
    }

    /* renamed from: f */
    private final void m1269f() {
    }

    /* renamed from: g */
    private final void m1270g() {
    }

    /* renamed from: h */
    private final void m1271h() {
    }

    /* renamed from: j */
    private final void m1272j() {
    }
}
