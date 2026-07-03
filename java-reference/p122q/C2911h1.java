package p122q;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.AbstractC0152a;
import p001a0.C0005b;
import p001a0.C0019e1;
import p001a0.C0053n;
import p001a0.C0070r0;
import p001a0.C0074s0;
import p001a0.C0098z1;
import p005a6.InterfaceC0114e;
import p019c1.C0377u;
import p019c1.C0379w;
import p019c1.InterfaceC0369m;
import p019c1.InterfaceC0372p;
import p027d1.C0464b;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p032d6.AbstractC0525d0;
import p052g4.C1676d;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p100n.C2692w;
import p102n1.AbstractC2710c;
import p102n1.C2708a;
import p102n1.InterfaceC2711d;
import p107o.EnumC2788y0;
import p107o.InterfaceC2739f1;
import p109o1.C2799d;
import p109o1.C2802g;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p137s.C3081j;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3551w1;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.h1 */
/* loaded from: classes.dex */
public final class C2911h1 extends AbstractC2907g0 implements InterfaceC3509i1, InterfaceC0372p, InterfaceC2711d, InterfaceC3551w1 {

    /* renamed from: C */
    public InterfaceC2739f1 f15163C;

    /* renamed from: D */
    public InterfaceC2925m0 f15164D;

    /* renamed from: E */
    public final C2799d f15165E;

    /* renamed from: F */
    public final C2961y0 f15166F;

    /* renamed from: G */
    public final C2921l f15167G;

    /* renamed from: H */
    public final C2929n1 f15168H;

    /* renamed from: I */
    public final C1676d f15169I;

    /* renamed from: J */
    public final C2915j f15170J;

    /* renamed from: K */
    public C2887a f15171K;

    /* renamed from: L */
    public C0074s0 f15172L;

    /* renamed from: M */
    public C2902e1 f15173M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [q.y0, x0.q, v1.l] */
    /* JADX WARN: Type inference failed for: r10v5, types: [x.f, x0.q, v1.l] */
    /* JADX WARN: Type inference failed for: r10v6, types: [o.h0, x0.q, v1.l] */
    /* JADX WARN: Type inference failed for: r12v2, types: [q.m0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q.h1, java.lang.Object, v1.m] */
    public C2911h1(InterfaceC2739f1 interfaceC2739f1, InterfaceC2900e interfaceC2900e, InterfaceC2925m0 interfaceC2925m0, EnumC2931o0 enumC2931o0, InterfaceC2914i1 interfaceC2914i1, C3081j c3081j, boolean z7, boolean z8) {
        super(C2903f.f15135i, z7, c3081j, enumC2931o0);
        C2921l c2921l;
        this.f15163C = interfaceC2739f1;
        this.f15164D = interfaceC2925m0;
        C2799d c2799d = new C2799d();
        this.f15165E = c2799d;
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15358s = z7;
        m5483K0(abstractC3809q);
        this.f15166F = abstractC3809q;
        C2921l c2921l2 = new C2921l(new C2692w(new C0019e1((InterfaceC3093c) AbstractC0152a.f634c)));
        this.f15167G = c2921l2;
        InterfaceC2739f1 interfaceC2739f12 = this.f15163C;
        ?? r12 = this.f15164D;
        if (r12 == 0) {
            c2921l = c2921l2;
        } else {
            c2921l = r12;
        }
        C2929n1 c2929n1 = new C2929n1(interfaceC2914i1, interfaceC2739f12, c2921l, enumC2931o0, z8, c2799d);
        this.f15168H = c2929n1;
        C1676d c1676d = new C1676d(c2929n1, z7);
        this.f15169I = c1676d;
        C2915j c2915j = new C2915j(enumC2931o0, c2929n1, z8, interfaceC2900e);
        m5483K0(c2915j);
        this.f15170J = c2915j;
        m5483K0(new C2802g(c1676d, c2799d));
        m5483K0(new C0377u(new C0098z1(1, C0379w.f1276a, C0379w.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0, 0, 1), 3));
        ?? abstractC3809q2 = new AbstractC3809q();
        abstractC3809q2.f17956s = c2915j;
        m5483K0(abstractC3809q2);
        C0005b c0005b = new C0005b(25, this);
        ?? abstractC3809q3 = new AbstractC3809q();
        abstractC3809q3.f14669s = c0005b;
        m5483K0(abstractC3809q3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [t5.c, u5.k] */
    @Override // p122q.AbstractC2907g0, p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        long j7;
        ?? r02 = c2859j.f14991a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((Boolean) this.f15151v.mo23f((C2868s) r02.get(i7))).booleanValue()) {
                super.mo545A(c2859j, enumC2860k, j6);
                break;
            }
            i7++;
        }
        if (enumC2860k == EnumC2860k.f14996f && c2859j.f14994d == 6) {
            ?? r12 = c2859j.f14991a;
            int size2 = r12.size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (((C2868s) r12.get(i8)).m4551b()) {
                    return;
                }
            }
            AbstractC3367j.m5097b(this.f15171K);
            InterfaceC3093c interfaceC3093c = AbstractC3498f.m5382v(this).f16865B;
            C0464b c0464b = new C0464b(0L);
            int size3 = r12.size();
            int i9 = 0;
            while (true) {
                j7 = c0464b.f1623a;
                if (i9 >= size3) {
                    break;
                }
                c0464b = new C0464b(C0464b.m1011g(j7, ((C2868s) r12.get(i9)).f15015j));
                i9++;
            }
            AbstractC0525d0.m1141s(m5830y0(), null, new C2902e1(this, C0464b.m1012h(-interfaceC3093c.mo4526y(64), j7), null, 2), 3);
            int size4 = r12.size();
            for (int i10 = 0; i10 < size4; i10++) {
                ((C2868s) r12.get(i10)).m4550a();
            }
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        AbstractC3498f.m5379s(this, new C0053n(23, this));
        this.f15171K = C2887a.f15083a;
    }

    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        AbstractC3498f.m5379s(this, new C0053n(23, this));
    }

    @Override // p122q.AbstractC2907g0
    /* renamed from: R0 */
    public final Object mo4576R0(C2904f0 c2904f0, C2904f0 c2904f02) {
        C2929n1 c2929n1 = this.f15168H;
        Object m4592e = c2929n1.m4592e(EnumC2788y0.f14797f, new C0070r0(c2904f0, c2929n1, (InterfaceC2313c) null, 26), c2904f02);
        if (m4592e == EnumC2465a.f13750e) {
            return m4592e;
        }
        return C1694m.f10482a;
    }

    @Override // p122q.AbstractC2907g0
    /* renamed from: T0 */
    public final void mo4578T0(long j6) {
        AbstractC0525d0.m1141s(this.f15165E.m4433c(), null, new C2902e1(this, j6, null, 0), 3);
    }

    @Override // p122q.AbstractC2907g0
    /* renamed from: U0 */
    public final boolean mo4579U0() {
        boolean z7;
        C2929n1 c2929n1 = this.f15168H;
        if (!c2929n1.f15229a.mo114c()) {
            InterfaceC2739f1 interfaceC2739f1 = c2929n1.f15230b;
            if (interfaceC2739f1 != null) {
                z7 = interfaceC2739f1.mo4391b();
            } else {
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // p102n1.InterfaceC2711d
    /* renamed from: V */
    public final boolean mo4353V(KeyEvent keyEvent) {
        float f7;
        long m5797a;
        float f8;
        if (this.f15152w) {
            if ((C2708a.m4318a(AbstractC2710c.m4345s(keyEvent), C2708a.f14533n) || C2708a.m4318a(AbstractC2168e.m3517d(keyEvent.getKeyCode()), C2708a.f14532m)) && AbstractC2710c.m4320C(keyEvent) == 2 && !keyEvent.isCtrlPressed()) {
                EnumC2931o0 enumC2931o0 = this.f15168H.f15232d;
                EnumC2931o0 enumC2931o02 = EnumC2931o0.f15240e;
                C2915j c2915j = this.f15170J;
                if (enumC2931o0 == enumC2931o02) {
                    int i7 = (int) (c2915j.f15178A & 4294967295L);
                    if (C2708a.m4318a(AbstractC2168e.m3517d(keyEvent.getKeyCode()), C2708a.f14532m)) {
                        f8 = i7;
                    } else {
                        f8 = -i7;
                    }
                    m5797a = AbstractC3784a.m5797a(0.0f, f8);
                } else {
                    int i8 = (int) (c2915j.f15178A >> 32);
                    if (C2708a.m4318a(AbstractC2168e.m3517d(keyEvent.getKeyCode()), C2708a.f14532m)) {
                        f7 = i8;
                    } else {
                        f7 = -i8;
                    }
                    m5797a = AbstractC3784a.m5797a(f7, 0.0f);
                }
                AbstractC0525d0.m1141s(m5830y0(), null, new C2902e1(this, m5797a, null, 1), 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p102n1.InterfaceC2711d
    /* renamed from: j */
    public final boolean mo4354j(KeyEvent keyEvent) {
        return false;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        if (this.f15152w && (this.f15172L == null || this.f15173M == null)) {
            this.f15172L = new C0074s0(7, this);
            this.f15173M = new C2902e1(this, null);
        }
        C0074s0 c0074s0 = this.f15172L;
        if (c0074s0 != null) {
            InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
            c0477j.m1036d(AbstractC0476i.f1660d, new C0468a(null, c0074s0));
        }
        C2902e1 c2902e1 = this.f15173M;
        if (c2902e1 != null) {
            InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
            c0477j.m1036d(AbstractC0476i.f1661e, c2902e1);
        }
    }

    @Override // p019c1.InterfaceC0372p
    /* renamed from: w0 */
    public final void mo842w0(InterfaceC0369m interfaceC0369m) {
        interfaceC0369m.mo841d(false);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }

    @Override // p122q.AbstractC2907g0
    /* renamed from: S0 */
    public final void mo4577S0(long j6) {
    }
}
