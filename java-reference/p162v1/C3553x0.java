package p162v1;

import java.util.List;
import p057h1.C1752b;
import p101n0.C2702b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.C3100j;
import p140s2.C3102l;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p160v.C3423m0;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.x0 */
/* loaded from: classes.dex */
public final class C3553x0 extends AbstractC3239v0 implements InterfaceC3214k0, InterfaceC3480a, InterfaceC3559z0 {

    /* renamed from: A */
    public boolean f17069A;

    /* renamed from: B */
    public boolean f17070B;

    /* renamed from: F */
    public boolean f17074F;

    /* renamed from: J */
    public float f17078J;

    /* renamed from: K */
    public boolean f17079K;

    /* renamed from: L */
    public InterfaceC3279c f17080L;

    /* renamed from: M */
    public C1752b f17081M;

    /* renamed from: O */
    public float f17083O;

    /* renamed from: Q */
    public boolean f17085Q;

    /* renamed from: j */
    public final C3514k0 f17086j;

    /* renamed from: k */
    public boolean f17087k;

    /* renamed from: n */
    public boolean f17090n;

    /* renamed from: o */
    public boolean f17091o;

    /* renamed from: q */
    public boolean f17093q;

    /* renamed from: s */
    public InterfaceC3279c f17095s;

    /* renamed from: t */
    public C1752b f17096t;

    /* renamed from: u */
    public float f17097u;

    /* renamed from: w */
    public Object f17099w;

    /* renamed from: x */
    public boolean f17100x;

    /* renamed from: y */
    public boolean f17101y;

    /* renamed from: z */
    public boolean f17102z;

    /* renamed from: l */
    public int f17088l = Integer.MAX_VALUE;

    /* renamed from: m */
    public int f17089m = Integer.MAX_VALUE;

    /* renamed from: p */
    public EnumC3496e0 f17092p = EnumC3496e0.f16826g;

    /* renamed from: r */
    public long f17094r = 0;

    /* renamed from: v */
    public boolean f17098v = true;

    /* renamed from: C */
    public final C3505h0 f17071C = new C3505h0(this, 0);

    /* renamed from: D */
    public final C2705e f17072D = new C2705e(new C3553x0[16]);

    /* renamed from: E */
    public boolean f17073E = true;

    /* renamed from: G */
    public long f17075G = AbstractC3092b.m4765b(0, 0, 15);

    /* renamed from: H */
    public final C3550w0 f17076H = new C3550w0(this, 1);

    /* renamed from: I */
    public final C3550w0 f17077I = new C3550w0(this, 0);

    /* renamed from: N */
    public long f17082N = 0;

    /* renamed from: P */
    public final C3550w0 f17084P = new C3550w0(this, 2);

    public C3553x0(C3514k0 c3514k0) {
        this.f17086j = c3514k0;
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: A */
    public final boolean mo5285A() {
        return this.f17100x;
    }

    /* renamed from: A0 */
    public final void m5525A0() {
        this.f17079K = true;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 m5447u = c3514k0.f16938a.m5447u();
        float f7 = mo5288q().f16837E;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3490c1 c3490c1 = c3502g0.f16872I;
        AbstractC3497e1 abstractC3497e1 = c3490c1.f16800d;
        C3537s c3537s = c3490c1.f16799c;
        while (abstractC3497e1 != c3537s) {
            AbstractC3367j.m5098c(abstractC3497e1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C3555y c3555y = (C3555y) abstractC3497e1;
            f7 += c3555y.f16837E;
            abstractC3497e1 = c3555y.f16848t;
        }
        if (f7 != this.f17078J) {
            this.f17078J = f7;
            if (m5447u != null) {
                m5447u.m5414P();
            }
            if (m5447u != null) {
                m5447u.m5401C();
            }
        }
        if (!this.f17100x) {
            if (m5447u != null) {
                m5447u.m5401C();
            }
            m5531u0();
            if (this.f17087k && m5447u != null) {
                m5447u.m5420X(false);
            }
        } else {
            c3502g0.f16872I.f16799c.m5345h1();
        }
        if (m5447u != null) {
            C3514k0 c3514k02 = m5447u.f16873J;
            if (!this.f17087k && c3514k02.f16941d == EnumC3489c0.f16793g) {
                if (this.f17089m != Integer.MAX_VALUE) {
                    AbstractC3088a.m4750b("Place was called on a node which was placed already");
                }
                int i7 = c3514k02.f16946i;
                this.f17089m = i7;
                c3514k02.f16946i = i7 + 1;
            }
        } else {
            this.f17089m = 0;
        }
        mo5291x();
    }

    /* renamed from: B0 */
    public final void m5526B0(long j6) {
        C3514k0 c3514k0 = this.f17086j;
        EnumC3489c0 enumC3489c0 = c3514k0.f16941d;
        C3502g0 c3502g0 = c3514k0.f16938a;
        EnumC3489c0 enumC3489c02 = EnumC3489c0.f16795i;
        if (enumC3489c0 != enumC3489c02) {
            AbstractC3088a.m4750b("layout state is not idle before measure starts");
        }
        this.f17075G = j6;
        EnumC3489c0 enumC3489c03 = EnumC3489c0.f16791e;
        c3514k0.f16941d = enumC3489c03;
        this.f17102z = false;
        C3530p1 snapshotObserver = ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getSnapshotObserver();
        snapshotObserver.m5498a(c3502g0, snapshotObserver.f16993c, this.f17076H);
        if (c3514k0.f16941d == enumC3489c03) {
            this.f17069A = true;
            this.f17070B = true;
            c3514k0.f16941d = enumC3489c02;
        }
    }

    /* renamed from: C0 */
    public final void m5527C0(long j6, float f7, InterfaceC3279c interfaceC3279c, C1752b c1752b) {
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 c3502g02 = c3514k0.f16938a;
        if (c3502g0.f16883T) {
            AbstractC3088a.m4749a("place is called on a deactivated node");
        }
        c3514k0.f16941d = EnumC3489c0.f16793g;
        this.f17094r = j6;
        this.f17097u = f7;
        this.f17095s = interfaceC3279c;
        this.f17096t = c1752b;
        this.f17079K = false;
        InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g02);
        if (!this.f17069A && this.f17100x) {
            AbstractC3497e1 m5465a = c3514k0.m5465a();
            m5465a.m5349l1(C3100j.m4785c(j6, m5465a.f16057i), f7, interfaceC3279c, c1752b);
            m5525A0();
        } else {
            this.f17071C.f16920g = false;
            c3514k0.m5470f(false);
            this.f17080L = interfaceC3279c;
            this.f17082N = j6;
            this.f17083O = f7;
            this.f17081M = c1752b;
            C3530p1 snapshotObserver = ((C3728t) m5464a).getSnapshotObserver();
            snapshotObserver.m5498a(c3502g02, snapshotObserver.f16996f, this.f17084P);
        }
        c3514k0.f16941d = EnumC3489c0.f16795i;
        this.f17091o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002e, B:10:0x0032, B:14:0x004e, B:16:0x0056, B:18:0x0064, B:20:0x006f, B:21:0x0073, B:22:0x005a, B:23:0x003e, B:25:0x0044, B:27:0x0048, B:28:0x004a, B:29:0x0087, B:31:0x008b, B:35:0x0093, B:36:0x0098, B:41:0x001b, B:43:0x001f, B:45:0x0023, B:47:0x002b, B:48:0x0027), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002e, B:10:0x0032, B:14:0x004e, B:16:0x0056, B:18:0x0064, B:20:0x006f, B:21:0x0073, B:22:0x005a, B:23:0x003e, B:25:0x0044, B:27:0x0048, B:28:0x004a, B:29:0x0087, B:31:0x008b, B:35:0x0093, B:36:0x0098, B:41:0x001b, B:43:0x001f, B:45:0x0023, B:47:0x002b, B:48:0x0027), top: B:2:0x0007 }] */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5528D0(long j6, float f7, InterfaceC3279c interfaceC3279c, C1752b c1752b) {
        C3541t0 c3541t0;
        C3541t0 c3541t02;
        boolean z7;
        AbstractC3237u0 placementScope;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 c3502g02 = c3514k0.f16938a;
        boolean z8 = true;
        try {
            this.f17101y = true;
            if (C3100j.m4783a(j6, this.f17094r)) {
                if (this.f17085Q) {
                }
                c3541t0 = c3514k0.f16954q;
                if (c3541t0 != null) {
                    C3514k0 c3514k02 = c3541t0.f17024j;
                    if (AbstractC3498f.m5378r(c3514k02.f16938a)) {
                        z7 = true;
                    } else {
                        if (c3541t0.f17036v == EnumC3532q0.f17004g && !c3514k02.f16939b) {
                            c3514k02.f16940c = true;
                        }
                        z7 = c3514k02.f16940c;
                    }
                    if (z7) {
                        AbstractC3497e1 abstractC3497e1 = c3514k0.m5465a().f16849u;
                        if (abstractC3497e1 == null || (placementScope = abstractC3497e1.f16979p) == null) {
                            placementScope = ((C3728t) AbstractC3511j0.m5464a(c3502g02)).getPlacementScope();
                        }
                        C3541t0 c3541t03 = c3514k0.f16954q;
                        AbstractC3367j.m5097b(c3541t03);
                        C3502g0 m5447u = c3502g02.m5447u();
                        if (m5447u != null) {
                            m5447u.f16873J.f16945h = 0;
                        }
                        c3541t03.f17027m = Integer.MAX_VALUE;
                        AbstractC3237u0.m4949g(placementScope, c3541t03, (int) (j6 >> 32), (int) (4294967295L & j6));
                    }
                }
                c3541t02 = c3514k0.f16954q;
                if (c3541t02 != null || c3541t02.f17030p) {
                    z8 = false;
                }
                if (z8) {
                    AbstractC3088a.m4750b("Error: Placement happened before lookahead.");
                }
                m5527C0(j6, f7, interfaceC3279c, c1752b);
            }
            if (c3514k0.f16948k || c3514k0.f16947j || this.f17085Q) {
                this.f17069A = true;
                this.f17085Q = false;
            }
            m5533y0();
            c3541t0 = c3514k0.f16954q;
            if (c3541t0 != null) {
            }
            c3541t02 = c3514k0.f16954q;
            if (c3541t02 != null) {
            }
            z8 = false;
            if (z8) {
            }
            m5527C0(j6, f7, interfaceC3279c, c1752b);
        } catch (Throwable th) {
            c3502g0.m5422b0(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:27:0x007d, B:29:0x0087, B:33:0x0093), top: B:2:0x0006 }] */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5529E0(long j6) {
        boolean z7;
        int i7;
        int i8;
        long j7;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 c3502g02 = c3514k0.f16938a;
        try {
            if (c3502g0.f16883T) {
                AbstractC3088a.m4749a("measure is called on a deactivated node");
            }
            InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g02);
            C3502g0 m5447u = c3502g02.m5447u();
            boolean z8 = true;
            if (!c3502g02.f16871H && (m5447u == null || !m5447u.f16871H)) {
                z7 = false;
                c3502g02.f16871H = z7;
                if (!c3502g02.m5443q() && C3091a.m4754b(this.f16056h, j6)) {
                    ((C3728t) m5464a).m5740m(c3502g02, false);
                    c3502g02.m5421a0();
                    return false;
                }
                this.f17071C.f16919f = false;
                C2705e m5451y = c3502g02.m5451y();
                Object[] objArr = m5451y.f14517e;
                i7 = m5451y.f14519g;
                for (i8 = 0; i8 < i7; i8++) {
                    ((C3502g0) objArr[i8]).f16873J.f16953p.f17071C.f16916c = false;
                }
                this.f17090n = true;
                j7 = c3514k0.m5465a().f16055g;
                m4960q0(j6);
                m5526B0(j6);
                if (C3102l.m4790a(c3514k0.m5465a().f16055g, j7) && c3514k0.m5465a().f16053e == this.f16053e && c3514k0.m5465a().f16054f == this.f16054f) {
                    z8 = false;
                }
                m4959p0((c3514k0.m5465a().f16054f & 4294967295L) | (c3514k0.m5465a().f16053e << 32));
                return z8;
            }
            z7 = true;
            c3502g02.f16871H = z7;
            if (!c3502g02.m5443q()) {
                ((C3728t) m5464a).m5740m(c3502g02, false);
                c3502g02.m5421a0();
                return false;
            }
            this.f17071C.f16919f = false;
            C2705e m5451y2 = c3502g02.m5451y();
            Object[] objArr2 = m5451y2.f14517e;
            i7 = m5451y2.f14519g;
            while (i8 < i7) {
            }
            this.f17090n = true;
            j7 = c3514k0.m5465a().f16055g;
            m4960q0(j6);
            m5526B0(j6);
            if (C3102l.m4790a(c3514k0.m5465a().f16055g, j7)) {
                z8 = false;
            }
            m4959p0((c3514k0.m5465a().f16054f & 4294967295L) | (c3514k0.m5465a().f16053e << 32));
            return z8;
        } catch (Throwable th) {
            c3502g0.m5422b0(th);
            throw null;
        }
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: V */
    public final int mo4916V(int i7) {
        C3514k0 c3514k0 = this.f17086j;
        if (AbstractC3498f.m5378r(c3514k0.f16938a)) {
            C3541t0 c3541t0 = c3514k0.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            return c3541t0.mo4916V(i7);
        }
        m5534z0();
        return c3514k0.m5465a().mo4916V(i7);
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: Z */
    public final void mo5286Z() {
        C3502g0.m5396Y(this.f17086j.f16938a, false, 7);
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: a */
    public final C3505h0 mo5287a() {
        return this.f17071C;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: c0 */
    public final int mo4917c0(int i7) {
        C3514k0 c3514k0 = this.f17086j;
        if (AbstractC3498f.m5378r(c3514k0.f16938a)) {
            C3541t0 c3541t0 = c3514k0.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            return c3541t0.mo4917c0(i7);
        }
        m5534z0();
        return c3514k0.m5465a().mo4917c0(i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e */
    public final AbstractC3239v0 mo4918e(long j6) {
        EnumC3496e0 enumC3496e0;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        EnumC3496e0 enumC3496e02 = c3502g0.f16869F;
        EnumC3496e0 enumC3496e03 = EnumC3496e0.f16826g;
        if (enumC3496e02 == enumC3496e03) {
            c3502g0.m5427e();
        }
        if (AbstractC3498f.m5378r(c3514k0.f16938a)) {
            C3541t0 c3541t0 = c3514k0.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            c3541t0.f17028n = enumC3496e03;
            c3541t0.mo4918e(j6);
        }
        C3502g0 c3502g02 = c3514k0.f16938a;
        C3502g0 m5447u = c3502g02.m5447u();
        if (m5447u != null) {
            C3514k0 c3514k02 = m5447u.f16873J;
            if (this.f17092p != enumC3496e03 && !c3502g02.f16871H) {
                AbstractC3088a.m4750b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = c3514k02.f16941d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    enumC3496e0 = EnumC3496e0.f16825f;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c3514k02.f16941d);
                }
            } else {
                enumC3496e0 = EnumC3496e0.f16824e;
            }
            this.f17092p = enumC3496e0;
        } else {
            this.f17092p = enumC3496e03;
        }
        m5529E0(j6);
        return this;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e0 */
    public final int mo4919e0(int i7) {
        C3514k0 c3514k0 = this.f17086j;
        if (AbstractC3498f.m5378r(c3514k0.f16938a)) {
            C3541t0 c3541t0 = c3514k0.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            return c3541t0.mo4919e0(i7);
        }
        m5534z0();
        return c3514k0.m5465a().mo4919e0(i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: f */
    public final int mo4920f(int i7) {
        C3514k0 c3514k0 = this.f17086j;
        if (AbstractC3498f.m5378r(c3514k0.f16938a)) {
            C3541t0 c3541t0 = c3514k0.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            return c3541t0.mo4920f(i7);
        }
        m5534z0();
        return c3514k0.m5465a().mo4920f(i7);
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: h0 */
    public final int mo4939h0(C3216l c3216l) {
        EnumC3489c0 enumC3489c0;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0 m5447u = c3514k0.f16938a.m5447u();
        EnumC3489c0 enumC3489c02 = null;
        if (m5447u != null) {
            enumC3489c0 = m5447u.f16873J.f16941d;
        } else {
            enumC3489c0 = null;
        }
        EnumC3489c0 enumC3489c03 = EnumC3489c0.f16791e;
        C3505h0 c3505h0 = this.f17071C;
        if (enumC3489c0 == enumC3489c03) {
            c3505h0.f16916c = true;
        } else {
            C3502g0 m5447u2 = c3514k0.f16938a.m5447u();
            if (m5447u2 != null) {
                enumC3489c02 = m5447u2.f16873J.f16941d;
            }
            if (enumC3489c02 == EnumC3489c0.f16793g) {
                c3505h0.f16917d = true;
            }
        }
        this.f17093q = true;
        int mo4939h0 = c3514k0.m5465a().mo4939h0(c3216l);
        this.f17093q = false;
        return mo4939h0;
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: i0 */
    public final int mo4955i0() {
        return this.f17086j.m5465a().mo4955i0();
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: k0 */
    public final int mo4956k0() {
        return this.f17086j.m5465a().mo4956k0();
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: m0 */
    public final void mo4958m0(long j6, float f7, C1752b c1752b) {
        m5528D0(j6, f7, null, c1752b);
    }

    @Override // p146t1.AbstractC3239v0, p146t1.InterfaceC3214k0
    /* renamed from: n */
    public final Object mo4921n() {
        return this.f17099w;
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: o0 */
    public final void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c) {
        m5528D0(j6, f7, interfaceC3279c, null);
    }

    @Override // p162v1.InterfaceC3559z0
    /* renamed from: p */
    public final void mo5489p(boolean z7) {
        C3514k0 c3514k0 = this.f17086j;
        if (z7 != c3514k0.m5465a().f16976m) {
            c3514k0.m5465a().f16976m = z7;
            this.f17085Q = true;
        }
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: q */
    public final C3537s mo5288q() {
        return this.f17086j.f16938a.f16872I.f16799c;
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: r */
    public final void mo5289r(C3423m0 c3423m0) {
        C2705e m5451y = this.f17086j.f16938a.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            c3423m0.mo23f(((C3502g0) objArr[i8]).f16873J.f16953p);
        }
    }

    @Override // p162v1.InterfaceC3480a
    public final void requestLayout() {
        this.f17086j.f16938a.m5420X(false);
    }

    /* renamed from: s0 */
    public final List m5530s0() {
        C3514k0 c3514k0 = this.f17086j;
        c3514k0.f16938a.m5436i0();
        boolean z7 = this.f17073E;
        C2705e c2705e = this.f17072D;
        if (!z7) {
            return c2705e.m4304f();
        }
        C3502g0 c3502g0 = c3514k0.f16938a;
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (c2705e.f14519g <= i8) {
                c2705e.m4300b(c3502g02.f16873J.f16953p);
            } else {
                C3553x0 c3553x0 = c3502g02.f16873J.f16953p;
                Object[] objArr2 = c2705e.f14517e;
                Object obj = objArr2[i8];
                objArr2[i8] = c3553x0;
            }
        }
        c2705e.m4310l(((C2702b) c3502g0.m5440n()).f14511e.f14519g, c2705e.f14519g);
        this.f17073E = false;
        return c2705e.m4304f();
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: t */
    public final InterfaceC3480a mo5290t() {
        C3514k0 c3514k0;
        C3502g0 m5447u = this.f17086j.f16938a.m5447u();
        if (m5447u != null && (c3514k0 = m5447u.f16873J) != null) {
            return c3514k0.f16953p;
        }
        return null;
    }

    /* renamed from: u0 */
    public final void m5531u0() {
        boolean z7 = this.f17100x;
        this.f17100x = true;
        C3502g0 c3502g0 = this.f17086j.f16938a;
        C3490c1 c3490c1 = c3502g0.f16872I;
        if (!z7) {
            c3490c1.f16799c.m5345h1();
            if (c3502g0.m5443q()) {
                C3502g0.m5396Y(c3502g0, true, 6);
            } else if (c3502g0.f16873J.f16942e) {
                C3502g0.m5395W(c3502g0, true, 6);
            }
        }
        AbstractC3497e1 abstractC3497e1 = c3490c1.f16799c.f16848t;
        for (AbstractC3497e1 abstractC3497e12 = c3490c1.f16800d; !AbstractC3367j.m5096a(abstractC3497e12, abstractC3497e1) && abstractC3497e12 != null; abstractC3497e12 = abstractC3497e12.f16848t) {
            if (abstractC3497e12.f16844L) {
                abstractC3497e12.m5340c1();
            }
        }
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (c3502g02.m5448v() != Integer.MAX_VALUE) {
                c3502g02.f16873J.f16953p.m5531u0();
                C3502g0.m5397Z(c3502g02);
            }
        }
    }

    /* renamed from: w0 */
    public final void m5532w0() {
        if (this.f17100x) {
            this.f17100x = false;
            C3514k0 c3514k0 = this.f17086j;
            C3490c1 c3490c1 = c3514k0.f16938a.f16872I;
            AbstractC3497e1 abstractC3497e1 = c3490c1.f16799c.f16848t;
            for (AbstractC3497e1 abstractC3497e12 = c3490c1.f16800d; !AbstractC3367j.m5096a(abstractC3497e12, abstractC3497e1) && abstractC3497e12 != null; abstractC3497e12 = abstractC3497e12.f16848t) {
                AbstractC3809q m5335X0 = abstractC3497e12.m5335X0(AbstractC3500f1.m5393g(1048576));
                if (m5335X0 != null && (m5335X0.f17992e.f17995h & 1048576) != 0) {
                    boolean m5393g = AbstractC3500f1.m5393g(1048576);
                    AbstractC3809q mo5333V0 = abstractC3497e12.mo5333V0();
                    if (m5393g || (mo5333V0 = mo5333V0.f17996i) != null) {
                        for (AbstractC3809q m5335X02 = abstractC3497e12.m5335X0(m5393g); m5335X02 != null && (m5335X02.f17995h & 1048576) != 0; m5335X02 = m5335X02.f17997j) {
                            if ((m5335X02.f17994g & 1048576) != 0) {
                                AbstractC3809q abstractC3809q = m5335X02;
                                C2705e c2705e = null;
                                while (abstractC3809q != null) {
                                    if ((abstractC3809q.f17994g & 1048576) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                                        int i7 = 0;
                                        for (AbstractC3809q abstractC3809q2 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q2 != null; abstractC3809q2 = abstractC3809q2.f17997j) {
                                            if ((abstractC3809q2.f17994g & 1048576) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC3809q = abstractC3809q2;
                                                } else {
                                                    if (c2705e == null) {
                                                        c2705e = new C2705e(new AbstractC3809q[16]);
                                                    }
                                                    if (abstractC3809q != null) {
                                                        c2705e.m4300b(abstractC3809q);
                                                        abstractC3809q = null;
                                                    }
                                                    c2705e.m4300b(abstractC3809q2);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC3809q = AbstractC3498f.m5366f(c2705e);
                                }
                            }
                            if (m5335X02 != mo5333V0) {
                            }
                        }
                    }
                }
                abstractC3497e12.m5351n1();
            }
            C2705e m5451y = c3514k0.f16938a.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i8 = m5451y.f14519g;
            for (int i9 = 0; i9 < i8; i9++) {
                ((C3502g0) objArr[i9]).f16873J.f16953p.m5532w0();
            }
        }
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: x */
    public final void mo5291x() {
        this.f17074F = true;
        C3505h0 c3505h0 = this.f17071C;
        c3505h0.m5459h();
        boolean z7 = this.f17069A;
        C3514k0 c3514k0 = this.f17086j;
        if (z7) {
            C2705e m5451y = c3514k0.f16938a.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i7 = m5451y.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                C3502g0 c3502g0 = (C3502g0) objArr[i8];
                if (c3502g0.m5443q() && c3502g0.m5444r() == EnumC3496e0.f16824e && C3502g0.m5394R(c3502g0)) {
                    C3502g0.m5396Y(c3514k0.f16938a, false, 7);
                }
            }
        }
        if (this.f17070B || (!this.f17093q && !mo5288q().f16978o && this.f17069A)) {
            this.f17069A = false;
            EnumC3489c0 enumC3489c0 = c3514k0.f16941d;
            c3514k0.f16941d = EnumC3489c0.f16793g;
            c3514k0.m5471g(false);
            C3502g0 c3502g02 = c3514k0.f16938a;
            C3530p1 snapshotObserver = ((C3728t) AbstractC3511j0.m5464a(c3502g02)).getSnapshotObserver();
            snapshotObserver.m5498a(c3502g02, snapshotObserver.f16995e, this.f17077I);
            c3514k0.f16941d = enumC3489c0;
            if (mo5288q().f16978o && c3514k0.f16947j) {
                requestLayout();
            }
            this.f17070B = false;
        }
        if (c3505h0.f16917d) {
            c3505h0.f16918e = true;
        }
        if (c3505h0.f16915b && c3505h0.m5456e()) {
            c3505h0.m5458g();
        }
        this.f17074F = false;
    }

    /* renamed from: y0 */
    public final void m5533y0() {
        C3514k0 c3514k0 = this.f17086j;
        if (c3514k0.f16949l > 0) {
            C2705e m5451y = c3514k0.f16938a.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i7 = m5451y.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                C3502g0 c3502g0 = (C3502g0) objArr[i8];
                C3514k0 c3514k02 = c3502g0.f16873J;
                boolean z7 = c3514k02.f16947j;
                C3553x0 c3553x0 = c3514k02.f16953p;
                if ((z7 || c3514k02.f16948k) && !c3553x0.f17069A) {
                    c3502g0.m5420X(false);
                }
                c3553x0.m5533y0();
            }
        }
    }

    /* renamed from: z0 */
    public final void m5534z0() {
        EnumC3496e0 enumC3496e0;
        C3514k0 c3514k0 = this.f17086j;
        C3502g0.m5396Y(c3514k0.f16938a, false, 7);
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5447u != null && c3502g0.f16869F == EnumC3496e0.f16826g) {
            int ordinal = m5447u.f16873J.f16941d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    enumC3496e0 = m5447u.f16869F;
                } else {
                    enumC3496e0 = EnumC3496e0.f16825f;
                }
            } else {
                enumC3496e0 = EnumC3496e0.f16824e;
            }
            c3502g0.f16869F = enumC3496e0;
        }
    }
}
