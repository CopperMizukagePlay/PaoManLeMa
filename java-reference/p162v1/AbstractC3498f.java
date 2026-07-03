package p162v1;

import android.view.View;
import p085l0.AbstractC2397p1;
import p085l0.AbstractC2418w;
import p092m.AbstractC2487d;
import p101n0.C2705e;
import p139s1.AbstractC3088a;
import p145t0.C3177h;
import p146t1.C3216l;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.C3728t;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.f */
/* loaded from: classes.dex */
public abstract class AbstractC3498f {

    /* renamed from: a */
    public static final C3492d f16855a = new C3492d(0);

    /* renamed from: b */
    public static final C3515k1 f16856b = new C3515k1(1);

    /* renamed from: a */
    public static final long m5361a(float f7, boolean z7, boolean z8) {
        long j6;
        long floatToRawIntBits = Float.floatToRawIntBits(f7);
        long j7 = 0;
        if (z7) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        if (z8) {
            j7 = 2;
        }
        return ((j6 | j7) & 4294967295L) | (floatToRawIntBits << 32);
    }

    /* renamed from: b */
    public static final void m5362b(C2705e c2705e, AbstractC3809q abstractC3809q) {
        C2705e m5451y = m5382v(abstractC3809q).m5451y();
        int i7 = m5451y.f14519g - 1;
        Object[] objArr = m5451y.f14517e;
        if (i7 < objArr.length) {
            while (i7 >= 0) {
                c2705e.m4300b(((C3502g0) objArr[i7]).f16872I.f16802f);
                i7--;
            }
        }
    }

    /* renamed from: c */
    public static final int m5363c(AbstractC3526o0 abstractC3526o0, C3216l c3216l) {
        long mo5320F0;
        AbstractC3526o0 mo5360z0 = abstractC3526o0.mo5360z0();
        if (mo5360z0 == null) {
            AbstractC3088a.m4750b("Child of " + abstractC3526o0 + " cannot be null when calculating alignment line");
        }
        if (abstractC3526o0.mo5318D0().mo4882a().containsKey(c3216l)) {
            Integer num = (Integer) abstractC3526o0.mo5318D0().mo4882a().get(c3216l);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int mo4939h0 = mo5360z0.mo4939h0(c3216l);
            if (mo4939h0 != Integer.MIN_VALUE) {
                mo5360z0.f16977n = true;
                abstractC3526o0.f16978o = true;
                abstractC3526o0.mo5321J0();
                mo5360z0.f16977n = false;
                abstractC3526o0.f16978o = false;
                if (c3216l instanceof C3216l) {
                    mo5320F0 = mo5360z0.mo5320F0() & 4294967295L;
                } else {
                    mo5320F0 = mo5360z0.mo5320F0() >> 32;
                }
                return mo4939h0 + ((int) mo5320F0);
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public static final boolean m5364d(C3488c c3488c) {
        C3557y1 c3557y1 = m5382v(c3488c).f16872I.f16801e;
        AbstractC3367j.m5098c(c3557y1, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return c3557y1.f17106s;
    }

    /* renamed from: e */
    public static final AbstractC3809q m5365e(InterfaceC3516l interfaceC3516l, int i7) {
        AbstractC3809q abstractC3809q = ((AbstractC3809q) interfaceC3516l).f17992e.f17997j;
        if (abstractC3809q != null && (abstractC3809q.f17995h & i7) != 0) {
            while (abstractC3809q != null) {
                int i8 = abstractC3809q.f17994g;
                if ((i8 & 2) == 0) {
                    if ((i8 & i7) != 0) {
                        return abstractC3809q;
                    }
                    abstractC3809q = abstractC3809q.f17997j;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    public static final AbstractC3809q m5366f(C2705e c2705e) {
        int i7;
        if (c2705e != null && (i7 = c2705e.f14519g) != 0) {
            return (AbstractC3809q) c2705e.m4309k(i7 - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final InterfaceC3549w m5367g(AbstractC3809q abstractC3809q) {
        if ((abstractC3809q.f17994g & 2) != 0) {
            if (abstractC3809q instanceof InterfaceC3549w) {
                return (InterfaceC3549w) abstractC3809q;
            }
            if (abstractC3809q instanceof AbstractC3519m) {
                AbstractC3809q abstractC3809q2 = ((AbstractC3519m) abstractC3809q).f16962t;
                while (abstractC3809q2 != 0) {
                    if (abstractC3809q2 instanceof InterfaceC3549w) {
                        return (InterfaceC3549w) abstractC3809q2;
                    }
                    if ((abstractC3809q2 instanceof AbstractC3519m) && (abstractC3809q2.f17994g & 2) != 0) {
                        abstractC3809q2 = ((AbstractC3519m) abstractC3809q2).f16962t;
                    } else {
                        abstractC3809q2 = abstractC3809q2.f17997j;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final int m5368h(long j6, long j7) {
        boolean m5377q = m5377q(j6);
        if (m5377q != m5377q(j7)) {
            if (!m5377q) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(m5372l(j6) - m5372l(j7));
        if (Math.min(m5372l(j6), m5372l(j7)) >= 0.0f && m5376p(j6) != m5376p(j7)) {
            if (!m5376p(j6)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final Object m5369i(InterfaceC3513k interfaceC3513k, AbstractC2397p1 abstractC2397p1) {
        if (!((AbstractC3809q) interfaceC3513k).f17992e.f18005r) {
            AbstractC3088a.m4750b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        C3177h c3177h = (C3177h) m5382v(interfaceC3513k).f16868E;
        c3177h.getClass();
        return AbstractC2418w.m3981y(c3177h, abstractC2397p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* renamed from: j */
    public static final InterfaceC3487b2 m5370j(InterfaceC3516l interfaceC3516l, Object obj) {
        C3490c1 c3490c1;
        AbstractC3809q abstractC3809q = (AbstractC3809q) interfaceC3516l;
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e.f17996i;
        C3502g0 m5382v = m5382v(interfaceC3516l);
        while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 262144) != 0) {
                while (abstractC3809q2 != null) {
                    if ((abstractC3809q2.f17994g & 262144) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q2;
                        ?? r42 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3487b2) {
                                InterfaceC3487b2 interfaceC3487b2 = (InterfaceC3487b2) abstractC3519m;
                                if (obj.equals(interfaceC3487b2.mo204o())) {
                                    return interfaceC3487b2;
                                }
                            } else if ((abstractC3519m.f17994g & 262144) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r42 = r42;
                                while (abstractC3809q3 != null) {
                                    if ((abstractC3809q3.f17994g & 262144) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r42.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r42.m4300b(abstractC3809q3);
                                        }
                                    }
                                    abstractC3809q3 = abstractC3809q3.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = m5366f(r42);
                        }
                    }
                    abstractC3809q2 = abstractC3809q2.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q2 = c3490c1.f16801e;
            } else {
                abstractC3809q2 = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [v1.b2, java.lang.Object, v1.l] */
    /* JADX WARN: Type inference failed for: r3v10, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: k */
    public static final InterfaceC3487b2 m5371k(InterfaceC3487b2 interfaceC3487b2) {
        C3490c1 c3490c1;
        AbstractC3809q abstractC3809q = (AbstractC3809q) interfaceC3487b2;
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e.f17996i;
        C3502g0 m5382v = m5382v(interfaceC3487b2);
        while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 262144) != 0) {
                while (abstractC3809q2 != null) {
                    if ((abstractC3809q2.f17994g & 262144) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q2;
                        ?? r52 = 0;
                        while (abstractC3519m != 0) {
                            if (abstractC3519m instanceof InterfaceC3487b2) {
                                InterfaceC3487b2 interfaceC3487b22 = (InterfaceC3487b2) abstractC3519m;
                                if (AbstractC3367j.m5096a(interfaceC3487b2.mo204o(), interfaceC3487b22.mo204o()) && interfaceC3487b2.getClass() == interfaceC3487b22.getClass()) {
                                    return interfaceC3487b22;
                                }
                            } else if ((abstractC3519m.f17994g & 262144) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                int i7 = 0;
                                abstractC3519m = abstractC3519m;
                                r52 = r52;
                                while (abstractC3809q3 != null) {
                                    if ((abstractC3809q3.f17994g & 262144) != 0) {
                                        i7++;
                                        r52 = r52;
                                        if (i7 == 1) {
                                            abstractC3519m = abstractC3809q3;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3519m != 0) {
                                                r52.m4300b(abstractC3519m);
                                                abstractC3519m = 0;
                                            }
                                            r52.m4300b(abstractC3809q3);
                                        }
                                    }
                                    abstractC3809q3 = abstractC3809q3.f17997j;
                                    abstractC3519m = abstractC3519m;
                                    r52 = r52;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC3519m = m5366f(r52);
                        }
                    }
                    abstractC3809q2 = abstractC3809q2.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q2 = c3490c1.f16801e;
            } else {
                abstractC3809q2 = null;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final float m5372l(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m5373m(InterfaceC3522n interfaceC3522n) {
        if (((AbstractC3809q) interfaceC3522n).f17992e.f18005r) {
            m5380t(interfaceC3522n, 1).m5340c1();
        }
    }

    /* renamed from: n */
    public static final void m5374n(InterfaceC3549w interfaceC3549w) {
        m5382v(interfaceC3549w).m5403E();
    }

    /* renamed from: o */
    public static final void m5375o(InterfaceC3551w1 interfaceC3551w1) {
        m5382v(interfaceC3551w1).m5405G();
    }

    /* renamed from: p */
    public static final boolean m5376p(long j6) {
        if ((j6 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m5377q(long j6) {
        if ((j6 & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static final boolean m5378r(C3502g0 c3502g0) {
        C3502g0 c3502g02;
        if (c3502g0.f16890k != null) {
            C3502g0 m5447u = c3502g0.m5447u();
            if (m5447u != null) {
                c3502g02 = m5447u.f16890k;
            } else {
                c3502g02 = null;
            }
            if (c3502g02 == null || c3502g0.f16873J.f16939b) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final void m5379s(AbstractC3809q abstractC3809q, InterfaceC3277a interfaceC3277a) {
        C3512j1 c3512j1 = abstractC3809q.f17998k;
        if (c3512j1 == null) {
            c3512j1 = new C3512j1((InterfaceC3509i1) abstractC3809q);
            abstractC3809q.f17998k = c3512j1;
        }
        ((C3728t) m5383w(abstractC3809q)).getSnapshotObserver().m5498a(c3512j1, C3495e.f16815k, interfaceC3277a);
    }

    /* renamed from: t */
    public static final AbstractC3497e1 m5380t(InterfaceC3516l interfaceC3516l, int i7) {
        AbstractC3497e1 abstractC3497e1 = ((AbstractC3809q) interfaceC3516l).f17992e.f17999l;
        AbstractC3367j.m5097b(abstractC3497e1);
        if (abstractC3497e1.mo5333V0() == interfaceC3516l && AbstractC3500f1.m5393g(i7)) {
            AbstractC3497e1 abstractC3497e12 = abstractC3497e1.f16848t;
            AbstractC3367j.m5097b(abstractC3497e12);
            return abstractC3497e12;
        }
        return abstractC3497e1;
    }

    /* renamed from: u */
    public static final AbstractC3497e1 m5381u(InterfaceC3516l interfaceC3516l) {
        if (!((AbstractC3809q) interfaceC3516l).f17992e.f18005r) {
            AbstractC3088a.m4750b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC3497e1 m5380t = m5380t(interfaceC3516l, 2);
        if (!m5380t.mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinates is not attached.");
        }
        return m5380t;
    }

    /* renamed from: v */
    public static final C3502g0 m5382v(InterfaceC3516l interfaceC3516l) {
        AbstractC3497e1 abstractC3497e1 = ((AbstractC3809q) interfaceC3516l).f17992e.f17999l;
        if (abstractC3497e1 != null) {
            return abstractC3497e1.f16847s;
        }
        throw AbstractC2487d.m4041e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* renamed from: w */
    public static final InterfaceC3524n1 m5383w(InterfaceC3516l interfaceC3516l) {
        InterfaceC3524n1 interfaceC3524n1 = m5382v(interfaceC3516l).f16896q;
        if (interfaceC3524n1 != null) {
            return interfaceC3524n1;
        }
        throw AbstractC2487d.m4041e("This node does not have an owner.");
    }

    /* renamed from: x */
    public static final View m5384x(InterfaceC3516l interfaceC3516l) {
        if (!((AbstractC3809q) interfaceC3516l).f17992e.f18005r) {
            AbstractC3088a.m4750b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC3511j0.m5464a(m5382v(interfaceC3516l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [v1.b2, java.lang.Object, v1.l] */
    /* JADX WARN: Type inference failed for: r12v0, types: [t5.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: y */
    public static final void m5385y(InterfaceC3487b2 interfaceC3487b2, InterfaceC3279c interfaceC3279c) {
        C3490c1 c3490c1;
        boolean z7;
        boolean z8;
        AbstractC3809q abstractC3809q = (AbstractC3809q) interfaceC3487b2;
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
        }
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e.f17996i;
        C3502g0 m5382v = m5382v(interfaceC3487b2);
        while (m5382v != null) {
            if ((m5382v.f16872I.f16802f.f17995h & 262144) != 0) {
                while (abstractC3809q2 != null) {
                    if ((abstractC3809q2.f17994g & 262144) != 0) {
                        AbstractC3519m abstractC3519m = abstractC3809q2;
                        ?? r52 = 0;
                        while (abstractC3519m != 0) {
                            boolean z9 = true;
                            if (abstractC3519m instanceof InterfaceC3487b2) {
                                InterfaceC3487b2 interfaceC3487b22 = (InterfaceC3487b2) abstractC3519m;
                                if (AbstractC3367j.m5096a(interfaceC3487b2.mo204o(), interfaceC3487b22.mo204o()) && interfaceC3487b2.getClass() == interfaceC3487b22.getClass()) {
                                    z9 = ((Boolean) interfaceC3279c.mo23f(interfaceC3487b22)).booleanValue();
                                }
                                if (!z9) {
                                    return;
                                }
                            } else {
                                if ((abstractC3519m.f17994g & 262144) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                    int i7 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r52 = r52;
                                    while (abstractC3809q3 != null) {
                                        if ((abstractC3809q3.f17994g & 262144) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (z8) {
                                            i7++;
                                            r52 = r52;
                                            if (i7 == 1) {
                                                abstractC3519m = abstractC3809q3;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r52.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r52.m4300b(abstractC3809q3);
                                            }
                                        }
                                        abstractC3809q3 = abstractC3809q3.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r52 = r52;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                            }
                            abstractC3519m = m5366f(r52);
                        }
                    }
                    abstractC3809q2 = abstractC3809q2.f17996i;
                }
            }
            m5382v = m5382v.m5447u();
            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                abstractC3809q2 = c3490c1.f16801e;
            } else {
                abstractC3809q2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [v1.b2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [t5.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: z */
    public static final void m5386z(InterfaceC3487b2 interfaceC3487b2, InterfaceC3279c interfaceC3279c) {
        EnumC3483a2 enumC3483a2;
        AbstractC3809q abstractC3809q = (AbstractC3809q) interfaceC3487b2;
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitSubtreeIf called on an unattached node");
        }
        C2705e c2705e = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e;
        AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j;
        if (abstractC3809q3 == null) {
            m5362b(c2705e, abstractC3809q2);
        } else {
            c2705e.m4300b(abstractC3809q3);
        }
        while (true) {
            int i7 = c2705e.f14519g;
            if (i7 != 0) {
                AbstractC3809q abstractC3809q4 = (AbstractC3809q) c2705e.m4309k(i7 - 1);
                if ((abstractC3809q4.f17995h & 262144) != 0) {
                    for (AbstractC3809q abstractC3809q5 = abstractC3809q4; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                        if ((abstractC3809q5.f17994g & 262144) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q5;
                            ?? r7 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3487b2) {
                                    InterfaceC3487b2 interfaceC3487b22 = (InterfaceC3487b2) abstractC3519m;
                                    if (AbstractC3367j.m5096a(interfaceC3487b2.mo204o(), interfaceC3487b22.mo204o()) && interfaceC3487b2.getClass() == interfaceC3487b22.getClass()) {
                                        enumC3483a2 = (EnumC3483a2) interfaceC3279c.mo23f(interfaceC3487b22);
                                    } else {
                                        enumC3483a2 = EnumC3483a2.f16782e;
                                    }
                                    if (enumC3483a2 != EnumC3483a2.f16784g) {
                                        if (enumC3483a2 == EnumC3483a2.f16783f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((abstractC3519m.f17994g & 262144) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q6 = abstractC3519m.f16962t;
                                    int i8 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r7 = r7;
                                    while (abstractC3809q6 != null) {
                                        if ((abstractC3809q6.f17994g & 262144) != 0) {
                                            i8++;
                                            r7 = r7;
                                            if (i8 == 1) {
                                                abstractC3519m = abstractC3809q6;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r7.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r7.m4300b(abstractC3809q6);
                                            }
                                        }
                                        abstractC3809q6 = abstractC3809q6.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r7 = r7;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3519m = m5366f(r7);
                            }
                        }
                    }
                }
                m5362b(c2705e, abstractC3809q4);
            } else {
                return;
            }
        }
    }
}
