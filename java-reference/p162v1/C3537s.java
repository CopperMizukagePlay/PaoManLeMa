package p162v1;

import p001a0.C0068q2;
import p023c5.C0427s;
import p028d2.C0477j;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p057h1.C1752b;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3279c;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.s */
/* loaded from: classes.dex */
public final class C3537s extends AbstractC3497e1 {

    /* renamed from: V */
    public static final C0427s f17010V;

    /* renamed from: T */
    public final C3557y1 f17011T;

    /* renamed from: U */
    public C3534r f17012U;

    static {
        C0427s m1407g = AbstractC0659i0.m1407g();
        int i7 = C0677s.f2210h;
        m1407g.m910i(C0677s.f2206d);
        m1407g.m916o(1.0f);
        m1407g.m917p(1);
        f17010V = m1407g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, v1.y1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [v1.p0] */
    public C3537s(C3502g0 c3502g0) {
        super(c3502g0);
        C3534r c3534r;
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f17995h = 0;
        this.f17011T = abstractC3809q;
        abstractC3809q.f17999l = this;
        if (c3502g0.f16890k != null) {
            c3534r = new AbstractC3529p0(this);
        } else {
            c3534r = null;
        }
        this.f17012U = c3534r;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [v1.p0, v1.r] */
    @Override // p162v1.AbstractC3497e1
    /* renamed from: Q0 */
    public final void mo5328Q0() {
        if (this.f17012U == null) {
            this.f17012U = new AbstractC3529p0(this);
        }
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: T0 */
    public final AbstractC3529p0 mo5331T0() {
        return this.f17012U;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: V */
    public final int mo4916V(int i7) {
        C0068q2 m5446t = this.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3112g(c3502g0.f16872I.f16800d, c3502g0.m5439m(), i7);
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: V0 */
    public final AbstractC3809q mo5333V0() {
        return this.f17011T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p162v1.AbstractC3497e1
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5339b1(C3492d c3492d, long j6, C3531q c3531q, int i7, boolean z7) {
        boolean z8;
        int i8;
        boolean z9;
        boolean z10;
        C3502g0 c3502g0;
        boolean z11;
        long j7 = j6;
        C3531q c3531q2 = c3531q;
        int i9 = c3492d.f16807e;
        C3502g0 c3502g02 = this.f16847s;
        switch (i9) {
            case 1:
                z8 = true;
                break;
            default:
                C0477j m5449w = c3502g02.m5449w();
                if (m5449w != null && m5449w.f1686h) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z8 = !z11;
                break;
        }
        if (z8) {
            if (m5359w1(j7)) {
                i8 = i7;
                z9 = z7;
                z10 = true;
            } else {
                i8 = i7;
                if (i8 == 1 && (Float.floatToRawIntBits(m5325N0(j7, m5332U0())) & Integer.MAX_VALUE) < 2139095040) {
                    z10 = true;
                    z9 = false;
                }
            }
            if (!z10) {
                int i10 = c3531q2.f17001g;
                C2705e m5450x = c3502g02.m5450x();
                Object[] objArr = m5450x.f14517e;
                int i11 = m5450x.f14519g - 1;
                while (i11 >= 0) {
                    C3502g0 c3502g03 = (C3502g0) objArr[i11];
                    if (c3502g03.m5408J()) {
                        switch (c3492d.f16807e) {
                            case 1:
                                c3502g03.m5399A(j7, c3531q2, i8, z9);
                                c3502g0 = c3502g03;
                                break;
                            default:
                                C3490c1 c3490c1 = c3502g03.f16872I;
                                c3490c1.f16800d.m5338a1(AbstractC3497e1.f16832S, c3490c1.f16800d.m5330S0(j7), c3531q2, 1, z9);
                                c3531q2 = c3531q;
                                c3502g0 = c3502g03;
                                break;
                        }
                        long m5499a = c3531q2.m5499a();
                        if (AbstractC3498f.m5372l(m5499a) < 0.0f && AbstractC3498f.m5377q(m5499a) && !AbstractC3498f.m5376p(m5499a)) {
                            AbstractC3497e1 abstractC3497e1 = c3502g0.f16872I.f16800d;
                            abstractC3497e1.getClass();
                            AbstractC3809q m5335X0 = abstractC3497e1.m5335X0(AbstractC3500f1.m5393g(16));
                            if (m5335X0 != null && m5335X0.f18005r) {
                                if (!m5335X0.f17992e.f18005r) {
                                    AbstractC3088a.m4750b("visitLocalDescendants called on an unattached node");
                                }
                                AbstractC3809q abstractC3809q = m5335X0.f17992e;
                                if ((abstractC3809q.f17995h & 16) != 0) {
                                    while (abstractC3809q != null) {
                                        if ((abstractC3809q.f17994g & 16) != 0) {
                                            AbstractC3519m abstractC3519m = abstractC3809q;
                                            ?? r62 = 0;
                                            while (abstractC3519m != 0) {
                                                if (abstractC3519m instanceof InterfaceC3539s1) {
                                                    if (((InterfaceC3539s1) abstractC3519m).mo5301Z()) {
                                                        c3531q2.f17001g = c3531q2.f16999e.f12629b - 1;
                                                    }
                                                } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                                    AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                                    int i12 = 0;
                                                    abstractC3519m = abstractC3519m;
                                                    r62 = r62;
                                                    while (abstractC3809q2 != null) {
                                                        if ((abstractC3809q2.f17994g & 16) != 0) {
                                                            i12++;
                                                            r62 = r62;
                                                            if (i12 == 1) {
                                                                abstractC3519m = abstractC3809q2;
                                                            } else {
                                                                if (r62 == 0) {
                                                                    r62 = new C2705e(new AbstractC3809q[16]);
                                                                }
                                                                if (abstractC3519m != 0) {
                                                                    r62.m4300b(abstractC3519m);
                                                                    abstractC3519m = 0;
                                                                }
                                                                r62.m4300b(abstractC3809q2);
                                                            }
                                                        }
                                                        abstractC3809q2 = abstractC3809q2.f17997j;
                                                        abstractC3519m = abstractC3519m;
                                                        r62 = r62;
                                                    }
                                                    if (i12 == 1) {
                                                    }
                                                }
                                                abstractC3519m = AbstractC3498f.m5366f(r62);
                                            }
                                        }
                                        abstractC3809q = abstractC3809q.f17997j;
                                    }
                                }
                            }
                            c3531q2.f17001g = i10;
                            return;
                        }
                    }
                    i11--;
                    j7 = j6;
                    i8 = i7;
                }
                c3531q2.f17001g = i10;
                return;
            }
            return;
        }
        i8 = i7;
        z9 = z7;
        z10 = false;
        if (!z10) {
        }
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: c0 */
    public final int mo4917c0(int i7) {
        C0068q2 m5446t = this.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo173d(c3502g0.f16872I.f16800d, c3502g0.m5439m(), i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e */
    public final AbstractC3239v0 mo4918e(long j6) {
        m4960q0(j6);
        C3502g0 c3502g0 = this.f16847s;
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C3502g0) objArr[i8]).f16873J.f16953p.f17092p = EnumC3496e0.f16826g;
        }
        m5352o1(c3502g0.f16905z.mo170a(this, c3502g0.m5439m(), j6));
        m5344g1();
        return this;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e0 */
    public final int mo4919e0(int i7) {
        C0068q2 m5446t = this.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3109b(c3502g0.f16872I.f16800d, c3502g0.m5439m(), i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: f */
    public final int mo4920f(int i7) {
        C0068q2 m5446t = this.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3113h(c3502g0.f16872I.f16800d, c3502g0.m5439m(), i7);
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: k1 */
    public final void mo5348k1(InterfaceC0674q interfaceC0674q, C1752b c1752b) {
        C3502g0 c3502g0 = this.f16847s;
        InterfaceC3524n1 m5464a = AbstractC3511j0.m5464a(c3502g0);
        C2705e m5450x = c3502g0.m5450x();
        Object[] objArr = m5450x.f14517e;
        int i7 = m5450x.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            if (c3502g02.m5408J()) {
                c3502g02.m5435i(interfaceC0674q, c1752b);
            }
        }
        if (((C3728t) m5464a).getShowLayoutBounds()) {
            long j6 = this.f16055g;
            interfaceC0674q.mo1334f(0.5f, 0.5f, ((int) (j6 >> 32)) - 0.5f, ((int) (j6 & 4294967295L)) - 0.5f, f17010V);
        }
    }

    @Override // p162v1.AbstractC3497e1, p146t1.AbstractC3239v0
    /* renamed from: m0 */
    public final void mo4958m0(long j6, float f7, C1752b c1752b) {
        m5349l1(j6, f7, null, c1752b);
        if (this.f16977n) {
            return;
        }
        this.f16847s.f16873J.f16953p.m5525A0();
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: o0 */
    public final void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c) {
        m5349l1(j6, f7, interfaceC3279c, null);
        if (this.f16977n) {
            return;
        }
        this.f16847s.f16873J.f16953p.m5525A0();
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: u0 */
    public final int mo5491u0(C3216l c3216l) {
        C3534r c3534r = this.f17012U;
        if (c3534r != null) {
            return c3534r.mo5491u0(c3216l);
        }
        C3553x0 c3553x0 = this.f16847s.f16873J.f16953p;
        C3505h0 c3505h0 = c3553x0.f17071C;
        if (!c3553x0.f17093q) {
            if (c3553x0.f17086j.f16941d == EnumC3489c0.f16791e) {
                c3505h0.f16919f = true;
                if (c3505h0.f16915b) {
                    c3553x0.f17069A = true;
                    c3553x0.f17070B = true;
                }
            } else {
                c3505h0.f16920g = true;
            }
        }
        c3553x0.mo5288q().f16978o = true;
        c3553x0.mo5291x();
        c3553x0.mo5288q().f16978o = false;
        Integer num = (Integer) c3505h0.f16922i.get(c3216l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
