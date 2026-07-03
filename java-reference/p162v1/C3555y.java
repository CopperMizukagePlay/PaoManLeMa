package p162v1;

import p023c5.C0427s;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p035e1.InterfaceC0674q;
import p057h1.C1752b;
import p077k.C2182b0;
import p140s2.C3100j;
import p140s2.C3102l;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.y */
/* loaded from: classes.dex */
public final class C3555y extends AbstractC3497e1 {

    /* renamed from: V */
    public static final C0427s f17103V;

    /* renamed from: T */
    public InterfaceC3549w f17104T;

    /* renamed from: U */
    public C3552x f17105U;

    static {
        C0427s m1407g = AbstractC0659i0.m1407g();
        int i7 = C0677s.f2210h;
        m1407g.m910i(C0677s.f2207e);
        m1407g.m916o(1.0f);
        m1407g.m917p(1);
        f17103V = m1407g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3555y(C3502g0 c3502g0, InterfaceC3549w interfaceC3549w) {
        super(c3502g0);
        C3552x c3552x;
        this.f17104T = interfaceC3549w;
        if (c3502g0.f16890k != null) {
            c3552x = new C3552x(this);
        } else {
            c3552x = null;
        }
        this.f17105U = c3552x;
        if ((((AbstractC3809q) interfaceC3549w).f17992e.f17994g & 512) == 0) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: Q0 */
    public final void mo5328Q0() {
        if (this.f17105U == null) {
            this.f17105U = new C3552x(this);
        }
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: T0 */
    public final AbstractC3529p0 mo5331T0() {
        return this.f17105U;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: V */
    public final int mo4916V(int i7) {
        InterfaceC3549w interfaceC3549w = this.f17104T;
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e1);
        return interfaceC3549w.mo567X(this, abstractC3497e1, i7);
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: V0 */
    public final AbstractC3809q mo5333V0() {
        return ((AbstractC3809q) this.f17104T).f17992e;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: c0 */
    public final int mo4917c0(int i7) {
        InterfaceC3549w interfaceC3549w = this.f17104T;
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e1);
        return interfaceC3549w.mo564C(this, abstractC3497e1, i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e */
    public final AbstractC3239v0 mo4918e(long j6) {
        m4960q0(j6);
        InterfaceC3549w interfaceC3549w = this.f17104T;
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e1);
        m5352o1(interfaceC3549w.mo546d(this, abstractC3497e1, j6));
        m5344g1();
        return this;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e0 */
    public final int mo4919e0(int i7) {
        InterfaceC3549w interfaceC3549w = this.f17104T;
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e1);
        return interfaceC3549w.mo569p(this, abstractC3497e1, i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: f */
    public final int mo4920f(int i7) {
        InterfaceC3549w interfaceC3549w = this.f17104T;
        AbstractC3497e1 abstractC3497e1 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e1);
        return interfaceC3549w.mo568e0(this, abstractC3497e1, i7);
    }

    @Override // p162v1.AbstractC3497e1
    /* renamed from: k1 */
    public final void mo5348k1(InterfaceC0674q interfaceC0674q, C1752b c1752b) {
        AbstractC3497e1 abstractC3497e1;
        AbstractC3497e1 abstractC3497e12 = this.f16848t;
        AbstractC3367j.m5097b(abstractC3497e12);
        abstractC3497e12.m5326O0(interfaceC0674q, c1752b);
        if (((C3728t) AbstractC3511j0.m5464a(this.f16847s)).getShowLayoutBounds() && (abstractC3497e1 = this.f16848t) != null) {
            if (!C3102l.m4790a(this.f16055g, abstractC3497e1.f16055g) || !C3100j.m4783a(abstractC3497e1.f16836D, 0L)) {
                long j6 = this.f16055g;
                interfaceC0674q.mo1334f(0.5f, 0.5f, ((int) (j6 >> 32)) - 0.5f, ((int) (j6 & 4294967295L)) - 0.5f, f17103V);
            }
        }
    }

    @Override // p162v1.AbstractC3497e1, p146t1.AbstractC3239v0
    /* renamed from: m0 */
    public final void mo4958m0(long j6, float f7, C1752b c1752b) {
        m5349l1(j6, f7, null, c1752b);
        m5535x1();
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: o0 */
    public final void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c) {
        m5349l1(j6, f7, interfaceC3279c, null);
        m5535x1();
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: u0 */
    public final int mo5491u0(C3216l c3216l) {
        C3552x c3552x = this.f17105U;
        if (c3552x != null) {
            C2182b0 c2182b0 = c3552x.f16990x;
            int m3551d = c2182b0.m3551d(c3216l);
            if (m3551d >= 0) {
                return c2182b0.f12623c[m3551d];
            }
            return Integer.MIN_VALUE;
        }
        return AbstractC3498f.m5363c(this, c3216l);
    }

    /* renamed from: x1 */
    public final void m5535x1() {
        if (this.f16977n) {
            return;
        }
        m5345h1();
        mo5318D0().mo4883b();
        AbstractC3367j.m5097b(this.f16848t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y1 */
    public final void m5536y1(InterfaceC3549w interfaceC3549w) {
        if (!interfaceC3549w.equals(this.f17104T) && (((AbstractC3809q) interfaceC3549w).f17992e.f17994g & 512) != 0) {
            throw new ClassCastException();
        }
        this.f17104T = interfaceC3549w;
    }
}
