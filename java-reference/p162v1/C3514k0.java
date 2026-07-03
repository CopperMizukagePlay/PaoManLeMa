package p162v1;

import p158u5.AbstractC3367j;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.k0 */
/* loaded from: classes.dex */
public final class C3514k0 {

    /* renamed from: a */
    public final C3502g0 f16938a;

    /* renamed from: b */
    public boolean f16939b;

    /* renamed from: c */
    public boolean f16940c;

    /* renamed from: e */
    public boolean f16942e;

    /* renamed from: f */
    public boolean f16943f;

    /* renamed from: g */
    public boolean f16944g;

    /* renamed from: h */
    public int f16945h;

    /* renamed from: i */
    public int f16946i;

    /* renamed from: j */
    public boolean f16947j;

    /* renamed from: k */
    public boolean f16948k;

    /* renamed from: l */
    public int f16949l;

    /* renamed from: m */
    public boolean f16950m;

    /* renamed from: n */
    public boolean f16951n;

    /* renamed from: o */
    public int f16952o;

    /* renamed from: q */
    public C3541t0 f16954q;

    /* renamed from: d */
    public EnumC3489c0 f16941d = EnumC3489c0.f16795i;

    /* renamed from: p */
    public final C3553x0 f16953p = new C3553x0(this);

    public C3514k0(C3502g0 c3502g0) {
        this.f16938a = c3502g0;
    }

    /* renamed from: a */
    public final AbstractC3497e1 m5465a() {
        return this.f16938a.f16872I.f16800d;
    }

    /* renamed from: b */
    public final void m5466b() {
        EnumC3489c0 enumC3489c0 = this.f16938a.f16873J.f16941d;
        EnumC3489c0 enumC3489c02 = EnumC3489c0.f16793g;
        EnumC3489c0 enumC3489c03 = EnumC3489c0.f16794h;
        if (enumC3489c0 == enumC3489c02 || enumC3489c0 == enumC3489c03) {
            if (this.f16953p.f17074F) {
                m5471g(true);
            } else {
                m5470f(true);
            }
        }
        if (enumC3489c0 == enumC3489c03) {
            C3541t0 c3541t0 = this.f16954q;
            if (c3541t0 != null && c3541t0.f17040z) {
                m5473i(true);
            } else {
                m5472h(true);
            }
        }
    }

    /* renamed from: c */
    public final void m5467c(long j6) {
        C3541t0 c3541t0 = this.f16954q;
        if (c3541t0 != null) {
            C3514k0 c3514k0 = c3541t0.f17024j;
            c3514k0.f16941d = EnumC3489c0.f16792f;
            C3553x0 c3553x0 = c3514k0.f16953p;
            C3502g0 c3502g0 = c3514k0.f16938a;
            c3514k0.f16942e = false;
            C3530p1 snapshotObserver = ((C3728t) AbstractC3511j0.m5464a(c3502g0)).getSnapshotObserver();
            C3535r0 c3535r0 = new C3535r0(c3541t0, j6);
            snapshotObserver.getClass();
            if (c3502g0.f16890k != null) {
                snapshotObserver.m5498a(c3502g0, snapshotObserver.f16992b, c3535r0);
            } else {
                snapshotObserver.m5498a(c3502g0, snapshotObserver.f16993c, c3535r0);
            }
            c3514k0.f16943f = true;
            c3514k0.f16944g = true;
            if (AbstractC3498f.m5378r(c3502g0)) {
                c3553x0.f17069A = true;
                c3553x0.f17070B = true;
            } else {
                c3553x0.f17102z = true;
            }
            c3514k0.f16941d = EnumC3489c0.f16795i;
        }
    }

    /* renamed from: d */
    public final void m5468d(int i7) {
        boolean z7;
        C3514k0 c3514k0;
        int i8 = this.f16949l;
        this.f16949l = i7;
        boolean z8 = false;
        if (i8 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 == 0) {
            z8 = true;
        }
        if (z7 != z8) {
            C3502g0 m5447u = this.f16938a.m5447u();
            if (m5447u != null) {
                c3514k0 = m5447u.f16873J;
            } else {
                c3514k0 = null;
            }
            if (c3514k0 != null) {
                if (i7 == 0) {
                    c3514k0.m5468d(c3514k0.f16949l - 1);
                } else {
                    c3514k0.m5468d(c3514k0.f16949l + 1);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m5469e(int i7) {
        boolean z7;
        C3514k0 c3514k0;
        int i8 = this.f16952o;
        this.f16952o = i7;
        boolean z8 = false;
        if (i8 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 == 0) {
            z8 = true;
        }
        if (z7 != z8) {
            C3502g0 m5447u = this.f16938a.m5447u();
            if (m5447u != null) {
                c3514k0 = m5447u.f16873J;
            } else {
                c3514k0 = null;
            }
            if (c3514k0 != null) {
                if (i7 == 0) {
                    c3514k0.m5469e(c3514k0.f16952o - 1);
                } else {
                    c3514k0.m5469e(c3514k0.f16952o + 1);
                }
            }
        }
    }

    /* renamed from: f */
    public final void m5470f(boolean z7) {
        if (this.f16948k != z7) {
            this.f16948k = z7;
            if (z7 && !this.f16947j) {
                m5468d(this.f16949l + 1);
            } else if (!z7 && !this.f16947j) {
                m5468d(this.f16949l - 1);
            }
        }
    }

    /* renamed from: g */
    public final void m5471g(boolean z7) {
        if (this.f16947j != z7) {
            this.f16947j = z7;
            if (z7 && !this.f16948k) {
                m5468d(this.f16949l + 1);
            } else if (!z7 && !this.f16948k) {
                m5468d(this.f16949l - 1);
            }
        }
    }

    /* renamed from: h */
    public final void m5472h(boolean z7) {
        if (this.f16951n != z7) {
            this.f16951n = z7;
            if (z7 && !this.f16950m) {
                m5469e(this.f16952o + 1);
            } else if (!z7 && !this.f16950m) {
                m5469e(this.f16952o - 1);
            }
        }
    }

    /* renamed from: i */
    public final void m5473i(boolean z7) {
        if (this.f16950m != z7) {
            this.f16950m = z7;
            if (z7 && !this.f16951n) {
                m5469e(this.f16952o + 1);
            } else if (!z7 && !this.f16951n) {
                m5469e(this.f16952o - 1);
            }
        }
    }

    /* renamed from: j */
    public final void m5474j() {
        C3553x0 c3553x0 = this.f16953p;
        C3514k0 c3514k0 = c3553x0.f17086j;
        Object obj = c3553x0.f17099w;
        C3502g0 c3502g0 = this.f16938a;
        if ((obj != null || c3514k0.m5465a().mo4921n() != null) && c3553x0.f17098v) {
            c3553x0.f17098v = false;
            c3553x0.f17099w = c3514k0.m5465a().mo4921n();
            C3502g0 m5447u = c3502g0.m5447u();
            if (m5447u != null) {
                C3502g0.m5396Y(m5447u, false, 7);
            }
        }
        C3541t0 c3541t0 = this.f16954q;
        if (c3541t0 != null) {
            C3514k0 c3514k02 = c3541t0.f17024j;
            if (c3541t0.f17022B == null) {
                AbstractC3529p0 mo5331T0 = c3514k02.m5465a().mo5331T0();
                AbstractC3367j.m5097b(mo5331T0);
                if (mo5331T0.f16985s.mo4921n() == null) {
                    return;
                }
            }
            if (c3541t0.f17021A) {
                c3541t0.f17021A = false;
                AbstractC3529p0 mo5331T02 = c3514k02.m5465a().mo5331T0();
                AbstractC3367j.m5097b(mo5331T02);
                c3541t0.f17022B = mo5331T02.f16985s.mo4921n();
                if (AbstractC3498f.m5378r(c3502g0)) {
                    C3502g0 m5447u2 = c3502g0.m5447u();
                    if (m5447u2 != null) {
                        C3502g0.m5396Y(m5447u2, false, 7);
                        return;
                    }
                    return;
                }
                C3502g0 m5447u3 = c3502g0.m5447u();
                if (m5447u3 != null) {
                    C3502g0.m5395W(m5447u3, false, 7);
                }
            }
        }
    }
}
