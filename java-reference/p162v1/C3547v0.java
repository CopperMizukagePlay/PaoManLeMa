package p162v1;

import p001a0.C0031h1;
import p001a0.C0068q2;
import p035e1.C0661j0;
import p060h5.AbstractC1804l;
import p100n.C2673p1;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p140s2.C3091a;
import p146t1.AbstractC3237u0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.v0 */
/* loaded from: classes.dex */
public final class C3547v0 {

    /* renamed from: a */
    public final C3502g0 f17051a;

    /* renamed from: c */
    public boolean f17053c;

    /* renamed from: d */
    public boolean f17054d;

    /* renamed from: i */
    public C3091a f17059i;

    /* renamed from: b */
    public final C0031h1 f17052b = new C0031h1(14, (byte) 0);

    /* renamed from: e */
    public final C0068q2 f17055e = new C0068q2(26);

    /* renamed from: f */
    public final C2705e f17056f = new C2705e(new C3502g0[16]);

    /* renamed from: g */
    public final long f17057g = 1;

    /* renamed from: h */
    public final C2705e f17058h = new C2705e(new C3544u0[16]);

    public C3547v0(C3502g0 c3502g0) {
        this.f17051a = c3502g0;
    }

    /* renamed from: b */
    public static boolean m5508b(C3502g0 c3502g0, C3091a c3091a) {
        C3091a c3091a2;
        boolean m5502B0;
        C3502g0 c3502g02 = c3502g0.f16890k;
        C3514k0 c3514k0 = c3502g0.f16873J;
        if (c3502g02 == null) {
            return false;
        }
        if (c3091a != null) {
            if (c3502g02 != null) {
                C3541t0 c3541t0 = c3514k0.f16954q;
                AbstractC3367j.m5097b(c3541t0);
                m5502B0 = c3541t0.m5502B0(c3091a.f15687a);
            }
            m5502B0 = false;
        } else {
            C3541t0 c3541t02 = c3514k0.f16954q;
            if (c3541t02 != null) {
                c3091a2 = c3541t02.f17032r;
            } else {
                c3091a2 = null;
            }
            if (c3091a2 != null && c3502g02 != null) {
                AbstractC3367j.m5097b(c3541t02);
                m5502B0 = c3541t02.m5502B0(c3091a2.f15687a);
            }
            m5502B0 = false;
        }
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5502B0 && m5447u != null) {
            if (m5447u.f16890k == null) {
                C3502g0.m5396Y(m5447u, false, 3);
                return m5502B0;
            }
            if (c3502g0.m5445s() == EnumC3496e0.f16824e) {
                C3502g0.m5395W(m5447u, false, 3);
                return m5502B0;
            }
            if (c3502g0.m5445s() == EnumC3496e0.f16825f) {
                m5447u.m5419V(false);
            }
        }
        return m5502B0;
    }

    /* renamed from: c */
    public static boolean m5509c(C3502g0 c3502g0, C3091a c3091a) {
        boolean m5394R;
        if (c3091a != null) {
            m5394R = c3502g0.m5415Q(c3091a);
        } else {
            m5394R = C3502g0.m5394R(c3502g0);
        }
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5394R && m5447u != null) {
            if (c3502g0.m5444r() == EnumC3496e0.f16824e) {
                C3502g0.m5396Y(m5447u, false, 3);
                return m5394R;
            }
            if (c3502g0.m5444r() == EnumC3496e0.f16825f) {
                m5447u.m5420X(false);
            }
        }
        return m5394R;
    }

    /* renamed from: h */
    public static boolean m5510h(C3502g0 c3502g0) {
        C3541t0 c3541t0;
        C3505h0 c3505h0;
        if (c3502g0.f16873J.f16942e) {
            if (c3502g0.m5445s() != EnumC3496e0.f16826g || ((c3541t0 = c3502g0.f16873J.f16954q) != null && (c3505h0 = c3541t0.f17037w) != null && c3505h0.m5456e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m5511i(C3502g0 c3502g0) {
        EnumC3489c0 enumC3489c0;
        if (!c3502g0.m5443q()) {
            return false;
        }
        do {
            if (c3502g0.m5444r() == EnumC3496e0.f16826g && !c3502g0.f16873J.f16953p.f17071C.m5456e()) {
                C3502g0 m5447u = c3502g0.m5447u();
                if (m5447u != null) {
                    enumC3489c0 = m5447u.f16873J.f16941d;
                } else {
                    enumC3489c0 = null;
                }
                if (enumC3489c0 != EnumC3489c0.f16791e) {
                    return false;
                }
            }
            c3502g0 = c3502g0.m5447u();
            if (c3502g0 == null) {
                return false;
            }
        } while (!c3502g0.m5408J());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5512a(boolean z7) {
        Object[] objArr;
        C0068q2 c0068q2 = this.f17055e;
        if (z7) {
            C2705e c2705e = (C2705e) c0068q2.f344f;
            C3502g0 c3502g0 = this.f17051a;
            if (c3502g0.f16882S > 0) {
                c2705e.m4305g();
                c2705e.m4300b(c3502g0);
                c3502g0.f16881R = true;
            }
        }
        C2705e c2705e2 = (C2705e) c0068q2.f344f;
        int i7 = c2705e2.f14519g;
        if (i7 != 0) {
            AbstractC1804l.m3030W(c2705e2.f14517e, C3515k1.f16955f, 0, i7);
            int i8 = c2705e2.f14519g;
            C3502g0[] c3502g0Arr = (C3502g0[]) c0068q2.f345g;
            if (c3502g0Arr != null) {
                int length = c3502g0Arr.length;
                objArr = c3502g0Arr;
            }
            objArr = new C3502g0[Math.max(16, i8)];
            c0068q2.f345g = null;
            for (int i9 = 0; i9 < i8; i9++) {
                objArr[i9] = c2705e2.f14517e[i9];
            }
            c2705e2.m4305g();
            for (int i10 = i8 - 1; -1 < i10; i10--) {
                C3502g0 c3502g02 = objArr[i10];
                AbstractC3367j.m5097b(c3502g02);
                if (c3502g02.f16881R) {
                    C0068q2.m134u(c3502g02);
                }
                objArr[i10] = 0;
            }
            c0068q2.f345g = objArr;
        }
    }

    /* renamed from: d */
    public final void m5513d() {
        C2705e c2705e = this.f17058h;
        int i7 = c2705e.f14519g;
        if (i7 != 0) {
            Object[] objArr = c2705e.f14517e;
            for (int i8 = 0; i8 < i7; i8++) {
                C3544u0 c3544u0 = (C3544u0) objArr[i8];
                C3502g0 c3502g0 = c3544u0.f17048a;
                boolean z7 = c3544u0.f17050c;
                C3502g0 c3502g02 = c3544u0.f17048a;
                if (c3502g0.m5407I()) {
                    if (!c3544u0.f17049b) {
                        C3502g0.m5396Y(c3502g02, z7, 2);
                    } else {
                        C3502g0.m5395W(c3502g02, z7, 2);
                    }
                }
            }
            c2705e.m4305g();
        }
    }

    /* renamed from: e */
    public final void m5514e(C3502g0 c3502g0) {
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (AbstractC3367j.m5096a(c3502g02.m5409K(), Boolean.TRUE) && !c3502g02.f16883T) {
                if (this.f17052b.m100n(c3502g02)) {
                    c3502g02.m5410L();
                }
                m5514e(c3502g02);
            }
        }
    }

    /* renamed from: f */
    public final void m5515f(C3502g0 c3502g0, boolean z7) {
        boolean m5443q;
        if (!this.f17053c) {
            AbstractC3088a.m4750b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z7) {
            m5443q = c3502g0.f16873J.f16942e;
        } else {
            m5443q = c3502g0.m5443q();
        }
        if (m5443q) {
            AbstractC3088a.m4749a("node not yet measured");
        }
        m5516g(c3502g0, z7);
    }

    /* renamed from: g */
    public final void m5516g(C3502g0 c3502g0, boolean z7) {
        boolean m5443q;
        C3541t0 c3541t0;
        C3505h0 c3505h0;
        boolean m5443q2;
        boolean m5443q3;
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            EnumC3496e0 enumC3496e0 = EnumC3496e0.f16824e;
            if ((!z7 && (c3502g02.m5444r() == enumC3496e0 || c3502g02.f16873J.f16953p.f17071C.m5456e())) || (z7 && (c3502g02.m5445s() == enumC3496e0 || ((c3541t0 = c3502g02.f16873J.f16954q) != null && (c3505h0 = c3541t0.f17037w) != null && c3505h0.m5456e())))) {
                boolean m5378r = AbstractC3498f.m5378r(c3502g02);
                C3514k0 c3514k0 = c3502g02.f16873J;
                if (m5378r && !z7) {
                    if (c3514k0.f16942e && this.f17052b.m100n(c3502g02)) {
                        m5520m(c3502g02, true, false);
                    } else {
                        m5515f(c3502g02, true);
                    }
                }
                if (z7) {
                    m5443q2 = c3514k0.f16942e;
                } else {
                    m5443q2 = c3502g02.m5443q();
                }
                if (m5443q2) {
                    m5520m(c3502g02, z7, false);
                }
                if (z7) {
                    m5443q3 = c3514k0.f16942e;
                } else {
                    m5443q3 = c3502g02.m5443q();
                }
                if (!m5443q3) {
                    m5516g(c3502g02, z7);
                }
            }
        }
        if (z7) {
            m5443q = c3502g0.f16873J.f16942e;
        } else {
            m5443q = c3502g0.m5443q();
        }
        if (m5443q) {
            m5520m(c3502g0, z7, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [x0.q] */
    /* renamed from: j */
    public final boolean m5517j(InterfaceC3277a interfaceC3277a) {
        boolean z7;
        AbstractC3809q abstractC3809q;
        AbstractC3809q abstractC3809q2;
        boolean z8;
        C3502g0 c3502g0;
        boolean z9;
        C0031h1 c0031h1 = this.f17052b;
        C3502g0 c3502g02 = this.f17051a;
        if (!c3502g02.m5407I()) {
            AbstractC3088a.m4749a("performMeasureAndLayout called with unattached root");
        }
        if (!c3502g02.m5408J()) {
            AbstractC3088a.m4749a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f17053c) {
            AbstractC3088a.m4749a("performMeasureAndLayout called during measure layout");
        }
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        if (this.f17059i != null) {
            this.f17053c = true;
            this.f17054d = true;
            try {
                boolean m77A = c0031h1.m77A();
                C2673p1 c2673p1 = (C2673p1) c0031h1.f152f;
                if (m77A) {
                    z7 = false;
                    while (true) {
                        C2673p1 c2673p12 = (C2673p1) c0031h1.f154h;
                        C2673p1 c2673p13 = (C2673p1) c0031h1.f153g;
                        if (!((C3554x1) c2673p1.f14390f).isEmpty()) {
                            c3502g0 = (C3502g0) ((C3554x1) c2673p1.f14390f).first();
                            c2673p1.m4288t(c3502g0);
                            if (c3502g0.f16890k != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z8 = false;
                        } else if (!((C3554x1) c2673p13.f14390f).isEmpty()) {
                            c3502g0 = (C3502g0) ((C3554x1) c2673p13.f14390f).first();
                            c2673p13.m4288t(c3502g0);
                            if (c3502g0.f16890k != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            z8 = true;
                        } else {
                            if (((C3554x1) c2673p12.f14390f).isEmpty()) {
                                break;
                            }
                            C3502g0 c3502g03 = (C3502g0) ((C3554x1) c2673p12.f14390f).first();
                            c2673p12.m4288t(c3502g03);
                            z8 = true;
                            c3502g0 = c3502g03;
                            z9 = false;
                        }
                        boolean m5520m = m5520m(c3502g0, z9, z8);
                        if (!z8) {
                            if (c3502g0.f16873J.f16943f) {
                                c0031h1.m89b(c3502g0, EnumC3540t.f17017f);
                            }
                            if (c3502g0.m5442p()) {
                                c0031h1.m89b(c3502g0, EnumC3540t.f17019h);
                            }
                        }
                        if (c3502g0 == c3502g02 && m5520m) {
                            z7 = true;
                        }
                    }
                    if (interfaceC3277a != null) {
                        interfaceC3277a.mo52a();
                    }
                } else {
                    z7 = false;
                }
            } finally {
            }
        } else {
            z7 = false;
        }
        C2705e c2705e = this.f17056f;
        Object[] objArr = c2705e.f14517e;
        int i8 = c2705e.f14519g;
        int i9 = 0;
        while (i9 < i8) {
            C3490c1 c3490c1 = ((C3502g0) objArr[i9]).f16872I;
            C3537s c3537s = c3490c1.f16799c;
            boolean m5393g = AbstractC3500f1.m5393g(128);
            if (m5393g) {
                abstractC3809q = c3537s.f17011T;
            } else {
                abstractC3809q = c3537s.f17011T.f17996i;
                if (abstractC3809q == null) {
                    i9++;
                    i7 = 0;
                }
            }
            C0661j0 c0661j0 = AbstractC3497e1.f16828O;
            AbstractC3809q m5335X0 = c3537s.m5335X0(m5393g);
            while (m5335X0 != null && (m5335X0.f17995h & 128) != 0) {
                if ((m5335X0.f17994g & 128) != 0) {
                    AbstractC3519m abstractC3519m = m5335X0;
                    C2705e c2705e2 = null;
                    while (abstractC3519m != 0) {
                        if (abstractC3519m instanceof InterfaceC3546v) {
                            ((InterfaceC3546v) abstractC3519m).mo5300U(c3490c1.f16799c);
                        } else if ((abstractC3519m.f17994g & 128) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                            AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                            abstractC3809q2 = abstractC3519m;
                            c2705e2 = c2705e2;
                            while (abstractC3809q3 != null) {
                                if ((abstractC3809q3.f17994g & 128) != 0) {
                                    i7++;
                                    c2705e2 = c2705e2;
                                    if (i7 == 1) {
                                        abstractC3809q2 = abstractC3809q3;
                                    } else {
                                        if (c2705e2 == null) {
                                            c2705e2 = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3809q2 != null) {
                                            c2705e2.m4300b(abstractC3809q2);
                                            abstractC3809q2 = null;
                                        }
                                        c2705e2.m4300b(abstractC3809q3);
                                    }
                                }
                                abstractC3809q3 = abstractC3809q3.f17997j;
                                abstractC3809q2 = abstractC3809q2;
                                c2705e2 = c2705e2;
                            }
                            if (i7 == 1) {
                                i7 = 0;
                                abstractC3519m = abstractC3809q2;
                                c2705e2 = c2705e2;
                            }
                        }
                        abstractC3809q2 = AbstractC3498f.m5366f(c2705e2);
                        i7 = 0;
                        abstractC3519m = abstractC3809q2;
                        c2705e2 = c2705e2;
                    }
                }
                if (m5335X0 != abstractC3809q) {
                    m5335X0 = m5335X0.f17997j;
                    i7 = 0;
                }
            }
            i9++;
            i7 = 0;
        }
        c2705e.m4305g();
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [v1.g0, java.lang.Object] */
    /* renamed from: k */
    public final void m5518k(C3502g0 c3502g0, long j6) {
        AbstractC3809q abstractC3809q;
        AbstractC3809q abstractC3809q2;
        if (c3502g0.f16883T) {
            return;
        }
        C3502g0 c3502g02 = this.f17051a;
        if (c3502g0.equals(c3502g02)) {
            AbstractC3088a.m4749a("measureAndLayout called on root");
        }
        if (!c3502g02.m5407I()) {
            AbstractC3088a.m4749a("performMeasureAndLayout called with unattached root");
        }
        if (!c3502g02.m5408J()) {
            AbstractC3088a.m4749a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f17053c) {
            AbstractC3088a.m4749a("performMeasureAndLayout called during measure layout");
        }
        boolean z7 = false;
        if (this.f17059i != null) {
            this.f17053c = true;
            this.f17054d = false;
            try {
                C0031h1 c0031h1 = this.f17052b;
                ((C2673p1) c0031h1.f152f).m4288t(c3502g0);
                ((C2673p1) c0031h1.f153g).m4288t(c3502g0);
                ((C2673p1) c0031h1.f154h).m4288t(c3502g0);
                if ((m5508b(c3502g0, new C3091a(j6)) || c3502g0.f16873J.f16943f) && AbstractC3367j.m5096a(c3502g0.m5409K(), Boolean.TRUE)) {
                    c3502g0.m5410L();
                }
                m5514e(c3502g0);
                m5509c(c3502g0, new C3091a(j6));
                if (c3502g0.m5442p() && c3502g0.m5408J()) {
                    c3502g0.m5418U();
                    C0068q2 c0068q2 = this.f17055e;
                    c0068q2.getClass();
                    if (c3502g0.f16882S > 0) {
                        ((C2705e) c0068q2.f344f).m4300b(c3502g0);
                        c3502g0.f16881R = true;
                    }
                }
                m5513d();
            } finally {
            }
        }
        C2705e c2705e = this.f17056f;
        Object[] objArr = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        int i8 = 0;
        while (i8 < i7) {
            C3490c1 c3490c1 = ((C3502g0) objArr[i8]).f16872I;
            C3537s c3537s = c3490c1.f16799c;
            boolean m5393g = AbstractC3500f1.m5393g(128);
            if (m5393g) {
                abstractC3809q = c3537s.f17011T;
            } else {
                abstractC3809q = c3537s.f17011T.f17996i;
                if (abstractC3809q == null) {
                    i8++;
                    z7 = false;
                }
            }
            C0661j0 c0661j0 = AbstractC3497e1.f16828O;
            AbstractC3809q m5335X0 = c3537s.m5335X0(m5393g);
            while (m5335X0 != null && (m5335X0.f17995h & 128) != 0) {
                if ((m5335X0.f17994g & 128) != 0) {
                    AbstractC3519m abstractC3519m = m5335X0;
                    C2705e c2705e2 = null;
                    while (abstractC3519m != 0) {
                        if (abstractC3519m instanceof InterfaceC3546v) {
                            ((InterfaceC3546v) abstractC3519m).mo5300U(c3490c1.f16799c);
                        } else if ((abstractC3519m.f17994g & 128) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                            AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                            ?? r15 = z7;
                            abstractC3809q2 = abstractC3519m;
                            c2705e2 = c2705e2;
                            while (abstractC3809q3 != null) {
                                if ((abstractC3809q3.f17994g & 128) != 0) {
                                    r15++;
                                    c2705e2 = c2705e2;
                                    if (r15 == 1) {
                                        abstractC3809q2 = abstractC3809q3;
                                    } else {
                                        if (c2705e2 == null) {
                                            c2705e2 = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3809q2 != null) {
                                            c2705e2.m4300b(abstractC3809q2);
                                            abstractC3809q2 = null;
                                        }
                                        c2705e2.m4300b(abstractC3809q3);
                                    }
                                }
                                abstractC3809q3 = abstractC3809q3.f17997j;
                                abstractC3809q2 = abstractC3809q2;
                                c2705e2 = c2705e2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z7 = false;
                                abstractC3519m = abstractC3809q2;
                                c2705e2 = c2705e2;
                            }
                        }
                        abstractC3809q2 = AbstractC3498f.m5366f(c2705e2);
                        z7 = false;
                        abstractC3519m = abstractC3809q2;
                        c2705e2 = c2705e2;
                    }
                }
                if (m5335X0 != abstractC3809q) {
                    m5335X0 = m5335X0.f17997j;
                    z7 = false;
                }
            }
            i8++;
            z7 = false;
        }
        c2705e.m4305g();
    }

    /* renamed from: l */
    public final void m5519l() {
        C0031h1 c0031h1 = this.f17052b;
        if (c0031h1.m77A()) {
            C3502g0 c3502g0 = this.f17051a;
            if (!c3502g0.m5407I()) {
                AbstractC3088a.m4749a("performMeasureAndLayout called with unattached root");
            }
            if (!c3502g0.m5408J()) {
                AbstractC3088a.m4749a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f17053c) {
                AbstractC3088a.m4749a("performMeasureAndLayout called during measure layout");
            }
            if (this.f17059i != null) {
                this.f17053c = true;
                this.f17054d = false;
                try {
                    if (!((C3554x1) ((C2673p1) c0031h1.f154h).f14390f).isEmpty() && !((C3554x1) ((C2673p1) c0031h1.f152f).f14390f).isEmpty()) {
                        if (c3502g0.f16890k != null) {
                            m5522o(c3502g0, true);
                        } else {
                            m5521n(c3502g0);
                        }
                    }
                    m5522o(c3502g0, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.f17053c = false;
                        this.f17054d = false;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean m5520m(C3502g0 c3502g0, boolean z7, boolean z8) {
        C3091a c3091a;
        boolean z9;
        AbstractC3237u0 placementScope;
        C3537s c3537s;
        C3502g0 m5447u;
        C3541t0 c3541t0;
        C3505h0 c3505h0;
        boolean z10 = c3502g0.f16883T;
        C3514k0 c3514k0 = c3502g0.f16873J;
        boolean z11 = false;
        if (z10 || (!c3502g0.m5408J() && !c3514k0.f16953p.f17101y && !m5511i(c3502g0) && !AbstractC3367j.m5096a(c3502g0.m5409K(), Boolean.TRUE) && !m5510h(c3502g0) && !c3514k0.f16953p.f17071C.m5456e() && ((c3541t0 = c3514k0.f16954q) == null || (c3505h0 = c3541t0.f17037w) == null || !c3505h0.m5456e()))) {
            return false;
        }
        C3502g0 c3502g02 = this.f17051a;
        if (c3502g0 == c3502g02) {
            c3091a = this.f17059i;
            AbstractC3367j.m5097b(c3091a);
        } else {
            c3091a = null;
        }
        if (z7) {
            if (c3514k0.f16942e) {
                z11 = m5508b(c3502g0, c3091a);
            }
            if (z8 && ((z11 || c3514k0.f16943f) && AbstractC3367j.m5096a(c3502g0.m5409K(), Boolean.TRUE))) {
                c3502g0.m5410L();
            }
        } else {
            if (c3502g0.m5443q()) {
                z9 = m5509c(c3502g0, c3091a);
            } else {
                z9 = false;
            }
            if (z8 && c3502g0.m5442p() && (c3502g0 == c3502g02 || ((m5447u = c3502g0.m5447u()) != null && m5447u.m5408J() && c3514k0.f16953p.f17101y))) {
                if (c3502g0 == c3502g02) {
                    if (c3502g0.f16869F == EnumC3496e0.f16826g) {
                        c3502g0.m5429f();
                    }
                    C3502g0 m5447u2 = c3502g0.m5447u();
                    if (m5447u2 == null || (c3537s = m5447u2.f16872I.f16799c) == null || (placementScope = c3537s.f16979p) == null) {
                        placementScope = ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getPlacementScope();
                    }
                    AbstractC3237u0.m4951j(placementScope, c3514k0.f16953p, 0, 0);
                } else {
                    c3502g0.m5418U();
                }
                C0068q2 c0068q2 = this.f17055e;
                c0068q2.getClass();
                if (c3502g0.f16882S > 0) {
                    ((C2705e) c0068q2.f344f).m4300b(c3502g0);
                    c3502g0.f16881R = true;
                }
                ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getRectManager().m1469e(c3502g0);
            }
            z11 = z9;
        }
        m5513d();
        return z11;
    }

    /* renamed from: n */
    public final void m5521n(C3502g0 c3502g0) {
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (c3502g02.m5444r() == EnumC3496e0.f16824e || c3502g02.f16873J.f16953p.f17071C.m5456e()) {
                if (AbstractC3498f.m5378r(c3502g02)) {
                    m5522o(c3502g02, true);
                } else {
                    m5521n(c3502g02);
                }
            }
        }
    }

    /* renamed from: o */
    public final void m5522o(C3502g0 c3502g0, boolean z7) {
        C3091a c3091a;
        if (c3502g0.f16883T) {
            return;
        }
        if (c3502g0 == this.f17051a) {
            c3091a = this.f17059i;
            AbstractC3367j.m5097b(c3091a);
        } else {
            c3091a = null;
        }
        if (z7) {
            m5508b(c3502g0, c3091a);
        } else {
            m5509c(c3502g0, c3091a);
        }
    }

    /* renamed from: p */
    public final boolean m5523p(C3502g0 c3502g0, boolean z7) {
        int ordinal = c3502g0.f16873J.f16941d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!c3502g0.m5443q() || z7) {
                        c3502g0.f16873J.f16953p.f17102z = true;
                        if (!c3502g0.f16883T && (c3502g0.m5408J() || m5511i(c3502g0))) {
                            C3502g0 m5447u = c3502g0.m5447u();
                            if (m5447u == null || !m5447u.m5443q()) {
                                this.f17052b.m89b(c3502g0, EnumC3540t.f17018g);
                            }
                            if (!this.f17054d) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.f17058h.m4300b(new C3544u0(c3502g0, false, z7));
            }
        }
        return false;
    }

    /* renamed from: q */
    public final void m5524q(long j6) {
        boolean m4754b;
        EnumC3540t enumC3540t;
        C3091a c3091a = this.f17059i;
        if (c3091a == null) {
            m4754b = false;
        } else {
            m4754b = C3091a.m4754b(c3091a.f15687a, j6);
        }
        if (!m4754b) {
            if (this.f17053c) {
                AbstractC3088a.m4749a("updateRootConstraints called while measuring");
            }
            this.f17059i = new C3091a(j6);
            C3502g0 c3502g0 = this.f17051a;
            C3502g0 c3502g02 = c3502g0.f16890k;
            C3514k0 c3514k0 = c3502g0.f16873J;
            if (c3502g02 != null) {
                c3514k0.f16942e = true;
            }
            c3514k0.f16953p.f17102z = true;
            if (c3502g02 != null) {
                enumC3540t = EnumC3540t.f17016e;
            } else {
                enumC3540t = EnumC3540t.f17018g;
            }
            this.f17052b.m89b(c3502g0, enumC3540t);
        }
    }
}
