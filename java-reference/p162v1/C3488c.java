package p162v1;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import p010b1.InterfaceC0263a;
import p010b1.InterfaceC0267e;
import p019c1.EnumC0376t;
import p019c1.InterfaceC0361e;
import p019c1.InterfaceC0369m;
import p019c1.InterfaceC0372p;
import p019c1.InterfaceC0374r;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0490w;
import p028d2.InterfaceC0478k;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p067i4.AbstractC2072e;
import p077k.C2184c0;
import p077k.C2194h0;
import p082k5.C2320j;
import p096m3.C2572v;
import p101n0.C2705e;
import p117p1.AbstractC2866q;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.C2874y;
import p117p1.C2875z;
import p117p1.EnumC2860k;
import p117p1.EnumC2873x;
import p139s1.AbstractC3088a;
import p140s2.AbstractC3092b;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.C3210j;
import p146t1.C3236u;
import p146t1.EnumC3225o0;
import p146t1.EnumC3227p0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3238v;
import p146t1.InterfaceC3242x;
import p152u.C3328p;
import p152u.C3330r;
import p154u1.C3345a;
import p154u1.C3346b;
import p154u1.C3348d;
import p154u1.C3352h;
import p154u1.InterfaceC3347c;
import p154u1.InterfaceC3349e;
import p154u1.InterfaceC3350f;
import p154u1.InterfaceC3351g;
import p158u5.AbstractC3367j;
import p160v.C3404d;
import p168w.AbstractC3642y;
import p170w1.C3710o1;
import p170w1.C3728t;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C3488c extends AbstractC3809q implements InterfaceC3549w, InterfaceC3522n, InterfaceC3551w1, InterfaceC3539s1, InterfaceC3349e, InterfaceC3351g, InterfaceC3533q1, InterfaceC3546v, InterfaceC3525o, InterfaceC0361e, InterfaceC0372p, InterfaceC0374r, InterfaceC3527o1, InterfaceC0263a {

    /* renamed from: s */
    public InterfaceC3808p f16788s;

    /* renamed from: t */
    public C3345a f16789t;

    /* renamed from: u */
    public HashSet f16790u;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        boolean z7;
        boolean z8;
        boolean z9;
        EnumC2873x enumC2873x;
        EnumC2873x enumC2873x2;
        EnumC2860k enumC2860k2;
        boolean z10;
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C2572v c2572v = ((C2874y) interfaceC3808p).f15042d;
        C2874y c2874y = (C2874y) c2572v.f13969h;
        ?? r02 = c2859j.f14991a;
        int size = r02.size();
        for (int i7 = 0; i7 < size; i7++) {
            C2868s c2868s = (C2868s) r02.get(i7);
            if (AbstractC2866q.m4542a(c2868s) || AbstractC2866q.m4544c(c2868s)) {
                z7 = false;
                break;
            }
        }
        z7 = true;
        if (z7) {
            int size2 = r02.size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (!((C2868s) r02.get(i8)).m4551b()) {
                }
            }
            z8 = true;
            if (!c2874y.f15041c) {
                int size3 = r02.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size3) {
                        C2868s c2868s2 = (C2868s) r02.get(i9);
                        if (AbstractC2866q.m4542a(c2868s2) || AbstractC2866q.m4544c(c2868s2)) {
                            break;
                        } else {
                            i9++;
                        }
                    } else if (!z8) {
                        z9 = false;
                    }
                }
            }
            z9 = true;
            enumC2873x = (EnumC2873x) c2572v.f13967f;
            enumC2873x2 = EnumC2873x.f15037g;
            enumC2860k2 = EnumC2860k.f14997g;
            if (enumC2873x != enumC2873x2) {
                if (enumC2860k == EnumC2860k.f14995e && z9) {
                    c2572v.f13968g = c2859j;
                    if (z7 && !c2874y.f15041c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    c2572v.m4099g(c2859j, z10);
                }
                if (enumC2860k == EnumC2860k.f14996f && z7 && c2859j.equals((C2859j) c2572v.f13968g) && c2874y.f15041c) {
                    int size4 = r02.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        ((C2868s) r02.get(i10)).m4550a();
                    }
                }
                if (enumC2860k == enumC2860k2 && !z9 && !c2859j.equals((C2859j) c2572v.f13968g)) {
                    c2572v.m4099g(c2859j, true);
                }
            }
            if (enumC2860k != enumC2860k2) {
                int size5 = r02.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size5) {
                        if (!AbstractC2866q.m4544c((C2868s) r02.get(i11))) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        c2572v.f13967f = EnumC2873x.f15035e;
                        ((C2874y) c2572v.f13969h).f15041c = false;
                        c2572v.f13968g = null;
                        break;
                    }
                }
                if (c2859j.equals((C2859j) c2572v.f13968g) && z7) {
                    int size6 = r02.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size6) {
                            break;
                        }
                        if (((C2868s) r02.get(i12)).m4551b()) {
                            if (!c2874y.f15041c) {
                                c2572v.m4102j(c2859j);
                                return;
                            }
                        } else {
                            i12++;
                        }
                    }
                    int size7 = r02.size();
                    for (int i13 = 0; i13 < size7; i13++) {
                        ((C2868s) r02.get(i13)).m4550a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z8 = false;
        if (!c2874y.f15041c) {
        }
        z9 = true;
        enumC2873x = (EnumC2873x) c2572v.f13967f;
        enumC2873x2 = EnumC2873x.f15037g;
        enumC2860k2 = EnumC2860k.f14997g;
        if (enumC2873x != enumC2873x2) {
        }
        if (enumC2860k != enumC2860k2) {
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: C */
    public final int mo564C(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC3242x) interfaceC3808p).mo25d(new C3236u(abstractC3526o0, abstractC3526o0.getLayoutDirection()), new C3210j(interfaceC3214k0, EnumC3225o0.f16022f, EnumC3227p0.f16031e, 1), AbstractC3092b.m4765b(0, i7, 7)).mo4886e();
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        m5297K0(true);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        m5298L0();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, u1.a] */
    /* renamed from: K0 */
    public final void m5297K0(boolean z7) {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("initializeModifier called on unattached node");
        }
        InterfaceC3808p interfaceC3808p = this.f16788s;
        if ((this.f17994g & 32) != 0) {
            if (interfaceC3808p instanceof InterfaceC3347c) {
                C3484b c3484b = new C3484b(this, 0);
                C2184c0 c2184c0 = ((C3728t) AbstractC3498f.m5383w(this)).f17782z0;
                if (c2184c0.m3561f(c3484b) < 0) {
                    c2184c0.m3556a(c3484b);
                }
            }
            if (interfaceC3808p instanceof InterfaceC3350f) {
                InterfaceC3350f interfaceC3350f = (InterfaceC3350f) interfaceC3808p;
                C3345a c3345a = this.f16789t;
                if (c3345a != null && c3345a.mo3349f(interfaceC3350f.getKey())) {
                    c3345a.f16407a = interfaceC3350f;
                    C3348d modifierLocalManager = ((C3728t) AbstractC3498f.m5383w(this)).getModifierLocalManager();
                    C3352h key = interfaceC3350f.getKey();
                    modifierLocalManager.f16410b.m4300b(this);
                    modifierLocalManager.f16411c.m4300b(key);
                    modifierLocalManager.m5083a();
                } else {
                    ?? obj = new Object();
                    obj.f16407a = interfaceC3350f;
                    this.f16789t = obj;
                    if (AbstractC3498f.m5364d(this)) {
                        C3348d modifierLocalManager2 = ((C3728t) AbstractC3498f.m5383w(this)).getModifierLocalManager();
                        C3352h key2 = interfaceC3350f.getKey();
                        modifierLocalManager2.f16410b.m4300b(this);
                        modifierLocalManager2.f16411c.m4300b(key2);
                        modifierLocalManager2.m5083a();
                    }
                }
            }
        }
        if ((this.f17994g & 4) != 0 && !z7) {
            AbstractC3498f.m5380t(this, 2).m5340c1();
        }
        if ((this.f17994g & 2) != 0) {
            if (AbstractC3498f.m5364d(this)) {
                AbstractC3497e1 abstractC3497e1 = this.f17999l;
                AbstractC3367j.m5097b(abstractC3497e1);
                ((C3555y) abstractC3497e1).m5536y1(this);
                InterfaceC3521m1 interfaceC3521m1 = abstractC3497e1.f16845M;
                if (interfaceC3521m1 != null) {
                    ((C3710o1) interfaceC3521m1).invalidate();
                }
            }
            if (!z7) {
                AbstractC3498f.m5380t(this, 2).m5340c1();
                AbstractC3498f.m5382v(this).m5403E();
            }
        }
        if (interfaceC3808p instanceof C3328p) {
            C3328p c3328p = (C3328p) interfaceC3808p;
            C3502g0 m5382v = AbstractC3498f.m5382v(this);
            switch (c3328p.f16351a) {
                case 0:
                    ((C3330r) c3328p.f16352b).f16370k = m5382v;
                    break;
                default:
                    ((AbstractC3642y) c3328p.f16352b).f17416w.setValue(m5382v);
                    break;
            }
        }
        if ((this.f17994g & 256) != 0 && (interfaceC3808p instanceof C3404d) && AbstractC3498f.m5364d(this)) {
            AbstractC3498f.m5382v(this).m5403E();
        }
        int i7 = this.f17994g;
        if ((i7 & 16) != 0 && (interfaceC3808p instanceof C2874y)) {
            ((C2874y) interfaceC3808p).f15042d.f13966e = this.f17999l;
        }
        if ((i7 & 8) != 0) {
            ((C3728t) AbstractC3498f.m5383w(this)).m5728C();
        }
    }

    /* renamed from: L0 */
    public final void m5298L0() {
        if (!this.f18005r) {
            AbstractC3088a.m4750b("unInitializeModifier called on unattached node");
        }
        InterfaceC3808p interfaceC3808p = this.f16788s;
        if ((this.f17994g & 32) != 0) {
            if (interfaceC3808p instanceof InterfaceC3350f) {
                C3348d modifierLocalManager = ((C3728t) AbstractC3498f.m5383w(this)).getModifierLocalManager();
                C3352h key = ((InterfaceC3350f) interfaceC3808p).getKey();
                modifierLocalManager.f16412d.m4300b(AbstractC3498f.m5382v(this));
                modifierLocalManager.f16413e.m4300b(key);
                modifierLocalManager.m5083a();
            }
            if (interfaceC3808p instanceof InterfaceC3347c) {
                ((InterfaceC3347c) interfaceC3808p).mo4819c(AbstractC3498f.f16855a);
            }
        }
        if ((this.f17994g & 8) != 0) {
            ((C3728t) AbstractC3498f.m5383w(this)).m5728C();
        }
    }

    /* renamed from: M0 */
    public final void m5299M0() {
        if (this.f18005r) {
            this.f16790u.clear();
            ((C3728t) AbstractC3498f.m5383w(this)).getSnapshotObserver().m5498a(this, C3495e.f16811g, new C3484b(this, 1));
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: X */
    public final int mo567X(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC3242x) interfaceC3808p).mo25d(new C3236u(abstractC3526o0, abstractC3526o0.getLayoutDirection()), new C3210j(interfaceC3214k0, EnumC3225o0.f16021e, EnumC3227p0.f16031e, 1), AbstractC3092b.m4765b(0, i7, 7)).mo4886e();
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: Z */
    public final boolean mo5301Z() {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C2874y) interfaceC3808p).f15042d.getClass();
        return true;
    }

    @Override // p162v1.InterfaceC3516l
    /* renamed from: a */
    public final void mo554a() {
        if (this.f16788s instanceof C2874y) {
            mo548i0();
        }
    }

    @Override // p010b1.InterfaceC0263a
    /* renamed from: b */
    public final InterfaceC3093c mo549b() {
        return AbstractC3498f.m5382v(this).f16865B;
    }

    @Override // p010b1.InterfaceC0263a
    /* renamed from: c */
    public final long mo550c() {
        return AbstractC2072e.m3347y(AbstractC3498f.m5380t(this, 128).f16055g);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC3242x) interfaceC3808p).mo25d(interfaceC3223n0, interfaceC3214k0, j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [t5.a, u5.k] */
    /* JADX WARN: Type inference failed for: r2v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // p154u1.InterfaceC3349e, p154u1.InterfaceC3351g
    /* renamed from: e */
    public final Object mo5084e(C3352h c3352h) {
        C3490c1 c3490c1;
        this.f16790u.add(c3352h);
        if (!this.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q = this.f17992e.f17996i;
        C3502g0 m5382v = AbstractC3498f.m5382v(this);
        while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 32) != 0) {
                while (abstractC3809q != null) {
                    if ((abstractC3809q.f17994g & 32) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q;
                        ?? r42 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3349e) {
                                InterfaceC3349e interfaceC3349e = (InterfaceC3349e) abstractC3519m;
                                if (interfaceC3349e.mo5085h().mo3349f(c3352h)) {
                                    return interfaceC3349e.mo5085h().mo3350k(c3352h);
                                }
                            } else if ((abstractC3519m.f17994g & 32) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r42 = r42;
                                while (abstractC3809q2 != null) {
                                    if ((abstractC3809q2.f17994g & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q2;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r42.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r42.m4300b(abstractC3809q2);
                                        }
                                    }
                                    abstractC3809q2 = abstractC3809q2.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = AbstractC3498f.m5366f(r42);
                        }
                    }
                    abstractC3809q = abstractC3809q.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q = c3490c1.f16801e;
            } else {
                abstractC3809q = null;
            }
        }
        return c3352h.f16415a.mo52a();
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: e0 */
    public final int mo568e0(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC3242x) interfaceC3808p).mo25d(new C3236u(abstractC3526o0, abstractC3526o0.getLayoutDirection()), new C3210j(interfaceC3214k0, EnumC3225o0.f16022f, EnumC3227p0.f16032f, 1), AbstractC3092b.m4765b(i7, 0, 13)).mo4884c();
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((InterfaceC0267e) interfaceC3808p).mo561f(c3508i0);
    }

    @Override // p010b1.InterfaceC0263a
    public final EnumC3103m getLayoutDirection() {
        return AbstractC3498f.m5382v(this).f16866C;
    }

    @Override // p154u1.InterfaceC3349e
    /* renamed from: h */
    public final AbstractC2072e mo5085h() {
        C3345a c3345a = this.f16789t;
        if (c3345a != null) {
            return c3345a;
        }
        return C3346b.f16408a;
    }

    @Override // p019c1.InterfaceC0361e
    /* renamed from: h0 */
    public final void mo547h0(EnumC0376t enumC0376t) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3088a.m4750b("onFocusEvent called on wrong node");
        interfaceC3808p.getClass();
        throw new ClassCastException();
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C2572v c2572v = ((C2874y) interfaceC3808p).f15042d;
        EnumC2873x enumC2873x = (EnumC2873x) c2572v.f13967f;
        C2874y c2874y = (C2874y) c2572v.f13969h;
        if (enumC2873x == EnumC2873x.f15036f) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            ((C2875z) c2874y.m4552h()).mo23f(obtain);
            obtain.recycle();
            c2572v.f13967f = EnumC2873x.f15035e;
            c2874y.f15041c = false;
            c2572v.f13968g = null;
        }
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: p */
    public final int mo569p(AbstractC3526o0 abstractC3526o0, InterfaceC3214k0 interfaceC3214k0, int i7) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC3242x) interfaceC3808p).mo25d(new C3236u(abstractC3526o0, abstractC3526o0.getLayoutDirection()), new C3210j(interfaceC3214k0, EnumC3225o0.f16021e, EnumC3227p0.f16032f, 1), AbstractC3092b.m4765b(i7, 0, 13)).mo4884c();
    }

    @Override // p162v1.InterfaceC3533q1
    /* renamed from: p0 */
    public final Object mo4836p0(Object obj) {
        AbstractC3367j.m5098c(this.f16788s, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: q0 */
    public final void mo556q0() {
        AbstractC3498f.m5373m(this);
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: s0 */
    public final void mo5302s0() {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((C2874y) interfaceC3808p).f15042d.getClass();
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        int i7;
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C0477j mo402g = ((InterfaceC0478k) interfaceC3808p).mo402g();
        AbstractC3367j.m5098c(c0477j, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        C2194h0 c2194h0 = c0477j.f1683e;
        if (mo402g.f1685g) {
            c0477j.f1685g = true;
        }
        if (mo402g.f1686h) {
            c0477j.f1686h = true;
        }
        C2194h0 c2194h02 = mo402g.f1683e;
        Object[] objArr = c2194h02.f12677b;
        Object[] objArr2 = c2194h02.f12678c;
        long[] jArr = c2194h02.f12676a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((255 & j6) < 128) {
                            int i12 = (i8 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            C0490w c0490w = (C0490w) obj;
                            if (!c2194h0.m3587b(c0490w)) {
                                c2194h0.m3598m(c0490w, obj2);
                            } else if (obj2 instanceof C0468a) {
                                Object m3592g = c2194h0.m3592g(c0490w);
                                AbstractC3367j.m5098c(m3592g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                C0468a c0468a = (C0468a) m3592g;
                                i7 = i9;
                                String str = c0468a.f1638a;
                                if (str == null) {
                                    str = ((C0468a) obj2).f1638a;
                                }
                                InterfaceC1684c interfaceC1684c = c0468a.f1639b;
                                if (interfaceC1684c == null) {
                                    interfaceC1684c = ((C0468a) obj2).f1639b;
                                }
                                c2194h0.m3598m(c0490w, new C0468a(str, interfaceC1684c));
                                j6 >>= i7;
                                i11++;
                                i9 = i7;
                            }
                        }
                        i7 = i9;
                        j6 >>= i7;
                        i11++;
                        i9 = i7;
                    }
                    if (i10 != i9) {
                        return;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return this.f16788s.toString();
    }

    @Override // p019c1.InterfaceC0372p
    /* renamed from: w0 */
    public final void mo842w0(InterfaceC0369m interfaceC0369m) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3088a.m4750b("applyFocusProperties called on wrong node");
        interfaceC3808p.getClass();
        throw new ClassCastException();
    }

    @Override // p162v1.InterfaceC3525o
    /* renamed from: x */
    public final void mo790x(AbstractC3497e1 abstractC3497e1) {
        InterfaceC3808p interfaceC3808p = this.f16788s;
        AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C3404d c3404d = (C3404d) interfaceC3808p;
        if (!c3404d.f16531a) {
            c3404d.f16531a = true;
            C2320j c2320j = c3404d.f16532b;
            if (c2320j != null) {
                c2320j.mo663n(C1694m.f10482a);
            }
            c3404d.f16532b = null;
        }
    }

    @Override // p162v1.InterfaceC3527o1
    /* renamed from: z */
    public final boolean mo5303z() {
        return this.f18005r;
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: U */
    public final void mo5300U(InterfaceC3238v interfaceC3238v) {
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: r */
    public final void mo205r(long j6) {
    }
}
