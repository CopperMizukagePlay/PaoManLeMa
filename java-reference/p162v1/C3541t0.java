package p162v1;

import p001a0.C0033i;
import p057h1.C1752b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p140s2.C3091a;
import p140s2.C3100j;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p160v.C3423m0;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.t0 */
/* loaded from: classes.dex */
public final class C3541t0 extends AbstractC3239v0 implements InterfaceC3214k0, InterfaceC3480a, InterfaceC3559z0 {

    /* renamed from: B */
    public Object f17022B;

    /* renamed from: C */
    public boolean f17023C;

    /* renamed from: j */
    public final C3514k0 f17024j;

    /* renamed from: k */
    public boolean f17025k;

    /* renamed from: o */
    public boolean f17029o;

    /* renamed from: p */
    public boolean f17030p;

    /* renamed from: q */
    public boolean f17031q;

    /* renamed from: r */
    public C3091a f17032r;

    /* renamed from: t */
    public InterfaceC3279c f17034t;

    /* renamed from: u */
    public C1752b f17035u;

    /* renamed from: z */
    public boolean f17040z;

    /* renamed from: l */
    public int f17026l = Integer.MAX_VALUE;

    /* renamed from: m */
    public int f17027m = Integer.MAX_VALUE;

    /* renamed from: n */
    public EnumC3496e0 f17028n = EnumC3496e0.f16826g;

    /* renamed from: s */
    public long f17033s = 0;

    /* renamed from: v */
    public EnumC3532q0 f17036v = EnumC3532q0.f17004g;

    /* renamed from: w */
    public final C3505h0 f17037w = new C3505h0(this, 1);

    /* renamed from: x */
    public final C2705e f17038x = new C2705e(new C3541t0[16]);

    /* renamed from: y */
    public boolean f17039y = true;

    /* renamed from: A */
    public boolean f17021A = true;

    public C3541t0(C3514k0 c3514k0) {
        this.f17024j = c3514k0;
        this.f17022B = c3514k0.f16953p.f17099w;
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: A */
    public final boolean mo5285A() {
        if (this.f17036v != EnumC3532q0.f17004g) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public final void m5501A0(long j6, InterfaceC3279c interfaceC3279c, C1752b c1752b) {
        EnumC3489c0 enumC3489c0;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 c3502g02 = c3514k0.f16938a;
        try {
            C3502g0 m5447u = c3502g0.m5447u();
            if (m5447u != null) {
                enumC3489c0 = m5447u.f16873J.f16941d;
            } else {
                enumC3489c0 = null;
            }
            EnumC3489c0 enumC3489c02 = EnumC3489c0.f16794h;
            if (enumC3489c0 == enumC3489c02) {
                c3514k0.f16940c = false;
            }
            if (c3502g02.f16883T) {
                AbstractC3088a.m4749a("place is called on a deactivated node");
            }
            c3514k0.f16941d = enumC3489c02;
            this.f17030p = true;
            this.f17023C = false;
            if (!C3100j.m4783a(j6, this.f17033s)) {
                if (c3514k0.f16951n || c3514k0.f16950m) {
                    c3514k0.f16943f = true;
                }
                m5505w0();
            }
            InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g02);
            if (!c3514k0.f16943f && mo5285A()) {
                AbstractC3529p0 mo5331T0 = c3514k0.m5465a().mo5331T0();
                AbstractC3367j.m5097b(mo5331T0);
                mo5331T0.m5496M0(C3100j.m4785c(j6, mo5331T0.f16057i));
                m5507z0();
            } else {
                c3514k0.m5472h(false);
                this.f17037w.f16920g = false;
                C3530p1 snapshotObserver = ((C3728t) m5464a).getSnapshotObserver();
                C3538s0 c3538s0 = new C3538s0(this, m5464a, j6);
                snapshotObserver.getClass();
                if (c3502g02.f16890k != null) {
                    snapshotObserver.m5498a(c3502g02, snapshotObserver.f16997g, c3538s0);
                } else {
                    snapshotObserver.m5498a(c3502g02, snapshotObserver.f16996f, c3538s0);
                }
            }
            this.f17033s = j6;
            this.f17034t = interfaceC3279c;
            this.f17035u = c1752b;
            c3514k0.f16941d = EnumC3489c0.f16795i;
        } catch (Throwable th) {
            c3502g0.m5422b0(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x0081, B:34:0x008b, B:38:0x009c, B:39:0x00a1, B:41:0x00b7, B:46:0x0084), top: B:2:0x0006 }] */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5502B0(long j6) {
        boolean z7;
        int i7;
        int i8;
        long j7;
        AbstractC3529p0 mo5331T0;
        boolean z8;
        boolean m4754b;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 c3502g02 = c3514k0.f16938a;
        try {
            if (c3502g0.f16883T) {
                AbstractC3088a.m4749a("measure is called on a deactivated node");
            }
            C3502g0 m5447u = c3502g02.m5447u();
            if (!c3502g02.f16871H && (m5447u == null || !m5447u.f16871H)) {
                z7 = false;
                c3502g02.f16871H = z7;
                if (!c3502g02.f16873J.f16942e) {
                    C3091a c3091a = this.f17032r;
                    if (c3091a == null) {
                        m4754b = false;
                    } else {
                        m4754b = C3091a.m4754b(c3091a.f15687a, j6);
                    }
                    if (m4754b) {
                        InterfaceC3524n1 interfaceC3524n1 = c3502g02.f16896q;
                        if (interfaceC3524n1 != null) {
                            ((C3728t) interfaceC3524n1).m5740m(c3502g02, true);
                        }
                        c3502g02.m5421a0();
                        return false;
                    }
                }
                this.f17032r = new C3091a(j6);
                m4960q0(j6);
                this.f17037w.f16919f = false;
                C2705e m5451y = c3502g02.m5451y();
                Object[] objArr = m5451y.f14517e;
                i7 = m5451y.f14519g;
                for (i8 = 0; i8 < i7; i8++) {
                    C3541t0 c3541t0 = ((C3502g0) objArr[i8]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t0);
                    c3541t0.f17037w.f16916c = false;
                }
                if (!this.f17031q) {
                    j7 = this.f16055g;
                } else {
                    long j8 = Integer.MIN_VALUE;
                    j7 = (j8 & 4294967295L) | (j8 << 32);
                }
                this.f17031q = true;
                mo5331T0 = c3514k0.m5465a().mo5331T0();
                if (mo5331T0 == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    AbstractC3088a.m4750b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                c3514k0.m5467c(j6);
                m4959p0((mo5331T0.f16054f & 4294967295L) | (mo5331T0.f16053e << 32));
                if (((int) (j7 >> 32)) == mo5331T0.f16053e || ((int) (j7 & 4294967295L)) != mo5331T0.f16054f) {
                    return true;
                }
                return false;
            }
            z7 = true;
            c3502g02.f16871H = z7;
            if (!c3502g02.f16873J.f16942e) {
            }
            this.f17032r = new C3091a(j6);
            m4960q0(j6);
            this.f17037w.f16919f = false;
            C2705e m5451y2 = c3502g02.m5451y();
            Object[] objArr2 = m5451y2.f14517e;
            i7 = m5451y2.f14519g;
            while (i8 < i7) {
            }
            if (!this.f17031q) {
            }
            this.f17031q = true;
            mo5331T0 = c3514k0.m5465a().mo5331T0();
            if (mo5331T0 == null) {
            }
            if (!z8) {
            }
            c3514k0.m5467c(j6);
            m4959p0((mo5331T0.f16054f & 4294967295L) | (mo5331T0.f16053e << 32));
            if (((int) (j7 >> 32)) == mo5331T0.f16053e) {
            }
            return true;
        } catch (Throwable th) {
            c3502g0.m5422b0(th);
            throw null;
        }
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: V */
    public final int mo4916V(int i7) {
        m5506y0();
        AbstractC3529p0 mo5331T0 = this.f17024j.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T0);
        return mo5331T0.mo4916V(i7);
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: Z */
    public final void mo5286Z() {
        C3502g0.m5395W(this.f17024j.f16938a, false, 7);
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: a */
    public final C3505h0 mo5287a() {
        return this.f17037w;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: c0 */
    public final int mo4917c0(int i7) {
        m5506y0();
        AbstractC3529p0 mo5331T0 = this.f17024j.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T0);
        return mo5331T0.mo4917c0(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 == p162v1.EnumC3489c0.f16794h) goto L13;
     */
    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3239v0 mo4918e(long j6) {
        EnumC3489c0 enumC3489c0;
        EnumC3496e0 enumC3496e0;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0 m5447u = c3514k0.f16938a.m5447u();
        EnumC3489c0 enumC3489c02 = null;
        if (m5447u != null) {
            enumC3489c0 = m5447u.f16873J.f16941d;
        } else {
            enumC3489c0 = null;
        }
        if (enumC3489c0 != EnumC3489c0.f16792f) {
            C3502g0 m5447u2 = c3514k0.f16938a.m5447u();
            if (m5447u2 != null) {
                enumC3489c02 = m5447u2.f16873J.f16941d;
            }
        }
        c3514k0.f16939b = false;
        C3502g0 c3502g0 = c3514k0.f16938a;
        C3502g0 m5447u3 = c3502g0.m5447u();
        if (m5447u3 != null) {
            C3514k0 c3514k02 = m5447u3.f16873J;
            if (this.f17028n != EnumC3496e0.f16826g && !c3502g0.f16871H) {
                AbstractC3088a.m4750b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = c3514k02.f16941d.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c3514k02.f16941d);
                }
                enumC3496e0 = EnumC3496e0.f16825f;
            } else {
                enumC3496e0 = EnumC3496e0.f16824e;
            }
            this.f17028n = enumC3496e0;
        } else {
            this.f17028n = EnumC3496e0.f16826g;
        }
        C3502g0 c3502g02 = c3514k0.f16938a;
        if (c3502g02.f16869F == EnumC3496e0.f16826g) {
            c3502g02.m5427e();
        }
        m5502B0(j6);
        return this;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e0 */
    public final int mo4919e0(int i7) {
        m5506y0();
        AbstractC3529p0 mo5331T0 = this.f17024j.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T0);
        return mo5331T0.mo4919e0(i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: f */
    public final int mo4920f(int i7) {
        m5506y0();
        AbstractC3529p0 mo5331T0 = this.f17024j.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T0);
        return mo5331T0.mo4920f(i7);
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: h0 */
    public final int mo4939h0(C3216l c3216l) {
        EnumC3489c0 enumC3489c0;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0 m5447u = c3514k0.f16938a.m5447u();
        EnumC3489c0 enumC3489c02 = null;
        if (m5447u != null) {
            enumC3489c0 = m5447u.f16873J.f16941d;
        } else {
            enumC3489c0 = null;
        }
        EnumC3489c0 enumC3489c03 = EnumC3489c0.f16792f;
        C3505h0 c3505h0 = this.f17037w;
        if (enumC3489c0 == enumC3489c03) {
            c3505h0.f16916c = true;
        } else {
            C3502g0 m5447u2 = c3514k0.f16938a.m5447u();
            if (m5447u2 != null) {
                enumC3489c02 = m5447u2.f16873J.f16941d;
            }
            if (enumC3489c02 == EnumC3489c0.f16794h) {
                c3505h0.f16917d = true;
            }
        }
        this.f17029o = true;
        AbstractC3529p0 mo5331T0 = c3514k0.m5465a().mo5331T0();
        AbstractC3367j.m5097b(mo5331T0);
        int mo4939h0 = mo5331T0.mo4939h0(c3216l);
        this.f17029o = false;
        return mo4939h0;
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: m0 */
    public final void mo4958m0(long j6, float f7, C1752b c1752b) {
        m5501A0(j6, null, c1752b);
    }

    @Override // p146t1.AbstractC3239v0, p146t1.InterfaceC3214k0
    /* renamed from: n */
    public final Object mo4921n() {
        return this.f17022B;
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: o0 */
    public final void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c) {
        m5501A0(j6, interfaceC3279c, null);
    }

    @Override // p162v1.InterfaceC3559z0
    /* renamed from: p */
    public final void mo5489p(boolean z7) {
        Boolean bool;
        AbstractC3529p0 mo5331T0;
        C3514k0 c3514k0 = this.f17024j;
        AbstractC3529p0 mo5331T02 = c3514k0.m5465a().mo5331T0();
        if (mo5331T02 != null) {
            bool = Boolean.valueOf(mo5331T02.f16976m);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z7).equals(bool) && (mo5331T0 = c3514k0.m5465a().mo5331T0()) != null) {
            mo5331T0.f16976m = z7;
        }
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: q */
    public final C3537s mo5288q() {
        return this.f17024j.f16938a.f16872I.f16799c;
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: r */
    public final void mo5289r(C3423m0 c3423m0) {
        C2705e m5451y = this.f17024j.f16938a.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3541t0 c3541t0 = ((C3502g0) objArr[i8]).f16873J.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            c3423m0.mo23f(c3541t0);
        }
    }

    @Override // p162v1.InterfaceC3480a
    public final void requestLayout() {
        this.f17024j.f16938a.m5419V(false);
    }

    /* renamed from: s0 */
    public final void m5503s0(boolean z7) {
        C3514k0 c3514k0 = this.f17024j;
        if (!z7 || !c3514k0.f16940c) {
            if (z7 || c3514k0.f16940c) {
                this.f17036v = EnumC3532q0.f17004g;
                C2705e m5451y = c3514k0.f16938a.m5451y();
                Object[] objArr = m5451y.f14517e;
                int i7 = m5451y.f14519g;
                for (int i8 = 0; i8 < i7; i8++) {
                    C3541t0 c3541t0 = ((C3502g0) objArr[i8]).f16873J.f16954q;
                    AbstractC3367j.m5097b(c3541t0);
                    c3541t0.m5503s0(true);
                }
            }
        }
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: t */
    public final InterfaceC3480a mo5290t() {
        C3514k0 c3514k0;
        C3502g0 m5447u = this.f17024j.f16938a.m5447u();
        if (m5447u != null && (c3514k0 = m5447u.f16873J) != null) {
            return c3514k0.f16954q;
        }
        return null;
    }

    /* renamed from: u0 */
    public final void m5504u0() {
        EnumC3532q0 enumC3532q0 = this.f17036v;
        C3514k0 c3514k0 = this.f17024j;
        boolean z7 = c3514k0.f16940c;
        C3502g0 c3502g0 = c3514k0.f16938a;
        EnumC3532q0 enumC3532q02 = EnumC3532q0.f17002e;
        if (z7) {
            this.f17036v = EnumC3532q0.f17003f;
        } else {
            this.f17036v = enumC3532q02;
        }
        if (enumC3532q0 != enumC3532q02 && c3514k0.f16942e) {
            C3502g0.m5395W(c3502g0, true, 6);
        }
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            C3541t0 c3541t0 = c3502g02.f16873J.f16954q;
            if (c3541t0 != null) {
                if (c3541t0.f17027m != Integer.MAX_VALUE) {
                    c3541t0.m5504u0();
                    C3502g0.m5397Z(c3502g02);
                }
            } else {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
        }
    }

    /* renamed from: w0 */
    public final void m5505w0() {
        C3514k0 c3514k0 = this.f17024j;
        if (c3514k0.f16952o > 0) {
            C2705e m5451y = c3514k0.f16938a.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i7 = m5451y.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                C3502g0 c3502g0 = (C3502g0) objArr[i8];
                C3514k0 c3514k02 = c3502g0.f16873J;
                if ((c3514k02.f16950m || c3514k02.f16951n) && !c3514k02.f16943f) {
                    c3502g0.m5419V(false);
                }
                C3541t0 c3541t0 = c3514k02.f16954q;
                if (c3541t0 != null) {
                    c3541t0.m5505w0();
                }
            }
        }
    }

    @Override // p162v1.InterfaceC3480a
    /* renamed from: x */
    public final void mo5291x() {
        C3091a c3091a;
        this.f17040z = true;
        C3505h0 c3505h0 = this.f17037w;
        c3505h0.m5459h();
        C3514k0 c3514k0 = this.f17024j;
        boolean z7 = c3514k0.f16943f;
        C3502g0 c3502g0 = c3514k0.f16938a;
        if (z7) {
            C2705e m5451y = c3502g0.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i7 = m5451y.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                C3502g0 c3502g02 = (C3502g0) objArr[i8];
                C3514k0 c3514k02 = c3502g02.f16873J;
                if (c3514k02.f16942e && c3502g02.m5445s() == EnumC3496e0.f16824e) {
                    C3541t0 c3541t0 = c3514k02.f16954q;
                    AbstractC3367j.m5097b(c3541t0);
                    C3541t0 c3541t02 = c3514k02.f16954q;
                    if (c3541t02 != null) {
                        c3091a = c3541t02.f17032r;
                    } else {
                        c3091a = null;
                    }
                    AbstractC3367j.m5097b(c3091a);
                    if (c3541t0.m5502B0(c3091a.f15687a)) {
                        C3502g0.m5395W(c3502g0, false, 7);
                    }
                }
            }
        }
        C3534r c3534r = mo5288q().f17012U;
        AbstractC3367j.m5097b(c3534r);
        if (c3514k0.f16944g || (!this.f17029o && !c3534r.f16978o && c3514k0.f16943f)) {
            c3514k0.f16943f = false;
            EnumC3489c0 enumC3489c0 = c3514k0.f16941d;
            c3514k0.f16941d = EnumC3489c0.f16794h;
            InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g0);
            c3514k0.m5473i(false);
            C3530p1 snapshotObserver = ((C3728t) m5464a).getSnapshotObserver();
            C0033i c0033i = new C0033i(13, this, c3534r);
            snapshotObserver.getClass();
            if (c3502g0.f16890k != null) {
                snapshotObserver.m5498a(c3502g0, snapshotObserver.f16998h, c0033i);
            } else {
                snapshotObserver.m5498a(c3502g0, snapshotObserver.f16995e, c0033i);
            }
            c3514k0.f16941d = enumC3489c0;
            if (c3514k0.f16950m && c3534r.f16978o) {
                requestLayout();
            }
            c3514k0.f16944g = false;
        }
        if (c3505h0.f16917d) {
            c3505h0.f16918e = true;
        }
        if (c3505h0.f16915b && c3505h0.m5456e()) {
            c3505h0.m5458g();
        }
        this.f17040z = false;
    }

    /* renamed from: y0 */
    public final void m5506y0() {
        EnumC3496e0 enumC3496e0;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0.m5395W(c3514k0.f16938a, false, 7);
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

    /* renamed from: z0 */
    public final void m5507z0() {
        EnumC3489c0 enumC3489c0;
        this.f17023C = true;
        C3514k0 c3514k0 = this.f17024j;
        C3502g0 m5447u = c3514k0.f16938a.m5447u();
        EnumC3532q0 enumC3532q0 = this.f17036v;
        if ((enumC3532q0 != EnumC3532q0.f17002e && !c3514k0.f16940c) || (enumC3532q0 != EnumC3532q0.f17003f && c3514k0.f16940c)) {
            m5504u0();
            if (this.f17025k && m5447u != null) {
                m5447u.m5419V(false);
            }
        }
        if (m5447u != null) {
            C3514k0 c3514k02 = m5447u.f16873J;
            if (!this.f17025k && ((enumC3489c0 = c3514k02.f16941d) == EnumC3489c0.f16793g || enumC3489c0 == EnumC3489c0.f16794h)) {
                if (this.f17027m != Integer.MAX_VALUE) {
                    AbstractC3088a.m4750b("Place was called on a node which was placed already");
                }
                int i7 = c3514k02.f16945h;
                this.f17027m = i7;
                c3514k02.f16945h = i7 + 1;
            }
        } else {
            this.f17027m = 0;
        }
        mo5291x();
    }
}
