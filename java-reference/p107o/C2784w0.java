package p107o;

import android.view.View;
import p001a0.C0075s1;
import p027d1.C0464b;
import p028d2.C0477j;
import p032d6.AbstractC0525d0;
import p034e0.C0630s0;
import p034e0.C0632t0;
import p047f6.AbstractC1555j;
import p047f6.C1548c;
import p053g5.C1694m;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p140s2.C3098h;
import p140s2.C3102l;
import p140s2.InterfaceC3093c;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3522n;
import p162v1.InterfaceC3525o;
import p162v1.InterfaceC3551w1;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.w0 */
/* loaded from: classes.dex */
public final class C2784w0 extends AbstractC3809q implements InterfaceC3525o, InterfaceC3522n, InterfaceC3551w1, InterfaceC3509i1 {

    /* renamed from: B */
    public C3102l f14780B;

    /* renamed from: C */
    public C1548c f14781C;

    /* renamed from: s */
    public C0630s0 f14782s;

    /* renamed from: t */
    public C0632t0 f14783t;

    /* renamed from: u */
    public InterfaceC2745h1 f14784u;

    /* renamed from: v */
    public View f14785v;

    /* renamed from: w */
    public InterfaceC3093c f14786w;

    /* renamed from: x */
    public InterfaceC2742g1 f14787x;

    /* renamed from: z */
    public C2352e0 f14789z;

    /* renamed from: y */
    public final C2361g1 f14788y = new C2361g1(null, C2413u0.f13572g);

    /* renamed from: A */
    public long f14779A = 9205357640488583168L;

    public C2784w0(C0630s0 c0630s0, C0632t0 c0632t0, InterfaceC2745h1 interfaceC2745h1) {
        this.f14782s = c0630s0;
        this.f14783t = c0632t0;
        this.f14784u = interfaceC2745h1;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        mo553M();
        this.f14781C = AbstractC1555j.m2510a(0, 7, null);
        AbstractC0525d0.m1141s(m5830y0(), null, new C0075s1(this, null, 7), 3);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        InterfaceC2742g1 interfaceC2742g1 = this.f14787x;
        if (interfaceC2742g1 != null) {
            ((C2748i1) interfaceC2742g1).m4418b();
        }
        this.f14787x = null;
    }

    /* renamed from: K0 */
    public final long m4424K0() {
        if (this.f14789z == null) {
            this.f14789z = AbstractC2418w.m3974q(new C2782v0(this, 0));
        }
        C2352e0 c2352e0 = this.f14789z;
        if (c2352e0 != null) {
            return ((C0464b) c2352e0.getValue()).f1623a;
        }
        return 9205357640488583168L;
    }

    /* renamed from: L0 */
    public final void m4425L0() {
        InterfaceC2742g1 interfaceC2742g1 = this.f14787x;
        if (interfaceC2742g1 != null) {
            ((C2748i1) interfaceC2742g1).m4418b();
        }
        View view = this.f14785v;
        if (view == null) {
            view = AbstractC3498f.m5384x(this);
        }
        this.f14785v = view;
        InterfaceC3093c interfaceC3093c = this.f14786w;
        if (interfaceC3093c == null) {
            interfaceC3093c = AbstractC3498f.m5382v(this).f16865B;
        }
        this.f14786w = interfaceC3093c;
        this.f14787x = this.f14784u.mo4417b(view, interfaceC3093c);
        m4427N0();
    }

    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        AbstractC3498f.m5379s(this, new C2782v0(this, 2));
    }

    /* renamed from: M0 */
    public final void m4426M0() {
        InterfaceC3093c interfaceC3093c = this.f14786w;
        if (interfaceC3093c == null) {
            interfaceC3093c = AbstractC3498f.m5382v(this).f16865B;
            this.f14786w = interfaceC3093c;
        }
        long j6 = ((C0464b) this.f14782s.mo23f(interfaceC3093c)).f1623a;
        if (AbstractC3784a.m5815x(j6) && AbstractC3784a.m5815x(m4424K0())) {
            this.f14779A = C0464b.m1011g(m4424K0(), j6);
            if (this.f14787x == null) {
                m4425L0();
            }
            InterfaceC2742g1 interfaceC2742g1 = this.f14787x;
            if (interfaceC2742g1 != null) {
                interfaceC2742g1.mo4411a(this.f14779A, 9205357640488583168L);
            }
            m4427N0();
            return;
        }
        this.f14779A = 9205357640488583168L;
        InterfaceC2742g1 interfaceC2742g12 = this.f14787x;
        if (interfaceC2742g12 != null) {
            ((C2748i1) interfaceC2742g12).m4418b();
        }
    }

    /* renamed from: N0 */
    public final void m4427N0() {
        InterfaceC3093c interfaceC3093c;
        InterfaceC2742g1 interfaceC2742g1 = this.f14787x;
        if (interfaceC2742g1 == null || (interfaceC3093c = this.f14786w) == null) {
            return;
        }
        C2748i1 c2748i1 = (C2748i1) interfaceC2742g1;
        long m4419c = c2748i1.m4419c();
        C3102l c3102l = this.f14780B;
        if (c3102l == null || m4419c != c3102l.f15702a) {
            this.f14783t.mo23f(new C3098h(interfaceC3093c.mo4525w(AbstractC2072e.m3347y(c2748i1.m4419c()))));
            this.f14780B = new C3102l(c2748i1.m4419c());
        }
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        c3508i0.m5460a();
        C1548c c1548c = this.f14781C;
        if (c1548c != null) {
            c1548c.mo2505v(C1694m.f10482a);
        }
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        c0477j.m1036d(AbstractC2786x0.f14791a, new C2782v0(this, 1));
    }

    @Override // p162v1.InterfaceC3525o
    /* renamed from: x */
    public final void mo790x(AbstractC3497e1 abstractC3497e1) {
        this.f14788y.setValue(abstractC3497e1);
    }
}
