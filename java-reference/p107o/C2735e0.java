package p107o;

import p001a0.C0033i;
import p001a0.C0053n;
import p001a0.C0075s1;
import p001a0.C0098z1;
import p005a6.InterfaceC0114e;
import p019c1.C0377u;
import p019c1.C0379w;
import p019c1.EnumC0376t;
import p019c1.InterfaceC0361e;
import p019c1.InterfaceC0374r;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0490w;
import p032d6.AbstractC0525d0;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3081j;
import p158u5.AbstractC3367j;
import p160v.C3421l0;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3525o;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.e0 */
/* loaded from: classes.dex */
public final class C2735e0 extends AbstractC3519m implements InterfaceC0361e, InterfaceC3551w1, InterfaceC3525o, InterfaceC0374r {

    /* renamed from: u */
    public EnumC0376t f14644u;

    /* renamed from: v */
    public final C2732d0 f14645v;

    /* renamed from: w */
    public final C2738f0 f14646w;

    /* renamed from: x */
    public final C2741g0 f14647x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.d0, x0.q, v1.l] */
    /* JADX WARN: Type inference failed for: r10v1, types: [o.f0, x0.q, v1.l] */
    /* JADX WARN: Type inference failed for: r10v2, types: [o.g0, x0.q, v1.l] */
    public C2735e0(C3081j c3081j) {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14622s = c3081j;
        m5483K0(abstractC3809q);
        this.f14645v = abstractC3809q;
        ?? abstractC3809q2 = new AbstractC3809q();
        m5483K0(abstractC3809q2);
        this.f14646w = abstractC3809q2;
        ?? abstractC3809q3 = new AbstractC3809q();
        m5483K0(abstractC3809q3);
        this.f14647x = abstractC3809q3;
        m5483K0(new C0377u(new C0098z1(1, C0379w.f1276a, C0379w.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 1), 3));
    }

    /* renamed from: N0 */
    public final void m4401N0(C3081j c3081j) {
        C3075d c3075d;
        C2732d0 c2732d0 = this.f14645v;
        if (!AbstractC3367j.m5096a(c2732d0.f14622s, c3081j)) {
            C3081j c3081j2 = c2732d0.f14622s;
            if (c3081j2 != null && (c3075d = c2732d0.f14623t) != null) {
                c3081j2.m4748c(new C3076e(c3075d));
            }
            c2732d0.f14623t = null;
            c2732d0.f14622s = c3081j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r4v4, types: [s.d, java.lang.Object, s.h] */
    @Override // p019c1.InterfaceC0361e
    /* renamed from: h0 */
    public final void mo547h0(EnumC0376t enumC0376t) {
        C2744h0 m4410K0;
        if (!AbstractC3367j.m5096a(this.f14644u, enumC0376t)) {
            boolean m844a = enumC0376t.m844a();
            C3421l0 c3421l0 = null;
            Object[] objArr = 0;
            if (m844a) {
                AbstractC0525d0.m1141s(m5830y0(), null, new C0075s1(this, objArr == true ? 1 : 0, 6), 3);
            }
            if (this.f18005r) {
                AbstractC3498f.m5375o(this);
            }
            C2732d0 c2732d0 = this.f14645v;
            C3081j c3081j = c2732d0.f14622s;
            if (c3081j != null) {
                if (m844a) {
                    C3075d c3075d = c2732d0.f14623t;
                    if (c3075d != null) {
                        c2732d0.m4395K0(c3081j, new C3076e(c3075d));
                        c2732d0.f14623t = null;
                    }
                    ?? obj = new Object();
                    c2732d0.m4395K0(c3081j, obj);
                    c2732d0.f14623t = obj;
                } else {
                    C3075d c3075d2 = c2732d0.f14623t;
                    if (c3075d2 != null) {
                        c2732d0.m4395K0(c3081j, new C3076e(c3075d2));
                        c2732d0.f14623t = null;
                    }
                }
            }
            C2741g0 c2741g0 = this.f14647x;
            if (m844a != c2741g0.f14665s) {
                if (!m844a) {
                    C2744h0 m4410K02 = c2741g0.m4410K0();
                    if (m4410K02 != null) {
                        m4410K02.m4415K0(null);
                    }
                } else {
                    AbstractC3497e1 abstractC3497e1 = c2741g0.f14666t;
                    if (abstractC3497e1 != null && abstractC3497e1.mo5333V0().f18005r && (m4410K0 = c2741g0.m4410K0()) != null) {
                        m4410K0.m4415K0(c2741g0.f14666t);
                    }
                }
                c2741g0.f14665s = m844a;
            }
            C2738f0 c2738f0 = this.f14646w;
            if (m844a) {
                c2738f0.getClass();
                ?? obj2 = new Object();
                AbstractC3498f.m5379s(c2738f0, new C0033i(10, obj2, c2738f0));
                C3421l0 c3421l02 = (C3421l0) obj2.f16451e;
                if (c3421l02 != null) {
                    c3421l02.m5182a();
                    c3421l0 = c3421l02;
                }
                c2738f0.f14654s = c3421l0;
            } else {
                C3421l0 c3421l03 = c2738f0.f14654s;
                if (c3421l03 != null) {
                    c3421l03.m5183b();
                }
                c2738f0.f14654s = null;
            }
            c2738f0.f14655t = m844a;
            this.f14644u = enumC0376t;
        }
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        EnumC0376t enumC0376t = this.f14644u;
        boolean z7 = false;
        if (enumC0376t != null && enumC0376t.m844a()) {
            z7 = true;
        }
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        C0490w c0490w = AbstractC0487t.f1750k;
        InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[4];
        c0490w.m1066a(c0477j, Boolean.valueOf(z7));
        c0477j.m1036d(AbstractC0476i.f1678v, new C0468a(null, new C0053n(20, this)));
    }

    @Override // p162v1.InterfaceC3525o
    /* renamed from: x */
    public final void mo790x(AbstractC3497e1 abstractC3497e1) {
        this.f14647x.mo790x(abstractC3497e1);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
